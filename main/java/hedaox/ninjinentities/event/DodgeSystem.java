package hedaox.ninjinentities.event;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import java.util.List;
import java.util.Random;

public class DodgeSystem {
    public static final Random RANDOM = new Random();
    private final EntityLivingBase entity;

    // 公开的闪避和反击概率变量
    public int dodge = 0;      // 闪避概率(0-100)
    public int strikeBack = 0; // 反击概率(0-100)

    public DodgeSystem(EntityLivingBase entity) {
        this.entity = entity;
    }

    // 尝试闪避
    public boolean tryDodge(Entity attacker) {
        if (attacker == null || dodge <= 0) {
            return false;
        }

        if (RANDOM.nextInt(100) < dodge) {
            for (int i = 0; i < 30; i++) {
                if (tryDodgePattern(attacker, i % 19 + 1)) {
                    playDodgeSound();
                    return true;
                }
            }
        }
        return false;
    }

    // 尝试特定闪避模式
    private boolean tryDodgePattern(Entity attacker, int pattern) {
        // 获取角度和距离参数
        double[] angles = {10,20,30,60,90,-10,-20,-30,-30,-40,-40,-80,-60,80,-180,140,-140,120,-120};
        double[] distances = {1.0,1.15,1.0,1.15,1.35,1.0,1.15,1.0,1.25,1.15,1.65,1.75,1.25,1.75,1.75,1.25,1.25,1.75,1.75};

        double baseX = entity.posX - attacker.posX;
        double baseZ = entity.posZ - attacker.posZ;

        // 单位化
        double baseLength = Math.sqrt(baseX * baseX + baseZ * baseZ);
        if (baseLength == 0) return false;

        baseX /= baseLength;
        baseZ /= baseLength;

        // 获取偏移角度（单位：度 → 弧度）
        double offsetAngle = Math.toRadians(angles[pattern - 1]);

        // 旋转向量：绕 Y 轴旋转偏移角度
        double cos = Math.cos(offsetAngle);
        double sin = Math.sin(offsetAngle);

        double dodgeX = baseX * cos - baseZ * sin;
        double dodgeZ = baseX * sin + baseZ * cos;

        double distance = distances[pattern - 1];

        double x = entity.posX + dodgeX * distance;
        double z = entity.posZ + dodgeZ * distance;

        if (isPositionSafe(x, entity.posY, z)) {
            entity.setPosition(x, entity.posY, z);
            return true;
        }

        return false;
    }

    // 尝试反击
    public boolean tryStrikeBack(Entity attacker, double damage) {
        if (attacker == null || strikeBack <= 0) {
            return false;
        }

        if (RANDOM.nextInt(100) < strikeBack) {
            performCounterAttack(attacker, damage);
            return true;
        }
        return false;
    }

    // 执行反击攻击
    public void performCounterAttack(Entity target, double damage) {
        float radius = entity.width / 2.0F + 3.5F;
        AxisAlignedBB aabb = AxisAlignedBB.getBoundingBox(
            entity.posX - radius, entity.posY - radius, entity.posZ - radius,
            entity.posX + radius, entity.posY + radius, entity.posZ + radius
        );

        List<EntityPlayer> players = entity.worldObj.getEntitiesWithinAABB(EntityPlayer.class, aabb);
        for (EntityPlayer player : players) {
            player.attackEntityFrom(DamageSource.causeMobDamage(entity), (float)damage);
            applyKnockback(player, 2.0f);
        }

        playCounterSound();
    }

    // 检查位置是否安全
    private boolean isPositionSafe(double x, double y, double z) {
        int blockX = MathHelper.floor_double(x);
        int blockY = MathHelper.floor_double(y);
        int blockZ = MathHelper.floor_double(z);

        return entity.worldObj.isAirBlock(blockX, blockY, blockZ) &&
            entity.worldObj.isAirBlock(blockX, blockY + 1, blockZ);
    }

    // 播放闪避音效
    private void playDodgeSound() {
        entity.worldObj.playSoundAtEntity(entity,
            "jinryuudragonbc:DBC4.dodge" + (RANDOM.nextInt(3) + 1),
            1.0F, 1.0F);
    }

    // 播放反击音效
    private void playCounterSound() {
        entity.worldObj.playSoundAtEntity(entity,
            "jinryuudragonbc:DBC3.force",
            0.5F, entity.worldObj.rand.nextFloat() * 0.1F + 0.9F);
    }

    // 击退效果
    private void applyKnockback(Entity target, float strength) {
        target.addVelocity(
            -MathHelper.sin(entity.rotationYaw * (float) Math.PI / 180.0F) * strength,
            0.1,
            MathHelper.cos(entity.rotationYaw * (float) Math.PI / 180.0F) * strength
        );
    }
}

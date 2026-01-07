package hedaox.ninjinentities.event;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;

import java.util.List;
import java.util.Random;

public class DodgeSystem {
    public static final Random RANDOM = new Random();
    private final EntityLivingBase entity;

    public int dodge = 0;      // 闪避概率(0-100)
    public int strikeBack = 0; // 反击概率(0-100)

    // 预计算的角度和距离数组
    private static final double[][] DODGE_DIRECTIONS = new double[25][3]; // [direction][x,y,z]

    static {
        int index = 0;

        // 闪避到玩家身后的方向（特殊标记）
        DODGE_DIRECTIONS[index] = new double[]{0.0, 0.0, 1.5}; // 特殊标记

        // 左右闪避方向（相对实体的本地坐标系）
        // 格式: {cosθ, sinθ, distance}

        // 左方向
        DODGE_DIRECTIONS[++index] = new double[]{0.0, -1.0, 1.8};    // 纯左
        DODGE_DIRECTIONS[++index] = new double[]{0.1, -0.95, 1.8};   // 左前
        DODGE_DIRECTIONS[++index] = new double[]{-0.1, -0.95, 1.8};  // 左后

        // 右方向
        DODGE_DIRECTIONS[++index] = new double[]{0.0, 1.0, 1.8};     // 纯右
        DODGE_DIRECTIONS[++index] = new double[]{0.1, 0.95, 1.8};    // 右前
        DODGE_DIRECTIONS[++index] = new double[]{-0.1, 0.95, 1.8};   // 右后

        // 前后方向
        DODGE_DIRECTIONS[++index] = new double[]{-1.0, 0.0, 1.5};    // 纯后
        DODGE_DIRECTIONS[++index] = new double[]{1.0, 0.0, 1.2};     // 纯前

        // 其他随机方向
        for (int i = index + 1; i < 25; i++) {
            double angle = RANDOM.nextDouble() * Math.PI * 2;
            DODGE_DIRECTIONS[i] = new double[]{
                Math.cos(angle),
                Math.sin(angle),
                1.3 + RANDOM.nextDouble() * 0.7
            };
        }
    }

    public DodgeSystem(EntityLivingBase entity) {
        this.entity = entity;
    }

    // 主要闪避方法 - 彻底修复闪避失败时的位移问题
    public boolean tryDodge(Entity attacker) {
        if (attacker == null || dodge <= 0) {
            return false;
        }

        // 1. 先检查闪避概率
        if (RANDOM.nextInt(100) >= dodge) {
            return false; // 闪避失败，完全不移动
        }

        // 2. 计算所有可能的位置，但不移动实体
        List<DodgePosition> possiblePositions = calculateAllDodgePositions(attacker);

        // 3. 如果没有安全位置，闪避失败
        if (possiblePositions.isEmpty()) {
            return false; // 没有安全位置，闪避失败
        }

        // 4. 随机选择一个安全位置
        DodgePosition chosenPosition = possiblePositions.get(RANDOM.nextInt(possiblePositions.size()));

        // 5. 直接移动到选定的位置
        entity.setPosition(chosenPosition.x, chosenPosition.y, chosenPosition.z);

        // 6. 播放音效并尝试反击
        playDodgeSound();
        if (RANDOM.nextInt(100) < strikeBack && attacker != null) {
            performCounterAttack(attacker, entity.getMaxHealth() * 0.1);
        }

        return true;
    }

    // 计算所有可能的闪避位置
    private List<DodgePosition> calculateAllDodgePositions(Entity attacker) {
        java.util.ArrayList<DodgePosition> positions = new java.util.ArrayList<>();

        // 尝试计算背后闪避位置
        calculateBehindPosition(attacker, positions);

        // 尝试所有预定义的方向
        for (int i = 1; i < 25; i++) { // 从1开始，跳过索引0
            calculateDirectionPosition(i, positions);
        }

        return positions;
    }

    // 计算背后闪避位置
    private void calculateBehindPosition(Entity attacker, List<DodgePosition> positions) {
        if (!(attacker instanceof EntityLivingBase)) {
            return;
        }

        EntityLivingBase livingAttacker = (EntityLivingBase) attacker;
        float attackerYaw = livingAttacker.rotationYaw;
        float attackerYawRad = attackerYaw * (float) Math.PI / 180.0F;

        // 玩家背后的方向
        double behindDirX = -MathHelper.cos(attackerYawRad);
        double behindDirZ = -MathHelper.sin(attackerYawRad);

        // 尝试多个距离：1.5格, 1.8格, 2.0格
        for (double distance : new double[]{1.5, 1.8, 2.0}) {
            double targetX = attacker.posX + behindDirX * distance;
            double targetZ = attacker.posZ + behindDirZ * distance;
            double targetY = entity.posY; // 保持当前高度

            positions.add(new DodgePosition(targetX, targetY, targetZ));
        }
    }

    // 计算方向闪避位置
    private void calculateDirectionPosition(int directionIndex, List<DodgePosition> positions) {
        if (directionIndex < 0 || directionIndex >= DODGE_DIRECTIONS.length) {
            return;
        }

        double[] direction = DODGE_DIRECTIONS[directionIndex];
        double localDirX = direction[0];
        double localDirZ = direction[1];
        double distance = direction[2];

        // 使用实体自己的朝向
        float yawRad = entity.rotationYaw * (float) Math.PI / 180.0F;
        float cosYaw = MathHelper.cos(yawRad);
        float sinYaw = MathHelper.sin(yawRad);

        // 转换到世界坐标系
        double worldDirX = localDirX * cosYaw - localDirZ * sinYaw;
        double worldDirZ = localDirX * sinYaw + localDirZ * cosYaw;

        double targetX = entity.posX + worldDirX * distance;
        double targetZ = entity.posZ + worldDirZ * distance;
        double targetY = entity.posY;

        positions.add(new DodgePosition(targetX, targetY, targetZ));
    }

    // 辅助类：存储位置信息
    private static class DodgePosition {
        public final double x, y, z;

        public DodgePosition(double x, double y, double z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }

    // 执行反击攻击
    public void performCounterAttack(Entity target, double damage) {
        if (target == null || target.isDead) {
            return;
        }

        if (target instanceof EntityPlayer) {
            target.attackEntityFrom(DamageSource.causeMobDamage(entity), (float)damage);
        } else if (target instanceof EntityLivingBase) {
            target.attackEntityFrom(DamageSource.causeMobDamage(entity), (float)damage);
        }

        playCounterSound();
    }

    // 播放闪避音效
    private void playDodgeSound() {
        int soundNum = RANDOM.nextInt(3) + 1;
        entity.worldObj.playSoundAtEntity(entity,
            "jinryuudragonbc:DBC4.dodge" + soundNum,
            1.0F, 1.0F);
    }

    // 播放反击音效
    private void playCounterSound() {
        float pitch = entity.worldObj.rand.nextFloat() * 0.1F + 0.9F;
        entity.worldObj.playSoundAtEntity(entity,
            "jinryuudragonbc:DBC3.force",
            0.5F, pitch);
    }
}

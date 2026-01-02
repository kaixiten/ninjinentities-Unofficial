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

    public int dodge = 0;
    public int strikeBack = 0;

    private static final double[][] DODGE_DIRECTIONS = new double[25][3]; // [direction][x,y,z]

    static {
        int index = 0;
        DODGE_DIRECTIONS[index] = new double[]{0.0, 0.0, 1.5};
        //{cosθ, sinθ, distance}

        DODGE_DIRECTIONS[++index] = new double[]{0.0, -1.0, 1.8};
        DODGE_DIRECTIONS[++index] = new double[]{0.1, -0.95, 1.8};
        DODGE_DIRECTIONS[++index] = new double[]{-0.1, -0.95, 1.8};

        DODGE_DIRECTIONS[++index] = new double[]{0.0, 1.0, 1.8};
        DODGE_DIRECTIONS[++index] = new double[]{0.1, 0.95, 1.8};
        DODGE_DIRECTIONS[++index] = new double[]{-0.1, 0.95, 1.8};

        DODGE_DIRECTIONS[++index] = new double[]{-1.0, 0.0, 1.5};
        DODGE_DIRECTIONS[++index] = new double[]{1.0, 0.0, 1.2};

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

    public boolean tryDodge(Entity attacker) {
        if (attacker == null || dodge <= 0) {
            return false;
        }

        if (RANDOM.nextInt(100) >= dodge) {
            return false;
        }

        List<DodgePosition> possiblePositions = calculateAllDodgePositions(attacker);

        if (possiblePositions.isEmpty()) {
            return false;
        }

        DodgePosition chosenPosition = possiblePositions.get(RANDOM.nextInt(possiblePositions.size()));

        entity.setPosition(chosenPosition.x, chosenPosition.y, chosenPosition.z);

        playDodgeSound();
        if (RANDOM.nextInt(100) < strikeBack && attacker != null) {
            performCounterAttack(attacker, entity.getMaxHealth() * 0.1);
        }

        return true;
    }

    private List<DodgePosition> calculateAllDodgePositions(Entity attacker) {
        java.util.ArrayList<DodgePosition> positions = new java.util.ArrayList<>();

        calculateBehindPosition(attacker, positions);

        for (int i = 1; i < 25; i++) {
            calculateDirectionPosition(i, positions);
        }

        return positions;
    }

    private void calculateBehindPosition(Entity attacker, List<DodgePosition> positions) {
        if (!(attacker instanceof EntityLivingBase)) {
            return;
        }

        EntityLivingBase livingAttacker = (EntityLivingBase) attacker;
        float attackerYaw = livingAttacker.rotationYaw;
        float attackerYawRad = attackerYaw * (float) Math.PI / 180.0F;

        double behindDirX = -MathHelper.cos(attackerYawRad);
        double behindDirZ = -MathHelper.sin(attackerYawRad);

        for (double distance : new double[]{1.5, 1.8, 2.0}) {
            double targetX = attacker.posX + behindDirX * distance;
            double targetZ = attacker.posZ + behindDirZ * distance;
            double targetY = entity.posY; // 保持当前高度

            positions.add(new DodgePosition(targetX, targetY, targetZ));
        }
    }

    private void calculateDirectionPosition(int directionIndex, List<DodgePosition> positions) {
        if (directionIndex < 0 || directionIndex >= DODGE_DIRECTIONS.length) {
            return;
        }

        double[] direction = DODGE_DIRECTIONS[directionIndex];
        double localDirX = direction[0];
        double localDirZ = direction[1];
        double distance = direction[2];

        float yawRad = entity.rotationYaw * (float) Math.PI / 180.0F;
        float cosYaw = MathHelper.cos(yawRad);
        float sinYaw = MathHelper.sin(yawRad);

        double worldDirX = localDirX * cosYaw - localDirZ * sinYaw;
        double worldDirZ = localDirX * sinYaw + localDirZ * cosYaw;

        double targetX = entity.posX + worldDirX * distance;
        double targetZ = entity.posZ + worldDirZ * distance;
        double targetY = entity.posY;

        positions.add(new DodgePosition(targetX, targetY, targetZ));
    }

    private static class DodgePosition {
        public final double x, y, z;

        public DodgePosition(double x, double y, double z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }

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

    private void playDodgeSound() {
        int soundNum = RANDOM.nextInt(3) + 1;
        entity.worldObj.playSoundAtEntity(entity,
                "jinryuudragonbc:DBC4.dodge" + soundNum,
                1.0F, 1.0F);
    }

    private void playCounterSound() {
        float pitch = entity.worldObj.rand.nextFloat() * 0.1F + 0.9F;
        entity.worldObj.playSoundAtEntity(entity,
                "jinryuudragonbc:DBC3.force",
                0.5F, pitch);
    }
}

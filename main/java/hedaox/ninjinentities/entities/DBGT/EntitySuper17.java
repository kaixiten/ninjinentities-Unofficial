package hedaox.ninjinentities.entities.DBGT;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.config.ModConfig;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntitySuper17 extends EntityDBCNinjin {
    private int initialAttackDamage;
    private static final int DEFAULT_ATTACK_DAMAGE = 14000; // 默认攻击力
    public int randomSoundDelay = 0;

    public EntitySuper17(World par1World) {
        super(par1World, 85, MindState.AGGRESSIVE, false, true, new byte[]{1, 2, 3, 4, 5, 6}, new byte[]{7, 7, 7, 7, 7, 7});
        this.experienceValue = 80;
        this.setSize(0.72F, 2.16F);
        this.initialAttackDamage = DEFAULT_ATTACK_DAMAGE; // 初始化默认值
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(140000.0D);
        getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue((double)DEFAULT_ATTACK_DAMAGE);
    }

    @Override
    public void onEntityUpdate() {
        super.onEntityUpdate();

        // 初始化初始攻击力
        if (this.initialAttackDamage == 0) {
            if (getEntityData().hasKey("jrmcSpawnInitiatedCAT")) {
                int storedInitialDamage = getEntityData().getInteger("jrmcSpawnInitiatedCAT");
                if (storedInitialDamage > 0) {
                    this.initialAttackDamage = storedInitialDamage;
                } else {
                    this.initialAttackDamage = DEFAULT_ATTACK_DAMAGE;
                }
            } else {
                this.initialAttackDamage = DEFAULT_ATTACK_DAMAGE;
                getEntityData().setInteger("jrmcSpawnInitiatedCAT", this.initialAttackDamage);
            }
        }

        // 检查并修复攻击伤害值
        double currentAttack = getEntityAttribute(SharedMonsterAttributes.attackDamage).getBaseValue();
        if (currentAttack <= 0) {
            // 确保攻击伤害值不为0或负数，防止Dragon Block C模组崩溃
            double correctedAttack = Math.max(DEFAULT_ATTACK_DAMAGE, this.initialAttackDamage);
            getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(correctedAttack);
            getEntityData().setInteger("jrmcSpawnInitiatedCAT", (int)correctedAttack);
        } else if (currentAttack != (int)currentAttack) {
            // 确保攻击值为整数，避免浮点数精度问题
            getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(Math.floor(currentAttack));
        }
    }

    @Override
    public boolean attackEntityFrom(DamageSource source, float amount) {
        String type = source.getDamageType();

        if ("EnergyAttack".equals(type)) {
            if (!this.worldObj.isRemote) {
                enhanceEntityWithEnergy((int)amount);
            }
            return false;
        }

        if ("causeEnExplosion".equals(type)) {
            return false;
        }

        return super.attackEntityFrom(source, amount);
    }

    private void enhanceEntityWithEnergy(int energyDamage) {
        // 确保初始攻击力有效
        if (this.initialAttackDamage <= 0) {
            this.initialAttackDamage = DEFAULT_ATTACK_DAMAGE;
        }

        int currentAttackDamage = (int)getEntityAttribute(SharedMonsterAttributes.attackDamage).getBaseValue();

        // 安全检查：如果当前攻击力无效，重置为初始值
        if (currentAttackDamage <= 0) {
            currentAttackDamage = this.initialAttackDamage;
            getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue((double)currentAttackDamage);
        }

        double energyFactor = ModConfig.attackBoostEnergyFactor; // 0.1
        double boostPercent = ModConfig.attackBoostPercentPerHit; // 0.05 (5%)
        double maxPercent = ModConfig.attackMaxPercent; // 3.0 (300%)

        // 计算提升量
        double boostFromEnergy = energyDamage * energyFactor;
        double boostLimit = initialAttackDamage * boostPercent;
        double attackBoost = Math.min(boostFromEnergy, boostLimit);

        // 计算上限和新攻击力
        double maxAttack = initialAttackDamage * maxPercent;
        double newAttackDamage = Math.min(currentAttackDamage + attackBoost, maxAttack);
        newAttackDamage = Math.max(newAttackDamage, this.initialAttackDamage); // 确保不低于初始值

        int finalAttackDamage = (int)Math.max(newAttackDamage, this.initialAttackDamage); // 确保最终值有效

        if (finalAttackDamage > currentAttackDamage) {
            getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue((double)finalAttackDamage);
            getEntityData().setInteger("jrmcSpawnInitiatedCAT", finalAttackDamage);
        }
    }

    // 添加安全的攻击伤害获取方法
    public double getSafeAttackDamage() {
        double attackDamage = getEntityAttribute(SharedMonsterAttributes.attackDamage).getBaseValue();
        if (attackDamage <= 0) {
            // 如果攻击伤害无效，返回默认值并修复实体数据
            attackDamage = Math.max(DEFAULT_ATTACK_DAMAGE, this.initialAttackDamage);
            getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(attackDamage);
            getEntityData().setInteger("jrmcSpawnInitiatedCAT", (int)attackDamage);
        }
        return attackDamage;
    }

    @SideOnly(Side.CLIENT)
    public String getTexture() {
        return ModVars.MOD_ID + ":textures/entity/Super17.png";
    }
}

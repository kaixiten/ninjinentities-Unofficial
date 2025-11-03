package hedaox.ninjinentities.entities.DBGT;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntitySuper17 extends EntityDBCNinjin {
    private double initialMaxHealth; // 生物生成时的初始血量上限
    private double initialAttackDamage; // 生物生成时的初始攻击力
	public int randomSoundDelay = 0;
    public static double attackBoostPercentPerHit;   // 每次提升量限制：初始攻击力的百分比
    public static double attackBoostEnergyFactor;     // energyDamage 转换系数
    public static double attackMaxPercent;            // 最大攻击力上限倍数

	public EntitySuper17(World par1World) {
        super(par1World, 85, MindState.AGGRESSIVE, false, true, new byte[]{1, 2, 3, 4, 5, 6}, new byte[]{7, 7, 7, 7, 7, 7});
		this.experienceValue = 80;
		this.setSize(0.72F,2.16F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				140000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				14000.0D);
	}
    @Override
    public void onEntityUpdate() {
        super.onEntityUpdate();

        // 在实体生成后，记录初始血量和攻击力（从 NBT 中读取）
        if (this.initialAttackDamage == 0 && getEntityData().hasKey("jrmcSpawnInitiatedCAT")) {
            this.initialAttackDamage = getEntityData().getDouble("jrmcSpawnInitiatedCAT");
        }
    }

    @Override
    public boolean attackEntityFrom(DamageSource source, float amount) {
        String type = source.getDamageType();

        // 不受 EnergyAttack 伤害，同时强化
        if ("EnergyAttack".equals(type)) {
            if (!this.worldObj.isRemote) {
                enhanceEntityWithEnergy(amount);
            }
            return false; // 免疫
        }

        // 不受 causeEnExplosion 伤害
        if ("causeEnExplosion".equals(type)) {
            return false; // 完全免疫
        }

        // 其他情况正常处理
        return super.attackEntityFrom(source, amount);
    }


    private void enhanceEntityWithEnergy(float energyDamage) {
        // 当前攻击力 baseValue
        double currentAttackDamage = getEntityAttribute(SharedMonsterAttributes.attackDamage).getBaseValue();

        // 每次提升量限制 = min(气功伤害 * 系数, 初始攻击力 * 提升百分比)
        double attackBoost = Math.min(energyDamage * attackBoostEnergyFactor, initialAttackDamage * attackBoostPercentPerHit);

        // 新攻击力 = 当前 + 提升量，受最大百分比限制
        double maxAttack = initialAttackDamage * attackMaxPercent;
        double newAttackDamage = Math.min(currentAttackDamage + attackBoost, maxAttack);

        // 更新属性
        getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(newAttackDamage);

        // 同步 NBT
        getEntityData().setDouble("jrmcSpawnInitiatedCAT", newAttackDamage);
    }


    @SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/Super17.png";
	}
}

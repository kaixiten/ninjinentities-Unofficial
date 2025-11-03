package hedaox.ninjinentities.entities.doujin;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.World;

public class EntityVegetoUw extends EntityDBCNinjin {

    public int randomSoundDelay = 0;
    private double initialAttackDamage; // 记录生成后的基础攻击力

	public EntityVegetoUw(World par1World) {
		super(par1World, 85, MindState.AGGRESSIVE, true, true, new byte[]{1, 2, 3, 4, 5, 6}, new byte[]{7, 7, 2, 2, 7, 2},135.0F, 40.0F, 200.0F, false, true,135.0F, 0.0F, 155.0F);
		this.experienceValue = 80;
		this.setSize(0.6F,1.8F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				90000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				9000.0D);
	}

    @Override
    public void onEntityUpdate() {
        super.onEntityUpdate();

        // 在实体生成后，记录基础攻击力（从 NBT 中读取）
        if (this.initialAttackDamage == 0 && getEntityData().hasKey("jrmcSpawnInitiatedCAT")) {
            this.initialAttackDamage = getEntityData().getDouble("jrmcSpawnInitiatedCAT");
        }
    }

    @Override
    public void onUpdate() {
        super.onUpdate();

        // 更新攻击力
        updateAttackBasedOnHealth();
    }

    /**
     * 根据当前生命值百分比更新攻击力
     */
    private void updateAttackBasedOnHealth() {
        // 获取当前生命值和最大生命值
        double currentHealth = this.getHealth();
        double maxHealth = this.getMaxHealth();

        // 计算生命值百分比
        double healthPercentage = (currentHealth / maxHealth) * 100.0;

        // 计算攻击力提升百分比（每下降1%血量，攻击力提升1%）
        double attackIncreasePercentage = 100.0 - healthPercentage;

        // 计算新的攻击力
        double newAttackDamage = initialAttackDamage * (1.0 + attackIncreasePercentage / 100.0);

        // 更新 NBT 数据
        getEntityData().setDouble("jrmcSpawnInitiatedCAT", newAttackDamage);

        // 设置新的攻击力
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(newAttackDamage);

        // 同步更新 Modifiers 的 Amount
        updateAttackDamageModifier(newAttackDamage);
    }

    /**
     * 更新攻击力的 Modifier
     */
    private void updateAttackDamageModifier(double newAttackDamage) {
        // 移除旧的修饰器（如果存在）
        AttributeModifier oldAttackDamageModifier = this.getAttributeMap()
            .getAttributeInstance(SharedMonsterAttributes.attackDamage)
            .getModifier(this.getUniqueID());
        if (oldAttackDamageModifier != null) {
            this.getAttributeMap()
                .getAttributeInstance(SharedMonsterAttributes.attackDamage)
                .removeModifier(oldAttackDamageModifier);
        }

        // 计算 Modifier 的值（确保与 jrmcSpawnInitiatedCAT 一致）
        double modifierValue = newAttackDamage - this.getEntityAttribute(SharedMonsterAttributes.attackDamage).getBaseValue();

        // 应用新的修饰器
        AttributeModifier newAttackDamageModifier = new AttributeModifier(
            this.getUniqueID(), // UUID
            "attackDamageModifier", // 名称
            modifierValue, // 值
            0 // 操作类型（0 = 直接增加值）
        );
        this.getAttributeMap()
            .getAttributeInstance(SharedMonsterAttributes.attackDamage)
            .applyModifier(newAttackDamageModifier);
    }

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/vegetoUw.png";
	}
}

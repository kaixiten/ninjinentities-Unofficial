package hedaox.ninjinentities.entities.DBS;

import JinRyuu.DragonBC.common.Items.ItemsDBC;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.config.ModConfig;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.event.DodgeSystem;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityWhis extends EntityDBCNinjin {

    // 闪避系统实例
    private final DodgeSystem dodgeSystem = new DodgeSystem(this);

    // 反击概率缓存
    private final float counterChance = (float)(ModConfig.gokuUIMCounterChance / 100.0);

    public int randomSoundDelay = 0;

    public EntityWhis(World par1World) {
		super(par1World, 50, MindState.NEUTRAL, true, true, new byte[]{6}, new byte[]{3});
		this.experienceValue = 80;
		this.setSize(0.6F,1.98F);

        // 初始化闪避参数
        this.dodgeSystem.dodge = (int)ModConfig.WhisDodgeRate;
        this.dodgeSystem.strikeBack = (int)ModConfig.WhisCounterChance;
    }
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				250000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				25000.0D);
	}

    @Override
    public boolean attackEntityFrom(DamageSource source, float damage) {
        if (dodgeSystem.tryDodge(source.getEntity())) {
            tryCounterAttack(source.getEntity());
            return false;
        }
        return super.attackEntityFrom(source, damage);
    }

    private void tryCounterAttack(Entity attacker) {
        NBTTagCompound nbt = this.getEntityData();
        if (nbt.hasKey("jrmcSpawnInitiatedCAT") &&
            attacker instanceof EntityPlayer &&
            DodgeSystem.RANDOM.nextFloat() < counterChance) {

            double attackDamage = nbt.getDouble("jrmcSpawnInitiatedCAT");
            dodgeSystem.performCounterAttack(attacker, attackDamage);
        }
    }

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return "jinryuudragonbc:npcs/whis.png";
	}

    public boolean getCanSpawnHere() {
        return (this.worldObj.checkNoEntityCollision(this.boundingBox))
            && (this.worldObj.getCollidingBoundingBoxes(this,
            this.boundingBox).isEmpty())
            && (!this.worldObj.isAnyLiquid(this.boundingBox));
    }
	protected void dropFewItems(boolean par1, int par2) {
		int var3 = this.rand.nextInt(2 + par2);
		for (int var4 = 0; var4 < var3; var4++) {
			dropItem(ItemsDBC.ItemsOutfit1[40], 1);
		}
		var3 = this.rand.nextInt(2 + par2);
		for (int var4 = 0; var4 < var3; var4++) {
			dropItem(ItemsDBC.ItemsOutfit2[40], 1);
		}
		var3 = this.rand.nextInt(2 + par2);
		for (int var4 = 0; var4 < var3; var4++) {
			dropItem(ItemsDBC.ItemsOutfit3[40], 1);
		}
	}
}

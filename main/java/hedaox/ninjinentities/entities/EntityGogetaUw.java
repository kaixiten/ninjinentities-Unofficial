package hedaox.ninjinentities.entities;

import JinRyuu.DragonBC.common.Items.ItemsDBC;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityGogetaUw extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityGogetaUw(World par1World) {
		super(par1World, 85, MindState.NEUTRAL, true, true, new byte[]{1, 2, 3, 4, 5, 6}, new byte[]{7, 7, 2, 2, 7, 2},135.0F, 40.0F, 200.0F, false, true,135.0F, 0.0F, 155.0F);
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

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/gogetaUw.png";
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
			dropItem(ItemsDBC.ItemsOutfit1[17], 1);
		}
		var3 = this.rand.nextInt(2 + par2);
		for (int var4 = 0; var4 < var3; var4++) {
			dropItem(ItemsDBC.ItemsOutfit2[17], 1);
		}
		var3 = this.rand.nextInt(2 + par2);
		for (int var4 = 0; var4 < var3; var4++) {
			dropItem(ItemsDBC.ItemsOutfit3[17], 1);
		}
	}
}

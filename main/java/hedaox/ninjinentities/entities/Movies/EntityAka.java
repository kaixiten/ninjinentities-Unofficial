package hedaox.ninjinentities.entities.Movies;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityAka extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityAka(World par1World) {
		super(par1World, 0, MindState.AGGRESSIVE, false, true, new byte[]{5, 1, 5}, new byte[]{6, 6, 4});
		this.experienceValue = 80;
		this.setSize(0.81F,2.16F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				18000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				1800.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/aka.png";
	}

	public boolean getCanSpawnHere() {
		return (this.worldObj.checkNoEntityCollision(this.boundingBox))
				&& (this.worldObj.getCollidingBoundingBoxes(this,
						this.boundingBox).isEmpty())
				&& (!this.worldObj.isAnyLiquid(this.boundingBox));
	}
}

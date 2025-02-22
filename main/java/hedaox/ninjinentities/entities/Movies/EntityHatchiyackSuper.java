package hedaox.ninjinentities.entities.Movies;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityHatchiyackSuper extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityHatchiyackSuper(World par1World) {
		super(par1World, 0, MindState.AGGRESSIVE, false, true, new byte[]{5}, new byte[]{6});
		this.experienceValue = 80;
		this.setSize(0.78F,2.34F);
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
		return ModVars.MOD_ID + ":textures/entity/hatchiyackSuper.png";
	}
}

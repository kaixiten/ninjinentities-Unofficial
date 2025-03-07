package hedaox.ninjinentities.entities.Movies;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityGarlicJr extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityGarlicJr(World par1World) {
		super(par1World, 0, MindState.AGGRESSIVE, false, false, new byte[]{1, 3}, new byte[]{4, 4});
		this.experienceValue = 80;
		this.setSize(0.39F,1.17F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				250.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				25.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/garlicJr.png";
	}
}

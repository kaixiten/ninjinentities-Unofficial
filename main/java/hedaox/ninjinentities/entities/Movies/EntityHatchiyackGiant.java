package hedaox.ninjinentities.entities.Movies;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityHatchiyackGiant extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityHatchiyackGiant(World par1World) {
		super(par1World, 0, MindState.AGGRESSIVE, false, true, new byte[]{5}, new byte[]{6});
		this.experienceValue = 80;
		this.setSize(1.38F,4.14F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				17000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				1600.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/hatchiyack.png";
	}
}

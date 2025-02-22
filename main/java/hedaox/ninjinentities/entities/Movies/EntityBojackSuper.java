package hedaox.ninjinentities.entities.Movies;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityBojackSuper extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityBojackSuper(World par1World) {
		super(par1World, 10, MindState.AGGRESSIVE, false, true, new byte[]{3, 5, 1}, new byte[]{6, 6, 6});
		this.experienceValue = 80;
		this.setSize(0.72F,2.07F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				17000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				1700.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/bojackSuper.png";
	}
}

package hedaox.ninjinentities.entities.Movies;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityBioWarrior6 extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityBioWarrior6(World par1World) {
		super(par1World, 0, MindState.AGGRESSIVE, false, false, new byte[]{1}, new byte[]{4});
		this.experienceValue = 80;
		this.setSize(0.39F,2.07F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				1000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				100.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/bioWarrior6.png";
	}

}

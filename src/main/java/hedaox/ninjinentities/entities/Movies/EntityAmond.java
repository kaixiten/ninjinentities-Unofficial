package hedaox.ninjinentities.entities.Movies;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityAmond extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityAmond(World par1World) {
		super(par1World, 0, MindState.AGGRESSIVE, false, false, new byte[]{2}, new byte[]{8});
		this.experienceValue = 80;
		this.setSize(0.63F,1.89F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				500.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				50.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/amond.png";
	}

}

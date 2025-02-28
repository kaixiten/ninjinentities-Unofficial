package hedaox.ninjinentities.entities.Movies;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityNeiz extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityNeiz(World par1World) {
		super(par1World, 0, MindState.AGGRESSIVE, false, false, new byte[]{1, 3}, new byte[]{3, 3});
		this.experienceValue = 80;
		this.setSize(0.66F,2.07F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				2000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				220.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/neiz.png";
	}
}

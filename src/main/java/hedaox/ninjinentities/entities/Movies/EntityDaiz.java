package hedaox.ninjinentities.entities.Movies;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityDaiz extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityDaiz(World par1World) {
		super(par1World, 0, MindState.AGGRESSIVE, false, false, new byte[]{1, 3, 5}, new byte[]{4, 4, 4});
		this.experienceValue = 80;
		this.setSize(0.57F,1.71F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				475.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				47.5D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/daiz.png";
	}
}

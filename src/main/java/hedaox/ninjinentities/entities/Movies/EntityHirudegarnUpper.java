package hedaox.ninjinentities.entities.Movies;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityHirudegarnUpper extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityHirudegarnUpper(World par1World) {
		super(par1World, 0, MindState.AGGRESSIVE, false, false, new byte[]{1}, new byte[]{4});
		this.experienceValue = 80;
		this.setSize(2.0F,6.0F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				20000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				2000.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/hirudegarnUpperBottom.png";
	}
}

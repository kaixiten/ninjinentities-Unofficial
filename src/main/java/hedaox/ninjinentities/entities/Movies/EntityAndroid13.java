package hedaox.ninjinentities.entities.Movies;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityAndroid13 extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityAndroid13(World par1World) {
		super(par1World, 0, MindState.AGGRESSIVE, false, true, new byte[]{1, 6, 3, 5}, new byte[]{4, 4, 4, 4});
		this.experienceValue = 80;
		this.setSize(0.6F,1.8F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				10500.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				1050.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/android13.png";
	}
}

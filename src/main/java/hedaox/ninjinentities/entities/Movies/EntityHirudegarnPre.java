package hedaox.ninjinentities.entities.Movies;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityHirudegarnPre extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityHirudegarnPre(World par1World) {
		super(par1World, 0, MindState.AGGRESSIVE, false, true, new byte[]{3, 3, 5}, new byte[]{2, 4, 4});
		this.experienceValue = 80;
		this.setSize(2.0F,6.0F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				25000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				2500.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/hirudegarnPre.png";
	}
}

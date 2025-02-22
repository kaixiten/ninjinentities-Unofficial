package hedaox.ninjinentities.entities.DBZ;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityGinyuGoku extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityGinyuGoku(World par1World) {
		super(par1World, 5, MindState.AGGRESSIVE, false, false, new byte[]{3, 6, 1}, new byte[]{8, 8, 3});
		this.experienceValue = 80;
		this.setSize(0.612F,1.836F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				1400.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				140.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/ginyuGoku.png";
	}
}

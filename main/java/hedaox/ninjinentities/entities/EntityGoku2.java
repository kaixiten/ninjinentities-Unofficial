package hedaox.ninjinentities.entities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityGoku2 extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityGoku2(World par1World) {
		super(par1World, 100, MindState.NEUTRAL, true, false, new byte[]{3, 3, 1, 6, 5}, new byte[]{2, 2, 2, 2, 2});
		this.experienceValue = 80;
		this.setSize(0.6F,1.8F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				2000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				200.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/goku2.png";
	}
}

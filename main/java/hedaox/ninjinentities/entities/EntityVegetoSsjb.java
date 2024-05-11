package hedaox.ninjinentities.entities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityVegetoSsjb extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityVegetoSsjb(World par1World) {
		super(par1World, 85, MindState.NEUTRAL, true, true, new byte[]{1, 2, 3, 4, 5, 6}, new byte[]{7, 7, 2, 2, 7, 2},50.0F, 255.0F, 255.0F, false, true,50.0F, 200.0F, 255.0F);
		this.experienceValue = 80;
		this.setSize(0.6F,1.8F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				200000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				20000.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/vegetoSsjb.png";
	}
}

package hedaox.ninjinentities.entities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityVegeta2Ssj2 extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityVegeta2Ssj2(World par1World) {
		super(par1World, 70, MindState.NEUTRAL, true, false, new byte[]{3, 6, 3, 5}, new byte[]{3, 7, 7, 7}, 255.0F, 217.0F, 25.0F, true);
		this.experienceValue = 80;
		this.setSize(0.6F,1.8F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				24000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				2400.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/vegeta2Ssj.png";
	}
}

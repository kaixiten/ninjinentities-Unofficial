package hedaox.ninjinentities.entities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityJs extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityJs(World par1World) {
		super(par1World, 100, MindState.NEUTRAL, true, true, new byte[]{1}, new byte[]{2});
		this.experienceValue = 80;
		this.setSize(0.6F,1.8F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				10000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				1000.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/js.png";
	}
}

package hedaox.ninjinentities.entities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityVegeto extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityVegeto(World par1World) {
		super(par1World, 85, MindState.NEUTRAL, true, true, new byte[]{1, 2, 3, 4, 5, 6}, new byte[]{7, 7, 2, 2, 7, 2});
		this.experienceValue = 80;
		this.setSize(0.6F,1.8F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				55000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				5500.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/vegeto.png";
	}
}

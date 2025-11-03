package hedaox.ninjinentities.entities.ZENO;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityGoldCoolerMetal extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityGoldCoolerMetal(World par1World) {
		super(par1World, 0, MindState.AGGRESSIVE, false, false, new byte[]{1, 3, 5}, new byte[]{3, 3, 8});
		this.experienceValue = 80;
		this.setSize(0.57F,1.71F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				500000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				50000.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/hjcoolerMetal.png";
	}
}

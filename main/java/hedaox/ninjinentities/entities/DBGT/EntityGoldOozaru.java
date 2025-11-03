package hedaox.ninjinentities.entities.DBGT;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityGoldOozaru extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityGoldOozaru(World par1World) {
		super(par1World, 50, MindState.AGGRESSIVE, false, false, new byte[]{3}, new byte[]{7});
		this.experienceValue = 80;
		this.setSize(1.38F,4.14F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				250000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				25000.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/Goldoozaru.png";
	}
}

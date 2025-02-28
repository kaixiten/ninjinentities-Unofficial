package hedaox.ninjinentities.entities.DBGT;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class Entityomega2 extends EntityDBCNinjin {

	public Entityomega2(World par1World) {
		super(par1World, 34, MindState.AGGRESSIVE, false, true, new byte[]{3, 6, 3, 5}, new byte[]{3, 7, 7, 7});
		this.experienceValue = 80;
		this.angerLevel = 400;
		this.setSize(0.6F,1.8F);
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
		return ModVars.MOD_ID + ":textures/entity/omega.png";
	}
}

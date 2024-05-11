package hedaox.ninjinentities.entities;

import JinRyuu.DragonBC.common.Items.ItemsDBC;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityBrolyZLSsj3 extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityBrolyZLSsj3(World par1World) {
		super(par1World, 15, MindState.AGGRESSIVE, false, false, new byte[]{1, 3, 5, 6}, new byte[]{6, 6, 6, 6});
		this.experienceValue = 80;
		this.setSize(0.75F,2.25F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				15000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				1500.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/dbsbrolyLSSJ3.png";
	}
}

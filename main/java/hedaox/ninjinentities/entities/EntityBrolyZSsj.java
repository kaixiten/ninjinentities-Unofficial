package hedaox.ninjinentities.entities;

import JinRyuu.DragonBC.common.Items.ItemsDBC;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityBrolyZSsj extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityBrolyZSsj(World par1World) {
		super(par1World, 15, MindState.AGGRESSIVE, false, false, new byte[]{1, 3, 5, 6}, new byte[]{6, 6, 6, 6});
		this.experienceValue = 80;
		this.setSize(0.66F,1.98F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				9500.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				950.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/dbsbroly2.png";
	}
}

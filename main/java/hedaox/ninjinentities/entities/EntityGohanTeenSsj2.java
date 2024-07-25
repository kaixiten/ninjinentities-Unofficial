package hedaox.ninjinentities.entities;

import JinRyuu.DragonBC.common.Items.ItemsDBC;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityGohanTeenSsj2 extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityGohanTeenSsj2(World par1World) {
		super(par1World, 100, MindState.AGGRESSIVE, true, true, new byte[]{3, 3, 6, 1}, new byte[]{2, 7, 2, 2}, 255.0F, 217.0F, 25.0F, true);
		this.experienceValue = 80;
		this.setSize(0.48F,1.44F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				19000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				1900.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/gohanTeenSsj.png";
	}
}

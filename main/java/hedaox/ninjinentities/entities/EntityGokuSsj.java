package hedaox.ninjinentities.entities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityGokuSsj extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityGokuSsj(World par1World) {
		super(par1World, 100, MindState.NEUTRAL, true, false, new byte[]{3, 3, 1, 6, 5, 2}, new byte[]{2, 2, 2, 2, 2, 7}, 255.0F, 217.0F, 25.0F);
		this.experienceValue = 80;
		this.setSize(0.6F,1.8F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				9000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				900.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/gokuSsj.png";
	}
}

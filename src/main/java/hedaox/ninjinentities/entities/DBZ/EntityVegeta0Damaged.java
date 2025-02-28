package hedaox.ninjinentities.entities.DBZ;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityVegeta0Damaged extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityVegeta0Damaged(World par1World) {
		super(par1World, 40, MindState.NEUTRAL, false, false, new byte[]{3, 6}, new byte[]{3, 3});
		this.experienceValue = 80;
		this.setSize(0.6F,1.8F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				850.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				85.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/vegeta0Damaged.png";
	}
}

package hedaox.ninjinentities.entities.DBZ;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityTrunksKid extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityTrunksKid(World par1World) {
		super(par1World, 100, MindState.NEUTRAL, true, false, new byte[]{3, 1, 6}, new byte[]{7, 7, 7});
		this.experienceValue = 80;
		this.setSize(0.39F,1.17F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				1700.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				170.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/trunksKid.png";
	}

}

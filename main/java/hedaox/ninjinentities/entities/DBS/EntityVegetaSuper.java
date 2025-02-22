package hedaox.ninjinentities.entities.DBS;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityVegetaSuper extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityVegetaSuper(World par1World) {
		super(par1World, 70, MindState.NEUTRAL, true, true, new byte[]{3, 6, 3, 5}, new byte[]{3, 7, 7, 7});
		this.experienceValue = 80;
		this.setSize(0.6F,1.8F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				10000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				1000.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/vegetaSuper.png";
	}
}

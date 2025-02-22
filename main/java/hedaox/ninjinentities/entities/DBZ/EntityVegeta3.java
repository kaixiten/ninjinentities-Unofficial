package hedaox.ninjinentities.entities.DBZ;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityVegeta3 extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityVegeta3(World par1World) {
		super(par1World, 40, MindState.AGGRESSIVE, false, false, new byte[]{3, 6}, new byte[]{3, 7});
		this.experienceValue = 80;
		this.setSize(0.6F,1.8F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				1500.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				150.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/vegeta3.png";
	}
}

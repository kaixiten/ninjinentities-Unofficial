package hedaox.ninjinentities.entities.DBZ;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityChiaotzu2 extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityChiaotzu2(World par1World) {
		super(par1World, 80, MindState.NEUTRAL, true, false, new byte[]{3, 6}, new byte[]{7, 7});
		this.experienceValue = 80;
		this.setSize(0.36F,1.08F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				350.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				35.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/chiaotzu2.png";
	}
}

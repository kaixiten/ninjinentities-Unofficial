package hedaox.ninjinentities.entities.DB;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityChiaotzu1 extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityChiaotzu1(World par1World) {
		super(par1World, 70, MindState.NEUTRAL, false, false, new byte[]{3, 6}, new byte[]{7, 7});
		this.experienceValue = 80;
		this.setSize(0.36F,1.08F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				180.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				18.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/chiaotzu1.png";
	}

}

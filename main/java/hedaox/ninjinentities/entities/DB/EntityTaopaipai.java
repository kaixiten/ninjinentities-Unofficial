package hedaox.ninjinentities.entities.DB;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityTaopaipai extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityTaopaipai(World par1World) {
		super(par1World, 5, MindState.AGGRESSIVE, false, false, new byte[]{3}, new byte[]{7});
		this.experienceValue = 80;
		this.angerLevel = 400;
		this.setSize(0.6F,1.8F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				170.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				17.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/taopaipai.png";
	}
}

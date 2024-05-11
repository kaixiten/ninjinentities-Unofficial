package hedaox.ninjinentities.entities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityPiccoloInjury extends EntityDBCNinjin {

	public EntityPiccoloInjury(World par1World) {
		super(par1World, 50, MindState.NEUTRAL, false, true, new byte[]{1, 3, 6}, new byte[]{7, 7, 7});
		this.experienceValue = 80;
		this.setSize(0.6F,1.8F);
	}
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				40000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				4000.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/PiccoloInjury.png";
	}
}

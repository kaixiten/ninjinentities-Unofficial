package hedaox.ninjinentities.entities.doujin;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;


public class EntityVegetoUi extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityVegetoUi(World par1World) {
		super(par1World, 100, MindState.AGGRESSIVE, true, true, new byte[]{3, 3, 1, 6, 5, 2}, new byte[]{2, 2, 2, 2, 2, 7}, 255.0F, 255.0F, 255.0F, false, true,225.0F, 225.0F, 225.0F);
		this.experienceValue = 80;
		this.setSize(0.6F,1.8F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				90000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				9000.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/vegetoUi.png";
	}
}

package hedaox.ninjinentities.entities.doujin;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityVegetoUw extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityVegetoUw(World par1World) {
		super(par1World, 85, MindState.AGGRESSIVE, true, true, new byte[]{1, 2, 3, 4, 5, 6}, new byte[]{7, 7, 2, 2, 7, 2},135.0F, 40.0F, 200.0F, false, true,135.0F, 0.0F, 155.0F);
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
		return ModVars.MOD_ID + ":textures/entity/vegetoUw.png";
	}
}

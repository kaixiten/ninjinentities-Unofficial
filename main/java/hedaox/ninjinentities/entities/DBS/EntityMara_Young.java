package hedaox.ninjinentities.entities.DBS;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityMara_Young extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityMara_Young(World par1World) {
		super(par1World, 0, MindState.AGGRESSIVE, false, true,  new byte[]{1, 6, 2, 3, 4, 3}, new byte[]{3, 2, 7, 3, 7, 2});
		this.experienceValue = 80;
		this.setSize(1.0F,2.16F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				18000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				1800.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/young_mara.png";
	}
}

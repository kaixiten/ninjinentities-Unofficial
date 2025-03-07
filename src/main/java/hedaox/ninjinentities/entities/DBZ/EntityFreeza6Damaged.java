package hedaox.ninjinentities.entities.DBZ;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityFreeza6Damaged extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityFreeza6Damaged(World par1World) {
		super(par1World, 0, MindState.AGGRESSIVE, false, false, new byte[]{3, 5}, new byte[]{3, 8});
		this.experienceValue = 80;
		this.setSize(0.57F,1.71F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				4000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				400.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/freeza6Damaged.png";
	}

}

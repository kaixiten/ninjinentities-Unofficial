package hedaox.ninjinentities.entities.DBS;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityCellmax extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityCellmax(World par1World) {
        super(par1World, 85, MindState.AGGRESSIVE, false, true, new byte[]{1, 2, 3, 4, 5, 6}, new byte[]{5, 5, 3, 3, 5, 5});
		this.experienceValue = 80;
		this.setSize(1.38F,4.14F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				30000000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				300000.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/cellmax.png";
	}
}

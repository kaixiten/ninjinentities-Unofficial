package hedaox.ninjinentities.entities.DBZ;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityYamu extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityYamu(World par1World) {
		super(par1World, 0, MindState.NEUTRAL, false, false, new byte[]{1}, new byte[]{4});
		this.experienceValue = 80;
		this.setSize(0.69F,1.98F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				200.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				20.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/yamu.png";
	}
}

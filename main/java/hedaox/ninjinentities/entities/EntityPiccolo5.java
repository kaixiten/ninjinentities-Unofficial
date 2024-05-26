package hedaox.ninjinentities.entities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityPiccolo5 extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityPiccolo5(World par1World) {
		super(par1World, 75, MindState.NEUTRAL, true, false, new byte[]{1, 3, 4, 5, 6}, new byte[]{7, 7, 7, 7, 7});
		this.experienceValue = 80;
		this.setSize(1.38F,6.14F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				370.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				37.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/piccolo4.png";
	}
}

package hedaox.ninjinentities.entities.DBGT;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntitySuper17 extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntitySuper17(World par1World) {
        super(par1World, 85, MindState.AGGRESSIVE, false, true, new byte[]{1, 2, 3, 4, 5, 6}, new byte[]{7, 7, 7, 7, 7, 7});
		this.experienceValue = 80;
		this.setSize(0.72F,2.16F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				140000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				14000.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/Super17.png";
	}
}

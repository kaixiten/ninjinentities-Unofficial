package hedaox.ninjinentities.entities.DBAF;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityGokuSsj5 extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityGokuSsj5(World par1World) {
		super(par1World, 100, MindState.NEUTRAL, true, true, new byte[]{3, 3, 1, 6, 5, 2}, new byte[]{2, 2, 2, 2, 2, 7});
		this.experienceValue = 80;
		this.setSize(0.6F,2.3F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				300000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				30000.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/gokuSsj5.png";
	}
}

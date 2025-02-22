package hedaox.ninjinentities.entities.DBS;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class Entityglnl extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public Entityglnl(World par1World) {
        super(par1World, 85, MindState.AGGRESSIVE, false, true, new byte[]{1, 2, 3, 4, 5, 6}, new byte[]{3, 3, 3, 3, 3, 3});
		this.experienceValue = 80;
		this.setSize(0.63F,1.89F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				30000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				3000.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/glnl.png";
	}
}

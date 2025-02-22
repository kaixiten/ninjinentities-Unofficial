package hedaox.ninjinentities.entities.DBS;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityPiccolo4 extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityPiccolo4(World par1World) {
		super(par1World, 75, MindState.NEUTRAL, true, false, new byte[]{1, 3, 4, 5, 6}, new byte[]{7, 7, 7, 7, 7});
		this.experienceValue = 80;
		this.setSize(0.8F,2.8F);
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

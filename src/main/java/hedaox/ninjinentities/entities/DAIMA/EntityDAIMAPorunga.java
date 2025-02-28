package hedaox.ninjinentities.entities.DAIMA;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityDAIMAPorunga extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityDAIMAPorunga(World par1World) {
		super(par1World, 100, MindState.NEUTRAL, true, false, new byte[]{3, 3, 1, 6}, new byte[]{2, 2, 2, 2});
		this.experienceValue = 80;
		this.setSize(16.0F,60.0F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				30000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				10.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/daimaporunga.png";
	}

}

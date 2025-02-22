package hedaox.ninjinentities.entities.DB;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityRoshi extends EntityDBCNinjin {

	public int randomSoundDelay = 0;
	private int angerLevel = 0;

	public EntityRoshi(World par1World) {
		super(par1World, 80, MindState.NEUTRAL, true, false, new byte[]{3}, new byte[]{2});
		this.experienceValue = 80;
		this.setSize(0.6F,1.8F);
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
		return "jinryuudragonbc:npcs/roshishell.png";
	}
}

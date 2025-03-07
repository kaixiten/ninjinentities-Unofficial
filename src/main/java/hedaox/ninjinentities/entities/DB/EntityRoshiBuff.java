package hedaox.ninjinentities.entities.DB;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityRoshiBuff extends EntityDBCNinjin {

	public int randomSoundDelay = 0;
	private int angerLevel = 0;

	public EntityRoshiBuff(World par1World) {
		super(par1World, 80, MindState.AGGRESSIVE, true, false, new byte[]{3}, new byte[]{2});
		this.experienceValue = 80;
		this.setSize(0.66F,1.98F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				230.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				23.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/roshiBuff.png";
	}
}

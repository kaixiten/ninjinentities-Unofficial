package hedaox.ninjinentities.entities.Movies;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityGinger extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityGinger(World par1World) {
		super(par1World, 0, MindState.AGGRESSIVE, false, false, new byte[]{3}, new byte[]{3});
		this.experienceValue = 80;
		this.setSize(0.51F,1.53F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				245.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				24.5D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/ginger.png";
	}
}

package hedaox.ninjinentities.entities.Movies;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityWings extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityWings(World par1World) {
		super(par1World, 0, MindState.AGGRESSIVE, false, false, new byte[]{1, 3}, new byte[]{7, 7});
		this.experienceValue = 80;
		this.setSize(0.7F,1.8F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				1250.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				120.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/wings.png";
	}
}

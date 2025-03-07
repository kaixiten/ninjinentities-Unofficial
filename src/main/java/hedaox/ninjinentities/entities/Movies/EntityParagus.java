package hedaox.ninjinentities.entities.Movies;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityParagus extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityParagus(World par1World) {
		super(par1World, 10, MindState.NEUTRAL, false, false, new byte[]{1, 3}, new byte[]{6, 6});
		this.experienceValue = 80;
		this.setSize(0.6F,1.8F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				4000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				400.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/paragus.png";
	}
}

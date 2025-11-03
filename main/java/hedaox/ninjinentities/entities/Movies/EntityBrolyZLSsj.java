package hedaox.ninjinentities.entities.Movies;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityBrolyZLSsj extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityBrolyZLSsj(World par1World) {
		super(par1World, 15, MindState.AGGRESSIVE, false, true, new byte[]{1, 3, 5, 6}, new byte[]{6, 6, 6, 6});
		this.experienceValue = 80;
		this.setSize(0.75F,2.25F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				15000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				1500.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/dbsbrolyLSSJ.png";
	}
}

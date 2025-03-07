package hedaox.ninjinentities.entities.Movies;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityMedamatcha extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityMedamatcha(World par1World) {
		super(par1World, 0, MindState.AGGRESSIVE, false, false, new byte[]{3, 6}, new byte[]{7, 7});
		this.experienceValue = 80;
		this.setSize(0.7F,1.62F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				1300.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				130.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/medamatcha.png";
	}
}

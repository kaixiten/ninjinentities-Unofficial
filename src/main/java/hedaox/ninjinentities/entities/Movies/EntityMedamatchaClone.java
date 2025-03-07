package hedaox.ninjinentities.entities.Movies;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityMedamatchaClone extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityMedamatchaClone(World par1World) {
		super(par1World, 0, MindState.AGGRESSIVE, false, false, new byte[]{1}, new byte[]{7});
		this.experienceValue = 80;
		this.setSize(0.55F,0.81F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				800.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				80.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/medamatchaClone.png";
	}
}

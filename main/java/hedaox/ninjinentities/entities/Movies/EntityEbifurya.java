package hedaox.ninjinentities.entities.Movies;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityEbifurya extends EntityDBCNinjin {

	public EntityEbifurya(World par1World) {
		super(par1World, 0, MindState.AGGRESSIVE, false, false, new byte[]{3, 1}, new byte[]{1, 3});
		this.experienceValue = 80;
		this.angerLevel = 400;
		this.setSize(0.78F,2.34F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				380.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				38.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/ebifurya.png";
	}

}

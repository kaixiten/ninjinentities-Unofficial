package hedaox.ninjinentities.entities.DBGT;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityVegetaSsj4 extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityVegetaSsj4(World par1World) {
		super(par1World, 70, MindState.AGGRESSIVE, true, false, new byte[]{3, 6, 3, 5}, new byte[]{3, 7, 7, 7});
		this.experienceValue = 80;
		this.setSize(0.6F,2.2F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				300000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				30000.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/vegetaSsj4.png";
	}
}

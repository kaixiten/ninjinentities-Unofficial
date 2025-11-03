package hedaox.ninjinentities.entities.DAIMA;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityKaioshinChild extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityKaioshinChild(World par1World) {
		super(par1World, 0, MindState.AGGRESSIVE, true, false, new byte[]{1}, new byte[]{4});
		this.experienceValue = 80;
        this.setSize(0.33F,0.99F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				5000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				500.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/KaioshinChild.png";
	}
}

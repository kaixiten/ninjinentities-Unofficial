package hedaox.ninjinentities.entities.doujin;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityBdkssjb3Ninjin extends EntityDBCNinjin {


	public int randomSoundDelay = 0;

	public EntityBdkssjb3Ninjin(World par1World) {
        super(par1World, 85, MindState.AGGRESSIVE, true, true, new byte[]{1, 3, 4, 5, 6}, new byte[]{2, 2, 2, 2, 2},50.0F, 255.0F, 255.0F, false, true,50.0F, 200.0F, 255.0F);
		this.experienceValue = 80;
		this.setSize(0.5F,2.0F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				18500.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				1850.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/bdkssjb3.png";
	}

}

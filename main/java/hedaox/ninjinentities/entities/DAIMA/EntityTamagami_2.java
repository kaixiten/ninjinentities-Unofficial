package hedaox.ninjinentities.entities.DAIMA;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityTamagami_2 extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityTamagami_2(World par1World) {
		super(par1World, 100, MindState.NEUTRAL, true, false, new byte[]{3, 3, 1, 6, 5}, new byte[]{2, 2, 2, 2, 2});
		this.experienceValue = 80;
		this.setSize(1.2F,4.8F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				2000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				200.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/tamagami_2_HD.png";
	}
}

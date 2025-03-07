package hedaox.ninjinentities.entities.Movies;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityCyclopianGuard extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityCyclopianGuard(World par1World) {
		super(par1World, 10, MindState.AGGRESSIVE, false, false, new byte[]{1}, new byte[]{2});
		this.experienceValue = 80;
		this.setSize(1.2F,2.7F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				5500.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				550.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/cyclopianGuard.png";
	}
}

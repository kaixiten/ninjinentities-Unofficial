package hedaox.ninjinentities.entities.ZENO;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityKanbaSsjoozaru extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityKanbaSsjoozaru(World par1World) {
		super(par1World, 0, MindState.AGGRESSIVE, false, false, new byte[]{3, 3, 1, 6, 5, 2}, new byte[]{2, 2, 2, 2, 2, 7}, 255.0F, 217.0F, 25.0F, false);
		this.experienceValue = 80;
		this.setSize(1.38F,4.14F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				30000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				3000.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/kanbaSsjoozaru.png";
	}
}


package hedaox.ninjinentities.entities.ZENO;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityBlockGoku extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityBlockGoku(World par1World) {
		super(par1World, 85, MindState.AGGRESSIVE, false, true, new byte[]{1, 3, 4, 5, 6}, new byte[]{2, 2, 2, 2, 2});
		this.experienceValue = 80;
        this.angerLevel = 400;
		this.setSize(0.6F,1.8F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				20000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				2000.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/Blockgoku.png";
	}
}

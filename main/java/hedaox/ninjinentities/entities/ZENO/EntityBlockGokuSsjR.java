package hedaox.ninjinentities.entities.ZENO;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityBlockGokuSsjR extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityBlockGokuSsjR(World par1World) {
        super(par1World, 3, MindState.AGGRESSIVE, false, true, new byte[]{3, 1, 5}, new byte[]{3, 3, 3},255.0F, 50.0F, 255.0F, false, true,255.0F, 50.0F, 200.0F);
        this.experienceValue = 80;
        this.angerLevel = 400;
		this.setSize(0.6F,1.8F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				50000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				5000.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/BlockgokuSSJR.png";
	}
}

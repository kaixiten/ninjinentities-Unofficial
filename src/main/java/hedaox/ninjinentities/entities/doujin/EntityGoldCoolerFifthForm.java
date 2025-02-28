package hedaox.ninjinentities.entities.doujin;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityGoldCoolerFifthForm extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityGoldCoolerFifthForm(World par1World) {
        super(par1World, 0, MindState.AGGRESSIVE, false, true, new byte[]{1, 6, 2, 3, 4, 3}, new byte[]{3, 2, 7, 3, 7, 2}, 255.0F, 217.0F, 25.0F);
		this.experienceValue = 80;
		this.setSize(0.66F,1.98F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				8500.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				850.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/hjcoolerFifthForm.png";
	}
}

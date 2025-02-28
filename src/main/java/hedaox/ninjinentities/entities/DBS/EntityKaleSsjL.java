package hedaox.ninjinentities.entities.DBS;

import JinRyuu.DragonBC.common.Items.ItemsDBC;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityKaleSsjL extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityKaleSsjL(World par1World) {
		super(par1World, 95, MindState.AGGRESSIVE, false, true, new byte[]{1, 3, 5, 6}, new byte[]{6, 6, 6, 6},50.0F, 255.0F, 50.0F);
		this.experienceValue = 80;
		this.angerLevel = 400;
		this.setSize(0.72F,2.16F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				23000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				2300.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/kaleSsjL.png";
	}

	protected void dropFewItems(boolean par1, int par2) {
		int var3 = this.rand.nextInt(2 + par2);
		for (int var4 = 0; var4 < var3; var4++) {
			dropItem(ItemsDBC.ItemsOutfit1[37], 1);
		}
		var3 = this.rand.nextInt(2 + par2);
		for (int var4 = 0; var4 < var3; var4++) {
			dropItem(ItemsDBC.ItemsOutfit2[37], 1);
		}
		var3 = this.rand.nextInt(2 + par2);
		for (int var4 = 0; var4 < var3; var4++) {
			dropItem(ItemsDBC.ItemsOutfit3[37], 1);
		}
	}
}

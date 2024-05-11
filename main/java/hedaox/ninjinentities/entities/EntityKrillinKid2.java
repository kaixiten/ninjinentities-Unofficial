package hedaox.ninjinentities.entities;

import JinRyuu.DragonBC.common.Items.ItemsDBC;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityKrillinKid2 extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityKrillinKid2(World par1World) {
		super(par1World, 95, MindState.NEUTRAL, true, false, new byte[]{3}, new byte[]{2});
		this.experienceValue = 80;
		this.setSize(0.375F,1.125F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				190.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				19.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/krillin1.png";
	}

	protected void dropFewItems(boolean par1, int par2) {
		int var3 = this.rand.nextInt(2 + par2);
		for (int var4 = 0; var4 < var3; var4++) {
			dropItem(ItemsDBC.KameTorso1, 1);
		}
		var3 = this.rand.nextInt(2 + par2);
		for (int var4 = 0; var4 < var3; var4++) {
			dropItem(ItemsDBC.GiFighter1Leg, 1);
		}
		var3 = this.rand.nextInt(2 + par2);
		for (int var4 = 0; var4 < var3; var4++) {
			dropItem(ItemsDBC.KameBoots1, 1);
		}
	}
}

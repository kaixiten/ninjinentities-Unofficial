package hedaox.ninjinentities.entities.DB;

import JinRyuu.DragonBC.common.Items.ItemsDBC;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityGokuKid1 extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityGokuKid1(World par1World) {
		super(par1World, 100, MindState.NEUTRAL, true, false, new byte[]{3}, new byte[]{2});
		this.experienceValue = 80;
		this.setSize(0.36F,1.08F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				170.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				17.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/gokuKid1.png";
	}

	protected void dropFewItems(boolean par1, int par2) {
		int var3 = this.rand.nextInt(2 + par2);
		for (int var4 = 0; var4 < var3; var4++) {
			dropItem(ItemsDBC.ItemsOutfit1[34], 1);
		}
		var3 = this.rand.nextInt(2 + par2);
		for (int var4 = 0; var4 < var3; var4++) {
			dropItem(ItemsDBC.GiFighter2Leg, 1);
		}
		var3 = this.rand.nextInt(2 + par2);
		for (int var4 = 0; var4 < var3; var4++) {
			dropItem(ItemsDBC.KameBoots1, 1);
		}
		var3 = this.rand.nextInt(2 + par2);
		for (int var4 = 0; var4 < var3; var4++) {
			dropItem(ItemsDBC.ItemPP, 1);
		}
	}
}

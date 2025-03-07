package hedaox.ninjinentities.entities.DBS;

import JinRyuu.DragonBC.common.Items.ItemsDBC;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityCauliflaSsj2 extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityCauliflaSsj2(World par1World) {
		super(par1World, 95, MindState.NEUTRAL, false, true, new byte[]{1, 6}, new byte[]{4, 4}, 255.0F, 217.0F, 25.0F, true);
		this.experienceValue = 80;
		this.setSize(0.45F,1.35F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				22000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				2200.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/cauliflaSsj.png";
	}

	protected void dropFewItems(boolean par1, int par2) {
		int var3 = this.rand.nextInt(2 + par2);
		for (int var4 = 0; var4 < var3; var4++) {
			dropItem(ItemsDBC.ItemsOutfit1[33], 1);
		}
		var3 = this.rand.nextInt(2 + par2);
		for (int var4 = 0; var4 < var3; var4++) {
			dropItem(ItemsDBC.ItemsOutfit2[33], 1);
		}
		var3 = this.rand.nextInt(2 + par2);
		for (int var4 = 0; var4 < var3; var4++) {
			dropItem(ItemsDBC.ItemsOutfit3[33], 1);
		}
	}
}

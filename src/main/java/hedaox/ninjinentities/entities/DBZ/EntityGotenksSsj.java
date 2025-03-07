package hedaox.ninjinentities.entities.DBZ;

import JinRyuu.DragonBC.common.Items.ItemsDBC;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityGotenksSsj extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityGotenksSsj(World par1World) {
		super(par1World, 85, MindState.NEUTRAL, true, true, new byte[]{3, 3, 1, 6}, new byte[]{2, 7, 7, 7}, 255.0F, 217.0F, 25.0F);
		this.experienceValue = 80;
		this.setSize(0.45F,1.35F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				23500.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				23500.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/gotrunksSsj.png";
	}

	protected void dropFewItems(boolean par1, int par2) {
		int var3 = this.rand.nextInt(2 + par2);
		for (int var4 = 0; var4 < var3; var4++) {
			dropItem(ItemsDBC.ItemsOutfit1[17], 1);
		}
		var3 = this.rand.nextInt(2 + par2);
		for (int var4 = 0; var4 < var3; var4++) {
			dropItem(ItemsDBC.ItemsOutfit2[17], 1);
		}
		var3 = this.rand.nextInt(2 + par2);
		for (int var4 = 0; var4 < var3; var4++) {
			dropItem(ItemsDBC.ItemsOutfit3[17], 1);
		}
	}
}

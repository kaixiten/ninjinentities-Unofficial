package hedaox.ninjinentities.entities.DBS;

import JinRyuu.DragonBC.common.Items.ItemsDBC;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityKaleSsj extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityKaleSsj(World par1World) {
		super(par1World, 95, MindState.NEUTRAL, false, false, new byte[]{1, 3, 5, 6}, new byte[]{6, 6, 6, 6}, 162.0F,255.0F,0.0F);
		this.experienceValue = 80;
		this.setSize(0.6F,1.8F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				13000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				1300.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/kaleSsj.png";
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

package hedaox.ninjinentities.entities.DBS;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityBrolySuperSsjL extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityBrolySuperSsjL(World par1World) {
		super(par1World, 100, MindState.AGGRESSIVE, true, true, new byte[]{1, 3, 5, 6}, new byte[]{6, 6, 6, 6});
		this.experienceValue = 80;
		this.setSize(0.75F,2.25F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				160000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				16000.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/brolySuperSsjL.png";
	}
}

package hedaox.ninjinentities.entities.DBS;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.world.World;

public class EntityVegetaZw extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityVegetaZw(World par1World) {
		super(par1World, 85, MindState.NEUTRAL, true, true, new byte[]{1, 2, 3, 4, 5, 6}, new byte[]{3, 3, 3, 3, 3, 3},135.0F, 40.0F, 200.0F, false, true,135.0F, 0.0F, 155.0F);
		this.experienceValue = 80;
		this.setSize(0.8F,2.0F);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/vegetazw.png";
	}
}



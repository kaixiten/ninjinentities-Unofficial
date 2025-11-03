package hedaox.ninjinentities.entities.Movies;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityAbo extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityAbo(World par1World) {
		super(par1World, 0, MindState.AGGRESSIVE, false, false, new byte[]{1}, new byte[]{4});
		this.experienceValue = 80;
		this.setSize(0.57F,1.44F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				5000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				500.0D);
	}

    @Override
    public boolean attackEntityAsMob(Entity target) {
        // 触发攻击动画
        this.swingItem();
        return super.attackEntityAsMob(target);
    }

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/abo.png";
	}
}

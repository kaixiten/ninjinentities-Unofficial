package hedaox.ninjinentities.entities.ZENO;

import JinRyuu.JRMCore.client.config.jrmc.JGConfigClientSettings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.entities.EntityAura;
import hedaox.ninjinentities.lib.ModVars;
import hedaox.ninjinentities.lib.Util;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import java.util.List;

import static hedaox.ninjinentities.entities.DBZ.EntityGokuSsj3.serverTickx;

public class EntityBlockGokuSsjR3 extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityBlockGokuSsjR3(World par1World) {
        super(par1World, 3, MindState.AGGRESSIVE, false, true, new byte[]{3, 1, 5}, new byte[]{3, 3, 3},255.0F, 50.0F, 255.0F, false, true,255.0F, 50.0F, 200.0F);
        this.experienceValue = 80;
        this.angerLevel = 500;
		this.setSize(0.6F,1.8F);
	}
    @SideOnly(Side.CLIENT)
    public void onLivingUpdate() {
        if (this.worldObj.isRemote && JGConfigClientSettings.CLIENT_DA8)
            for (int k = 0; k < JGConfigClientSettings.get_da1(); k++) {
                for (int i = 0; i < 4; i++) {
                    EntityBlockGokuSsjR3 entityGokuSsjR3 = this;
                    EntityAura EntityAura = new EntityAura(this.worldObj, entityGokuSsjR3, 16724735, 1.0F, 0.0F, 0, false);
                    EntityAura.setBolLighting(true);
                    EntityAura.setLightCol(16724735);
                    List<EntityPlayer> players = entityGokuSsjR3.worldObj.getEntitiesWithinAABB(EntityPlayer.class, entityGokuSsjR3.boundingBox.expand(15.0D, 15.0D, 15.0D));
                    for (EntityPlayer p : players) {
                        if (p.getCommandSenderName().equals(Util.mc.thePlayer.getCommandSenderName())) {
                            if (serverTickx >= 13) {
                                EntityAura.worldObj.spawnEntityInWorld(EntityAura);
                                serverTickx = 0;
                                continue;
                            }
                            serverTickx++;
                            continue;
                        }
                        setDead();
                    }
                }
            }
        super.onLivingUpdate();
    }
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				200000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				10000.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/BlockgokuSSJR3.png";
	}
}

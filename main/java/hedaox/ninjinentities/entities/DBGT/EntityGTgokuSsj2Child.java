package hedaox.ninjinentities.entities.DBGT;

import JinRyuu.JRMCore.client.config.jrmc.JGConfigClientSettings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityAura;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.Colors;
import hedaox.ninjinentities.lib.ModVars;
import hedaox.ninjinentities.lib.Util;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import java.util.List;

import static hedaox.ninjinentities.entities.DBZ.EntityGokuSsj3.serverTickx;

public class EntityGTgokuSsj2Child extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityGTgokuSsj2Child(World par1World) {
        super(par1World, 100, MindState.AGGRESSIVE, true, true, new byte[]{3, 3, 1, 6, 5, 2}, new byte[]{2, 2, 2, 2, 2, 7}, 255.0F, 217.0F, 25.0F, true);
        this.experienceValue = 80;
        this.setSize(0.6F,1.8F);
    }
    @SideOnly(Side.CLIENT)
    public void onLivingUpdate() {
        if (this.worldObj.isRemote && JGConfigClientSettings.CLIENT_DA8) {
            for(int k = 0; k < JGConfigClientSettings.get_da1(); ++k) {
                for(int i = 0; i < 4; ++i) {
                    Entity pl = this;
                    EntityAura aura = new EntityAura(this.worldObj, pl, 16767232, 1.0F, 0.0F, 0, false);
                    int clrx = Colors.getRGB(255, 217, 0);
                    aura.setSpd(15);
                    aura.setAlp(0.285F);
                    aura.setCol(clrx);
                    aura.setColL2(16767232);
                    aura.setBolLighting(true);
                    aura.setLightCol(6251715);
                    List<EntityPlayer> players = pl.worldObj.getEntitiesWithinAABB(EntityPlayer.class, pl.boundingBox.expand(15.0, 15.0, 15.0));

                    for (EntityPlayer p : players) {
                        if (p.getCommandSenderName().equals(Util.mc.thePlayer.getCommandSenderName())) {
                            if (serverTickx >= 10) {
                                aura.worldObj.spawnEntityInWorld(aura);
                                serverTickx = 0;
                            } else {
                                ++serverTickx;
                            }
                        } else {
                            this.setDead();
                        }
                    }
                }
            }
        }

        super.onLivingUpdate();
    }

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				20000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				2000.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/GTgokuSsj2.png";
	}
}

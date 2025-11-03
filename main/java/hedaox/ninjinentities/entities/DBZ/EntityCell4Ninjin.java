package hedaox.ninjinentities.entities.DBZ;

import JinRyuu.JRMCore.client.config.jrmc.JGConfigClientSettings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityAura;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.Colors;
import hedaox.ninjinentities.lib.Util;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import java.util.List;

import static hedaox.ninjinentities.entities.DBZ.EntityGokuSsj3.serverTickx;

public class EntityCell4Ninjin extends EntityDBCNinjin {


	public int randomSoundDelay = 0;

	public EntityCell4Ninjin(World par1World) {
		super(par1World, 0, MindState.AGGRESSIVE, false, true, new byte[]{1, 6, 2, 3, 4, 3}, new byte[]{3, 2, 7, 3, 7, 2});
		this.experienceValue = 80;
		this.setSize(0.5F,2.0F);
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
				18500.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				1850.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return "jinryuudragonbc:npcs/cell3.png";
	}
}

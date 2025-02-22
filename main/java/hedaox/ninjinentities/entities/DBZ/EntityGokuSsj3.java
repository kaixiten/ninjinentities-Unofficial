package hedaox.ninjinentities.entities.DBZ;

import JinRyuu.DragonBC.common.Items.ItemsDBC;
import JinRyuu.JRMCore.client.config.jrmc.JGConfigClientSettings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.entities.EntityAura;
import hedaox.ninjinentities.lib.Colors;
import hedaox.ninjinentities.lib.ModVars;
import hedaox.ninjinentities.lib.Util;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import java.util.List;

public class EntityGokuSsj3 extends EntityDBCNinjin {
    public int randomSoundDelay = 0;
    public static int serverTickx = 0;

    public EntityGokuSsj3(World par1World) {
        super(par1World, 85, MindState.AGGRESSIVE, true, true, new byte[]{1, 3, 4, 5, 6}, new byte[]{2, 2, 2, 2, 2}, 255.0F, 217.0F, 25.0F,true);
        this.experienceValue = 80;
        this.setSize(0.6F, 1.8F);
    }

    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(30000.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(3000.0);
    }
    @SideOnly(Side.CLIENT)
    public void onLivingUpdate() {
        if (this.worldObj.isRemote && JGConfigClientSettings.CLIENT_DA8) {
            for(int k = 0; k < JGConfigClientSettings.get_da1(); ++k) {
                for(int i = 0; i < 4; ++i) {
                    Entity pl = this;
                    EntityAura aura = new EntityAura(this.worldObj, pl, 16767232, 1.0F, 0.0F, 0, false);
                    int clrx = Colors.getRGB(255, 217, 0);
                    aura.setSpd(30);
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

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/gokuSsj3.png";
	}

	protected void dropFewItems(boolean par1, int par2) {
		int var3 = this.rand.nextInt(2 + par2);
		for (int var4 = 0; var4 < var3; var4++) {
			dropItem(ItemsDBC.GiFighter1Torso, 1);
		}
		var3 = this.rand.nextInt(2 + par2);
		for (int var4 = 0; var4 < var3; var4++) {
			dropItem(ItemsDBC.GiFighter1Leg, 1);
		}
		var3 = this.rand.nextInt(2 + par2);
		for (int var4 = 0; var4 < var3; var4++) {
			dropItem(ItemsDBC.GiFighter1Boots, 1);
		}
	}
}

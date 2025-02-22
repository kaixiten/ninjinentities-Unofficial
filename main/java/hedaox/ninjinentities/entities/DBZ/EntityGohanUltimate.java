package hedaox.ninjinentities.entities.DBZ;

import JinRyuu.DragonBC.common.Items.ItemsDBC;
import JinRyuu.JRMCore.client.config.jrmc.JGConfigClientSettings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityAura;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import hedaox.ninjinentities.lib.Util;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import java.util.List;

import static hedaox.ninjinentities.entities.DBZ.EntityGokuSsj3.serverTickx;

public class EntityGohanUltimate extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityGohanUltimate(World par1World) {
		super(par1World, 100, MindState.NEUTRAL, true, true, new byte[]{3, 3, 6, 1}, new byte[]{2, 7, 2, 2});
		this.experienceValue = 80;
		this.setSize(0.6F,1.76F);
	}
    @SideOnly(Side.CLIENT)
    public void onLivingUpdate() {
        if (this.worldObj.isRemote && JGConfigClientSettings.CLIENT_DA8)
            for (int k = 0; k < JGConfigClientSettings.get_da1(); k++) {
                for (int i = 0; i < 4; i++) {
                    EntityGohanUltimate entityGokuSsjR3 = this;
                    EntityAura EntityAura = new EntityAura(this.worldObj, entityGokuSsjR3, 14474460, 1.0F, 0.0F, 0, false);
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
				34500.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				3450.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/gohanUltimate.png";
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

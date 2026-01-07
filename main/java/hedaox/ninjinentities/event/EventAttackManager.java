package hedaox.ninjinentities.event;

import JinRyuu.JRMCore.JRMCoreH;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import java.util.List;

public class EventAttackManager {
    private final int slowClient = 0;
    /**
     * Event is launch everytime an entity is hurt. Is use for putting player in KO State if entity is a trainer (Goku, Piccolo, Trunks etc...)
     * <p>
     *
     * @author Hedaox
     */
    @SubscribeEvent
    public void checkHurtEvent(LivingHurtEvent event) {
        try {
            // 安全检查：确保事件和实体不为null
            if(event == null || event.entity == null || event.entity.worldObj.isRemote || event.entityLiving == null) {
                return;
            }

            // Fight against a trainer
            if (event.entity instanceof EntityPlayer) {
                EntityPlayer loadedPlayer = (EntityPlayer) event.entity;
                Entity entityKiller = event.entityLiving.func_94060_bK();

                // 检查攻击者是否存在
                if (entityKiller == null) {
                    return;
                }

                // Trainer beat player
                if (entityKiller instanceof EntityDBCNinjin) {
                    EntityDBCNinjin killerNinjin = (EntityDBCNinjin) entityKiller;

                    // 检查是否为训练师
                    if (killerNinjin.isTrainer) {
                        // 检查玩家身体值
                        int playerBdy = JRMCoreH.getInt(loadedPlayer, "jrmcBdy");
                        if (playerBdy < 10) {
                            // Put Player Health at 10HP
                            JRMCoreH.setInt(10, loadedPlayer, "jrmcBdy");

                            // Put Player in KO State
                            NBTTagCompound nbt = JRMCoreH.nbt(loadedPlayer, "pres");
                            if (nbt != null) { // 检查NBT是否为null
                                byte st = nbt.getByte("jrmcState");
                                byte st2 = nbt.getByte("jrmcState2");
                                byte rc = nbt.getByte("jrmcRace");
                                byte rls = JRMCoreH.getByte(loadedPlayer, "jrmcRelease");
                                int curStam = JRMCoreH.getInt(loadedPlayer, "jrmcStamina");
                                String StE = nbt.getString("jrmcStatusEff");
                                nbt.setInteger("jrmcHar4va", 5);
                                JRMCoreH.setByte(rc == 4 ? 4 : st < 4 ? st : 0, loadedPlayer, "jrmcState");
                                JRMCoreH.setByte(0, loadedPlayer, "jrmcState2");
                                JRMCoreH.setByte(0, loadedPlayer, "jrmcRelease");
                                JRMCoreH.setInt(0, loadedPlayer, "jrmcStamina");
                                StE = JRMCoreH.StusEfcts(19, StE, nbt, false);
                                JRMCoreH.StusEfcts(13, StE, nbt, false);
                            }

                            // Make all Trainers disappear
                            List<EntityDBCNinjin> trainers = entityKiller.worldObj.getEntitiesWithinAABB(EntityDBCNinjin.class,
                                AxisAlignedBB.getBoundingBox(
                                    entityKiller.posX - 100, entityKiller.posY - 100, entityKiller.posZ - 100,
                                    entityKiller.posX + 100, entityKiller.posY + 100, entityKiller.posZ + 100
                                )
                            );

                            for (EntityDBCNinjin trainer : trainers) {
                                if (trainer != null && !trainer.isDead) { // 检查训练师是否为null
                                    trainer.setDead();
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("exception occurred : " + e + " at " + java.util.Arrays.toString(e.getStackTrace()));
        }
    }
}

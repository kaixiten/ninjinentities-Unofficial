package hedaox.ninjinentities.lib;

import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;

public class Util {
    public static Minecraft mc = Minecraft.getMinecraft();

    public Util() {
    }

    public static EntityPlayer getNearbyPlayer(String playername, double range) {
        if (mc.thePlayer != null) {
            List<EntityPlayer> players = mc.thePlayer.worldObj.getEntitiesWithinAABB(EntityPlayer.class, mc.thePlayer.boundingBox.expand(range, range, range));
            for (EntityPlayer p : players) {
                if (p != null && p.getCommandSenderName().equalsIgnoreCase(playername)) {
                    return p;
                }
            }
        }
        return null;
    }
}

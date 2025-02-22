package hedaox.ninjinentities;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;
import hedaox.ninjinentities.command.CommandSummonNinjin;
import hedaox.ninjinentities.entities.NinjinEntities;
import hedaox.ninjinentities.lib.ModVars;
import hedaox.ninjinentities.network.MessageSendEntityToSpark;
import hedaox.ninjinentities.proxy.CommonProxy;
/**
 *  Main class
 *
 * @author Hedaox
 */
@Mod(modid = ModVars.MOD_ID, name = ModVars.MOD_name)
public class Main
{

	@Instance
	public static Main instance = new Main();

	@SidedProxy(clientSide = "hedaox.ninjinentities.proxy.ClientProxy", serverSide = "hedaox.ninjinentities.proxy.ServerProxy")
	public static CommonProxy proxy;

	public static SimpleNetworkWrapper network;

    @EventHandler
    public void preInit(FMLPreInitializationEvent $e) {
    	proxy.preInit($e);
    	NinjinEntities.init();

        network = NetworkRegistry.INSTANCE.newSimpleChannel("MyChannel");

        network.registerMessage(MessageSendEntityToSpark.Handler.class, MessageSendEntityToSpark.class, 0, Side.SERVER);
    }
    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent $e) {
        proxy.postInit($e);
    }

    @EventHandler
    public void serverLoad(FMLServerStartingEvent event) {
        event.registerServerCommand(new CommandSummonNinjin());
    }
}

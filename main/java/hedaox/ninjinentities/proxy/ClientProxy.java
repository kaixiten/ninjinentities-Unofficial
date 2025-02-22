package hedaox.ninjinentities.proxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import hedaox.ninjinentities.rendering.entities.NinjinRenderEntities;

public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent $e) {
        super.preInit($e);
        NinjinRenderEntities.init();
    }
    public void init(FMLInitializationEvent $e)
    {
        super.init($e);

    }
}

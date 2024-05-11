package hedaox.ninjinentities.proxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import hedaox.ninjinentities.rendering.entities.NinjinRenderEntities;

/**
 * Do Things on client side
 * 
 * @author Hedaox
 */

public class ClientProxy extends CommonProxy{
	
    public void preInit(FMLPreInitializationEvent $e) 
    {
    	super.preInit($e);
        
        NinjinRenderEntities.init();
  
    }

    public void init(FMLInitializationEvent $e)
    {
    	super.init($e);
    	
    }

	public void postInit(FMLPostInitializationEvent $e)
    {
    	super.postInit($e);
    	
    }
}

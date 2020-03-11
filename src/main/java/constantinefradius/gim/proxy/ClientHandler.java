package constantinefradius.gim.proxy;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class ClientHandler {

    public static void init() {

    }

    @SubscribeEvent
    public static void setup(FMLClientSetupEvent e) {
        //TODO use for sapling fancy stuff
        //RenderTypeLookup.setRenderLayer(Data.RUBBER_SAPLING, RenderType.getCutout());
        //RenderTypeLookup.setRenderLayer(Data.RUBBER_LEAVES, RenderType.getCutout());
    }
}

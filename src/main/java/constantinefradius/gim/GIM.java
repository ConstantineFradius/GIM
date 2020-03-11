package constantinefradius.gim;

import muramasa.antimatter.AntimatterAPI;
import muramasa.antimatter.datagen.providers.AntimatterAdvancementProvider;
import muramasa.antimatter.datagen.providers.AntimatterBlockStateProvider;
import muramasa.antimatter.datagen.providers.AntimatterItemModelProvider;
import muramasa.antimatter.datagen.providers.AntimatterItemTagProvider;
import muramasa.antimatter.registration.IAntimatterRegistrar;
import muramasa.antimatter.registration.RegistrationEvent;
import muramasa.gti.data.*;
import muramasa.gti.data.advancement.ProgressionAdvancements;
import muramasa.gti.datagen.GregTechBlockTagProvider;
import muramasa.gti.proxy.ClientHandler;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("gim")
@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class GIM implements IAntimatterRegistrar {
    public static final String ID = "gim";
    public static final String NAME = "GIM";

    public static GIM INSTANCE;
    public static Logger LOGGER = LogManager.getLogger(ID);

    public GIM() {
        INSTANCE = this;
        DistExecutor.runWhenOn(Dist.CLIENT, () -> ClientHandler::init);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        AntimatterAPI.addRegistrar(INSTANCE);
    }

    private void setup(final FMLCommonSetupEvent e) {

    }

    @SubscribeEvent
    public static void onDataGather(GatherDataEvent e) {
        DataGenerator gen = e.getGenerator();
        if (e.includeClient()) {
            gen.addProvider(new AntimatterBlockStateProvider(ID, NAME + " BlockStates", gen));
            gen.addProvider(new AntimatterItemModelProvider(ID, NAME + " Item Models", gen));
        }
        if (e.includeServer()) {
            gen.addProvider(new GregTechBlockTagProvider(ID, NAME.concat(" Block Tags"), false, gen));
            gen.addProvider(new AntimatterItemTagProvider(ID, NAME.concat(" Item Tags"), false, gen));
            gen.addProvider(new Recipes(gen));
            gen.addProvider(new AntimatterAdvancementProvider(ID, NAME.concat(" Advancements"), gen, new ProgressionAdvancements()));
            gen.addProvider(new Localizations.en_US(gen));
        }
    }

    @Override
    public String getId() {
        return ID;
    }

    @Override
    public void onRegistrationEvent(RegistrationEvent event) {
        return;
    }
}

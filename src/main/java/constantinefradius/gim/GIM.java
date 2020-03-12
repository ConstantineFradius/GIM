package constantinefradius.gim;

import constantinefradius.gim.common.Data;
import constantinefradius.gim.data.Materials;
import constantinefradius.gim.loaders.WorldGenLoader;
import constantinefradius.gim.proxy.ClientHandler;
import muramasa.antimatter.AntimatterAPI;
import muramasa.antimatter.datagen.providers.*;
import muramasa.antimatter.registration.IAntimatterRegistrar;
import muramasa.antimatter.registration.RegistrationEvent;
import muramasa.antimatter.registration.RegistrationHelper;
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

@Mod(Ref.ID)
@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class GIM implements IAntimatterRegistrar {

    public static GIM INSTANCE;
    public static Logger LOGGER = LogManager.getLogger(Ref.ID);

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
            gen.addProvider(new AntimatterBlockStateProvider(Ref.ID, Ref.NAME + " BlockStates", gen, muramasa.gti.Ref.ID));
            gen.addProvider(new AntimatterItemModelProvider(Ref.ID, Ref.NAME + " Item Models", gen, muramasa.gti.Ref.ID));
        }
        if (e.includeServer()) {
            gen.addProvider(new AntimatterBlockTagProvider(Ref.ID, Ref.NAME.concat(" Block Tags"), false, gen));
            gen.addProvider(new AntimatterItemTagProvider(Ref.ID, Ref.NAME.concat(" Item Tags"), false, gen));
            //gen.addProvider(new Recipes(gen));
            //gen.addProvider(new AntimatterAdvancementProvider(Ref.ID, Ref.NAME.concat(" Advancements"), gen, new ProgressionAdvancements()));
            gen.addProvider(new AntimatterLanguageProvider(Ref.ID, Ref.NAME + " en_us Localization", "en_us", gen));
        }
    }

    @Override
    public String getId() {
        return Ref.ID;
    }

    @Override
    public void onRegistrationEvent(RegistrationEvent event) {
        switch (event) {
            case DATA_INIT:
                Materials.init();
                Data.init();
                break;
            case DATA_BUILD:
                RegistrationHelper.buildDefaultMaterialDerivedObjects(Ref.ID);
                break;
            case WORLDGEN_INIT:
                WorldGenLoader.init();
                break;
        }
    }
}

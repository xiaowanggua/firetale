package com.fg.firetale;

import com.fg.firetale.block.BlockEntityReg;
import com.fg.firetale.block.BlockRegister;
import com.fg.firetale.gui.FitContainerScreen;
import com.fg.firetale.gui.MenuTypeReg;
import com.fg.firetale.item.ItemRegistry;
import com.fg.firetale.worldgen.dimensions.Dimensions;
import com.fg.firetale.worldgen.structure.RegStructure;
import com.mojang.blaze3d.platform.ScreenManager;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

@Mod(firetale.MODID)
public class firetale {
    public static final String MODID="firetale";
    private static final Logger LOGGER = LogManager.getLogger();
    public firetale(){
        IEventBus BUS = FMLJavaModLoadingContext.get().getModEventBus();
        ItemRegistry.ITEMS.register(BUS);
        BlockRegister.BLOCKS.register(BUS);
        BlockEntityReg.BlockEntity.register(BUS);
        MenuTypeReg.FMenuType.register(BUS);
        BUS.addListener(ModSetup::init);
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> BUS.addListener(ClientSetup::init));

    }
}
@Mod.EventBusSubscriber(modid = firetale.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
class ClientSetup {
    public static void init(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            MenuScreens.register(MenuTypeReg.fitGui.get(), FitContainerScreen::new);

        });
    }
}
@Mod.EventBusSubscriber(modid = firetale.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
class ModSetup {
    public static void init(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            Dimensions.register();

        });
    }
}

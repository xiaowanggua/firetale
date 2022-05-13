package com.fg.firetale;

import com.fg.firetale.block.BlockEntityReg;
import com.fg.firetale.block.BlockRegister;
import com.fg.firetale.gui.FitContainerScreen;
import com.fg.firetale.gui.MenuTypeReg;
import com.fg.firetale.item.ItemRegistry;
import com.mojang.blaze3d.platform.ScreenManager;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
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
    }
}

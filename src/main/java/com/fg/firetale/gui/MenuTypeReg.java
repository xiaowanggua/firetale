package com.fg.firetale.gui;

import com.fg.firetale.firetale;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MenuTypeReg {
    public static final DeferredRegister<MenuType<?>> FMenuType=DeferredRegister.create(ForgeRegistries.CONTAINERS, firetale.MODID);
    public static final RegistryObject<MenuType<FitContainer>> fitGui = FMenuType.register("fit_container",()-> IForgeMenuType.create((int var1, Inventory var2, FriendlyByteBuf var3)->new FitContainer(var1,var2,var3.readBlockPos(), var2.player)));
}

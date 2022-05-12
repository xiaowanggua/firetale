package com.fg.firetale.gui;

import com.fg.firetale.firetale;
import net.minecraft.client.Minecraft;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MenuTypeReg {
    public static final DeferredRegister<MenuType<?>> FMenuType=DeferredRegister.create(ForgeRegistries.CONTAINERS, firetale.MODID);
    public static final RegistryObject<MenuType<FitContainer>> fitGui = FMenuType.register("fit_container",()-> IForgeMenuType.create((int var1, Inventory var2, FriendlyByteBuf var3)->new FitContainer(var1,var2,var3.readBlockPos(), Minecraft.getInstance().level)));

}
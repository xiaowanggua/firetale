package com.fg.firetale.item;


import com.fg.firetale.block.BlockRegister;
import com.fg.firetale.firetale;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, firetale.MODID);
    //Items
    public static final RegistryObject<Item> fireOre = ITEMS.register("fire_core",FireCore::new);
    //BlockItems
    public static final RegistryObject<Item> darkStone = ITEMS.register("dark_stone",()->new BlockItem(BlockRegister.darkStone.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
}

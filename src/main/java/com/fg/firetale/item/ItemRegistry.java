package com.fg.firetale.item;


import com.fg.firetale.block.BlockRegister;
import com.fg.firetale.firetale;
import com.fg.firetale.tab.ModTab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, firetale.MODID);
    //Items
    public static final RegistryObject<Item> fireCore = ITEMS.register("fire_core",FireCore::new);
    //BlockItems
    public static final RegistryObject<Item> darkStone = ITEMS.register("dark_stone",()->new BlockItem(BlockRegister.darkStone.get(), new Item.Properties().tab(ModTab.fireTab)));
    public static final RegistryObject<Item> fireIntensifyTable = ITEMS.register("fire_intensifytable",()->new BlockItem(BlockRegister.fireIntensifyTable.get(), new Item.Properties().tab(ModTab.fireTab)));
    public static final RegistryObject<Item> blockOfFanqieqwq = ITEMS.register("block_of_fanqieqwq",()->new BlockItem(BlockRegister.blockOfFanqieqwq.get(),new Item.Properties().tab(ModTab.fireTab)));
}

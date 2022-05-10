package com.fg.firetale.item;

import com.fg.firetale.tab.ModTab;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;



public class FireCore extends Item{
    public FireCore()
    {
        super(new Item.Properties().stacksTo(16).tab(ModTab.fireTab));
    }
}

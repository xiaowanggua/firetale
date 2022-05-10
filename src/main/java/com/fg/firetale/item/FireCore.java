package com.fg.firetale.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;


public class FireCore extends Item{
    public FireCore()
    {
        super(new Item.Properties().stacksTo(16).tab(CreativeModeTab.TAB_MISC));
    }
}

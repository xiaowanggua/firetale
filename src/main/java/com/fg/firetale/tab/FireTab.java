package com.fg.firetale.tab;

import com.fg.firetale.item.ItemRegistry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class FireTab extends CreativeModeTab {

    public FireTab() {
        super("firetale_tab");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemRegistry.fireCore.get());
    }
}

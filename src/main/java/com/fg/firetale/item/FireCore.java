package com.fg.firetale.item;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class FireCore {
    public FireCore()
    {
        IEventBus modbus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemRegistry.ITEMS.register(modbus);
    }
}

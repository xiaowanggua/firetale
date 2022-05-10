package com.fg.firetale.data;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

public class DataGen {
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public class DataGenEvent{
        @SubscribeEvent
        public static void dataGen(GatherDataEvent event){

        }
    }
}

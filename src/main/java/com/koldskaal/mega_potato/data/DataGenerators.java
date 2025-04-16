package com.koldskaal.mega_potato.data;

import com.koldskaal.mega_potato.MegaPotatoMod;
import com.koldskaal.mega_potato.data.lang.ModEnLangProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;
//@EventBusSubscriber(modid = MegaPotatoMod.MODID, bus = EventBusSubscriber.Bus.MOD)
//public class DataGenerators {
//    @SubscribeEvent
//    public static void gatherData(GatherDataEvent event) {
//        try {
//            DataGenerator generator = event.getGenerator();
//            PackOutput output = generator.getPackOutput();
//
//            generator.addProvider(true, new ModEnLangProvider(output));
//
//        } catch (RuntimeException e) {
//            MegaPotatoMod.LOGGER.error("Failed to generate data for mega potato", e);
//        }
//    }
//}

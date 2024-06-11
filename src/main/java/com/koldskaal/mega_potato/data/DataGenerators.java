package com.koldskaal.mega_potato.data;
import com.koldskaal.mega_potato.MegaPotatoMod;
import com.koldskaal.mega_potato.data.lang.ModEnLangProvider;
import com.koldskaal.mega_potato.data.texture.ModBlockProvider;
import com.koldskaal.mega_potato.data.texture.ModBlockstateProvider;
import com.koldskaal.mega_potato.data.texture.ModItemStateProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

public class DataGenerators {
    public static void gatherData(GatherDataEvent event) {
        try {
            DataGenerator generator = event.getGenerator();
            PackOutput output = event.getGenerator().getPackOutput();
            ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

            generator.addProvider(true, new ModEnLangProvider(output));
            generator.addProvider(true, new ModItemStateProvider(output, existingFileHelper));
            generator.addProvider(true, new ModBlockProvider(output, existingFileHelper));
            generator.addProvider(true, new ModBlockstateProvider(output, existingFileHelper));

        } catch (RuntimeException e) {
            MegaPotatoMod.LOGGER.error("Failed to generate data for mega potato", e);
        }
    }
}

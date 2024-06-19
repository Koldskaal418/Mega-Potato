package com.koldskaal.mega_potato;

import com.koldskaal.mega_potato.block.BlockOfPotatoAsh;
import com.koldskaal.mega_potato.core.init.ItemInit;
import com.koldskaal.mega_potato.creative_tabs.MegaPotatoCreativeTab;
import com.koldskaal.mega_potato.data.DataGenerators;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(MegaPotatoMod.MODID)
public class MegaPotatoMod {
    public static final String MODID = "mega_potato";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public MegaPotatoMod(IEventBus modEventBus) {
        modEventBus.addListener(DataGenerators::gatherData);

        ItemInit.ITEMS.register(modEventBus);
        BlockOfPotatoAsh.BLOCKS.register(modEventBus);
        MegaPotatoCreativeTab.CREATIVE_MODE_TABS.register(modEventBus);
    }
}


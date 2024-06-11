package com.koldskaal.mega_potato.util;

import com.koldskaal.mega_potato.MegaPotatoMod;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class NameUtility {
    public static String getItemName(Item item) {
        return BuiltInRegistries.ITEM.getKey(item).toString().replace( MegaPotatoMod.MODID + ":", "");
    }

    public static String getBlockName(Block block){
        return BuiltInRegistries.BLOCK.getKey(block).toString().replace(MegaPotatoMod.MODID + ":", "");
    }
}

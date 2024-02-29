package com.koldskaal.mega_potato.util;

import com.koldskaal.mega_potato.MegaPotatoMod;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;

public class NameUtility {
    public static String getItemName(Item item) {
        return BuiltInRegistries.ITEM.getKey(item).toString().replace( MegaPotatoMod.MODID + ":", "");
    }
}

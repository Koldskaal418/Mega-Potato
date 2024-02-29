package com.koldskaal.mega_potato.core.init;

import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import static com.koldskaal.mega_potato.MegaPotatoMod.*;

public class ItemInit {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredItem<Item> TESTER_ITEM = ITEMS.register("tester_item",() -> new Item(new Item.Properties()));
}

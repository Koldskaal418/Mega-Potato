package com.koldskaal.mega_potato.core.init;

import com.koldskaal.mega_potato.item.PotatoToolItem;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.koldskaal.mega_potato.MegaPotatoMod.MODID;

public class ItemInit {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);
    public static final DeferredItem<Item> POTATO_HAMMER_ITEM = ITEMS.registerItem(
            "potato_hammer",
            PotatoToolItem::new,
            new Item.Properties().stacksTo(1));
    public static final DeferredItem<Item> POTATO_SQUEEZER_ITEM = ITEMS.registerItem(
            "potato_squeezer",
            PotatoToolItem::new,
            new Item.Properties().stacksTo(1)
    );
    public static final DeferredItem<Item> BIG_POTATO_ITEM = ITEMS.registerItem(
            "big_potato",
            Item::new,
            new Item.Properties().stacksTo(32));
    public static final DeferredItem<Item> MASSIVE_POTATO_ITEM = ITEMS.registerItem(
            "massive_potato",
            Item::new,
            new Item.Properties().stacksTo(16)
    );
    public static final DeferredItem<Item> POTATO_DUST_ITEM = ITEMS.registerItem(
            "potato_dust",
            Item::new,
            new Item.Properties()
    );
    public static final DeferredItem<Item> POTATO_ASH_ITEM = ITEMS.registerItem(
            "potato_ash",
            Item::new,
            new Item.Properties()
    );
    public static final DeferredItem<Item> TALL_POTATO_ITEM = ITEMS.registerItem(
            "tall_potato",
            Item::new,
            new Item.Properties().stacksTo(16)
    );
    public static final DeferredItem<Item> SKINNY_POTATO_ITEM = ITEMS.registerItem(
            "skinny_potato",
            Item::new,
            new Item.Properties().stacksTo(16)
    );
    public static final DeferredItem<Item> FLAT_POTATO_ITEM = ITEMS.registerItem(
            "flat_potato",
            Item::new,
            new Item.Properties().stacksTo(16)
    );
    public static final DeferredItem<Item> FAT_POTATO_ITEM = ITEMS.registerItem(
            "fat_potato",
            Item::new,
            new Item.Properties().stacksTo(16)
    );
    public static final DeferredItem<Item> STRETCHED_POTATO_ITEM = ITEMS.registerItem(
            "stretched_potato",
            Item::new,
            new Item.Properties().stacksTo(8)
    );
    public static final DeferredItem<Item> HAMMERED_POTATO_ITEM = ITEMS.registerItem(
            "hammered_potato",
            Item::new,
            new Item.Properties().stacksTo(8)
    );
    public static final DeferredItem<Item> POTATO_SHELL_ITEM = ITEMS.registerItem(
            "potato_shell",
            Item::new,
            new Item.Properties().stacksTo(8)
    );
    public static final DeferredItem<Item> POTATO_CORE_ITEM = ITEMS.registerItem(
            "potato_core",
            Item::new,
            new Item.Properties().stacksTo(8)
    );
    public static final DeferredItem<Item> BIG_BAKED_POTATO_ITEM = ITEMS.registerItem(
            "big_baked_potato",
            Item::new,
            new Item.Properties().
                    food(new FoodProperties.Builder().nutrition(15).saturationMod(0.5f).build())
                    .stacksTo(32)
    );
    public static final DeferredItem<Item> MEGA_POTATO_ITEM = ITEMS.registerItem(
            "mega_potato",
            Item::new,
            new Item.Properties().stacksTo(1)
    );
}

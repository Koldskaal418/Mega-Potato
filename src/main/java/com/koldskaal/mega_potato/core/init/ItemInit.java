package com.koldskaal.mega_potato.core.init;

import com.koldskaal.mega_potato.MegaPotatoMod;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import com.koldskaal.mega_potato.item.PotatoToolItem;

import static com.koldskaal.mega_potato.MegaPotatoMod.MODID;

public class ItemInit {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);
    public static final DeferredItem<Item> POTATO_HAMMER_ITEM = ITEMS.registerItem(
            "potatohammer",
            PotatoToolItem::new,
            new Item.Properties().stacksTo(1));
    public static final DeferredItem<Item> POTATO_SQUEEZER_ITEM = ITEMS.registerItem(
            "potatosqueezer",
            PotatoToolItem::new,
            new Item.Properties().stacksTo(1)
    );
    public static final DeferredItem<Item> BIG_POTATO_ITEM = ITEMS.registerItem(
            "bigpotato",
            Item::new,
            new Item.Properties().stacksTo(32));
    public static final DeferredItem<Item> MASSIVE_POTATO_ITEM = ITEMS.registerItem(
            "massivepotato",
            Item::new,
            new Item.Properties().stacksTo(16)
    );
    public static final DeferredItem<Item> POTATO_DUST_ITEM = ITEMS.registerItem(
            "potatodust",
            Item::new,
            new Item.Properties()
    );
    public static final DeferredItem<Item> POTATO_ASH_ITEM = ITEMS.registerItem(
            "potatoash",
            Item::new,
            new Item.Properties()
    );
    public static final DeferredItem<Item> TALL_POTATO_ITEM = ITEMS.registerItem(
            "tallpotato",
            Item::new,
            new Item.Properties().stacksTo(16)
    );
    public static final DeferredItem<Item> SKINNY_POTATO_ITEM = ITEMS.registerItem(
            "skinnypotato",
            Item::new,
            new Item.Properties().stacksTo(16)
    );
    public static final DeferredItem<Item> FLAT_POTATO_ITEM = ITEMS.registerItem(
            "flatpotato",
            Item::new,
            new Item.Properties().stacksTo(16)
    );
    public static final DeferredItem<Item> FAT_POTATO_ITEM = ITEMS.registerItem(
            "fatpotato",
            Item::new,
            new Item.Properties().stacksTo(16)
    );
    public static final DeferredItem<Item> STRETCHED_POTATO_ITEM = ITEMS.registerItem(
            "stretchedpotato",
            Item::new,
            new Item.Properties().stacksTo(8)
    );
    public static final DeferredItem<Item> HAMMERED_POTATO_ITEM = ITEMS.registerItem(
            "hammeredpotato",
            Item::new,
            new Item.Properties().stacksTo(8)
    );
    public static final DeferredItem<Item> POTATO_SHELL_ITEM = ITEMS.registerItem(
            "potatoshell",
            Item::new,
            new Item.Properties().stacksTo(8)
    );
    public static final DeferredItem<Item> POTATO_CORE_ITEM = ITEMS.registerItem(
            "potatocore",
            Item::new,
            new Item.Properties().stacksTo(8)
    );
    public static final DeferredItem<Item> BIG_BAKED_POTATO_ITEM = ITEMS.registerItem(
            "bigbakedpotato",
            Item::new,
            new Item.Properties().
                    food(new FoodProperties.Builder().nutrition(15).saturationMod(0.5f).build())
                    .stacksTo(32)
    );
    public static final DeferredItem<Item> MEGA_POTATO_ITEM = ITEMS.registerItem(
            "megapotato",
            Item::new,
            new Item.Properties().stacksTo(1)
    );
}

package com.koldskaal.mega_potato.data.lang;

import com.koldskaal.mega_potato.MegaPotatoMod;
import com.koldskaal.mega_potato.block.BlockOfPotatoAsh;
import com.koldskaal.mega_potato.core.init.ItemInit;
import com.koldskaal.mega_potato.creative_tabs.MegaPotatoCreativeTab;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ModEnLangProvider extends LanguageProvider {
    public ModEnLangProvider(PackOutput output) {
        super(output, MegaPotatoMod.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        addItem(ItemInit.BIG_POTATO_ITEM, "Big Potato");
        addItem(ItemInit.MASSIVE_POTATO_ITEM, "Massive Potato");
        addBlock(BlockOfPotatoAsh.BLOCK_OF_POTATO_ASH, "Block of Potato Ash");
        addItem(ItemInit.POTATO_HAMMER_ITEM, "Potato Hammer");
        addItem(ItemInit.POTATO_SQUEEZER_ITEM, "Potato Squeezer");
        addItem(ItemInit.POTATO_DUST_ITEM, "Potato Dust");
        addItem(ItemInit.POTATO_ASH_ITEM, "Potato Ash");
        addItem(ItemInit.TALL_POTATO_ITEM, "Tall Potato");
        addItem(ItemInit.SKINNY_POTATO_ITEM, "Skinny Potato");
        addItem(ItemInit.FLAT_POTATO_ITEM, "Flat Potato");
        addItem(ItemInit.FAT_POTATO_ITEM, "Fat Potato");
        addItem(ItemInit.STRETCHED_POTATO_ITEM, "Stretched Potato");
        addItem(ItemInit.HAMMERED_POTATO_ITEM, "Hammered Potato");
        addItem(ItemInit.POTATO_SHELL_ITEM, "Potato Shell");
        addItem(ItemInit.POTATO_CORE_ITEM, "Potato Core");
        addItem(ItemInit.BIG_BAKED_POTATO_ITEM, "Big Baked Potato");
        addItem(ItemInit.MEGA_POTATO_ITEM, "Mega Potato");
        add(MegaPotatoCreativeTab.getTranslatableID(), "Mega Potato");
        add("advancements.mega_potato.title", "Mega!");
        add("advancements.mega_potato.desc", "Accumulate all your potato brain power to acquire the ultimate potato");
        add("advancements.mega_potato_root.title", "Mega Potato");
        add("advancements.mega_potato_root.desc", "The biggest of potatoes");
        add("advancements.potato.title", "The Start Of Something Mega");
        add("advancements.potato.desc", "Gather your first potato to start a mega crafting adventure");
        add("advancements.big_potato.title", "Bigger Potatoes");
        add("advancements.big_potato.desc", "Turn your first potatoes into bigger potatoes");
        add("advancements.massive_potato.title", "Massive Potatoes");
        add("advancements.massive_potato.desc", "Gather even more potatoes to craft this majestic potato");
        add("advancements.big_baked_potato.title", "Hot Potato");
        add("advancements.big_baked_potato.desc", "Set flames to one of your smaller potatoes");
        add("advancements.hammer.title", "Hammer Time!");
        add("advancements.hammer.desc", "Craft a chunky potato tool");
        add("advancements.fat_potato.title", "Fat Boi!");
        add("advancements.fat_potato.desc", "Use your newly acquired chunky potato tool to smack your potatoes");
        add("advancements.potato_shell.title", "Flat As Paper");
        add("advancements.potato_shell.desc", "Stretch your potatoes as much as you can to obtain the flattest of potatoes");
        add("advancements.squeezer.title", "Squeezer");
        add("advancements.squeezer.desc", "Craft a weird looking potato tool");
        add("advancements.skinny_potato.title", "Skinny Boi!");
        add("advancements.skinny_potato.desc", "Use your weird potato tool to make the potatoes lose weight");
        add("advancements.potato_core.title", "The Inner Potato");
        add("advancements.potato_core.desc", "Craft the purest of all potatoes");
        add("advancements.potato_ash.title", "Burn!");
        add("advancements.potato_ash.desc", "Set flames to one of your larger potatoes");
    }
}

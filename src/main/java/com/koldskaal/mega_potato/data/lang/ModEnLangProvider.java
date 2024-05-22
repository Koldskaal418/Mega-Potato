package com.koldskaal.mega_potato.data.lang;

import com.koldskaal.mega_potato.MegaPotatoMod;
import com.koldskaal.mega_potato.block.BlockOfPotatoAshBlock;
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
        addBlock(BlockOfPotatoAshBlock.BLOCK_OF_POTATO_ASH, "Block of Potato Ash");
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
        add("advancements.megapotatoadvancement.title", "Mega Potato");
        add("advancements.megapotatoadvancement.desc", "Mega Potato Description TODO");
    }
}

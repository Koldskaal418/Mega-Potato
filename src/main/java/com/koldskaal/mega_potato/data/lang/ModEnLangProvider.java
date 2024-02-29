package com.koldskaal.mega_potato.data.lang;

import com.koldskaal.mega_potato.MegaPotatoMod;
import com.koldskaal.mega_potato.block.BlockOfPotatoAshBlock;
import com.koldskaal.mega_potato.core.init.ItemInit;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ModEnLangProvider extends LanguageProvider {
    public ModEnLangProvider(PackOutput output) {
        super(output, MegaPotatoMod.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        addItem(ItemInit.TESTER_ITEM, "Tester Item");
        addItem(ItemInit.BIG_POTATO_ITEM, "Big Potato");
        addBlock(BlockOfPotatoAshBlock.BLOCK_OF_POTATO_ASH, "Block of Potato Ash");
    }
}

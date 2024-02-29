package com.koldskaal.mega_potato.data.texture;

import com.koldskaal.mega_potato.MegaPotatoMod;
import com.koldskaal.mega_potato.core.init.ItemInit;
import com.koldskaal.mega_potato.util.NameUtility;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemStateProvider extends ItemModelProvider {
    public ModItemStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MegaPotatoMod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        item(ItemInit.TESTER_ITEM.get());
        item(ItemInit.BIG_POTATO_ITEM.get());
    }
   private void item(Item item) {
        String name = NameUtility.getItemName(item);
        getBuilder(name)
                .parent(getExistingFile(mcLoc("item/generated")))
                .texture("layer0", "item/" + name);
   }
}

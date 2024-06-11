package com.koldskaal.mega_potato.data.texture;

import com.koldskaal.mega_potato.MegaPotatoMod;
import com.koldskaal.mega_potato.block.BlockOfPotatoAsh;
import com.koldskaal.mega_potato.core.init.ItemInit;
import com.koldskaal.mega_potato.util.NameUtility;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemStateProvider extends ItemModelProvider {
    public ModItemStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MegaPotatoMod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        item(ItemInit.BIG_POTATO_ITEM.get());
        item(ItemInit.MASSIVE_POTATO_ITEM.get());
        item(ItemInit.POTATO_HAMMER_ITEM.get());
        item(ItemInit.POTATO_SQUEEZER_ITEM.get());
        item(ItemInit.POTATO_DUST_ITEM.get());
        item(ItemInit.POTATO_ASH_ITEM.get());
        item(ItemInit.TALL_POTATO_ITEM.get());
        item(ItemInit.SKINNY_POTATO_ITEM.get());
        item(ItemInit.FLAT_POTATO_ITEM.get());
        item(ItemInit.FAT_POTATO_ITEM.get());
        item(ItemInit.STRETCHED_POTATO_ITEM.get());
        item(ItemInit.HAMMERED_POTATO_ITEM.get());
        item(ItemInit.POTATO_SHELL_ITEM.get());
        item(ItemInit.POTATO_CORE_ITEM.get());
        item(ItemInit.BIG_BAKED_POTATO_ITEM.get());
        item(ItemInit.MEGA_POTATO_ITEM.get());
        block(BlockOfPotatoAsh.BLOCK_OF_POTATO_ASH.get());
    }
   private void item(Item item) {
        String name = NameUtility.getItemName(item);
        getBuilder(name)
                .parent(getExistingFile(mcLoc("item/generated")))
                .texture("layer0", "item/" + name);
   }

   private void block(Block block){
        String name = NameUtility.getBlockName(block);
        getBuilder(name)
                .parent(getExistingFile(mcLoc("block/cube")))
                .texture("down","block/" + name)
                .texture("up", "block/" + name)
                .texture("east", "block/" + name)
                .texture("west", "block/" + name)
                .texture("north", "block/" + name)
                .texture("south", "block/" + name)
                .texture("particle", "block/" + name)
                .renderType("solid");

   }
}

package com.koldskaal.mega_potato.data.texture;

import com.koldskaal.mega_potato.MegaPotatoMod;
import com.koldskaal.mega_potato.block.BlockOfPotatoAsh;
import com.koldskaal.mega_potato.util.NameUtility;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModBlockProvider extends BlockModelProvider {
    public ModBlockProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MegaPotatoMod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        block(BlockOfPotatoAsh.BLOCK_OF_POTATO_ASH.get());
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

package com.koldskaal.mega_potato.data.texture;

import com.koldskaal.mega_potato.MegaPotatoMod;
import com.koldskaal.mega_potato.block.BlockOfPotatoAsh;
import com.koldskaal.mega_potato.util.NameUtility;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModBlockstateProvider extends BlockStateProvider {
    public ModBlockstateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MegaPotatoMod.MODID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        block(BlockOfPotatoAsh.BLOCK_OF_POTATO_ASH.get());
    }
   private void block(Block block){
        simpleBlock(block);
   }


}

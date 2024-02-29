package com.koldskaal.mega_potato;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.koldskaal.mega_potato.MegaPotatoMod.ITEMS;
import static com.koldskaal.mega_potato.MegaPotatoMod.MODID;


public class MegaPotatoModRegistration {
//    // Create a Deferred Register to hold Blocks which will all be registered under the "mega_potato" namespace
//    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
//    //BLOCKS is a DeferredRegister.Blocks
//    // Creates a new Block with the id "mega_potato:test_block", combining the namespace and path
//    public static final DeferredBlock<Block> TEST_BLOCK = BLOCKS.registerSimpleBlock("test_block", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
//    // Creates a new BlockItem with the id "mega_potato:test_block", combining the namespace and path
//    public static final DeferredItem<BlockItem> TEST_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("test_block", TEST_BLOCK);
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
}
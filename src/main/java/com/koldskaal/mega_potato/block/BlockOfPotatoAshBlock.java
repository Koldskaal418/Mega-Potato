package com.koldskaal.mega_potato.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.koldskaal.mega_potato.MegaPotatoMod.*;


public class BlockOfPotatoAshBlock {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredBlock<Block> BLOCK_OF_POTATO_ASH = BLOCKS.registerSimpleBlock("block_of_potato_ash", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredItem<BlockItem> BLOCK_OF_POTATO_ASH_ITEM = ITEMS.registerSimpleBlockItem("block_of_potato_ash", BLOCK_OF_POTATO_ASH);
}

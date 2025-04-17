package com.koldskaal.mega_potato.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.koldskaal.mega_potato.MegaPotatoMod.MODID;
import static com.koldskaal.mega_potato.core.init.ItemInit.ITEMS;


public class BlockOfPotatoAsh {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);


    public static final DeferredBlock<FallingBlock> BLOCK_OF_POTATO_ASH = BLOCKS.register(
            "potato_ash_block", registryName -> new FallingBlock(
                    BlockBehaviour.Properties.of()
                            .setId(ResourceKey.create(Registries.BLOCK, registryName))
                            .ignitedByLava()
                            .strength(0.25f, 0.1f)
                            .sound(SoundType.SAND)
            ) {
                @Override
                protected MapCodec<? extends FallingBlock> codec() {
                    return null;
                }
            }
            );
    public static final DeferredItem<BlockItem> BLOCK_OF_POTATO_ASH_ITEM = ITEMS.registerSimpleBlockItem("potato_ash_block", BLOCK_OF_POTATO_ASH);
}

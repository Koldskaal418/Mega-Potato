package com.koldskaal.mega_potato.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

import static com.koldskaal.mega_potato.MegaPotatoMod.MODID;
import static com.koldskaal.mega_potato.core.init.ItemInit.ITEMS;


public class BlockOfPotatoAsh extends FallingBlock {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final MapCodec<BlockOfPotatoAsh> CODEC = simpleCodec(BlockOfPotatoAsh::new);
    @Override
    protected @NotNull MapCodec<? extends FallingBlock> codec() {
        return CODEC;
    }
    public BlockOfPotatoAsh(Properties pProperties) {
        super(pProperties);
    }


    public static final DeferredBlock<FallingBlock> BLOCK_OF_POTATO_ASH = BLOCKS.register(
            "potato_ash_block",
            () -> new FallingBlock(BlockBehaviour.Properties.of()
                    .ignitedByLava()
                    .strength(0.25f, 0.1f)
                    .sound(SoundType.GRAVEL)
            ) {
                @Override
                protected @NotNull MapCodec<? extends FallingBlock> codec() {
                    return BlockOfPotatoAsh.CODEC;
                }
            });
    public static final DeferredItem<BlockItem> BLOCK_OF_POTATO_ASH_ITEM = ITEMS.registerSimpleBlockItem("potato_ash_block", BLOCK_OF_POTATO_ASH);
}

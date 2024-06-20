package com.koldskaal.mega_potato.creative_tabs;

import com.koldskaal.mega_potato.block.BlockOfPotatoAsh;
import com.koldskaal.mega_potato.core.init.ItemInit;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.koldskaal.mega_potato.MegaPotatoMod.MODID;


public class MegaPotatoCreativeTab {
    private static final String translateID = "creativetab." + MODID + ".mega_potato";
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);
    public static final Supplier<CreativeModeTab> MEGA_POTATO_TAB = CREATIVE_MODE_TABS.register("mega_potato", () -> CreativeModeTab.builder()
            //Don't forget to add a translation!
            .title(Component.translatable(translateID))
            .icon(() -> new ItemStack(ItemInit.BIG_POTATO_ITEM.get()))
            .displayItems((params, output) -> {
                output.accept(ItemInit.POTATO_SQUEEZER_ITEM.get());
                output.accept(ItemInit.POTATO_HAMMER_ITEM.get());
                output.accept(ItemInit.BIG_POTATO_ITEM.get());
                output.accept(ItemInit.MASSIVE_POTATO_ITEM.get());
                output.accept(ItemInit.TALL_POTATO_ITEM.get());
                output.accept(ItemInit.SKINNY_POTATO_ITEM.get());
                output.accept(ItemInit.HAMMERED_POTATO_ITEM.get());
                output.accept(ItemInit.POTATO_CORE_ITEM.get());
                output.accept(ItemInit.FLAT_POTATO_ITEM.get());
                output.accept(ItemInit.FAT_POTATO_ITEM.get());
                output.accept(ItemInit.STRETCHED_POTATO_ITEM.get());
                output.accept(ItemInit.POTATO_SHELL_ITEM.get());
                output.accept(ItemInit.MEGA_POTATO_ITEM.get());
                output.accept(ItemInit.BIG_BAKED_POTATO_ITEM.get());
                output.accept(ItemInit.POTATO_DUST_ITEM.get());
                output.accept(ItemInit.POTATO_ASH_ITEM.get());
                output.accept(BlockOfPotatoAsh.BLOCK_OF_POTATO_ASH.get());
            })
            .build()
    );
    public static String getTranslatableID(){
        return translateID;
    }
}

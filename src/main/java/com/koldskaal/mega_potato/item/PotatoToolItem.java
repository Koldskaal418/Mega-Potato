package com.koldskaal.mega_potato.item;


import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class PotatoToolItem extends Item {
    public PotatoToolItem(Item.Properties properties) {
        super(properties);
    }

    @Override
    public boolean hasCraftingRemainingItem(@NotNull ItemStack stack) {
        return true;
    }

    @Override
    public @NotNull ItemStack getCraftingRemainingItem(ItemStack stack) {
        return stack.copy();
    }
}

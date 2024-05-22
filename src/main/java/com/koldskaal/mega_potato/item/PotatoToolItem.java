package com.koldskaal.mega_potato.item;


import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class PotatoToolItem extends Item {
    public PotatoToolItem(Item.Properties properties) {
        super(properties);
    }

    @Override
    public boolean hasCraftingRemainingItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack stack) {
        return stack.copy();
    }
}

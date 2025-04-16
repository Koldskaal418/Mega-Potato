package com.koldskaal.mega_potato.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class PotatoToolItem extends Item {
    public PotatoToolItem(Item.Properties properties) {
        super(properties);
    }
    @Override
    public ItemStack getCraftingRemainder(ItemStack itemStack) {
        return itemStack.copy();
    }
}

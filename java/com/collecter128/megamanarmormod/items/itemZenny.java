package com.collecter128.megamanarmormod.items;

import javax.annotation.Nonnull;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


public class itemZenny extends Item{

	
	
	public itemZenny(Properties properties) {
		super(properties);
		
	}
	
	@Override
    public boolean isPiglinCurrency(@Nonnull ItemStack stack) {
        return true;
    }

}

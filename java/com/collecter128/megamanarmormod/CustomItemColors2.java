package com.collecter128.megamanarmormod.core;

import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.item.IDyeableArmorItem;
import net.minecraftforge.client.event.ColorHandlerEvent;

public class CustomItemColors2 extends ColorHandlerEvent.Item{//extends ColorHandlerEvent.Item

	public CustomItemColors2(ItemColors itemColors, BlockColors blockColors) {
		super(itemColors, blockColors);
		
		itemColors.register((stack, color) -> {
	          return color > 0 ? -1 : ((IDyeableArmorItem)stack.getItem()).getColor(stack);
	       }, ItemInit.MainColorColorizer.get(), ItemInit.SecondaryColorColorizer.get()    );
	}

	
}

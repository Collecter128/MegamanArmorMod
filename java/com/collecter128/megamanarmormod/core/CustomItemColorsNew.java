package com.collecter128.megamanarmormod.core;

import com.collecter128.megamanarmormod.items.ArmorColorizerCustom;

import net.minecraft.client.renderer.color.ItemColors;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.registries.ForgeRegistries;

public class CustomItemColorsNew {

	public static void registerItemColor(ColorHandlerEvent.Item event) {
		//event.getItemColors().register(ArmorColorizerCustom::getItemColor(), ItemInit.MainColorColorizer.get());
		//event.getItemColors().register(item.getItemColors(), ItemInit.MainColorColorizer.get());
		//event.getItemColors().register(ItemColors::registerItemColorHandler, null);
		
//		ItemColors itemColors = event.getItemColors();
		
//		ForgeRegistries.ITEMS.getValues().stream()
//        .filter(item -> item instanceof ArmorColorizerCustom)
//        .map(item -> (ArmorColorizerCustom) item)
//        .forEach(item -> itemColors.register(item.getColors(), item));
		
//		ForgeRegistries.ITEMS.getValues().stream()
//        .filter(item -> item instanceof ArmorColorizerCustom)
//        .map(item -> (ArmorColorizerCustom) item)
//        .forEach(item -> itemColors.register(item.getColors(), item));
		
	}
}

package com.collecter128.megamanarmormod.core;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class CustomItemRenderer {

	//This is from the dyable clothes mod by cheller
	//https://www.curseforge.com/minecraft/mc-mods/dyeable-clothes
	
	public static void registerItemRenderer() {
		reg(ItemInit.AtomicfireColorizer.get());

	}

	public static void reg(Item item) {
		Minecraft
				//.getMinecraft()
				.getInstance().getItemRenderer()//.getRenderItem()
				.getItemModelMesher()
				.register(
						item,
						new ModelResourceLocation("megamanarmormod:"
								+ item.getRegistryName(),//.getUnlocalizedName().substring(5)   .getString
								"inventory"));
		//item.;
	}

	public static void reg(Item item, String file) {
		Minecraft
		.getInstance().getItemRenderer()//.getRenderItem()
		.getItemModelMesher()
				.register(
						item,
						new ModelResourceLocation("megamanarmormod:"
								+ file, "inventory"));
	}
	
}

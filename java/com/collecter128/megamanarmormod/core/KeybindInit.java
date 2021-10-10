package com.collecter128.megamanarmormod.core;

import java.awt.event.KeyEvent;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@OnlyIn(Dist.CLIENT)
public class KeybindInit {
	
	public static KeyBinding Dashkey;
	
	public static void register(final FMLClientSetupEvent event) {
		Dashkey = create("dashkey", KeyEvent.VK_Z);
		
		ClientRegistry.registerKeyBinding(Dashkey);
	}
	
	public static KeyBinding create(String name, int key){
		return new KeyBinding("key." + "megamanarmormod" + "." + name, key, "key.category." + "megamanarmormod");
	}
}

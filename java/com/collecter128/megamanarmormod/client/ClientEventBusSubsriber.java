package com.collecter128.megamanarmormod.client;

import java.awt.event.KeyEvent;

import com.collecter128.megamanarmormod.core.KeybindInit;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = "megamanarmormod", bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubsriber {

	@SubscribeEvent
	public static void clientSetup(final FMLClientSetupEvent event) {
		KeybindInit.register(event);
		
	}
}

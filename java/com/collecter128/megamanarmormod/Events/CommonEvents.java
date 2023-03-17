package com.collecter128.megamanarmormod.Events;

import com.collecter128.megamanarmormod.MegamanArmorMod;
import com.collecter128.megamanarmormod.core.VillagerInit;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@EventBusSubscriber(modid = MegamanArmorMod.Mod_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonEvents {
	@SubscribeEvent
	public static void commonSetup(FMLCommonSetupEvent event) {
		event.enqueueWork(()->{
			VillagerInit.registerPOI();
			VillagerInit.FillTradeData();
		});
		
	}
	
}

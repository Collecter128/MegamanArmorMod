package com.collecter128.megamanarmormod.core;

import com.collecter128.megamanarmormod.MegamanArmorMod;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModSoundEvents {

	public static final DeferredRegister<SoundEvent> Sound_Events = 
			DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MegamanArmorMod.Mod_ID);
	
	public static final RegistryObject<SoundEvent> xBusterCharge = 
			registerSoundEvent("xbustercharge");
	public static final RegistryObject<SoundEvent> xBusterregularshot = 
			registerSoundEvent("xbusterregularshot");
	
	public static RegistryObject<SoundEvent> registerSoundEvent(String name){
		return Sound_Events.register(name, () -> new SoundEvent(new ResourceLocation(MegamanArmorMod.Mod_ID, name)));
	}
	
	public static void register(IEventBus eventbus) {
		Sound_Events.register(eventbus);
	}
}

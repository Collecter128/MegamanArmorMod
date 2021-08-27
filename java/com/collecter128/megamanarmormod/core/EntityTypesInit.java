package com.collecter128.megamanarmormod.core;

import net.minecraft.entity.EntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ForgeRegistry;

public class EntityTypesInit {
	
	public static final DeferredRegister<EntityType<?>> EntityTypes = DeferredRegister.create(ForgeRegistries.ENTITIES, "megamanarmormod");

	//public static final RegistryObject<EntityType< Entitytypename >> BusterShot = EntityTypes.register("bustershot", null);
}

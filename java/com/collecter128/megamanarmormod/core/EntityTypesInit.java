package com.collecter128.megamanarmormod.core;

import com.collecter128.megamanarmormod.entity.AbstractShotEntity;
import com.collecter128.megamanarmormod.entity.bustershotentity;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ForgeRegistry;

public class EntityTypesInit {
	
	public static final DeferredRegister<EntityType<?>> EntityTypes = DeferredRegister.create(ForgeRegistries.ENTITIES, "megamanarmormod");

	public static final RegistryObject<EntityType< bustershotentity >> BusterShot = EntityTypes.register("bustershot", 
			() -> EntityType.Builder.<bustershotentity>of(bustershotentity::new, EntityClassification.MISC).sized(0.5f, 0.5f)
				.build(new ResourceLocation("megamanarmormod", "bustershot").toString()));
//	public static final RegistryObject<EntityType< AbstractShotEntity >> AbstractBusterShot = EntityTypes.register("abstractbustershot", 
//			() -> EntityType.Builder.<AbstractShotEntity>create(AbstractShotEntity::new, EntityClassification.MISC).size(0.5f, 0.5f)
//				.build(new ResourceLocation("megamanarmormod", "abstractbustershot").toString()));
	//register("arrow", EntityType.Builder.<ArrowEntity>create(ArrowEntity::new, EntityClassification.MISC).size(0.5F, 0.5F).trackingRange(4).func_233608_b_(20));
}

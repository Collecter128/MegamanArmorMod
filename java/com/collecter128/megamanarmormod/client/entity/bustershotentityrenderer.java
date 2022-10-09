package com.collecter128.megamanarmormod.client.entity;

import com.collecter128.megamanarmormod.client.models.bustershot0;
import com.collecter128.megamanarmormod.entity.bustershotentity;

import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.model.HorseModel;
import net.minecraft.entity.passive.horse.AbstractHorseEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.util.ResourceLocation;

public class bustershotentityrenderer extends ArrowRenderer<bustershotentity>{//extends MobRenderer<bustershotentity, bustershot0<bustershotentity> >{//MobRenderer<bustershotentity, bustershot0<bustershotentity> >  <T extends bustershotentity, M extends bustershot0<T>> extends MobRenderer<T, M>

public static final ResourceLocation Texturelocation = new ResourceLocation("megamanarmormod", "textures/entity/bustershot0.png");
	
	
	public bustershotentityrenderer(EntityRendererManager renderManagerIn) {//, AnimatronicModel<Animatronic> entityModelIn,
		//float shadowSizeIn
		super(renderManagerIn);//, new bustershot0<>(), 0.7f
		//entityModelIn, shadowsizein
		
	}

	@Override
	public ResourceLocation getTextureLocation(bustershotentity entity) {
		
		return Texturelocation;
	}
}

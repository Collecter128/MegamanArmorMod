package com.collecter128.megamanarmormod.client.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

// Made with Blockbench 4.6.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

@OnlyIn(Dist.CLIENT)
public class xkai extends BipedModel {
	private final ModelRenderer Headblack;
	private final ModelRenderer Headgold;
	private final ModelRenderer Headgray;
	private final ModelRenderer Headglowpurple;
	private final ModelRenderer Headgloworange;
	private final ModelRenderer Bodyblack;
	private final ModelRenderer Bodygrayblue;
	private final ModelRenderer Bodygray;
	private final ModelRenderer Bodygold;
	private final ModelRenderer Bodyorange;
	private final ModelRenderer RightArmblack;
	private final ModelRenderer RightArmgrayblue;
	private final ModelRenderer RightArmgray;
	private final ModelRenderer RightArmgold;
	private final ModelRenderer RightArmorangeglow;
	private final ModelRenderer LeftArmblack;
	private final ModelRenderer LeftArmbluegray;
	private final ModelRenderer LeftArmgold;
	private final ModelRenderer LeftArmgray;
	private final ModelRenderer LeftArmorangeglow;
	private final ModelRenderer RightLegblack;
	private final ModelRenderer RightLegredglow;
	private final ModelRenderer RightLeggold;
	private final ModelRenderer RightLegorangeglow;
	private final ModelRenderer LeftLegblack;
	private final ModelRenderer LeftLegredglow;
	private final ModelRenderer LeftLeggold;
	private final ModelRenderer LeftLegorangeglow;
	
	public int MainColor;
	public int SecondaryColor;
	public int WhiteColor;
	public int ThirdColor;
	public int GlowyColor;
	public int GrayColor;
	public int FourthColor;
	public int MainColorDefault;
	public int SecondaryColorDefault;
	public int WhiteColorDefault;
	public int ThirdColorDefault;
	public int GlowyColorDefault;
	public int GrayColorDefault;
	public int FourthColorDefault;
	
	EquipmentSlotType equipmentslot;

	public xkai(float modelSize, EquipmentSlotType slot) {
		super(modelSize);
		texWidth = 93;
		texHeight = 255;
		
		equipmentslot = slot;
		
		MainColorDefault = 4671303;//black
		SecondaryColorDefault = 4281708;//blue gray
		ThirdColorDefault = 13883451; //gold
		WhiteColorDefault = 16777215;//White
		GlowyColorDefault = 9060564;//purple
		GrayColorDefault = 15592941;//gray
		FourthColorDefault = 16743685;//orange
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
		FourthColor = FourthColorDefault;

		Headblack = new ModelRenderer(this);
		Headblack.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headblack, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headblack.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headblack.texOffs(24, 0).addBox(-1.5F, -9.0F, -5.0F, 3.0F, 4.0F, 1.0F, 0.3F, false);
		Headblack.texOffs(68, 2).addBox(5.4F, -5.9341F, -0.7842F, 1.0F, 3.0F, 3.0F, 0.5F, false);
		Headblack.texOffs(68, 9).addBox(-5.981F, -5.938F, -0.747F, 1.0F, 3.0F, 3.0F, 0.5F, false);
		}
		
		Headgold = new ModelRenderer(this);
		Headgold.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headgold, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headgold.texOffs(0, 66).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headgold.texOffs(45, 93).addBox(-1.0872F, -9.9562F, -4.4855F, 2.0F, 5.0F, 10.0F, 0.4F, false);
		}
		
		Headgray = new ModelRenderer(this);
		Headgray.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headgray, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headgray.texOffs(32, 0).addBox(-3.6706F, -7.6327F, -3.8533F, 8.0F, 7.0F, 8.0F, 0.55F, false);
		Headgray.texOffs(34, 2).addBox(5.4F, -4.9341F, 0.2158F, 1.0F, 1.0F, 1.0F, 0.5F, false);
		Headgray.texOffs(34, 5).addBox(-5.981F, -4.938F, 0.253F, 1.0F, 1.0F, 1.0F, 0.5F, false);
		}
		
		Headglowpurple = new ModelRenderer(this);
		Headglowpurple.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headglowpurple, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headglowpurple.texOffs(58, 2).addBox(-0.5F, -7.8411F, -5.6852F, 1.0F, 2.0F, 1.0F, 0.1F, false);
		Headglowpurple.texOffs(76, 15).addBox(5.0F, -5.5F, -0.3F, 1.0F, 2.0F, 2.0F, 0.5F, false);
		Headglowpurple.texOffs(85, 15).addBox(-5.5F, -5.5F, -0.3F, 1.0F, 2.0F, 2.0F, 0.5F, false);
		}
		
		Headgloworange = new ModelRenderer(this);
		Headgloworange.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headgloworange, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headgloworange.texOffs(0, 157).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headgloworange.texOffs(79, 2).addBox(5.4F, -5.9341F, -0.7842F, 1.0F, 3.0F, 3.0F, 0.5F, false);
		Headgloworange.texOffs(79, 9).addBox(-5.981F, -5.938F, -0.747F, 1.0F, 3.0F, 3.0F, 0.5F, false);
		Headgloworange.texOffs(25, 5).addBox(-1.5F, -7.0F, -4.6F, 3.0F, 2.0F, 1.0F, 0.6F, false);
		Headgloworange.texOffs(-2, 4).addBox(-1.5F, -8.9562F, -1.4855F, 3.0F, 0.0F, 3.0F, 0.4F, false);
		}
		
		Bodyblack = new ModelRenderer(this);
		Bodyblack.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyblack.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);
		Bodyblack.texOffs(39, 169).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		}
		
		Bodygrayblue = new ModelRenderer(this);
		Bodygrayblue.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodygrayblue.texOffs(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		}
		
		Bodygray = new ModelRenderer(this);
		Bodygray.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodygray.texOffs(16, 48).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		}
		
		Bodygold = new ModelRenderer(this);
		Bodygold.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodygold.texOffs(0, 98).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);
		Bodygold.texOffs(49, 187).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		}
		
		Bodyorange = new ModelRenderer(this);
		Bodyorange.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyorange.texOffs(38, 158).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);
		}
		
		RightArmblack = new ModelRenderer(this);
		RightArmblack.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmblack, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmblack.texOffs(41, 16).addBox(-4.0F, -3.2019F, -2.0F, 4.0F, 4.0F, 4.0F, 0.8F, false);
		RightArmblack.texOffs(41, 48).addBox(-4.5F, 2.6391F, -2.5F, 6.0F, 6.0F, 5.0F, 0.2F, false);
		RightArmblack.texOffs(35, 208).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		RightArmgrayblue = new ModelRenderer(this);
		RightArmgrayblue.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmgrayblue, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmgrayblue.texOffs(41, 24).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		RightArmgrayblue.texOffs(41, 61).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		RightArmgray = new ModelRenderer(this);
		RightArmgray.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmgray, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmgray.texOffs(41, 77).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		RightArmgold = new ModelRenderer(this);
		RightArmgold.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmgold, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmgold.texOffs(1, 208).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		RightArmgold.texOffs(67, 110).addBox(-4.5F, 0.6391F, -2.5F, 6.0F, 8.0F, 5.0F, 0.2F, false);
		RightArmgold.texOffs(76, 26).addBox(-4.0F, -3.2019F, -2.0F, 4.0F, 4.0F, 4.0F, 0.8F, false);
		}
		
		RightArmorangeglow = new ModelRenderer(this);
		RightArmorangeglow.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmorangeglow, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmorangeglow.texOffs(76, 64).addBox(-4.0F, -3.2019F, -2.0F, 4.0F, 4.0F, 4.0F, 0.8F, false);
		RightArmorangeglow.texOffs(67, 128).addBox(-4.5F, 3.6391F, -2.5F, 6.0F, 6.0F, 5.0F, 0.2F, false);
		}
		
		LeftArmblack = new ModelRenderer(this);
		LeftArmblack.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmblack, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmblack.texOffs(58, 16).addBox(0.0F, -2.3974F, -2.0F, 4.0F, 4.0F, 4.0F, 0.8F, false);
		LeftArmblack.texOffs(62, 49).addBox(-1.5F, 3.6391F, -2.5F, 5.0F, 6.0F, 5.0F, 0.2F, false);
		LeftArmblack.texOffs(52, 208).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		LeftArmbluegray = new ModelRenderer(this);
		LeftArmbluegray.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmbluegray, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmbluegray.texOffs(58, 24).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArmbluegray.texOffs(58, 61).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		LeftArmgold = new ModelRenderer(this);
		LeftArmgold.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgold, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmgold.texOffs(18, 208).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArmgold.texOffs(67, 141).addBox(-1.5F, 0.6391F, -2.5F, 5.0F, 8.0F, 5.0F, 0.2F, false);
		LeftArmgold.texOffs(76, 37).addBox(0.0F, -2.3974F, -2.0F, 4.0F, 4.0F, 4.0F, 0.8F, false);
		}
		
		LeftArmgray = new ModelRenderer(this);
		LeftArmgray.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgray, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmgray.texOffs(58, 77).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		LeftArmorangeglow = new ModelRenderer(this);
		LeftArmorangeglow.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmorangeglow, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmorangeglow.texOffs(67, 160).addBox(-1.5F, 3.6391F, -2.5F, 5.0F, 6.0F, 5.0F, 0.2F, false);
		LeftArmorangeglow.texOffs(76, 79).addBox(0.0F, -2.3974F, -2.0F, 4.0F, 4.0F, 4.0F, 0.8F, false);
		}
		
		RightLegblack = new ModelRenderer(this);
		RightLegblack.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegblack, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegblack.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLegredglow = new ModelRenderer(this);
		RightLegredglow.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegredglow, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegredglow.texOffs(27, 106).addBox(-0.8947F, 14.2F, -1.0F, 2.0F, 1.0F, 2.0F, 1.0F, false);
		}
		
		RightLeggold = new ModelRenderer(this);
		RightLeggold.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeggold, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLeggold.texOffs(2, 175).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLegorangeglow = new ModelRenderer(this);
		RightLegorangeglow.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegorangeglow, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegorangeglow.texOffs(21, 174).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		RightLegorangeglow.texOffs(42, 192).addBox(0.0F, 10.0F, -2.2F, 2.0F, 3.0F, 1.0F, 1.0F, false);
		}
		
		LeftLegblack = new ModelRenderer(this);
		LeftLegblack.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegblack, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegblack.texOffs(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLegredglow = new ModelRenderer(this);
		LeftLegredglow.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegredglow, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegredglow.texOffs(27, 99).addBox(-1.2791F, 14.2F, -1.0F, 2.0F, 1.0F, 2.0F, 1.0F, true);
		}
		
		LeftLeggold = new ModelRenderer(this);
		LeftLeggold.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeggold, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLeggold.texOffs(2, 191).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLegorangeglow = new ModelRenderer(this);
		LeftLegorangeglow.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegorangeglow, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegorangeglow.texOffs(21, 191).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		LeftLegorangeglow.texOffs(41, 201).addBox(-1.4F, 10.0F, -2.2F, 3.0F, 3.0F, 1.0F, 1.0F, true);
		}
	}

//	@Override
//	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
//		//previously the render function, render code was moved to a method below
//	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		
		float fred = (float)( this.MainColor >> 16 & 255) / 255.0F;
		float fgreen = (float)(this.MainColor >> 8 & 255) / 255.0F;
		float fblue = (float)(this.MainColor & 255) / 255.0F;
		this.Headblack.copyFrom(this.head);
		Headblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodyblack.copyFrom(this.body);
		Bodyblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmblack.copyFrom(this.rightArm);
		RightArmblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmblack.copyFrom(this.leftArm);
		LeftArmblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegblack.copyFrom(this.rightLeg);
		RightLegblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegblack.copyFrom(this.leftLeg);
		LeftLegblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
		this.Bodygrayblue.copyFrom(this.body);
		Bodygrayblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmgrayblue.copyFrom(this.rightArm);
		RightArmgrayblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmbluegray.copyFrom(this.leftArm);
		LeftArmbluegray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.ThirdColor & 255) / 255.0F;
		this.Headgold.copyFrom(this.head);
		Headgold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodygold.copyFrom(this.body);
		Bodygold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmgold.copyFrom(this.rightArm);
		RightArmgold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmgold.copyFrom(this.leftArm);
		LeftArmgold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLeggold.copyFrom(this.rightLeg);
		RightLeggold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeggold.copyFrom(this.leftLeg);
		LeftLeggold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GrayColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GrayColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GrayColor & 255) / 255.0F;
		this.Headgray.copyFrom(this.head);
		Headgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodygray.copyFrom(this.body);
		Bodygray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmgray.copyFrom(this.rightArm);
		RightArmgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmgray.copyFrom(this.leftArm);
		LeftArmgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
		this.Headglowpurple.copyFrom(this.head);
		Headglowpurple.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.FourthColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.FourthColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.FourthColor & 255) / 255.0F;
		this.Headgloworange.copyFrom(this.head);
		Headgloworange.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodyorange.copyFrom(this.body);
		Bodyorange.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmorangeglow.copyFrom(this.rightArm);
		RightArmorangeglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmorangeglow.copyFrom(this.leftArm);
		LeftArmorangeglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegorangeglow.copyFrom(this.rightLeg);
		RightLegorangeglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegorangeglow.copyFrom(this.leftLeg);
		LeftLegorangeglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		
		
		this.RightLegredglow.copyFrom(this.rightLeg);
		RightLegredglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, red, green, blue, alpha);
		this.LeftLegredglow.copyFrom(this.leftLeg);
		LeftLegredglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, red, green, blue, alpha);
		
		
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
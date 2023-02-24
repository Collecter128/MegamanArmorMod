package com.collecter128.megamanarmormod.client.models;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.inventory.EquipmentSlotType;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;


// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class axlarmor_main extends BipedModel {
	private final ModelRenderer Headblack;
	private final ModelRenderer Headred;
	private final ModelRenderer Headwhite_r1;
	private final ModelRenderer Headgray;
	private final ModelRenderer Headwhite;
	private final ModelRenderer Headwhite_r2;
	private final ModelRenderer Headglowblue;
	private final ModelRenderer Headglowred;
	private final ModelRenderer Headhair;
	private final ModelRenderer Headglow_r1;
	private final ModelRenderer Headglow_r2;
	private final ModelRenderer Headgold;
	private final ModelRenderer Headglow_r3;
	private final ModelRenderer Headglow_r4;
	private final ModelRenderer Bodydarkgray;
	private final ModelRenderer Bodygold;
	private final ModelRenderer Bodyred;
	private final ModelRenderer Bodygray;
	private final ModelRenderer Bodygray_r1;
	private final ModelRenderer Bodygray_r2;
	private final ModelRenderer Bodygraygreen;
	private final ModelRenderer Bodyblue;
	private final ModelRenderer RightArmdarkgray;
	private final ModelRenderer RightArm_r1;
	private final ModelRenderer RightArmgold;
	private final ModelRenderer RightArmwhite;
	private final ModelRenderer RightArmred;
	private final ModelRenderer RightArm_r2;
	private final ModelRenderer RightArmgray;
	private final ModelRenderer RightArmgraygreen;
	private final ModelRenderer LeftArm;
	private final ModelRenderer LeftArm_r1;
	private final ModelRenderer LeftArmgraygreen;
	private final ModelRenderer LeftArmgold;
	private final ModelRenderer LeftArmwhite;
	private final ModelRenderer LeftArmgray;
	private final ModelRenderer LeftArmred;
	private final ModelRenderer LeftArm_r2;
	private final ModelRenderer RightLeg;
	private final ModelRenderer RightLegglow;
	private final ModelRenderer LeftLegwhite_r1;
	private final ModelRenderer RightLegwhite;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer LeftLegglow;
	private final ModelRenderer LeftLegwhite_r2;
	private final ModelRenderer LeftLegwhite;
	
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

	public axlarmor_main(float modelSize, EquipmentSlotType slot) {
		super(modelSize);
		texWidth = 109;
		texHeight = 175;
		
		equipmentslot = slot;
		
		MainColorDefault = 4277608;//Main Body Color grayblue
		SecondaryColorDefault = 9478540;//Secondary gray green
		ThirdColorDefault = 16756992; //golden 
		WhiteColorDefault = 15395563;//
		GlowyColorDefault = 14690596;// reds
		GrayColorDefault = 9212065;//
		FourthColorDefault = 7249368;//Blue Glow
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
		}
		
		Headred = new ModelRenderer(this);
		Headred.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headred, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headred.texOffs(64, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headred.texOffs(32, 2).addBox(-2.0038F, -9.8557F, -5.2F, 4.0F, 4.0F, 0.0F, 0.1F, false);
		}
		
		Headwhite_r1 = new ModelRenderer(this);
		Headwhite_r1.setPos(0.0F, 24.0F, 0.0F);
		Headred.addChild(Headwhite_r1);
		setRotationAngle(Headwhite_r1, 0.3491F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headwhite_r1.texOffs(65, 82).addBox(-5.6F, -26.6024F, 5.7839F, 11.0F, 3.0F, 11.0F, 0.5F, false);
		}
		
		Headgray = new ModelRenderer(this);
		Headgray.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headgray, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headgray.texOffs(32, 0).addBox(-3.6706F, -7.6327F, -3.8533F, 8.0F, 7.0F, 8.0F, 0.55F, false);
		Headgray.texOffs(24, 2).addBox(-2.0038F, -9.8557F, -5.2F, 4.0F, 4.0F, 0.0F, 0.1F, false);
		}
		
		Headwhite = new ModelRenderer(this);
		Headwhite.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headwhite, -0.1047F, 0.0873F, 0.0F);
		

		Headwhite_r2 = new ModelRenderer(this);
		Headwhite_r2.setPos(0.0F, 24.0F, 0.0F);
		Headwhite.addChild(Headwhite_r2);
		setRotationAngle(Headwhite_r2, 0.3491F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headwhite_r2.texOffs(65, 67).addBox(-5.6F, -26.6024F, 5.7839F, 11.0F, 3.0F, 11.0F, 0.5F, false);
		}
		
		Headglowblue = new ModelRenderer(this);
		Headglowblue.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headglowblue, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headglowblue.texOffs(57, 2).addBox(-1.0F, -8.8411F, -5.6852F, 2.0F, 2.0F, 1.0F, 0.1F, false);
		}
		
		Headglowred = new ModelRenderer(this);
		Headglowred.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headglowred, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headglowred.texOffs(93, 17).addBox(-5.6512F, -2.985F, -3.2629F, 0.0F, 2.0F, 2.0F, 0.0F, false);
		Headglowred.texOffs(103, 17).addBox(5.3941F, -2.981F, -3.2999F, 0.0F, 2.0F, 2.0F, 0.0F, false);
		}
		
		Headhair = new ModelRenderer(this);
		Headhair.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headhair, -0.1047F, 0.0873F, 0.0F);
		

		Headglow_r1 = new ModelRenderer(this);
		Headglow_r1.setPos(0.0F, 24.0F, 0.0F);
		Headhair.addChild(Headglow_r1);
		setRotationAngle(Headglow_r1, -0.2182F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headglow_r1.texOffs(79, 147).addBox(-3.273F, -25.6522F, -0.4039F, 7.0F, 0.0F, 5.0F, 0.1F, false);
		}
		
		Headglow_r2 = new ModelRenderer(this);
		Headglow_r2.setPos(0.0F, 24.0F, 0.0F);
		Headhair.addChild(Headglow_r2);
		setRotationAngle(Headglow_r2, 0.3491F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headglow_r2.texOffs(79, 140).addBox(-3.759F, -21.4104F, 12.9278F, 7.0F, 0.0F, 5.0F, 0.1F, false);
		}
		
		Headgold = new ModelRenderer(this);
		Headgold.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headgold, -0.1047F, 0.0873F, 0.0F);
		

		Headglow_r3 = new ModelRenderer(this);
		Headglow_r3.setPos(0.0F, 24.0F, 0.0F);
		Headgold.addChild(Headglow_r3);
		setRotationAngle(Headglow_r3, 0.3054F, 0.5236F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headglow_r3.texOffs(99, 70).addBox(5.9699F, -25.0F, 4.692F, 0.0F, 2.0F, 3.0F, 0.0F, false);
		}
		
		Headglow_r4 = new ModelRenderer(this);
		Headglow_r4.setPos(0.0F, 24.0F, 0.0F);
		Headgold.addChild(Headglow_r4);
		setRotationAngle(Headglow_r4, 0.3054F, -0.5236F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headglow_r4.texOffs(67, 69).addBox(-6.5875F, -25.0F, 5.0969F, 0.0F, 2.0F, 3.0F, 0.0F, false);
		}
		
		Bodydarkgray = new ModelRenderer(this);
		Bodydarkgray.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodydarkgray.texOffs(20, 16).addBox(-4.5F, 0.0F, -2.5F, 9.0F, 10.0F, 5.0F, 0.7F, false);
		}
		
		Bodygold = new ModelRenderer(this);
		Bodygold.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodygold.texOffs(20, 80).addBox(-4.5F, 0.0F, -2.5F, 9.0F, 10.0F, 5.0F, 0.7F, false);
		}
		
		Bodyred = new ModelRenderer(this);
		Bodyred.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyred.texOffs(74, 122).addBox(-4.5F, 0.0F, -2.5F, 9.0F, 10.0F, 5.0F, 0.7F, false);
		Bodyred.texOffs(20, 48).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		Bodyred.texOffs(101, 12).addBox(-2.0038F, 1.1443F, -3.2F, 4.0F, 4.0F, 0.0F, 0.1F, false);
		}
		
		Bodygray = new ModelRenderer(this);
		Bodygray.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodygray.texOffs(20, 33).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		Bodygray.texOffs(20, 64).addBox(-4.5F, 0.0F, -2.5F, 9.0F, 10.0F, 5.0F, 0.7F, false);
		Bodygray.texOffs(101, 7).addBox(-2.0038F, 1.1443F, -3.2F, 4.0F, 4.0F, 0.0F, 0.1F, false);
		Bodygray.texOffs(3, 145).addBox(-2.0F, 2.0F, 2.0F, 3.0F, 4.0F, 2.0F, 0.51F, false);
		Bodygray.texOffs(13, 145).addBox(-2.0F, 2.0F, 5.3F, 3.0F, 4.0F, 2.0F, 0.51F, false);
		}
		
		Bodygray_r1 = new ModelRenderer(this);
		Bodygray_r1.setPos(1.0F, 22.0F, 8.0F);
		Bodygray.addChild(Bodygray_r1);
		setRotationAngle(Bodygray_r1, 0.6981F, 2.4435F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodygray_r1.texOffs(24, 134).addBox(5.8F, -15.0F, -2.0F, -1.0F, 3.0F, 15.0F, 0.51F, false);
		}
		
		Bodygray_r2 = new ModelRenderer(this);
		Bodygray_r2.setPos(6.0F, 22.0F, 1.0F);
		Bodygray.addChild(Bodygray_r2);
		setRotationAngle(Bodygray_r2, 0.6981F, -2.4435F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodygray_r2.texOffs(24, 129).addBox(5.8F, -15.0F, -2.0F, -1.0F, 3.0F, 15.0F, 0.51F, false);
		}
		
		Bodygraygreen = new ModelRenderer(this);
		Bodygraygreen.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodygraygreen.texOffs(36, 152).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		}
		
		Bodyblue = new ModelRenderer(this);
		Bodyblue.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyblue.texOffs(20, 33).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		Bodyblue.texOffs(20, 64).addBox(-4.5F, 0.0F, -2.5F, 9.0F, 10.0F, 5.0F, 0.7F, false);
		Bodyblue.texOffs(57, 2).addBox(-1.0F, 2.1589F, -4.0F, 2.0F, 2.0F, 1.0F, 0.1F, false);
		}
		
		RightArmdarkgray = new ModelRenderer(this);
		RightArmdarkgray.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmdarkgray, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmdarkgray.texOffs(48, 40).addBox(-3.0F, 4.6087F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		RightArm_r1 = new ModelRenderer(this);
		RightArm_r1.setPos(5.0F, 22.0F, 0.0F);
		RightArmdarkgray.addChild(RightArm_r1);
		setRotationAngle(RightArm_r1, 0.0F, 0.0F, 0.0873F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArm_r1.texOffs(48, 16).addBox(-11.9924F, -25.0124F, -2.5F, 5.0F, 3.0F, 5.0F, 0.8F, false);
		}
		
		RightArmgold = new ModelRenderer(this);
		RightArmgold.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmgold, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmgold.texOffs(48, 24).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		RightArmwhite = new ModelRenderer(this);
		RightArmwhite.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmwhite, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmwhite.texOffs(45, 48).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		RightArmred = new ModelRenderer(this);
		RightArmred.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmred, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmred.texOffs(66, 138).addBox(-3.1F, 4.6087F, -2.5F, 2.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		RightArm_r2 = new ModelRenderer(this);
		RightArm_r2.setPos(5.0F, 22.0F, 0.0F);
		RightArmred.addChild(RightArm_r2);
		setRotationAngle(RightArm_r2, 0.0F, 0.0F, 0.0873F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArm_r2.texOffs(84, 25).addBox(-11.9924F, -25.0124F, -2.5F, 5.0F, 3.0F, 5.0F, 0.8F, false);
		}
		
		RightArmgray = new ModelRenderer(this);
		RightArmgray.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmgray, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmgray.texOffs(48, 65).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		RightArmgray.texOffs(45, 135).addBox(-3.0F, 6.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		RightArmgraygreen = new ModelRenderer(this);
		RightArmgraygreen.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmgraygreen, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmgraygreen.texOffs(0, 152).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		LeftArm = new ModelRenderer(this);
		LeftArm.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArm, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArm.texOffs(65, 40).addBox(-1.0F, 3.8F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		LeftArm_r1 = new ModelRenderer(this);
		LeftArm_r1.setPos(-5.0F, 22.0F, 0.0F);
		LeftArm.addChild(LeftArm_r1);
		setRotationAngle(LeftArm_r1, 0.0F, 0.0F, -0.0873F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArm_r1.texOffs(69, 16).addBox(6.9886F, -25.1141F, -2.5F, 5.0F, 3.0F, 5.0F, 0.8F, false);
		}
		
		LeftArmgraygreen = new ModelRenderer(this);
		LeftArmgraygreen.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgraygreen, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmgraygreen.texOffs(17, 152).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		LeftArmgold = new ModelRenderer(this);
		LeftArmgold.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgold, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmgold.texOffs(65, 24).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		LeftArmwhite = new ModelRenderer(this);
		LeftArmwhite.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmwhite, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmwhite.texOffs(62, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		LeftArmgray = new ModelRenderer(this);
		LeftArmgray.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgray, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmgray.texOffs(86, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		LeftArmred = new ModelRenderer(this);
		LeftArmred.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmred, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmred.texOffs(70, 138).addBox(2.1F, 3.8F, -2.5F, 1.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		LeftArm_r2 = new ModelRenderer(this);
		LeftArm_r2.setPos(-5.0F, 22.0F, 0.0F);
		LeftArmred.addChild(LeftArm_r2);
		setRotationAngle(LeftArm_r2, 0.0F, 0.0F, -0.0873F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArm_r2.texOffs(84, 34).addBox(6.9886F, -25.1141F, -2.5F, 5.0F, 3.0F, 5.0F, 0.8F, false);
		}
		
		RightLeg = new ModelRenderer(this);
		RightLeg.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeg, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLeg.texOffs(0, 16).addBox(-3.0F, 1.0F, -2.0F, 5.0F, 11.0F, 5.0F, 0.6F, false);
		}
		
		RightLegglow = new ModelRenderer(this);
		RightLegglow.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegglow, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegglow.texOffs(11, 90).addBox(-4.5651F, 5.2687F, -1.4405F, 1.0F, 7.0F, 3.0F, 0.006F, true);
		RightLegglow.texOffs(0, 49).addBox(-3.0F, 1.0F, -2.0F, 5.0F, 11.0F, 5.0F, 0.6F, false);
		}
		
		LeftLegwhite_r1 = new ModelRenderer(this);
		LeftLegwhite_r1.setPos(1.9F, 12.0F, 0.0F);
		RightLegglow.addChild(LeftLegwhite_r1);
		setRotationAngle(LeftLegwhite_r1, 0.0F, 0.0F, -0.4363F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegwhite_r1.texOffs(11, 98).addBox(-6.0F, -7.4239F, -1.0F, 1.0F, 4.0F, 3.0F, 0.6F, true);
		}
		
		RightLegwhite = new ModelRenderer(this);
		RightLegwhite.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegwhite, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegwhite.texOffs(57, 90).addBox(-4.5651F, 5.2687F, -1.4405F, 1.0F, 7.0F, 3.0F, 0.006F, true);
		}
		LeftLeg = new ModelRenderer(this);
		LeftLeg.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeg, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLeg.texOffs(0, 32).addBox(-3.0F, 1.0F, -2.0F, 5.0F, 11.0F, 5.0F, 0.6F, true);
		}
		LeftLegglow = new ModelRenderer(this);
		LeftLegglow.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegglow, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegglow.texOffs(1, 90).addBox(2.9988F, 4.8951F, -1.0031F, 1.0F, 7.0F, 3.0F, 0.006F, true);
		LeftLegglow.texOffs(0, 65).addBox(-3.0F, 0.0F, -2.0F, 5.0F, 12.0F, 5.0F, 0.6F, true);
		}
		
		LeftLegwhite_r2 = new ModelRenderer(this);
		LeftLegwhite_r2.setPos(-1.9F, 12.0F, 0.0F);
		LeftLegglow.addChild(LeftLegwhite_r2);
		setRotationAngle(LeftLegwhite_r2, 0.0F, 0.0F, 0.4363F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegwhite_r2.texOffs(1, 99).addBox(2.6F, -6.42F, -0.4848F, 1.0F, 3.0F, 3.0F, 0.6F, true);
		}
		
		LeftLegwhite = new ModelRenderer(this);
		LeftLegwhite.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegwhite, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegwhite.texOffs(47, 90).addBox(2.9988F, 4.8951F, -1.0031F, 1.0F, 7.0F, 3.0F, 0.006F, true);
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
        this.Bodydarkgray.copyFrom(this.body);
        Bodydarkgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
        this.RightArmdarkgray.copyFrom(this.rightArm);
        RightArmdarkgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
        this.LeftArm.copyFrom(this.leftArm);
        LeftArm.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
        this.RightLeg.copyFrom(this.rightLeg);
        RightLeg.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
        this.LeftLeg.copyFrom(this.leftLeg);
        LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
        this.Bodygraygreen.copyFrom(this.body);
        Bodygraygreen.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
        this.RightArmgraygreen.copyFrom(this.rightArm);
        RightArmgraygreen.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
        this.LeftArmgraygreen.copyFrom(this.leftArm);
        LeftArmgraygreen.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);

        this.Headhair.copyFrom(this.head);
		Headhair.render(matrixStack, buffer, packedLight, packedOverlay);
		
		fred = (float)( this.FourthColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.FourthColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.FourthColor & 255) / 255.0F;
		
        this.Headglowblue.copyFrom(this.head);
        Headglowblue.render(matrixStack, buffer, 0xF000F0, packedOverlay);
        this.Bodyblue.copyFrom(this.body);
		Bodyblue.render(matrixStack, buffer, 0xF000F0, packedOverlay);
		
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
		
		fred = (float)( this.WhiteColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.WhiteColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.WhiteColor & 255) / 255.0F;
        this.Headwhite.copyFrom(this.head);
        Headwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
        this.RightArmwhite.copyFrom(this.rightArm);
        RightArmwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
        this.LeftArmwhite.copyFrom(this.leftArm);
        LeftArmwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
        this.RightLegwhite.copyFrom(this.rightLeg);
        RightLegwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
        this.LeftLegwhite.copyFrom(this.leftLeg);
        LeftLegwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
        this.Headred.copyFrom(this.head);
        Headred.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
        this.Headglowred.copyFrom(this.head);
        Headglowred.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
        this.Bodyred.copyFrom(this.body);
        Bodyred.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
        this.RightArmred.copyFrom(this.rightArm);
        RightArmred.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
        this.LeftArmred.copyFrom(this.leftArm);
        LeftArmred.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
        this.RightLegglow.copyFrom(this.rightLeg);
        RightLegglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
        this.LeftLegglow.copyFrom(this.leftLeg);
		LeftLegglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
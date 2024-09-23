package com.collecter128.megamanarmormod.client.models;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports

@OnlyIn(Dist.CLIENT)
public class bladearmor extends BipedModel {
	private final ModelRenderer Headblue;
	private final ModelRenderer Headlightblue;
	private final ModelRenderer Headwhite;
	private final ModelRenderer cube_r1;
	private final ModelRenderer Headyellow;
	private final ModelRenderer Headgray;
	private final ModelRenderer Headredglow;
	private final ModelRenderer Bodywhite;
	private final ModelRenderer Bodyblue;
	private final ModelRenderer Bodyyellow;
	private final ModelRenderer Bodyglowgreen;
	private final ModelRenderer Body4middlething;
	private final ModelRenderer Body2lightblue;
	private final ModelRenderer Bodygray;
	private final ModelRenderer RightArmblue;
	private final ModelRenderer RightArmwhite;
	private final ModelRenderer RightArmglowgreen;
	private final ModelRenderer RightArm2lightblue;
	private final ModelRenderer RightArmred;
	private final ModelRenderer RightArmgray;
	private final ModelRenderer LeftArmblue;
	private final ModelRenderer LeftArmwhite;
	private final ModelRenderer LeftArmgreenglow;
	private final ModelRenderer LeftArm2lightblue;
	private final ModelRenderer LeftArmred;
	private final ModelRenderer LeftArmgray;
	private final ModelRenderer RightLegwhite;
	private final ModelRenderer RightLegblue;
	private final ModelRenderer RightLegyellow;
	private final ModelRenderer RightLeggray;
	private final ModelRenderer RightLeggreenglow;
	private final ModelRenderer LeftLegwhite;
	private final ModelRenderer LeftLegblue;
	private final ModelRenderer LeftLegyellow;
	private final ModelRenderer LeftLeggray;
	private final ModelRenderer LeftLegglowgreen;
	
	public int MainColor;
	public int SecondaryColor;
	public int WhiteColor;
	public int ThirdColor;
	public int GlowyColor;
	public int GrayColor;
	public int FourthColor;
	public int FifthColor;
	public int MainColorDefault;
	public int SecondaryColorDefault;
	public int WhiteColorDefault;
	public int ThirdColorDefault;
	public int GlowyColorDefault;
	public int GrayColorDefault;
	public int FourthColorDefault;
	public int FifthColorDefault;
	
	EquipmentSlotType equipmentslot;

	public bladearmor(float modelSize, EquipmentSlotType slot) {
		super(modelSize);
		texWidth = 90;
		texHeight = 283;
		
		equipmentslot = slot;
		
		MainColorDefault = 2781423;//Main Body Color X Blue
		SecondaryColorDefault = 5752303;//Secondary Cyan tiel color
		ThirdColorDefault = 16642337; //Yellow Bits
		WhiteColorDefault = 16777215;//Basic White
		GlowyColorDefault = 16468504;//Glow?Red crystal thingy
		GrayColorDefault = 16777215;//Basic White
		FourthColorDefault = 9614024; //Chest Thingy
		FifthColorDefault = 2935135; //green
		
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
		FourthColor = FourthColorDefault;
		FifthColor = FifthColorDefault;

		Headblue = new ModelRenderer(this);
		Headblue.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headblue, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headblue.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headblue.texOffs(0, 238).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.4F, false);
		}

		Headlightblue = new ModelRenderer(this);
		Headlightblue.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headlightblue, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headlightblue.texOffs(0, 221).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}

		Headwhite = new ModelRenderer(this);
		Headwhite.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headwhite, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headwhite.texOffs(34, 221).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.4F, false);
		Headwhite.texOffs(48, 83).addBox(-1.0872F, -9.9562F, -4.4855F, 2.0F, 5.0F, 10.0F, 0.4F, false);
		}
		
		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0F, -8.0F, -3.0F);
		Headwhite.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.7854F, -0.6109F, 0.5236F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		cube_r1.texOffs(5, 93).addBox(-3.0F, 0.0438F, -2.8F, 2.0F, 1.0F, 2.0F, 0.4F, false);
		}
		
		Headyellow = new ModelRenderer(this);
		Headyellow.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headyellow, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headyellow.texOffs(34, 241).addBox(-4.0F, -16.0F, -4.3F, 8.0F, 10.0F, 1.0F, 1.4F, false);
		}
		
		Headgray = new ModelRenderer(this);
		Headgray.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headgray, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headgray.texOffs(3, 62).addBox(5.4F, -2.9341F, -0.7842F, 1.0F, 3.0F, 3.0F, 0.5F, false);
		Headgray.texOffs(3, 55).addBox(-5.981F, -2.938F, -0.747F, 1.0F, 3.0F, 3.0F, 0.5F, false);
		Headgray.texOffs(32, 0).addBox(-3.6706F, -7.6327F, -3.8533F, 8.0F, 7.0F, 8.0F, 0.55F, false);
		}
		
		Headredglow = new ModelRenderer(this);
		Headredglow.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headredglow, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headredglow.texOffs(4, 51).addBox(-1.0F, -7.8411F, -6.6852F, 2.0F, 2.0F, 1.0F, 0.1F, false);
		Headredglow.texOffs(69, 1).addBox(6.5F, -2.3F, -0.2F, 1.0F, 2.0F, 2.0F, 0.2F, false);
		Headredglow.texOffs(69, 8).addBox(-5.7F, -2.3F, -0.2F, 1.0F, 2.0F, 2.0F, 0.2F, false);
		}
		
		Bodywhite = new ModelRenderer(this);
		Bodywhite.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodywhite.texOffs(21, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);
		}
		
		Bodyblue = new ModelRenderer(this);
		Bodyblue.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyblue.texOffs(21, 82).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);
		}
		
		Bodyyellow = new ModelRenderer(this);
		Bodyyellow.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyyellow.texOffs(16, 99).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);
		}
		
		Bodyglowgreen = new ModelRenderer(this);
		Bodyglowgreen.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyglowgreen.texOffs(21, 65).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);
		}
		
		Body4middlething = new ModelRenderer(this);
		Body4middlething.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Body4middlething.texOffs(16, 133).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);
		}
		
		Body2lightblue = new ModelRenderer(this);
		Body2lightblue.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Body2lightblue.texOffs(21, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		}
		
		Bodygray = new ModelRenderer(this);
		Bodygray.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodygray.texOffs(21, 48).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		}
		
		RightArmblue = new ModelRenderer(this);
		RightArmblue.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmblue, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmblue.texOffs(46, 16).addBox(-4.0F, -3.2019F, -2.0F, 4.0F, 4.0F, 4.0F, 0.8F, false);
		RightArmblue.texOffs(0, 188).addBox(-3.5F, 3.0F, -2.5F, 5.0F, 5.0F, 5.0F, 0.5F, false);
		RightArmblue.texOffs(2, 267).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		RightArmblue.texOffs(61, 106).addBox(-4.0F, -5.2019F, -0.5F, 4.0F, 1.0F, 1.0F, 0.2F, false);
		}
		
		RightArmwhite = new ModelRenderer(this);
		RightArmwhite.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmwhite, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmwhite.texOffs(45, 190).addBox(-4.0F, -3.2019F, -2.0F, 4.0F, 4.0F, 4.0F, 0.8F, false);
		RightArmwhite.texOffs(46, 40).addBox(-3.5F, 3.0F, -2.5F, 5.0F, 5.0F, 5.0F, 0.5F, false);
		}
		
		RightArmglowgreen = new ModelRenderer(this);
		RightArmglowgreen.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmglowgreen, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmglowgreen.texOffs(48, 106).addBox(-4.0F, -5.2019F, -0.5F, 4.0F, 1.0F, 1.0F, 0.2F, false);
		RightArmglowgreen.texOffs(0, 199).addBox(-3.5F, 3.0F, -2.5F, 5.0F, 5.0F, 5.0F, 0.5F, false);
		}
		
		RightArm2lightblue = new ModelRenderer(this);
		RightArm2lightblue.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArm2lightblue, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArm2lightblue.texOffs(46, 24).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		RightArmred = new ModelRenderer(this);
		RightArmred.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmred, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmred.texOffs(46, 50).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		RightArmgray = new ModelRenderer(this);
		RightArmgray.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmgray, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmgray.texOffs(46, 66).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		RightArmgray.texOffs(0, 210).addBox(-3.5F, 3.0F, -2.5F, 5.0F, 5.0F, 5.0F, 0.5F, false);
		RightArmgray.texOffs(76, 118).addBox(-4.0F, -5.2019F, -0.5F, 4.0F, 1.0F, 1.0F, 0.2F, false);
		}
		
		LeftArmblue = new ModelRenderer(this);
		LeftArmblue.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmblue, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmblue.texOffs(63, 16).addBox(0.0F, -3.3974F, -2.0F, 4.0F, 4.0F, 4.0F, 0.8F, false);
		LeftArmblue.texOffs(21, 188).addBox(-1.5F, 3.0F, -2.5F, 5.0F, 5.0F, 5.0F, 0.5F, false);
		LeftArmblue.texOffs(19, 267).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArmblue.texOffs(76, 111).addBox(0.0F, -5.3974F, -0.5F, 4.0F, 1.0F, 1.0F, 0.2F, false);
		}
		
		LeftArmwhite = new ModelRenderer(this);
		LeftArmwhite.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmwhite, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmwhite.texOffs(62, 190).addBox(0.0F, -3.3974F, -2.0F, 4.0F, 4.0F, 4.0F, 0.8F, false);
		LeftArmwhite.texOffs(67, 40).addBox(-1.5F, 3.0F, -2.5F, 5.0F, 5.0F, 5.0F, 0.5F, false);
		}
		
		LeftArmgreenglow = new ModelRenderer(this);
		LeftArmgreenglow.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgreenglow, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmgreenglow.texOffs(76, 106).addBox(0.0F, -5.3974F, -0.5F, 4.0F, 1.0F, 1.0F, 0.2F, false);
		LeftArmgreenglow.texOffs(21, 199).addBox(-1.5F, 3.0F, -2.5F, 5.0F, 5.0F, 5.0F, 0.5F, false);
		}
		
		LeftArm2lightblue = new ModelRenderer(this);
		LeftArm2lightblue.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArm2lightblue, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArm2lightblue.texOffs(63, 24).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		LeftArmred = new ModelRenderer(this);
		LeftArmred.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmred, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmred.texOffs(63, 50).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		LeftArmgray = new ModelRenderer(this);
		LeftArmgray.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgray, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmgray.texOffs(63, 66).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArmgray.texOffs(21, 210).addBox(-1.5F, 3.0F, -2.5F, 5.0F, 5.0F, 5.0F, 0.5F, false);
		LeftArmgray.texOffs(77, 123).addBox(0.0F, -5.3974F, -0.5F, 4.0F, 1.0F, 1.0F, 0.2F, false);
		}
		
		RightLegwhite = new ModelRenderer(this);
		RightLegwhite.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegwhite, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegwhite.texOffs(0, 16).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 12.0F, 5.0F, 0.5F, false);
		}
		
		RightLegblue = new ModelRenderer(this);
		RightLegblue.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegblue, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegblue.texOffs(0, 151).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 12.0F, 5.0F, 0.5F, false);
		RightLegblue.texOffs(68, 242).addBox(-3.9F, 9.5F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		RightLegblue.texOffs(68, 242).addBox(3.8F, 9.5F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		}
		
		RightLegyellow = new ModelRenderer(this);
		RightLegyellow.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegyellow, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegyellow.texOffs(21, 151).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 12.0F, 5.0F, 0.5F, false);
		RightLegyellow.texOffs(0, 79).addBox(-1.5F, 8.0F, 2.5F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		RightLegyellow.texOffs(56, 240).addBox(-3.5F, 9.0F, -1.5F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		RightLegyellow.texOffs(56, 240).addBox(3.5F, 9.0F, -1.5F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		}
		
		RightLeggray = new ModelRenderer(this);
		RightLeggray.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeggray, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLeggray.texOffs(63, 151).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 12.0F, 5.0F, 0.5F, false);
		}
		
		RightLeggreenglow = new ModelRenderer(this);
		RightLeggreenglow.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeggreenglow, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLeggreenglow.texOffs(42, 151).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 12.0F, 5.0F, 0.5F, false);
		RightLeggreenglow.texOffs(0, 72).addBox(-1.1F, 3.0F, -3.5F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		}
		
		//-3.4 -> -2.4
		LeftLegwhite = new ModelRenderer(this);
		LeftLegwhite.setPos(2.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegwhite, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegwhite.texOffs(0, 33).addBox(-2.4F, 0.0F, -2.5F, 5.0F, 12.0F, 5.0F, 0.5F, true);
		}
		
		LeftLegblue = new ModelRenderer(this);
		LeftLegblue.setPos(2.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegblue, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegblue.texOffs(0, 168).addBox(-2.4F, 0.0F, -2.5F, 5.0F, 12.0F, 5.0F, 0.5F, true);
		LeftLegblue.texOffs(68, 248).addBox(-4.7F, 9.5F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, true);
		LeftLegblue.texOffs(68, 248).addBox(2.9F, 9.5F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, true);
		}
		
		LeftLegyellow = new ModelRenderer(this);
		LeftLegyellow.setPos(2.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegyellow, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegyellow.texOffs(21, 168).addBox(-2.4F, 0.0F, -2.5F, 5.0F, 12.0F, 5.0F, 0.5F, true);
		LeftLegyellow.texOffs(9, 79).addBox(-1.4F, 8.0F, 2.5F, 3.0F, 2.0F, 1.0F, 0.0F, true);
		LeftLegyellow.texOffs(56, 246).addBox(-4.4F, 9.0F, -1.5F, 1.0F, 3.0F, 3.0F, 0.0F, true);
		LeftLegyellow.texOffs(56, 246).addBox(2.6F, 9.0F, -1.5F, 1.0F, 3.0F, 3.0F, 0.0F, true);
		}
		
		LeftLeggray = new ModelRenderer(this);
		LeftLeggray.setPos(2.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeggray, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLeggray.texOffs(63, 168).addBox(-2.4F, 0.0F, -2.5F, 5.0F, 12.0F, 5.0F, 0.5F, true);
		}
		
		LeftLegglowgreen = new ModelRenderer(this);
		LeftLegglowgreen.setPos(2.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegglowgreen, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegglowgreen.texOffs(42, 168).addBox(-2.4F, 0.0F, -2.5F, 5.0F, 12.0F, 5.0F, 0.5F, true);
		LeftLegglowgreen.texOffs(9, 72).addBox(-0.9F, 3.0F, -3.5F, 2.0F, 4.0F, 1.0F, 0.0F, true);
		}
	}

//	@Override
//	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
//		//previously the render function, render code was moved to a method below
//	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		
		float fred = (float)( this.MainColor >> 16 & 255) / 255.0F;
        float fgreen = (float)(this.MainColor >> 8 & 255) / 255.0F;
        float fblue = (float)(this.MainColor & 255) / 255.0F;
		this.Headblue.copyFrom(this.head);
		Headblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodyblue.copyFrom(this.body);
		Bodyblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmblue.copyFrom(this.rightArm);
		RightArmblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmblue.copyFrom(this.leftArm);
		LeftArmblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegblue.copyFrom(this.rightLeg);
		RightLegblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegblue.copyFrom(this.leftLeg);
		LeftLegblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
		this.Headlightblue.copyFrom(this.head);
		Headlightblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Body2lightblue.copyFrom(this.body);
		Body2lightblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArm2lightblue.copyFrom(this.rightArm);
		RightArm2lightblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArm2lightblue.copyFrom(this.leftArm);
		LeftArm2lightblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.WhiteColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.WhiteColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.WhiteColor & 255) / 255.0F;
		this.Headwhite.copyFrom(this.head);
		Headwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodywhite.copyFrom(this.body);
		Bodywhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmwhite.copyFrom(this.rightArm);
		RightArmwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmwhite.copyFrom(this.leftArm);
		LeftArmwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegwhite.copyFrom(this.rightLeg);
		RightLegwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegwhite.copyFrom(this.leftLeg);
		LeftLegwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.ThirdColor & 255) / 255.0F;
		this.Headyellow.copyFrom(this.head);
		Headyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodyyellow.copyFrom(this.body);
		Bodyyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegyellow.copyFrom(this.rightLeg);
		RightLegyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegyellow.copyFrom(this.leftLeg);
		LeftLegyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
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
		this.RightLeggray.copyFrom(this.rightLeg);
		RightLeggray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeggray.copyFrom(this.leftLeg);
		LeftLeggray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
		this.Headredglow.copyFrom(this.head);
		Headredglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		
		this.RightArmred.copyFrom(this.rightArm);
		RightArmred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmred.copyFrom(this.leftArm);
		LeftArmred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.FifthColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.FifthColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.FifthColor & 255) / 255.0F;
		this.Bodyglowgreen.copyFrom(this.body);
		Bodyglowgreen.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmglowgreen.copyFrom(this.rightArm);
		RightArmglowgreen.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmgreenglow.copyFrom(this.leftArm);
		LeftArmgreenglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLeggreenglow.copyFrom(this.rightLeg);
		RightLeggreenglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegglowgreen.copyFrom(this.leftLeg);
		LeftLegglowgreen.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.FourthColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.FourthColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.FourthColor & 255) / 255.0F;
		this.Body4middlething.copyFrom(this.body);
		Body4middlething.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
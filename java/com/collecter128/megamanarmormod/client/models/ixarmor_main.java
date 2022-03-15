package com.collecter128.megamanarmormod.client.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EquipmentSlotType;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class ixarmor_main extends BipedModel {
	private final ModelRenderer Head;
	private final ModelRenderer Head2;
	private final ModelRenderer Head3;
	private final ModelRenderer Head4;
	private final ModelRenderer Headwhite;
	private final ModelRenderer HeadGray;
	private final ModelRenderer Headglow;
	private final ModelRenderer Body;
	private final ModelRenderer Body2;
	private final ModelRenderer Body3;
	private final ModelRenderer Bodysilver;
	private final ModelRenderer Bodywhite;
	private final ModelRenderer RightArm;
	private final ModelRenderer RightArm2;
	private final ModelRenderer RightArmgray;
	private final ModelRenderer RightArmsilver;
	private final ModelRenderer RightArmred;
	private final ModelRenderer LeftArm;
	private final ModelRenderer LeftArm2;
	private final ModelRenderer LeftArmgray;
	private final ModelRenderer LeftArmsilver;
	private final ModelRenderer LeftArmred;
	private final ModelRenderer RightLeg;
	private final ModelRenderer RightLegwhite;
	private final ModelRenderer cube_r1;
	private final ModelRenderer RightLeg_r1;
	private final ModelRenderer RightLeggray;
	private final ModelRenderer cube_r2;
	private final ModelRenderer RightLegglow;
	private final ModelRenderer cube_r3;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer LeftLegWhite;
	private final ModelRenderer cube_r4;
	private final ModelRenderer LeftLeg_r2;
	private final ModelRenderer LeftLeggray;
	private final ModelRenderer cube_r5;
	private final ModelRenderer LeftLegglow;
	private final ModelRenderer cube_r6;
	
	public int MainColor;
	public int SecondaryColor;
	public int WhiteColor;
	public int ThirdColor;
	public int GlowyColor;
	public int GrayColor;
	public int MainColorDefault;
	public int SecondaryColorDefault;
	public int WhiteColorDefault;
	public int ThirdColorDefault;
	public int GlowyColorDefault;
	public int GrayColorDefault;
	
	EquipmentSlotType equipmentslot;

	public ixarmor_main(float modelSize, EquipmentSlotType slot) {
		super(modelSize);
		textureWidth = 72;
		textureHeight = 164;
		
		this.equipmentslot = slot;
		
		MainColorDefault = 2196050;//Main Body Color Greenish
		SecondaryColorDefault = 8507304;// Weird Greenish color
		ThirdColorDefault = 14227325; // Purpleishcolor
		WhiteColorDefault = 15325417;// ???
		GlowyColorDefault = 14680095;// ???
		GrayColorDefault = 8479030;// ???
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(Head, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Head2 = new ModelRenderer(this);
		Head2.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(Head2, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head2.setTextureOffset(49, 83).addBox(-1.0F, -9.0713F, -3.8955F, 2.0F, 6.0F, 9.0F, 0.4F, false);
		Head2.setTextureOffset(38, 98).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Head2.setTextureOffset(34, 0).addBox(5.2256F, -3.0986F, 1.3018F, 1.0F, 1.0F, 1.0F, 0.5F, false);
		Head2.setTextureOffset(34, 4).addBox(-6.1554F, -3.0986F, 1.339F, 1.0F, 1.0F, 1.0F, 0.5F, false);
		}
		
		Head3 = new ModelRenderer(this);
		Head3.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(Head3, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head3.setTextureOffset(0, 66).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Head4 = new ModelRenderer(this);
		Head4.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(Head4, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head4.setTextureOffset(25, 1).addBox(-2.5F, -9.7F, -5.0F, 5.0F, 5.0F, 0.0F, 0.1F, false);
		}
		
		Headwhite = new ModelRenderer(this);
		Headwhite.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headwhite, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headwhite.setTextureOffset(56, 2).addBox(-1.5F, -8.5055F, -5.0955F, 3.0F, 3.0F, 1.0F, 0.08F, false);
		}
		
		HeadGray = new ModelRenderer(this);
		HeadGray.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(HeadGray, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		HeadGray.setTextureOffset(2, 60).addBox(5.3128F, -4.0F, 0.4156F, 1.0F, 3.0F, 3.0F, 0.5F, false);
		HeadGray.setTextureOffset(2, 53).addBox(-6.0682F, -4.0F, 0.4528F, 1.0F, 3.0F, 3.0F, 0.5F, false);
		HeadGray.setTextureOffset(32, 0).addBox(-3.6706F, -7.6327F, -3.8533F, 8.0F, 7.0F, 8.0F, 0.55F, false);
		}
		
		Headglow = new ModelRenderer(this);
		Headglow.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headglow, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headglow.setTextureOffset(3, 86).addBox(-3.3526F, -3.8F, 0.5093F, 8.0F, 3.0F, 3.0F, 1.0F, false);
		Headglow.setTextureOffset(4, 49).addBox(-1.0F, -8.0055F, -5.4762F, 2.0F, 2.0F, 1.0F, 0.1F, false);
		Headglow.setTextureOffset(66, 4).addBox(-0.9128F, -2.2F, 4.0093F, 2.0F, 1.0F, 1.0F, 0.4F, false);
		}
		
		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Body.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);
		}
		
		Body2 = new ModelRenderer(this);
		Body2.setRotationPoint(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Body2.setTextureOffset(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		}
		
		Body3 = new ModelRenderer(this);
		Body3.setRotationPoint(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Body3.setTextureOffset(0, 98).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);
		}
		
		Bodysilver = new ModelRenderer(this);
		Bodysilver.setRotationPoint(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodysilver.setTextureOffset(16, 48).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		}
		
		Bodywhite = new ModelRenderer(this);
		Bodywhite.setRotationPoint(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodywhite.setTextureOffset(31, 119).addBox(-0.5F, 1.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Bodywhite.setTextureOffset(24, 122).addBox(-0.5F, -1.7F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Bodywhite.setTextureOffset(19, 122).addBox(-0.5F, -1.7F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Bodywhite.setTextureOffset(19, 120).addBox(-3.0F, -1.7F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Bodywhite.setTextureOffset(24, 120).addBox(2.0F, -1.7F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Bodywhite.setTextureOffset(5, 114).addBox(1.5F, -1.7F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Bodywhite.setTextureOffset(15, 114).addBox(-2.5F, -1.7F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Bodywhite.setTextureOffset(10, 114).addBox(-2.5F, -1.7F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Bodywhite.setTextureOffset(0, 114).addBox(1.5F, -1.7F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Bodywhite.setTextureOffset(0, 118).addBox(-2.0F, -1.7F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		Bodywhite.setTextureOffset(31, 121).addBox(-0.5F, 3.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		}
		
		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArm, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArm.setTextureOffset(40, 16).addBox(-4.0F, -3.2019F, -2.0F, 4.0F, 4.0F, 4.0F, 0.8F, false);
		RightArm.setTextureOffset(40, 58).addBox(-3.0F, 4.6239F, -1.8264F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		RightArm2 = new ModelRenderer(this);
		RightArm2.setRotationPoint(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArm2, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArm2.setTextureOffset(40, 24).addBox(-3.0F, -2.0152F, -1.8264F, 4.0F, 13.0F, 4.0F, 0.5F, false);
		}
		
		RightArmgray = new ModelRenderer(this);
		RightArmgray.setRotationPoint(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmgray, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmgray.setTextureOffset(40, 41).addBox(-3.0F, -2.0152F, -1.8264F, 4.0F, 13.0F, 4.0F, 0.5F, false);
		}
		
		RightArmsilver = new ModelRenderer(this);
		RightArmsilver.setRotationPoint(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmsilver, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmsilver.setTextureOffset(39, 113).addBox(-3.0F, 4.6239F, -1.8264F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		RightArmsilver.setTextureOffset(37, 122).addBox(-1.5F, 8.2F, -3.3615F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightArmsilver.setTextureOffset(42, 122).addBox(-4.5F, 8.2F, -0.2335F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightArmsilver.setTextureOffset(47, 122).addBox(1.5F, 8.2F, -0.2335F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightArmsilver.setTextureOffset(52, 122).addBox(-1.5F, 8.2F, 2.8946F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		}
		
		RightArmred = new ModelRenderer(this);
		RightArmred.setRotationPoint(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmred, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmred.setTextureOffset(40, 66).addBox(-3.0F, -2.0152F, -1.8264F, 4.0F, 13.0F, 4.0F, 0.5F, false);
		}
		
		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArm, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArm.setTextureOffset(56, 16).addBox(0.0F, -2.3974F, -2.0F, 4.0F, 4.0F, 4.0F, 0.8F, false);
		LeftArm.setTextureOffset(56, 58).addBox(-1.0F, 4.6173F, -2.2079F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		LeftArm2 = new ModelRenderer(this);
		LeftArm2.setRotationPoint(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArm2, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArm2.setTextureOffset(56, 24).addBox(-1.0F, -2.0218F, -2.2079F, 4.0F, 13.0F, 4.0F, 0.5F, true);
		}
		
		LeftArmgray = new ModelRenderer(this);
		LeftArmgray.setRotationPoint(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgray, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmgray.setTextureOffset(56, 41).addBox(-1.0F, -2.0218F, -2.2079F, 4.0F, 13.0F, 4.0F, 0.5F, true);
		}
		
		LeftArmsilver = new ModelRenderer(this);
		LeftArmsilver.setRotationPoint(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmsilver, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmsilver.setTextureOffset(56, 113).addBox(-1.0F, 4.6173F, -2.2079F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		LeftArmsilver.setTextureOffset(31, 123).addBox(0.5F, 8.2F, -4.035F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		LeftArmsilver.setTextureOffset(58, 122).addBox(3.5F, 7.9921F, -0.4782F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		LeftArmsilver.setTextureOffset(68, 122).addBox(-2.5F, 7.9921F, -0.4782F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		LeftArmsilver.setTextureOffset(63, 122).addBox(0.5F, 8.2F, 2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		}
		
		LeftArmred = new ModelRenderer(this);
		LeftArmred.setRotationPoint(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmred, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmred.setTextureOffset(56, 66).addBox(-1.0F, -2.0218F, -2.2079F, 4.0F, 13.0F, 4.0F, 0.5F, true);
		}
		
		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeg, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLeg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLegwhite = new ModelRenderer(this);
		RightLegwhite.setRotationPoint(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegwhite, 0.192F, 0.0F, 0.0349F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		RightLegwhite.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.2182F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		cube_r1.setTextureOffset(65, 13).addBox(2.45F, 8.9242F, 1.595F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(65, 9).addBox(-3.5795F, 9.0986F, 1.5995F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(24, 141).addBox(1.4175F, 9.0289F, -2.4037F, 1.0F, 1.0F, 1.0F, 0.1F, false);
		cube_r1.setTextureOffset(24, 141).addBox(-0.5813F, 9.0986F, -2.4018F, 1.0F, 1.0F, 1.0F, 0.1F, false);
		cube_r1.setTextureOffset(19, 141).addBox(-2.5801F, 9.1684F, -2.4F, 1.0F, 1.0F, 1.0F, 0.1F, false);
		}
		
		RightLeg_r1 = new ModelRenderer(this);
		RightLeg_r1.setRotationPoint(1.9F, 12.0F, 0.0F);
		RightLegwhite.addChild(RightLeg_r1);
		setRotationAngle(RightLeg_r1, -0.2182F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLeg_r1.setTextureOffset(1, 160).addBox(-4.0F, -2.1269F, -2.6519F, 4.0F, 0.0F, 1.0F, 1.2F, false);
		}
		
		RightLeggray = new ModelRenderer(this);
		RightLeggray.setRotationPoint(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeggray, 0.192F, 0.0F, 0.0349F);
		

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		RightLeggray.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.2182F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		cube_r2.setTextureOffset(25, 157).addBox(2.4518F, 7.9146F, 0.6206F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		cube_r2.setTextureOffset(15, 157).addBox(-3.5446F, 8.1238F, 0.626F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		}
		
		RightLegglow = new ModelRenderer(this);
		RightLegglow.setRotationPoint(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegglow, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegglow.setTextureOffset(27, 103).addBox(-0.8947F, 14.2F, -1.0F, 2.0F, 1.0F, 2.0F, 1.0F, false);
		}
		
		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		RightLegglow.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.2182F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		cube_r3.setTextureOffset(38, 86).addBox(2.2F, 8.9242F, 1.595F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r3.setTextureOffset(38, 84).addBox(-3.4F, 9.1335F, 1.6005F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		}
	/////////////////////////////////////////////////////////////
		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeg, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLeg.setTextureOffset(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLegWhite = new ModelRenderer(this);
		LeftLegWhite.setRotationPoint(5.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegWhite, -0.1745F, 0.0F, -0.0349F);
		

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-3.8F, 0.0F, 0.0F);
		LeftLegWhite.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.2182F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		cube_r4.setTextureOffset(10, 62).addBox(5.45F, 8.9242F, 1.595F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r4.setTextureOffset(10, 54).addBox(0.5795F, 9.0986F, 1.5995F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r4.setTextureOffset(29, 143).addBox(5.4175F, 9.0289F, -2.4037F, 1.0F, 1.0F, 1.0F, 0.1F, false);
		cube_r4.setTextureOffset(24, 143).addBox(3.5813F, 9.0986F, -2.4018F, 1.0F, 1.0F, 1.0F, 0.1F, false);
		cube_r4.setTextureOffset(19, 143).addBox(1.5801F, 9.1684F, -2.4F, 1.0F, 1.0F, 1.0F, 0.1F, false);
		}

		LeftLeg_r2 = new ModelRenderer(this);
		LeftLeg_r2.setRotationPoint(-1.9F, 12.0F, 0.0F);
		LeftLegWhite.addChild(LeftLeg_r2);
		setRotationAngle(LeftLeg_r2, -0.2182F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.FEET) {
			LeftLeg_r2.setTextureOffset(1, 160).addBox(0.0F, -2.1269F, -2.6519F, 4.0F, 0.0F, 1.0F, 1.2F, false);
		}
		
		LeftLeggray = new ModelRenderer(this);
		LeftLeggray.setRotationPoint(5.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeggray, -0.1745F, 0.0F, -0.0349F);
		
//Something may still be off here
		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-3.8F, 0.0F, 0.0F);
		LeftLeggray.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.2182F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.FEET) {//+4 added like above
		cube_r5.setTextureOffset(63, 157).addBox(6.4518F, 7.9146F, 0.6206F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		cube_r5.setTextureOffset(52, 157).addBox(1.5446F, 8.1238F, 0.626F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		}
		
		LeftLegglow = new ModelRenderer(this);
		LeftLegglow.setRotationPoint(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegglow, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegglow.setTextureOffset(27, 110).addBox(-1.2791F, 14.2F, -1.0F, 2.0F, 1.0F, 2.0F, 1.0F, true);
		}
		
		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-3.8F, 0.0F, 0.0F);
		LeftLegglow.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.2182F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		cube_r6.setTextureOffset(38, 90).addBox(6.1976F, 9.0532F, 1.6484F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r6.setTextureOffset(38, 88).addBox(0.5976F, 9.2625F, 1.6539F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		}
	}

//	@Override
//	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
//		//previously the render function, render code was moved to a method below
//	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		
		float fred = (float)( this.MainColor >> 16 & 255) / 255.0F;
        float fgreen = (float)(this.MainColor >> 8 & 255) / 255.0F;
        float fblue = (float)(this.MainColor & 255) / 255.0F;
		this.Head.copyModelAngles(this.bipedHead);
		Head.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Body.copyModelAngles(this.bipedBody);
		Body.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArm.copyModelAngles(this.bipedRightArm);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArm.copyModelAngles(this.bipedLeftArm);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLeg.copyModelAngles(this.bipedRightLeg);
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeg.copyModelAngles(this.bipedLeftLeg);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
		this.Head2.copyModelAngles(this.bipedHead);
		Head2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Body2.copyModelAngles(this.bipedBody);
		Body2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArm2.copyModelAngles(this.bipedRightArm);
		RightArm2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArm2.copyModelAngles(this.bipedLeftArm);
		LeftArm2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.ThirdColor & 255) / 255.0F;
		this.Head3.copyModelAngles(this.bipedHead);
		Head3.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Body3.copyModelAngles(this.bipedBody);
		Body3.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		
		this.Head4.copyModelAngles(this.bipedHead);
		Head4.render(matrixStack, buffer, packedLight, packedOverlay);
		
		fred = (float)( this.WhiteColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.WhiteColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.WhiteColor & 255) / 255.0F;
		this.Headwhite.copyModelAngles(this.bipedHead);
		Headwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodywhite.copyModelAngles(this.bipedBody);
		Bodywhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegwhite.copyModelAngles(this.bipedRightLeg);
		RightLegwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegWhite.copyModelAngles(this.bipedLeftLeg);
		LeftLegWhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		this.Bodysilver.copyModelAngles(this.bipedBody);
		Bodysilver.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmsilver.copyModelAngles(this.bipedRightArm);
		RightArmsilver.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmsilver.copyModelAngles(this.bipedLeftArm);
		LeftArmsilver.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GrayColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GrayColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GrayColor & 255) / 255.0F;
		this.HeadGray.copyModelAngles(this.bipedHead);
		HeadGray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmgray.copyModelAngles(this.bipedRightArm);
		RightArmgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmgray.copyModelAngles(this.bipedLeftArm);
		LeftArmgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLeggray.copyModelAngles(this.bipedRightLeg);
		RightLeggray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeggray.copyModelAngles(this.bipedLeftLeg);
		LeftLeggray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
		this.Headglow.copyModelAngles(this.bipedHead);
		Headglow.render(matrixStack, buffer, 15728640, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegglow.copyModelAngles(this.bipedRightLeg);
		RightLegglow.render(matrixStack, buffer, 15728640, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegglow.copyModelAngles(this.bipedLeftLeg);
		LeftLegglow.render(matrixStack, buffer, 15728640, packedOverlay, fred, fgreen, fblue, alpha);
		
		this.RightArmred.copyModelAngles(this.bipedRightArm);
		RightArmred.render(matrixStack, buffer, packedLight, packedOverlay);
		this.LeftArmred.copyModelAngles(this.bipedLeftArm);
		LeftArmred.render(matrixStack, buffer, packedLight, packedOverlay);

	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
package com.collecter128.megamanarmormod.client.models;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports

@OnlyIn(Dist.CLIENT)
public class agile extends BipedModel {
	private final ModelRenderer Headskin;
	private final ModelRenderer Headpurple;
	private final ModelRenderer Headgray;
	private final ModelRenderer Headyellow;
	private final ModelRenderer Headglowred;
	private final ModelRenderer Headglowpink;
	private final ModelRenderer Bodypurple;
	private final ModelRenderer Bodyred;
	private final ModelRenderer Bodyredglow;
	private final ModelRenderer Bodygray;
	private final ModelRenderer Bodywhite;
	private final ModelRenderer Bodygreen;
	private final ModelRenderer RightArmpurple;
	private final ModelRenderer cube_r1;
	private final ModelRenderer RightArmgray;
	private final ModelRenderer cube_r2;
	private final ModelRenderer RightArmred;
	private final ModelRenderer cube_r3;
	private final ModelRenderer RightArmgreen;
	private final ModelRenderer cube_r4;
	private final ModelRenderer RightArmblack;
	private final ModelRenderer RightArmwhite;
	private final ModelRenderer RightArmlightblue;
	private final ModelRenderer LeftArmpurple;
	private final ModelRenderer cube_r5;
	private final ModelRenderer LeftArmgray;
	private final ModelRenderer cube_r6;
	private final ModelRenderer LeftArmred;
	private final ModelRenderer cube_r7;
	private final ModelRenderer LeftArmgreen;
	private final ModelRenderer cube_r8;
	private final ModelRenderer LeftArmblack;
	private final ModelRenderer LeftArmwhite;
	private final ModelRenderer LeftArmlightblue;
	private final ModelRenderer RightLegpurple;
	private final ModelRenderer RightLeggray;
	private final ModelRenderer RightLegyellow;
	private final ModelRenderer RightLeglightblue;
	private final ModelRenderer RightLegred;
	private final ModelRenderer RightLegglowred;
	private final ModelRenderer LeftLegpurple;
	private final ModelRenderer LeftLeggray;
	private final ModelRenderer LeftLegyellow;
	private final ModelRenderer LeftLeglightblue;
	private final ModelRenderer LeftLegred;
	private final ModelRenderer LeftLegglowred;
	
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

	public agile(float modelSize, EquipmentSlotType slot) {
		super(modelSize);
		texWidth = 89;
		texHeight = 274;
		
		equipmentslot = slot;
		
		MainColorDefault = 12348640;//Main Body Color Purple
		SecondaryColorDefault = 58998;//Secondary Green
		ThirdColorDefault = 15129344; //Yellow
		WhiteColorDefault = 16642786;//Basic White
		GlowyColorDefault = 16715013;//Glow? red
		GrayColorDefault = 15722706;//Gray
		FourthColorDefault = 5066592; //Black
		FifthColorDefault = 16679362; //Pink
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
		FourthColor = FourthColorDefault;
		FifthColor = FifthColorDefault;

		Headskin = new ModelRenderer(this);
		Headskin.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headskin, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headskin.texOffs(1, 9).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Headpurple = new ModelRenderer(this);
		Headpurple.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headpurple, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headpurple.texOffs(0, 137).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headpurple.texOffs(1, 0).addBox(-2.5F, -13.0F, -4.0F, 5.0F, 4.0F, 5.0F, 0.5F, false);
		Headpurple.texOffs(36, 6).addBox(-4.0F, -11.0F, -4.0F, 8.0F, 11.0F, 8.0F, 1.3F, false);
		}
		
		Headgray = new ModelRenderer(this);
		Headgray.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headgray, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headgray.texOffs(0, 117).addBox(-4.0F, -11.0F, -4.0F, 8.0F, 11.0F, 8.0F, 1.3F, false);
		Headgray.texOffs(0, 188).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headgray.texOffs(69, 10).addBox(-2.5F, -13.0F, -4.0F, 5.0F, 4.0F, 5.0F, 0.5F, false);
		}
		
		Headyellow = new ModelRenderer(this);
		Headyellow.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headyellow, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headyellow.texOffs(0, 171).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headyellow.texOffs(69, 0).addBox(-2.5F, -13.0F, -4.0F, 5.0F, 4.0F, 5.0F, 0.5F, false);
		}
		
		Headglowred = new ModelRenderer(this);
		Headglowred.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headglowred, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headglowred.texOffs(0, 154).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Headglowpink = new ModelRenderer(this);
		Headglowpink.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headglowpink, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headglowpink.texOffs(33, 120).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Bodypurple = new ModelRenderer(this);
		Bodypurple.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodypurple.texOffs(17, 25).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);
		}
		
		Bodyred = new ModelRenderer(this);
		Bodyred.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyred.texOffs(0, 223).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);
		}
		
		Bodyredglow = new ModelRenderer(this);
		Bodyredglow.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyredglow.texOffs(0, 205).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);
		}
		
		Bodygray = new ModelRenderer(this);
		Bodygray.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodygray.texOffs(17, 57).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		Bodygray.texOffs(62, 84).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);
		}
		
		Bodywhite = new ModelRenderer(this);
		Bodywhite.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodywhite.texOffs(26, 216).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		}
		
		Bodygreen = new ModelRenderer(this);
		Bodygreen.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodygreen.texOffs(17, 41).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		Bodygreen.texOffs(62, 102).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);
		}
		
		RightArmpurple = new ModelRenderer(this);
		RightArmpurple.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmpurple, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmpurple.texOffs(41, 41).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(1.0F, 1.0F, 0.0F);
		RightArmpurple.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.1745F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		cube_r1.texOffs(42, 51).addBox(-8.0F, -4.2019F, -2.0F, 7.0F, 4.0F, 4.0F, 0.8F, false);
		}
		
		RightArmgray = new ModelRenderer(this);
		RightArmgray.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmgray, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmgray.texOffs(42, 74).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(1.0F, 1.0F, 0.0F);
		RightArmgray.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.1745F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		cube_r2.texOffs(65, 51).addBox(-8.0F, -4.2019F, -2.0F, 7.0F, 4.0F, 4.0F, 0.8F, false);
		}
		
		RightArmred = new ModelRenderer(this);
		RightArmred.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmred, -0.1745F, 0.0F, 0.0F);
		

		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(1.0F, 1.0F, 0.0F);
		RightArmred.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.1745F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		cube_r3.texOffs(42, 137).addBox(-8.0F, -4.2019F, -2.0F, 7.0F, 4.0F, 4.0F, 0.8F, false);
		}
		
		RightArmgreen = new ModelRenderer(this);
		RightArmgreen.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmgreen, -0.1745F, 0.0F, 0.0F);
		

		cube_r4 = new ModelRenderer(this);
		cube_r4.setPos(1.0F, 1.0F, 0.0F);
		RightArmgreen.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.1745F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		cube_r4.texOffs(65, 137).addBox(-8.0F, -4.2019F, -2.0F, 7.0F, 4.0F, 4.0F, 0.8F, false);
		}
		
		RightArmblack = new ModelRenderer(this);
		RightArmblack.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmblack, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmblack.texOffs(41, 25).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		RightArmwhite = new ModelRenderer(this);
		RightArmwhite.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmwhite, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmwhite.texOffs(36, 195).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		RightArmlightblue = new ModelRenderer(this);
		RightArmlightblue.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmlightblue, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmlightblue.texOffs(36, 177).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		LeftArmpurple = new ModelRenderer(this);
		LeftArmpurple.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmpurple, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmpurple.texOffs(58, 41).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		cube_r5 = new ModelRenderer(this);
		cube_r5.setPos(-1.0F, 0.0F, 0.0F);
		LeftArmpurple.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.1745F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		cube_r5.texOffs(42, 62).addBox(1.0F, -3.3974F, -2.0F, 7.0F, 4.0F, 4.0F, 0.8F, false);
		}
		
		LeftArmgray = new ModelRenderer(this);
		LeftArmgray.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgray, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmgray.texOffs(59, 74).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		cube_r6 = new ModelRenderer(this);
		cube_r6.setPos(-1.0F, 0.0F, 0.0F);
		LeftArmgray.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -0.1745F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		cube_r6.texOffs(65, 62).addBox(1.0F, -3.3974F, -2.0F, 7.0F, 4.0F, 4.0F, 0.8F, false);
		}
		
		LeftArmred = new ModelRenderer(this);
		LeftArmred.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmred, 0.2094F, 0.0F, 0.0F);
		

		cube_r7 = new ModelRenderer(this);
		cube_r7.setPos(-1.0F, 0.0F, 0.0F);
		LeftArmred.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.1745F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		cube_r7.texOffs(42, 148).addBox(1.0F, -3.3974F, -2.0F, 7.0F, 4.0F, 4.0F, 0.8F, false);
		}
		
		LeftArmgreen = new ModelRenderer(this);
		LeftArmgreen.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgreen, 0.2094F, 0.0F, 0.0F);
		

		cube_r8 = new ModelRenderer(this);
		cube_r8.setPos(-1.0F, 0.0F, 0.0F);
		LeftArmgreen.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.1745F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		cube_r8.texOffs(65, 148).addBox(1.0F, -3.3974F, -2.0F, 7.0F, 4.0F, 4.0F, 0.8F, false);
		}
		
		LeftArmblack = new ModelRenderer(this);
		LeftArmblack.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmblack, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmblack.texOffs(58, 25).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		LeftArmwhite = new ModelRenderer(this);
		LeftArmwhite.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmwhite, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmwhite.texOffs(53, 195).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		LeftArmlightblue = new ModelRenderer(this);
		LeftArmlightblue.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmlightblue, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmlightblue.texOffs(53, 177).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		RightLegpurple = new ModelRenderer(this);
		RightLegpurple.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegpurple, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegpurple.texOffs(1, 25).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLeggray = new ModelRenderer(this);
		RightLeggray.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeggray, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLeggray.texOffs(70, 158).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLegyellow = new ModelRenderer(this);
		RightLegyellow.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegyellow, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegyellow.texOffs(0, 240).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLeglightblue = new ModelRenderer(this);
		RightLeglightblue.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeglightblue, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLeglightblue.texOffs(52, 240).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLegred = new ModelRenderer(this);
		RightLegred.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegred, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegred.texOffs(17, 240).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLegglowred = new ModelRenderer(this);
		RightLegglowred.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegglowred, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegglowred.texOffs(35, 240).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		LeftLegpurple = new ModelRenderer(this);
		LeftLegpurple.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegpurple, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegpurple.texOffs(1, 41).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLeggray = new ModelRenderer(this);
		LeftLeggray.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeggray, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLeggray.texOffs(70, 174).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLegyellow = new ModelRenderer(this);
		LeftLegyellow.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegyellow, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegyellow.texOffs(0, 258).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLeglightblue = new ModelRenderer(this);
		LeftLeglightblue.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeglightblue, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLeglightblue.texOffs(52, 258).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLegred = new ModelRenderer(this);
		LeftLegred.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegred, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegred.texOffs(17, 258).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLegglowred = new ModelRenderer(this);
		LeftLegglowred.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegglowred, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegglowred.texOffs(35, 258).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
	}

//	@Override
//	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
//		//previously the render function, render code was moved to a method below
//	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		
		this.Headskin.copyFrom(this.head);
		Headskin.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		
		float fred = (float)( this.MainColor >> 16 & 255) / 255.0F;
        float fgreen = (float)(this.MainColor >> 8 & 255) / 255.0F;
        float fblue = (float)(this.MainColor & 255) / 255.0F;
		this.Headpurple.copyFrom(this.head);
		Headpurple.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodypurple.copyFrom(this.body);
		Bodypurple.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmpurple.copyFrom(this.rightArm);
		RightArmpurple.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmpurple.copyFrom(this.leftArm);
		LeftArmpurple.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegpurple.copyFrom(this.rightLeg);
		RightLegpurple.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegpurple.copyFrom(this.leftLeg);
		LeftLegpurple.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
		this.Bodygreen.copyFrom(this.body);
		Bodygreen.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmgreen.copyFrom(this.rightArm);
		RightArmgreen.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmgreen.copyFrom(this.leftArm);
		LeftArmgreen.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.FourthColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.FourthColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.FourthColor & 255) / 255.0F;
		this.RightArmblack.copyFrom(this.rightArm);
		RightArmblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmblack.copyFrom(this.leftArm);
		LeftArmblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
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
		
		
		this.RightArmlightblue.copyFrom(this.rightArm);
		RightArmlightblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmlightblue.copyFrom(this.leftArm);
		LeftArmlightblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLeglightblue.copyFrom(this.rightLeg);
		RightLeglightblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeglightblue.copyFrom(this.leftLeg);
		LeftLeglightblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.WhiteColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.WhiteColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.WhiteColor & 255) / 255.0F;
		this.Bodywhite.copyFrom(this.body);
		Bodywhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmwhite.copyFrom(this.rightArm);
		RightArmwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmwhite.copyFrom(this.leftArm);
		LeftArmwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.ThirdColor & 255) / 255.0F;
		this.Headyellow.copyFrom(this.head);
		Headyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegyellow.copyFrom(this.rightLeg);
		RightLegyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegyellow.copyFrom(this.leftLeg);
		LeftLegyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
		this.Bodyred.copyFrom(this.body);
		Bodyred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmred.copyFrom(this.rightArm);
		RightArmred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmred.copyFrom(this.leftArm);
		LeftArmred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegred.copyFrom(this.rightLeg);
		RightLegred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegred.copyFrom(this.leftLeg);
		LeftLegred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		this.Headglowred.copyFrom(this.head);
		Headglowred.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodyredglow.copyFrom(this.body);
		Bodyredglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegglowred.copyFrom(this.rightLeg);
		RightLegglowred.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegglowred.copyFrom(this.leftLeg);
		LeftLegglowred.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.FifthColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.FifthColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.FifthColor & 255) / 255.0F;
		this.Headglowpink.copyFrom(this.head);
		Headglowpink.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
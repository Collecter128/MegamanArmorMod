package com.collecter128.megamanarmormod.client.models;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports

@OnlyIn(Dist.CLIENT)
public class fourtharmor extends BipedModel {
	private final ModelRenderer Headblue;
	private final ModelRenderer Head2;
	private final ModelRenderer Headgray;
	private final ModelRenderer Headwhite;
	private final ModelRenderer Headredglow;
	private final ModelRenderer Headyellow;
	private final ModelRenderer Head7_r1;
	private final ModelRenderer Bodyblue;
	private final ModelRenderer Bodywhite;
	private final ModelRenderer Body2;
	private final ModelRenderer Bodygray;
	private final ModelRenderer Bodyred;
	private final ModelRenderer Bodygreenglow;
	private final ModelRenderer RightArmblue;
	private final ModelRenderer RightArm2;
	private final ModelRenderer RightArmgray;
	private final ModelRenderer RightArmred;
	private final ModelRenderer RightArmwhite;
	private final ModelRenderer RightArmyellow;
	private final ModelRenderer LeftArmblue;
	private final ModelRenderer LeftArm2;
	private final ModelRenderer LeftArmgray;
	private final ModelRenderer LeftArmred;
	private final ModelRenderer LeftArmwhite;
	private final ModelRenderer LeftArmyellow;
	private final ModelRenderer RightLegblue;
	private final ModelRenderer RightLegwhite;
	private final ModelRenderer RightLegyellow;
	private final ModelRenderer RightLegred;
	private final ModelRenderer RightLeggray;
	private final ModelRenderer RightLeggreenglow;
	private final ModelRenderer LeftLegblue;
	private final ModelRenderer LeftLegwhite;
	private final ModelRenderer LeftLegyellow;
	private final ModelRenderer LeftLegred;
	private final ModelRenderer LeftLeggray;
	private final ModelRenderer LeftLeggreenglow;
	
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

	public fourtharmor(float modelSize, EquipmentSlotType slot) {
		super(modelSize);
		texWidth = 83;
		texHeight = 240;
		
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
		}
		Head2 = new ModelRenderer(this);
		Head2.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Head2, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head2.texOffs(0, 66).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Headgray = new ModelRenderer(this);
		Headgray.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headgray, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headgray.texOffs(32, 0).addBox(-3.6706F, -7.6327F, -3.8533F, 8.0F, 7.0F, 8.0F, 0.55F, false);
		}
		
		Headwhite = new ModelRenderer(this);
		Headwhite.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headwhite, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headwhite.texOffs(3, 60).addBox(5.4F, -5.9341F, -0.7842F, 1.0F, 3.0F, 3.0F, 0.5F, false);
		Headwhite.texOffs(3, 53).addBox(-5.981F, -5.938F, -0.747F, 1.0F, 3.0F, 3.0F, 0.5F, false);
		Headwhite.texOffs(44, 82).addBox(-1.0872F, -9.9562F, -5.4855F, 2.0F, 3.0F, 10.0F, 0.4F, false);
		Headwhite.texOffs(66, 3).addBox(-5.0872F, -8.9562F, -5.4855F, 4.0F, 2.0F, 1.0F, 0.4F, false);
		Headwhite.texOffs(66, 10).addBox(0.9128F, -8.9562F, -5.4855F, 4.0F, 2.0F, 1.0F, 0.4F, false);
		Headwhite.texOffs(0, 82).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Headredglow = new ModelRenderer(this);
		Headredglow.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headredglow, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headredglow.texOffs(13, 55).addBox(-1.0F, -8.8411F, -6.6852F, 2.0F, 2.0F, 1.0F, 0.1F, false);
		Headredglow.texOffs(29, 108).addBox(6.4F, -5.5F, 0.0F, 1.0F, 2.0F, 2.0F, 0.5F, false);
		Headredglow.texOffs(29, 101).addBox(-4.981F, -5.5F, 0.0F, 1.0F, 2.0F, 2.0F, 0.5F, false);
		}
		Headyellow = new ModelRenderer(this);
		Headyellow.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headyellow, -0.1047F, 0.0873F, 0.0F);
		

		Head7_r1 = new ModelRenderer(this);
		Head7_r1.setPos(0.0F, -4.0F, 0.0F);
		Headyellow.addChild(Head7_r1);
		setRotationAngle(Head7_r1, -0.829F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head7_r1.texOffs(69, 95).addBox(-7.6F, -8.5F, 0.0F, 1.0F, 6.0F, 2.0F, 0.5F, false);
		Head7_r1.texOffs(63, 95).addBox(6.4F, -8.5F, 0.0F, 1.0F, 6.0F, 2.0F, 0.5F, false);
		}
		
		Bodyblue = new ModelRenderer(this);
		Bodyblue.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyblue.texOffs(21, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);
		}
		
		Bodywhite = new ModelRenderer(this);
		Bodywhite.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodywhite.texOffs(35, 97).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);
		}
		
		Body2 = new ModelRenderer(this);
		Body2.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Body2.texOffs(21, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		}
		
		Bodygray = new ModelRenderer(this);
		Bodygray.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodygray.texOffs(21, 48).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		Bodygray.texOffs(59, 107).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);
		}
		
		Bodyred = new ModelRenderer(this);
		Bodyred.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyred.texOffs(0, 98).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);
		Bodyred.texOffs(67, 7).addBox(-1.0F, 3.0F, -3.0F, 2.0F, 2.0F, 1.0F, 0.5F, false);
		}
		
		Bodygreenglow = new ModelRenderer(this);
		Bodygreenglow.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodygreenglow.texOffs(25, 3).addBox(-1.0F, 1.5F, -3.0F, 2.0F, 2.0F, 1.0F, 0.3F, false);
		Bodygreenglow.texOffs(57, 3).addBox(-1.0F, 4.5F, -3.0F, 2.0F, 2.0F, 1.0F, 0.3F, false);
		}
		
		RightArmblue = new ModelRenderer(this);
		RightArmblue.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmblue, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmblue.texOffs(1, 152).addBox(-4.0F, -3.2019F, -2.0F, 4.0F, 4.0F, 4.0F, 0.8F, false);
		RightArmblue.texOffs(48, 48).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		RightArm2 = new ModelRenderer(this);
		RightArm2.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArm2, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArm2.texOffs(48, 24).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		RightArmgray = new ModelRenderer(this);
		RightArmgray.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmgray, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmgray.texOffs(40, 64).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		RightArmgray.texOffs(58, 122).addBox(-5.0F, -5.2019F, -0.5F, 3.0F, 1.0F, 1.0F, 0.3F, false);
		}
		
		RightArmred = new ModelRenderer(this);
		RightArmred.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmred, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmred.texOffs(69, 120).addBox(-5.0F, -8.2019F, 0.0F, 3.0F, 3.0F, 1.0F, 0.3F, false);
		}
		
		RightArmwhite = new ModelRenderer(this);
		RightArmwhite.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmwhite, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmwhite.texOffs(48, 40).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		RightArmwhite.texOffs(37, 152).addBox(-4.0F, -3.2019F, -2.0F, 4.0F, 4.0F, 4.0F, 0.8F, false);
		}
		
		RightArmyellow = new ModelRenderer(this);
		RightArmyellow.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmyellow, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmyellow.texOffs(50, 214).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		RightArmyellow.texOffs(48, 16).addBox(-4.0F, -3.2019F, -2.0F, 4.0F, 4.0F, 4.0F, 0.8F, false);
		}
		
		LeftArmblue = new ModelRenderer(this);
		LeftArmblue.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmblue, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmblue.texOffs(18, 152).addBox(0.0F, -2.3974F, -2.0F, 4.0F, 4.0F, 4.0F, 0.8F, false);
		LeftArmblue.texOffs(65, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		LeftArm2 = new ModelRenderer(this);
		LeftArm2.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArm2, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArm2.texOffs(65, 24).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		LeftArmgray = new ModelRenderer(this);
		LeftArmgray.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgray, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmgray.texOffs(57, 64).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArmgray.texOffs(58, 127).addBox(2.0F, -4.3974F, -0.5F, 3.0F, 1.0F, 1.0F, 0.3F, false);
		}
		
		LeftArmred = new ModelRenderer(this);
		LeftArmred.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmred, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmred.texOffs(69, 125).addBox(2.0F, -7.3974F, 0.0F, 3.0F, 3.0F, 1.0F, 0.3F, false);
		}
		
		LeftArmwhite = new ModelRenderer(this);
		LeftArmwhite.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmwhite, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmwhite.texOffs(65, 40).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		LeftArmwhite.texOffs(54, 152).addBox(0.0F, -2.3974F, -2.0F, 4.0F, 4.0F, 4.0F, 0.8F, false);
		}
		
		LeftArmyellow = new ModelRenderer(this);
		LeftArmyellow.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmyellow, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmyellow.texOffs(67, 214).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		LeftArmyellow.texOffs(65, 16).addBox(0.0F, -2.3974F, -2.0F, 4.0F, 4.0F, 4.0F, 0.8F, false);
		}
		
		RightLegblue = new ModelRenderer(this);
		RightLegblue.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegblue, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegblue.texOffs(0, 16).addBox(-2.6F, 0.0F, -2.5F, 5.0F, 12.0F, 5.0F, 0.5F, false);
		RightLegblue.texOffs(5, 201).addBox(-4.1F, 7.0F, -2.5F, 1.0F, 5.0F, 5.0F, -0.5F, false);
		}
		
		RightLegwhite = new ModelRenderer(this);
		RightLegwhite.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegwhite, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegwhite.texOffs(0, 163).addBox(-2.6F, 0.0F, -2.5F, 5.0F, 12.0F, 5.0F, 0.5F, false);
		RightLegwhite.texOffs(57, 130).addBox(-4.1F, 7.0F, -2.5F, 1.0F, 5.0F, 5.0F, -0.5F, false);
		}
		
		RightLegyellow = new ModelRenderer(this);
		RightLegyellow.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegyellow, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegyellow.texOffs(42, 182).addBox(-2.6F, 0.0F, -2.5F, 5.0F, 12.0F, 5.0F, 0.5F, false);
		RightLegyellow.texOffs(57, 201).addBox(-4.1F, 7.0F, -2.5F, 1.0F, 5.0F, 5.0F, -0.5F, false);
		}
		
		RightLegred = new ModelRenderer(this);
		RightLegred.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegred, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegred.texOffs(42, 223).addBox(-2.6F, 0.0F, -2.5F, 5.0F, 12.0F, 5.0F, 0.5F, false);
		RightLegred.texOffs(59, 145).addBox(-4.1F, 6.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		}
		
		RightLeggray = new ModelRenderer(this);
		RightLeggray.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeggray, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLeggray.texOffs(42, 163).addBox(-2.6F, 0.0F, -2.5F, 5.0F, 12.0F, 5.0F, 0.5F, false);
		}
		
		RightLeggreenglow = new ModelRenderer(this);
		RightLeggreenglow.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeggreenglow, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLeggreenglow.texOffs(0, 181).addBox(-2.6F, 0.0F, -2.5F, 5.0F, 12.0F, 5.0F, 0.5F, false);
		RightLeggreenglow.texOffs(31, 201).addBox(-4.1F, 7.0F, -2.5F, 1.0F, 5.0F, 5.0F, -0.5F, false);
		}
		
		LeftLegblue = new ModelRenderer(this);
		LeftLegblue.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegblue, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegblue.texOffs(0, 33).addBox(-2.4F, 0.0F, -2.5F, 5.0F, 12.0F, 5.0F, 0.5F, true);
		LeftLegblue.texOffs(18, 201).addBox(3.1F, 7.0F, -2.5F, 1.0F, 5.0F, 5.0F, -0.5F, true);
		}
		
		LeftLegwhite = new ModelRenderer(this);
		LeftLegwhite.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegwhite, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegwhite.texOffs(21, 163).addBox(-2.4F, 0.0F, -2.5F, 5.0F, 12.0F, 5.0F, 0.5F, true);
		LeftLegwhite.texOffs(70, 130).addBox(3.1F, 7.0F, -2.5F, 1.0F, 5.0F, 5.0F, -0.5F, true);
		}
		
		LeftLegyellow = new ModelRenderer(this);
		LeftLegyellow.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegyellow, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegyellow.texOffs(63, 182).addBox(-2.4F, 0.0F, -2.5F, 5.0F, 12.0F, 5.0F, 0.5F, true);
		LeftLegyellow.texOffs(70, 201).addBox(3.1F, 7.0F, -2.5F, 1.0F, 5.0F, 5.0F, -0.5F, true);
		}
		
		LeftLegred = new ModelRenderer(this);
		LeftLegred.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegred, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegred.texOffs(63, 223).addBox(-2.4F, 0.0F, -2.5F, 5.0F, 12.0F, 5.0F, 0.5F, true);
		LeftLegred.texOffs(66, 145).addBox(3.1F, 6.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);
		}
		
		LeftLeggray = new ModelRenderer(this);	
		LeftLeggray.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeggray, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLeggray.texOffs(63, 163).addBox(-2.4F, 0.0F, -2.5F, 5.0F, 12.0F, 5.0F, 0.5F, true);
		}
		
		LeftLeggreenglow = new ModelRenderer(this);
		LeftLeggreenglow.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeggreenglow, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLeggreenglow.texOffs(21, 181).addBox(-2.4F, 0.0F, -2.5F, 5.0F, 12.0F, 5.0F, 0.5F, true);
		LeftLeggreenglow.texOffs(44, 201).addBox(3.1F, 7.0F, -2.5F, 1.0F, 5.0F, 5.0F, -0.5F, true);
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
		this.Head2.copyFrom(this.head);
		Head2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Body2.copyFrom(this.body);
		Body2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArm2.copyFrom(this.rightArm);
		RightArm2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArm2.copyFrom(this.leftArm);
		LeftArm2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
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
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
		this.Headredglow.copyFrom(this.head);
		Headredglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		
		this.Bodyred.copyFrom(this.body);
		Bodyred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmred.copyFrom(this.rightArm);
		RightArmred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmred.copyFrom(this.leftArm);
		LeftArmred.render(matrixStack, buffer, packedLight, packedOverlay, fred,fgreen, fblue, alpha);
		this.RightLegred.copyFrom(this.rightLeg);
		RightLegred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegred.copyFrom(this.leftLeg);
		LeftLegred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.ThirdColor & 255) / 255.0F;
		this.Headyellow.copyFrom(this.head);
		Headyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmyellow.copyFrom(this.rightArm);
		RightArmyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmyellow.copyFrom(this.leftArm);
		LeftArmyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegyellow.copyFrom(this.rightLeg);
		RightLegyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegyellow.copyFrom(this.leftLeg);
		LeftLegyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.FifthColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.FifthColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.FifthColor & 255) / 255.0F;
		this.Bodygreenglow.copyFrom(this.body);
		Bodygreenglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLeggreenglow.copyFrom(this.rightLeg);
		RightLeggreenglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeggreenglow.copyFrom(this.leftLeg);
		LeftLeggreenglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
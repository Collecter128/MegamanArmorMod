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
public class flamingstormeagle extends BipedModel {
	private final ModelRenderer Headblack;
	private final ModelRenderer Headred;
	private final ModelRenderer Headwhite;
	private final ModelRenderer Headyellow;
	private final ModelRenderer Head5_r1;
	private final ModelRenderer Headeyes;
	private final ModelRenderer Headgray;
	private final ModelRenderer Headredglow;
	private final ModelRenderer Bodywhite;
	private final ModelRenderer Bodyyellow;
	private final ModelRenderer Bodyblack;
	private final ModelRenderer Bodygray;
	private final ModelRenderer Bodyred;
	private final ModelRenderer Bodyyellowglow;
	private final ModelRenderer RightArmwhite;
	private final ModelRenderer RightArm_r1;
	private final ModelRenderer RightArm_r2;
	private final ModelRenderer RightArm_r3;
	private final ModelRenderer RightArm_r4;
	private final ModelRenderer RightArm_r5;
	private final ModelRenderer RightArm_r6;
	private final ModelRenderer RightArm_r7;
	private final ModelRenderer RightArm_r8;
	private final ModelRenderer RightArm_r9;
	private final ModelRenderer RightArmyellow;
	private final ModelRenderer RightArmred;
	private final ModelRenderer RightArmredglow;
	private final ModelRenderer RightArmgray;
	private final ModelRenderer RightArmblack;
	private final ModelRenderer LeftArmyellow;
	private final ModelRenderer LeftArmblack;
	private final ModelRenderer LeftArmred;
	private final ModelRenderer LeftArmwhite;
	private final ModelRenderer LeftArm_r1;
	private final ModelRenderer LeftArm_r2;
	private final ModelRenderer LeftArm_r3;
	private final ModelRenderer LeftArm_r4;
	private final ModelRenderer LeftArm_r5;
	private final ModelRenderer LeftArm_r6;
	private final ModelRenderer LeftArm_r7;
	private final ModelRenderer LeftArm_r8;
	private final ModelRenderer LeftArm_r9;
	private final ModelRenderer LeftArmgray;
	private final ModelRenderer RightLegwhite;
	private final ModelRenderer RightLegred;
	private final ModelRenderer RightLegyellow;
	private final ModelRenderer RightLegblack;
	private final ModelRenderer RightLegredglow;
	private final ModelRenderer LeftLegwhite;
	private final ModelRenderer LeftLegred;
	private final ModelRenderer LeftLegyellow;
	private final ModelRenderer LeftLegblack;
	private final ModelRenderer LeftLegredglow;
	
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

	public flamingstormeagle(float modelSize, EquipmentSlotType slot) {
		super(modelSize);
		texWidth = 73;
		texHeight = 304;
		
		equipmentslot = slot;
		
		MainColorDefault = 16582664;//Main red
		SecondaryColorDefault = 16777215;//Secondary white?
		ThirdColorDefault = 16701968; //Yellow
		WhiteColorDefault = 16777215;//Basic White
		GlowyColorDefault = 16582664;//Glow? Red
		GrayColorDefault = 13421772;//Gray
		FourthColorDefault = 4868682; // Black
		FifthColorDefault = 16582664; // red
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
		FourthColor = FourthColorDefault;
		FifthColor = FifthColorDefault;

		Headblack = new ModelRenderer(this);
		Headblack.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headblack.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Headred = new ModelRenderer(this);
		Headred.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headred.texOffs(0, 247).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Headwhite = new ModelRenderer(this);
		Headwhite.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headwhite.texOffs(40, 288).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Headyellow = new ModelRenderer(this);
		Headyellow.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headyellow.texOffs(33, 230).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Head5_r1 = new ModelRenderer(this);
		Head5_r1.setPos(0.0F, -2.0F, 0.0F);
		Headyellow.addChild(Head5_r1);
		setRotationAngle(Head5_r1, 0.0F, -0.7854F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head5_r1.texOffs(57, 2).addBox(-4.5F, 0.0F, -4.5F, 2.0F, 1.0F, 2.0F, 0.5F, false);
		Head5_r1.texOffs(24, 1).addBox(-5.0F, -1.0F, -5.0F, 2.0F, 2.0F, 2.0F, 1.0F, false);
		}
		
		Headeyes = new ModelRenderer(this);
		Headeyes.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headeyes.texOffs(0, 230).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Headgray = new ModelRenderer(this);
		Headgray.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headgray.texOffs(33, 247).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Headredglow = new ModelRenderer(this);
		Headredglow.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headredglow.texOffs(33, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Bodywhite = new ModelRenderer(this);
		Bodywhite.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodywhite.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		Bodywhite.texOffs(3, 176).addBox(4.5F, -10.0F, 6.0F, 15.0F, 17.0F, 1.0F, 0.51F, false);
		Bodywhite.texOffs(36, 176).addBox(-19.5F, -10.0F, 6.0F, 15.0F, 17.0F, 1.0F, 0.51F, false);
		Bodywhite.texOffs(44, 156).addBox(-0.5F, 0.0F, 3.0F, 1.0F, 5.0F, 1.0F, 0.51F, false);
		Bodywhite.texOffs(40, 153).addBox(-1.5F, 4.0F, 5.0F, 3.0F, 1.0F, 1.0F, 0.51F, false);
		Bodywhite.texOffs(48, 153).addBox(-1.5F, 0.0F, 5.0F, 3.0F, 1.0F, 1.0F, 0.51F, false);
		}
		
		Bodyyellow = new ModelRenderer(this);
		Bodyyellow.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyyellow.texOffs(16, 144).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		Bodyyellow.texOffs(59, 266).addBox(-2.5F, 5.0F, -2.8F, 5.0F, 5.0F, 1.0F, 0.0F, false);
		}
		
		Bodyblack = new ModelRenderer(this);
		Bodyblack.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyblack.texOffs(59, 278).addBox(-2.5F, 5.0F, -2.8F, 5.0F, 5.0F, 1.0F, 0.0F, false);
		}
		
		Bodygray = new ModelRenderer(this);
		Bodygray.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodygray.texOffs(16, 48).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.31F, false);
		Bodygray.texOffs(16, 128).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		Bodygray.texOffs(48, 163).addBox(-1.5F, 4.0F, 5.0F, 3.0F, 1.0F, 1.0F, 0.51F, false);
		Bodygray.texOffs(48, 166).addBox(-1.5F, 0.0F, 5.0F, 3.0F, 1.0F, 1.0F, 0.51F, false);
		}
		
		Bodyred = new ModelRenderer(this);
		Bodyred.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyred.texOffs(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.31F, false);
		Bodyred.texOffs(49, 156).addBox(-0.5F, 0.0F, 3.0F, 1.0F, 5.0F, 1.0F, 0.51F, false);
		Bodyred.texOffs(42, 166).addBox(2.5F, -1.0F, 4.0F, 2.0F, 6.0F, 2.0F, 0.51F, false);
		Bodyred.texOffs(41, 164).addBox(3.0F, -3.0F, 4.5F, 1.0F, 1.0F, 1.0F, 0.51F, false);
		Bodyred.texOffs(0, 213).addBox(-4.0F, -3.0F, 4.5F, 1.0F, 1.0F, 1.0F, 0.51F, false);
		Bodyred.texOffs(1, 215).addBox(-4.5F, -1.0F, 4.0F, 2.0F, 6.0F, 2.0F, 0.51F, false);
		Bodyred.texOffs(35, 161).addBox(1.2F, 3.0F, -3.0F, 2.0F, 2.0F, 1.0F, 0.15F, false);
		Bodyred.texOffs(35, 161).addBox(-3.2F, 3.0F, -3.0F, 2.0F, 2.0F, 1.0F, 0.15F, false);
		Bodyred.texOffs(36, 194).addBox(-19.5F, -10.0F, 6.0F, 15.0F, 17.0F, 1.0F, 0.51F, false);
		Bodyred.texOffs(3, 194).addBox(4.5F, -10.0F, 6.0F, 15.0F, 17.0F, 1.0F, 0.51F, false);
		Bodyred.texOffs(16, 64).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		Bodyred.texOffs(59, 272).addBox(-2.5F, 5.0F, -2.8F, 5.0F, 5.0F, 1.0F, 0.0F, false);
		}
		
		Bodyyellowglow = new ModelRenderer(this);
		Bodyyellowglow.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyyellowglow.texOffs(10, 215).addBox(2.5F, -1.0F, 4.0F, 2.0F, 6.0F, 2.0F, 0.51F, false);
		Bodyyellowglow.texOffs(19, 215).addBox(-4.5F, -1.0F, 4.0F, 2.0F, 6.0F, 2.0F, 0.51F, false);
		}
		
		RightArmwhite = new ModelRenderer(this);
		RightArmwhite.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmwhite, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmwhite.texOffs(40, 52).addBox(-3.0F, 4.6391F, -2.0F, 4.0F, 7.0F, 4.0F, 0.75F, false);
		}
		
		RightArm_r1 = new ModelRenderer(this);
		RightArm_r1.setPos(2.0F, 3.0F, 0.0F);
		RightArmwhite.addChild(RightArm_r1);
		setRotationAngle(RightArm_r1, 0.0F, 0.0F, 0.8727F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArm_r1.texOffs(21, 290).addBox(-3.0F, -1.3609F, -2.5F, 3.0F, 3.0F, 1.0F, 0.75F, false);
		}
		
		RightArm_r2 = new ModelRenderer(this);
		RightArm_r2.setPos(2.0F, 2.0F, 0.0F);
		RightArmwhite.addChild(RightArm_r2);
		setRotationAngle(RightArm_r2, 0.0F, 0.0F, 0.8727F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArm_r2.texOffs(21, 287).addBox(-3.0F, -1.3609F, -2.5F, 3.0F, 3.0F, 1.0F, 0.75F, false);
		}
		
		RightArm_r3 = new ModelRenderer(this);
		RightArm_r3.setPos(2.0F, 1.0F, 0.0F);
		RightArmwhite.addChild(RightArm_r3);
		setRotationAngle(RightArm_r3, 0.0F, 0.0F, 0.8727F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArm_r3.texOffs(21, 284).addBox(-3.0F, -1.3609F, -2.5F, 3.0F, 3.0F, 1.0F, 0.75F, false);
		}
		
		RightArm_r4 = new ModelRenderer(this);
		RightArm_r4.setPos(0.0F, 1.0F, 0.0F);
		RightArmwhite.addChild(RightArm_r4);
		setRotationAngle(RightArm_r4, 0.0F, 0.0F, 0.8727F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArm_r4.texOffs(12, 294).addBox(-3.0F, -1.3609F, -2.5F, 3.0F, 3.0F, 1.0F, 0.75F, false);
		}
		
		RightArm_r5 = new ModelRenderer(this);
		RightArm_r5.setPos(0.0F, 2.0F, 0.0F);
		RightArmwhite.addChild(RightArm_r5);
		setRotationAngle(RightArm_r5, 0.0F, 0.0F, 0.8727F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArm_r5.texOffs(12, 297).addBox(-3.0F, -1.3609F, -2.5F, 3.0F, 3.0F, 1.0F, 0.75F, false);
		}
		
		RightArm_r6 = new ModelRenderer(this);
		RightArm_r6.setPos(0.0F, 3.0F, 0.0F);
		RightArmwhite.addChild(RightArm_r6);
		setRotationAngle(RightArm_r6, 0.0F, 0.0F, 0.8727F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArm_r6.texOffs(12, 300).addBox(-3.0F, -1.3609F, -2.5F, 3.0F, 3.0F, 1.0F, 0.75F, false);
		}
		
		RightArm_r7 = new ModelRenderer(this);
		RightArm_r7.setPos(-2.0F, 3.0F, 0.0F);
		RightArmwhite.addChild(RightArm_r7);
		setRotationAngle(RightArm_r7, 0.0F, 0.0F, 0.8727F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArm_r7.texOffs(12, 290).addBox(-3.0F, -1.3609F, -2.5F, 3.0F, 3.0F, 1.0F, 0.75F, false);
		}
		
		RightArm_r8 = new ModelRenderer(this);
		RightArm_r8.setPos(-2.0F, 2.0F, 0.0F);
		RightArmwhite.addChild(RightArm_r8);
		setRotationAngle(RightArm_r8, 0.0F, 0.0F, 0.8727F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArm_r8.texOffs(12, 287).addBox(-3.0F, -1.3609F, -2.5F, 3.0F, 3.0F, 1.0F, 0.75F, false);
		}
		
		RightArm_r9 = new ModelRenderer(this);
		RightArm_r9.setPos(-2.0F, 1.0F, 0.0F);
		RightArmwhite.addChild(RightArm_r9);
		setRotationAngle(RightArm_r9, 0.0F, 0.0F, 0.8727F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArm_r9.texOffs(12, 284).addBox(-3.0F, -1.3609F, -2.5F, 3.0F, 3.0F, 1.0F, 0.75F, false);
		}
		
		RightArmyellow = new ModelRenderer(this);
		RightArmyellow.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmyellow, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmyellow.texOffs(57, 66).addBox(-3.0F, 4.6391F, -2.0F, 4.0F, 7.0F, 4.0F, 0.75F, false);
		RightArmyellow.texOffs(42, 269).addBox(-3.0F, -3.3609F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		RightArmred = new ModelRenderer(this);
		RightArmred.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmred, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmred.texOffs(40, 64).addBox(-3.0F, 4.6391F, -2.0F, 4.0F, 7.0F, 4.0F, 0.75F, false);
		RightArmred.texOffs(0, 160).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		RightArmred.texOffs(40, 16).addBox(-3.0F, -3.3609F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		RightArmredglow = new ModelRenderer(this);
		RightArmredglow.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmredglow, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmredglow.texOffs(50, 265).addBox(-2.0F, 11.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.5F, false);
		}
		
		RightArmgray = new ModelRenderer(this);	
		RightArmgray.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmgray, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmgray.texOffs(17, 160).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		RightArmgray.texOffs(57, 132).addBox(-3.0F, -3.3609F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		RightArmgray.texOffs(40, 40).addBox(-3.0F, 4.6391F, -2.0F, 4.0F, 7.0F, 4.0F, 0.75F, false);
		RightArmgray.texOffs(65, 4).addBox(-2.0F, 11.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.5F, false);
		}
		
		RightArmblack = new ModelRenderer(this);
		RightArmblack.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmblack, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmblack.texOffs(40, 24).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		RightArmblack.texOffs(41, 129).addBox(-3.0F, 4.6391F, -2.0F, 4.0F, 7.0F, 4.0F, 0.75F, false);
		RightArmblack.texOffs(57, 141).addBox(-3.0F, -3.3609F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		LeftArmyellow = new ModelRenderer(this);
		LeftArmyellow.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmyellow, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmyellow.texOffs(42, 278).addBox(-1.0F, -3.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		LeftArmblack = new ModelRenderer(this);
		LeftArmblack.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmblack, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmblack.texOffs(57, 24).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArmblack.texOffs(57, 159).addBox(-1.0F, -3.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		LeftArmblack.texOffs(17, 263).addBox(-1.0F, 4.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		LeftArmred = new ModelRenderer(this);
		LeftArmred.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmred, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmred.texOffs(57, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArmred.texOffs(0, 263).addBox(-1.0F, 4.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		LeftArmred.texOffs(57, 16).addBox(-1.0F, -3.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		LeftArmwhite = new ModelRenderer(this);
		LeftArmwhite.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmwhite, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmwhite.texOffs(30, 214).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArmwhite.texOffs(57, 40).addBox(-1.0F, 4.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		LeftArm_r1 = new ModelRenderer(this);
		LeftArm_r1.setPos(-1.0F, 1.0F, 0.0F);
		LeftArmwhite.addChild(LeftArm_r1);
		setRotationAngle(LeftArm_r1, 0.0F, 0.0F, -0.8727F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArm_r1.texOffs(29, 294).addBox(-1.0F, -2.0F, -2.5F, 3.0F, 3.0F, 1.0F, 0.75F, false);
		}
		
		LeftArm_r2 = new ModelRenderer(this);
		LeftArm_r2.setPos(-1.0F, 2.0F, 0.0F);
		LeftArmwhite.addChild(LeftArm_r2);
		setRotationAngle(LeftArm_r2, 0.0F, 0.0F, -0.8727F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArm_r2.texOffs(29, 297).addBox(-1.0F, -2.0F, -2.5F, 3.0F, 3.0F, 1.0F, 0.75F, false);
		}
		
		LeftArm_r3 = new ModelRenderer(this);
		LeftArm_r3.setPos(-1.0F, 3.0F, 0.0F);
		LeftArmwhite.addChild(LeftArm_r3);
		setRotationAngle(LeftArm_r3, 0.0F, 0.0F, -0.8727F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArm_r3.texOffs(29, 300).addBox(-1.0F, -2.0F, -2.5F, 3.0F, 3.0F, 1.0F, 0.75F, false);
		}
		
		LeftArm_r4 = new ModelRenderer(this);
		LeftArm_r4.setPos(1.0F, 1.0F, 0.0F);
		LeftArmwhite.addChild(LeftArm_r4);
		setRotationAngle(LeftArm_r4, 0.0F, 0.0F, -0.8727F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArm_r4.texOffs(29, 284).addBox(-1.0F, -2.0F, -2.5F, 3.0F, 3.0F, 1.0F, 0.75F, false);
		}
		
		LeftArm_r5 = new ModelRenderer(this);
		LeftArm_r5.setPos(1.0F, 2.0F, 0.0F);
		LeftArmwhite.addChild(LeftArm_r5);
		setRotationAngle(LeftArm_r5, 0.0F, 0.0F, -0.8727F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArm_r5.texOffs(29, 287).addBox(-1.0F, -2.0F, -2.5F, 3.0F, 3.0F, 1.0F, 0.75F, false);
		}
		
		LeftArm_r6 = new ModelRenderer(this);
		LeftArm_r6.setPos(1.0F, 3.0F, 0.0F);
		LeftArmwhite.addChild(LeftArm_r6);
		setRotationAngle(LeftArm_r6, 0.0F, 0.0F, -0.8727F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArm_r6.texOffs(29, 290).addBox(-1.0F, -2.0F, -2.5F, 3.0F, 3.0F, 1.0F, 0.75F, false);
		}
		
		LeftArm_r7 = new ModelRenderer(this);
		LeftArm_r7.setPos(3.0F, 3.0F, 0.0F);
		LeftArmwhite.addChild(LeftArm_r7);
		setRotationAngle(LeftArm_r7, 0.0F, 0.0F, -0.8727F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArm_r7.texOffs(20, 300).addBox(-1.0F, -2.0F, -2.5F, 3.0F, 3.0F, 1.0F, 0.75F, false);
		}
		
		LeftArm_r8 = new ModelRenderer(this);
		LeftArm_r8.setPos(3.0F, 2.0F, 0.0F);
		LeftArmwhite.addChild(LeftArm_r8);
		setRotationAngle(LeftArm_r8, 0.0F, 0.0F, -0.8727F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArm_r8.texOffs(20, 297).addBox(-1.0F, -2.0F, -2.5F, 3.0F, 3.0F, 1.0F, 0.75F, false);
		}
		
		LeftArm_r9 = new ModelRenderer(this);
		LeftArm_r9.setPos(3.0F, 1.0F, 0.0F);
		LeftArmwhite.addChild(LeftArm_r9);
		setRotationAngle(LeftArm_r9, 0.0F, 0.0F, -0.8727F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArm_r9.texOffs(20, 294).addBox(-1.0F, -2.0F, -2.5F, 3.0F, 3.0F, 1.0F, 0.75F, false);
		}
		
		LeftArmgray = new ModelRenderer(this);
		LeftArmgray.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgray, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmgray.texOffs(47, 214).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArmgray.texOffs(57, 150).addBox(-1.0F, -3.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		RightLegwhite = new ModelRenderer(this);
		RightLegwhite.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegwhite, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegwhite.texOffs(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLegred = new ModelRenderer(this);
		RightLegred.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegred, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegred.texOffs(0, 64).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		RightLegred.texOffs(0, 287).addBox(-1.0F, 6.0F, -3.3F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		}
		
		RightLegyellow = new ModelRenderer(this);
		RightLegyellow.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegyellow, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegyellow.texOffs(17, 112).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		RightLegyellow.texOffs(64, 221).addBox(1.0F, 11.0F, -5.0F, 1.0F, 1.0F, 2.0F, 0.5F, false);
		RightLegyellow.texOffs(64, 225).addBox(-2.0F, 11.0F, -5.0F, 1.0F, 1.0F, 2.0F, 0.5F, false);
		RightLegyellow.texOffs(0, 296).addBox(-1.0F, 6.0F, -3.3F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		}
		
		RightLegblack = new ModelRenderer(this);	
		RightLegblack.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegblack, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegblack.texOffs(52, 112).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLegredglow = new ModelRenderer(this);
		RightLegredglow.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegredglow, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegredglow.texOffs(0, 144).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		LeftLegwhite = new ModelRenderer(this);
		LeftLegwhite.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegwhite, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegwhite.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLegred = new ModelRenderer(this);
		LeftLegred.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegred, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegred.texOffs(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		LeftLegred.texOffs(6, 287).addBox(-1.4F, 6.0F, -3.3F, 3.0F, 2.0F, 1.0F, 0.0F, true);
		}
		
		LeftLegyellow = new ModelRenderer(this);
		LeftLegyellow.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegyellow, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegyellow.texOffs(0, 112).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		LeftLegyellow.texOffs(64, 229).addBox(1.0F, 11.0F, -6.0F, 1.0F, 1.0F, 2.0F, 0.5F, true);
		LeftLegyellow.texOffs(64, 233).addBox(-2.0F, 11.0F, -6.0F, 1.0F, 1.0F, 2.0F, 0.5F, true);
		LeftLegyellow.texOffs(6, 296).addBox(-1.4F, 6.0F, -3.3F, 3.0F, 2.0F, 1.0F, 0.0F, true);
		}
		
		LeftLegblack = new ModelRenderer(this);
		LeftLegblack.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegblack, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegblack.texOffs(35, 112).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLegredglow = new ModelRenderer(this);
		LeftLegredglow.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegredglow, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegredglow.texOffs(0, 128).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
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
		this.Headred.copyFrom(this.head);
		Headred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
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
		
		fred = (float)( this.FourthColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.FourthColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.FourthColor & 255) / 255.0F;
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
		this.Bodyyellowglow.copyFrom(this.body);
		Bodyyellowglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmyellow.copyFrom(this.rightArm);
		RightArmyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmyellow.copyFrom(this.leftArm);
		LeftArmyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegyellow.copyFrom(this.rightLeg);
		RightLegyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegyellow.copyFrom(this.leftLeg);
		LeftLegyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		
		this.Headeyes.copyFrom(this.head);
		Headeyes.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		
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
		this.Headredglow.copyFrom(this.head);
		Headredglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmredglow.copyFrom(this.rightArm);
		RightArmredglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegredglow.copyFrom(this.rightLeg);
		RightLegredglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegredglow.copyFrom(this.leftLeg);
		LeftLegredglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
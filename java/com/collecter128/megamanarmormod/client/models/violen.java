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
public class violen extends BipedModel {
	private final ModelRenderer Headface;
	private final ModelRenderer Headbrown;
	private final ModelRenderer Headred;
	private final ModelRenderer Headgray;
	private final ModelRenderer Head_r1;
	private final ModelRenderer Head_r2;
	private final ModelRenderer Head_r3;
	private final ModelRenderer Head_r4;
	private final ModelRenderer Headglowred;
	private final ModelRenderer Headglowgreen;
	private final ModelRenderer Bodyred;
	private final ModelRenderer Bodyblue;
	private final ModelRenderer Bodyyellow;
	private final ModelRenderer Bodygray;
	private final ModelRenderer Bodyglowgreen;
	private final ModelRenderer Bodybrown;
	private final ModelRenderer Bodywhite;
	private final ModelRenderer RightArmbrown;
	private final ModelRenderer RightArmred;
	private final ModelRenderer RightArmgray;
	private final ModelRenderer RightArmblue;
	private final ModelRenderer RightArmwhite;
	private final ModelRenderer RightArmyellow;
	private final ModelRenderer RightArmblack;
	private final ModelRenderer LeftArmbrown;
	private final ModelRenderer LeftArmred;
	private final ModelRenderer LeftArmblue;
	private final ModelRenderer LeftArmgray;
	private final ModelRenderer LeftArmwhite;
	private final ModelRenderer LeftArmyellow;
	private final ModelRenderer LeftArmblack;
	private final ModelRenderer RightLegbrown;
	private final ModelRenderer RightLegyellow;
	private final ModelRenderer RightLegwhite;
	private final ModelRenderer RightLeggray;
	private final ModelRenderer RightLegglow;
	private final ModelRenderer LeftLegbrown;
	private final ModelRenderer LeftLegyellow;
	private final ModelRenderer LeftLegwhite;
	private final ModelRenderer LeftLeggray;
	private final ModelRenderer LeftLegglow;
	
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

	public violen(float modelSize, EquipmentSlotType slot) {
		super(modelSize);
		texWidth = 98;
		texHeight = 191;
		
		equipmentslot = slot;
		
		MainColorDefault = 11694378;//Main Body Color brown
		SecondaryColorDefault = 16587031;//Secondary red
		ThirdColorDefault = 16706663; //yellow
		WhiteColorDefault = 16777215;//Basic White
		GlowyColorDefault = 16587031;//Glow? red
		GrayColorDefault = 14079702;//gray/black
		FourthColorDefault = 5059787; // blue
		FifthColorDefault = 786032; //green
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
		FourthColor = FourthColorDefault;
		FifthColor = FifthColorDefault;

		Headface = new ModelRenderer(this);
		Headface.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headface, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headface.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Headbrown = new ModelRenderer(this);
		Headbrown.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headbrown, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headbrown.texOffs(0, 172).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headbrown.texOffs(44, 80).addBox(-1.0872F, -9.9562F, -4.4855F, 2.0F, 5.0F, 10.0F, 0.4F, false);
		}
		
		Headred = new ModelRenderer(this);
		Headred.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headred, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headred.texOffs(35, 155).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headred.texOffs(64, 88).addBox(-1.0872F, -9.9562F, -4.4855F, 2.0F, 5.0F, 10.0F, 0.4F, false);
		}
		
		Headgray = new ModelRenderer(this);
		Headgray.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headgray, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headgray.texOffs(34, 9).addBox(5.4F, -5.9341F, -0.7842F, 1.0F, 3.0F, 3.0F, 0.5F, false);
		Headgray.texOffs(49, 9).addBox(-5.981F, -5.938F, -0.747F, 1.0F, 3.0F, 3.0F, 0.5F, false);
		Headgray.texOffs(33, 172).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Head_r1 = new ModelRenderer(this);
		Head_r1.setPos(0.0F, 24.0F, 0.0F);
		Headgray.addChild(Head_r1);
		setRotationAngle(Head_r1, -1.1781F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head_r1.texOffs(84, 161).addBox(-0.5F, -18.5F, -6.0F, 1.0F, 1.0F, 1.0F, 0.5F, false);
		Head_r1.texOffs(80, 161).addBox(-4.5F, -26.5F, -6.0F, 1.0F, 1.0F, 1.0F, 0.5F, false);
		Head_r1.texOffs(80, 164).addBox(-4.5F, -18.5F, -10.0F, 1.0F, 1.0F, 1.0F, 0.5F, false);
		Head_r1.texOffs(75, 164).addBox(3.5F, -18.5F, -10.0F, 1.0F, 1.0F, 1.0F, 0.5F, false);
		Head_r1.texOffs(71, 164).addBox(-0.5F, -26.5F, -10.0F, 1.0F, 1.0F, 1.0F, 0.5F, false);
		Head_r1.texOffs(75, 161).addBox(3.5F, -26.5F, -6.0F, 1.0F, 1.0F, 1.0F, 0.5F, false);
		Head_r1.texOffs(71, 161).addBox(-0.5F, -22.5F, -3.0F, 1.0F, 1.0F, 1.0F, 0.5F, false);
		Head_r1.texOffs(62, 142).addBox(-4.0F, -26.0F, -11.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		Head_r1.texOffs(77, 45).addBox(-2.0F, -24.0F, -15.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		}
		
		Head_r2 = new ModelRenderer(this);
		Head_r2.setPos(0.0F, 24.0F, 0.0F);
		Headgray.addChild(Head_r2);
		setRotationAngle(Head_r2, -0.8727F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head_r2.texOffs(77, 35).addBox(-2.0F, -28.0F, -12.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		}
		
		Head_r3 = new ModelRenderer(this);
		Head_r3.setPos(0.0F, 24.0F, 0.0F);
		Headgray.addChild(Head_r3);
		setRotationAngle(Head_r3, -0.5672F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head_r3.texOffs(77, 26).addBox(-2.0F, -31.0F, -8.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		}
		
		Head_r4 = new ModelRenderer(this);
		Head_r4.setPos(0.0F, 24.0F, 0.0F);
		Headgray.addChild(Head_r4);
		setRotationAngle(Head_r4, -0.2182F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head_r4.texOffs(77, 17).addBox(-2.0F, -32.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		}
		
		Headglowred = new ModelRenderer(this);
		Headglowred.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headglowred, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headglowred.texOffs(84, 2).addBox(4.4F, -5.5F, -0.5F, 1.0F, 2.0F, 2.0F, 0.5F, false);
		Headglowred.texOffs(76, 2).addBox(-4.981F, -5.5F, -0.5F, 1.0F, 2.0F, 2.0F, 0.5F, false);
		}
		
		Headglowgreen = new ModelRenderer(this);
		Headglowgreen.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headglowgreen, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headglowgreen.texOffs(66, 172).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Bodyred = new ModelRenderer(this);
		Bodyred.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyred.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);
		}
		
		Bodyblue = new ModelRenderer(this);
		Bodyblue.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyblue.texOffs(37, 2).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.5F, false);
		}
		
		Bodyyellow = new ModelRenderer(this);
		Bodyyellow.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyyellow.texOffs(16, 64).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		}
		
		Bodygray = new ModelRenderer(this);
		Bodygray.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodygray.texOffs(16, 113).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		Bodygray.texOffs(26, 2).addBox(-1.0F, 6.0F, -3.0F, 2.0F, 2.0F, 1.0F, 0.3F, false);
		}
		
		Bodyglowgreen = new ModelRenderer(this);
		Bodyglowgreen.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyglowgreen.texOffs(65, 3).addBox(-1.0F, 6.0F, -3.0F, 2.0F, 2.0F, 1.0F, 0.3F, false);
		}
		
		Bodybrown = new ModelRenderer(this);
		Bodybrown.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodybrown.texOffs(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		}
		
		Bodywhite = new ModelRenderer(this);
		Bodywhite.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodywhite.texOffs(16, 48).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		Bodywhite.texOffs(58, 10).addBox(-3.0F, -2.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.2F, false);
		Bodywhite.texOffs(62, 10).addBox(2.0F, -2.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.2F, false);
		Bodywhite.texOffs(62, 13).addBox(2.0F, -2.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.2F, false);
		Bodywhite.texOffs(58, 13).addBox(-3.0F, -2.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.2F, false);
		}
		
		RightArmbrown = new ModelRenderer(this);
		RightArmbrown.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmbrown, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmbrown.texOffs(40, 16).addBox(-4.0F, -3.2019F, -2.0F, 4.0F, 4.0F, 4.0F, 0.8F, false);
		}
		
		RightArmred = new ModelRenderer(this);
		RightArmred.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmred, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmred.texOffs(40, 40).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		RightArmgray = new ModelRenderer(this);
		RightArmgray.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmgray, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmgray.texOffs(59, 129).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		RightArmgray.texOffs(59, 105).addBox(-4.0F, -3.2019F, -2.0F, 4.0F, 4.0F, 4.0F, 0.8F, false);
		}
		
		RightArmblue = new ModelRenderer(this);
		RightArmblue.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmblue, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmblue.texOffs(40, 73).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		RightArmwhite = new ModelRenderer(this);
		RightArmwhite.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmwhite, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmwhite.texOffs(40, 24).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		RightArmwhite.texOffs(56, 2).addBox(-6.0F, -2.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.2F, false);
		RightArmwhite.texOffs(60, 2).addBox(-6.0F, -2.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.2F, false);
		}
		
		RightArmyellow = new ModelRenderer(this);
		RightArmyellow.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmyellow, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmyellow.texOffs(40, 57).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		RightArmyellow.texOffs(40, 49).addBox(-4.0F, -3.2019F, -2.0F, 4.0F, 4.0F, 4.0F, 0.8F, false);
		}
		
		RightArmblack = new ModelRenderer(this);
		RightArmblack.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmblack, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmblack.texOffs(59, 113).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		LeftArmbrown = new ModelRenderer(this);
		LeftArmbrown.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmbrown, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmbrown.texOffs(57, 16).addBox(0.0F, -3.3974F, -2.0F, 4.0F, 4.0F, 4.0F, 0.8F, false);
		}
		
		LeftArmred = new ModelRenderer(this);
		LeftArmred.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmred, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmred.texOffs(57, 40).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		LeftArmblue = new ModelRenderer(this);
		LeftArmblue.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmblue, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmblue.texOffs(57, 73).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		LeftArmgray = new ModelRenderer(this);
		LeftArmgray.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgray, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmgray.texOffs(76, 129).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		LeftArmgray.texOffs(76, 105).addBox(0.0F, -3.3974F, -2.0F, 4.0F, 4.0F, 4.0F, 0.8F, false);
		}
		
		LeftArmwhite = new ModelRenderer(this);
		LeftArmwhite.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmwhite, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmwhite.texOffs(57, 24).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArmwhite.texOffs(56, 5).addBox(5.0F, -2.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.2F, true);
		LeftArmwhite.texOffs(60, 5).addBox(5.0F, -2.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.2F, true);
		}
		
		LeftArmyellow = new ModelRenderer(this);
		LeftArmyellow.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmyellow, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmyellow.texOffs(57, 57).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArmyellow.texOffs(57, 49).addBox(0.0F, -3.3974F, -2.0F, 4.0F, 4.0F, 4.0F, 0.8F, false);
		}
		
		LeftArmblack = new ModelRenderer(this);
		LeftArmblack.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmblack, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmblack.texOffs(76, 113).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		RightLegbrown = new ModelRenderer(this);
		RightLegbrown.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegbrown, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegbrown.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLegyellow = new ModelRenderer(this);
		RightLegyellow.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegyellow, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegyellow.texOffs(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLegwhite = new ModelRenderer(this);
		RightLegwhite.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegwhite, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegwhite.texOffs(0, 139).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLeggray = new ModelRenderer(this);
		RightLeggray.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeggray, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLeggray.texOffs(0, 155).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLegglow = new ModelRenderer(this);
		RightLegglow.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegglow, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegglow.texOffs(38, 142).addBox(-0.8947F, 14.2F, -1.0F, 2.0F, 1.0F, 2.0F, 1.0F, false);
		}
		
		LeftLegbrown = new ModelRenderer(this);
		LeftLegbrown.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegbrown, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegbrown.texOffs(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLegyellow = new ModelRenderer(this);
		LeftLegyellow.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegyellow, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegyellow.texOffs(0, 64).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLegwhite = new ModelRenderer(this);
		LeftLegwhite.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegwhite, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegwhite.texOffs(18, 139).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLeggray = new ModelRenderer(this);
		LeftLeggray.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeggray, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLeggray.texOffs(18, 155).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLegglow = new ModelRenderer(this);
		LeftLegglow.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegglow, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegglow.texOffs(47, 142).addBox(-1.2791F, 14.2F, -1.0F, 2.0F, 1.0F, 2.0F, 1.0F, true);
		}
	}

//	@Override
//	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
//		//previously the render function, render code was moved to a method below
//	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		
		this.Headface.copyFrom(this.head);
		Headface.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		
		float fred = (float)( this.MainColor >> 16 & 255) / 255.0F;
        float fgreen = (float)(this.MainColor >> 8 & 255) / 255.0F;
        float fblue = (float)(this.MainColor & 255) / 255.0F;
		this.Headbrown.copyFrom(this.head);
		Headbrown.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodybrown.copyFrom(this.body);
		Bodybrown.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmbrown.copyFrom(this.rightArm);
		RightArmbrown.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmbrown.copyFrom(this.leftArm);
		LeftArmbrown.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegbrown.copyFrom(this.rightLeg);
		RightLegbrown.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegbrown.copyFrom(this.leftLeg);
		LeftLegbrown.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
		this.Headred.copyFrom(this.head);
		Headred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodyred.copyFrom(this.body);
		Bodyred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmred.copyFrom(this.rightArm);
		RightArmred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmred.copyFrom(this.leftArm);
		LeftArmred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.ThirdColor & 255) / 255.0F;
		this.Bodyyellow.copyFrom(this.body);
		Bodyyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmyellow.copyFrom(this.rightArm);
		RightArmyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmyellow.copyFrom(this.leftArm);
		LeftArmyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegyellow.copyFrom(this.rightLeg);
		RightLegyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegyellow.copyFrom(this.leftLeg);
		LeftLegyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.FourthColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.FourthColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.FourthColor & 255) / 255.0F;
		this.Bodyblue.copyFrom(this.body);
		Bodyblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmblue.copyFrom(this.rightArm);
		RightArmblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmblue.copyFrom(this.leftArm);
		LeftArmblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.WhiteColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.WhiteColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.WhiteColor & 255) / 255.0F;
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
		
		fred = (float)( this.GrayColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GrayColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GrayColor & 255) / 255.0F;
		this.RightArmblack.copyFrom(this.rightArm);
		RightArmblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmblack.copyFrom(this.leftArm);
		LeftArmblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		
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
		this.Headglowred.copyFrom(this.head);
		Headglowred.render(matrixStack, buffer,0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegglow.copyFrom(this.rightLeg);
		RightLegglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegglow.copyFrom(this.leftLeg);
		LeftLegglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.FifthColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.FifthColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.FifthColor & 255) / 255.0F;
		this.Headglowgreen.copyFrom(this.head);
		Headglowgreen.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodyglowgreen.copyFrom(this.body);
		Bodyglowgreen.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
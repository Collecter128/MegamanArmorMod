package com.collecter128.megamanarmormod.client.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

@OnlyIn(Dist.CLIENT)
public class thirdarmor_main extends BipedModel {
	private final ModelRenderer Headblue;
	private final ModelRenderer Headwhite;
	private final ModelRenderer Headgray;
	private final ModelRenderer Headyellow;
	private final ModelRenderer Headred;
	private final ModelRenderer Headredglow;
	private final ModelRenderer Bodysecondary;
	private final ModelRenderer Bodymain;
	private final ModelRenderer Bodywhite;
	private final ModelRenderer Bodygray;
	private final ModelRenderer Bodyblack;
	private final ModelRenderer Bodyred;
	private final ModelRenderer Bodygreen;
	private final ModelRenderer RightArmblue;
	private final ModelRenderer RightArmteal;
	private final ModelRenderer RightArmwhite;
	private final ModelRenderer RightArmyellow;
	private final ModelRenderer RightArmred;
	private final ModelRenderer RightArmgray;
	private final ModelRenderer LeftArmblue;
	private final ModelRenderer LeftArmteal;
	private final ModelRenderer LeftArmwhite;
	private final ModelRenderer LeftArmyellow;
	private final ModelRenderer LeftArmred;
	private final ModelRenderer LeftArmgray;
	private final ModelRenderer RightLegblue;
	private final ModelRenderer RightLegwhite;
	private final ModelRenderer RightLegyellow;
	private final ModelRenderer RightLegred;
	private final ModelRenderer RightLegblack;
	private final ModelRenderer RightLeggray;
	private final ModelRenderer RightLeglightblue;
	private final ModelRenderer RightLeg_r1;
	private final ModelRenderer LeftLegwhite;
	private final ModelRenderer LeftLegblue;
	private final ModelRenderer LeftLeggold;
	private final ModelRenderer LeftLegred;
	private final ModelRenderer LeftLegblack;
	private final ModelRenderer LeftLeggray;
	private final ModelRenderer RightLeg_r2;
	private final ModelRenderer LeftLeggraylightblue;
	private final ModelRenderer LeftLeg_r1;
	private final ModelRenderer RightLeg_r3;
	
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

	public thirdarmor_main(float modelSize, EquipmentSlotType slot) {
		super(modelSize);
		texWidth = 88;
		texHeight = 196;
		
		MainColorDefault = 2781423;//Main Body Color X Blue
		SecondaryColorDefault = 5752303;//Secondary Cyan tiel color
		ThirdColorDefault = 16642337; //Yellow Bits
		WhiteColorDefault = 16777215;//Basic White
		GlowyColorDefault = 16468504;//Glow?Red crystal thingy
		GrayColorDefault = 16777215;//Basic White
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
		
		this.equipmentslot = slot;

		Headblue = new ModelRenderer(this);
		Headblue.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headblue, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headblue.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Headwhite = new ModelRenderer(this);
		Headwhite.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headwhite, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headwhite.texOffs(47, 94).addBox(-4.5F, -8.6F, -4.5F, 9.0F, 8.0F, 9.0F, 1.0F, false);
		Headwhite.texOffs(0, 66).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headwhite.texOffs(64, 83).addBox(-5.428F, -9.8F, -5.2F, 11.0F, 5.0F, 0.0F, 0.5F, false);
		}
		
		Headgray = new ModelRenderer(this);
		Headgray.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headgray, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headgray.texOffs(32, 0).addBox(-3.6706F, -7.6327F, -3.8533F, 8.0F, 7.0F, 8.0F, 0.55F, false);
		Headgray.texOffs(3, 53).addBox(5.4F, -5.9341F, -0.7842F, 1.0F, 3.0F, 3.0F, 0.5F, false);
		Headgray.texOffs(3, 60).addBox(-5.981F, -5.938F, -0.747F, 1.0F, 3.0F, 3.0F, 0.5F, false);
		}
		
		Headyellow = new ModelRenderer(this);
		Headyellow.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headyellow, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headyellow.texOffs(68, 7).addBox(-1.5F, -7.9453F, -5.7F, 3.0F, 3.0F, 2.0F, 0.5F, false);
		}
		
		Headred = new ModelRenderer(this);
		Headred.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headred, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headred.texOffs(42, 83).addBox(-5.428F, -9.8F, -5.2F, 11.0F, 5.0F, 0.0F, 0.5F, false);
		}
		
		Headredglow = new ModelRenderer(this);
		Headredglow.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headredglow, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headredglow.texOffs(24, 0).addBox(-1.5F, -7.9453F, -5.7F, 3.0F, 3.0F, 2.0F, 0.5F, false);
		Headredglow.texOffs(81, 1).addBox(6.818F, -5.4114F, -0.0449F, 1.0F, 2.0F, 2.0F, 0.5F, false);
		Headredglow.texOffs(81, 8).addBox(-5.3948F, -5.4114F, -0.0449F, 1.0F, 2.0F, 2.0F, 0.5F, false);
		}
		
		Bodysecondary = new ModelRenderer(this);
		Bodysecondary.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodysecondary.texOffs(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		}
		
		Bodymain = new ModelRenderer(this);
		Bodymain.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodymain.texOffs(16, 147).addBox(-4.5F, 0.0F, -2.5F, 9.0F, 10.0F, 5.0F, 0.6F, false);
		}
		
		Bodywhite = new ModelRenderer(this);
		Bodywhite.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodywhite.texOffs(16, 16).addBox(-4.5F, 0.0F, -2.5F, 9.0F, 10.0F, 5.0F, 0.6F, false);
		}
		
		Bodygray = new ModelRenderer(this);
		Bodygray.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodygray.texOffs(16, 48).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		}
		
		Bodyblack = new ModelRenderer(this);
		Bodyblack.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyblack.texOffs(16, 131).addBox(-4.5F, 0.0F, -2.5F, 9.0F, 10.0F, 5.0F, 0.6F, false);
		Bodyblack.texOffs(66, 2).addBox(-1.5F, 0.5F, -3.2F, 3.0F, 3.0F, 0.0F, 0.1F, false);
		}
		
		Bodyred = new ModelRenderer(this);
		Bodyred.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyred.texOffs(16, 115).addBox(-4.5F, 0.0F, -2.5F, 9.0F, 10.0F, 5.0F, 0.6F, false);
		}
		
		Bodygreen = new ModelRenderer(this);
		Bodygreen.setPos(-3.0F, -7.0F, -1.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodygreen.texOffs(57, 2).addBox(-1.0F, 1.0F, -3.5F, 2.0F, 2.0F, 1.0F, 0.1F, false);
		}
		
		RightArmblue = new ModelRenderer(this);
		RightArmblue.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmblue, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmblue.texOffs(47, 122).addBox(-5.0F, -3.2019F, -2.0F, 5.0F, 4.0F, 4.0F, 0.8F, false);
		RightArmblue.texOffs(42, 48).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		RightArmteal = new ModelRenderer(this);
		RightArmteal.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmteal, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmteal.texOffs(45, 24).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		RightArmwhite = new ModelRenderer(this);
		RightArmwhite.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmwhite, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmwhite.texOffs(45, 16).addBox(-5.0F, -3.2019F, -2.0F, 5.0F, 4.0F, 4.0F, 0.8F, false);
		RightArmwhite.texOffs(42, 40).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		RightArmyellow = new ModelRenderer(this);
		RightArmyellow.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmyellow, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmyellow.texOffs(45, 112).addBox(-6.0F, -3.2019F, -2.0F, 6.0F, 4.0F, 4.0F, 0.8F, false);
		RightArmyellow.texOffs(80, 44).addBox(-2.0F, 1.9902F, 1.4184F, 2.0F, 2.0F, 1.0F, 0.75F, false);
		}
		
		RightArmred = new ModelRenderer(this);
		RightArmred.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmred, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmred.texOffs(26, 64).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		RightArmgray = new ModelRenderer(this);
		RightArmgray.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmgray, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmgray.texOffs(42, 64).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		LeftArmblue = new ModelRenderer(this);
		LeftArmblue.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmblue, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmblue.texOffs(66, 122).addBox(0.0F, -2.3974F, -2.0F, 5.0F, 4.0F, 4.0F, 0.8F, false);
		LeftArmblue.texOffs(62, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		LeftArmteal = new ModelRenderer(this);
		LeftArmteal.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmteal, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmteal.texOffs(65, 24).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		LeftArmwhite = new ModelRenderer(this);
		LeftArmwhite.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmwhite, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmwhite.texOffs(64, 16).addBox(0.0F, -2.3974F, -2.0F, 5.0F, 4.0F, 4.0F, 0.8F, false);
		LeftArmwhite.texOffs(62, 40).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		LeftArmyellow = new ModelRenderer(this);
		LeftArmyellow.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmyellow, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmyellow.texOffs(65, 112).addBox(0.0F, -2.3974F, -2.0F, 5.0F, 4.0F, 4.0F, 0.8F, false);
		LeftArmyellow.texOffs(80, 54).addBox(0.0F, 2.0F, 1.4738F, 2.0F, 2.0F, 1.0F, 0.75F, false);
		}
		
		LeftArmred = new ModelRenderer(this);
		LeftArmred.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmred, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmred.texOffs(26, 88).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		LeftArmgray = new ModelRenderer(this);
		LeftArmgray.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgray, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmgray.texOffs(60, 64).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		RightLegblue = new ModelRenderer(this);
		RightLegblue.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegblue, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegblue.texOffs(0, 131).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLegwhite = new ModelRenderer(this);
		RightLegwhite.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegwhite, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegwhite.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLegyellow = new ModelRenderer(this);
		RightLegyellow.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegyellow, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegyellow.texOffs(71, 151).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLegred = new ModelRenderer(this);
		RightLegred.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegred, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegred.texOffs(0, 115).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLegblack = new ModelRenderer(this);
		RightLegblack.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegblack, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegblack.texOffs(0, 148).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLeggray = new ModelRenderer(this);
		RightLeggray.setPos(-1.9F, 12.0F, 7.0F);
		setRotationAngle(RightLeggray, 0.0F, 1.5708F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		//RightLeggray.texOffs(3, 99).addBox(1.4F, 9.0F, -1.5F, 1.0F, 3.0F, 3.0F, 0.1F, false);
		}
		
		RightLeglightblue = new ModelRenderer(this);	
		RightLeglightblue.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeglightblue, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLeglightblue.texOffs(14, 108).addBox(-0.9994F, 7.2251F, -1.025F, 2.0F, 5.0F, 2.0F, 1.0F, false);
		}
		
		RightLeg_r1 = new ModelRenderer(this);
		RightLeg_r1.setPos(1.9F, 12.0F, 7.0F);
		RightLeglightblue.addChild(RightLeg_r1);
		setRotationAngle(RightLeg_r1, -0.3054F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		//RightLeg_r1.texOffs(18, 101).addBox(-3.0F, -0.1267F, -3.7525F, 2.0F, 2.0F, 0.0F, 0.1F, false);
		}
		
		LeftLegwhite = new ModelRenderer(this);
		LeftLegwhite.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegwhite, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegwhite.texOffs(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLegblue = new ModelRenderer(this);
		LeftLegblue.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegblue, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegblue.texOffs(46, 132).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLeggold = new ModelRenderer(this);
		LeftLeggold.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeggold, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLeggold.texOffs(71, 167).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLegred = new ModelRenderer(this);
		LeftLegred.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegred, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegred.texOffs(64, 132).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLegblack = new ModelRenderer(this);
		LeftLegblack.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegblack, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegblack.texOffs(46, 148).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLeggray = new ModelRenderer(this);
		LeftLeggray.setPos(-5.1F, 13.0F, 0.0F);
		setRotationAngle(LeftLeggray, 0.0F, 1.5708F, -0.0349F);
		

		RightLeg_r2 = new ModelRenderer(this);
		RightLeg_r2.setPos(5.1F, 11.0F, 7.0F);
		LeftLeggray.addChild(RightLeg_r2);
		setRotationAngle(RightLeg_r2, 0.0F, 0.0F, -0.3927F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		//RightLeg_r2.texOffs(3, 106).addBox(-6.0F, -4.0F, -1.3955F, 1.0F, 3.0F, 3.0F, 0.1F, false);
		}
		
		LeftLeggraylightblue = new ModelRenderer(this);
		LeftLeggraylightblue.setPos(-5.1F, 13.0F, 0.0F);
		setRotationAngle(LeftLeggraylightblue, 0.0F, 1.5708F, -0.0349F);
		

		LeftLeg_r1 = new ModelRenderer(this);
		LeftLeg_r1.setPos(5.1F, 9.0F, 0.0F);
		LeftLeggraylightblue.addChild(LeftLeg_r1);
		setRotationAngle(LeftLeg_r1, 0.0F, 0.0F, -0.1599F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLeg_r1.texOffs(25, 108).addBox(-5.9908F, -3.3F, -1.5951F, 2.0F, 5.0F, 2.0F, 1.0F, true);
		}
		
		RightLeg_r3 = new ModelRenderer(this);
		RightLeg_r3.setPos(5.1F, 11.0F, 7.0F);
		LeftLeggraylightblue.addChild(RightLeg_r3);
		setRotationAngle(RightLeg_r3, 0.0F, 0.0F, -0.3927F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		//RightLeg_r3.texOffs(18, 106).addBox(-5.9239F, -3.3827F, -1.3955F, 0.0F, 2.0F, 2.0F, 0.1F, false);
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
		this.Headblue.copyFrom(this.head);
		Headblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodymain.copyFrom(this.body);
		Bodymain.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
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
		this.Bodysecondary.copyFrom(this.body);
		Bodysecondary.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmteal.copyFrom(this.rightArm);
		RightArmteal.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmteal.copyFrom(this.leftArm);
		LeftArmteal.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		this.RightLeglightblue.copyFrom(this.rightLeg);
		RightLeglightblue.render(matrixStack, buffer, 15728640, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeggraylightblue.copyFrom(this.leftLeg);
		LeftLeggraylightblue.render(matrixStack, buffer, 15728640, packedOverlay, fred, fgreen, fblue, alpha);
		
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
		
		this.Bodyblack.copyFrom(this.body);
		Bodyblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegblack.copyFrom(this.rightLeg);
		RightLegblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegblack.copyFrom(this.leftLeg);
		LeftLegblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
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
		this.LeftLeggold.copyFrom(this.leftLeg);
		LeftLeggold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
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
		
		this.Headredglow.copyFrom(this.head);
		Headredglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		
		this.Bodygreen.copyFrom(this.body);
		Bodygreen.render(matrixStack, buffer, 0xF000F0, packedOverlay);
		
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
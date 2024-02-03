package com.collecter128.megamanarmormod.client.models;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports

@OnlyIn(Dist.CLIENT)
public class zeroexarmor extends BipedModel {
	private final ModelRenderer Headred;
	private final ModelRenderer Headwhite;
	private final ModelRenderer Headglowred;
	private final ModelRenderer Headsilver;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer Headgold;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer Headglowblue;
	private final ModelRenderer Bodyred;
	private final ModelRenderer Bodywhite;
	private final ModelRenderer Bodygold;
	private final ModelRenderer Bodyglowgreen;
	private final ModelRenderer Bodygray;
	private final ModelRenderer Bodylightblueglow;
	private final ModelRenderer RightArmred;
	private final ModelRenderer RightArmwhite;
	private final ModelRenderer RightArmgreenglow;
	private final ModelRenderer RightArmgray;
	private final ModelRenderer RightArmglowblue;
	private final ModelRenderer RightArmsecondary;
	private final ModelRenderer LeftArmred;
	private final ModelRenderer LeftArmwhite;
	private final ModelRenderer LeftArmgreenglow;
	private final ModelRenderer LeftArmgray;
	private final ModelRenderer LeftArmblueglow;
	private final ModelRenderer LeftArmsecondary;
	private final ModelRenderer RightLegred;
	private final ModelRenderer RightLegwhite;
	private final ModelRenderer RightLegyellow;
	private final ModelRenderer RightLegglowgreen;
	private final ModelRenderer RightLegglowblue;
	private final ModelRenderer LeftLegred;
	private final ModelRenderer LeftLegwhite;
	private final ModelRenderer LeftLegyellow;
	private final ModelRenderer LeftLegglowgreen;
	private final ModelRenderer LeftLegglowblue;
	
	EquipmentSlotType equipmentslot;
	
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

	public zeroexarmor(float modelSize, EquipmentSlotType slot) {
		super(modelSize);
		texWidth = 105;
		texHeight = 195;
		
		equipmentslot = slot;
		
		MainColorDefault = 16711680;//Main Body Color Zero Red
		SecondaryColorDefault = 2171169;//Secondary Black
		ThirdColorDefault = 16763151; // Hair
		WhiteColorDefault = 16777215;//Basic White
		GlowyColorDefault = 2448340;//Glow? 
		GrayColorDefault = 16777215;//Basic White
		//FourthColorDefault = ???; //
		FifthColorDefault = 2935135; //green
		
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
		//FourthColor = FourthColorDefault;
		FifthColor = FifthColorDefault;

		Headred = new ModelRenderer(this);
		Headred.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headred, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headred.texOffs(0, 4).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headred.texOffs(32, 0).addBox(-3.6706F, -12.6327F, -3.8533F, 8.0F, 12.0F, 8.0F, 1.55F, false);
		}
		
		Headwhite = new ModelRenderer(this);
		Headwhite.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headwhite, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headwhite.texOffs(0, 116).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headwhite.texOffs(54, 71).addBox(5.0643F, -4.9396F, -0.6797F, 1.0F, 3.0F, 3.0F, 0.5F, false);
		Headwhite.texOffs(41, 71).addBox(-5.8938F, -4.8393F, -1.6332F, 1.0F, 3.0F, 3.0F, 0.5F, false);
		Headwhite.texOffs(32, 112).addBox(-3.6706F, -12.6327F, -3.8533F, 8.0F, 12.0F, 8.0F, 1.55F, false);
		}
		
		Headglowred = new ModelRenderer(this);
		Headglowred.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headglowred, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headglowred.texOffs(94, 78).addBox(4.8F, -4.5F, 0.0F, 1.0F, 2.0F, 2.0F, 0.5F, false);
		Headglowred.texOffs(97, 83).addBox(-5.6F, -4.5F, -1.0F, 1.0F, 2.0F, 2.0F, 0.5F, false);
		}
		
		Headsilver = new ModelRenderer(this);
		Headsilver.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headsilver, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headsilver.texOffs(0, 163).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.75F, false);
		}
		
		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0F, -2.0F, 5.0F);
		Headsilver.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		cube_r1.texOffs(85, 10).addBox(-1.0F, -0.9F, -1.1853F, 2.0F, 2.0F, 1.0F, 0.5F, false);
		}
		
		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(0.0F, -2.0F, 5.0F);
		Headsilver.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.3491F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		cube_r2.texOffs(66, 69).addBox(-1.0F, -0.9517F, -0.1853F, 2.0F, 2.0F, 5.0F, 0.0F, false);
		}
		
		Headgold = new ModelRenderer(this);
		Headgold.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headgold, -0.1047F, 0.0873F, 0.0F);
		

		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(0.0F, -2.0F, 5.0F);
		Headgold.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.0436F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		cube_r3.texOffs(84, 3).addBox(-0.5F, -4.9F, -1.1853F, 1.0F, 3.0F, 1.0F, 0.5F, false);
		}
		
		cube_r4 = new ModelRenderer(this);
		cube_r4.setPos(0.0F, 0.0F, 10.0F);
		Headgold.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.3927F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		cube_r4.texOffs(41, 53).addBox(-3.0F, -1.1637F, -3.4193F, 6.0F, 12.0F, 6.0F, 0.0F, false);
		}
		
		Headglowblue = new ModelRenderer(this);
		Headglowblue.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headglowblue, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headglowblue.texOffs(55, 147).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headglowblue.texOffs(55, 131).addBox(-3.6706F, -7.6327F, -3.8533F, 8.0F, 7.0F, 8.0F, 1.55F, false);
		}
		
		Bodyred = new ModelRenderer(this);
		Bodyred.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyred.texOffs(16, 20).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.86F, false);
		}
		
		Bodywhite = new ModelRenderer(this);
		Bodywhite.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodywhite.texOffs(16, 68).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.86F, false);
		}
		
		Bodygold = new ModelRenderer(this);
		Bodygold.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodygold.texOffs(16, 52).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.86F, false);
		}
		
		Bodyglowgreen = new ModelRenderer(this);
		Bodyglowgreen.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyglowgreen.texOffs(16, 36).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.86F, false);
		}
		
		Bodygray = new ModelRenderer(this);
		Bodygray.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodygray.texOffs(37, 163).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		Bodygray.texOffs(16, 84).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		}
		
		Bodylightblueglow = new ModelRenderer(this);
		Bodylightblueglow.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodylightblueglow.texOffs(37, 178).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		}
		
		RightArmred = new ModelRenderer(this);
		RightArmred.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmred, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmred.texOffs(75, 20).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		RightArmwhite = new ModelRenderer(this);
		RightArmwhite.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmwhite, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmwhite.texOffs(40, 36).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		RightArmwhite.texOffs(64, 167).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		RightArmwhite.texOffs(75, 28).addBox(-5.0F, -2.8F, -1.5566F, 5.0F, 4.0F, 4.0F, 1.0F, false);
		}
		
		RightArmgreenglow = new ModelRenderer(this);
		RightArmgreenglow.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmgreenglow, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmgreenglow.texOffs(76, 36).addBox(-4.0F, -3.8F, -1.5566F, 3.0F, 2.0F, 4.0F, 1.0F, false);
		}
		
		RightArmgray = new ModelRenderer(this);
		RightArmgray.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmgray, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmgray.texOffs(77, 113).addBox(-3.0F, 8.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.77F, false);
		RightArmgray.texOffs(96, 33).addBox(-2.0F, -0.8F, -2.5566F, 2.0F, 2.0F, 1.0F, 0.5F, false);
		RightArmgray.texOffs(96, 42).addBox(-2.0F, -0.8F, 2.4434F, 2.0F, 2.0F, 1.0F, 0.5F, false);
		}
		
		RightArmglowblue = new ModelRenderer(this);
		RightArmglowblue.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmglowblue, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmglowblue.texOffs(96, 37).addBox(-2.0F, -0.8F, -2.5566F, 2.0F, 2.0F, 1.0F, 0.5F, false);
		RightArmglowblue.texOffs(96, 46).addBox(-2.0F, -0.8F, 2.4434F, 2.0F, 2.0F, 1.0F, 0.5F, false);
		}
		
		RightArmsecondary = new ModelRenderer(this);
		RightArmsecondary.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmsecondary, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmsecondary.texOffs(40, 20).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		LeftArmred = new ModelRenderer(this);
		LeftArmred.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmred, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmred.texOffs(75, 45).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		LeftArmwhite = new ModelRenderer(this);
		LeftArmwhite.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmwhite, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmwhite.texOffs(59, 36).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArmwhite.texOffs(82, 167).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArmwhite.texOffs(75, 53).addBox(0.0F, -2.8F, -1.5566F, 5.0F, 4.0F, 4.0F, 1.0F, false);
		}
		
		LeftArmgreenglow = new ModelRenderer(this);
		LeftArmgreenglow.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgreenglow, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmgreenglow.texOffs(76, 61).addBox(1.0F, -3.8F, -1.5566F, 3.0F, 2.0F, 4.0F, 1.0F, false);
		}
		
		LeftArmgray = new ModelRenderer(this);
		LeftArmgray.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgray, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmgray.texOffs(77, 120).addBox(-1.0F, 8.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.77F, false);
		LeftArmgray.texOffs(96, 57).addBox(0.0F, -0.8F, -2.5566F, 2.0F, 2.0F, 1.0F, 0.5F, false);
		LeftArmgray.texOffs(96, 65).addBox(0.0F, -0.8F, 2.4434F, 2.0F, 2.0F, 1.0F, 0.5F, false);
		}
		
		LeftArmblueglow = new ModelRenderer(this);
		LeftArmblueglow.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmblueglow, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmblueglow.texOffs(96, 61).addBox(0.0F, -0.8F, -2.5566F, 2.0F, 2.0F, 1.0F, 0.5F, false);
		LeftArmblueglow.texOffs(96, 69).addBox(0.0F, -0.8F, 2.4434F, 2.0F, 2.0F, 1.0F, 0.5F, false);
		}
		
		LeftArmsecondary = new ModelRenderer(this);
		LeftArmsecondary.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmsecondary, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmsecondary.texOffs(59, 20).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		RightLegred = new ModelRenderer(this);
		RightLegred.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegred, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegred.texOffs(0, 20).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLegwhite = new ModelRenderer(this);
		RightLegwhite.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegwhite, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegwhite.texOffs(0, 84).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLegyellow = new ModelRenderer(this);
		RightLegyellow.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegyellow, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegyellow.texOffs(0, 52).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLegglowgreen = new ModelRenderer(this);
		RightLegglowgreen.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegglowgreen, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegglowgreen.texOffs(0, 179).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLegglowblue = new ModelRenderer(this);
		RightLegglowblue.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegglowblue, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegglowblue.texOffs(59, 90).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		LeftLegred = new ModelRenderer(this);
		LeftLegred.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegred, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegred.texOffs(0, 36).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLegwhite = new ModelRenderer(this);
		LeftLegwhite.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegwhite, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegwhite.texOffs(0, 100).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLegyellow = new ModelRenderer(this);
		LeftLegyellow.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegyellow, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegyellow.texOffs(0, 68).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLegglowgreen = new ModelRenderer(this);
		LeftLegglowgreen.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegglowgreen, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegglowgreen.texOffs(18, 179).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLegglowblue = new ModelRenderer(this);
		LeftLegglowblue.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegglowblue, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegglowblue.texOffs(77, 90).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
	}

//	@Override
//	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
//		//previously the render function, render code was moved to a method below
//	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		
		float fred = (float)( this.WhiteColor >> 16 & 255) / 255.0F;
		float fgreen = (float)(this.WhiteColor >> 8 & 255) / 255.0F;
		float fblue = (float)(this.WhiteColor & 255) / 255.0F;
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
		this.Headsilver.copyFrom(this.head);
		Headsilver.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodygray.copyFrom(this.body);
		Bodygray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmgray.copyFrom(this.rightArm);
		RightArmgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmgray.copyFrom(this.leftArm);
		LeftArmgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.ThirdColor & 255) / 255.0F;
		this.Headgold.copyFrom(this.head);
		Headgold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodygold.copyFrom(this.body);
		Bodygold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegyellow.copyFrom(this.rightLeg);
		RightLegyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegyellow.copyFrom(this.leftLeg);
		LeftLegyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
		this.Headglowblue.copyFrom(this.head);
		Headglowblue.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmglowblue.copyFrom(this.rightArm);
		RightArmglowblue.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmblueglow.copyFrom(this.leftArm);
		LeftArmblueglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegglowblue.copyFrom(this.rightLeg);
		RightLegglowblue.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegglowblue.copyFrom(this.leftLeg);
		LeftLegglowblue.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.FifthColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.FifthColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.FifthColor & 255) / 255.0F;
		this.Bodyglowgreen.copyFrom(this.body);
		Bodyglowgreen.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmgreenglow.copyFrom(this.rightArm);
		RightArmgreenglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmgreenglow.copyFrom(this.leftArm);
		LeftArmgreenglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegglowgreen.copyFrom(this.rightLeg);
		RightLegglowgreen.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegglowgreen.copyFrom(this.leftLeg);
		LeftLegglowgreen.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		
		
		this.Bodylightblueglow.copyFrom(this.body);
		Bodylightblueglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, red, green, blue, alpha);
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
		this.RightArmsecondary.copyFrom(this.rightArm);
		RightArmsecondary.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmsecondary.copyFrom(this.leftArm);
		LeftArmsecondary.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.MainColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.MainColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.MainColor & 255) / 255.0F;
		this.Headglowred.copyFrom(this.head);
		Headglowred.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		
		buffer = Minecraft.getInstance().renderBuffers().bufferSource().getBuffer(RenderType.entityTranslucent(new ResourceLocation(
				"megamanarmormod:textures/armor/zeroarmorex.png")));
		
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
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
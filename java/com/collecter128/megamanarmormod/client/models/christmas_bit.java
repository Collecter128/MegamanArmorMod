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
public class christmas_bit extends BipedModel {
	private final ModelRenderer Headred;
	private final ModelRenderer Headgreen;
	private final ModelRenderer Headeyesglow;
	private final ModelRenderer Headblack;
	private final ModelRenderer Headwhite;
	private final ModelRenderer Bodyred;
	private final ModelRenderer Bodywhite;
	private final ModelRenderer Bodygray;
	private final ModelRenderer RightArmred;
	private final ModelRenderer RightArmwhite;
	private final ModelRenderer RightArmgray;
	private final ModelRenderer RightArmgreen;
	private final ModelRenderer RightArmyellowglow;
	private final ModelRenderer RightArmblueglow;
	private final ModelRenderer RightArmredglow;
	private final ModelRenderer RightArmlightgreen;
	private final ModelRenderer LeftArmred;
	private final ModelRenderer LeftArmwhite;
	private final ModelRenderer LeftArmgray;
	private final ModelRenderer LeftArmlightgreen;
	private final ModelRenderer LeftArmgreen;
	private final ModelRenderer LeftArmyellowglow;
	private final ModelRenderer LeftArmblueglow;
	private final ModelRenderer LeftArmredglow;
	private final ModelRenderer RightLegred;
	private final ModelRenderer RightLeggreen;
	private final ModelRenderer RightLegwhite;
	private final ModelRenderer RightLegredglow;
	private final ModelRenderer RightLegyellowglow;
	private final ModelRenderer RightLegblueglow;
	private final ModelRenderer LeftLegred;
	private final ModelRenderer LeftLeggreen;
	private final ModelRenderer LeftLegwhite;
	private final ModelRenderer LeftLegredglow;
	private final ModelRenderer LeftLegyellowglow;
	private final ModelRenderer LeftLegblueglow;
	
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

	public christmas_bit(float modelSize, EquipmentSlotType slot) {
		super(modelSize);
		texWidth = 79;
		texHeight = 240;
		
		equipmentslot = slot;
		
		MainColorDefault = 16719647;//Main red
		SecondaryColorDefault = 49692;//Secondary Green
		ThirdColorDefault = 16243202; //Yellow
		WhiteColorDefault = 16777215;//Basic White
		GlowyColorDefault = 2726655;//Glow? Blue
		GrayColorDefault = 14079702;//gray
		FourthColorDefault = 3881787; //Black
		FifthColorDefault = 11924736; //Light Green
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
		FourthColor = FourthColorDefault;
		FifthColor = FifthColorDefault;

		Headred = new ModelRenderer(this);
		Headred.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headred.texOffs(2, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Headgreen = new ModelRenderer(this);
		Headgreen.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headgreen.texOffs(66, 1).addBox(-8.0F, -6.0F, -1.5F, 3.0F, 2.0F, 3.0F, 0.0F, false);
		Headgreen.texOffs(66, 7).addBox(5.0F, -6.0F, -1.5F, 3.0F, 2.0F, 3.0F, 0.0F, false);
		Headgreen.texOffs(28, 177).addBox(-2.5F, -12.0F, -2.5F, 5.0F, 1.0F, 5.0F, 0.5F, false);
		Headgreen.texOffs(31, 186).addBox(-1.5F, -14.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.5F, false);
		Headgreen.texOffs(33, 193).addBox(-0.5F, -16.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.5F, false);
		}

		Headeyesglow = new ModelRenderer(this);
		Headeyesglow.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headeyesglow.texOffs(29, 84).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Headblack = new ModelRenderer(this);
		Headblack.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headblack.texOffs(34, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Headwhite = new ModelRenderer(this);
		Headwhite.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headwhite.texOffs(29, 101).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headwhite.texOffs(16, 66).addBox(-9.0F, -10.0F, -2.0F, 4.0F, 4.0F, 4.0F, -0.1F, false);
		Headwhite.texOffs(34, 66).addBox(5.0F, -10.0F, -2.0F, 4.0F, 4.0F, 4.0F, -0.1F, false);
		Headwhite.texOffs(16, 75).addBox(-9.0F, -4.0F, -2.0F, 4.0F, 4.0F, 4.0F, -0.1F, false);
		Headwhite.texOffs(34, 75).addBox(5.0F, -4.0F, -2.0F, 4.0F, 4.0F, 4.0F, -0.1F, false);
		Headwhite.texOffs(2, 176).addBox(-3.0F, -10.0F, -3.0F, 6.0F, 1.0F, 6.0F, 1.0F, false);
		Headwhite.texOffs(5, 186).addBox(-2.0F, -13.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.5F, false);
		Headwhite.texOffs(7, 194).addBox(-1.0F, -15.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.5F, false);
		Headwhite.texOffs(7, 199).addBox(-1.0F, -19.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.5F, false);
		}
		
		Bodyred = new ModelRenderer(this);
		Bodyred.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyred.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		Bodyred.texOffs(49, 211).addBox(-4.0F, 0.0F, -2.1F, 8.0F, 12.0F, 4.0F, 0.71F, false);
		}
		
		Bodywhite = new ModelRenderer(this);
		Bodywhite.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodywhite.texOffs(52, 175).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		Bodywhite.texOffs(3, 222).addBox(-4.0F, 0.0F, -2.1F, 8.0F, 12.0F, 4.0F, 0.71F, false);
		Bodywhite.texOffs(36, 220).addBox(-1.5F, -1.5F, -2.8F, 3.0F, 5.0F, 1.0F, 0.0F, false);
		}
		
		Bodygray = new ModelRenderer(this);
		Bodygray.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodygray.texOffs(16, 48).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.31F, false);
		Bodygray.texOffs(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.31F, false);
		}
		
		RightArmred = new ModelRenderer(this);
		RightArmred.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmred, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmred.texOffs(41, 48).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		RightArmred.texOffs(41, 16).addBox(-4.0F, -2.3609F, -2.0F, 5.0F, 3.0F, 4.0F, 0.75F, false);
		}
		
		RightArmwhite = new ModelRenderer(this);
		RightArmwhite.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmwhite, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmwhite.texOffs(41, 42).addBox(-3.0F, 5.6391F, -2.0F, 4.0F, 2.0F, 4.0F, 0.75F, false);
		RightArmwhite.texOffs(58, 136).addBox(-4.0F, -2.3609F, -2.0F, 5.0F, 3.0F, 4.0F, 0.75F, false);
		}
		
		RightArmgray = new ModelRenderer(this);
		RightArmgray.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmgray, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmgray.texOffs(41, 24).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		RightArmgreen = new ModelRenderer(this);
		RightArmgreen.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmgreen, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmgreen.texOffs(39, 158).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		RightArmgreen.texOffs(46, 64).addBox(-2.0F, -2.3609F, -2.5F, 3.0F, 3.0F, 1.0F, 0.75F, false);
		RightArmgreen.texOffs(50, 64).addBox(-2.0F, -2.3609F, 1.5F, 3.0F, 3.0F, 1.0F, 0.75F, false);
		}
		
		RightArmyellowglow = new ModelRenderer(this);
		RightArmyellowglow.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmyellowglow, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmyellowglow.texOffs(46, 74).addBox(-2.0F, -2.3609F, -2.5F, 3.0F, 3.0F, 1.0F, 0.75F, false);
		RightArmyellowglow.texOffs(50, 74).addBox(-2.0F, -2.3609F, 1.5F, 3.0F, 3.0F, 1.0F, 0.75F, false);
		}
		
		RightArmblueglow = new ModelRenderer(this);
		RightArmblueglow.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmblueglow, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmblueglow.texOffs(53, 69).addBox(-2.0F, -2.3609F, -2.5F, 3.0F, 3.0F, 1.0F, 0.75F, false);
		RightArmblueglow.texOffs(58, 74).addBox(-2.0F, -2.3609F, 1.5F, 3.0F, 3.0F, 1.0F, 0.75F, false);
		}
		
		RightArmredglow = new ModelRenderer(this);
		RightArmredglow.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmredglow, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmredglow.texOffs(53, 78).addBox(-2.0F, -2.3609F, -2.5F, 3.0F, 3.0F, 1.0F, 0.75F, false);
		RightArmredglow.texOffs(58, 88).addBox(-2.0F, -2.3609F, 1.5F, 3.0F, 3.0F, 1.0F, 0.75F, false);
		}
		
		RightArmlightgreen = new ModelRenderer(this);
		RightArmlightgreen.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmlightgreen, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmlightgreen.texOffs(1, 158).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		LeftArmred = new ModelRenderer(this);
		LeftArmred.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmred, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmred.texOffs(59, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArmred.texOffs(61, 16).addBox(-1.0F, -2.3609F, -2.0F, 5.0F, 3.0F, 4.0F, 0.75F, false);
		}
		
		LeftArmwhite = new ModelRenderer(this);
		LeftArmwhite.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmwhite, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmwhite.texOffs(59, 42).addBox(-1.0F, 5.6391F, -2.0F, 4.0F, 2.0F, 4.0F, 0.75F, false);
		LeftArmwhite.texOffs(58, 147).addBox(-1.0F, -2.3609F, -2.0F, 5.0F, 3.0F, 4.0F, 0.75F, false);
		}
		
		LeftArmgray = new ModelRenderer(this);
		LeftArmgray.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgray, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmgray.texOffs(59, 24).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		LeftArmlightgreen = new ModelRenderer(this);	
		LeftArmlightgreen.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmlightgreen, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmlightgreen.texOffs(19, 158).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		LeftArmgreen = new ModelRenderer(this);
		LeftArmgreen.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgreen, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmgreen.texOffs(57, 158).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArmgreen.texOffs(62, 64).addBox(-1.0F, -2.3609F, -2.5F, 3.0F, 3.0F, 1.0F, 0.75F, false);
		LeftArmgreen.texOffs(66, 64).addBox(-1.0F, -2.3609F, 1.5F, 3.0F, 3.0F, 1.0F, 0.75F, false);
		}
		
		LeftArmyellowglow = new ModelRenderer(this);
		LeftArmyellowglow.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmyellowglow, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmyellowglow.texOffs(62, 83).addBox(-1.0F, -2.3609F, -2.5F, 3.0F, 3.0F, 1.0F, 0.75F, false);
		LeftArmyellowglow.texOffs(66, 83).addBox(-1.0F, -2.3609F, 1.5F, 3.0F, 3.0F, 1.0F, 0.75F, false);
		}
		
		LeftArmblueglow = new ModelRenderer(this);
		LeftArmblueglow.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmblueglow, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmblueglow.texOffs(61, 69).addBox(-1.0F, -2.3609F, -2.5F, 3.0F, 3.0F, 1.0F, 0.75F, false);
		LeftArmblueglow.texOffs(66, 74).addBox(-1.0F, -2.3609F, 1.5F, 3.0F, 3.0F, 1.0F, 0.75F, false);
		}
		
		LeftArmredglow = new ModelRenderer(this);
		LeftArmredglow.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmredglow, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmredglow.texOffs(62, 88).addBox(-1.0F, -2.3609F, -2.5F, 3.0F, 3.0F, 1.0F, 0.75F, false);
		LeftArmredglow.texOffs(66, 88).addBox(-1.0F, -2.3609F, 1.5F, 3.0F, 3.0F, 1.0F, 0.75F, false);
		}
		
		RightLegred = new ModelRenderer(this);
		RightLegred.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegred, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegred.texOffs(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLeggreen = new ModelRenderer(this);
		RightLeggreen.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeggreen, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLeggreen.texOffs(0, 64).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLegwhite = new ModelRenderer(this);
		RightLegwhite.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegwhite, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegwhite.texOffs(0, 96).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLegredglow = new ModelRenderer(this);
		RightLegredglow.setPos(-1.9F, 12.0F, -1.9632F); //-1.9632 to 0.0
		setRotationAngle(RightLegredglow, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
			//- 2 to all
//		RightLegredglow.texOffs(15, 99).addBox(-2.0F, 8.5F, -0.0368F, 4.0F, 4.0F, 4.0F, 1.0F, false);
//		RightLegredglow.texOffs(16, 208).addBox(-4.3F, 6.5F, 2.5632F, 1.0F, 3.0F, 3.0F, 0.0F, false);
//		RightLegredglow.texOffs(31, 208).addBox(3.2F, 6.5F, 2.5632F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			RightLegredglow.texOffs(15, 99).addBox(-2.0F, 8.5F, -2.0368F, 4.0F, 4.0F, 4.0F, 1.0F, false);
			RightLegredglow.texOffs(16, 208).addBox(-4.3F, 6.5F, 0.5632F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			RightLegredglow.texOffs(31, 208).addBox(3.2F, 6.5F, 0.5632F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		}
		
		RightLegyellowglow = new ModelRenderer(this);
		RightLegyellowglow.setPos(-1.9F, 12.0F, -1.9632F);//-1.9632 to 0.0
		setRotationAngle(RightLegyellowglow, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
//		RightLegyellowglow.texOffs(1, 208).addBox(-3.3F, 6.5F, -1.0368F, 1.0F, 3.0F, 3.0F, 0.0F, false);
//		RightLegyellowglow.texOffs(13, 208).addBox(3.2F, 6.5F, -1.0368F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			RightLegyellowglow.texOffs(1, 208).addBox(-3.3F, 6.5F, -3.0368F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			RightLegyellowglow.texOffs(13, 208).addBox(3.2F, 6.5F, -3.0368F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		}
		
		RightLegblueglow = new ModelRenderer(this);
		RightLegblueglow.setPos(-1.9F, 12.0F, -1.9632F);//-1.9632 to 0.0
		setRotationAngle(RightLegblueglow, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
//		RightLegblueglow.texOffs(7, 210).addBox(-1.6F, 6.5F, -1.4368F, 3.0F, 3.0F, 1.0F, 0.0F, false);
//		RightLegblueglow.texOffs(24, 210).addBox(-2.6F, 6.5F, 5.1632F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			RightLegblueglow.texOffs(7, 210).addBox(-1.6F, 6.5F, -3.4368F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			RightLegblueglow.texOffs(24, 210).addBox(-2.6F, 6.5F, 3.1632F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		}
		
		LeftLegred = new ModelRenderer(this);
		LeftLegred.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegred, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegred.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLeggreen = new ModelRenderer(this);
		LeftLeggreen.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeggreen, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLeggreen.texOffs(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLegwhite = new ModelRenderer(this);
		LeftLegwhite.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegwhite, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegwhite.texOffs(0, 80).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLegredglow = new ModelRenderer(this);
		LeftLegredglow.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegredglow, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegredglow.texOffs(15, 109).addBox(-2.0F, 8.2F, -2.0F, 4.0F, 4.0F, 4.0F, 1.0F, true);
		LeftLegredglow.texOffs(19, 213).addBox(3.3F, 6.3F, 2.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		LeftLegredglow.texOffs(30, 213).addBox(-3.3F, 6.3F, 2.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		}
		
		LeftLegyellowglow = new ModelRenderer(this);
		LeftLegyellowglow.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegyellowglow, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegyellowglow.texOffs(13, 213).addBox(3.3F, 6.3F, -3.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		LeftLegyellowglow.texOffs(1, 213).addBox(-3.3F, 6.3F, -3.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		}
		
		LeftLegblueglow = new ModelRenderer(this);
		LeftLegblueglow.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegblueglow, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegblueglow.texOffs(7, 215).addBox(-1.4F, 6.3F, -3.4F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		LeftLegblueglow.texOffs(24, 215).addBox(-2.4F, 6.3F, 3.3F, 3.0F, 3.0F, 1.0F, 0.0F, false);
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
		this.RightArmredglow.copyFrom(this.rightArm);
		RightArmredglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmredglow.copyFrom(this.leftArm);
		LeftArmredglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegred.copyFrom(this.rightLeg);
		RightLegred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegred.copyFrom(this.leftLeg);
		LeftLegred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegredglow.copyFrom(this.rightLeg);
		RightLegredglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegredglow.copyFrom(this.leftLeg);
		LeftLegredglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
		this.Headgreen.copyFrom(this.head);
		Headgreen.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmgreen.copyFrom(this.rightArm);
		RightArmgreen.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmgreen.copyFrom(this.leftArm);
		LeftArmgreen.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLeggreen.copyFrom(this.rightLeg);
		RightLeggreen.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeggreen.copyFrom(this.leftLeg);
		LeftLeggreen.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.WhiteColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.WhiteColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.WhiteColor & 255) / 255.0F;
		this.Headwhite.copyFrom(this.head);
		Headwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Headeyesglow.copyFrom(this.head);
		Headeyesglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
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
		
		
		this.Headblack.copyFrom(this.head);
		Headblack.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		
		fred = (float)( this.GrayColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GrayColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GrayColor & 255) / 255.0F;
		this.Bodygray.copyFrom(this.body);
		Bodygray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmgray.copyFrom(this.rightArm);
		RightArmgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmgray.copyFrom(this.leftArm);
		LeftArmgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.ThirdColor & 255) / 255.0F;
		this.RightArmyellowglow.copyFrom(this.rightArm);
		RightArmyellowglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmyellowglow.copyFrom(this.leftArm);
		LeftArmyellowglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegyellowglow.copyFrom(this.rightLeg);
		RightLegyellowglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegyellowglow.copyFrom(this.leftLeg);
		LeftLegyellowglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
		this.RightArmblueglow.copyFrom(this.rightArm);
		RightArmblueglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmblueglow.copyFrom(this.leftArm);
		LeftArmblueglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegblueglow.copyFrom(this.rightLeg);
		RightLegblueglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegblueglow.copyFrom(this.leftLeg);
		LeftLegblueglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.FifthColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.FifthColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.FifthColor & 255) / 255.0F;
		this.RightArmlightgreen.copyFrom(this.rightArm);
		RightArmlightgreen.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmlightgreen.copyFrom(this.leftArm);
		LeftArmlightgreen.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
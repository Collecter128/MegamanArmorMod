package com.collecter128.megamanarmormod.client.models;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports

@OnlyIn(Dist.CLIENT)
public class stormeagle extends BipedModel {
	private final ModelRenderer Headpurple;
	private final ModelRenderer Headred;
	private final ModelRenderer Headyellow;
	private final ModelRenderer Head5_r1;
	private final ModelRenderer Headeyes;
	private final ModelRenderer Headgray;
	private final ModelRenderer Headgreenglow;
	private final ModelRenderer Bodypurple;
	private final ModelRenderer Bodyblue;
	private final ModelRenderer Bodyyellow;
	private final ModelRenderer Bodygray;
	private final ModelRenderer Bodyred;
	private final ModelRenderer Bodyyellowglow;
	private final ModelRenderer RightArmpurple;
	private final ModelRenderer RightArmblue;
	private final ModelRenderer RightArmyellow;
	private final ModelRenderer RightArmred;
	private final ModelRenderer RightArmgreen;
	private final ModelRenderer RightArmyellowglow;
	private final ModelRenderer RightArmgray;
	private final ModelRenderer RightArmblack;
	private final ModelRenderer LeftArmpurple;
	private final ModelRenderer LeftArmblue;
	private final ModelRenderer LeftArmyellow;
	private final ModelRenderer LeftArmblack;
	private final ModelRenderer LeftArmred;
	private final ModelRenderer LeftArmwhite;
	private final ModelRenderer LeftArmgray;
	private final ModelRenderer RightLegpurple;
	private final ModelRenderer RightLegblue;
	private final ModelRenderer RightLegyellow;
	private final ModelRenderer RightLeggray;
	private final ModelRenderer RightLeggreenglow;
	private final ModelRenderer LeftLegpurple;
	private final ModelRenderer LeftLegblue;
	private final ModelRenderer LeftLegyellow;
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

	public stormeagle(float modelSize, EquipmentSlotType slot) {
		super(modelSize);
		texWidth = 73;
		texHeight = 271;
		
		equipmentslot = slot;
		
		MainColorDefault = 11163897;//Main purple
		SecondaryColorDefault = 5799929;//Secondary Blue
		ThirdColorDefault = 16701968; //Yellow
		WhiteColorDefault = 16777215;//Basic White
		GlowyColorDefault = 7202940;//Glow? green
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

		Headpurple = new ModelRenderer(this);
		Headpurple.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headpurple.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Headred = new ModelRenderer(this);
		Headred.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headred.texOffs(0, 247).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
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
		
		Headgreenglow = new ModelRenderer(this);
		Headgreenglow.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headgreenglow.texOffs(33, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Bodypurple = new ModelRenderer(this);
		Bodypurple.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodypurple.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		Bodypurple.texOffs(3, 176).addBox(4.5F, -10.0F, 6.0F, 15.0F, 17.0F, 1.0F, 0.51F, false);
		Bodypurple.texOffs(36, 176).addBox(-19.5F, -10.0F, 6.0F, 15.0F, 17.0F, 1.0F, 0.51F, false);
		}
		
		Bodyblue = new ModelRenderer(this);
		Bodyblue.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyblue.texOffs(16, 64).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		Bodyblue.texOffs(44, 156).addBox(-0.5F, 0.0F, 3.0F, 1.0F, 5.0F, 1.0F, 0.51F, false);
		Bodyblue.texOffs(40, 153).addBox(-1.5F, 4.0F, 5.0F, 3.0F, 1.0F, 1.0F, 0.51F, false);
		Bodyblue.texOffs(48, 153).addBox(-1.5F, 0.0F, 5.0F, 3.0F, 1.0F, 1.0F, 0.51F, false);
		Bodyblue.texOffs(3, 194).addBox(4.5F, -10.0F, 6.0F, 15.0F, 17.0F, 1.0F, 0.51F, false);
		Bodyblue.texOffs(36, 194).addBox(-19.5F, -10.0F, 6.0F, 15.0F, 17.0F, 1.0F, 0.51F, false);
		}
		
		Bodyyellow = new ModelRenderer(this);
		Bodyyellow.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyyellow.texOffs(16, 144).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		Bodyyellow.texOffs(35, 161).addBox(-3.2F, 3.0F, -3.0F, 2.0F, 2.0F, 1.0F, 0.15F, false);
		Bodyyellow.texOffs(35, 161).addBox(1.2F, 3.0F, -3.0F, 2.0F, 2.0F, 1.0F, 0.15F, false);
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
		}
		
		Bodyyellowglow = new ModelRenderer(this);
		Bodyyellowglow.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyyellowglow.texOffs(10, 215).addBox(2.5F, -1.0F, 4.0F, 2.0F, 6.0F, 2.0F, 0.51F, false);
		Bodyyellowglow.texOffs(19, 215).addBox(-4.5F, -1.0F, 4.0F, 2.0F, 6.0F, 2.0F, 0.51F, false);
		}
		
		RightArmpurple = new ModelRenderer(this);
		RightArmpurple.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmpurple, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmpurple.texOffs(40, 40).addBox(-3.0F, 4.6391F, -2.0F, 4.0F, 7.0F, 4.0F, 0.75F, false);
		RightArmpurple.texOffs(40, 16).addBox(-3.0F, -3.3609F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		RightArmblue = new ModelRenderer(this);
		RightArmblue.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmblue, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmblue.texOffs(40, 52).addBox(-3.0F, 4.6391F, -2.0F, 4.0F, 7.0F, 4.0F, 0.75F, false);
		}
		
		RightArmyellow = new ModelRenderer(this);
		RightArmyellow.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmyellow, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmyellow.texOffs(57, 66).addBox(-3.0F, 4.6391F, -2.0F, 4.0F, 7.0F, 4.0F, 0.75F, false);
		RightArmyellow.texOffs(57, 141).addBox(-3.0F, -3.3609F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		RightArmred = new ModelRenderer(this);
		RightArmred.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmred, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmred.texOffs(40, 64).addBox(-3.0F, 4.6391F, -2.0F, 4.0F, 7.0F, 4.0F, 0.75F, false);
		RightArmred.texOffs(41, 141).addBox(-3.0F, 4.6391F, -2.0F, 4.0F, 7.0F, 4.0F, 0.75F, false);
		RightArmred.texOffs(0, 160).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		RightArmgreen = new ModelRenderer(this);
		RightArmgreen.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmgreen, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmgreen.texOffs(65, 4).addBox(-2.0F, 11.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.5F, false);
		}
		
		RightArmyellowglow = new ModelRenderer(this);
		RightArmyellowglow.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmyellowglow, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmyellowglow.texOffs(50, 265).addBox(-2.0F, 11.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.5F, false);
		}
		
		RightArmgray = new ModelRenderer(this);
		RightArmgray.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmgray, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmgray.texOffs(41, 129).addBox(-3.0F, 4.6391F, -2.0F, 4.0F, 7.0F, 4.0F, 0.75F, false);
		RightArmgray.texOffs(17, 160).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		RightArmgray.texOffs(57, 132).addBox(-3.0F, -3.3609F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		RightArmblack = new ModelRenderer(this);
		RightArmblack.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmblack, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmblack.texOffs(40, 24).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		LeftArmpurple = new ModelRenderer(this);
		LeftArmpurple.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmpurple, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmpurple.texOffs(57, 40).addBox(-1.0F, 4.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		LeftArmpurple.texOffs(57, 16).addBox(-1.0F, -3.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		LeftArmblue = new ModelRenderer(this);
		LeftArmblue.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmblue, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmblue.texOffs(0, 263).addBox(-1.0F, 4.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		LeftArmyellow = new ModelRenderer(this);
		LeftArmyellow.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmyellow, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmyellow.texOffs(17, 263).addBox(-1.0F, 4.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		LeftArmyellow.texOffs(57, 159).addBox(-1.0F, -3.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		LeftArmblack = new ModelRenderer(this);
		LeftArmblack.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmblack, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmblack.texOffs(57, 24).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		LeftArmred = new ModelRenderer(this);
		LeftArmred.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmred, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmred.texOffs(57, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		LeftArmwhite = new ModelRenderer(this);
		LeftArmwhite.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmwhite, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmwhite.texOffs(30, 214).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		LeftArmgray = new ModelRenderer(this);
		LeftArmgray.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgray, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmgray.texOffs(47, 214).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArmgray.texOffs(57, 150).addBox(-1.0F, -3.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		RightLegpurple = new ModelRenderer(this);
		RightLegpurple.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegpurple, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegpurple.texOffs(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLegblue = new ModelRenderer(this);
		RightLegblue.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegblue, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegblue.texOffs(0, 64).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLegyellow = new ModelRenderer(this);
		RightLegyellow.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegyellow, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegyellow.texOffs(17, 112).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		RightLegyellow.texOffs(64, 221).addBox(1.0F, 11.0F, -5.0F, 1.0F, 1.0F, 2.0F, 0.5F, false);
		RightLegyellow.texOffs(64, 225).addBox(-2.0F, 11.0F, -5.0F, 1.0F, 1.0F, 2.0F, 0.5F, false);
		}
		
		RightLeggray = new ModelRenderer(this);
		RightLeggray.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeggray, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLeggray.texOffs(52, 112).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLeggreenglow = new ModelRenderer(this);
		RightLeggreenglow.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeggreenglow, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLeggreenglow.texOffs(0, 144).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		LeftLegpurple = new ModelRenderer(this);
		LeftLegpurple.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegpurple, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegpurple.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLegblue = new ModelRenderer(this);
		LeftLegblue.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegblue, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegblue.texOffs(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLegyellow = new ModelRenderer(this);
		LeftLegyellow.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegyellow, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegyellow.texOffs(0, 112).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		LeftLegyellow.texOffs(64, 229).addBox(1.0F, 11.0F, -6.0F, 1.0F, 1.0F, 2.0F, 0.5F, true);
		LeftLegyellow.texOffs(64, 233).addBox(-2.0F, 11.0F, -6.0F, 1.0F, 1.0F, 2.0F, 0.5F, true);
		}
		
		LeftLeggray = new ModelRenderer(this);
		LeftLeggray.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeggray, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLeggray.texOffs(35, 112).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLeggreenglow = new ModelRenderer(this);
		LeftLeggreenglow.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeggreenglow, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLeggreenglow.texOffs(0, 128).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
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
		
		fred = (float)( this.FifthColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.FifthColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.FifthColor & 255) / 255.0F;
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
		this.Headyellow.copyFrom(this.head);
		Headyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
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
		
		this.Bodyyellowglow.copyFrom(this.body);
		Bodyyellowglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmyellowglow.copyFrom(this.rightArm);
		RightArmyellowglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		
		
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
		this.RightLeggray.copyFrom(this.rightLeg);
		RightLeggray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeggray.copyFrom(this.leftLeg);
		LeftLeggray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
		this.RightArmgreen.copyFrom(this.rightArm);
		RightArmgreen.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		this.Headgreenglow.copyFrom(this.head);
		Headgreenglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLeggreenglow.copyFrom(this.rightLeg);
		RightLeggreenglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeggreenglow.copyFrom(this.leftLeg);
		LeftLeggreenglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.FourthColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.FourthColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.FourthColor & 255) / 255.0F;
		this.RightArmblack.copyFrom(this.rightArm);
		RightArmblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmblack.copyFrom(this.leftArm);
		LeftArmblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.WhiteColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.WhiteColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.WhiteColor & 255) / 255.0F;
		this.LeftArmwhite.copyFrom(this.leftArm);
		LeftArmwhite.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
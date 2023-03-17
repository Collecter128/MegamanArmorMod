package com.collecter128.megamanarmormod.client.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

@OnlyIn(Dist.CLIENT)
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
	public int FourthColor;
	public int MainColorDefault;
	public int SecondaryColorDefault;
	public int WhiteColorDefault;
	public int ThirdColorDefault;
	public int GlowyColorDefault;
	public int GrayColorDefault;
	public int FourthColorDefault;
	
	EquipmentSlotType equipmentslot;

	public ixarmor_main(float modelSize, EquipmentSlotType slot) {
		super(modelSize);
		texWidth = 72;
		texHeight = 164;
		
		this.equipmentslot = slot;
		
		MainColorDefault = 2196050;//Main Body Color Greenish
		SecondaryColorDefault = 8507304;// Weird Greenish color
		ThirdColorDefault = 14227325; // Purpleishcolor
		WhiteColorDefault = 15325417;// ???
		GlowyColorDefault = 14680095;// ???
		GrayColorDefault = 8479030;// ???
		FourthColorDefault = 8677522;// tiny forhead spikes
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
		FourthColor = FourthColorDefault;

		Head = new ModelRenderer(this);
		Head.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Head, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Head2 = new ModelRenderer(this);
		Head2.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Head2, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head2.texOffs(49, 83).addBox(-1.0F, -9.0713F, -3.8955F, 2.0F, 6.0F, 9.0F, 0.4F, false);
		Head2.texOffs(38, 98).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Head2.texOffs(34, 0).addBox(5.2256F, -3.0986F, 1.3018F, 1.0F, 1.0F, 1.0F, 0.5F, false);
		Head2.texOffs(34, 4).addBox(-6.1554F, -3.0986F, 1.339F, 1.0F, 1.0F, 1.0F, 0.5F, false);
		}
		
		Head3 = new ModelRenderer(this);
		Head3.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Head3, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head3.texOffs(0, 66).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Head4 = new ModelRenderer(this);
		Head4.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Head4, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head4.texOffs(25, 1).addBox(-2.5F, -9.7F, -5.0F, 5.0F, 5.0F, 0.0F, 0.1F, false);
		}
		
		Headwhite = new ModelRenderer(this);
		Headwhite.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headwhite, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headwhite.texOffs(56, 2).addBox(-1.5F, -8.5055F, -5.0955F, 3.0F, 3.0F, 1.0F, 0.08F, false);
		}
		
		HeadGray = new ModelRenderer(this);
		HeadGray.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(HeadGray, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		HeadGray.texOffs(2, 60).addBox(5.3128F, -4.0F, 0.4156F, 1.0F, 3.0F, 3.0F, 0.5F, false);
		HeadGray.texOffs(2, 53).addBox(-6.0682F, -4.0F, 0.4528F, 1.0F, 3.0F, 3.0F, 0.5F, false);
		HeadGray.texOffs(32, 0).addBox(-3.6706F, -7.6327F, -3.8533F, 8.0F, 7.0F, 8.0F, 0.55F, false);
		}
		
		Headglow = new ModelRenderer(this);
		Headglow.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headglow, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headglow.texOffs(3, 86).addBox(-3.3526F, -3.8F, 0.5093F, 8.0F, 3.0F, 3.0F, 1.0F, false);
		Headglow.texOffs(4, 49).addBox(-1.0F, -8.0055F, -5.4762F, 2.0F, 2.0F, 1.0F, 0.1F, false);
		Headglow.texOffs(66, 4).addBox(-0.9128F, -2.2F, 4.0093F, 2.0F, 1.0F, 1.0F, 0.4F, false);
		}
		
		Body = new ModelRenderer(this);
		Body.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Body.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);
		}
		
		Body2 = new ModelRenderer(this);
		Body2.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Body2.texOffs(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		}
		
		Body3 = new ModelRenderer(this);
		Body3.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Body3.texOffs(0, 98).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);
		}
		
		Bodysilver = new ModelRenderer(this);
		Bodysilver.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodysilver.texOffs(16, 48).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		}
		
		Bodywhite = new ModelRenderer(this);
		Bodywhite.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodywhite.texOffs(31, 119).addBox(-0.5F, 1.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Bodywhite.texOffs(24, 122).addBox(-0.5F, -1.7F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Bodywhite.texOffs(19, 122).addBox(-0.5F, -1.7F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Bodywhite.texOffs(19, 120).addBox(-3.0F, -1.7F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Bodywhite.texOffs(24, 120).addBox(2.0F, -1.7F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Bodywhite.texOffs(5, 114).addBox(1.5F, -1.7F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Bodywhite.texOffs(15, 114).addBox(-2.5F, -1.7F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Bodywhite.texOffs(10, 114).addBox(-2.5F, -1.7F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Bodywhite.texOffs(0, 114).addBox(1.5F, -1.7F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Bodywhite.texOffs(0, 118).addBox(-2.0F, -1.7F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		Bodywhite.texOffs(31, 121).addBox(-0.5F, 3.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		}
		
		RightArm = new ModelRenderer(this);
		RightArm.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArm, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArm.texOffs(40, 16).addBox(-4.0F, -3.2019F, -2.0F, 4.0F, 4.0F, 4.0F, 0.8F, false);
		RightArm.texOffs(40, 58).addBox(-3.0F, 4.6239F, -1.8264F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		RightArm2 = new ModelRenderer(this);
		RightArm2.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArm2, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArm2.texOffs(40, 24).addBox(-3.0F, -2.0152F, -1.8264F, 4.0F, 13.0F, 4.0F, 0.5F, false);
		}
		
		RightArmgray = new ModelRenderer(this);
		RightArmgray.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmgray, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmgray.texOffs(40, 41).addBox(-3.0F, -2.0152F, -1.8264F, 4.0F, 13.0F, 4.0F, 0.5F, false);
		}
		
		RightArmsilver = new ModelRenderer(this);
		RightArmsilver.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmsilver, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmsilver.texOffs(39, 113).addBox(-3.0F, 4.6239F, -1.8264F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		RightArmsilver.texOffs(37, 122).addBox(-1.5F, 8.2F, -3.3615F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightArmsilver.texOffs(42, 122).addBox(-4.5F, 8.2F, -0.2335F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightArmsilver.texOffs(47, 122).addBox(1.5F, 8.2F, -0.2335F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightArmsilver.texOffs(52, 122).addBox(-1.5F, 8.2F, 2.8946F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		}
		
		RightArmred = new ModelRenderer(this);
		RightArmred.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmred, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmred.texOffs(40, 66).addBox(-3.0F, -2.0152F, -1.8264F, 4.0F, 13.0F, 4.0F, 0.5F, false);
		}
		
		LeftArm = new ModelRenderer(this);
		LeftArm.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArm, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArm.texOffs(56, 16).addBox(0.0F, -2.3974F, -2.0F, 4.0F, 4.0F, 4.0F, 0.8F, false);
		LeftArm.texOffs(56, 58).addBox(-1.0F, 4.6173F, -2.2079F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		LeftArm2 = new ModelRenderer(this);
		LeftArm2.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArm2, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArm2.texOffs(56, 24).addBox(-1.0F, -2.0218F, -2.2079F, 4.0F, 13.0F, 4.0F, 0.5F, true);
		}
		
		LeftArmgray = new ModelRenderer(this);
		LeftArmgray.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgray, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmgray.texOffs(56, 41).addBox(-1.0F, -2.0218F, -2.2079F, 4.0F, 13.0F, 4.0F, 0.5F, true);
		}
		
		LeftArmsilver = new ModelRenderer(this);
		LeftArmsilver.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmsilver, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmsilver.texOffs(56, 113).addBox(-1.0F, 4.6173F, -2.2079F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		LeftArmsilver.texOffs(31, 123).addBox(0.5F, 8.2F, -4.035F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		LeftArmsilver.texOffs(58, 122).addBox(3.5F, 7.9921F, -0.4782F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		LeftArmsilver.texOffs(68, 122).addBox(-2.5F, 7.9921F, -0.4782F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		LeftArmsilver.texOffs(63, 122).addBox(0.5F, 8.2F, 2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		}
		
		LeftArmred = new ModelRenderer(this);
		LeftArmred.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmred, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmred.texOffs(56, 66).addBox(-1.0F, -2.0218F, -2.2079F, 4.0F, 13.0F, 4.0F, 0.5F, true);
		}
		
		RightLeg = new ModelRenderer(this);
		RightLeg.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeg, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLeg.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLegwhite = new ModelRenderer(this);
		RightLegwhite.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegwhite, 0.192F, 0.0F, 0.0349F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0F, 0.0F, 0.0F);
		RightLegwhite.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.2182F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		cube_r1.texOffs(65, 13).addBox(2.45F, 8.9242F, 1.595F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.texOffs(65, 9).addBox(-3.5795F, 9.0986F, 1.5995F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.texOffs(24, 141).addBox(1.4175F, 9.0289F, -2.4037F, 1.0F, 1.0F, 1.0F, 0.1F, false);
		cube_r1.texOffs(24, 141).addBox(-0.5813F, 9.0986F, -2.4018F, 1.0F, 1.0F, 1.0F, 0.1F, false);
		cube_r1.texOffs(19, 141).addBox(-2.5801F, 9.1684F, -2.4F, 1.0F, 1.0F, 1.0F, 0.1F, false);
		}
		
		RightLeg_r1 = new ModelRenderer(this);
		RightLeg_r1.setPos(1.9F, 12.0F, 0.0F);
		RightLegwhite.addChild(RightLeg_r1);
		setRotationAngle(RightLeg_r1, -0.2182F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLeg_r1.texOffs(1, 160).addBox(-4.0F, -2.1269F, -2.6519F, 4.0F, 0.0F, 1.0F, 1.2F, false);
		}
		
		RightLeggray = new ModelRenderer(this);
		RightLeggray.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeggray, 0.192F, 0.0F, 0.0349F);
		

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(0.0F, 0.0F, 0.0F);
		RightLeggray.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.2182F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		cube_r2.texOffs(25, 157).addBox(2.4518F, 7.9146F, 0.6206F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		cube_r2.texOffs(15, 157).addBox(-3.5446F, 8.1238F, 0.626F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		}
		
		RightLegglow = new ModelRenderer(this);
		RightLegglow.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegglow, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegglow.texOffs(27, 103).addBox(-0.8947F, 14.2F, -1.0F, 2.0F, 1.0F, 2.0F, 1.0F, false);
		}
		
		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(0.0F, 0.0F, 0.0F);
		RightLegglow.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.2182F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		cube_r3.texOffs(38, 86).addBox(2.2F, 8.9242F, 1.595F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r3.texOffs(38, 84).addBox(-3.4F, 9.1335F, 1.6005F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		}
	/////////////////////////////////////////////////////////////
		LeftLeg = new ModelRenderer(this);
		LeftLeg.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeg, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLeg.texOffs(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLegWhite = new ModelRenderer(this);
		LeftLegWhite.setPos(5.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegWhite, -0.1745F, 0.0F, -0.0349F);
		

		cube_r4 = new ModelRenderer(this);
		cube_r4.setPos(-3.8F, 0.0F, 0.0F);
		LeftLegWhite.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.2182F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		cube_r4.texOffs(10, 62).addBox(5.45F, 8.9242F, 1.595F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r4.texOffs(10, 54).addBox(0.5795F, 9.0986F, 1.5995F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r4.texOffs(29, 143).addBox(5.4175F, 9.0289F, -2.4037F, 1.0F, 1.0F, 1.0F, 0.1F, false);
		cube_r4.texOffs(24, 143).addBox(3.5813F, 9.0986F, -2.4018F, 1.0F, 1.0F, 1.0F, 0.1F, false);
		cube_r4.texOffs(19, 143).addBox(1.5801F, 9.1684F, -2.4F, 1.0F, 1.0F, 1.0F, 0.1F, false);
		}

		LeftLeg_r2 = new ModelRenderer(this);
		LeftLeg_r2.setPos(-1.9F, 12.0F, 0.0F);
		LeftLegWhite.addChild(LeftLeg_r2);
		setRotationAngle(LeftLeg_r2, -0.2182F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.FEET) {
			LeftLeg_r2.texOffs(1, 160).addBox(0.0F, -2.1269F, -2.6519F, 4.0F, 0.0F, 1.0F, 1.2F, false);
		}
		
		LeftLeggray = new ModelRenderer(this);
		LeftLeggray.setPos(5.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeggray, -0.1745F, 0.0F, -0.0349F);
		
//Something may still be off here
		cube_r5 = new ModelRenderer(this);
		cube_r5.setPos(-3.8F, 0.0F, 0.0F);
		LeftLeggray.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.2182F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.FEET) {//+4 added like above
		cube_r5.texOffs(63, 157).addBox(6.4518F, 7.9146F, 0.6206F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		cube_r5.texOffs(52, 157).addBox(1.5446F, 8.1238F, 0.626F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		}
		
		LeftLegglow = new ModelRenderer(this);
		LeftLegglow.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegglow, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegglow.texOffs(27, 110).addBox(-1.2791F, 14.2F, -1.0F, 2.0F, 1.0F, 2.0F, 1.0F, true);
		}
		
		cube_r6 = new ModelRenderer(this);
		cube_r6.setPos(-3.8F, 0.0F, 0.0F);
		LeftLegglow.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.2182F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		cube_r6.texOffs(38, 90).addBox(6.1976F, 9.0532F, 1.6484F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r6.texOffs(38, 88).addBox(0.5976F, 9.2625F, 1.6539F, 1.0F, 1.0F, 1.0F, 0.0F, false);
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
		this.Head.copyFrom(this.head);
		Head.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Body.copyFrom(this.body);
		Body.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArm.copyFrom(this.rightArm);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArm.copyFrom(this.leftArm);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLeg.copyFrom(this.rightLeg);
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeg.copyFrom(this.leftLeg);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
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
		
		fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.ThirdColor & 255) / 255.0F;
		this.Head3.copyFrom(this.head);
		Head3.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Body3.copyFrom(this.body);
		Body3.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.FourthColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.FourthColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.FourthColor & 255) / 255.0F;
		this.Head4.copyFrom(this.head);
		Head4.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.WhiteColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.WhiteColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.WhiteColor & 255) / 255.0F;
		this.Headwhite.copyFrom(this.head);
		Headwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodywhite.copyFrom(this.body);
		Bodywhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegwhite.copyFrom(this.rightLeg);
		RightLegwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegWhite.copyFrom(this.leftLeg);
		LeftLegWhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		this.Bodysilver.copyFrom(this.body);
		Bodysilver.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmsilver.copyFrom(this.rightArm);
		RightArmsilver.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmsilver.copyFrom(this.leftArm);
		LeftArmsilver.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GrayColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GrayColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GrayColor & 255) / 255.0F;
		this.HeadGray.copyFrom(this.head);
		HeadGray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
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
		this.Headglow.copyFrom(this.head);
		Headglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegglow.copyFrom(this.rightLeg);
		RightLegglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegglow.copyFrom(this.leftLeg);
		LeftLegglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		
		this.RightArmred.copyFrom(this.rightArm);
		RightArmred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmred.copyFrom(this.leftArm);
		LeftArmred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);

	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
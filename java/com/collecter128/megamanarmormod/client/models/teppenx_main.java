package com.collecter128.megamanarmormod.client.models;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.inventory.EquipmentSlotType;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;


// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class teppenx_main extends BipedModel {//extends BipedModel
	private final ModelRenderer Headmainblue;
	private final ModelRenderer Head2;
	private final ModelRenderer Headgray;
	private final ModelRenderer Headglowred;
	private final ModelRenderer Headglowblue;
	private final ModelRenderer Headglowwhite;
	private final ModelRenderer Head_r1;
	private final ModelRenderer Head_r2;
	private final ModelRenderer Head_r3;
	private final ModelRenderer Bodymainblue;
	private final ModelRenderer Body2;
	private final ModelRenderer Bodyglowblue;
	private final ModelRenderer Bodygray;
	private final ModelRenderer RightArmmainblue;
	private final ModelRenderer RightArm2;
	private final ModelRenderer RightArmblueglow;
	private final ModelRenderer RightArmwhite;
	private final ModelRenderer RightArmgray;
	private final ModelRenderer LeftArmmainblue;
	private final ModelRenderer LeftArm2;
	private final ModelRenderer LeftArmblueglow;
	private final ModelRenderer LeftArmwhite;
	private final ModelRenderer LeftArmgray;
	private final ModelRenderer RightLegmainblue;
	private final ModelRenderer RightLeggray;
	private final ModelRenderer RightLegblueglow;
	private final ModelRenderer RightLegglow;
	private final ModelRenderer LeftLegmainblue;
	private final ModelRenderer LeftLeggray;
	private final ModelRenderer LeftLegglow;
	private final ModelRenderer LeftLegblueglow;
	
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

	public teppenx_main(float modelSize, EquipmentSlotType slot) {
		super(modelSize);
		texWidth = 73;
		texHeight = 277;
		
		equipmentslot = slot;
		
		MainColorDefault = 4023541;//Main Body Color Dark Blue
		SecondaryColorDefault = 7186901;//Secondary 
		ThirdColorDefault = 3590477; //???
		WhiteColorDefault = 16777215;//Basic White
		GlowyColorDefault = 16079968;//Glow? red
		GrayColorDefault = 5855577;//Kinda dark
		FourthColorDefault = 2419711; //Light Blue Bits
		//??? body middle thing 6584982
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
		FourthColor = FourthColorDefault;

		Headmainblue = new ModelRenderer(this);
		Headmainblue.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		setRotationAngle(Headmainblue, -0.1047F, 0.0873F, 0.0F);
		Headmainblue.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Head2 = new ModelRenderer(this);
		Head2.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Head2, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head2.texOffs(0, 66).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Head2.texOffs(44, 81).addBox(-1.0872F, -9.9562F, -4.4855F, 2.0F, 5.0F, 10.0F, 0.4F, false);
		}
		
		Headgray = new ModelRenderer(this);
		Headgray.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headgray, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headgray.texOffs(32, 0).addBox(5.4F, -5.9341F, -0.7842F, 1.0F, 3.0F, 3.0F, 0.5F, false);
		Headgray.texOffs(58, 0).addBox(-5.981F, -5.938F, -0.747F, 1.0F, 3.0F, 3.0F, 0.5F, false);
		Headgray.texOffs(32, 0).addBox(-3.6706F, -7.6327F, -3.8533F, 8.0F, 7.0F, 8.0F, 0.55F, false);
		}
		
		Headglowred = new ModelRenderer(this);
		Headglowred.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headglowred, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headglowred.texOffs(40, 96).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headglowred.texOffs(4, 49).addBox(-1.0F, -8.8411F, -5.6852F, 2.0F, 2.0F, 1.0F, 0.1F, false);
		Headglowred.texOffs(67, 12).addBox(5.4F, -4.9341F, 0.2158F, 1.0F, 1.0F, 1.0F, 0.5F, false);
		Headglowred.texOffs(29, 101).addBox(6.0F, -5.5F, -0.5F, 0.0F, 2.0F, 2.0F, 0.5F, false);
		Headglowred.texOffs(67, 8).addBox(-5.981F, -4.938F, 0.253F, 1.0F, 1.0F, 1.0F, 0.5F, false);
		Headglowred.texOffs(29, 108).addBox(-5.5F, -5.5F, -0.5F, 0.0F, 2.0F, 2.0F, 0.5F, false);
		}
		
		Headglowblue = new ModelRenderer(this);
		Headglowblue.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headglowblue, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headglowblue.texOffs(24, 1).addBox(6.0F, -6.0F, -0.7F, -1.0F, 3.0F, 3.0F, 0.9F, false);
		Headglowblue.texOffs(0, 1).addBox(-4.9F, -6.0F, -0.7F, -1.0F, 3.0F, 3.0F, 0.9F, false);
		}
		
		Headglowwhite = new ModelRenderer(this);
		Headglowwhite.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headglowwhite, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headglowwhite.texOffs(2, 166).addBox(-4.0F, -14.0F, -11.0F, 8.0F, 2.0F, 0.0F, 1.0F, false);
		Headglowwhite.texOffs(0, 176).addBox(-4.0F, -14.0F, 11.0F, 8.0F, 2.0F, 0.0F, 1.0F, false);
		Headglowwhite.texOffs(1, 179).addBox(-11.0F, -14.0F, -4.0F, 0.0F, 2.0F, 8.0F, 1.0F, false);
		Headglowwhite.texOffs(0, 188).addBox(10.0F, -14.0F, -4.0F, 0.0F, 2.0F, 8.0F, 1.0F, false);
		Headglowwhite.texOffs(49, 166).addBox(-4.0F, -14.0F, -8.0F, 8.0F, 2.0F, 0.0F, 1.0F, false);
		Headglowwhite.texOffs(56, 171).addBox(-4.0F, -14.0F, 7.0F, 8.0F, 2.0F, 0.0F, 1.0F, false);
		}
		
		Head_r1 = new ModelRenderer(this);
		Head_r1.setPos(0.0F, 24.0F, 0.0F);
		Headglowwhite.addChild(Head_r1);
		setRotationAngle(Head_r1, 0.0F, -0.8727F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head_r1.texOffs(56, 185).addBox(-5.0F, -38.0F, 7.0F, 8.0F, 2.0F, 0.0F, 1.0F, false);
		Head_r1.texOffs(48, 178).addBox(-4.0F, -38.0F, -8.0F, 8.0F, 2.0F, 0.0F, 1.0F, false);
		}
		
		Head_r2 = new ModelRenderer(this);
		Head_r2.setPos(0.0F, 24.0F, 0.0F);
		Headglowwhite.addChild(Head_r2);
		setRotationAngle(Head_r2, 0.0F, 0.8727F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head_r2.texOffs(55, 197).addBox(-4.0F, -38.0F, 7.0F, 8.0F, 2.0F, 0.0F, 1.0F, false);
		Head_r2.texOffs(48, 191).addBox(-4.0F, -38.0F, -8.0F, 8.0F, 2.0F, 0.0F, 1.0F, false);
		}
		
		Head_r3 = new ModelRenderer(this);
		Head_r3.setPos(0.0F, 24.0F, 0.0F);
		Headglowwhite.addChild(Head_r3);
		setRotationAngle(Head_r3, 0.0F, 0.7854F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head_r3.texOffs(22, 188).addBox(10.0F, -38.0F, -4.0F, 0.0F, 2.0F, 8.0F, 1.0F, false);
		Head_r3.texOffs(25, 179).addBox(-11.0F, -38.0F, -4.0F, 0.0F, 2.0F, 8.0F, 1.0F, false);
		Head_r3.texOffs(25, 176).addBox(-4.0F, -38.0F, 11.0F, 8.0F, 2.0F, 0.0F, 1.0F, false);
		Head_r3.texOffs(26, 166).addBox(-4.0F, -38.0F, -11.0F, 8.0F, 2.0F, 0.0F, 1.0F, false);
		}
		
		Bodymainblue = new ModelRenderer(this);
		Bodymainblue.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodymainblue.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);
		}
		
		Body2 = new ModelRenderer(this);
		Body2.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Body2.texOffs(16, 218).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		Body2.texOffs(16, 202).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);
		Body2.texOffs(33, 262).addBox(-2.0F, -1.5F, -2.0F, 4.0F, 1.0F, 4.0F, 0.2F, false);
		}
		
		Bodyglowblue = new ModelRenderer(this);
		Bodyglowblue.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyglowblue.texOffs(16, 234).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);
		}
		
		Bodygray = new ModelRenderer(this);
		Bodygray.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodygray.texOffs(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		Bodygray.texOffs(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		Bodygray.texOffs(16, 48).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		Bodygray.texOffs(41, 238).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);
		Bodygray.texOffs(57, 132).addBox(-2.0F, -1.5F, -2.0F, 4.0F, 1.0F, 4.0F, 0.2F, false);
		}
		
		RightArmmainblue = new ModelRenderer(this);
		RightArmmainblue.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmmainblue, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmmainblue.texOffs(40, 16).addBox(-4.0F, -3.2019F, -2.0F, 4.0F, 4.0F, 4.0F, 0.8F, false);
		RightArmmainblue.texOffs(40, 40).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		RightArm2 = new ModelRenderer(this);
		RightArm2.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArm2, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArm2.texOffs(40, 24).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		RightArmblueglow = new ModelRenderer(this);
		RightArmblueglow.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmblueglow, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmblueglow.texOffs(40, 229).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		RightArmblueglow.texOffs(40, 220).addBox(-4.0F, -3.2019F, -2.0F, 4.0F, 4.0F, 4.0F, 0.8F, false);
		}
		
		RightArmwhite = new ModelRenderer(this);
		RightArmwhite.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmwhite, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmwhite.texOffs(40, 48).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		RightArmgray = new ModelRenderer(this);
		RightArmgray.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmgray, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmgray.texOffs(40, 64).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		RightArmgray.texOffs(40, 202).addBox(-4.0F, -3.2019F, -2.0F, 4.0F, 4.0F, 4.0F, 0.8F, false);
		RightArmgray.texOffs(40, 211).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		LeftArmmainblue = new ModelRenderer(this);
		LeftArmmainblue.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmmainblue, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmmainblue.texOffs(57, 16).addBox(0.0F, -3.3974F, -2.0F, 4.0F, 4.0F, 4.0F, 0.8F, false);
		LeftArmmainblue.texOffs(57, 40).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		LeftArm2 = new ModelRenderer(this);
		LeftArm2.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArm2, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArm2.texOffs(57, 24).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		LeftArmblueglow = new ModelRenderer(this);
		LeftArmblueglow.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmblueglow, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmblueglow.texOffs(57, 220).addBox(0.0F, -3.3974F, -2.0F, 4.0F, 4.0F, 4.0F, 0.8F, false);
		LeftArmblueglow.texOffs(57, 229).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		LeftArmwhite = new ModelRenderer(this);
		LeftArmwhite.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmwhite, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmwhite.texOffs(57, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		LeftArmgray = new ModelRenderer(this);
		LeftArmgray.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgray, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmgray.texOffs(57, 64).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArmgray.texOffs(57, 202).addBox(0.0F, -3.3974F, -2.0F, 4.0F, 4.0F, 4.0F, 0.8F, false);
		LeftArmgray.texOffs(57, 211).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		RightLegmainblue = new ModelRenderer(this);
		RightLegmainblue.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegmainblue, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegmainblue.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLeggray = new ModelRenderer(this);
		RightLeggray.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeggray, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLeggray.texOffs(0, 202).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		RightLeggray.texOffs(43, 116).addBox(-3.7F, 8.0F, -2.0F, 0.0F, 4.0F, 4.0F, -0.5F, false);
		RightLeggray.texOffs(64, 141).addBox(2.8F, 8.0F, -2.0F, 0.0F, 4.0F, 4.0F, -0.5F, false);
		}
		
		RightLegblueglow = new ModelRenderer(this);
		RightLegblueglow.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegblueglow, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegblueglow.texOffs(52, 141).addBox(-2.7F, 8.0F, -2.0F, 0.0F, 4.0F, 4.0F, -0.5F, false);
		RightLegblueglow.texOffs(51, 116).addBox(2.8F, 8.0F, -2.0F, 0.0F, 4.0F, 4.0F, -0.5F, false);
		}
		
		RightLegglow = new ModelRenderer(this);
		RightLegglow.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegglow, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegglow.texOffs(27, 103).addBox(-0.8947F, 14.2F, -1.0F, 2.0F, 1.0F, 2.0F, 1.0F, false);
		}
		
		LeftLegmainblue = new ModelRenderer(this);
		LeftLegmainblue.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegmainblue, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegmainblue.texOffs(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLeggray = new ModelRenderer(this);
		LeftLeggray.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeggray, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLeggray.texOffs(0, 218).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		LeftLeggray.texOffs(54, 123).addBox(3.0F, 8.0F, -2.0F, 0.0F, 4.0F, 4.0F, -0.5F, true);
		LeftLeggray.texOffs(65, 123).addBox(-3.0F, 8.0F, -2.0F, 0.0F, 4.0F, 4.0F, -0.5F, true);
		}
		
		LeftLegglow = new ModelRenderer(this);
		LeftLegglow.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegglow, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegglow.texOffs(27, 110).addBox(-1.2791F, 14.2F, -1.0F, 2.0F, 1.0F, 2.0F, 1.0F, true);
		}
		
		LeftLegblueglow = new ModelRenderer(this);
		LeftLegblueglow.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegblueglow, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegblueglow.texOffs(60, 149).addBox(3.0F, 8.0F, -2.0F, 0.0F, 4.0F, 4.0F, -0.5F, true);
		LeftLegblueglow.texOffs(56, 149).addBox(-3.0F, 8.0F, -2.0F, 0.0F, 4.0F, 4.0F, -0.5F, true);
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
		this.Headmainblue.copyFrom(this.head);
		Headmainblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodymainblue.copyFrom(this.body);
		Bodymainblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmmainblue.copyFrom(this.rightArm);
		RightArmmainblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmmainblue.copyFrom(this.leftArm);
		LeftArmmainblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegmainblue.copyFrom(this.rightLeg);
		RightLegmainblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegmainblue.copyFrom(this.leftLeg);
		LeftLegmainblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
		this.Head2.copyFrom(this.head);
		Head2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Body2.copyFrom(this.body);
		Body2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArm2.copyFrom(this.leftArm);
		LeftArm2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArm2.copyFrom(this.rightArm);
		RightArm2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
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
		this.Headglowred.copyFrom(this.head);
		Headglowred.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegglow.copyFrom(this.rightLeg);
		RightLegglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegglow.copyFrom(this.leftLeg);
		LeftLegglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.FourthColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.FourthColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.FourthColor & 255) / 255.0F;
		this.Headglowblue.copyFrom(this.head);
		Headglowblue.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodyglowblue.copyFrom(this.body);
		Bodyglowblue.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmblueglow.copyFrom(this.rightArm);
		RightArmblueglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmblueglow.copyFrom(this.leftArm);
		LeftArmblueglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegblueglow.copyFrom(this.rightLeg);
		RightLegblueglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegblueglow.copyFrom(this.leftLeg);
		LeftLegblueglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.WhiteColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.WhiteColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.WhiteColor & 255) / 255.0F;
		this.Headglowwhite.copyFrom(this.head);
		Headglowwhite.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmwhite.copyFrom(this.rightArm);
		RightArmwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmwhite.copyFrom(this.leftArm);
		LeftArmwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
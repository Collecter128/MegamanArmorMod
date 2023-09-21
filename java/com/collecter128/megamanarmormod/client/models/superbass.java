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
public class superbass extends BipedModel {
	private final ModelRenderer Headblack;
	private final ModelRenderer cube_r1;
	private final ModelRenderer LFin_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer RFin_r1;
	private final ModelRenderer Headpurple;
	private final ModelRenderer cube_r3;
	private final ModelRenderer LFin_r2;
	private final ModelRenderer cube_r4;
	private final ModelRenderer RFin_r2;
	private final ModelRenderer Headwhite;
	private final ModelRenderer Headgray;
	private final ModelRenderer Headredglow;
	private final ModelRenderer Bodyblack;
	private final ModelRenderer Bodypurple;
	private final ModelRenderer Bodysilver;
	private final ModelRenderer Bodyredglow;
	private final ModelRenderer Bodygold;
	private final ModelRenderer RightArm;
	private final ModelRenderer RightArmsilver;
	private final ModelRenderer RightArmwhite;
	private final ModelRenderer RightArmgold;
	private final ModelRenderer RightArmpurple;
	private final ModelRenderer LeftArmblack;
	private final ModelRenderer LeftArmsilver;
	private final ModelRenderer LeftArmwhite;
	private final ModelRenderer LeftArmgold;
	private final ModelRenderer LeftArmpurple;
	private final ModelRenderer RightLeg;
	private final ModelRenderer RightLegwhite;
	private final ModelRenderer RightLegpurple;
	private final ModelRenderer RightLegglow;
	private final ModelRenderer LeftLegblack;
	private final ModelRenderer LeftLegwhite;
	private final ModelRenderer LeftLegpurple;
	private final ModelRenderer LeftLegglow;
	
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

	public superbass(float modelSize, EquipmentSlotType slot) {
		super(modelSize);
		texWidth = 82;
		texHeight = 217;
		
		equipmentslot = slot;
		
		MainColorDefault = 5855577;//Main Body Color black
		SecondaryColorDefault = 11350269;//Secondary purple
		ThirdColorDefault = 16625968; //Orange parts
		WhiteColorDefault = 16777215;//Basic White
		GlowyColorDefault = 16715535;//Glow? red
		GrayColorDefault = 13750737;//
		FourthColorDefault = 13750737; // 
		
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
		FourthColor = FourthColorDefault;

		Headblack = new ModelRenderer(this);
		Headblack.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headblack, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headblack.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0F, 0.0F, 0.0F);
		Headblack.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.2618F, -0.2618F, -0.2618F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		cube_r1.texOffs(61, 102).addBox(3.8F, -7.3064F, 4.0417F, 8.0F, 9.0F, 1.0F, 0.0F, false);
		}
		LFin_r1 = new ModelRenderer(this);
		LFin_r1.setPos(0.0F, 0.0F, 0.0F);
		Headblack.addChild(LFin_r1);
		setRotationAngle(LFin_r1, 0.0F, 0.0F, -0.7854F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		LFin_r1.texOffs(1, 116).addBox(4.2961F, -2.8609F, -6.0489F, 9.0F, 1.0F, 12.0F, 0.0F, false);
		}
		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(0.0F, 0.0F, 0.0F);
		Headblack.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.2618F, 0.2618F, 0.2618F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		cube_r2.texOffs(61, 112).addBox(-12.0F, -7.086F, 4.4969F, 8.0F, 9.0F, 1.0F, 0.0F, false);
		}
		RFin_r1 = new ModelRenderer(this);
		RFin_r1.setPos(0.0F, 0.0F, 0.0F);
		Headblack.addChild(RFin_r1);
		setRotationAngle(RFin_r1, 0.0F, 0.0F, 0.7854F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		RFin_r1.texOffs(1, 102).addBox(-13.2135F, -2.9693F, -6.0F, 9.0F, 1.0F, 12.0F, 0.0F, false);
		}
		
		Headpurple = new ModelRenderer(this);
		Headpurple.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headpurple, -0.1047F, 0.0873F, 0.0F);
		

		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(0.0F, 0.0F, 0.0F);
		Headpurple.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.2618F, -0.2618F, -0.2618F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		cube_r3.texOffs(61, 81).addBox(3.8F, -7.3064F, 4.0417F, 8.0F, 9.0F, 1.0F, 0.0F, false);
		}
		LFin_r2 = new ModelRenderer(this);
		LFin_r2.setPos(0.0F, 0.0F, 0.0F);
		Headpurple.addChild(LFin_r2);
		setRotationAngle(LFin_r2, 0.0F, 0.0F, -0.7854F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		LFin_r2.texOffs(3, 144).addBox(4.2961F, -2.8609F, -6.0489F, 9.0F, 1.0F, 12.0F, 0.0F, false);
		}
		cube_r4 = new ModelRenderer(this);
		cube_r4.setPos(0.0F, 0.0F, 0.0F);
		Headpurple.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.2618F, 0.2618F, 0.2618F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		cube_r4.texOffs(62, 91).addBox(-12.0F, -7.086F, 4.4969F, 8.0F, 9.0F, 1.0F, 0.0F, false);
		}
		RFin_r2 = new ModelRenderer(this);
		RFin_r2.setPos(0.0F, 0.0F, 0.0F);
		Headpurple.addChild(RFin_r2);
		setRotationAngle(RFin_r2, 0.0F, 0.0F, 0.7854F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		RFin_r2.texOffs(3, 130).addBox(-13.2135F, -2.9693F, -6.0F, 9.0F, 1.0F, 12.0F, 0.0F, false);
		}
		Headwhite = new ModelRenderer(this);
		Headwhite.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headwhite, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headwhite.texOffs(21, 81).addBox(-4.0872F, -5.0932F, -3.2183F, 8.0F, 3.0F, 3.0F, 0.78F, false);
		Headwhite.texOffs(66, 0).addBox(5.6616F, -4.6272F, -3.6519F, 1.0F, 3.0F, 3.0F, 0.5F, false);
		Headwhite.texOffs(66, 7).addBox(-5.7194F, -4.6311F, -3.6147F, 1.0F, 3.0F, 3.0F, 0.5F, false);
		}
		Headgray = new ModelRenderer(this);
		Headgray.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headgray, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headgray.texOffs(32, 0).addBox(-3.6706F, -7.6327F, -3.8533F, 8.0F, 7.0F, 8.0F, 0.55F, false);
		}
		Headredglow = new ModelRenderer(this);
		Headredglow.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headredglow, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headredglow.texOffs(21, 90).addBox(-4.0872F, -5.0932F, -3.2183F, 8.0F, 3.0F, 3.0F, 1.0F, false);
		Headredglow.texOffs(74, 1).addBox(-1.5114F, -9.8794F, -5.216F, 3.0F, 5.0F, 1.0F, 0.1F, false);
		}
		Bodyblack = new ModelRenderer(this);
		Bodyblack.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyblack.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);
		Bodyblack.texOffs(27, 182).addBox(4.0F, -4.0F, 7.0F, 12.0F, 14.0F, 1.0F, 0.7F, false);
		Bodyblack.texOffs(58, 183).addBox(-3.5F, -1.0F, 3.0F, 7.0F, 8.0F, 4.0F, 0.7F, false);
		Bodyblack.texOffs(28, 200).addBox(-16.0F, -4.0F, 7.0F, 12.0F, 14.0F, 1.0F, 0.7F, false);
		}
		
		Bodypurple = new ModelRenderer(this);
		Bodypurple.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodypurple.texOffs(59, 201).addBox(-3.5F, -1.0F, 3.0F, 7.0F, 8.0F, 4.0F, 0.7F, false);
		Bodypurple.texOffs(1, 181).addBox(4.0F, -4.0F, 7.0F, 12.0F, 14.0F, 1.0F, 0.7F, false);
		Bodypurple.texOffs(2, 201).addBox(-16.0F, -4.0F, 7.0F, 12.0F, 14.0F, 1.0F, 0.7F, false);
		}
		
		Bodysilver = new ModelRenderer(this);
		Bodysilver.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodysilver.texOffs(16, 64).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		}
		
		Bodyredglow = new ModelRenderer(this);
		Bodyredglow.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyredglow.texOffs(16, 48).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);
		}
		
		Bodygold = new ModelRenderer(this);
		Bodygold.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodygold.texOffs(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);
		}
		
		RightArm = new ModelRenderer(this);
		RightArm.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArm, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArm.texOffs(40, 47).addBox(-6.0F, -2.2019F, -2.0F, 6.0F, 3.0F, 4.0F, 0.8F, false);
		RightArm.texOffs(44, 39).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		RightArmsilver = new ModelRenderer(this);
		RightArmsilver.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmsilver, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmsilver.texOffs(44, 23).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		RightArmwhite = new ModelRenderer(this);
		RightArmwhite.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmwhite, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmwhite.texOffs(45, 54).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		RightArmgold = new ModelRenderer(this);
		RightArmgold.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmgold, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmgold.texOffs(40, 16).addBox(-6.0F, -2.2019F, -2.0F, 6.0F, 3.0F, 4.0F, 0.8F, false);
		}
		RightArmpurple = new ModelRenderer(this);
		RightArmpurple.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmpurple, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmpurple.texOffs(45, 70).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		LeftArmblack = new ModelRenderer(this);
		LeftArmblack.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmblack, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmblack.texOffs(61, 47).addBox(0.0F, -2.3756F, -1.7921F, 6.0F, 3.0F, 4.0F, 0.8F, false);
		LeftArmblack.texOffs(64, 39).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		LeftArmsilver = new ModelRenderer(this);
		LeftArmsilver.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmsilver, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmsilver.texOffs(63, 23).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		LeftArmwhite = new ModelRenderer(this);
		LeftArmwhite.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmwhite, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmwhite.texOffs(63, 54).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		LeftArmgold = new ModelRenderer(this);
		LeftArmgold.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgold, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmgold.texOffs(61, 16).addBox(0.0F, -2.3756F, -1.7921F, 6.0F, 3.0F, 4.0F, 0.8F, false);
		}
		LeftArmpurple = new ModelRenderer(this);
		LeftArmpurple.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmpurple, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmpurple.texOffs(63, 70).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		RightLeg = new ModelRenderer(this);	
		RightLeg.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeg, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLeg.texOffs(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		RightLegwhite = new ModelRenderer(this);
		RightLegwhite.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegwhite, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegwhite.texOffs(0, 64).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		RightLegpurple = new ModelRenderer(this);
		RightLegpurple.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegpurple, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegpurple.texOffs(43, 79).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		RightLegglow = new ModelRenderer(this);
		RightLegglow.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegglow, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegglow.texOffs(47, 114).addBox(-1.0F, 7.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.7F, false);
		}
		LeftLegblack = new ModelRenderer(this);
		LeftLegblack.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegblack, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegblack.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		LeftLegwhite = new ModelRenderer(this);
		LeftLegwhite.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegwhite, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegwhite.texOffs(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		LeftLegpurple = new ModelRenderer(this);
		LeftLegpurple.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegpurple, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegpurple.texOffs(0, 80).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		LeftLegglow = new ModelRenderer(this);
		LeftLegglow.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegglow, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegglow.texOffs(46, 101).addBox(-1.0F, 7.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.7F, true);
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
		this.Headblack.copyFrom(this.head);
		Headblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodyblack.copyFrom(this.body);
		Bodyblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArm.copyFrom(this.rightArm);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmblack.copyFrom(this.leftArm);
		LeftArmblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLeg.copyFrom(this.rightLeg);
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegblack.copyFrom(this.leftLeg);
		LeftLegblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
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
		
		fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.ThirdColor & 255) / 255.0F;
		this.Bodygold.copyFrom(this.body);
		Bodygold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmgold.copyFrom(this.rightArm);
		RightArmgold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmgold.copyFrom(this.leftArm);
		LeftArmgold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.WhiteColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.WhiteColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.WhiteColor & 255) / 255.0F;
		this.Headwhite.copyFrom(this.head);
		Headwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
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
		this.Bodysilver.copyFrom(this.body);
		Bodysilver.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmsilver.copyFrom(this.rightArm);
		RightArmsilver.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmsilver.copyFrom(this.leftArm);
		LeftArmsilver.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
		this.Headredglow.copyFrom(this.head);
		Headredglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodyredglow.copyFrom(this.body);
		Bodyredglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegglow.copyFrom(this.rightLeg);
		RightLegglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegglow.copyFrom(this.leftLeg);
		LeftLegglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
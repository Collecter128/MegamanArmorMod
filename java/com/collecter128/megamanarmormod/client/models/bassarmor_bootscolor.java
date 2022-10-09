package com.collecter128.megamanarmormod.client.models;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class bassarmor_bootscolor extends BipedModel {
//	private final ModelRenderer Headblack;
//	private final ModelRenderer cube_r1;
//	private final ModelRenderer LFin_r1;
//	private final ModelRenderer cube_r2;
//	private final ModelRenderer RFin_r1;
//	private final ModelRenderer Headgold;
//	private final ModelRenderer cube_r3;
//	private final ModelRenderer LFin_r2;
//	private final ModelRenderer cube_r4;
//	private final ModelRenderer RFin_r2;
//	private final ModelRenderer Headwhite;
//	private final ModelRenderer Headgray;
//	private final ModelRenderer Headglow;
//	private final ModelRenderer Bodyblack;
//	private final ModelRenderer Bodysilver;
//	private final ModelRenderer Bodyglow;
//	private final ModelRenderer Bodygold;
//	private final ModelRenderer RightArm;
//	private final ModelRenderer RightArmsilver;
//	private final ModelRenderer RightArmwhite;
//	private final ModelRenderer RightArmgold;
//	private final ModelRenderer LeftArmblack;
//	private final ModelRenderer LeftArmsilver;
//	private final ModelRenderer LeftArmwhite;
//	private final ModelRenderer LeftArmgold;
	private final ModelRenderer RightLeg;
	private final ModelRenderer RightLegwhite;
	private final ModelRenderer RightLeggold;
	private final ModelRenderer RightLegglow;
	private final ModelRenderer LeftLegblack;
	private final ModelRenderer LeftLegwhite;
	private final ModelRenderer LeftLeggold;
	private final ModelRenderer LeftLegglow;
	
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

	public bassarmor_bootscolor(float modelSize) {
		super(modelSize);
		texWidth = 82;
		texHeight = 176;
		
		MainColorDefault = 5855577;//Main Body Color black
		SecondaryColorDefault = 16763674;//Secondary
		ThirdColorDefault = 16771098; //golden 
		WhiteColorDefault = 16777215;//
		GlowyColorDefault = 4032511;//
		GrayColorDefault = 13750737;//
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;

//		Headblack = new ModelRenderer(this);
//		Headblack.setRotationPoint(0.0F, 0.0F, 0.0F);
//		setRotationAngle(Headblack, -0.1047F, 0.0873F, 0.0F);
//		Headblack.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
//
//		cube_r1 = new ModelRenderer(this);
//		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
//		Headblack.addChild(cube_r1);
//		setRotationAngle(cube_r1, 0.2618F, -0.2618F, -0.2618F);
//		cube_r1.setTextureOffset(61, 102).addBox(3.8F, -7.3064F, 4.0417F, 8.0F, 9.0F, 1.0F, 0.0F, false);
//
//		LFin_r1 = new ModelRenderer(this);
//		LFin_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
//		Headblack.addChild(LFin_r1);
//		setRotationAngle(LFin_r1, 0.0F, 0.0F, -0.7854F);
//		LFin_r1.setTextureOffset(1, 116).addBox(4.2961F, -2.8609F, -6.0489F, 9.0F, 1.0F, 12.0F, 0.0F, false);
//
//		cube_r2 = new ModelRenderer(this);
//		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
//		Headblack.addChild(cube_r2);
//		setRotationAngle(cube_r2, 0.2618F, 0.2618F, 0.2618F);
//		cube_r2.setTextureOffset(61, 112).addBox(-12.0F, -7.086F, 4.4969F, 8.0F, 9.0F, 1.0F, 0.0F, false);
//
//		RFin_r1 = new ModelRenderer(this);
//		RFin_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
//		Headblack.addChild(RFin_r1);
//		setRotationAngle(RFin_r1, 0.0F, 0.0F, 0.7854F);
//		RFin_r1.setTextureOffset(1, 102).addBox(-13.2135F, -2.9693F, -6.0F, 9.0F, 1.0F, 12.0F, 0.0F, false);
//
//		Headgold = new ModelRenderer(this);
//		Headgold.setRotationPoint(0.0F, 0.0F, 0.0F);
//		setRotationAngle(Headgold, -0.1047F, 0.0873F, 0.0F);
//		
//
//		cube_r3 = new ModelRenderer(this);
//		cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
//		Headgold.addChild(cube_r3);
//		setRotationAngle(cube_r3, 0.2618F, -0.2618F, -0.2618F);
//		cube_r3.setTextureOffset(61, 81).addBox(3.8F, -7.3064F, 4.0417F, 8.0F, 9.0F, 1.0F, 0.0F, false);
//
//		LFin_r2 = new ModelRenderer(this);
//		LFin_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
//		Headgold.addChild(LFin_r2);
//		setRotationAngle(LFin_r2, 0.0F, 0.0F, -0.7854F);
//		LFin_r2.setTextureOffset(3, 144).addBox(4.2961F, -2.8609F, -6.0489F, 9.0F, 1.0F, 12.0F, 0.0F, false);
//
//		cube_r4 = new ModelRenderer(this);
//		cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
//		Headgold.addChild(cube_r4);
//		setRotationAngle(cube_r4, 0.2618F, 0.2618F, 0.2618F);
//		cube_r4.setTextureOffset(62, 91).addBox(-12.0F, -7.086F, 4.4969F, 8.0F, 9.0F, 1.0F, 0.0F, false);
//
//		RFin_r2 = new ModelRenderer(this);
//		RFin_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
//		Headgold.addChild(RFin_r2);
//		setRotationAngle(RFin_r2, 0.0F, 0.0F, 0.7854F);
//		RFin_r2.setTextureOffset(3, 130).addBox(-13.2135F, -2.9693F, -6.0F, 9.0F, 1.0F, 12.0F, 0.0F, false);
//
//		Headwhite = new ModelRenderer(this);
//		Headwhite.setRotationPoint(0.0F, 0.0F, 0.0F);
//		setRotationAngle(Headwhite, -0.1047F, 0.0873F, 0.0F);
//		Headwhite.setTextureOffset(21, 81).addBox(-4.0872F, -5.0932F, -3.2183F, 8.0F, 3.0F, 3.0F, 0.78F, false);
//		Headwhite.setTextureOffset(66, 0).addBox(5.6616F, -4.6272F, -3.6519F, 1.0F, 3.0F, 3.0F, 0.5F, false);
//		Headwhite.setTextureOffset(66, 7).addBox(-5.7194F, -4.6311F, -3.6147F, 1.0F, 3.0F, 3.0F, 0.5F, false);
//
//		Headgray = new ModelRenderer(this);
//		Headgray.setRotationPoint(0.0F, 0.0F, 0.0F);
//		setRotationAngle(Headgray, -0.1047F, 0.0873F, 0.0F);
//		Headgray.setTextureOffset(32, 0).addBox(-3.6706F, -7.6327F, -3.8533F, 8.0F, 7.0F, 8.0F, 0.55F, false);
//
//		Headglow = new ModelRenderer(this);
//		Headglow.setRotationPoint(0.0F, 0.0F, 0.0F);
//		setRotationAngle(Headglow, -0.1047F, 0.0873F, 0.0F);
//		Headglow.setTextureOffset(21, 90).addBox(-4.0872F, -5.0932F, -3.2183F, 8.0F, 3.0F, 3.0F, 1.0F, false);
//		Headglow.setTextureOffset(74, 1).addBox(-1.5114F, -9.8794F, -5.216F, 3.0F, 5.0F, 1.0F, 0.1F, false);
//
//		Bodyblack = new ModelRenderer(this);
//		Bodyblack.setRotationPoint(0.0F, 0.0F, 0.0F);
//		Bodyblack.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);
//
//		Bodysilver = new ModelRenderer(this);
//		Bodysilver.setRotationPoint(0.0F, 0.0F, 0.0F);
//		Bodysilver.setTextureOffset(16, 64).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
//
//		Bodyglow = new ModelRenderer(this);
//		Bodyglow.setRotationPoint(0.0F, 0.0F, 0.0F);
//		Bodyglow.setTextureOffset(16, 48).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);
//
//		Bodygold = new ModelRenderer(this);
//		Bodygold.setRotationPoint(0.0F, 0.0F, 0.0F);
//		Bodygold.setTextureOffset(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);
//
//		RightArm = new ModelRenderer(this);
//		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
//		setRotationAngle(RightArm, -0.1745F, 0.0F, 0.0F);
//		RightArm.setTextureOffset(40, 47).addBox(-6.0F, -2.2019F, -2.0F, 6.0F, 3.0F, 4.0F, 0.8F, false);
//		RightArm.setTextureOffset(44, 39).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
//
//		RightArmsilver = new ModelRenderer(this);
//		RightArmsilver.setRotationPoint(-5.0F, 2.0F, 0.0F);
//		setRotationAngle(RightArmsilver, -0.1745F, 0.0F, 0.0F);
//		RightArmsilver.setTextureOffset(44, 23).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
//
//		RightArmwhite = new ModelRenderer(this);
//		RightArmwhite.setRotationPoint(-5.0F, 2.0F, 0.0F);
//		setRotationAngle(RightArmwhite, -0.1745F, 0.0F, 0.0F);
//		RightArmwhite.setTextureOffset(45, 54).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
//
//		RightArmgold = new ModelRenderer(this);
//		RightArmgold.setRotationPoint(-5.0F, 2.0F, 0.0F);
//		setRotationAngle(RightArmgold, -0.1745F, 0.0F, 0.0F);
//		RightArmgold.setTextureOffset(40, 16).addBox(-6.0F, -2.2019F, -2.0F, 6.0F, 3.0F, 4.0F, 0.8F, false);
//		RightArmgold.setTextureOffset(44, 27).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
//		RightArmgold.setTextureOffset(45, 70).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);

//		LeftArmblack = new ModelRenderer(this);
//		LeftArmblack.setRotationPoint(5.0F, 2.0F, 0.0F);
//		setRotationAngle(LeftArmblack, 0.2094F, 0.0F, 0.0F);
//		LeftArmblack.setTextureOffset(61, 47).addBox(0.0F, -2.3756F, -1.7921F, 6.0F, 3.0F, 4.0F, 0.8F, false);
//		LeftArmblack.setTextureOffset(64, 39).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
//
//		LeftArmsilver = new ModelRenderer(this);
//		LeftArmsilver.setRotationPoint(5.0F, 2.0F, 0.0F);
//		setRotationAngle(LeftArmsilver, 0.2094F, 0.0F, 0.0F);
//		LeftArmsilver.setTextureOffset(63, 23).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
//
//		LeftArmwhite = new ModelRenderer(this);
//		LeftArmwhite.setRotationPoint(5.0F, 2.0F, 0.0F);
//		setRotationAngle(LeftArmwhite, 0.2094F, 0.0F, 0.0F);
//		LeftArmwhite.setTextureOffset(63, 54).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
//
//		LeftArmgold = new ModelRenderer(this);
//		LeftArmgold.setRotationPoint(5.0F, 2.0F, 0.0F);
//		setRotationAngle(LeftArmgold, 0.2094F, 0.0F, 0.0F);
//		LeftArmgold.setTextureOffset(61, 16).addBox(0.0F, -2.3756F, -1.7921F, 6.0F, 3.0F, 4.0F, 0.8F, false);
//		LeftArmgold.setTextureOffset(63, 70).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeg, 0.192F, 0.0F, 0.0349F);
		RightLeg.texOffs(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);

		RightLegwhite = new ModelRenderer(this);
		RightLegwhite.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegwhite, 0.192F, 0.0F, 0.0349F);
		RightLegwhite.texOffs(0, 64).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);

		RightLeggold = new ModelRenderer(this);
		RightLeggold.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeggold, 0.192F, 0.0F, 0.0349F);
		RightLeggold.texOffs(43, 79).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);

		RightLegglow = new ModelRenderer(this);
		RightLegglow.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegglow, 0.192F, 0.0F, 0.0349F);
		RightLegglow.texOffs(47, 114).addBox(-1.0F, 7.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.7F, false);

		LeftLegblack = new ModelRenderer(this);
		LeftLegblack.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegblack, -0.1745F, 0.0F, -0.0349F);
		LeftLegblack.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);

		LeftLegwhite = new ModelRenderer(this);
		LeftLegwhite.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegwhite, -0.1745F, 0.0F, -0.0349F);
		LeftLegwhite.texOffs(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);

		LeftLeggold = new ModelRenderer(this);
		LeftLeggold.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeggold, -0.1745F, 0.0F, -0.0349F);
		LeftLeggold.texOffs(0, 80).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);

		LeftLegglow = new ModelRenderer(this);
		LeftLegglow.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegglow, -0.1745F, 0.0F, -0.0349F);
		LeftLegglow.texOffs(46, 101).addBox(-1.0F, 7.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.7F, true);
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
//		this.Headblack.copyModelAngles(this.bipedHead);
//		Headblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.Bodyblack.copyModelAngles(this.bipedBody);
//		Bodyblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.RightArm.copyModelAngles(this.bipedRightArm);
//		RightArm.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.LeftArmblack.copyModelAngles(this.bipedLeftArm);
//		LeftArmblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLeg.copyFrom(this.rightLeg);
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegblack.copyFrom(this.leftLeg);
		LeftLegblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GrayColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GrayColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GrayColor & 255) / 255.0F;
//		this.Headgray.copyModelAngles(this.bipedHead);
//		Headgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.Bodysilver.copyModelAngles(this.bipedBody);
//		Bodysilver.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.RightArmsilver.copyModelAngles(this.bipedRightArm);
//		RightArmsilver.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.LeftArmsilver.copyModelAngles(this.bipedLeftArm);
//		LeftArmsilver.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		

		fred = (float)( this.WhiteColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.WhiteColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.WhiteColor & 255) / 255.0F;
//		this.Headwhite.copyModelAngles(this.bipedHead);
//		Headwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.RightArmwhite.copyModelAngles(this.bipedRightArm);
//		RightArmwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.LeftArmwhite.copyModelAngles(this.bipedLeftArm);
//		LeftArmwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegwhite.copyFrom(this.rightLeg);
		RightLegwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegwhite.copyFrom(this.leftLeg);
		LeftLegwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
//		this.Headgold.copyModelAngles(this.bipedHead);
//		Headgold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.Bodygold.copyModelAngles(this.bipedBody);
//		Bodygold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.RightArmgold.copyModelAngles(this.bipedRightArm);
//		RightArmgold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.LeftArmgold.copyModelAngles(this.bipedLeftArm);
//		LeftArmgold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLeggold.copyFrom(this.rightLeg);
		RightLeggold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeggold.copyFrom(this.leftLeg);
		LeftLeggold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
//        this.Headglow.copyModelAngles(this.bipedHead);
//		Headglow.render(matrixStack, buffer, 15728640, packedOverlay, fred, fgreen, fblue, alpha);
//		this.Bodyglow.copyModelAngles(this.bipedBody);
//		Bodyglow.render(matrixStack, buffer, 15728640, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegglow.copyFrom(this.rightLeg);
		RightLegglow.render(matrixStack, buffer, 15728640, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegglow.copyFrom(this.leftLeg);
		LeftLegglow.render(matrixStack, buffer, 15728640, packedOverlay, fred, fgreen, fblue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
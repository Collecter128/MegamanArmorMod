package com.collecter128.megamanarmormod.client.models;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class sigma_chestcolor extends BipedModel  {
//	private final ModelRenderer Head;
//	private final ModelRenderer Headsilver;
//	private final ModelRenderer Headcrystal;
//	private final ModelRenderer HeadEyes;
	private final ModelRenderer BodyGreen;
	private final ModelRenderer Bodysilver;
	private final ModelRenderer BodyWhite;
	private final ModelRenderer Bodyglow;
	private final ModelRenderer BodyBlack;
	private final ModelRenderer RightArmgreen;
	private final ModelRenderer RightArmblue;
	private final ModelRenderer RightArmgray;
	private final ModelRenderer RightArmblack;
	private final ModelRenderer RightArmwhite;
	private final ModelRenderer RightArmred;
	private final ModelRenderer LeftArmgreen;
	private final ModelRenderer LeftArmsilver;
	private final ModelRenderer LeftArmblue;
	private final ModelRenderer LeftArmblack;
	private final ModelRenderer LeftArmwhite;
	private final ModelRenderer LeftArmred;
//	private final ModelRenderer RightLeg;
//	private final ModelRenderer RightLegSilverandGold;
//	private final ModelRenderer RightLegglow;
//	private final ModelRenderer LeftLeg;
//	private final ModelRenderer LeftLegSilverandGold;
//	private final ModelRenderer LeftLegglow;
	
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

	public sigma_chestcolor(float modelSize) {
		super(modelSize);
		texWidth = 75;
		texHeight = 153;
		
		MainColorDefault = 4574259;//Main Body Color 
		SecondaryColorDefault = 3168981; //blue bits
		WhiteColorDefault = 16777215;
		ThirdColorDefault = 13401651; //Brown
		GlowyColorDefault = 14691113; // It's red
		GrayColorDefault = 11322824; //Slightly blue
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;

//		Head = new ModelRenderer(this);
//		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
//		setRotationAngle(Head, -0.1047F, 0.0873F, 0.0F);
//		Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.55F, false);
//		Head.setTextureOffset(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
//
//		Headsilver = new ModelRenderer(this);
//		Headsilver.setRotationPoint(0.0F, 0.0F, 0.0F);
//		setRotationAngle(Headsilver, -0.1047F, 0.0873F, 0.0F);
//		Headsilver.setTextureOffset(63, 68).addBox(4.4038F, -5.925F, -0.8709F, 1.0F, 3.0F, 3.0F, 0.5F, false);
//		Headsilver.setTextureOffset(52, 68).addBox(-4.9848F, -5.9471F, -0.6603F, 1.0F, 3.0F, 3.0F, 0.5F, false);
//		Headsilver.setTextureOffset(0, 137).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.55F, false);
//
//		Headcrystal = new ModelRenderer(this);
//		Headcrystal.setRotationPoint(0.0F, 0.0F, 0.0F);
//		setRotationAngle(Headcrystal, -0.1047F, 0.0873F, 0.0F);
//		Headcrystal.setTextureOffset(17, 120).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.55F, false);
//		Headcrystal.setTextureOffset(59, 127).addBox(-1.0F, -8.5F, -5.0F, 2.0F, 2.0F, 1.0F, 0.1F, false);
//
//		HeadEyes = new ModelRenderer(this);
//		HeadEyes.setRotationPoint(0.0F, 0.0F, 0.0F);
//		setRotationAngle(HeadEyes, -0.1047F, 0.0873F, 0.0F);
//		HeadEyes.setTextureOffset(36, 137).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.55F, false);

		BodyGreen = new ModelRenderer(this);
		BodyGreen.setPos(0.0F, 0.0F, 0.0F);
		BodyGreen.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);

		Bodysilver = new ModelRenderer(this);
		Bodysilver.setPos(0.0F, 0.0F, 0.0F);
		Bodysilver.texOffs(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);
		Bodysilver.texOffs(16, 81).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);

		BodyWhite = new ModelRenderer(this);
		BodyWhite.setPos(0.0F, 0.0F, 0.0F);
		BodyWhite.texOffs(16, 64).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);

		Bodyglow = new ModelRenderer(this);
		Bodyglow.setPos(0.0F, 0.0F, 0.0F);
		Bodyglow.texOffs(16, 48).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);
		Bodyglow.texOffs(16, 81).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);

		BodyBlack = new ModelRenderer(this);
		BodyBlack.setPos(0.0F, 0.0F, 0.0F);
		BodyBlack.texOffs(16, 92).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);

		RightArmgreen = new ModelRenderer(this);
		RightArmgreen.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmgreen, -0.1745F, 0.0F, 0.0F);
		RightArmgreen.texOffs(58, 79).addBox(-4.0F, -2.2019F, -2.0F, 4.0F, 3.0F, 4.0F, 0.8F, false);
		RightArmgreen.texOffs(60, 86).addBox(-3.0F, -2.9867F, -2.1736F, 3.0F, 3.0F, 4.0F, 1.0F, false);

		RightArmblue = new ModelRenderer(this);
		RightArmblue.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmblue, -0.1745F, 0.0F, 0.0F);
		RightArmblue.texOffs(41, 93).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);

		RightArmgray = new ModelRenderer(this);
		RightArmgray.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmgray, -0.1745F, 0.0F, 0.0F);
		RightArmgray.texOffs(41, 106).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		RightArmgray.texOffs(42, 102).addBox(-3.0F, 7.3F, -1.8264F, 4.0F, 0.0F, 4.0F, 1.0F, false);

		RightArmblack = new ModelRenderer(this);
		RightArmblack.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmblack, -0.1745F, 0.0F, 0.0F);
		RightArmblack.texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		RightArmwhite = new ModelRenderer(this);
		RightArmwhite.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmwhite, -0.1745F, 0.0F, 0.0F);
		RightArmwhite.texOffs(40, 32).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		RightArmred = new ModelRenderer(this);
		RightArmred.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmred, -0.1745F, 0.0F, 0.0F);
		RightArmred.texOffs(40, 48).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		LeftArmgreen = new ModelRenderer(this);
		LeftArmgreen.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgreen, 0.2094F, 0.0F, 0.0F);
		LeftArmgreen.texOffs(41, 79).addBox(0.0F, -2.3756F, -1.7921F, 4.0F, 3.0F, 4.0F, 0.8F, false);
		LeftArmgreen.texOffs(43, 86).addBox(0.0F, -2.9616F, -1.9624F, 3.0F, 3.0F, 4.0F, 1.0F, false);

		LeftArmsilver = new ModelRenderer(this);
		LeftArmsilver.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmsilver, 0.2094F, 0.0F, 0.0F);
		LeftArmsilver.texOffs(58, 106).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		LeftArmsilver.texOffs(58, 101).addBox(-1.0F, 8.2391F, -2.0F, 4.0F, 0.0F, 4.0F, 1.0F, false);

		LeftArmblue = new ModelRenderer(this);
		LeftArmblue.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmblue, 0.2094F, 0.0F, 0.0F);
		LeftArmblue.texOffs(58, 93).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);

		LeftArmblack = new ModelRenderer(this);
		LeftArmblack.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmblack, 0.2094F, 0.0F, 0.0F);
		LeftArmblack.texOffs(57, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		LeftArmwhite = new ModelRenderer(this);
		LeftArmwhite.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmwhite, 0.2094F, 0.0F, 0.0F);
		LeftArmwhite.texOffs(57, 32).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		LeftArmred = new ModelRenderer(this);
		LeftArmred.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmred, 0.2094F, 0.0F, 0.0F);
		LeftArmred.texOffs(57, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

//		RightLeg = new ModelRenderer(this);
//		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
//		setRotationAngle(RightLeg, 0.192F, 0.0F, 0.0349F);
//		RightLeg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
//
//		RightLegSilverandGold = new ModelRenderer(this);
//		RightLegSilverandGold.setRotationPoint(-1.9F, 12.0F, 0.0F);
//		setRotationAngle(RightLegSilverandGold, 0.192F, 0.0F, 0.0349F);
//		RightLegSilverandGold.setTextureOffset(0, 58).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
//		RightLegSilverandGold.setTextureOffset(0, 32).addBox(-2.2094F, 6.0F, -1.8374F, 4.0F, 0.0F, 4.0F, 1.25F, false);
//
//		RightLegglow = new ModelRenderer(this);
//		RightLegglow.setRotationPoint(-1.9F, 12.0F, 0.0F);
//		setRotationAngle(RightLegglow, 0.192F, 0.0F, 0.0349F);
//		RightLegglow.setTextureOffset(0, 90).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
//
//		LeftLeg = new ModelRenderer(this);
//		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
//		setRotationAngle(LeftLeg, -0.1745F, 0.0F, -0.0349F);
//		LeftLeg.setTextureOffset(0, 37).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
//
//		LeftLegSilverandGold = new ModelRenderer(this);
//		LeftLegSilverandGold.setRotationPoint(1.9F, 12.0F, 0.0F);
//		setRotationAngle(LeftLegSilverandGold, -0.1745F, 0.0F, -0.0349F);
//		LeftLegSilverandGold.setTextureOffset(0, 74).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
//		LeftLegSilverandGold.setTextureOffset(0, 53).addBox(-1.7906F, 6.0F, -2.0562F, 4.0F, 0.0F, 4.0F, 1.25F, true);
//
//		LeftLegglow = new ModelRenderer(this);
//		LeftLegglow.setRotationPoint(1.9F, 12.0F, 0.0F);
//		setRotationAngle(LeftLegglow, -0.1745F, 0.0F, -0.0349F);
//		LeftLegglow.setTextureOffset(0, 106).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
	}

//	@Override
//	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
//		//previously the render function, render code was moved to a method below
//	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		
//		this.Head.copyModelAngles(this.bipedHead);
//		Head.render(matrixStack, buffer, packedLight, packedOverlay);
//		//Brown??
//		this.RightLeg.copyModelAngles(this.bipedRightLeg);
//		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
//		this.LeftLeg.copyModelAngles(this.bipedLeftLeg);
//		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		
		float fred = (float)( this.MainColor >> 16 & 255) / 255.0F;
        float fgreen = (float)(this.MainColor >> 8 & 255) / 255.0F;
        float fblue = (float)(this.MainColor & 255) / 255.0F;
		this.BodyGreen.copyFrom(this.body);
		BodyGreen.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmgreen.copyFrom(this.rightArm);
		RightArmgreen.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmgreen.copyFrom(this.leftArm);
		LeftArmgreen.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GrayColor >> 16 & 255) / 255.0F;
		fgreen = (float)(this.GrayColor >> 8 & 255) / 255.0F;
		fblue = (float)(this.GrayColor & 255) / 255.0F;
//		this.Headsilver.copyModelAngles(this.bipedHead);
//		Headsilver.render(matrixStack, buffer, packedLight, packedOverlay);
		this.Bodysilver.copyFrom(this.body);
		Bodysilver.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmgray.copyFrom(this.rightArm);
		RightArmgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmsilver.copyFrom(this.leftArm);
		LeftArmsilver.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.RightLegSilverandGold.copyModelAngles(this.bipedRightLeg);
//		RightLegSilverandGold.render(matrixStack, buffer, packedLight, packedOverlay);
//		this.LeftLegSilverandGold.copyModelAngles(this.bipedLeftLeg);
//		LeftLegSilverandGold.render(matrixStack, buffer, packedLight, packedOverlay);
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
//		this.HeadEyes.copyModelAngles(this.bipedHead);
//		HeadEyes.render(matrixStack, buffer, 15728640, packedOverlay);
		this.RightArmblue.copyFrom(this.rightArm);
		RightArmblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmblue.copyFrom(this.leftArm);
		LeftArmblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
		fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
		fblue = (float)(this.GlowyColor & 255) / 255.0F;
//		this.Headcrystal.copyModelAngles(this.bipedHead);
//		Headcrystal.render(matrixStack, buffer, 15728640, packedOverlay);
		this.Bodyglow.copyFrom(this.body);
		Bodyglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
//		this.RightLegglow.copyModelAngles(this.bipedRightLeg);
//		RightLegglow.render(matrixStack, buffer, 15728640, packedOverlay);
//		this.LeftLegglow.copyModelAngles(this.bipedLeftLeg);
//		LeftLegglow.render(matrixStack, buffer, 15728640, packedOverlay);
		
		this.RightArmred.copyFrom(this.rightArm);
		RightArmred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmred.copyFrom(this.leftArm);
		LeftArmred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
    	fred = (float)( this.WhiteColor >> 16 & 255) / 255.0F;
    	fgreen = (float)(this.WhiteColor >> 8 & 255) / 255.0F;
    	fblue = (float)(this.WhiteColor & 255) / 255.0F;
		this.BodyWhite.copyFrom(this.body);
		BodyWhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmwhite.copyFrom(this.rightArm);
		RightArmwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmwhite.copyFrom(this.leftArm);
		LeftArmwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		
		this.BodyBlack.copyFrom(this.body);
		BodyBlack.render(matrixStack, buffer, packedLight, packedOverlay);
		this.RightArmblack.copyFrom(this.rightArm);
		RightArmblack.render(matrixStack, buffer, packedLight, packedOverlay);
		this.LeftArmblack.copyFrom(this.leftArm);
		LeftArmblack.render(matrixStack, buffer, packedLight, packedOverlay);
		

	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
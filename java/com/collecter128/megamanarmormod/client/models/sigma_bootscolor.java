package com.collecter128.megamanarmormod.client.models;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class sigma_bootscolor extends BipedModel  {
//	private final ModelRenderer Head;
//	private final ModelRenderer Headsilver;
//	private final ModelRenderer Headcrystal;
//	private final ModelRenderer HeadEyes;
//	private final ModelRenderer BodyGreen;
//	private final ModelRenderer Bodysilver;
//	private final ModelRenderer BodyWhite;
//	private final ModelRenderer Bodyglow;
//	private final ModelRenderer BodyBlack;
//	private final ModelRenderer RightArmgreen;
//	private final ModelRenderer RightArmblue;
//	private final ModelRenderer RightArmgray;
//	private final ModelRenderer RightArmblack;
//	private final ModelRenderer RightArmwhite;
//	private final ModelRenderer RightArmred;
//	private final ModelRenderer LeftArmgreen;
//	private final ModelRenderer LeftArmsilver;
//	private final ModelRenderer LeftArmblue;
//	private final ModelRenderer LeftArmblack;
//	private final ModelRenderer LeftArmwhite;
//	private final ModelRenderer LeftArmred;
	private final ModelRenderer RightLeg;
	private final ModelRenderer RightLegSilverandGold;
	private final ModelRenderer RightLegglow;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer LeftLegSilverandGold;
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

	public sigma_bootscolor(float modelSize) {
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
//
//		BodyGreen = new ModelRenderer(this);
//		BodyGreen.setRotationPoint(0.0F, 0.0F, 0.0F);
//		BodyGreen.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);
//
//		Bodysilver = new ModelRenderer(this);
//		Bodysilver.setRotationPoint(0.0F, 0.0F, 0.0F);
//		Bodysilver.setTextureOffset(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);
//		Bodysilver.setTextureOffset(16, 81).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
//
//		BodyWhite = new ModelRenderer(this);
//		BodyWhite.setRotationPoint(0.0F, 0.0F, 0.0F);
//		BodyWhite.setTextureOffset(16, 64).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
//
//		Bodyglow = new ModelRenderer(this);
//		Bodyglow.setRotationPoint(0.0F, 0.0F, 0.0F);
//		Bodyglow.setTextureOffset(16, 48).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);
//		Bodyglow.setTextureOffset(16, 81).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
//
//		BodyBlack = new ModelRenderer(this);
//		BodyBlack.setRotationPoint(0.0F, 0.0F, 0.0F);
//		BodyBlack.setTextureOffset(16, 92).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
//
//		RightArmgreen = new ModelRenderer(this);
//		RightArmgreen.setRotationPoint(-5.0F, 2.0F, 0.0F);
//		setRotationAngle(RightArmgreen, -0.1745F, 0.0F, 0.0F);
//		RightArmgreen.setTextureOffset(58, 79).addBox(-4.0F, -2.2019F, -2.0F, 4.0F, 3.0F, 4.0F, 0.8F, false);
//		RightArmgreen.setTextureOffset(60, 86).addBox(-3.0F, -2.9867F, -2.1736F, 3.0F, 3.0F, 4.0F, 1.0F, false);
//
//		RightArmblue = new ModelRenderer(this);
//		RightArmblue.setRotationPoint(-5.0F, 2.0F, 0.0F);
//		setRotationAngle(RightArmblue, -0.1745F, 0.0F, 0.0F);
//		RightArmblue.setTextureOffset(41, 93).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
//
//		RightArmgray = new ModelRenderer(this);
//		RightArmgray.setRotationPoint(-5.0F, 2.0F, 0.0F);
//		setRotationAngle(RightArmgray, -0.1745F, 0.0F, 0.0F);
//		RightArmgray.setTextureOffset(41, 106).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
//		RightArmgray.setTextureOffset(42, 102).addBox(-3.0F, 7.3F, -1.8264F, 4.0F, 0.0F, 4.0F, 1.0F, false);
//
//		RightArmblack = new ModelRenderer(this);
//		RightArmblack.setRotationPoint(-5.0F, 2.0F, 0.0F);
//		setRotationAngle(RightArmblack, -0.1745F, 0.0F, 0.0F);
//		RightArmblack.setTextureOffset(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
//
//		RightArmwhite = new ModelRenderer(this);
//		RightArmwhite.setRotationPoint(-5.0F, 2.0F, 0.0F);
//		setRotationAngle(RightArmwhite, -0.1745F, 0.0F, 0.0F);
//		RightArmwhite.setTextureOffset(40, 32).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
//
//		RightArmred = new ModelRenderer(this);
//		RightArmred.setRotationPoint(-5.0F, 2.0F, 0.0F);
//		setRotationAngle(RightArmred, -0.1745F, 0.0F, 0.0F);
//		RightArmred.setTextureOffset(40, 48).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
//
//		LeftArmgreen = new ModelRenderer(this);
//		LeftArmgreen.setRotationPoint(5.0F, 2.0F, 0.0F);
//		setRotationAngle(LeftArmgreen, 0.2094F, 0.0F, 0.0F);
//		LeftArmgreen.setTextureOffset(41, 79).addBox(0.0F, -2.3756F, -1.7921F, 4.0F, 3.0F, 4.0F, 0.8F, false);
//		LeftArmgreen.setTextureOffset(43, 86).addBox(0.0F, -2.9616F, -1.9624F, 3.0F, 3.0F, 4.0F, 1.0F, false);
//
//		LeftArmsilver = new ModelRenderer(this);
//		LeftArmsilver.setRotationPoint(5.0F, 2.0F, 0.0F);
//		setRotationAngle(LeftArmsilver, 0.2094F, 0.0F, 0.0F);
//		LeftArmsilver.setTextureOffset(58, 106).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
//		LeftArmsilver.setTextureOffset(58, 101).addBox(-1.0F, 8.2391F, -2.0F, 4.0F, 0.0F, 4.0F, 1.0F, false);
//
//		LeftArmblue = new ModelRenderer(this);
//		LeftArmblue.setRotationPoint(5.0F, 2.0F, 0.0F);
//		setRotationAngle(LeftArmblue, 0.2094F, 0.0F, 0.0F);
//		LeftArmblue.setTextureOffset(58, 93).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
//
//		LeftArmblack = new ModelRenderer(this);
//		LeftArmblack.setRotationPoint(5.0F, 2.0F, 0.0F);
//		setRotationAngle(LeftArmblack, 0.2094F, 0.0F, 0.0F);
//		LeftArmblack.setTextureOffset(57, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
//
//		LeftArmwhite = new ModelRenderer(this);
//		LeftArmwhite.setRotationPoint(5.0F, 2.0F, 0.0F);
//		setRotationAngle(LeftArmwhite, 0.2094F, 0.0F, 0.0F);
//		LeftArmwhite.setTextureOffset(57, 32).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
//
//		LeftArmred = new ModelRenderer(this);
//		LeftArmred.setRotationPoint(5.0F, 2.0F, 0.0F);
//		setRotationAngle(LeftArmred, 0.2094F, 0.0F, 0.0F);
//		LeftArmred.setTextureOffset(57, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		RightLeg = new ModelRenderer(this);
		RightLeg.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeg, 0.192F, 0.0F, 0.0349F);
		RightLeg.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);

		RightLegSilverandGold = new ModelRenderer(this);
		RightLegSilverandGold.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegSilverandGold, 0.192F, 0.0F, 0.0349F);
		RightLegSilverandGold.texOffs(0, 58).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		RightLegSilverandGold.texOffs(0, 32).addBox(-2.2094F, 6.0F, -1.8374F, 4.0F, 0.0F, 4.0F, 1.25F, false);

		RightLegglow = new ModelRenderer(this);
		RightLegglow.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegglow, 0.192F, 0.0F, 0.0349F);
		RightLegglow.texOffs(0, 90).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeg, -0.1745F, 0.0F, -0.0349F);
		LeftLeg.texOffs(0, 37).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);

		LeftLegSilverandGold = new ModelRenderer(this);
		LeftLegSilverandGold.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegSilverandGold, -0.1745F, 0.0F, -0.0349F);
		LeftLegSilverandGold.texOffs(0, 74).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		LeftLegSilverandGold.texOffs(0, 53).addBox(-1.7906F, 6.0F, -2.0562F, 4.0F, 0.0F, 4.0F, 1.25F, true);

		LeftLegglow = new ModelRenderer(this);
		LeftLegglow.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegglow, -0.1745F, 0.0F, -0.0349F);
		LeftLegglow.texOffs(0, 106).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
	}

//	@Override
//	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
//		//previously the render function, render code was moved to a method below
//	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		
		float fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
		float fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
		float fblue = (float)(this.ThirdColor & 255) / 255.0F;
//		this.Head.copyModelAngles(this.bipedHead);
//		Head.render(matrixStack, buffer, packedLight, packedOverlay);
		//Brown??
		this.RightLeg.copyFrom(this.rightLeg);
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeg.copyFrom(this.leftLeg);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		
//		this.BodyGreen.copyModelAngles(this.bipedBody);
//		BodyGreen.render(matrixStack, buffer, packedLight, packedOverlay);
//		this.RightArmgreen.copyModelAngles(this.bipedRightArm);
//		RightArmgreen.render(matrixStack, buffer, packedLight, packedOverlay);
//		this.LeftArmgreen.copyModelAngles(this.bipedLeftArm);
//		LeftArmgreen.render(matrixStack, buffer, packedLight, packedOverlay);
		
		fred = (float)( this.GrayColor >> 16 & 255) / 255.0F;
		fgreen = (float)(this.GrayColor >> 8 & 255) / 255.0F;
		fblue = (float)(this.GrayColor & 255) / 255.0F;
//		this.Headsilver.copyModelAngles(this.bipedHead);
//		Headsilver.render(matrixStack, buffer, packedLight, packedOverlay);
//		this.Bodysilver.copyModelAngles(this.bipedBody);
//		Bodysilver.render(matrixStack, buffer, packedLight, packedOverlay);
//		this.RightArmgray.copyModelAngles(this.bipedRightArm);
//		RightArmgray.render(matrixStack, buffer, packedLight, packedOverlay);
//		this.LeftArmsilver.copyModelAngles(this.bipedLeftArm);
//		LeftArmsilver.render(matrixStack, buffer, packedLight, packedOverlay);
		this.RightLegSilverandGold.copyFrom(this.rightLeg);
		RightLegSilverandGold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegSilverandGold.copyFrom(this.leftLeg);
		LeftLegSilverandGold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
//		this.HeadEyes.copyModelAngles(this.bipedHead);
//		HeadEyes.render(matrixStack, buffer, 15728640, packedOverlay);
//		this.RightArmblue.copyModelAngles(this.bipedRightArm);
//		RightArmblue.render(matrixStack, buffer, packedLight, packedOverlay);
//		
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
		fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
		fblue = (float)(this.GlowyColor & 255) / 255.0F;
//		this.Headcrystal.copyModelAngles(this.bipedHead);
//		Headcrystal.render(matrixStack, buffer, 15728640, packedOverlay);
//		this.Bodyglow.copyModelAngles(this.bipedBody);
//		Bodyglow.render(matrixStack, buffer, 15728640, packedOverlay);
		this.RightLegglow.copyFrom(this.rightLeg);
		RightLegglow.render(matrixStack, buffer, 15728640, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegglow.copyFrom(this.leftLeg);
		LeftLegglow.render(matrixStack, buffer, 15728640, packedOverlay, fred, fgreen, fblue, alpha);
		
//		this.RightArmred.copyModelAngles(this.bipedRightArm);
//		RightArmred.render(matrixStack, buffer, packedLight, packedOverlay);
//		this.LeftArmred.copyModelAngles(this.bipedLeftArm);
//		LeftArmred.render(matrixStack, buffer, packedLight, packedOverlay);
//		
//		this.BodyWhite.copyModelAngles(this.bipedBody);
//		BodyWhite.render(matrixStack, buffer, packedLight, packedOverlay);
//		this.RightArmwhite.copyModelAngles(this.bipedRightArm);
//		RightArmwhite.render(matrixStack, buffer, packedLight, packedOverlay);
//		this.LeftArmwhite.copyModelAngles(this.bipedLeftArm);
//		LeftArmwhite.render(matrixStack, buffer, packedLight, packedOverlay);
		
		
//		this.BodyBlack.copyModelAngles(this.bipedBody);
//		BodyBlack.render(matrixStack, buffer, packedLight, packedOverlay);
//		this.RightArmblack.copyModelAngles(this.bipedRightArm);
//		RightArmblack.render(matrixStack, buffer, packedLight, packedOverlay);
//		this.LeftArmblack.copyModelAngles(this.bipedLeftArm);
//		LeftArmblack.render(matrixStack, buffer, packedLight, packedOverlay);
		

	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
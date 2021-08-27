package com.collecter128.megamanarmormod.client.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class megamanarmor_maincolor extends BipedModel {
	private final ModelRenderer Head1;//Main color Dark Blue
	private final ModelRenderer Head2;//Secondary Color Cyan
	private final ModelRenderer Head3;//Gray Parts
	private final ModelRenderer Headglow;//Glowy Red Bits
//	private final ModelRenderer Body;//Main color Dark Blue
//	private final ModelRenderer Body2;//Secondary Color Cyan
//	private final ModelRenderer Body3;//Gray Parts
//	private final ModelRenderer RightArm;//Main color Dark Blue
//	private final ModelRenderer RightArm2;//Secondary Color Cyan
//	private final ModelRenderer LeftArm;//Main color Dark Blue
//	private final ModelRenderer LeftArm2;//Secondary Color Cyan
//	private final ModelRenderer RightLeg1;//Main color Dark Blue
//	private final ModelRenderer RightLegglow;//Glowy Red Bits
//	private final ModelRenderer LeftLeg1;//Main color Dark Blue
//	private final ModelRenderer LeftLegglow;//Glowy Red Bits
	
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

	public megamanarmor_maincolor(float modelSize) {
		super(modelSize);
		textureWidth = 75;
		textureHeight = 97;
		
		MainColorDefault = 342773;//Main Body Color Megaman Dark Blue
		//MainColorDefault = 15404288;//Main Body Color Megaman Dark Blue
		SecondaryColorDefault = 379125;//Secondary Color Megaman Light Blueish
		WhiteColorDefault = 16777215;
		ThirdColorDefault = 14105660;
		GlowyColorDefault = 16728361;//Glow Red Bits
		GrayColorDefault = 12105912;
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;

		Head1 = new ModelRenderer(this);
		Head1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head1.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);

		Head2 = new ModelRenderer(this);
		Head2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head2.setTextureOffset(0, 64).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Head2.setTextureOffset(61, 58).addBox(-1.0F, -7.4829F, -5.54F, 2.0F, 2.0F, 1.0F, 0.25F, false);
		Head2.setTextureOffset(48, 65).addBox(-0.6552F, -9.5707F, -4.5F, 2.0F, 6.0F, 10.0F, 0.25F, false);
		Head2.setTextureOffset(37, 66).addBox(5.0643F, -3.9451F, -0.5752F, 1.0F, 3.0F, 3.0F, 0.5F, false);
		Head2.setTextureOffset(37, 74).addBox(-5.8938F, -3.8448F, -1.5287F, 1.0F, 3.0F, 3.0F, 0.5F, false);

		Head3 = new ModelRenderer(this);
		Head3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head3.setTextureOffset(32, 1).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 7.0F, 8.0F, 0.75F, false);

		Headglow = new ModelRenderer(this);
		Headglow.setRotationPoint(0.0F, 0.0F, 0.0F);
		Headglow.setTextureOffset(0, 80).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);

//		Body = new ModelRenderer(this);
//		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
//		Body.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
//
//		Body2 = new ModelRenderer(this);
//		Body2.setRotationPoint(0.0F, 0.0F, 0.0F);
//		Body2.setTextureOffset(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
//
//		Body3 = new ModelRenderer(this);
//		Body3.setRotationPoint(0.0F, 0.0F, 0.0F);
//		Body3.setTextureOffset(16, 48).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.31F, false);
//
//		RightArm = new ModelRenderer(this);
//		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
//		setRotationAngle(RightArm, 0.1309F, 0.0F, 0.0F);
//		RightArm.setTextureOffset(40, 40).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
//		RightArm.setTextureOffset(40, 56).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
//
//		RightArm2 = new ModelRenderer(this);
//		RightArm2.setRotationPoint(-5.0F, 2.0F, 0.0F);
//		setRotationAngle(RightArm2, 0.1309F, 0.0F, 0.0F);
//		RightArm2.setTextureOffset(56, 40).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
//
//		LeftArm = new ModelRenderer(this);
//		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
//		setRotationAngle(LeftArm, -0.1309F, 0.0F, 0.0F);
//		LeftArm.setTextureOffset(40, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
//		LeftArm.setTextureOffset(40, 32).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
//
//		LeftArm2 = new ModelRenderer(this);
//		LeftArm2.setRotationPoint(5.0F, 2.0F, 0.0F);
//		setRotationAngle(LeftArm2, -0.1309F, 0.0F, 0.0F);
//		LeftArm2.setTextureOffset(56, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
//
//		RightLeg1 = new ModelRenderer(this);
//		RightLeg1.setRotationPoint(-1.9F, 12.0F, 0.0F);
//		setRotationAngle(RightLeg1, 0.192F, 0.0F, 0.0349F);
//		RightLeg1.setTextureOffset(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
//
//		RightLegglow = new ModelRenderer(this);
//		RightLegglow.setRotationPoint(-1.9F, 12.0F, -1.9632F);
//		setRotationAngle(RightLegglow, 0.192F, 0.0F, 0.0349F);
//		RightLegglow.setTextureOffset(31, 88).addBox(-2.0F, 8.5F, -0.0368F, 4.0F, 4.0F, 4.0F, 1.0F, false);
//
//		LeftLeg1 = new ModelRenderer(this);
//		LeftLeg1.setRotationPoint(1.9F, 12.0F, 0.0F);
//		setRotationAngle(LeftLeg1, -0.1745F, 0.0F, -0.0349F);
//		LeftLeg1.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
//
//		LeftLegglow = new ModelRenderer(this);
//		LeftLegglow.setRotationPoint(1.9F, 12.0F, 0.0F);
//		setRotationAngle(LeftLegglow, -0.1745F, 0.0F, -0.0349F);
//		LeftLegglow.setTextureOffset(50, 88).addBox(-2.0F, 8.2F, -2.0F, 4.0F, 4.0F, 4.0F, 1.0F, true);
	}

//	@Override
//	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
//		//previously the render function, render code was moved to a method below
//	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
//        float f = (float)(i >> 16 & 255) / 255.0F;
//        float f1 = (float)(i >> 8 & 255) / 255.0F;
//        float f2 = (float)(i & 255) / 255.0F;
		
		float fred = (float)( this.MainColor >> 16 & 255) / 255.0F;
        float fgreen = (float)(this.MainColor >> 8 & 255) / 255.0F;
        float fblue = (float)(this.MainColor & 255) / 255.0F;
		this.Head1.copyModelAngles(this.bipedHead);
		Head1.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.Body.copyModelAngles(this.bipedBody);
//		Body.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.RightArm.copyModelAngles(this.bipedRightArm);
//		RightArm.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.LeftArm.copyModelAngles(this.bipedLeftArm);
//		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.RightLeg1.copyModelAngles(this.bipedRightLeg);
//		RightLeg1.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.LeftLeg1.copyModelAngles(this.bipedLeftLeg);
//		LeftLeg1.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
		this.Head2.copyModelAngles(this.bipedHead);
		Head2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.Body2.copyModelAngles(this.bipedBody);
//		Body2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.LeftArm2.copyModelAngles(this.bipedLeftArm);
//		LeftArm2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.RightArm2.copyModelAngles(this.bipedRightArm);
//		RightArm2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GrayColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GrayColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GrayColor & 255) / 255.0F;
		this.Head3.copyModelAngles(this.bipedHead);
		Head3.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.Body3.copyModelAngles(this.bipedBody);
//		Body3.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
		this.Headglow.copyModelAngles(this.bipedHead);
		Headglow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.RightLegglow.copyModelAngles(this.bipedRightLeg);
//		RightLegglow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.LeftLegglow.copyModelAngles(this.bipedLeftLeg);
//		LeftLegglow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
package com.collecter128.megamanarmormod.client.models;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class bass_leggings extends BipedModel {
	private final ModelRenderer Bodydark;
	private final ModelRenderer Bodygray;
	private final ModelRenderer Bodywhite;
	private final ModelRenderer Bodyyellow;
	private final ModelRenderer RightLeg;
	private final ModelRenderer RightLegglow;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer LeftLeg2;
	
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

	public bass_leggings(float modelSize) {
		super(modelSize);
		textureWidth = 82;
		textureHeight = 176;
		
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

		Bodydark = new ModelRenderer(this);
		Bodydark.setRotationPoint(0.0F, 0.0F, 0.0F);
		Bodydark.setTextureOffset(17, 157).addBox(-4.5F, 9.0F, -2.5F, 9.0F, 4.0F, 5.0F, 0.51F, false);

		Bodygray = new ModelRenderer(this);
		Bodygray.setRotationPoint(0.0F, 0.0F, 0.0F);
		Bodygray.setTextureOffset(50, 140).addBox(-4.0F, 9.0F, -2.0F, 8.0F, 3.0F, 4.0F, 0.51F, false);

		Bodywhite = new ModelRenderer(this);
		Bodywhite.setRotationPoint(0.0F, 0.0F, 0.0F);
		Bodywhite.setTextureOffset(50, 132).addBox(-4.0F, 9.0F, -2.0F, 8.0F, 3.0F, 4.0F, 0.51F, false);

		Bodyyellow = new ModelRenderer(this);
		Bodyyellow.setRotationPoint(0.0F, 0.0F, 0.0F);
		Bodyyellow.setTextureOffset(17, 167).addBox(-4.5F, 9.0F, -2.5F, 9.0F, 4.0F, 5.0F, 0.51F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeg, 0.192F, 0.0F, 0.0349F);
		RightLeg.setTextureOffset(1, 157).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		RightLegglow = new ModelRenderer(this);
		RightLegglow.setRotationPoint(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegglow, 0.192F, 0.0F, 0.0349F);
		RightLegglow.setTextureOffset(63, 158).addBox(-0.9994F, 0.1251F, -1.025F, 2.0F, 12.0F, 2.0F, 0.5F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeg, -0.1745F, 0.0F, -0.0349F);
		LeftLeg.setTextureOffset(45, 157).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		LeftLeg2 = new ModelRenderer(this);
		LeftLeg2.setRotationPoint(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeg2, -0.1745F, 0.0F, -0.0349F);
		LeftLeg2.setTextureOffset(72, 158).addBox(-0.9994F, 0.1F, -1.0212F, 2.0F, 12.0F, 2.0F, 0.5F, true);
	}

//	@Override
//	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
//		//previously the render function, render code was moved to a method below
//	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		
		float fred = (float)( this.MainColor >> 16 & 255) / 255.0F;
		float fgreen = (float)(this.MainColor >> 8 & 255) / 255.0F;
		float fblue = (float)(this.MainColor & 255) / 255.0F;
		this.Bodydark.copyModelAngles(this.bipedBody);
		Bodydark.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GrayColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GrayColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GrayColor & 255) / 255.0F;
		this.Bodygray.copyModelAngles(this.bipedBody);
		Bodygray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLeg.copyModelAngles(this.bipedRightLeg);
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeg.copyModelAngles(this.bipedLeftLeg);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.WhiteColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.WhiteColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.WhiteColor & 255) / 255.0F;
		this.Bodywhite.copyModelAngles(this.bipedBody);
		Bodywhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
		this.Bodyyellow.copyModelAngles(this.bipedBody);
		Bodyyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
		this.RightLegglow.copyModelAngles(this.bipedRightLeg);
		RightLegglow.render(matrixStack, buffer, 15728640, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeg2.copyModelAngles(this.bipedLeftLeg);
		LeftLeg2.render(matrixStack, buffer, 15728640, packedOverlay, fred, fgreen, fblue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
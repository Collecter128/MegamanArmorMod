package com.collecter128.megamanarmormod.client.models;

import javax.annotation.Nullable;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class zero_legs extends BipedModel {
	private final ModelRenderer Body;
	private final ModelRenderer Bodygray;
	private final ModelRenderer Bodygold;
	private final ModelRenderer RightLeg;
	private final ModelRenderer RightLeggray;
	private final ModelRenderer RightLegglow;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer LeftLeggray;
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

	public zero_legs(float modelSize) {
		super(modelSize);
		textureWidth = 93;
		textureHeight = 164;
		
		MainColorDefault = 16711680;//Main Body Color Zero Red
		SecondaryColorDefault = 5752303;//
		ThirdColorDefault = 16763151; // Hair
		WhiteColorDefault = 16777215;//Basic White
		GlowyColorDefault = 2448340;//Glow? 
		GrayColorDefault = 16777215;//Basic White
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 1.0F, 0.0F);
		Body.setTextureOffset(16, 148).addBox(-4.0F, 9.0F, -2.0F, 8.0F, 3.0F, 4.0F, 0.51F, false);
		Body.setTextureOffset(16, 140).addBox(-4.0F, 8.0F, -2.0F, 8.0F, 4.0F, 4.0F, 1.01F, false);

		Bodygray = new ModelRenderer(this);
		Bodygray.setRotationPoint(0.0F, 0.0F, 0.0F);
		Bodygray.setTextureOffset(16, 155).addBox(-4.0F, 10.0F, -2.0F, 8.0F, 3.0F, 4.0F, 0.51F, false);

		Bodygold = new ModelRenderer(this);
		Bodygold.setRotationPoint(0.0F, 1.0F, 0.0F);
		Bodygold.setTextureOffset(16, 132).addBox(-4.0F, 8.0F, -2.0F, 8.0F, 4.0F, 4.0F, 1.01F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeg, 0.192F, 0.0F, 0.0349F);
		RightLeg.setTextureOffset(0, 132).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		RightLeggray = new ModelRenderer(this);
		RightLeggray.setRotationPoint(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeggray, 0.192F, 0.0F, 0.0349F);
		RightLeggray.setTextureOffset(17, 100).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		RightLegglow = new ModelRenderer(this);
		RightLegglow.setRotationPoint(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegglow, 0.192F, 0.0F, 0.0349F);
		RightLegglow.setTextureOffset(43, 136).addBox(-0.9994F, 0.2251F, -1.025F, 2.0F, 12.0F, 2.0F, 0.5F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeg, -0.1745F, 0.0F, -0.0349F);
		LeftLeg.setTextureOffset(0, 148).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		LeftLeggray = new ModelRenderer(this);
		LeftLeggray.setRotationPoint(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeggray, -0.1745F, 0.0F, -0.0349F);
		LeftLeggray.setTextureOffset(34, 100).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		LeftLegglow = new ModelRenderer(this);
		LeftLegglow.setRotationPoint(0.9F, 12.0F, 1.0F);
		setRotationAngle(LeftLegglow, -0.1745F, 0.0F, -0.0349F);
		LeftLegglow.setTextureOffset(43, 149).addBox(0.0F, 0.0F, -2.0F, 2.0F, 12.0F, 2.0F, 0.5F, true);
	}

//	@Override
//	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
//		//previously the render function, render code was moved to a method below
//	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		
		float fred = (float)( this.WhiteColor >> 16 & 255) / 255.0F;
        float fgreen = (float)(this.WhiteColor >> 8 & 255) / 255.0F;
        float fblue = (float)(this.WhiteColor & 255) / 255.0F;
		this.Body.copyModelAngles(this.bipedBody);
		Body.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLeg.copyModelAngles(this.bipedRightLeg);
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeg.copyModelAngles(this.bipedLeftLeg);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.ThirdColor & 255) / 255.0F;
		this.Bodygold.copyModelAngles(this.bipedBody);
		Bodygold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		
		fred = (float)( this.GrayColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GrayColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GrayColor & 255) / 255.0F;
		this.Bodygray.copyModelAngles(this.bipedBody);
		Bodygray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLeggray.copyModelAngles(this.bipedRightLeg);
		RightLeggray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeggray.copyModelAngles(this.bipedLeftLeg);
		LeftLeggray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
		this.RightLegglow.copyModelAngles(this.bipedRightLeg);
		RightLegglow.render(matrixStack, buffer, 15728640, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegglow.copyModelAngles(this.bipedLeftLeg);
		LeftLegglow.render(matrixStack, buffer, 15728640, packedOverlay, fred, fgreen, fblue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
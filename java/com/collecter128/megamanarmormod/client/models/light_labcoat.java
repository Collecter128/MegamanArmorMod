package com.collecter128.megamanarmormod.client.models;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class light_labcoat extends BipedModel {
	private final ModelRenderer Body;
	private final ModelRenderer Body2;
	private final ModelRenderer Body3;
	private final ModelRenderer RightArm;
	private final ModelRenderer RightArm2;
	private final ModelRenderer LeftArm;
	private final ModelRenderer LeftArm2;
	
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

	public light_labcoat(float modelSize) {
		super(modelSize);
		textureWidth = 57;
		textureHeight = 46;
		
		MainColorDefault = 1716991;//Main Body Color Blue Tie
		SecondaryColorDefault = 8505085;//Secondary Light Blue hahaha...
		WhiteColorDefault = 16777215;
		ThirdColorDefault = 16777215;
		GlowyColorDefault = 16777215;//Glow? It's white
		GrayColorDefault = 16777215;//Labcoat color
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		WhiteColor = WhiteColorDefault;
		ThirdColor = ThirdColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.setTextureOffset(16, 1).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.76F, false);
		Body.setTextureOffset(2, 30).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 1.01F, false);
		Body.setTextureOffset(29, 23).addBox(-1.0F, 1.0F, -2.0F, 2.0F, 6.0F, 1.0F, 0.7F, false);

		Body2 = new ModelRenderer(this);
		Body2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body2.setTextureOffset(33, 30).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);

		Body3 = new ModelRenderer(this);
		Body3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body3.setTextureOffset(22, 23).addBox(-1.0F, 1.0F, -2.0F, 2.0F, 6.0F, 1.0F, 0.7F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArm, 0.1309F, 0.0F, 0.0F);
		RightArm.setTextureOffset(0, 1).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.75F, false);

		RightArm2 = new ModelRenderer(this);
		RightArm2.setRotationPoint(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArm2, 0.1309F, 0.0F, 0.0F);
		RightArm2.setTextureOffset(0, 18).addBox(-3.0F, -0.9743F, -2.0F, 4.0F, 8.0F, 4.0F, 0.5F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArm, -0.1309F, 0.0F, 0.0F);
		LeftArm.setTextureOffset(40, 1).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.75F, true);

		LeftArm2 = new ModelRenderer(this);
		LeftArm2.setRotationPoint(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArm2, -0.1309F, 0.0F, 0.0F);
		LeftArm2.setTextureOffset(40, 18).addBox(-1.0F, -1.1049F, -2.0F, 4.0F, 8.0F, 4.0F, 0.5F, true);
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
		this.RightArm.copyModelAngles(this.bipedRightArm);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArm.copyModelAngles(this.bipedLeftArm);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
        this.Body2.copyModelAngles(this.bipedBody);
		Body2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArm2.copyModelAngles(this.bipedRightArm);
		RightArm2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArm2.copyModelAngles(this.bipedLeftArm);
		LeftArm2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.MainColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.MainColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.MainColor & 255) / 255.0F;
        this.Body3.copyModelAngles(this.bipedBody);
		Body3.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
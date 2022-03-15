package com.collecter128.megamanarmormod.client.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class quint_legs extends BipedModel {
	private final ModelRenderer Body1;
	private final ModelRenderer Bodygraycolor;
	private final ModelRenderer BodyOrange;
	private final ModelRenderer RightLeggray;
	private final ModelRenderer RightLeg2;
	private final ModelRenderer RightLegorange;
	private final ModelRenderer RightLegglow;
	private final ModelRenderer LeftLeggray;
	private final ModelRenderer LeftLeg2;
	private final ModelRenderer LeftLegorange;
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

	public quint_legs(float modelSize) {
		super(modelSize);
		textureWidth = 76;
		textureHeight = 148;
		
		MainColorDefault = 3709250;//Main Body Color quint green
		SecondaryColorDefault = 10413478;//Secondary quintlight green
		ThirdColorDefault = 16755768; //Orange parts
		WhiteColorDefault = 16777215;//Basic White
		GlowyColorDefault = 16764984;//Glow? yellow color
		GrayColorDefault = 12105912;//Kinda Blue
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;

		Body1 = new ModelRenderer(this);
		Body1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body1.setTextureOffset(16, 107).addBox(-4.0F, 8.0F, -2.0F, 8.0F, 4.0F, 4.0F, 1.01F, false);

		Bodygraycolor = new ModelRenderer(this);
		Bodygraycolor.setRotationPoint(0.0F, 0.0F, 0.0F);
		Bodygraycolor.setTextureOffset(16, 122).addBox(-4.0F, 9.0F, -2.0F, 8.0F, 3.0F, 4.0F, 0.51F, false);

		BodyOrange = new ModelRenderer(this);
		BodyOrange.setRotationPoint(0.0F, 0.0F, 0.0F);
		BodyOrange.setTextureOffset(16, 115).addBox(-4.0F, 9.0F, -2.0F, 8.0F, 3.0F, 4.0F, 0.51F, false);

		RightLeggray = new ModelRenderer(this);
		RightLeggray.setRotationPoint(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeggray, 0.192F, 0.0F, 0.0349F);
		RightLeggray.setTextureOffset(40, 113).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		RightLeg2 = new ModelRenderer(this);
		RightLeg2.setRotationPoint(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeg2, 0.192F, 0.0F, 0.0349F);
		RightLeg2.setTextureOffset(39, 97).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		RightLegorange = new ModelRenderer(this);
		RightLegorange.setRotationPoint(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegorange, 0.192F, 0.0F, 0.0349F);
		RightLegorange.setTextureOffset(40, 129).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		RightLegglow = new ModelRenderer(this);
		RightLegglow.setRotationPoint(-2.9F, 12.0F, 1.0F);
		setRotationAngle(RightLegglow, 0.192F, 0.0F, 0.0349F);
		RightLegglow.setTextureOffset(16, 136).addBox(0.0F, 9.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.5F, false);

		LeftLeggray = new ModelRenderer(this);
		LeftLeggray.setRotationPoint(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeggray, -0.1745F, 0.0F, -0.0349F);
		LeftLeggray.setTextureOffset(0, 113).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		LeftLeg2 = new ModelRenderer(this);
		LeftLeg2.setRotationPoint(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeg2, -0.1745F, 0.0F, -0.0349F);
		LeftLeg2.setTextureOffset(0, 97).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		LeftLegorange = new ModelRenderer(this);
		LeftLegorange.setRotationPoint(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegorange, -0.1745F, 0.0F, -0.0349F);
		LeftLegorange.setTextureOffset(0, 129).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		LeftLegglow = new ModelRenderer(this);
		LeftLegglow.setRotationPoint(0.9F, 12.0F, 1.0F);
		setRotationAngle(LeftLegglow, -0.1745F, 0.0F, -0.0349F);
		LeftLegglow.setTextureOffset(27, 136).addBox(0.0F, 8.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.5F, true);
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
		this.Body1.copyModelAngles(this.bipedBody);
		Body1.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
		this.RightLeg2.copyModelAngles(this.bipedRightLeg);
		RightLeg2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeg2.copyModelAngles(this.bipedLeftLeg);
		LeftLeg2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GrayColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GrayColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GrayColor & 255) / 255.0F;
		this.Bodygraycolor.copyModelAngles(this.bipedBody);
		Bodygraycolor.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLeggray.copyModelAngles(this.bipedRightLeg);
		RightLeggray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeggray.copyModelAngles(this.bipedLeftLeg);
		LeftLeggray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.ThirdColor & 255) / 255.0F;
		this.BodyOrange.copyModelAngles(this.bipedBody);
		BodyOrange.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegorange.copyModelAngles(this.bipedRightLeg);
		RightLegorange.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegorange.copyModelAngles(this.bipedLeftLeg);
		LeftLegorange.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
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
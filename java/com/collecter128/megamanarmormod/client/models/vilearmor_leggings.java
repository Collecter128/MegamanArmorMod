package com.collecter128.megamanarmormod.client.models;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class vilearmor_leggings extends BipedModel {
	private final ModelRenderer Bodybelt;
	private final ModelRenderer Bodyblack;
	private final ModelRenderer Bodyinnerblack;
	private final ModelRenderer Bodyinnersilver;
	private final ModelRenderer RightLegblack;
	private final ModelRenderer RightLegsilver;
	private final ModelRenderer RightLegglow;
	private final ModelRenderer LeftLegblack;
	private final ModelRenderer LeftLegsilver;
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

	public vilearmor_leggings(float modelSize) {
		super(modelSize);
		textureWidth = 64;
		textureHeight = 32;
		
		MainColorDefault = 8728033;//Main Body Color Purple vile
		SecondaryColorDefault = 5066061;//Secondary Color Vile Black
		WhiteColorDefault = 16777215;
		ThirdColorDefault = 16772915;
		GlowyColorDefault = 16728361;//Glow Red Bits
		GrayColorDefault = 12105912;
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;

		Bodybelt = new ModelRenderer(this);
		Bodybelt.setRotationPoint(0.0F, 0.0F, 0.0F);
		Bodybelt.setTextureOffset(16, 0).addBox(-4.0F, 9.0F, -2.0F, 8.0F, 4.0F, 4.0F, 1.01F, false);

		Bodyblack = new ModelRenderer(this);
		Bodyblack.setRotationPoint(0.0F, 0.0F, 0.0F);
		Bodyblack.setTextureOffset(16, 9).addBox(-4.0F, 10.0F, -2.0F, 8.0F, 3.0F, 4.0F, 0.51F, false);

		Bodyinnerblack = new ModelRenderer(this);
		Bodyinnerblack.setRotationPoint(0.0F, 0.0F, 0.0F);
		Bodyinnerblack.setTextureOffset(16, 24).addBox(-4.0F, 10.0F, -2.0F, 8.0F, 3.0F, 4.0F, 0.41F, false);

		Bodyinnersilver = new ModelRenderer(this);
		Bodyinnersilver.setRotationPoint(0.0F, 0.0F, 0.0F);
		Bodyinnersilver.setTextureOffset(16, 16).addBox(-4.0F, 10.0F, -2.0F, 8.0F, 3.0F, 4.0F, 0.41F, false);

		RightLegblack = new ModelRenderer(this);
		RightLegblack.setRotationPoint(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegblack, 0.192F, 0.0F, 0.0349F);
		RightLegblack.setTextureOffset(0, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		RightLegsilver = new ModelRenderer(this);
		RightLegsilver.setRotationPoint(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegsilver, 0.192F, 0.0F, 0.0349F);
		RightLegsilver.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		RightLegglow = new ModelRenderer(this);
		RightLegglow.setRotationPoint(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegglow, 0.192F, 0.0F, 0.0349F);
		RightLegglow.setTextureOffset(54, 1).addBox(-0.9994F, 7.2251F, -1.025F, 2.0F, 5.0F, 2.0F, 0.5F, false);

		LeftLegblack = new ModelRenderer(this);
		LeftLegblack.setRotationPoint(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegblack, -0.1745F, 0.0F, -0.0349F);
		LeftLegblack.setTextureOffset(40, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		LeftLegsilver = new ModelRenderer(this);
		LeftLegsilver.setRotationPoint(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegsilver, -0.1745F, 0.0F, -0.0349F);
		LeftLegsilver.setTextureOffset(40, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		LeftLegglow = new ModelRenderer(this);
		LeftLegglow.setRotationPoint(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegglow, -0.1745F, 0.0F, -0.0349F);
		LeftLegglow.setTextureOffset(27, 23).addBox(-0.9994F, 6.792F, -1.0212F, 2.0F, 5.0F, 2.0F, 0.5F, true);
	}

//	@Override
//	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
//		//previously the render function, render code was moved to a method below
//	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		
		this.Bodybelt.copyModelAngles(this.bipedBody);
		Bodybelt.render(matrixStack, buffer, packedLight, packedOverlay);
		
		float fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
		float fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
		float fblue = (float)(this.SecondaryColor & 255) / 255.0F;
		 this.Bodyblack.copyModelAngles(this.bipedBody);
		Bodyblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		 this.Bodyinnerblack.copyModelAngles(this.bipedBody);
		Bodyinnerblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		 this.RightLegblack.copyModelAngles(this.bipedRightLeg);
		RightLegblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		 this.LeftLegblack.copyModelAngles(this.bipedLeftLeg);
		LeftLegblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
				
		fred = (float)( this.GrayColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GrayColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GrayColor & 255) / 255.0F;
		 this.Bodyinnersilver.copyModelAngles(this.bipedBody);
		Bodyinnersilver.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		 this.RightLegsilver.copyModelAngles(this.bipedRightLeg);
		RightLegsilver.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		 this.LeftLegsilver.copyModelAngles(this.bipedLeftLeg);
			LeftLegsilver.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
			fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
	        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
	        fblue = (float)(this.GlowyColor & 255) / 255.0F;
		 this.RightLegglow.copyModelAngles(this.bipedRightLeg);
		RightLegglow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		 this.LeftLegglow.copyModelAngles(this.bipedLeftLeg);
		LeftLegglow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
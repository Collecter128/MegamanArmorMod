package com.collecter128.megamanarmormod.client.models;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class sigmaarmor_legs extends BipedModel  {
	private final ModelRenderer Body;
	private final ModelRenderer Bodygold;
	private final ModelRenderer Bodyred;
	private final ModelRenderer Bodygray;
	private final ModelRenderer RightLegblack;
	private final ModelRenderer RightLegsilver;
	private final ModelRenderer RightLegglow;
	private final ModelRenderer LeftLeg;
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

	public sigmaarmor_legs(float modelSize) {
		super(modelSize);
		textureWidth = 64;
		textureHeight = 32;
		
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

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.setTextureOffset(16, 24).addBox(-4.0F, 10.0F, -2.0F, 8.0F, 3.0F, 4.0F, 0.51F, false);

		Bodygold = new ModelRenderer(this);
		Bodygold.setRotationPoint(0.0F, 0.0F, 0.0F);
		Bodygold.setTextureOffset(19, 2).addBox(-1.0F, 11.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.91F, false);

		Bodyred = new ModelRenderer(this);
		Bodyred.setRotationPoint(0.0F, 0.0F, 0.0F);
		Bodyred.setTextureOffset(16, 13).addBox(-4.0F, 10.0F, -2.0F, 8.0F, 6.0F, 4.0F, 1.03F, false);

		Bodygray = new ModelRenderer(this);
		Bodygray.setRotationPoint(0.0F, 0.0F, 0.0F);
		Bodygray.setTextureOffset(28, 2).addBox(-2.0F, 11.0F, -2.0F, 4.0F, 5.0F, 2.0F, 1.01F, false);

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
		RightLegglow.setTextureOffset(56, 5).addBox(-0.9994F, 4.2251F, -1.025F, 2.0F, 8.0F, 2.0F, 0.5F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeg, -0.1745F, 0.0F, -0.0349F);
		LeftLeg.setTextureOffset(40, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		LeftLegsilver = new ModelRenderer(this);
		LeftLegsilver.setRotationPoint(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegsilver, -0.1745F, 0.0F, -0.0349F);
		LeftLegsilver.setTextureOffset(40, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		LeftLegglow = new ModelRenderer(this);
		LeftLegglow.setRotationPoint(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegglow, -0.1745F, 0.0F, -0.0349F);
		LeftLegglow.setTextureOffset(56, 17).addBox(-0.9994F, 3.792F, -1.0212F, 2.0F, 8.0F, 2.0F, 0.5F, true);
	}

//	@Override
//	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
//		//previously the render function, render code was moved to a method below
//	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		

		this.Body.copyModelAngles(this.bipedBody);
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
		this.RightLegblack.copyModelAngles(this.bipedRightLeg);
		RightLegblack.render(matrixStack, buffer, packedLight, packedOverlay);
		this.LeftLeg.copyModelAngles(this.bipedLeftLeg);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		
		this.Bodygold.copyModelAngles(this.bipedBody);
		Bodygold.render(matrixStack, buffer, packedLight, packedOverlay);
		
		this.Bodygray.copyModelAngles(this.bipedBody);
		Bodygray.render(matrixStack, buffer, packedLight, packedOverlay);
		this.RightLegsilver.copyModelAngles(this.bipedRightLeg);
		RightLegsilver.render(matrixStack, buffer, packedLight, packedOverlay);
		this.LeftLegsilver.copyModelAngles(this.bipedLeftLeg);
		LeftLegsilver.render(matrixStack, buffer, packedLight, packedOverlay);
		
		this.Bodyred.copyModelAngles(this.bipedBody);
		Bodyred.render(matrixStack, buffer, packedLight, packedOverlay);
		
		float fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
		float fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
		float fblue = (float)(this.GlowyColor & 255) / 255.0F;
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
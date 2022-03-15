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


public class ixlegs extends BipedModel {
	private final ModelRenderer Body;
	private final ModelRenderer Bodygray;
	private final ModelRenderer RightLeggray;
	private final ModelRenderer RightLeg2;
	private final ModelRenderer RightLegred;
	private final ModelRenderer RightLegglow;
	private final ModelRenderer LeftLeggray;
	private final ModelRenderer LeftLeg2;
	private final ModelRenderer LeftLegred;
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

	public ixlegs(float modelSize) {
		super(modelSize);
		textureWidth = 72;
		textureHeight = 164;
		
		MainColorDefault = 2196050;//Main Body Color Greenish
		SecondaryColorDefault = 8507304;// Weird Greenish color
		ThirdColorDefault = 14227325; // Purpleishcolor
		WhiteColorDefault = 15325417;// ???
		GlowyColorDefault = 14680095;// ???
		GrayColorDefault = 8479030;// ???
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, -1.0F, 0.0F);
		Body.setTextureOffset(16, 126).addBox(-4.0F, 9.0F, -2.0F, 8.0F, 4.0F, 4.0F, 1.01F, false);

		Bodygray = new ModelRenderer(this);
		Bodygray.setRotationPoint(0.0F, -1.0F, 0.0F);
		Bodygray.setTextureOffset(16, 134).addBox(-4.0F, 10.0F, -2.0F, 8.0F, 3.0F, 4.0F, 0.51F, false);

		RightLeggray = new ModelRenderer(this);
		RightLeggray.setRotationPoint(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeggray, 0.192F, 0.0F, 0.0349F);
		RightLeggray.setTextureOffset(0, 141).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		RightLeg2 = new ModelRenderer(this);
		RightLeg2.setRotationPoint(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeg2, 0.192F, 0.0F, 0.0349F);
		RightLeg2.setTextureOffset(0, 125).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		RightLegred = new ModelRenderer(this);
		RightLegred.setRotationPoint(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegred, 0.192F, 0.0F, 0.0349F);
		RightLegred.setTextureOffset(56, 125).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		RightLegglow = new ModelRenderer(this);
		RightLegglow.setRotationPoint(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegglow, 0.192F, 0.0F, 0.0349F);
		RightLegglow.setTextureOffset(17, 148).addBox(-0.9994F, 7.2251F, -1.025F, 2.0F, 5.0F, 2.0F, 0.5F, false);

		LeftLeggray = new ModelRenderer(this);
		LeftLeggray.setRotationPoint(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeggray, -0.1745F, 0.0F, -0.0349F);
		LeftLeggray.setTextureOffset(40, 141).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		LeftLeg2 = new ModelRenderer(this);
		LeftLeg2.setRotationPoint(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeg2, -0.1745F, 0.0F, -0.0349F);
		LeftLeg2.setTextureOffset(40, 125).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		LeftLegred = new ModelRenderer(this);
		LeftLegred.setRotationPoint(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegred, -0.1745F, 0.0F, -0.0349F);
		LeftLegred.setTextureOffset(56, 141).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		LeftLegglow = new ModelRenderer(this);
		LeftLegglow.setRotationPoint(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegglow, -0.1745F, 0.0F, -0.0349F);
		LeftLegglow.setTextureOffset(27, 148).addBox(-0.9994F, 6.792F, -1.0212F, 2.0F, 5.0F, 2.0F, 0.5F, true);
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
		this.Body.copyModelAngles(this.bipedBody);
		Body.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GrayColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GrayColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GrayColor & 255) / 255.0F;
		this.Bodygray.copyModelAngles(this.bipedBody);
		Bodygray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLeggray.copyModelAngles(this.bipedRightLeg);
		RightLeggray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeggray.copyModelAngles(this.bipedLeftLeg);
		LeftLeggray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
		this.RightLeg2.copyModelAngles(this.bipedRightLeg);
		RightLeg2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeg2.copyModelAngles(this.bipedLeftLeg);
		LeftLeg2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		

		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
		this.RightLegglow.copyModelAngles(this.bipedRightLeg);
		RightLegglow.render(matrixStack, buffer, 15728640, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegglow.copyModelAngles(this.bipedLeftLeg);
		LeftLegglow.render(matrixStack, buffer, 15728640, packedOverlay, fred, fgreen, fblue, alpha);
		
		this.RightLegred.copyModelAngles(this.bipedRightLeg);
		RightLegred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegred.copyModelAngles(this.bipedLeftLeg);
		LeftLegred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
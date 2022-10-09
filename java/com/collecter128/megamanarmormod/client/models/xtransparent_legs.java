package com.collecter128.megamanarmormod.client.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class xtransparent_legs extends BipedModel  {
	private final ModelRenderer Bodymaincolor;
	private final ModelRenderer Bodymainandgray;
	private final ModelRenderer Bodymaingray;
	private final ModelRenderer RightLegsecondary;
	private final ModelRenderer RightLeggray;
	private final ModelRenderer RightLegglow;
	private final ModelRenderer LeftLegsecondary;
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

	public xtransparent_legs(float modelSize) {
		super(modelSize);
		texWidth = 101;
		texHeight = 146;

		Bodymaincolor = new ModelRenderer(this);
		Bodymaincolor.setPos(0.0F, 0.0F, 0.0F);
		Bodymaincolor.texOffs(77, 105).addBox(-4.0F, 10.0F, -2.0F, 8.0F, 4.0F, 4.0F, 1.01F, false);

		Bodymainandgray = new ModelRenderer(this);
		Bodymainandgray.setPos(0.0F, 0.0F, 0.0F);
		Bodymainandgray.texOffs(16, 115).addBox(-4.0F, 10.0F, -2.0F, 8.0F, 4.0F, 4.0F, 1.01F, false);

		Bodymaingray = new ModelRenderer(this);
		Bodymaingray.setPos(0.0F, 0.0F, 0.0F);
		Bodymaingray.texOffs(16, 123).addBox(-4.0F, 11.0F, -2.0F, 8.0F, 3.0F, 4.0F, 0.51F, false);

		RightLegsecondary = new ModelRenderer(this);
		RightLegsecondary.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegsecondary, 0.192F, 0.0F, 0.0349F);
		RightLegsecondary.texOffs(0, 114).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		RightLeggray = new ModelRenderer(this);
		RightLeggray.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeggray, 0.192F, 0.0F, 0.0349F);
		RightLeggray.texOffs(0, 130).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		RightLegglow = new ModelRenderer(this);
		RightLegglow.setPos(-2.9F, 12.0F, 1.0F);
		setRotationAngle(RightLegglow, 0.192F, 0.0F, 0.0349F);
		RightLegglow.texOffs(17, 137).addBox(0.0F, 8.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.5F, false);

		LeftLegsecondary = new ModelRenderer(this);
		LeftLegsecondary.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegsecondary, -0.1745F, 0.0F, -0.0349F);
		LeftLegsecondary.texOffs(40, 114).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		LeftLeggray = new ModelRenderer(this);
		LeftLeggray.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeggray, -0.1745F, 0.0F, -0.0349F);
		LeftLeggray.texOffs(40, 130).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		LeftLegglow = new ModelRenderer(this);
		LeftLegglow.setPos(0.9F, 12.0F, 1.0F);
		setRotationAngle(LeftLegglow, -0.1745F, 0.0F, -0.0349F);
		LeftLegglow.texOffs(27, 137).addBox(0.0F, 8.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.5F, true);
	}

//	@Override
//	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
//		//previously the render function, render code was moved to a method below
//	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Bodymaincolor.render(matrixStack, buffer, packedLight, packedOverlay);
		Bodymainandgray.render(matrixStack, buffer, packedLight, packedOverlay);
		Bodymaingray.render(matrixStack, buffer, packedLight, packedOverlay);
		RightLegsecondary.render(matrixStack, buffer, packedLight, packedOverlay);
		RightLeggray.render(matrixStack, buffer, packedLight, packedOverlay);
		RightLegglow.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftLegsecondary.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftLeggray.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftLegglow.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
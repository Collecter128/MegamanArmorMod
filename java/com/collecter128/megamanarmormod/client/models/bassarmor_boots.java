package com.collecter128.megamanarmormod.client.models;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class bassarmor_boots extends BipedModel {
//	private final ModelRenderer Head;
//	private final ModelRenderer cube_r1;
//	private final ModelRenderer LFin_r1;
//	private final ModelRenderer cube_r2;
//	private final ModelRenderer RFin_r1;
//	private final ModelRenderer Body;
//	private final ModelRenderer RightArm;
//	private final ModelRenderer LeftArm;
	private final ModelRenderer RightLeg;
	private final ModelRenderer LeftLeg;

	public bassarmor_boots(float modelSize) {
		super(modelSize);
		texWidth = 64;
		texHeight = 93;

//		Head = new ModelRenderer(this);
//		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
//		setRotationAngle(Head, -0.1047F, 0.0873F, 0.0F);
//		Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
//		Head.setTextureOffset(47, 10).addBox(5.5744F, -5.7259F, -2.7657F, 1.0F, 3.0F, 3.0F, 0.5F, false);
//		Head.setTextureOffset(36, 10).addBox(-5.8066F, -5.7298F, -2.7285F, 1.0F, 3.0F, 3.0F, 0.5F, false);
//		Head.setTextureOffset(0, 32).addBox(-3.6706F, -7.6327F, -3.8533F, 8.0F, 7.0F, 8.0F, 0.55F, false);
//		Head.setTextureOffset(43, 3).addBox(-1.5114F, -9.8794F, -5.216F, 3.0F, 5.0F, 1.0F, 0.1F, false);
//
//		cube_r1 = new ModelRenderer(this);
//		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
//		Head.addChild(cube_r1);
//		setRotationAngle(cube_r1, 0.2618F, -0.2618F, -0.2618F);
//		cube_r1.setTextureOffset(45, 73).addBox(3.8F, -7.3064F, 4.0417F, 8.0F, 9.0F, 1.0F, 0.0F, false);
//
//		LFin_r1 = new ModelRenderer(this);
//		LFin_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
//		Head.addChild(LFin_r1);
//		setRotationAngle(LFin_r1, 0.0F, 0.0F, -0.7854F);
//		LFin_r1.setTextureOffset(0, 79).addBox(4.2961F, -2.8609F, -6.0489F, 9.0F, 1.0F, 12.0F, 0.0F, false);
//
//		cube_r2 = new ModelRenderer(this);
//		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
//		Head.addChild(cube_r2);
//		setRotationAngle(cube_r2, 0.2618F, 0.2618F, 0.2618F);
//		cube_r2.setTextureOffset(45, 83).addBox(-12.0F, -7.086F, 4.4969F, 8.0F, 9.0F, 1.0F, 0.0F, false);
//
//		RFin_r1 = new ModelRenderer(this);
//		RFin_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
//		Head.addChild(RFin_r1);
//		setRotationAngle(RFin_r1, 0.0F, 0.0F, 0.7854F);
//		RFin_r1.setTextureOffset(0, 65).addBox(-13.2135F, -2.9693F, -6.0F, 9.0F, 1.0F, 12.0F, 0.0F, false);
//
//		Body = new ModelRenderer(this);
//		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
//		Body.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);
//		Body.setTextureOffset(16, 48).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
//
//		RightArm = new ModelRenderer(this);
//		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
//		setRotationAngle(RightArm, -0.1745F, 0.0F, 0.0F);
//		RightArm.setTextureOffset(40, 20).addBox(-6.0F, -3.2019F, -2.0F, 6.0F, 4.0F, 4.0F, 0.8F, false);
//		RightArm.setTextureOffset(44, 27).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
//		RightArm.setTextureOffset(44, 65).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
//
//		LeftArm = new ModelRenderer(this);
//		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
//		setRotationAngle(LeftArm, 0.2094F, 0.0F, 0.0F);
//		LeftArm.setTextureOffset(41, 54).addBox(0.0F, -3.3756F, -1.7921F, 6.0F, 4.0F, 4.0F, 0.8F, false);
//		LeftArm.setTextureOffset(44, 27).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
//		LeftArm.setTextureOffset(44, 43).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeg, 0.192F, 0.0F, 0.0349F);
		RightLeg.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeg, -0.1745F, 0.0F, -0.0349F);
		LeftLeg.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
	}

//	@Override
//	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
//		//previously the render function, render code was moved to a method below
//	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		this.RightLeg.copyFrom(this.rightLeg);
		this.LeftLeg.copyFrom(this.leftLeg);
//		Head.render(matrixStack, buffer, packedLight, packedOverlay);
//		Body.render(matrixStack, buffer, packedLight, packedOverlay);
//		RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
//		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
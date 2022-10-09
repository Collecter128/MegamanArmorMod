package com.collecter128.megamanarmormod.client.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class sigmaarmor_chestplate extends BipedModel {
	//private final ModelRenderer Head;
	private final ModelRenderer Body;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;
	//private final ModelRenderer RightLeg;
	//private final ModelRenderer LeftLeg;

	public sigmaarmor_chestplate(float modelSize) {
		super(modelSize);
		texWidth = 64;
		texHeight = 61;

//		Head = new ModelRenderer(this);
//		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
//		setRotationAngle(Head, -0.1047F, 0.0873F, 0.0F);
//		Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.55F, false);
//		Head.setTextureOffset(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
//		Head.setTextureOffset(30, 34).addBox(4.4038F, -5.925F, -0.8709F, 1.0F, 3.0F, 3.0F, 0.5F, false);
//		Head.setTextureOffset(19, 34).addBox(-4.9848F, -5.9471F, -0.6603F, 1.0F, 3.0F, 3.0F, 0.5F, false);
//		Head.setTextureOffset(42, 7).addBox(-1.0F, -8.8411F, -5.6852F, 2.0F, 2.0F, 1.0F, 0.1F, false);

		Body = new ModelRenderer(this);
		Body.setPos(0.0F, 0.0F, 0.0F);
		Body.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);
		Body.texOffs(0, 40).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArm, -0.1745F, 0.0F, 0.0F);
		RightArm.texOffs(40, 32).addBox(-4.0F, -2.2019F, -2.0F, 4.0F, 3.0F, 4.0F, 0.8F, false);
		RightArm.texOffs(42, 39).addBox(-3.0F, -2.9867F, -2.1736F, 3.0F, 3.0F, 4.0F, 1.0F, false);
		RightArm.texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		RightArm.texOffs(24, 42).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		RightArm.texOffs(24, 51).addBox(-3.0F, 8.2239F, -1.8264F, 4.0F, 0.0F, 4.0F, 1.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArm, 0.2094F, 0.0F, 0.0F);
		LeftArm.texOffs(40, 46).addBox(0.0F, -2.3756F, -1.7921F, 4.0F, 3.0F, 4.0F, 0.8F, false);
		LeftArm.texOffs(42, 53).addBox(0.0F, -2.9616F, -1.9624F, 3.0F, 3.0F, 4.0F, 1.0F, false);
		LeftArm.texOffs(40, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArm.texOffs(24, 42).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		LeftArm.texOffs(24, 51).addBox(-1.0F, 8.2391F, -2.0F, 4.0F, 0.0F, 4.0F, 1.0F, false);

//		RightLeg = new ModelRenderer(this);
//		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
//		setRotationAngle(RightLeg, 0.192F, 0.0F, 0.0349F);
//		RightLeg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
//		RightLeg.setTextureOffset(0, 32).addBox(-2.2094F, 5.923F, -1.8374F, 4.0F, 0.0F, 4.0F, 1.25F, false);
//
//		LeftLeg = new ModelRenderer(this);
//		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
//		setRotationAngle(LeftLeg, -0.1745F, 0.0F, -0.0349F);
//		LeftLeg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
//		LeftLeg.setTextureOffset(0, 32).addBox(-1.7906F, 5.9211F, -2.0562F, 4.0F, 0.0F, 4.0F, 1.25F, true);
	}

//	@Override
//	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
//		//previously the render function, render code was moved to a method below
//	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
//		this.Head.copyModelAngles(this.bipedHead);
		this.Body.copyFrom(this.body);
		this.RightArm.copyFrom(this.rightArm);
		this.LeftArm.copyFrom(this.leftArm);
//		Head.render(matrixStack, buffer, packedLight, packedOverlay);
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
//		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
//		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
package com.collecter128.megamanarmormod.client.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

@OnlyIn(Dist.CLIENT)
public class protomanarmor_chestplate extends BipedModel {
	//private final ModelRenderer Head;
	private final ModelRenderer Body;
	private final ModelRenderer cube_r1;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;
	//private final ModelRenderer RightLeg;
	//private final ModelRenderer LeftLeg;

	public protomanarmor_chestplate(float modelSize) {
		super(modelSize);
		texWidth = 64;
		texHeight = 71;

		//Head = new ModelRenderer(this);
		//Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		//setRotationAngle(Head, -0.1047F, 0.0873F, 0.0F);
		//Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		//Head.setTextureOffset(34, 9).addBox(5.0643F, -3.9451F, -0.5752F, 1.0F, 3.0F, 3.0F, 0.5F, false);
		//Head.setTextureOffset(49, 9).addBox(-5.8938F, -3.8448F, -1.5287F, 1.0F, 3.0F, 3.0F, 0.5F, false);
		//Head.setTextureOffset(21, 34).addBox(-5.5F, -8.4226F, -5.9571F, 11.0F, 6.0F, 1.0F, -0.12F, false);

		Body = new ModelRenderer(this);
		Body.setPos(0.0F, 0.0F, 0.0F);
		Body.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(2.0F, 7.0F, 4.0F);
		Body.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.3491F, 0.0F, 0.0F);
		cube_r1.texOffs(17, 49).addBox(-2.0F, -7.0F, 0.0F, 2.0F, 7.0F, 1.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArm, -0.1745F, 0.0F, 0.0F);
		RightArm.texOffs(40, 40).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		RightArm.texOffs(40, 56).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArm, 0.2094F, 0.0F, 0.0F);
		LeftArm.texOffs(40, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArm.texOffs(40, 32).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);

		//RightLeg = new ModelRenderer(this);
		//RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		//setRotationAngle(RightLeg, 0.192F, 0.0F, 0.0349F);
		//RightLeg.setTextureOffset(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);

		//LeftLeg = new ModelRenderer(this);
		//LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		//setRotationAngle(LeftLeg, -0.1745F, 0.0F, -0.0349F);
		//LeftLeg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
	}

	//@Override
	//public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
	//	//previously the render function, render code was moved to a method below
	//}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		//Head.render(matrixStack, buffer, packedLight, packedOverlay);
		this.Body.copyFrom(this.body);
		this.RightArm.copyFrom(this.rightArm);
		this.LeftArm.copyFrom(this.leftArm);
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
		//RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		//LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
package com.collecter128.megamanarmormod.client.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

@OnlyIn(Dist.CLIENT)
public class Wily_Jacket extends BipedModel {
	private final ModelRenderer Body;
	private final ModelRenderer BottomCoatinner_r1;
	//private final ModelRenderer Collar_r1;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;

	public Wily_Jacket(float modelSize) {
		super(modelSize);
		texWidth = 64;
		texHeight = 70;

		Body = new ModelRenderer(this);
		Body.setPos(0.0F, 0.0F, 0.0F);
		Body.texOffs(16, 13).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 1.01F, false);
		Body.texOffs(16, 37).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.76F, false);
		Body.texOffs(2, 42).addBox(-4.5F, -1.0F, -3.5F, 7.0F, 8.0F, 0.0F, 0.0F, false);

		BottomCoatinner_r1 = new ModelRenderer(this);
		BottomCoatinner_r1.setPos(1.0F, 15.0F, 3.0F);
		Body.addChild(BottomCoatinner_r1);
		setRotationAngle(BottomCoatinner_r1, 0.48F, 0.0F, 0.0F);
		BottomCoatinner_r1.texOffs(40, 50).addBox(-5.0F, -6.0F, -1.0F, 8.0F, 6.0F, 4.0F, 0.75F, false);
		BottomCoatinner_r1.texOffs(40, 37).addBox(-5.0F, -6.0F, -1.0F, 8.0F, 6.0F, 4.0F, 1.0F, false);

		//Collar_r1 = new ModelRenderer(this);
		//Collar_r1.setRotationPoint(0.5F, -2.5F, 3.5F);
		//Body.addChild(Collar_r1);
		//setRotationAngle(Collar_r1, -0.6981F, 0.0F, 0.0F);
		//Collar_r1.setTextureOffset(0, 1).addBox(-5.5F, -2.5F, -0.5F, 10.0F, 5.0F, 0.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArm, -0.1745F, 0.0F, 0.0F);
		RightArm.texOffs(40, 13).addBox(-3.0F, -2.241F, -2.0F, 4.0F, 4.0F, 4.0F, 0.72F, true);
		RightArm.texOffs(0, 21).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArm, 0.2094F, 0.0F, 0.0F);
		LeftArm.texOffs(40, 21).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArm.texOffs(40, 13).addBox(-1.0F, -2.241F, -2.0F, 4.0F, 4.0F, 4.0F, 0.72F, true);
	}

	//@Override
	//public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
	//	//previously the render function, render code was moved to a method below
	//}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		this.Body.copyFrom(this.body);
		this.RightArm.copyFrom(this.rightArm);
		this.LeftArm.copyFrom(this.leftArm);
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
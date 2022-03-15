package com.collecter128.megamanarmormod.client.models;

import com.collecter128.megamanarmormod.entity.bustershotentity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class bustershot0 <T extends bustershotentity> extends EntityModel<T> {//
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r1;

	public bustershot0() {
		textureWidth = 32;
		textureHeight = 32;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 0).addBox(0.0F, -6.0F, -4.0F, 0.0F, 6.0F, 8.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-3.0F, -3.0F, -4.0F);
		bb_main.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 1.5708F);
		cube_r1.setTextureOffset(0, 6).addBox(0.0F, -6.0F, 0.0F, 0.0F, 6.0F, 8.0F, 0.0F, false);
	}

//	@Override
//	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
//		//previously the render function, render code was moved to a method below
//	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

//	@Override
//	public void setRotationAngles(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks,
//			float netHeadYaw, float headPitch) {
//		// TODO Auto-generated method stub
//		
//	}

//	@Override
//	public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks,
//			float netHeadYaw, float headPitch) {
//		// TODO Auto-generated method stub
//		
//	}

@Override
public void setRotationAngles(bustershotentity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks,
		float netHeadYaw, float headPitch) {
	// TODO Auto-generated method stub
	
}
}
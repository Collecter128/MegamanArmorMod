package com.collecter128.megamanarmormod.client.models;

import com.collecter128.megamanarmormod.entity.bustershotentity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

@OnlyIn(Dist.CLIENT)
public class bustershot0 <T extends bustershotentity> extends EntityModel<T> {//
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r1;

	public bustershot0() {
		texWidth = 32;
		texHeight = 32;

		bb_main = new ModelRenderer(this);
		bb_main.setPos(0.0F, 24.0F, 0.0F);
		bb_main.texOffs(0, 0).addBox(0.0F, -6.0F, -4.0F, 0.0F, 6.0F, 8.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(-3.0F, -3.0F, -4.0F);
		bb_main.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 1.5708F);
		cube_r1.texOffs(0, 6).addBox(0.0F, -6.0F, 0.0F, 0.0F, 6.0F, 8.0F, 0.0F, false);
	}

//	@Override
//	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
//		//previously the render function, render code was moved to a method below
//	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		bb_main.render(matrixStack, buffer, 0xF000F0, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
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
public void setupAnim(bustershotentity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks,
		float netHeadYaw, float headPitch) {
	// TODO Auto-generated method stub
	
}

//@Override
//public void setupAnim(T p_225597_1_, float p_225597_2_, float p_225597_3_, float p_225597_4_, float p_225597_5_,
//		float p_225597_6_) {
//	// TODO Auto-generated method stub
//	
//}
}
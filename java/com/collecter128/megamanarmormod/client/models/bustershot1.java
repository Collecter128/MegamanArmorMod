package com.collecter128.megamanarmormod.client.models;

import com.collecter128.megamanarmormod.entity.bustershotentity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Matrix3f;
import net.minecraft.util.math.vector.Matrix4f;
import net.minecraft.util.math.vector.Vector3f;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

@OnlyIn(Dist.CLIENT)
public abstract class bustershot1 <T extends bustershotentity> extends EntityRenderer<T> {//
	//private final ModelRenderer bb_main;
	//private final ModelRenderer cube_r1;

//	public bustershot1() {
//		texWidth = 32;
//		texHeight = 32;
//
//		bb_main = new ModelRenderer(this);
//		bb_main.setPos(0.0F, 24.0F, 0.0F);
//		bb_main.texOffs(0, 0).addBox(0.0F, -6.0F, -4.0F, 0.0F, 6.0F, 8.0F, 0.0F, false);
//
//		cube_r1 = new ModelRenderer(this);
//		cube_r1.setPos(-3.0F, -3.0F, -4.0F);
//		bb_main.addChild(cube_r1);
//		setRotationAngle(cube_r1, 0.0F, 0.0F, 1.5708F);
//		cube_r1.texOffs(0, 6).addBox(0.0F, -6.0F, 0.0F, 0.0F, 6.0F, 8.0F, 0.0F, false);
//	}

	public bustershot1(EntityRendererManager p_i46193_1_) {
	      super(p_i46193_1_);
//	      texWidth = 32;
//			texHeight = 32;
//
//			bb_main = new ModelRenderer(this);
//			bb_main.setPos(0.0F, 24.0F, 0.0F);
//			bb_main.texOffs(0, 0).addBox(0.0F, -6.0F, -4.0F, 0.0F, 6.0F, 8.0F, 0.0F, false);
//
//			cube_r1 = new ModelRenderer(this);
//			cube_r1.setPos(-3.0F, -3.0F, -4.0F);
//			bb_main.addChild(cube_r1);
//			setRotationAngle(cube_r1, 0.0F, 0.0F, 1.5708F);
//			cube_r1.texOffs(0, 6).addBox(0.0F, -6.0F, 0.0F, 0.0F, 6.0F, 8.0F, 0.0F, false);
	      
	   }

	   public void render(T p_225623_1_, float p_225623_2_, float p_225623_3_, MatrixStack p_225623_4_, IRenderTypeBuffer p_225623_5_, int p_225623_6_) {
	      p_225623_4_.pushPose();
	      p_225623_4_.mulPose(Vector3f.YP.rotationDegrees(MathHelper.lerp(p_225623_3_, p_225623_1_.yRotO, p_225623_1_.yRot) - 90.0F));
	      p_225623_4_.mulPose(Vector3f.ZP.rotationDegrees(MathHelper.lerp(p_225623_3_, p_225623_1_.xRotO, p_225623_1_.xRot)));
	      int i = 0;
	      float f = 0.0F;
	      float f1 = 0.5F;
	      float f2 = 0.0F;
	      float f3 = 0.15625F;
	      float f4 = 0.0F;
	      float f5 = 0.15625F;
	      float f6 = 0.15625F;
	      float f7 = 0.3125F;
	      float f8 = 0.05625F;
	      float f9 = (float)p_225623_1_.shakeTime - p_225623_3_;
	      if (f9 > 0.0F) {
	         float f10 = -MathHelper.sin(f9 * 3.0F) * f9;
	         p_225623_4_.mulPose(Vector3f.ZP.rotationDegrees(f10));
	      }

	      p_225623_4_.mulPose(Vector3f.XP.rotationDegrees(45.0F));
	      p_225623_4_.scale(0.05625F, 0.05625F, 0.05625F);
	      p_225623_4_.translate(-4.0D, 0.0D, 0.0D);
	      IVertexBuilder ivertexbuilder = p_225623_5_.getBuffer(RenderType.entityCutout(this.getTextureLocation(p_225623_1_)));
	      MatrixStack.Entry matrixstack$entry = p_225623_4_.last();
	      Matrix4f matrix4f = matrixstack$entry.pose();
	      Matrix3f matrix3f = matrixstack$entry.normal();
	      this.vertex(matrix4f, matrix3f, ivertexbuilder, -7, -2, -2, 0.0F, 0.15625F, -1, 0, 0, p_225623_6_);
	      this.vertex(matrix4f, matrix3f, ivertexbuilder, -7, -2, 2, 0.15625F, 0.15625F, -1, 0, 0, p_225623_6_);
	      this.vertex(matrix4f, matrix3f, ivertexbuilder, -7, 2, 2, 0.15625F, 0.3125F, -1, 0, 0, p_225623_6_);
	      this.vertex(matrix4f, matrix3f, ivertexbuilder, -7, 2, -2, 0.0F, 0.3125F, -1, 0, 0, p_225623_6_);
	      this.vertex(matrix4f, matrix3f, ivertexbuilder, -7, 2, -2, 0.0F, 0.15625F, 1, 0, 0, p_225623_6_);
	      this.vertex(matrix4f, matrix3f, ivertexbuilder, -7, 2, 2, 0.15625F, 0.15625F, 1, 0, 0, p_225623_6_);
	      this.vertex(matrix4f, matrix3f, ivertexbuilder, -7, -2, 2, 0.15625F, 0.3125F, 1, 0, 0, p_225623_6_);
	      this.vertex(matrix4f, matrix3f, ivertexbuilder, -7, -2, -2, 0.0F, 0.3125F, 1, 0, 0, p_225623_6_);

	      for(int j = 0; j < 4; ++j) {
	         p_225623_4_.mulPose(Vector3f.XP.rotationDegrees(90.0F));
	         this.vertex(matrix4f, matrix3f, ivertexbuilder, -8, -2, 0, 0.0F, 0.0F, 0, 1, 0, p_225623_6_);
	         this.vertex(matrix4f, matrix3f, ivertexbuilder, 8, -2, 0, 0.5F, 0.0F, 0, 1, 0, p_225623_6_);
	         this.vertex(matrix4f, matrix3f, ivertexbuilder, 8, 2, 0, 0.5F, 0.15625F, 0, 1, 0, p_225623_6_);
	         this.vertex(matrix4f, matrix3f, ivertexbuilder, -8, 2, 0, 0.0F, 0.15625F, 0, 1, 0, p_225623_6_);
	      }

	      p_225623_4_.popPose();
	      super.render(p_225623_1_, p_225623_2_, p_225623_3_, p_225623_4_, p_225623_5_, p_225623_6_);
	   }

	   public void vertex(Matrix4f p_229039_1_, Matrix3f p_229039_2_, IVertexBuilder p_229039_3_, int p_229039_4_, int p_229039_5_, int p_229039_6_, float p_229039_7_, float p_229039_8_, int p_229039_9_, int p_229039_10_, int p_229039_11_, int p_229039_12_) {
	      p_229039_3_.vertex(p_229039_1_, (float)p_229039_4_, (float)p_229039_5_, (float)p_229039_6_).color(255, 255, 255, 255).uv(p_229039_7_, p_229039_8_).overlayCoords(OverlayTexture.NO_OVERLAY).uv2(p_229039_12_).normal(p_229039_2_, (float)p_229039_9_, (float)p_229039_11_, (float)p_229039_10_).endVertex();
	   }

}
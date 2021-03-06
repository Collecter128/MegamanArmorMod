package com.collecter128.megamanarmormod.client.models;

import javax.annotation.Nullable;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.RenderState;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class xarmorclear_leggings extends BipedModel {
	private final ModelRenderer Body;
	private final ModelRenderer RightLeg;
	private final ModelRenderer LeftLeg;

	public xarmorclear_leggings(float modelSize) {
		super(modelSize);
		textureWidth = 64;
		textureHeight = 32;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.setTextureOffset(16, 17).addBox(-4.0F, 10.0F, -2.0F, 8.0F, 4.0F, 4.0F, 1.01F, false);
		Body.setTextureOffset(16, 25).addBox(-4.0F, 10.0F, -2.0F, 8.0F, 3.0F, 4.0F, 0.51F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeg, 0.192F, 0.0F, 0.0349F);
		RightLeg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeg, -0.1745F, 0.0F, -0.0349F);
		LeftLeg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
	}
	
//	public static RenderType getArmorTransparent(ResourceLocation locationIn) {
//	    RenderType.State rendertype$state = RenderType.State.getBuilder().texture(new RenderState.TextureState(locationIn, false, false)).transparency(RenderState.TRANSLUCENT_TRANSPARENCY).diffuseLighting(RenderState.DIFFUSE_LIGHTING_ENABLED).alpha(RenderState.DEFAULT_ALPHA).cull(RenderState.CULL_DISABLED).lightmap(RenderState.LIGHTMAP_ENABLED).overlay(RenderState.OVERLAY_ENABLED).layer(RenderState.field_239235_M_).build(true);
//	    return RenderType.makeType("armor_transparent", DefaultVertexFormats.ENTITY, 7, 256, true, false, rendertype$state);
//	 }

//	@Override
//	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
//		//previously the render function, render code was moved to a method below
//	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		this.Body.copyModelAngles(this.bipedBody);
		this.RightLeg.copyModelAngles(this.bipedRightLeg);
		this.LeftLeg.copyModelAngles(this.bipedLeftLeg);
		//buffer.
		// IVertexBuilder ivertexbuilder = ItemRenderer.getArmorVertexBuilder(p_241738_2_, RenderType.getArmorCutoutNoCull(armorResource), false, p_241738_5_);
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
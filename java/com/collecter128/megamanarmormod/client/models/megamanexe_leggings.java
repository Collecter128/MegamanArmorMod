package com.collecter128.megamanarmormod.client.models;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.inventory.EquipmentSlotType;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class megamanexe_leggings extends BipedModel  {
	private final ModelRenderer Body;
	private final ModelRenderer Bodylightblue;
	private final ModelRenderer RightLegdarkblue;
	private final ModelRenderer RightLeglightblue;
	private final ModelRenderer LeftLegdarkblue;
	private final ModelRenderer LeftLeglightblue;
	
	public int MainColor;
	public int SecondaryColor;
	public int WhiteColor;
	public int ThirdColor;
	public int GlowyColor;
	public int GrayColor;
	public int FourthColor;
	public int MainColorDefault;
	public int SecondaryColorDefault;
	public int WhiteColorDefault;
	public int ThirdColorDefault;
	public int GlowyColorDefault;
	public int GrayColorDefault;
	public int FourthColorDefault;

	public megamanexe_leggings(float modelSize) {
		super(modelSize);
		texWidth = 74;
		texHeight = 157;
		
		MainColorDefault = 3425221;//Main Body Color grayblue
		SecondaryColorDefault = 3225453;//Secondary 
		ThirdColorDefault = 16630571; //golden 
		WhiteColorDefault = 2378966;//
		GlowyColorDefault = 16646401;// reds
		GrayColorDefault = 2378966;//
		FourthColorDefault = 1244562;//Blue Glow
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
		FourthColor = FourthColorDefault;

		Body = new ModelRenderer(this);
		Body.setPos(0.0F, 0.0F, 0.0F);
		Body.texOffs(16, 119).addBox(-4.0F, 9.0F, -2.0F, 8.0F, 3.0F, 4.0F, 0.51F, false);

		Bodylightblue = new ModelRenderer(this);
		Bodylightblue.setPos(0.0F, 0.0F, 0.0F);
		Bodylightblue.texOffs(16, 130).addBox(-4.0F, 9.0F, -2.0F, 8.0F, 3.0F, 4.0F, 0.51F, false);

		RightLegdarkblue = new ModelRenderer(this);
		RightLegdarkblue.setPos(-2.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegdarkblue, 0.192F, 0.0F, 0.0349F);
		RightLegdarkblue.texOffs(0, 118).addBox(-1.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		RightLeglightblue = new ModelRenderer(this);
		RightLeglightblue.setPos(-2.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeglightblue, 0.192F, 0.0F, 0.0349F);
		RightLeglightblue.texOffs(53, 140).addBox(-1.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		LeftLegdarkblue = new ModelRenderer(this);
		LeftLegdarkblue.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegdarkblue, -0.1745F, 0.0F, -0.0349F);
		LeftLegdarkblue.texOffs(40, 117).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		LeftLeglightblue = new ModelRenderer(this);
		LeftLeglightblue.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeglightblue, -0.1745F, 0.0F, -0.0349F);
		LeftLeglightblue.texOffs(53, 140).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
	}

//	@Override
//	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
//		//previously the render function, render code was moved to a method below
//	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		
		float fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        float fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        float fblue = (float)(this.SecondaryColor & 255) / 255.0F;
		this.Body.copyFrom(this.body);
		Body.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegdarkblue.copyFrom(this.rightLeg);
		RightLegdarkblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegdarkblue.copyFrom(this.leftLeg);
		LeftLegdarkblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.FourthColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.FourthColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.FourthColor & 255) / 255.0F;
		this.Bodylightblue.copyFrom(this.body);
		Bodylightblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLeglightblue.copyFrom(this.rightLeg);
		RightLeglightblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeglightblue.copyFrom(this.leftLeg);
		LeftLeglightblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
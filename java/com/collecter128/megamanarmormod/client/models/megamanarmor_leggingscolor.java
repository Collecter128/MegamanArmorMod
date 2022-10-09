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


public class megamanarmor_leggingscolor extends BipedModel {
	private final ModelRenderer Body1;//Main Color Dark Blue
	private final ModelRenderer Body2;//Gray Color
	private final ModelRenderer RightLeg1;//Main Color Dark Blue
	private final ModelRenderer RightLeg2;//Secondary Color Teal
	private final ModelRenderer RightLeg3;//Gray Color
	private final ModelRenderer RightLegglow;//Glowy Red Bits
	private final ModelRenderer LeftLeg1;//Main Color Dark Blue
	private final ModelRenderer LeftLeg2;//Secondary Color Teal
	private final ModelRenderer LeftLeg3;//Gray Color
	private final ModelRenderer LeftLegglow;//Glowy Red Bits
	
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

	public megamanarmor_leggingscolor(float modelSize) {
		super(modelSize);
		texWidth = 64;
		texHeight = 51;
		
		MainColorDefault = 342773;//Main Body Color Megaman Dark Blue
		//MainColorDefault = 15404288;//Main Body Color Megaman Dark Blue
		SecondaryColorDefault = 379125;//Secondary Color Megaman Light Blueish
		WhiteColorDefault = 16777215;
		ThirdColorDefault = 14105660;
		GlowyColorDefault = 16728361;//Glow Red Bits
		GrayColorDefault = 12105912;
		FourthColorDefault = 379125;
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
		FourthColor = FourthColorDefault;

		Body1 = new ModelRenderer(this);
		Body1.setPos(0.0F, 0.0F, 0.0F);
		Body1.texOffs(16, 10).addBox(-4.0F, 8.0F, -2.0F, 8.0F, 4.0F, 4.0F, 1.01F, false);
		Body1.texOffs(16, 18).addBox(-4.0F, 9.0F, -2.0F, 8.0F, 3.0F, 4.0F, 0.51F, false);

		Body2 = new ModelRenderer(this);
		Body2.setPos(0.0F, 0.0F, 0.0F);
		Body2.texOffs(16, 25).addBox(-4.0F, 9.0F, -2.0F, 8.0F, 3.0F, 4.0F, 0.51F, false);

		RightLeg1 = new ModelRenderer(this);
		RightLeg1.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeg1, 0.192F, 0.0F, 0.0349F);
		RightLeg1.texOffs(40, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		RightLeg2 = new ModelRenderer(this);
		RightLeg2.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeg2, 0.192F, 0.0F, 0.0349F);
		RightLeg2.texOffs(40, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		RightLeg3 = new ModelRenderer(this);
		RightLeg3.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeg3, 0.192F, 0.0F, 0.0349F);
		RightLeg3.texOffs(40, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		RightLegglow = new ModelRenderer(this);
		RightLegglow.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegglow, 0.192F, 0.0F, 0.0349F);
		RightLegglow.texOffs(16, 44).addBox(-2.0F, 9.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.5F, false);

		LeftLeg1 = new ModelRenderer(this);
		LeftLeg1.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeg1, -0.1745F, 0.0F, -0.0349F);
		LeftLeg1.texOffs(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		LeftLeg2 = new ModelRenderer(this);
		LeftLeg2.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeg2, -0.1745F, 0.0F, -0.0349F);
		LeftLeg2.texOffs(0, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		LeftLeg3 = new ModelRenderer(this);
		LeftLeg3.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeg3, -0.1745F, 0.0F, -0.0349F);
		LeftLeg3.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		LeftLegglow = new ModelRenderer(this);
		LeftLegglow.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegglow, -0.1745F, 0.0F, -0.0349F);
		LeftLegglow.texOffs(16, 36).addBox(-2.0F, 8.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.5F, true);
	}

//	@Override
//	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
//		//previously the render function, render code was moved to a method below
//	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		
//      float f = (float)(i >> 16 & 255) / 255.0F;
//      float f1 = (float)(i >> 8 & 255) / 255.0F;
//      float f2 = (float)(i & 255) / 255.0F;
		
		float fred = (float)( this.MainColor >> 16 & 255) / 255.0F;
		float fgreen = (float)(this.MainColor >> 8 & 255) / 255.0F;
		float fblue = (float)(this.MainColor & 255) / 255.0F;
		this.Body1.copyFrom(this.body);
		Body1.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
		this.Body2.copyFrom(this.body);
		Body2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLeg2.copyFrom(this.rightLeg);
		RightLeg2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeg2.copyFrom(this.leftLeg);
		LeftLeg2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.FourthColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.FourthColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.FourthColor & 255) / 255.0F;
        this.RightLeg1.copyFrom(this.rightLeg);
		RightLeg1.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeg1.copyFrom(this.leftLeg);
		LeftLeg1.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GrayColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GrayColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GrayColor & 255) / 255.0F;
		this.RightLeg3.copyFrom(this.rightLeg);
		RightLeg3.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeg3.copyFrom(this.leftLeg);
		LeftLeg3.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
        this.RightLegglow.copyFrom(this.rightLeg);
		RightLegglow.render(matrixStack, buffer, 15728640, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegglow.copyFrom(this.leftLeg);
		LeftLegglow.render(matrixStack, buffer, 15728640, packedOverlay, fred, fgreen, fblue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
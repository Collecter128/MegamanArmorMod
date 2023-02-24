package com.collecter128.megamanarmormod.client.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;

// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class legendsarmor_legs extends BipedModel {
	private final ModelRenderer Body;
	private final ModelRenderer Bodygray;
	private final ModelRenderer RightLeggray;
	private final ModelRenderer RightLeg2;
	private final ModelRenderer RightLegglow;
	private final ModelRenderer LeftLeggray;
	private final ModelRenderer LeftLeg2;
	private final ModelRenderer LeftLegglow;
	
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

	public legendsarmor_legs(float modelSize) {
		super(modelSize);
		texWidth = 79;
		texHeight = 188;
		
		MainColorDefault = 3173117;//Main Body Color Blue
		SecondaryColorDefault = 6736383;// Tiel
		ThirdColorDefault = 15693594; // Orange
		WhiteColorDefault = 16777215;// White
		GlowyColorDefault = 13449015;// Red
		GrayColorDefault = 10000825;// ???
		FourthColorDefault = 10000825;// Grayish Blue
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
		FourthColor = FourthColorDefault;

		Body = new ModelRenderer(this);
		Body.setPos(0.0F, 0.0F, 0.0F);
		Body.texOffs(50, 71).addBox(-4.0F, 9.0F, -2.0F, 8.0F, 4.0F, 4.0F, 1.01F, false);

		Bodygray = new ModelRenderer(this);
		Bodygray.setPos(0.0F, 0.0F, 0.0F);
		Bodygray.texOffs(16, 89).addBox(-4.0F, 10.0F, -2.0F, 8.0F, 3.0F, 4.0F, 0.51F, false);

		RightLeggray = new ModelRenderer(this);
		RightLeggray.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeggray, 0.192F, 0.0F, 0.0349F);
		RightLeggray.texOffs(0, 87).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		RightLeg2 = new ModelRenderer(this);
		RightLeg2.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeg2, 0.192F, 0.0F, 0.0349F);
		RightLeg2.texOffs(0, 162).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.7F, false);

		RightLegglow = new ModelRenderer(this);
		RightLegglow.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegglow, 0.192F, 0.0F, 0.0349F);
		RightLegglow.texOffs(57, 88).addBox(-0.9994F, 7.2251F, -1.025F, 2.0F, 5.0F, 2.0F, 0.5F, false);

		LeftLeggray = new ModelRenderer(this);
		LeftLeggray.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeggray, -0.1745F, 0.0F, -0.0349F);
		LeftLeggray.texOffs(40, 87).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		LeftLeg2 = new ModelRenderer(this);
		LeftLeg2.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeg2, -0.1745F, 0.0F, -0.0349F);
		LeftLeg2.texOffs(0, 162).addBox(-1.9F, 0.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.7F, false);

		LeftLegglow = new ModelRenderer(this);
		LeftLegglow.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegglow, -0.1745F, 0.0F, -0.0349F);
		LeftLegglow.texOffs(65, 88).addBox(-0.9994F, 6.792F, -1.0212F, 2.0F, 5.0F, 2.0F, 0.5F, true);
	}

//	@Override
//	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
//		//previously the render function, render code was moved to a method below
//	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		
		float fred = (float)( this.MainColor >> 16 & 255) / 255.0F;
        float fgreen = (float)(this.MainColor >> 8 & 255) / 255.0F;
        float fblue = (float)(this.MainColor & 255) / 255.0F;
		this.Body.copyFrom(this.body);
		Body.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GrayColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GrayColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GrayColor & 255) / 255.0F;
		this.Bodygray.copyFrom(this.body);
		Bodygray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLeggray.copyFrom(this.rightLeg);
		RightLeggray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeggray.copyFrom(this.leftLeg);
		LeftLeggray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.FourthColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.FourthColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.FourthColor & 255) / 255.0F;
		this.RightLeg2.copyFrom(this.rightLeg);
		RightLeg2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeg2.copyFrom(this.leftLeg);
		LeftLeg2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
		this.RightLegglow.copyFrom(this.rightLeg);
		RightLegglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegglow.copyFrom(this.leftLeg);
		LeftLegglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
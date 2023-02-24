package com.collecter128.megamanarmormod.client.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class firstarmor_legs extends BipedModel {
	private final ModelRenderer Bodywhite;
	private final ModelRenderer Bodygray;
	private final ModelRenderer RightLegteal;
	private final ModelRenderer RightLegsilver;
	private final ModelRenderer RightLegglowy;
	private final ModelRenderer LeftLegteal;
	private final ModelRenderer LeftLegsilver;
	private final ModelRenderer LeftLegglow;
	
	public int MainColor;
	public int SecondaryColor;
	public int WhiteColor;
	public int ThirdColor;
	public int GlowyColor;
	public int GrayColor;
	public int MainColorDefault;
	public int SecondaryColorDefault;
	public int WhiteColorDefault;
	public int ThirdColorDefault;
	public int GlowyColorDefault;
	public int GrayColorDefault;

	public firstarmor_legs(float modelSize) {
		super(modelSize);
		texWidth = 96;
		texHeight = 159;
		
		MainColorDefault = 2781423;//Main Body Color X Blue
		SecondaryColorDefault = 5752303;//Secondary Cyan tiel color
		ThirdColorDefault = 16642337; //Yellow Bits
		WhiteColorDefault = 16777215;//Basic White
		GlowyColorDefault = 16468504;//Glow?Red crystal thingy
		GrayColorDefault = 16777215;//Basic White
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;

		Bodywhite = new ModelRenderer(this);
		Bodywhite.setPos(0.0F, 0.0F, 0.0F);
		Bodywhite.texOffs(34, 96).addBox(-4.0F, 10.0F, -2.0F, 8.0F, 4.0F, 4.0F, 1.01F, false);
		Bodywhite.texOffs(16, 81).addBox(-4.0F, 10.0F, -2.0F, 8.0F, 3.0F, 4.0F, 1.3F, false);

		Bodygray = new ModelRenderer(this);
		Bodygray.setPos(0.0F, 0.0F, 0.0F);
		Bodygray.texOffs(16, 86).addBox(-4.0F, 10.0F, -2.0F, 8.0F, 4.0F, 4.0F, 1.01F, false);
		Bodygray.texOffs(34, 104).addBox(-4.0F, 10.0F, -2.0F, 8.0F, 3.0F, 4.0F, 0.51F, false);

		RightLegteal = new ModelRenderer(this);
		RightLegteal.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegteal, 0.192F, 0.0F, 0.0349F);
		RightLegteal.texOffs(18, 94).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		RightLegsilver = new ModelRenderer(this);
		RightLegsilver.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegsilver, 0.192F, 0.0F, 0.0349F);
		RightLegsilver.texOffs(18, 110).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		RightLegglowy = new ModelRenderer(this);
		RightLegglowy.setPos(-2.9F, 12.0F, 1.0F);
		setRotationAngle(RightLegglowy, 0.192F, 0.0F, 0.0349F);
		RightLegglowy.texOffs(35, 116).addBox(0.0F, 0.0F, -2.0F, 2.0F, 12.0F, 2.0F, 0.5F, false);

		LeftLegteal = new ModelRenderer(this);
		LeftLegteal.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegteal, -0.1745F, 0.0F, -0.0349F);
		LeftLegteal.texOffs(58, 94).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		LeftLegsilver = new ModelRenderer(this);
		LeftLegsilver.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegsilver, -0.1745F, 0.0F, -0.0349F);
		LeftLegsilver.texOffs(58, 110).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		LeftLegglow = new ModelRenderer(this);
		LeftLegglow.setPos(0.9F, 12.0F, 1.0F);
		setRotationAngle(LeftLegglow, -0.1745F, 0.0F, -0.0349F);
		LeftLegglow.texOffs(45, 116).addBox(0.0F, 6.0F, -2.0F, 2.0F, 6.0F, 2.0F, 0.5F, true);
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
		this.RightLegteal.copyFrom(this.rightLeg);
		RightLegteal.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegteal.copyFrom(this.leftLeg);
		LeftLegteal.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.WhiteColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.WhiteColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.WhiteColor & 255) / 255.0F;
		this.Bodywhite.copyFrom(this.body);
		Bodywhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GrayColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GrayColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GrayColor & 255) / 255.0F;
		this.Bodygray.copyFrom(this.body);
		Bodygray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegsilver.copyFrom(this.rightLeg);
		RightLegsilver.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegsilver.copyFrom(this.leftLeg);
		LeftLegsilver.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
		this.RightLegglowy.copyFrom(this.rightLeg);
		RightLegglowy.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegglow.copyFrom(this.leftLeg);
		LeftLegglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
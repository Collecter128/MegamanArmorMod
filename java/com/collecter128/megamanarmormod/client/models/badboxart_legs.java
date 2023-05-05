package com.collecter128.megamanarmormod.client.models;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class badboxart_legs extends BipedModel {
	private final ModelRenderer Bodyblue;
	private final ModelRenderer Bodyyellow;
	private final ModelRenderer RightLeglightblue;
	private final ModelRenderer RightLegyellow;
	private final ModelRenderer LeftLeglightblue;
	private final ModelRenderer LeftLegyellow;
	
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

	public badboxart_legs(float modelSize) {
		super(modelSize);
		texWidth = 81;
		texHeight = 146;
		
		MainColorDefault = 342773;//Main Body Coloor
		SecondaryColorDefault = 379125;//Secondary
		ThirdColorDefault = 15714847; //wierd yellow
		WhiteColorDefault = 15395563;//
		GlowyColorDefault = 15714847;// yellow
		GrayColorDefault = 11516613;//
		FourthColorDefault = 7249368;//Blue Glow
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
		FourthColor = FourthColorDefault;

		Bodyblue = new ModelRenderer(this);
		Bodyblue.setPos(0.0F, 0.0F, 0.0F);
		Bodyblue.texOffs(16, 78).addBox(-4.0F, 8.0F, -2.0F, 8.0F, 4.0F, 4.0F, 0.81F, false);
		Bodyblue.texOffs(16, 105).addBox(-4.0F, 8.0F, -2.0F, 8.0F, 2.0F, 4.0F, 1.21F, false);
		Bodyblue.texOffs(16, 88).addBox(-4.0F, 9.0F, -2.0F, 8.0F, 3.0F, 4.0F, 0.51F, false);

		Bodyyellow = new ModelRenderer(this);
		Bodyyellow.setPos(0.0F, 0.0F, 0.0F);
		Bodyyellow.texOffs(16, 117).addBox(-4.0F, 8.0F, -2.0F, 8.0F, 2.0F, 4.0F, 1.21F, false);
		Bodyyellow.texOffs(16, 68).addBox(-4.0F, 8.0F, -2.0F, 8.0F, 4.0F, 4.0F, 1.01F, false);

		RightLeglightblue = new ModelRenderer(this);
		RightLeglightblue.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeglightblue, 0.192F, 0.0F, 0.0349F);
		RightLeglightblue.texOffs(0, 87).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		RightLegyellow = new ModelRenderer(this);
		RightLegyellow.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegyellow, 0.192F, 0.0F, 0.0349F);
		RightLegyellow.texOffs(0, 103).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		LeftLeglightblue = new ModelRenderer(this);
		LeftLeglightblue.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeglightblue, -0.1745F, 0.0F, -0.0349F);
		LeftLeglightblue.texOffs(40, 87).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		LeftLegyellow = new ModelRenderer(this);
		LeftLegyellow.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegyellow, -0.1745F, 0.0F, -0.0349F);
		LeftLegyellow.texOffs(40, 103).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		
	}

//	@Override
//	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
//		//previously the render function, render code was moved to a method below
//	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		
		float fred = (float)( this.MainColor >> 16 & 255) / 255.0F;
        float fgreen = (float)(this.MainColor >> 8 & 255) / 255.0F;
        float fblue = (float)(this.MainColor & 255) / 255.0F;
		this.Bodyblue.copyFrom(this.body);
		Bodyblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
		this.RightLeglightblue.copyFrom(this.rightLeg);
		RightLeglightblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeglightblue.copyFrom(this.leftLeg);
		LeftLeglightblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.ThirdColor & 255) / 255.0F;
		this.Bodyyellow.copyFrom(this.body);
		Bodyyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegyellow.copyFrom(this.rightLeg);
		RightLegyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegyellow.copyFrom(this.leftLeg);
		LeftLegyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
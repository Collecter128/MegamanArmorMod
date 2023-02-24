package com.collecter128.megamanarmormod.client.models;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class protomanexe_leggings extends BipedModel {
	private final ModelRenderer Bodydarkgray;
	private final ModelRenderer Bodypurple;
	private final ModelRenderer RightLegdarkgray;
	private final ModelRenderer RightLegpurple;
	private final ModelRenderer LeftLegdarkgray;
	private final ModelRenderer LeftLegpurple;
	
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

	public protomanexe_leggings(float modelSize) {
		super(modelSize);
		texWidth = 86;
		texHeight = 166;
		
		MainColorDefault = 14352384;//Darkish red
		SecondaryColorDefault =  4275532;//dark gray
		ThirdColorDefault = 16631836; //gold yellow
		WhiteColorDefault = 16777215;//white
		GlowyColorDefault = 16631836;//yellow also
		GrayColorDefault = 16777215;//white
		FourthColorDefault= 9068229;//purple
		//??? 8612052 purple
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
		FourthColor = FourthColorDefault;

		Bodydarkgray = new ModelRenderer(this);
		Bodydarkgray.setPos(0.0F, 0.0F, 0.0F);
		Bodydarkgray.texOffs(46, 119).addBox(-4.0F, 9.0F, -2.0F, 8.0F, 3.0F, 4.0F, 0.51F, false);

		Bodypurple = new ModelRenderer(this);
		Bodypurple.setPos(0.0F, 0.0F, 0.0F);
		Bodypurple.texOffs(46, 129).addBox(-4.0F, 9.0F, -2.0F, 8.0F, 3.0F, 4.0F, 0.51F, false);

		RightLegdarkgray = new ModelRenderer(this);
		RightLegdarkgray.setPos(-2.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegdarkgray, 0.192F, 0.0F, 0.0349F);
		RightLegdarkgray.texOffs(30, 118).addBox(-1.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		RightLegpurple = new ModelRenderer(this);
		RightLegpurple.setPos(-2.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegpurple, 0.192F, 0.0F, 0.0349F);
		RightLegpurple.texOffs(52, 136).addBox(-1.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		LeftLegdarkgray = new ModelRenderer(this);
		LeftLegdarkgray.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegdarkgray, -0.1745F, 0.0F, -0.0349F);
		LeftLegdarkgray.texOffs(70, 118).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		LeftLegpurple = new ModelRenderer(this);
		LeftLegpurple.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegpurple, -0.1745F, 0.0F, -0.0349F);
		LeftLegpurple.texOffs(70, 136).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
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
		this.Bodydarkgray.copyFrom(this.body);
		Bodydarkgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegdarkgray.copyFrom(this.rightLeg);
		RightLegdarkgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegdarkgray.copyFrom(this.leftLeg);
		LeftLegdarkgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.FourthColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.FourthColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.FourthColor & 255) / 255.0F;
		this.Bodypurple.copyFrom(this.body);
		Bodypurple.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegpurple.copyFrom(this.rightLeg);
		RightLegpurple.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegpurple.copyFrom(this.leftLeg);
		LeftLegpurple.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
package com.collecter128.megamanarmormod.client.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class DrWilyCoatEvilColor extends BipedModel {
	private final ModelRenderer Body;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer BottomCoat_r1;
	private final ModelRenderer Collar_r1;
	private final ModelRenderer Body2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer BottomCoatinner_r1;
	private final ModelRenderer Collar_r2;
	private final ModelRenderer Body3;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;
	
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

	public DrWilyCoatEvilColor(float modelSize) {
		super(modelSize);
		texWidth = 64;
		texHeight = 65;
		
		MainColorDefault = 16385505;//Main Body Color pinkypurpley Labcoat lining
		SecondaryColorDefault = 9900006;//Secondary Purple Color Evil Tie
		ThirdColorDefault = 16777215;
		WhiteColorDefault = 16777215;
		GlowyColorDefault = 5769606;//Glow? Darkness!
		GrayColorDefault = 16777215;//Labcoat color
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;

		Body = new ModelRenderer(this);
		Body.setPos(0.0F, 0.0F, 0.0F);
		Body.texOffs(16, 13).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 1.01F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0F, 0.0F, 0.0F);
		Body.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.3491F, 1.0472F, 0.0F);
		cube_r1.texOffs(45, 3).addBox(2.9F, -6.3F, 3.2F, -6.0F, 4.0F, 1.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(0.0F, 0.0F, 0.0F);
		Body.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.3491F, -1.0472F, 0.0F);
		cube_r2.texOffs(34, 3).addBox(2.9F, -6.3F, 3.2F, -6.0F, 4.0F, 1.0F, 0.0F, false);

		BottomCoat_r1 = new ModelRenderer(this);
		BottomCoat_r1.setPos(1.0F, 15.0F, 3.0F);
		Body.addChild(BottomCoat_r1);
		setRotationAngle(BottomCoat_r1, 0.48F, 0.0F, 0.0F);
		BottomCoat_r1.texOffs(40, 37).addBox(-5.0F, -6.0F, -1.0F, 8.0F, 6.0F, 4.0F, 1.0F, false);

		Collar_r1 = new ModelRenderer(this);
		Collar_r1.setPos(0.5F, -2.5F, 3.5F);
		Body.addChild(Collar_r1);
		setRotationAngle(Collar_r1, -0.6981F, 0.0F, 0.0F);
		Collar_r1.texOffs(0, 1).addBox(-4.5F, -2.5F, -0.5F, 8.0F, 5.0F, 1.0F, 0.0F, false);

		Body2 = new ModelRenderer(this);
		Body2.setPos(0.0F, 0.0F, 0.0F);
		Body2.texOffs(16, 37).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.76F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(0.0F, 0.0F, 0.0F);
		Body2.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.3491F, 1.0472F, 0.0F);
		cube_r3.texOffs(59, 8).addBox(2.9F, -6.3F, 3.2F, -6.0F, 4.0F, 1.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setPos(0.0F, 0.0F, 0.0F);
		Body2.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.3491F, -1.0472F, 0.0F);
		cube_r4.texOffs(60, 1).addBox(2.9F, -6.3F, 3.2F, -6.0F, 4.0F, 1.0F, 0.0F, false);

		BottomCoatinner_r1 = new ModelRenderer(this);
		BottomCoatinner_r1.setPos(1.0F, 15.0F, 3.0F);
		Body2.addChild(BottomCoatinner_r1);
		setRotationAngle(BottomCoatinner_r1, 0.48F, 0.0F, 0.0F);
		BottomCoatinner_r1.texOffs(40, 50).addBox(-5.0F, -6.0F, -1.0F, 8.0F, 6.0F, 4.0F, 0.75F, false);

		Collar_r2 = new ModelRenderer(this);
		Collar_r2.setPos(0.5F, -2.5F, 3.5F);
		Body2.addChild(Collar_r2);
		setRotationAngle(Collar_r2, -0.6981F, 0.0F, 0.0F);
		Collar_r2.texOffs(2, 56).addBox(-4.5F, -2.5F, -0.5F, 8.0F, 5.0F, 1.0F, 0.0F, false);

		Body3 = new ModelRenderer(this);
		Body3.setPos(0.0F, 0.0F, 0.0F);
		Body3.texOffs(2, 42).addBox(-4.5F, -1.0F, -3.5F, 7.0F, 8.0F, 0.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArm, -0.1745F, 0.0F, 0.0F);
		RightArm.texOffs(40, 13).addBox(-3.0F, -2.241F, -2.0F, 4.0F, 4.0F, 4.0F, 0.72F, true);
		RightArm.texOffs(0, 21).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArm, 0.2094F, 0.0F, 0.0F);
		LeftArm.texOffs(40, 21).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArm.texOffs(40, 13).addBox(-1.0F, -2.241F, -2.0F, 4.0F, 4.0F, 4.0F, 0.72F, true);
	}

//	@Override
//	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
//		//previously the render function, render code was moved to a method below
//	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		
		
		float fred = (float)( this.WhiteColor >> 16 & 255) / 255.0F;
        float fgreen = (float)(this.WhiteColor >> 8 & 255) / 255.0F;
        float fblue = (float)(this.WhiteColor & 255) / 255.0F;
		this.Body.copyFrom(this.body);
		Body.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArm.copyFrom(this.rightArm);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArm.copyFrom(this.leftArm);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.MainColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.MainColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.MainColor & 255) / 255.0F;
		this.Body2.copyFrom(this.body);
		Body2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
		this.Body3.copyFrom(this.body);
		Body3.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);

	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
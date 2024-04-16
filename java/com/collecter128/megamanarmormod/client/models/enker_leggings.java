package com.collecter128.megamanarmormod.client.models;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports

@OnlyIn(Dist.CLIENT)
public class enker_leggings extends BipedModel {
	private final ModelRenderer Bodydarkgray;
	private final ModelRenderer Bodygray;
	private final ModelRenderer RightLegdarkgray;
	private final ModelRenderer RightLeggray;
	private final ModelRenderer RightLegglow;
	private final ModelRenderer LeftLegdarkgray;
	private final ModelRenderer LeftLeggray;
	private final ModelRenderer LeftLegglow;
	
	public int MainColor;
	public int SecondaryColor;
	public int WhiteColor;
	public int ThirdColor;
	public int GlowyColor;
	public int GrayColor;
	public int FourthColor;
	public int FifthColor;
	public int MainColorDefault;
	public int SecondaryColorDefault;
	public int WhiteColorDefault;
	public int ThirdColorDefault;
	public int GlowyColorDefault;
	public int GrayColorDefault;
	public int FourthColorDefault;
	public int FifthColorDefault;

	public enker_leggings(float modelSize) {
		super(modelSize);
		texWidth = 72;
		texHeight = 138;
		
		MainColorDefault = 16766991;//Main gold
		SecondaryColorDefault = 6906571;//Secondary blue
		ThirdColorDefault = 16615688; //Orange parts
		WhiteColorDefault = 16777215;//Basic White
		GlowyColorDefault = 16711680;//Glow? red
		GrayColorDefault = 8882055;//gray
		FourthColorDefault = 8882055; //gray
		FifthColorDefault = 16711680; //red
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
		FourthColor = FourthColorDefault;
		FifthColor = FifthColorDefault;

		Bodydarkgray = new ModelRenderer(this);
		Bodydarkgray.setPos(0.0F, 0.0F, 0.0F);
		Bodydarkgray.texOffs(16, 84).addBox(-4.0F, 9.0F, -2.0F, 8.0F, 3.0F, 4.0F, 0.61F, false);
		Bodydarkgray.texOffs(16, 92).addBox(-4.0F, 9.0F, -2.0F, 8.0F, 3.0F, 4.0F, 0.51F, false);

		Bodygray = new ModelRenderer(this);
		Bodygray.setPos(0.0F, 0.0F, 0.0F);
		Bodygray.texOffs(16, 99).addBox(-4.0F, 9.0F, -2.0F, 8.0F, 3.0F, 4.0F, 0.51F, false);

		RightLegdarkgray = new ModelRenderer(this);
		RightLegdarkgray.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegdarkgray, 0.192F, 0.0F, 0.0349F);
		RightLegdarkgray.texOffs(0, 90).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		RightLeggray = new ModelRenderer(this);
		RightLeggray.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeggray, 0.192F, 0.0F, 0.0349F);
		RightLeggray.texOffs(0, 106).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		RightLegglow = new ModelRenderer(this);
		RightLegglow.setPos(-2.9F, 12.0F, 1.0F);
		setRotationAngle(RightLegglow, 0.192F, 0.0F, 0.0349F);
		RightLegglow.texOffs(16, 111).addBox(0.0F, 9.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.5F, false);

		LeftLegdarkgray = new ModelRenderer(this);
		LeftLegdarkgray.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegdarkgray, -0.1745F, 0.0F, -0.0349F);
		LeftLegdarkgray.texOffs(40, 90).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		LeftLeggray = new ModelRenderer(this);
		LeftLeggray.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeggray, -0.1745F, 0.0F, -0.0349F);
		LeftLeggray.texOffs(40, 106).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		LeftLegglow = new ModelRenderer(this);
		LeftLegglow.setPos(0.9F, 12.0F, 1.0F);
		setRotationAngle(LeftLegglow, -0.1745F, 0.0F, -0.0349F);
		LeftLegglow.texOffs(27, 111).addBox(0.0F, 8.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.5F, true);
	}

//	@Override
//	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
//		//previously the render function, render code was moved to a method below
//	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		
		float fred = (float)( this.GrayColor >> 16 & 255) / 255.0F;
        float fgreen = (float)(this.GrayColor >> 8 & 255) / 255.0F;
        float fblue = (float)(this.GrayColor & 255) / 255.0F;
		this.Bodydarkgray.copyFrom(this.body);
		Bodydarkgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegdarkgray.copyFrom(this.rightLeg);
		RightLegdarkgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegdarkgray.copyFrom(this.leftLeg);
		LeftLegdarkgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		this.Bodygray.copyFrom(this.body);
		Bodygray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLeggray.copyFrom(this.rightLeg);
		RightLeggray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeggray.copyFrom(this.leftLeg);
		LeftLeggray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
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
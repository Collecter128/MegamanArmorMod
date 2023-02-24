package com.collecter128.megamanarmormod.client.models;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class newarmor_leggings extends BipedModel {
	private final ModelRenderer Bodygray;
	private final ModelRenderer Body2;
	private final ModelRenderer Bodywhite;
	private final ModelRenderer Bodygold;
	private final ModelRenderer Bodygreen;
	private final ModelRenderer RightLeggray;
	private final ModelRenderer RightLegwhite;
	private final ModelRenderer RightLegglow;
	private final ModelRenderer LeftLeggray;
	private final ModelRenderer LeftLegwhite;
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

	public newarmor_leggings(float modelSize) {
		super(modelSize);
		texWidth = 113;
		texHeight = 145;
		
		MainColorDefault = 3750036;//Main Body Color Dark Blue
		SecondaryColorDefault = 4635342;//Secondary 
		ThirdColorDefault = 16491790; //Orange parts
		WhiteColorDefault = 15921906;//Basic White
		GlowyColorDefault = 16720159;//Glow? red
		GrayColorDefault = 5855577;//Kinda dark
		//??? body middle thing 6584982
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;

		Bodygray = new ModelRenderer(this);
		Bodygray.setPos(0.0F, 0.0F, 0.0F);
		Bodygray.texOffs(62, 106).addBox(-4.0F, 9.0F, -2.0F, 8.0F, 4.0F, 4.0F, 0.61F, false);
		Bodygray.texOffs(62, 114).addBox(-4.0F, 10.0F, -2.0F, 8.0F, 3.0F, 4.0F, 0.51F, false);

		Body2 = new ModelRenderer(this);
		Body2.setPos(0.0F, 0.0F, 0.0F);
		Body2.texOffs(62, 98).addBox(-4.0F, 9.0F, -2.0F, 8.0F, 4.0F, 4.0F, 1.2F, false);

		Bodywhite = new ModelRenderer(this);
		Bodywhite.setPos(0.0F, -1.0F, 0.0F);
		Bodywhite.texOffs(62, 89).addBox(-4.0F, 8.5F, -2.0F, 8.0F, 4.0F, 4.0F, 1.4F, false);
		Bodywhite.texOffs(77, 121).addBox(-4.0F, 10.0F, -2.0F, 8.0F, 4.0F, 4.0F, 1.01F, false);
		Bodywhite.texOffs(45, 122).addBox(-4.0F, 11.0F, -2.0F, 8.0F, 3.0F, 4.0F, 0.52F, false);
		Bodywhite.texOffs(38, 135).addBox(-6.0F, 9.0F, -1.5F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		Bodywhite.texOffs(47, 135).addBox(5.0F, 9.0F, -1.5F, 1.0F, 3.0F, 3.0F, 0.0F, false);

		Bodygold = new ModelRenderer(this);
		Bodygold.setPos(0.0F, -1.0F, 0.0F);
		Bodygold.texOffs(60, 136).addBox(-1.5F, 7.5F, -3.7F, 3.0F, 3.0F, 0.0F, 0.0F, false);

		Bodygreen = new ModelRenderer(this);
		Bodygreen.setPos(0.0F, -1.0F, 0.0F);
		Bodygreen.texOffs(71, 137).addBox(-1.0F, 8.0F, -3.9F, 2.0F, 2.0F, 0.0F, 0.0F, false);

		RightLeggray = new ModelRenderer(this);
		RightLeggray.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeggray, 0.192F, 0.0F, 0.0349F);
		RightLeggray.texOffs(46, 89).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		RightLegwhite = new ModelRenderer(this);
		RightLegwhite.setPos(-2.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegwhite, 0.192F, 0.0F, 0.0349F);
		RightLegwhite.texOffs(49, 108).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 2.0F, 0.5F, false);

		RightLegglow = new ModelRenderer(this);
		RightLegglow.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegglow, 0.192F, 0.0F, 0.0349F);
		RightLegglow.texOffs(102, 90).addBox(-0.9994F, 7.2251F, -1.025F, 2.0F, 5.0F, 2.0F, 0.5F, false);

		LeftLeggray = new ModelRenderer(this);
		LeftLeggray.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeggray, -0.1745F, 0.0F, -0.0349F);
		LeftLeggray.texOffs(86, 89).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		LeftLegwhite = new ModelRenderer(this);
		LeftLegwhite.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegwhite, -0.1745F, 0.0F, -0.0349F);
		LeftLegwhite.texOffs(90, 107).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		LeftLegglow = new ModelRenderer(this);
		LeftLegglow.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegglow, -0.1745F, 0.0F, -0.0349F);
		LeftLegglow.texOffs(102, 109).addBox(-0.9994F, 6.792F, -1.0212F, 2.0F, 5.0F, 2.0F, 0.5F, true);
	}

//	@Override
//	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
//		//previously the render function, render code was moved to a method below
//	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		
		float fred = (float)( this.GrayColor >> 16 & 255) / 255.0F;
        float fgreen = (float)(this.GrayColor >> 8 & 255) / 255.0F;
        float fblue = (float)(this.GrayColor & 255) / 255.0F;
		this.Bodygray.copyFrom(this.body);
		Bodygray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLeggray.copyFrom(this.rightLeg);
		RightLeggray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeggray.copyFrom(this.leftLeg);
		LeftLeggray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
		this.Body2.copyFrom(this.body);
		Body2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.WhiteColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.WhiteColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.WhiteColor & 255) / 255.0F;
		this.Bodywhite.copyFrom(this.body);
		Bodywhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegwhite.copyFrom(this.rightLeg);
		RightLegwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegwhite.copyFrom(this.leftLeg);
		LeftLegwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.ThirdColor & 255) / 255.0F;
		this.Bodygold.copyFrom(this.body);
		Bodygold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		
		this.Bodygreen.copyFrom(this.body);
		Bodygreen.render(matrixStack, buffer, 15728640, packedOverlay);
		
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
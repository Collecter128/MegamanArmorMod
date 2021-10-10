package com.collecter128.megamanarmormod.client.models;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class vilearmor_feet extends BipedModel {
//	private final ModelRenderer Headmain;
//	private final ModelRenderer Headsilver;
//	private final ModelRenderer Headgold;
//	private final ModelRenderer Headglow;
//	private final ModelRenderer Bodymain;
//	private final ModelRenderer Bodysilver;
//	private final ModelRenderer Bodywhite;
//	private final ModelRenderer Bodygold;
//	private final ModelRenderer Bodyglow;
//	private final ModelRenderer RightArmmain;
//	private final ModelRenderer RightArmblack;
//	private final ModelRenderer RightArmsilver;
//	private final ModelRenderer RightArmwhite;
//	private final ModelRenderer RightArmgold;
//	private final ModelRenderer RightArmglow;
//	private final ModelRenderer LeftArmmain;
//	private final ModelRenderer LeftArmblack;
//	private final ModelRenderer LeftArmsilver;
//	private final ModelRenderer LeftArmwhite;
//	private final ModelRenderer LeftArmgold;
//	private final ModelRenderer LeftArmglow;
	private final ModelRenderer RightLegmain;
	private final ModelRenderer RightLegwhite;
	private final ModelRenderer RightLeggold;
	private final ModelRenderer RightLegglow;
	private final ModelRenderer LeftLegmain;
	private final ModelRenderer LeftLegwhite;
	private final ModelRenderer LeftLeggold;
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

	public vilearmor_feet(float modelSize) {
		super(modelSize);
		textureWidth = 76;
		textureHeight = 121;
		
		MainColorDefault = 8728033;//Main Body Color Purple vile
		SecondaryColorDefault = 5066061;//Secondary Color Vile Black
		WhiteColorDefault = 16777215;
		ThirdColorDefault = 16772915;
		GlowyColorDefault = 16728361;//Glow Red Bits
		GrayColorDefault = 12105912;
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;

//		Headmain = new ModelRenderer(this);
//		Headmain.setRotationPoint(0.0F, 0.0F, 0.0F);
//		setRotationAngle(Headmain, -0.1047F, 0.0873F, 0.0F);
//		Headmain.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
//
//		Headsilver = new ModelRenderer(this);
//		Headsilver.setRotationPoint(0.0F, 0.0F, 0.0F);
//		setRotationAngle(Headsilver, -0.1047F, 0.0873F, 0.0F);
//		Headsilver.setTextureOffset(33, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
//
//		Headgold = new ModelRenderer(this);
//		Headgold.setRotationPoint(0.0F, 0.0F, 0.0F);
//		setRotationAngle(Headgold, -0.1047F, 0.0873F, 0.0F);
//		Headgold.setTextureOffset(58, 98).addBox(5.4872F, -4.8355F, -1.6704F, 1.0F, 3.0F, 3.0F, 0.5F, false);
//		Headgold.setTextureOffset(44, 98).addBox(-5.8938F, -4.8393F, -1.6332F, 1.0F, 3.0F, 3.0F, 0.5F, false);
//		Headgold.setTextureOffset(45, 106).addBox(-4.0F, -4.8263F, -2.0631F, 8.0F, 3.0F, 3.0F, 0.75F, false);
//
//		Headglow = new ModelRenderer(this);
//		Headglow.setRotationPoint(0.0F, 0.0F, 0.0F);
//		setRotationAngle(Headglow, -0.1047F, 0.0873F, 0.0F);
//		Headglow.setTextureOffset(45, 112).addBox(-4.0F, -4.8263F, -2.0631F, 8.0F, 3.0F, 3.0F, 0.75F, false);
//		Headglow.setTextureOffset(25, 2).addBox(-1.5F, -8.8F, -5.0F, 3.0F, 3.0F, 1.0F, 0.1F, false);
//
//		Bodymain = new ModelRenderer(this);
//		Bodymain.setRotationPoint(0.0F, 0.0F, 0.0F);
//		Bodymain.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);
//
//		Bodysilver = new ModelRenderer(this);
//		Bodysilver.setRotationPoint(0.0F, 0.0F, 0.0F);
//		Bodysilver.setTextureOffset(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
//
//		Bodywhite = new ModelRenderer(this);
//		Bodywhite.setRotationPoint(0.0F, 0.0F, 0.0F);
//		Bodywhite.setTextureOffset(16, 48).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
//
//		Bodygold = new ModelRenderer(this);
//		Bodygold.setRotationPoint(0.0F, 0.0F, 0.0F);
//		Bodygold.setTextureOffset(16, 64).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);
//
//		Bodyglow = new ModelRenderer(this);
//		Bodyglow.setRotationPoint(0.0F, 0.0F, 0.0F);
//		Bodyglow.setTextureOffset(16, 80).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);
//
//		RightArmmain = new ModelRenderer(this);
//		RightArmmain.setRotationPoint(-5.0F, 2.0F, 0.0F);
//		setRotationAngle(RightArmmain, -0.1745F, 0.0F, 0.0F);
//		RightArmmain.setTextureOffset(40, 24).addBox(-5.0F, -3.2019F, -2.0F, 5.0F, 4.0F, 4.0F, 0.8F, false);
//		RightArmmain.setTextureOffset(40, 55).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
//
//		RightArmblack = new ModelRenderer(this);
//		RightArmblack.setRotationPoint(-5.0F, 2.0F, 0.0F);
//		setRotationAngle(RightArmblack, -0.1745F, 0.0F, 0.0F);
//		RightArmblack.setTextureOffset(40, 39).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
//
//		RightArmsilver = new ModelRenderer(this);
//		RightArmsilver.setRotationPoint(-5.0F, 2.0F, 0.0F);
//		setRotationAngle(RightArmsilver, -0.1745F, 0.0F, 0.0F);
//		RightArmsilver.setTextureOffset(40, 63).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
//
//		RightArmwhite = new ModelRenderer(this);
//		RightArmwhite.setRotationPoint(-5.0F, 2.0F, 0.0F);
//		setRotationAngle(RightArmwhite, -0.1745F, 0.0F, 0.0F);
//		RightArmwhite.setTextureOffset(40, 79).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
//
//		RightArmgold = new ModelRenderer(this);
//		RightArmgold.setRotationPoint(-5.0F, 2.0F, 0.0F);
//		setRotationAngle(RightArmgold, -0.1745F, 0.0F, 0.0F);
//		RightArmgold.setTextureOffset(40, 16).addBox(-5.0F, -3.2019F, -2.0F, 5.0F, 4.0F, 4.0F, 0.8F, false);
//
//		RightArmglow = new ModelRenderer(this);
//		RightArmglow.setRotationPoint(-5.0F, 2.0F, 0.0F);
//		setRotationAngle(RightArmglow, -0.1745F, 0.0F, 0.0F);
//		RightArmglow.setTextureOffset(40, 31).addBox(-5.0F, -3.2019F, -2.0F, 5.0F, 4.0F, 4.0F, 0.8F, false);
//
//		LeftArmmain = new ModelRenderer(this);
//		LeftArmmain.setRotationPoint(5.0F, 2.0F, 0.0F);
//		setRotationAngle(LeftArmmain, 0.2094F, 0.0F, 0.0F);
//		LeftArmmain.setTextureOffset(58, 24).addBox(-1.0F, -2.3974F, -2.0F, 5.0F, 4.0F, 4.0F, 0.8F, false);
//		LeftArmmain.setTextureOffset(58, 55).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
//
//		LeftArmblack = new ModelRenderer(this);
//		LeftArmblack.setRotationPoint(5.0F, 2.0F, 0.0F);
//		setRotationAngle(LeftArmblack, 0.2094F, 0.0F, 0.0F);
//		LeftArmblack.setTextureOffset(58, 39).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
//
//		LeftArmsilver = new ModelRenderer(this);
//		LeftArmsilver.setRotationPoint(5.0F, 2.0F, 0.0F);
//		setRotationAngle(LeftArmsilver, 0.2094F, 0.0F, 0.0F);
//		LeftArmsilver.setTextureOffset(58, 63).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
//
//		LeftArmwhite = new ModelRenderer(this);
//		LeftArmwhite.setRotationPoint(5.0F, 2.0F, 0.0F);
//		setRotationAngle(LeftArmwhite, 0.2094F, 0.0F, 0.0F);
//		LeftArmwhite.setTextureOffset(58, 79).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
//
//		LeftArmgold = new ModelRenderer(this);
//		LeftArmgold.setRotationPoint(5.0F, 2.0F, 0.0F);
//		setRotationAngle(LeftArmgold, 0.2094F, 0.0F, 0.0F);
//		LeftArmgold.setTextureOffset(58, 16).addBox(-1.0F, -2.3974F, -2.0F, 5.0F, 4.0F, 4.0F, 0.8F, false);
//
//		LeftArmglow = new ModelRenderer(this);
//		LeftArmglow.setRotationPoint(5.0F, 2.0F, 0.0F);
//		setRotationAngle(LeftArmglow, 0.2094F, 0.0F, 0.0F);
//		LeftArmglow.setTextureOffset(58, 31).addBox(-1.0F, -2.3974F, -2.0F, 5.0F, 4.0F, 4.0F, 0.8F, false);

		RightLegmain = new ModelRenderer(this);
		RightLegmain.setRotationPoint(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegmain, 0.192F, 0.0F, 0.0349F);
		RightLegmain.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);

		RightLegwhite = new ModelRenderer(this);
		RightLegwhite.setRotationPoint(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegwhite, 0.192F, 0.0F, 0.0349F);
		RightLegwhite.setTextureOffset(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);

		RightLeggold = new ModelRenderer(this);
		RightLeggold.setRotationPoint(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeggold, 0.192F, 0.0F, 0.0349F);
		RightLeggold.setTextureOffset(0, 80).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);

		RightLegglow = new ModelRenderer(this);
		RightLegglow.setRotationPoint(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegglow, 0.192F, 0.0F, 0.0349F);
		RightLegglow.setTextureOffset(68, 3).addBox(-0.8947F, 14.2F, -1.0F, 2.0F, 1.0F, 2.0F, 1.0F, false);

		LeftLegmain = new ModelRenderer(this);
		LeftLegmain.setRotationPoint(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegmain, -0.1745F, 0.0F, -0.0349F);
		LeftLegmain.setTextureOffset(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);

		LeftLegwhite = new ModelRenderer(this);
		LeftLegwhite.setRotationPoint(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegwhite, -0.1745F, 0.0F, -0.0349F);
		LeftLegwhite.setTextureOffset(0, 64).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);

		LeftLeggold = new ModelRenderer(this);
		LeftLeggold.setRotationPoint(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeggold, -0.1745F, 0.0F, -0.0349F);
		LeftLeggold.setTextureOffset(0, 96).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);

		LeftLegglow = new ModelRenderer(this);
		LeftLegglow.setRotationPoint(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegglow, -0.1745F, 0.0F, -0.0349F);
		LeftLegglow.setTextureOffset(68, 10).addBox(-1.2791F, 14.2F, -1.0F, 2.0F, 1.0F, 2.0F, 1.0F, true);
	}

//	@Override
//	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
//		//previously the render function, render code was moved to a method below
//	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		
		float fred = (float)( this.MainColor >> 16 & 255) / 255.0F;
        float fgreen = (float)(this.MainColor >> 8 & 255) / 255.0F;
        float fblue = (float)(this.MainColor & 255) / 255.0F;
//		this.Headmain.copyModelAngles(this.bipedHead);
//		Headmain.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.Bodymain.copyModelAngles(this.bipedBody);
//		Bodymain.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.RightArmmain.copyModelAngles(this.bipedRightArm);
//		RightArmmain.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.LeftArmmain.copyModelAngles(this.bipedLeftArm);
//		LeftArmmain.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegmain.copyModelAngles(this.bipedRightLeg);
		RightLegmain.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegmain.copyModelAngles(this.bipedLeftLeg);
		LeftLegmain.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
//		this.RightArmblack.copyModelAngles(this.bipedRightArm);
//		RightArmblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.LeftArmblack.copyModelAngles(this.bipedLeftArm);
//		LeftArmblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GrayColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GrayColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GrayColor & 255) / 255.0F;
//		this.Headsilver.copyModelAngles(this.bipedHead);
//		Headsilver.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.Bodysilver.copyModelAngles(this.bipedBody);
//		Bodysilver.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.RightArmsilver.copyModelAngles(this.bipedRightArm);
//		RightArmsilver.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.LeftArmsilver.copyModelAngles(this.bipedLeftArm);
//		LeftArmsilver.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.WhiteColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.WhiteColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.WhiteColor & 255) / 255.0F;
//		this.Bodywhite.copyModelAngles(this.bipedBody);
//		Bodywhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.RightArmwhite.copyModelAngles(this.bipedRightArm);
//		RightArmwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.LeftArmwhite.copyModelAngles(this.bipedLeftArm);
//		LeftArmwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegwhite.copyModelAngles(this.bipedRightLeg);
		RightLegwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegwhite.copyModelAngles(this.bipedLeftLeg);
		LeftLegwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.ThirdColor & 255) / 255.0F;
//		this.Headgold.copyModelAngles(this.bipedHead);
//		Headgold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.Bodygold.copyModelAngles(this.bipedBody);
//		Bodygold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.RightArmgold.copyModelAngles(this.bipedRightArm);
//		RightArmgold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.LeftArmgold.copyModelAngles(this.bipedLeftArm);
//		LeftArmgold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLeggold.copyModelAngles(this.bipedRightLeg);
		RightLeggold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeggold.copyModelAngles(this.bipedLeftLeg);
		LeftLeggold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
//		this.Headglow.copyModelAngles(this.bipedHead);
//		Headglow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.Bodyglow.copyModelAngles(this.bipedBody);
//		Bodyglow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.RightArmglow.copyModelAngles(this.bipedRightArm);
//		RightArmglow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.LeftArmglow.copyModelAngles(this.bipedLeftArm);
//		LeftArmglow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegglow.copyModelAngles(this.bipedRightLeg);
		RightLegglow.render(matrixStack, buffer, 15728640, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegglow.copyModelAngles(this.bipedLeftLeg);
		LeftLegglow.render(matrixStack, buffer, 15728640, packedOverlay, fred, fgreen, fblue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
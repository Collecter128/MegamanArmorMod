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


public class xarmor_feetcolor extends BipedModel {
//	private final ModelRenderer Head;
//	private final ModelRenderer Head2;
//	private final ModelRenderer Head3;
//	private final ModelRenderer Headglow;
//	private final ModelRenderer Body;
//	private final ModelRenderer Body2;
//	private final ModelRenderer Body3;
//	private final ModelRenderer Body4;
//	private final ModelRenderer RightArm;
//	private final ModelRenderer RightArm2;
//	private final ModelRenderer RightArm3;
//	private final ModelRenderer RightArm4;
//	private final ModelRenderer LeftArm;
//	private final ModelRenderer LeftArm2;
//	private final ModelRenderer LeftArm3;
//	private final ModelRenderer LeftArm4;
	private final ModelRenderer RightLeg;
	private final ModelRenderer RightLegglow;
	private final ModelRenderer LeftLeg;
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

	public xarmor_feetcolor(float modelSize) {
		super(modelSize);
		textureWidth = 72;
		textureHeight = 114;
		
		MainColorDefault = 2781423;//Main Body Color X Blue
		SecondaryColorDefault = 5752303;//Secondary Cyan tiel color
		ThirdColorDefault = 16777215;
		WhiteColorDefault = 16777215;//Basic White
		GlowyColorDefault = 16468504;//Glow?Red crystal thingy
		GrayColorDefault = 16777215;//Basic White
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;

//		Head = new ModelRenderer(this);
//		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
//		setRotationAngle(Head, -0.1047F, 0.0873F, 0.0F);
//		Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
//
//		Head2 = new ModelRenderer(this);
//		Head2.setRotationPoint(0.0F, 0.0F, 0.0F);
//		setRotationAngle(Head2, -0.1047F, 0.0873F, 0.0F);
//		Head2.setTextureOffset(0, 66).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
//		Head2.setTextureOffset(44, 80).addBox(-1.0872F, -9.9562F, -4.4855F, 2.0F, 5.0F, 10.0F, 0.4F, false);
//
//		Head3 = new ModelRenderer(this);
//		Head3.setRotationPoint(0.0F, 0.0F, 0.0F);
//		setRotationAngle(Head3, -0.1047F, 0.0873F, 0.0F);
//		Head3.setTextureOffset(3, 60).addBox(5.4F, -5.9341F, -0.7842F, 1.0F, 3.0F, 3.0F, 0.5F, false);
//		Head3.setTextureOffset(3, 53).addBox(-5.981F, -5.938F, -0.747F, 1.0F, 3.0F, 3.0F, 0.5F, false);
//		Head3.setTextureOffset(32, 0).addBox(-3.6706F, -7.6327F, -3.8533F, 8.0F, 7.0F, 8.0F, 0.55F, false);
//
//		Headglow = new ModelRenderer(this);
//		Headglow.setRotationPoint(0.0F, 0.0F, 0.0F);
//		setRotationAngle(Headglow, -0.1047F, 0.0873F, 0.0F);
//		Headglow.setTextureOffset(40, 96).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
//		Headglow.setTextureOffset(4, 49).addBox(-1.0F, -8.8411F, -5.6852F, 2.0F, 2.0F, 1.0F, 0.1F, false);
//
//		Body = new ModelRenderer(this);
//		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
//		Body.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);
//
//		Body2 = new ModelRenderer(this);
//		Body2.setRotationPoint(0.0F, 0.0F, 0.0F);
//		Body2.setTextureOffset(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
//
//		Body3 = new ModelRenderer(this);
//		Body3.setRotationPoint(0.0F, 0.0F, 0.0F);
//		Body3.setTextureOffset(16, 48).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
//
//		Body4 = new ModelRenderer(this);
//		Body4.setRotationPoint(0.0F, 0.0F, 0.0F);
//		Body4.setTextureOffset(0, 98).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);
//
//		RightArm = new ModelRenderer(this);
//		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
//		setRotationAngle(RightArm, -0.1745F, 0.0F, 0.0F);
//		RightArm.setTextureOffset(40, 16).addBox(-4.0F, -3.2019F, -2.0F, 4.0F, 4.0F, 4.0F, 0.8F, false);
//		RightArm.setTextureOffset(40, 40).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
//
//		RightArm2 = new ModelRenderer(this);
//		RightArm2.setRotationPoint(-5.0F, 2.0F, 0.0F);
//		setRotationAngle(RightArm2, -0.1745F, 0.0F, 0.0F);
//		RightArm2.setTextureOffset(40, 24).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
//
//		RightArm3 = new ModelRenderer(this);
//		RightArm3.setRotationPoint(-5.0F, 2.0F, 0.0F);
//		setRotationAngle(RightArm3, -0.1745F, 0.0F, 0.0F);
//		RightArm3.setTextureOffset(40, 48).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
//
//		RightArm4 = new ModelRenderer(this);
//		RightArm4.setRotationPoint(-5.0F, 2.0F, 0.0F);
//		setRotationAngle(RightArm4, -0.1745F, 0.0F, 0.0F);
//		RightArm4.setTextureOffset(40, 64).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
//
//		LeftArm = new ModelRenderer(this);
//		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
//		setRotationAngle(LeftArm, 0.2094F, 0.0F, 0.0F);
//		LeftArm.setTextureOffset(56, 16).addBox(0.0F, -2.3974F, -2.0F, 4.0F, 4.0F, 4.0F, 0.8F, false);
//		LeftArm.setTextureOffset(56, 40).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
//
//		LeftArm2 = new ModelRenderer(this);
//		LeftArm2.setRotationPoint(5.0F, 2.0F, 0.0F);
//		setRotationAngle(LeftArm2, 0.2094F, 0.0F, 0.0F);
//		LeftArm2.setTextureOffset(56, 24).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
//
//		LeftArm3 = new ModelRenderer(this);
//		LeftArm3.setRotationPoint(5.0F, 2.0F, 0.0F);
//		setRotationAngle(LeftArm3, 0.2094F, 0.0F, 0.0F);
//		LeftArm3.setTextureOffset(56, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
//
//		LeftArm4 = new ModelRenderer(this);
//		LeftArm4.setRotationPoint(5.0F, 2.0F, 0.0F);
//		setRotationAngle(LeftArm4, 0.2094F, 0.0F, 0.0F);
//		LeftArm4.setTextureOffset(56, 64).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeg, 0.192F, 0.0F, 0.0349F);
		RightLeg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);

		RightLegglow = new ModelRenderer(this);
		RightLegglow.setRotationPoint(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegglow, 0.192F, 0.0F, 0.0349F);
		RightLegglow.setTextureOffset(27, 103).addBox(-0.8947F, 14.2F, -1.0F, 2.0F, 1.0F, 2.0F, 1.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeg, -0.1745F, 0.0F, -0.0349F);
		LeftLeg.setTextureOffset(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);

		LeftLegglow = new ModelRenderer(this);
		LeftLegglow.setRotationPoint(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegglow, -0.1745F, 0.0F, -0.0349F);
		LeftLegglow.setTextureOffset(27, 110).addBox(-1.2791F, 14.2F, -1.0F, 2.0F, 1.0F, 2.0F, 1.0F, true);
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
//		this.Head.copyModelAngles(this.bipedHead);
//		Head.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.Body.copyModelAngles(this.bipedBody);
//		Body.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.RightArm.copyModelAngles(this.bipedRightArm);
//		RightArm.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.LeftArm.copyModelAngles(this.bipedLeftArm);
//		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLeg.copyModelAngles(this.bipedRightLeg);
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeg.copyModelAngles(this.bipedLeftLeg);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		
//		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
//        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
//        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
//		this.Head2.copyModelAngles(this.bipedHead);
//		Head2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.Body2.copyModelAngles(this.bipedBody);
//		Body2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.RightArm2.copyModelAngles(this.bipedRightArm);
//		RightArm2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.LeftArm2.copyModelAngles(this.bipedLeftArm);
//		LeftArm2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		
//		this.Body4.copyModelAngles(this.bipedBody);
//		Body4.render(matrixStack, buffer, packedLight, packedOverlay);
		
		
//		fred = (float)( this.GrayColor >> 16 & 255) / 255.0F;
//        fgreen = (float)(this.GrayColor >> 8 & 255) / 255.0F;
//        fblue = (float)(this.GrayColor & 255) / 255.0F;
//		this.Head3.copyModelAngles(this.bipedHead);
//		Head3.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.Body3.copyModelAngles(this.bipedBody);
//		Body3.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.RightArm4.copyModelAngles(this.bipedRightArm);
//		RightArm4.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.LeftArm4.copyModelAngles(this.bipedLeftArm);
//		LeftArm4.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		
//		fred = (float)( this.WhiteColor >> 16 & 255) / 255.0F;
//        fgreen = (float)(this.WhiteColor >> 8 & 255) / 255.0F;
//        fblue = (float)(this.WhiteColor & 255) / 255.0F;
//		this.RightArm3.copyModelAngles(this.bipedRightArm);
//		RightArm3.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.LeftArm3.copyModelAngles(this.bipedLeftArm);
//		LeftArm3.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
//		this.Headglow.copyModelAngles(this.bipedHead);
//		Headglow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegglow.copyModelAngles(this.bipedRightLeg);
		//15728640
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
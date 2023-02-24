package com.collecter128.megamanarmormod.client.models;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class zeroarmor extends BipedModel {
	private final ModelRenderer Head;
	private final ModelRenderer Headwhite;
	private final ModelRenderer Headsilver;
	private final ModelRenderer cube_r1;
	private final ModelRenderer Headgold;
	private final ModelRenderer cube_r2;
	private final ModelRenderer Headglow;
//	private final ModelRenderer Body;
//	private final ModelRenderer Bodygold;
//	private final ModelRenderer Bodyglow;
//	private final ModelRenderer Bodygray;
//	private final ModelRenderer RightArm;
//	private final ModelRenderer RightArmwhite;
//	private final ModelRenderer RightArmgray;
//	private final ModelRenderer LeftArm;
//	private final ModelRenderer LeftArmwhite;
//	private final ModelRenderer LeftArmgray;
//	private final ModelRenderer RightLeg;
//	private final ModelRenderer RightLegwhite;
//	private final ModelRenderer RightLegyellow;
//	private final ModelRenderer RightLegglow;
//	private final ModelRenderer LeftLeg;
//	private final ModelRenderer LeftLegwhite;
//	private final ModelRenderer LeftLegyellow;
//	private final ModelRenderer LeftLegglow;
	
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

	public zeroarmor(float modelSize) {
		super(modelSize);
		texWidth = 93;
		texHeight = 164;
		
		MainColorDefault = 16711680;//Main Body Color Zero Red
		SecondaryColorDefault = 5752303;//Secondary Cyan tiel color
		ThirdColorDefault = 16763151; // Hair
		WhiteColorDefault = 16777215;//Basic White
		GlowyColorDefault = 2448340;//Glow? 
		GrayColorDefault = 16777215;//Basic White
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;

		Head = new ModelRenderer(this);
		Head.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Head, -0.1047F, 0.0873F, 0.0F);
		Head.texOffs(0, 4).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Head.texOffs(32, 0).addBox(-3.6706F, -12.6327F, -3.8533F, 8.0F, 12.0F, 8.0F, 1.55F, false);

		Headwhite = new ModelRenderer(this);
		Headwhite.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headwhite, -0.1047F, 0.0873F, 0.0F);
		Headwhite.texOffs(0, 116).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headwhite.texOffs(54, 71).addBox(5.0643F, -4.9396F, -1.6797F, 1.0F, 3.0F, 3.0F, 0.5F, false);
		Headwhite.texOffs(41, 71).addBox(-5.8938F, -4.8393F, -1.6332F, 1.0F, 3.0F, 3.0F, 0.5F, false);
		Headwhite.texOffs(32, 112).addBox(-3.6706F, -12.6327F, -3.8533F, 8.0F, 12.0F, 8.0F, 1.55F, false);

		Headsilver = new ModelRenderer(this);
		Headsilver.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headsilver, -0.1047F, 0.0873F, 0.0F);
		Headsilver.texOffs(61, 4).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.75F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0F, -2.0F, 5.0F);
		Headsilver.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.3491F, 0.0F, 0.0F);
		cube_r1.texOffs(66, 69).addBox(-1.0F, -0.9517F, -0.1853F, 2.0F, 2.0F, 5.0F, 0.0F, false);

		Headgold = new ModelRenderer(this);
		Headgold.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headgold, -0.1047F, 0.0873F, 0.0F);
		

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(0.0F, 0.0F, 10.0F);
		Headgold.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.3927F, 0.0F, 0.0F);
		cube_r2.texOffs(41, 53).addBox(-3.0F, -1.1637F, -3.4193F, 6.0F, 12.0F, 6.0F, 0.0F, false);

		Headglow = new ModelRenderer(this);
		Headglow.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headglow, -0.1047F, 0.0873F, 0.0F);
		Headglow.texOffs(55, 147).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headglow.texOffs(55, 131).addBox(-3.6706F, -7.6327F, -3.8533F, 8.0F, 7.0F, 8.0F, 1.57F, false);

//		Body = new ModelRenderer(this);
//		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
//		Body.setTextureOffset(16, 20).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.86F, false);
//
//		Bodygold = new ModelRenderer(this);
//		Bodygold.setRotationPoint(0.0F, 0.0F, 0.0F);
//		Bodygold.setTextureOffset(16, 52).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.86F, false);
//
//		Bodyglow = new ModelRenderer(this);
//		Bodyglow.setRotationPoint(0.0F, 0.0F, 0.0F);
//		Bodyglow.setTextureOffset(16, 36).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.86F, false);
//
//		Bodygray = new ModelRenderer(this);
//		Bodygray.setRotationPoint(0.0F, 0.0F, 0.0F);
//		Bodygray.setTextureOffset(16, 84).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
//
//		RightArm = new ModelRenderer(this);
//		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
//		setRotationAngle(RightArm, -0.1745F, 0.0F, 0.0F);
//		RightArm.setTextureOffset(75, 28).addBox(-5.0F, -3.3755F, -1.5566F, 5.0F, 4.0F, 4.0F, 1.0F, false);
//		RightArm.setTextureOffset(75, 20).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
//
//		RightArmwhite = new ModelRenderer(this);
//		RightArmwhite.setRotationPoint(-5.0F, 2.0F, 0.0F);
//		setRotationAngle(RightArmwhite, -0.1745F, 0.0F, 0.0F);
//		RightArmwhite.setTextureOffset(75, 36).addBox(-5.0F, -3.3755F, -1.5566F, 5.0F, 4.0F, 4.0F, 1.0F, false);
//		RightArmwhite.setTextureOffset(40, 36).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
//		RightArmwhite.setTextureOffset(75, 109).addBox(-3.0F, 8.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.77F, false);
//
//		RightArmgray = new ModelRenderer(this);
//		RightArmgray.setRotationPoint(-5.0F, 2.0F, 0.0F);
//		setRotationAngle(RightArmgray, -0.1745F, 0.0F, 0.0F);
//		RightArmgray.setTextureOffset(40, 20).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
//
//		LeftArm = new ModelRenderer(this);
//		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
//		setRotationAngle(LeftArm, 0.2094F, 0.0F, 0.0F);
//		LeftArm.setTextureOffset(75, 52).addBox(0.0F, -3.3755F, -1.5566F, 5.0F, 4.0F, 4.0F, 1.0F, false);
//		LeftArm.setTextureOffset(75, 44).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
//
//		LeftArmwhite = new ModelRenderer(this);
//		LeftArmwhite.setRotationPoint(5.0F, 2.0F, 0.0F);
//		setRotationAngle(LeftArmwhite, 0.2094F, 0.0F, 0.0F);
//		LeftArmwhite.setTextureOffset(75, 60).addBox(0.0F, -3.3755F, -1.5566F, 5.0F, 4.0F, 4.0F, 1.0F, false);
//		LeftArmwhite.setTextureOffset(59, 36).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
//		LeftArmwhite.setTextureOffset(75, 118).addBox(-1.0F, 8.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.77F, false);
//
//		LeftArmgray = new ModelRenderer(this);
//		LeftArmgray.setRotationPoint(5.0F, 2.0F, 0.0F);
//		setRotationAngle(LeftArmgray, 0.2094F, 0.0F, 0.0F);
//		LeftArmgray.setTextureOffset(59, 20).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
//
//		RightLeg = new ModelRenderer(this);
//		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
//		setRotationAngle(RightLeg, 0.192F, 0.0F, 0.0349F);
//		RightLeg.setTextureOffset(0, 20).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
//
//		RightLegwhite = new ModelRenderer(this);
//		RightLegwhite.setRotationPoint(-1.9F, 12.0F, 0.0F);
//		setRotationAngle(RightLegwhite, 0.192F, 0.0F, 0.0349F);
//		RightLegwhite.setTextureOffset(0, 84).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
//
//		RightLegyellow = new ModelRenderer(this);
//		RightLegyellow.setRotationPoint(-1.9F, 12.0F, 0.0F);
//		setRotationAngle(RightLegyellow, 0.192F, 0.0F, 0.0349F);
//		RightLegyellow.setTextureOffset(0, 52).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
//
//		RightLegglow = new ModelRenderer(this);
//		RightLegglow.setRotationPoint(-1.9F, 12.0F, 0.0F);
//		setRotationAngle(RightLegglow, 0.192F, 0.0F, 0.0349F);
//		RightLegglow.setTextureOffset(59, 90).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
//
//		LeftLeg = new ModelRenderer(this);
//		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
//		setRotationAngle(LeftLeg, -0.1745F, 0.0F, -0.0349F);
//		LeftLeg.setTextureOffset(0, 36).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
//
//		LeftLegwhite = new ModelRenderer(this);
//		LeftLegwhite.setRotationPoint(1.9F, 12.0F, 0.0F);
//		setRotationAngle(LeftLegwhite, -0.1745F, 0.0F, -0.0349F);
//		LeftLegwhite.setTextureOffset(0, 100).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
//
//		LeftLegyellow = new ModelRenderer(this);
//		LeftLegyellow.setRotationPoint(1.9F, 12.0F, 0.0F);
//		setRotationAngle(LeftLegyellow, -0.1745F, 0.0F, -0.0349F);
//		LeftLegyellow.setTextureOffset(0, 68).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
//
//		LeftLegglow = new ModelRenderer(this);
//		LeftLegglow.setRotationPoint(1.9F, 12.0F, 0.0F);
//		setRotationAngle(LeftLegglow, -0.1745F, 0.0F, -0.0349F);
//		LeftLegglow.setTextureOffset(77, 90).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
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
		this.Head.copyFrom(this.head);
		Head.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.Body.copyModelAngles(this.bipedBody);
//		Body.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.RightArm.copyModelAngles(this.bipedRightArm);
//		RightArm.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.LeftArm.copyModelAngles(this.bipedLeftArm);
//		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.RightLeg.copyModelAngles(this.bipedRightLeg);
//		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.LeftLeg.copyModelAngles(this.bipedLeftLeg);
//		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.WhiteColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.WhiteColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.WhiteColor & 255) / 255.0F;
		this.Headwhite.copyFrom(this.head);
		Headwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GrayColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GrayColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GrayColor & 255) / 255.0F;
//		this.RightArmwhite.copyModelAngles(this.bipedRightArm);
//		RightArmwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.LeftArmwhite.copyModelAngles(this.bipedLeftArm);
//		LeftArmwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.RightLegwhite.copyModelAngles(this.bipedRightLeg);
//		RightLegwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.LeftLegwhite.copyModelAngles(this.bipedLeftLeg);
//		LeftLegwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GrayColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GrayColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GrayColor & 255) / 255.0F;
		this.Headsilver.copyFrom(this.head);
		Headsilver.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.Bodygray.copyModelAngles(this.bipedBody);
//		Bodygray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.RightArmgray.copyModelAngles(this.bipedRightArm);
//		RightArmgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.LeftArmgray.copyModelAngles(this.bipedLeftArm);
//		LeftArmgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);

		fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.ThirdColor & 255) / 255.0F;
		this.Headgold.copyFrom(this.head);
		Headgold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.Bodygold.copyModelAngles(this.bipedBody);
//		Bodygold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.RightLegyellow.copyModelAngles(this.bipedRightLeg);
//		RightLegyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.LeftLegyellow.copyModelAngles(this.bipedLeftLeg);
//		LeftLegyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
		this.Headglow.copyFrom(this.head);
		Headglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
//		this.Bodyglow.copyModelAngles(this.bipedBody);
//		Bodyglow.render(matrixStack, buffer, 15728640, packedOverlay, fred, fgreen, fblue, alpha);
//		this.RightLegglow.copyModelAngles(this.bipedRightLeg);
//		RightLegglow.render(matrixStack, buffer, 15728640, packedOverlay, fred, fgreen, fblue, alpha);
//		this.LeftLegglow.copyModelAngles(this.bipedLeftLeg);
//		LeftLegglow.render(matrixStack, buffer, 15728640, packedOverlay, fred, fgreen, fblue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
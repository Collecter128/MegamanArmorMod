package com.collecter128.megamanarmormod.client.models;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

@OnlyIn(Dist.CLIENT)
public class zerochest extends BipedModel {
//	private final ModelRenderer Head;
//	private final ModelRenderer Headwhite;
//	private final ModelRenderer Headsilver;
//	private final ModelRenderer cube_r1;
//	private final ModelRenderer Headgold;
//	private final ModelRenderer cube_r2;
//	private final ModelRenderer Headglow;
	private final ModelRenderer Body;
	private final ModelRenderer Bodygold;
	private final ModelRenderer Bodyglow;
	private final ModelRenderer Bodygray;
	private final ModelRenderer RightArm;
	private final ModelRenderer RightArmwhite;
	private final ModelRenderer RightArmgray;
	private final ModelRenderer LeftArm;
	private final ModelRenderer LeftArmwhite;
	private final ModelRenderer LeftArmgray;
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

	public zerochest(float modelSize) {
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

//		Head = new ModelRenderer(this);
//		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
//		setRotationAngle(Head, -0.1047F, 0.0873F, 0.0F);
//		Head.setTextureOffset(0, 4).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
//		Head.setTextureOffset(32, 0).addBox(-3.6706F, -12.6327F, -3.8533F, 8.0F, 12.0F, 8.0F, 1.55F, false);
//
//		Headwhite = new ModelRenderer(this);
//		Headwhite.setRotationPoint(0.0F, 0.0F, 0.0F);
//		setRotationAngle(Headwhite, -0.1047F, 0.0873F, 0.0F);
//		Headwhite.setTextureOffset(0, 116).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
//		Headwhite.setTextureOffset(54, 71).addBox(5.0643F, -4.9396F, -0.6797F, 1.0F, 3.0F, 3.0F, 0.5F, false);
//		Headwhite.setTextureOffset(41, 71).addBox(-5.8938F, -4.8393F, -1.6332F, 1.0F, 3.0F, 3.0F, 0.5F, false);
//		Headwhite.setTextureOffset(32, 112).addBox(-3.6706F, -12.6327F, -3.8533F, 8.0F, 12.0F, 8.0F, 1.55F, false);
//
//		Headsilver = new ModelRenderer(this);
//		Headsilver.setRotationPoint(0.0F, 0.0F, 0.0F);
//		setRotationAngle(Headsilver, -0.1047F, 0.0873F, 0.0F);
//		Headsilver.setTextureOffset(61, 4).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.75F, false);
//
//		cube_r1 = new ModelRenderer(this);
//		cube_r1.setRotationPoint(0.0F, -2.0F, 5.0F);
//		Headsilver.addChild(cube_r1);
//		setRotationAngle(cube_r1, -0.3491F, 0.0F, 0.0F);
//		cube_r1.setTextureOffset(66, 69).addBox(-1.0F, -0.9517F, -0.1853F, 2.0F, 2.0F, 5.0F, 0.0F, false);
//
//		Headgold = new ModelRenderer(this);
//		Headgold.setRotationPoint(0.0F, 0.0F, 0.0F);
//		setRotationAngle(Headgold, -0.1047F, 0.0873F, 0.0F);
//		
//
//		cube_r2 = new ModelRenderer(this);
//		cube_r2.setRotationPoint(0.0F, 0.0F, 10.0F);
//		Headgold.addChild(cube_r2);
//		setRotationAngle(cube_r2, 0.3927F, 0.0F, 0.0F);
//		cube_r2.setTextureOffset(41, 53).addBox(-3.0F, -1.1637F, -3.4193F, 6.0F, 12.0F, 6.0F, 0.0F, false);
//
//		Headglow = new ModelRenderer(this);
//		Headglow.setRotationPoint(0.0F, 0.0F, 0.0F);
//		setRotationAngle(Headglow, -0.1047F, 0.0873F, 0.0F);
//		Headglow.setTextureOffset(55, 147).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
//		Headglow.setTextureOffset(55, 131).addBox(-3.6706F, -7.6327F, -3.8533F, 8.0F, 7.0F, 8.0F, 1.55F, false);

		Body = new ModelRenderer(this);
		Body.setPos(0.0F, 0.0F, 0.0F);
		Body.texOffs(16, 20).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.86F, false);

		Bodygold = new ModelRenderer(this);
		Bodygold.setPos(0.0F, 0.0F, 0.0F);
		Bodygold.texOffs(16, 52).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.86F, false);

		Bodyglow = new ModelRenderer(this);
		Bodyglow.setPos(0.0F, 0.0F, 0.0F);
		Bodyglow.texOffs(16, 36).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.86F, false);

		Bodygray = new ModelRenderer(this);
		Bodygray.setPos(0.0F, 0.0F, 0.0F);
		Bodygray.texOffs(16, 84).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArm, -0.1745F, 0.0F, 0.0F);
		RightArm.texOffs(75, 28).addBox(-5.0F, -3.3755F, -1.5566F, 5.0F, 4.0F, 4.0F, 1.0F, false);
		RightArm.texOffs(75, 20).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);

		RightArmwhite = new ModelRenderer(this);
		RightArmwhite.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmwhite, -0.1745F, 0.0F, 0.0F);
		RightArmwhite.texOffs(75, 36).addBox(-5.0F, -3.3755F, -1.5566F, 5.0F, 4.0F, 4.0F, 1.0F, false);
		RightArmwhite.texOffs(40, 36).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		RightArmwhite.texOffs(75, 109).addBox(-3.0F, 8.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.77F, false);

		RightArmgray = new ModelRenderer(this);
		RightArmgray.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmgray, -0.1745F, 0.0F, 0.0F);
		RightArmgray.texOffs(40, 20).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArm, 0.2094F, 0.0F, 0.0F);
		LeftArm.texOffs(75, 52).addBox(0.0F, -3.3755F, -1.5566F, 5.0F, 4.0F, 4.0F, 1.0F, false);
		LeftArm.texOffs(75, 44).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);

		LeftArmwhite = new ModelRenderer(this);
		LeftArmwhite.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmwhite, 0.2094F, 0.0F, 0.0F);
		LeftArmwhite.texOffs(75, 60).addBox(0.0F, -3.3755F, -1.5566F, 5.0F, 4.0F, 4.0F, 1.0F, false);
		LeftArmwhite.texOffs(59, 36).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArmwhite.texOffs(75, 118).addBox(-1.0F, 8.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.77F, false);

		LeftArmgray = new ModelRenderer(this);
		LeftArmgray.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgray, 0.2094F, 0.0F, 0.0F);
		LeftArmgray.texOffs(59, 20).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

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
//		this.Head.copyModelAngles(this.bipedHead);
//		Head.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Body.copyFrom(this.body);
		Body.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArm.copyFrom(this.rightArm);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArm.copyFrom(this.leftArm);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.RightLeg.copyModelAngles(this.bipedRightLeg);
//		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.LeftLeg.copyModelAngles(this.bipedLeftLeg);
//		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.WhiteColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.WhiteColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.WhiteColor & 255) / 255.0F;
//		this.Headwhite.copyModelAngles(this.bipedHead);
//		Headwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmwhite.copyFrom(this.rightArm);
		RightArmwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmwhite.copyFrom(this.leftArm);
		LeftArmwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GrayColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GrayColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GrayColor & 255) / 255.0F;
//		this.RightLegwhite.copyModelAngles(this.bipedRightLeg);
//		RightLegwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.LeftLegwhite.copyModelAngles(this.bipedLeftLeg);
//		LeftLegwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GrayColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GrayColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GrayColor & 255) / 255.0F;
//		this.Headsilver.copyModelAngles(this.bipedHead);
//		Headsilver.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodygray.copyFrom(this.body);
		Bodygray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmgray.copyFrom(this.rightArm);
		RightArmgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmgray.copyFrom(this.leftArm);
		LeftArmgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);

		fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.ThirdColor & 255) / 255.0F;
//		this.Headgold.copyModelAngles(this.bipedHead);
//		Headgold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodygold.copyFrom(this.body);
		Bodygold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.RightLegyellow.copyModelAngles(this.bipedRightLeg);
//		RightLegyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.LeftLegyellow.copyModelAngles(this.bipedLeftLeg);
//		LeftLegyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
//		this.Headglow.copyModelAngles(this.bipedHead);
//		Headglow.render(matrixStack, buffer, 15728640, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodyglow.copyFrom(this.body);
		Bodyglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
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
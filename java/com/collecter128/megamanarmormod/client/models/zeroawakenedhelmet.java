package com.collecter128.megamanarmormod.client.models;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports

//Model by Galen X from the discord

@OnlyIn(Dist.CLIENT)
public class zeroawakenedhelmet extends BipedModel {
	private final ModelRenderer Head;
	private final ModelRenderer Headwhite;
	private final ModelRenderer Headsilver;
	private final ModelRenderer cube_r1;
	private final ModelRenderer Headgold;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
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

	public zeroawakenedhelmet(float modelSize) {
		super(modelSize);
		texWidth = 98;
		texHeight = 179;
		
		MainColorDefault = 16711680;//Main Body Color Zero Red
		SecondaryColorDefault = 2171169;//Secondary Black
		ThirdColorDefault = 16763151; // Hair
		WhiteColorDefault = 16777215;//Basic White
		GlowyColorDefault = 2448340;//Glow? 
		GrayColorDefault = 16777215;//Basic White
		//FourthColorDefault = ???; //
		FifthColorDefault = 2935135; //green
		
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
		//FourthColor = FourthColorDefault;
		FifthColor = FifthColorDefault;

		Head = new ModelRenderer(this);
		Head.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Head, -0.1047F, 0.0873F, 0.0F);
		Head.texOffs(0, 4).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Head.texOffs(32, 0).addBox(-3.6706F, -12.6327F, -3.8533F, 8.0F, 12.0F, 8.0F, 1.55F, false);

		Headwhite = new ModelRenderer(this);
		Headwhite.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headwhite, -0.1047F, 0.0873F, 0.0F);
		Headwhite.texOffs(0, 116).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headwhite.texOffs(54, 71).addBox(5.0643F, -4.9396F, -0.6797F, 1.0F, 3.0F, 3.0F, 0.5F, false);
		Headwhite.texOffs(41, 71).addBox(-5.8938F, -4.8393F, -1.6332F, 1.0F, 3.0F, 3.0F, 0.5F, false);
		Headwhite.texOffs(32, 112).addBox(-3.6706F, -12.6327F, -3.8533F, 8.0F, 12.0F, 8.0F, 1.55F, false);

		Headsilver = new ModelRenderer(this);
		Headsilver.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headsilver, -0.1047F, 0.0873F, 0.0F);
		Headsilver.texOffs(61, 4).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.75F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0F, -1.0F, 5.0F);
		Headsilver.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.6545F, 0.0F, 0.0F);
		cube_r1.texOffs(66, 69).addBox(-1.0F, -0.9517F, -0.1853F, 2.0F, 2.0F, 5.0F, 0.0F, false);

		Headgold = new ModelRenderer(this);
		Headgold.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headgold, 0.1135F, 0.0873F, 0.0F);
		

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(0.0F, -2.0F, 10.0F);
		Headgold.addChild(cube_r2);
		setRotationAngle(cube_r2, 1.3526F, 0.0F, 0.0F);
		cube_r2.texOffs(41, 53).addBox(-3.0F, -1.1637F, -3.4193F, 6.0F, 12.0F, 6.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(-1.0F, -1.0F, 10.0F);
		Headgold.addChild(cube_r3);
		setRotationAngle(cube_r3, 1.0036F, -0.3927F, 1.5708F);
		cube_r3.texOffs(41, 53).addBox(-3.0F, -1.1637F, -3.4193F, 6.0F, 12.0F, 6.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setPos(2.0F, -1.0F, 10.0F);
		Headgold.addChild(cube_r4);
		setRotationAngle(cube_r4, 1.9635F, -0.3927F, 1.5708F);
		cube_r4.texOffs(41, 53).addBox(-3.0F, -1.1637F, -3.4193F, 6.0F, 12.0F, 6.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setPos(0.0F, -2.0F, 10.0F);
		Headgold.addChild(cube_r5);
		setRotationAngle(cube_r5, 2.3562F, 0.0F, 0.0F);
		cube_r5.texOffs(41, 53).addBox(-3.0F, -1.1637F, -3.4193F, 6.0F, 12.0F, 6.0F, 0.0F, false);

		Headglow = new ModelRenderer(this);
		Headglow.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headglow, -0.1047F, 0.0873F, 0.0F);
		Headglow.texOffs(55, 147).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headglow.texOffs(55, 131).addBox(-3.6706F, -7.6327F, -3.8533F, 8.0F, 7.0F, 8.0F, 1.55F, false);

//		Body = new ModelRenderer(this);
//		Body.setPos(0.0F, 0.0F, 0.0F);
//		Body.texOffs(16, 20).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.86F, false);
//
//		Bodygold = new ModelRenderer(this);
//		Bodygold.setPos(0.0F, 0.0F, 0.0F);
//		Bodygold.texOffs(16, 52).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.86F, false);
//
//		Bodyglow = new ModelRenderer(this);
//		Bodyglow.setPos(0.0F, 0.0F, 0.0F);
//		Bodyglow.texOffs(16, 36).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.86F, false);
//
//		Bodygray = new ModelRenderer(this);
//		Bodygray.setPos(0.0F, 0.0F, 0.0F);
//		Bodygray.texOffs(16, 84).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
//
//		RightArm = new ModelRenderer(this);
//		RightArm.setPos(-5.0F, 2.0F, 0.0F);
//		setRotationAngle(RightArm, -0.1745F, 0.0F, 0.0F);
//		RightArm.texOffs(75, 28).addBox(-5.0F, -3.3755F, -1.5566F, 5.0F, 4.0F, 4.0F, 1.0F, false);
//		RightArm.texOffs(75, 20).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
//
//		RightArmwhite = new ModelRenderer(this);
//		RightArmwhite.setPos(-5.0F, 2.0F, 0.0F);
//		setRotationAngle(RightArmwhite, -0.1745F, 0.0F, 0.0F);
//		RightArmwhite.texOffs(75, 36).addBox(-5.0F, -3.3755F, -1.5566F, 5.0F, 4.0F, 4.0F, 1.0F, false);
//		RightArmwhite.texOffs(40, 36).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
//		RightArmwhite.texOffs(75, 109).addBox(-3.0F, 8.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.77F, false);
//
//		RightArmgray = new ModelRenderer(this);
//		RightArmgray.setPos(-5.0F, 2.0F, 0.0F);
//		setRotationAngle(RightArmgray, -0.1745F, 0.0F, 0.0F);
//		RightArmgray.texOffs(40, 20).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
//
//		LeftArm = new ModelRenderer(this);
//		LeftArm.setPos(5.0F, 2.0F, 0.0F);
//		setRotationAngle(LeftArm, 0.2094F, 0.0F, 0.0F);
//		LeftArm.texOffs(75, 52).addBox(0.0F, -3.3755F, -1.5566F, 5.0F, 4.0F, 4.0F, 1.0F, false);
//		LeftArm.texOffs(75, 44).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
//
//		LeftArmwhite = new ModelRenderer(this);
//		LeftArmwhite.setPos(5.0F, 2.0F, 0.0F);
//		setRotationAngle(LeftArmwhite, 0.2094F, 0.0F, 0.0F);
//		LeftArmwhite.texOffs(75, 60).addBox(0.0F, -3.3755F, -1.5566F, 5.0F, 4.0F, 4.0F, 1.0F, false);
//		LeftArmwhite.texOffs(59, 36).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
//		LeftArmwhite.texOffs(75, 118).addBox(-1.0F, 8.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.77F, false);
//
//		LeftArmgray = new ModelRenderer(this);
//		LeftArmgray.setPos(5.0F, 2.0F, 0.0F);
//		setRotationAngle(LeftArmgray, 0.2094F, 0.0F, 0.0F);
//		LeftArmgray.texOffs(59, 20).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
//
//		RightLeg = new ModelRenderer(this);
//		RightLeg.setPos(-1.9F, 12.0F, 0.0F);
//		setRotationAngle(RightLeg, 0.192F, 0.0F, 0.0349F);
//		RightLeg.texOffs(0, 20).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
//
//		RightLegwhite = new ModelRenderer(this);
//		RightLegwhite.setPos(-1.9F, 12.0F, 0.0F);
//		setRotationAngle(RightLegwhite, 0.192F, 0.0F, 0.0349F);
//		RightLegwhite.texOffs(0, 84).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
//
//		RightLegyellow = new ModelRenderer(this);
//		RightLegyellow.setPos(-1.9F, 12.0F, 0.0F);
//		setRotationAngle(RightLegyellow, 0.192F, 0.0F, 0.0349F);
//		RightLegyellow.texOffs(0, 52).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
//
//		RightLegglow = new ModelRenderer(this);
//		RightLegglow.setPos(-1.9F, 12.0F, 0.0F);
//		setRotationAngle(RightLegglow, 0.192F, 0.0F, 0.0349F);
//		RightLegglow.texOffs(59, 90).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
//
//		LeftLeg = new ModelRenderer(this);
//		LeftLeg.setPos(1.9F, 12.0F, 0.0F);
//		setRotationAngle(LeftLeg, -0.1745F, 0.0F, -0.0349F);
//		LeftLeg.texOffs(0, 36).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
//
//		LeftLegwhite = new ModelRenderer(this);
//		LeftLegwhite.setPos(1.9F, 12.0F, 0.0F);
//		setRotationAngle(LeftLegwhite, -0.1745F, 0.0F, -0.0349F);
//		LeftLegwhite.texOffs(0, 100).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
//
//		LeftLegyellow = new ModelRenderer(this);
//		LeftLegyellow.setPos(1.9F, 12.0F, 0.0F);
//		setRotationAngle(LeftLegyellow, -0.1745F, 0.0F, -0.0349F);
//		LeftLegyellow.texOffs(0, 68).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
//
//		LeftLegglow = new ModelRenderer(this);
//		LeftLegglow.setPos(1.9F, 12.0F, 0.0F);
//		setRotationAngle(LeftLegglow, -0.1745F, 0.0F, -0.0349F);
//		LeftLegglow.texOffs(77, 90).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
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
		this.Head.copyFrom(this.head);
		Head.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.WhiteColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.WhiteColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.WhiteColor & 255) / 255.0F;
		this.Headwhite.copyFrom(this.head);
		Headwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GrayColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GrayColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GrayColor & 255) / 255.0F;
		this.Headsilver.copyFrom(this.head);
		Headsilver.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.ThirdColor & 255) / 255.0F;
		this.Headgold.copyFrom(this.head);
		Headgold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
		this.Headglow.copyFrom(this.head);
		Headglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		
		
//		Body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
//		Bodygold.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
//		Bodyglow.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
//		Bodygray.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
//		RightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
//		RightArmwhite.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
//		RightArmgray.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
//		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
//		LeftArmwhite.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
//		LeftArmgray.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
//		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
//		RightLegwhite.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
//		RightLegyellow.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
//		RightLegglow.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
//		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
//		LeftLegwhite.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
//		LeftLegyellow.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
//		LeftLegglow.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
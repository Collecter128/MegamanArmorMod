package com.collecter128.megamanarmormod.client.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.inventory.EquipmentSlotType;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class quintarmor_chestplate extends BipedModel {
//	private final ModelRenderer Head1;
//	private final ModelRenderer HeadOrange;
//	private final ModelRenderer Headlightgray;
//	private final ModelRenderer Headglow;
//	private final ModelRenderer Headglow_r1;
//	private final ModelRenderer Headglow_r2;
//	private final ModelRenderer HeadYellow;
//	private final ModelRenderer Headvisor;
	private final ModelRenderer Body2;
	private final ModelRenderer Bodygray;
	private final ModelRenderer Bodygreenv;
	private final ModelRenderer RightArm;
	private final ModelRenderer RightArm2;
	private final ModelRenderer RightArmorange;
	private final ModelRenderer LeftArm;
	private final ModelRenderer LeftArm2;
	private final ModelRenderer LeftArmorange;
//	private final ModelRenderer RightLeg1;
//	private final ModelRenderer RightLegglow;
//	private final ModelRenderer LeftLeg1;
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

	public quintarmor_chestplate(float modelSize) {
		super(modelSize);
		texWidth = 76;
		texHeight = 148;
		
		MainColorDefault = 3709250;//Main Body Color quint green
		SecondaryColorDefault = 10413478;//Secondary quintlight green
		ThirdColorDefault = 16755768; //Orange parts
		WhiteColorDefault = 16777215;//Basic White
		GlowyColorDefault = 16764984;//Glow? yellow color
		GrayColorDefault = 12105912;//Kinda Blue
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;

//		Head1 = new ModelRenderer(this);
//		Head1.setRotationPoint(0.0F, 0.0F, 0.0F);
//		Head1.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
//		
//		HeadOrange = new ModelRenderer(this);
//		HeadOrange.setRotationPoint(0.0F, 0.0F, 0.0F);
//		HeadOrange.setTextureOffset(0, 64).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
//
//		Headlightgray = new ModelRenderer(this);
//		Headlightgray.setRotationPoint(0.0F, 0.0F, 0.0F);
//		Headlightgray.setTextureOffset(32, 1).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 7.0F, 8.0F, 0.75F, false);
//		Headlightgray.setTextureOffset(38, 67).addBox(5.0643F, -3.9451F, -0.5752F, 1.0F, 3.0F, 3.0F, 0.5F, false);
//		Headlightgray.setTextureOffset(38, 74).addBox(-5.8938F, -3.8448F, -0.5287F, 1.0F, 3.0F, 3.0F, 0.5F, false);
//
//		Headglow = new ModelRenderer(this);
//		Headglow.setRotationPoint(0.0F, 0.0F, 0.0F);
//		
//
//		Headglow_r1 = new ModelRenderer(this);
//		Headglow_r1.setRotationPoint(10.0F, 23.0F, 3.0F);
//		Headglow.addChild(Headglow_r1);
//		setRotationAngle(Headglow_r1, 0.0F, 1.5708F, 0.0F);
//		Headglow_r1.setTextureOffset(50, 65).addBox(0.0F, -27.0F, -3.6F, 4.0F, 3.0F, 1.0F, -0.3F, false);
//
//		Headglow_r2 = new ModelRenderer(this);
//		Headglow_r2.setRotationPoint(-11.0F, 23.0F, -1.0F);
//		Headglow.addChild(Headglow_r2);
//		setRotationAngle(Headglow_r2, 0.0F, -1.5708F, 0.0F);
//		Headglow_r2.setTextureOffset(50, 65).addBox(0.0F, -27.0F, -4.7F, 4.0F, 3.0F, 1.0F, -0.3F, false);
//
//		HeadYellow = new ModelRenderer(this);
//		HeadYellow.setRotationPoint(0.0F, 0.0F, 0.0F);
//		HeadYellow.setTextureOffset(57, 1).addBox(-4.5F, -11.4829F, -5.54F, 9.0F, 7.0F, 0.0F, 0.25F, false);
//
//		Headvisor = new ModelRenderer(this);
//		Headvisor.setRotationPoint(0.0F, 0.0F, 0.0F);
//		Headvisor.setTextureOffset(54, 75).addBox(-4.0F, -6.5F, -4.5F, 8.0F, 4.0F, 1.0F, 0.25F, false);

		Body2 = new ModelRenderer(this);
		Body2.setPos(0.0F, 0.0F, 0.0F);
		Body2.texOffs(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);

		Bodygray = new ModelRenderer(this);
		Bodygray.setPos(0.0F, 0.0F, 0.0F);
		Bodygray.texOffs(20, 49).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.31F, false);

		Bodygreenv = new ModelRenderer(this);
		Bodygreenv.setPos(0.0F, 0.0F, 0.0F);
		Bodygreenv.texOffs(16, 16).addBox(-4.5F, -0.4F, -2.5F, 9.0F, 11.0F, 5.0F, 0.4F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArm, 0.1309F, 0.0F, 0.0F);
		RightArm.texOffs(44, 40).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		RightArm.texOffs(44, 56).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);

		RightArm2 = new ModelRenderer(this);
		RightArm2.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArm2, 0.1309F, 0.0F, 0.0F);
		RightArm2.texOffs(60, 40).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		RightArmorange = new ModelRenderer(this);
		RightArmorange.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmorange, 0.1309F, 0.0F, 0.0F);
		RightArmorange.texOffs(0, 54).addBox(-3.0F, 7.622F, -2.2611F, 4.0F, 2.0F, 4.0F, 0.77F, false);
		RightArmorange.texOffs(60, 55).addBox(-3.0F, 1.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.53F, false);
		RightArmorange.texOffs(1, 82).addBox(-3.5F, 5.6391F, -2.5F, 5.0F, 2.0F, 5.0F, 0.5F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArm, -0.1309F, 0.0F, 0.0F);
		LeftArm.texOffs(44, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArm.texOffs(44, 32).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);

		LeftArm2 = new ModelRenderer(this);
		LeftArm2.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArm2, -0.1309F, 0.0F, 0.0F);
		LeftArm2.texOffs(60, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		LeftArmorange = new ModelRenderer(this);
		LeftArmorange.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmorange, -0.1309F, 0.0F, 0.0F);
		LeftArmorange.texOffs(1, 82).addBox(-1.5F, 5.6391F, -2.5F, 5.0F, 2.0F, 5.0F, 0.5F, false);
		LeftArmorange.texOffs(60, 55).addBox(-1.0F, 1.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.53F, false);
		LeftArmorange.texOffs(0, 48).addBox(-1.0F, 5.6391F, -2.0F, 4.0F, 2.0F, 4.0F, 0.77F, false);

//		RightLeg1 = new ModelRenderer(this);
//		RightLeg1.setRotationPoint(-1.9F, 12.0F, 0.0F);
//		setRotationAngle(RightLeg1, 0.192F, 0.0F, 0.0349F);
//		RightLeg1.setTextureOffset(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
//
//		RightLegglow = new ModelRenderer(this);
//		RightLegglow.setRotationPoint(-1.9F, 12.0F, -1.9632F);
//		setRotationAngle(RightLegglow, 0.192F, 0.0F, 0.0349F);
//		RightLegglow.setTextureOffset(21, 89).addBox(-0.9645F, 8.181F, 0.7475F, 2.0F, 4.0F, 2.0F, 1.0F, false);
//
//		LeftLeg1 = new ModelRenderer(this);
//		LeftLeg1.setRotationPoint(1.9F, 12.0F, 0.0F);
//		setRotationAngle(LeftLeg1, -0.1745F, 0.0F, -0.0349F);
//		LeftLeg1.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
//
//		LeftLegglow = new ModelRenderer(this);
//		LeftLegglow.setRotationPoint(1.9F, 12.0F, 0.0F);
//		setRotationAngle(LeftLegglow, -0.1745F, 0.0F, -0.0349F);
//		LeftLegglow.setTextureOffset(33, 89).addBox(-0.9994F, 7.992F, -1.0212F, 2.0F, 4.0F, 2.0F, 1.0F, true);
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
//		this.Head1.copyModelAngles(this.bipedHead);
//		Head1.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArm.copyFrom(this.rightArm);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArm.copyFrom(this.leftArm);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.RightLeg1.copyModelAngles(this.bipedRightLeg);
//		RightLeg1.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.LeftLeg1.copyModelAngles(this.bipedLeftLeg);
//		LeftLeg1.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		this.Bodygreenv.copyFrom(this.body);
		Bodygreenv.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
		this.Body2.copyFrom(this.body);
		Body2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArm2.copyFrom(this.rightArm);
		RightArm2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArm2.copyFrom(this.leftArm);
		LeftArm2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.ThirdColor & 255) / 255.0F;
//		this.HeadOrange.copyModelAngles(this.bipedHead);
//		HeadOrange.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmorange.copyFrom(this.rightArm);
		RightArmorange.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmorange.copyFrom(this.leftArm);
		LeftArmorange.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GrayColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GrayColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GrayColor & 255) / 255.0F;
//		this.Headlightgray.copyModelAngles(this.bipedHead);
//		Headlightgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodygray.copyFrom(this.body);
		Bodygray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
//		this.Headglow.copyModelAngles(this.bipedHead);
//		Headglow.render(matrixStack, buffer, 15728640, packedOverlay, fred, fgreen, fblue, alpha);
//		this.RightLegglow.copyModelAngles(this.bipedRightLeg);
//		RightLegglow.render(matrixStack, buffer, 15728640, packedOverlay, fred, fgreen, fblue, alpha);
//		this.LeftLegglow.copyModelAngles(this.bipedLeftLeg);
//		LeftLegglow.render(matrixStack, buffer, 15728640, packedOverlay, fred, fgreen, fblue, alpha);
		
//		this.HeadYellow.copyModelAngles(this.bipedHead);
//		HeadYellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		
//		
//		this.Headvisor.copyModelAngles(this.bipedHead);
//		Headvisor.render(matrixStack, buffer, 15728640, packedOverlay);
		
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
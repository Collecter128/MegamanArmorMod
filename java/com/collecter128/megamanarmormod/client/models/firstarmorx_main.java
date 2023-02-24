package com.collecter128.megamanarmormod.client.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class firstarmorx_main extends BipedModel {
	private final ModelRenderer Headblue;
	private final ModelRenderer Headwhite;
	private final ModelRenderer Headsilver;
	private final ModelRenderer Headyellow;
	private final ModelRenderer Headred;
//	private final ModelRenderer Bodysecondary;
//	private final ModelRenderer Bodymain;
//	private final ModelRenderer Bodyyellow;
//	private final ModelRenderer Body3;
//	private final ModelRenderer RightArmblue;
//	private final ModelRenderer RightArmteal;
//	private final ModelRenderer RightArmwhite;
//	private final ModelRenderer RightArmwhite2;
//	private final ModelRenderer LeftArmblue;
//	private final ModelRenderer LeftArmteal;
//	private final ModelRenderer LeftArmwhite;
//	private final ModelRenderer LeftArmgray;
//	private final ModelRenderer RightLegblue;
//	private final ModelRenderer RightLegwhite;
//	private final ModelRenderer RightLegyellow;
//	private final ModelRenderer LeftLegwhite;
//	private final ModelRenderer LeftLegblue;
//	private final ModelRenderer LeftLeggold;
	
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

	public firstarmorx_main(float modelSize) {
		super(modelSize);
		texWidth = 96;
		texHeight = 159;
		
		MainColorDefault = 2781423;//Main Body Color X Blue
		SecondaryColorDefault = 5752303;//Secondary Cyan tiel color
		ThirdColorDefault = 16642337; //Yellow Bits
		WhiteColorDefault = 16777215;//Basic White
		GlowyColorDefault = 16468504;//Glow?Red crystal thingy
		GrayColorDefault = 16777215;//Basic White
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;

		Headblue = new ModelRenderer(this);
		Headblue.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headblue, -0.1047F, 0.0873F, 0.0F);
		Headblue.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);

		Headwhite = new ModelRenderer(this);
		Headwhite.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headwhite, -0.1047F, 0.0873F, 0.0F);
		Headwhite.texOffs(64, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headwhite.texOffs(82, 20).addBox(5.4872F, -4.841F, -1.5659F, 1.0F, 4.0F, 4.0F, 0.5F, false);
		Headwhite.texOffs(82, 47).addBox(-5.8938F, -4.8448F, -1.5287F, 1.0F, 4.0F, 4.0F, 0.5F, false);

		Headsilver = new ModelRenderer(this);
		Headsilver.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headsilver, -0.1047F, 0.0873F, 0.0F);
		Headsilver.texOffs(0, 142).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headsilver.texOffs(32, 0).addBox(-3.6706F, -7.6327F, -3.8533F, 8.0F, 7.0F, 8.0F, 0.55F, false);

		Headyellow = new ModelRenderer(this);
		Headyellow.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headyellow, -0.1047F, 0.0873F, 0.0F);
		Headyellow.texOffs(48, 126).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);

		Headred = new ModelRenderer(this);
		Headred.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headred, -0.1047F, 0.0873F, 0.0F);
		Headred.texOffs(16, 63).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headred.texOffs(78, 17).addBox(4.9128F, -4.3F, -1.0F, 1.0F, 3.0F, 3.0F, 0.5F, false);
		Headred.texOffs(78, 44).addBox(-7.3F, -4.3F, -1.0F, 1.0F, 3.0F, 3.0F, 0.5F, false);

//		Bodysecondary = new ModelRenderer(this);
//		Bodysecondary.setRotationPoint(0.0F, 0.0F, 0.0F);
//		Bodysecondary.setTextureOffset(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
//
//		Bodymain = new ModelRenderer(this);
//		Bodymain.setRotationPoint(0.0F, 0.0F, 0.0F);
//		Bodymain.setTextureOffset(0, 126).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);
//
//		Bodyyellow = new ModelRenderer(this);
//		Bodyyellow.setRotationPoint(0.0F, 0.0F, 0.0F);
//		Bodyyellow.setTextureOffset(24, 126).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);
//
//		Body3 = new ModelRenderer(this);
//		Body3.setRotationPoint(0.0F, 0.0F, 0.0F);
//		Body3.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);
//
//		RightArmblue = new ModelRenderer(this);
//		RightArmblue.setRotationPoint(-5.0F, 2.0F, 0.0F);
//		setRotationAngle(RightArmblue, -0.1745F, 0.0F, 0.0F);
//		RightArmblue.setTextureOffset(41, 32).addBox(-6.0F, -3.2019F, -2.0F, 6.0F, 4.0F, 4.0F, 0.8F, false);
//		RightArmblue.setTextureOffset(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
//
//		RightArmteal = new ModelRenderer(this);
//		RightArmteal.setRotationPoint(-5.0F, 2.0F, 0.0F);
//		setRotationAngle(RightArmteal, -0.1745F, 0.0F, 0.0F);
//		RightArmteal.setTextureOffset(40, 48).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
//
//		RightArmwhite = new ModelRenderer(this);
//		RightArmwhite.setRotationPoint(-5.0F, 2.0F, 0.0F);
//		setRotationAngle(RightArmwhite, -0.1745F, 0.0F, 0.0F);
//		RightArmwhite.setTextureOffset(41, 80).addBox(-6.0F, -3.2019F, -2.0F, 6.0F, 4.0F, 4.0F, 0.8F, false);
//		RightArmwhite.setTextureOffset(40, 40).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
//
//		RightArmwhite2 = new ModelRenderer(this);
//		RightArmwhite2.setRotationPoint(-5.0F, 2.0F, 0.0F);
//		setRotationAngle(RightArmwhite2, -0.1745F, 0.0F, 0.0F);
//		RightArmwhite2.setTextureOffset(76, 102).addBox(-6.0F, -3.2019F, -2.0F, 6.0F, 4.0F, 4.0F, 0.8F, false);
//		RightArmwhite2.setTextureOffset(78, 119).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
//
//		LeftArmblue = new ModelRenderer(this);
//		LeftArmblue.setRotationPoint(5.0F, 2.0F, 0.0F);
//		setRotationAngle(LeftArmblue, 0.2094F, 0.0F, 0.0F);
//		LeftArmblue.setTextureOffset(61, 32).addBox(0.0F, -2.3974F, -2.0F, 6.0F, 4.0F, 4.0F, 0.8F, false);
//		LeftArmblue.setTextureOffset(60, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
//
//		LeftArmteal = new ModelRenderer(this);
//		LeftArmteal.setRotationPoint(5.0F, 2.0F, 0.0F);
//		setRotationAngle(LeftArmteal, 0.2094F, 0.0F, 0.0F);
//		LeftArmteal.setTextureOffset(60, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
//
//		LeftArmwhite = new ModelRenderer(this);
//		LeftArmwhite.setRotationPoint(5.0F, 2.0F, 0.0F);
//		setRotationAngle(LeftArmwhite, 0.2094F, 0.0F, 0.0F);
//		LeftArmwhite.setTextureOffset(61, 80).addBox(0.0F, -2.3974F, -2.0F, 6.0F, 4.0F, 4.0F, 0.8F, false);
//		LeftArmwhite.setTextureOffset(60, 40).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
//
//		LeftArmgray = new ModelRenderer(this);
//		LeftArmgray.setRotationPoint(5.0F, 2.0F, 0.0F);
//		setRotationAngle(LeftArmgray, 0.2094F, 0.0F, 0.0F);
//		LeftArmgray.setTextureOffset(76, 92).addBox(0.0F, -2.3974F, -2.0F, 6.0F, 4.0F, 4.0F, 0.8F, false);
//		LeftArmgray.setTextureOffset(69, 64).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
//		LeftArmgray.setTextureOffset(78, 119).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
//
//		RightLegblue = new ModelRenderer(this);
//		RightLegblue.setRotationPoint(-1.9F, 12.0F, 0.0F);
//		setRotationAngle(RightLegblue, 0.192F, 0.0F, 0.0349F);
//		RightLegblue.setTextureOffset(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
//
//		RightLegwhite = new ModelRenderer(this);
//		RightLegwhite.setRotationPoint(-1.9F, 12.0F, 0.0F);
//		setRotationAngle(RightLegwhite, 0.192F, 0.0F, 0.0349F);
//		RightLegwhite.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
//
//		RightLegyellow = new ModelRenderer(this);
//		RightLegyellow.setRotationPoint(-1.9F, 12.0F, 0.0F);
//		setRotationAngle(RightLegyellow, 0.192F, 0.0F, 0.0349F);
//		RightLegyellow.setTextureOffset(0, 80).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
//
//		LeftLegwhite = new ModelRenderer(this);
//		LeftLegwhite.setRotationPoint(1.9F, 12.0F, 0.0F);
//		setRotationAngle(LeftLegwhite, -0.1745F, 0.0F, -0.0349F);
//		LeftLegwhite.setTextureOffset(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
//
//		LeftLegblue = new ModelRenderer(this);
//		LeftLegblue.setRotationPoint(1.9F, 12.0F, 0.0F);
//		setRotationAngle(LeftLegblue, -0.1745F, 0.0F, -0.0349F);
//		LeftLegblue.setTextureOffset(0, 64).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
//
//		LeftLeggold = new ModelRenderer(this);
//		LeftLeggold.setRotationPoint(1.9F, 12.0F, 0.0F);
//		setRotationAngle(LeftLeggold, -0.1745F, 0.0F, -0.0349F);
//		LeftLeggold.setTextureOffset(0, 96).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
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
		this.Headblue.copyFrom(this.head);
		Headblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.Bodymain.copyModelAngles(this.bipedBody);
//		Bodymain.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.RightArmblue.copyModelAngles(this.bipedRightArm);
//		RightArmblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.LeftArmblue.copyModelAngles(this.bipedLeftArm);
//		LeftArmblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.RightLegblue.copyModelAngles(this.bipedRightLeg);
//		RightLegblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.LeftLegblue.copyModelAngles(this.bipedLeftLeg);
//		LeftLegblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
//		this.Bodysecondary.copyModelAngles(this.bipedBody);
//		Bodysecondary.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.RightArmteal.copyModelAngles(this.bipedRightArm);
//		RightArmteal.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.LeftArmteal.copyModelAngles(this.bipedLeftArm);
//		LeftArmteal.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.WhiteColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.WhiteColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.WhiteColor & 255) / 255.0F;
		this.Headwhite.copyFrom(this.head);
		Headwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.Body3.copyModelAngles(this.bipedBody);
//		Body3.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
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
//		this.RightArmwhite2.copyModelAngles(this.bipedRightArm);
//		RightArmwhite2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.LeftArmgray.copyModelAngles(this.bipedLeftArm);
//		LeftArmgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		
		fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.ThirdColor & 255) / 255.0F;
		this.Headyellow.copyFrom(this.head);
		Headyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.Bodyyellow.copyModelAngles(this.bipedBody);
//		Bodyyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.RightLegyellow.copyModelAngles(this.bipedRightLeg);
//		RightLegyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.LeftLeggold.copyModelAngles(this.bipedLeftLeg);
//		LeftLeggold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
		this.Headred.copyFrom(this.head);
		Headred.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);

	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
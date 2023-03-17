package com.collecter128.megamanarmormod.client.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

@OnlyIn(Dist.CLIENT)
public class xtransparentmain extends BipedModel  {
	private final ModelRenderer Head1gray;
	private final ModelRenderer Head1;
	private final ModelRenderer Headorange;
	private final ModelRenderer Headgray;
	private final ModelRenderer Headglow;
	private final ModelRenderer Body1gray;
	private final ModelRenderer Body1;
	private final ModelRenderer Body12;
	private final ModelRenderer Body1core;
	private final ModelRenderer Bodyorange;
	private final ModelRenderer Bodygray;
	private final ModelRenderer Body2;
	private final ModelRenderer RightArm1;
	private final ModelRenderer RightArm12;
	private final ModelRenderer RightArm2;
	private final ModelRenderer RightArm1gray;
	private final ModelRenderer RightArmgray;
	private final ModelRenderer RightArmwhite;
	private final ModelRenderer LeftArm1;
	private final ModelRenderer LeftArm12;
	private final ModelRenderer LeftArm2;
	private final ModelRenderer LeftArm1gray;
	private final ModelRenderer LeftArmgray;
	private final ModelRenderer LeftArmwhite;
	private final ModelRenderer RightLeg1gray;
	private final ModelRenderer RightLeg1;
	private final ModelRenderer RightLegglow;
	private final ModelRenderer LeftLeg1gray;
	private final ModelRenderer LeftLeg1;
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

	public xtransparentmain(float modelSize) {
		super(modelSize);
		texWidth = 101;
		texHeight = 146;

		Head1gray = new ModelRenderer(this);
		Head1gray.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Head1gray, -0.1047F, 0.0873F, 0.0F);
		Head1gray.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);

		Head1 = new ModelRenderer(this);
		Head1.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Head1, -0.1047F, 0.0873F, 0.0F);
		Head1.texOffs(64, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);

		Headorange = new ModelRenderer(this);
		Headorange.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headorange, -0.1047F, 0.0873F, 0.0F);
		Headorange.texOffs(0, 66).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headorange.texOffs(44, 80).addBox(-1.1744F, -10.0603F, -3.4948F, 2.0F, 5.0F, 9.0F, 0.4F, false);

		Headgray = new ModelRenderer(this);
		Headgray.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headgray, -0.1047F, 0.0873F, 0.0F);
		Headgray.texOffs(0, 82).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headgray.texOffs(3, 53).addBox(5.4F, -5.9341F, -0.7842F, 1.0F, 3.0F, 3.0F, 0.5F, false);
		Headgray.texOffs(3, 60).addBox(-5.981F, -5.938F, -0.747F, 1.0F, 3.0F, 3.0F, 0.5F, false);
		Headgray.texOffs(32, 0).addBox(-3.6706F, -7.6327F, -3.8533F, 8.0F, 7.0F, 8.0F, 0.55F, false);

		Headglow = new ModelRenderer(this);
		Headglow.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headglow, -0.1047F, 0.0873F, 0.0F);
		Headglow.texOffs(40, 94).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headglow.texOffs(4, 49).addBox(-1.0F, -8.8411F, -5.6852F, 2.0F, 2.0F, 1.0F, 0.1F, false);

		Body1gray = new ModelRenderer(this);
		Body1gray.setPos(0.0F, 0.0F, 0.0F);
		Body1gray.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);

		Body1 = new ModelRenderer(this);
		Body1.setPos(0.0F, 0.0F, 0.0F);
		Body1.texOffs(72, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);

		Body12 = new ModelRenderer(this);
		Body12.setPos(0.0F, 0.0F, 0.0F);
		Body12.texOffs(73, 83).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);

		Body1core = new ModelRenderer(this);
		Body1core.setPos(0.0F, 0.0F, 0.0F);
		Body1core.texOffs(73, 67).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);

		Bodyorange = new ModelRenderer(this);
		Bodyorange.setPos(0.0F, 0.0F, 0.0F);
		Bodyorange.texOffs(0, 98).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);

		Bodygray = new ModelRenderer(this);
		Bodygray.setPos(0.0F, 0.0F, 0.0F);
		Bodygray.texOffs(16, 48).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);

		Body2 = new ModelRenderer(this);
		Body2.setPos(0.0F, 0.0F, 0.0F);
		Body2.texOffs(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);

		RightArm1 = new ModelRenderer(this);
		RightArm1.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArm1, -0.1745F, 0.0F, 0.0F);
		RightArm1.texOffs(77, 32).addBox(-4.0F, -3.2019F, -2.0F, 4.0F, 4.0F, 4.0F, 0.8F, false);

		RightArm12 = new ModelRenderer(this);
		RightArm12.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArm12, -0.1745F, 0.0F, 0.0F);
		RightArm12.texOffs(40, 16).addBox(-4.0F, -3.2019F, -2.0F, 4.0F, 4.0F, 4.0F, 0.8F, false);

		RightArm2 = new ModelRenderer(this);
		RightArm2.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArm2, -0.1745F, 0.0F, 0.0F);
		RightArm2.texOffs(40, 24).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		RightArm1gray = new ModelRenderer(this);
		RightArm1gray.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArm1gray, -0.1745F, 0.0F, 0.0F);
		RightArm1gray.texOffs(40, 40).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);

		RightArmgray = new ModelRenderer(this);
		RightArmgray.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmgray, -0.1745F, 0.0F, 0.0F);
		RightArmgray.texOffs(40, 64).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		RightArmwhite = new ModelRenderer(this);
		RightArmwhite.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmwhite, -0.1745F, 0.0F, 0.0F);
		RightArmwhite.texOffs(40, 48).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		LeftArm1 = new ModelRenderer(this);
		LeftArm1.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArm1, 0.2094F, 0.0F, 0.0F);
		LeftArm1.texOffs(77, 40).addBox(0.0F, -2.3974F, -2.0F, 4.0F, 4.0F, 4.0F, 0.8F, false);

		LeftArm12 = new ModelRenderer(this);
		LeftArm12.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArm12, 0.2094F, 0.0F, 0.0F);
		LeftArm12.texOffs(56, 16).addBox(0.0F, -2.3974F, -2.0F, 4.0F, 4.0F, 4.0F, 0.8F, false);

		LeftArm2 = new ModelRenderer(this);
		LeftArm2.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArm2, 0.2094F, 0.0F, 0.0F);
		LeftArm2.texOffs(56, 24).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		LeftArm1gray = new ModelRenderer(this);
		LeftArm1gray.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArm1gray, 0.2094F, 0.0F, 0.0F);
		LeftArm1gray.texOffs(56, 40).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);

		LeftArmgray = new ModelRenderer(this);
		LeftArmgray.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgray, 0.2094F, 0.0F, 0.0F);
		LeftArmgray.texOffs(56, 64).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		LeftArmwhite = new ModelRenderer(this);
		LeftArmwhite.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmwhite, 0.2094F, 0.0F, 0.0F);
		LeftArmwhite.texOffs(56, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		RightLeg1gray = new ModelRenderer(this);
		RightLeg1gray.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeg1gray, 0.192F, 0.0F, 0.0349F);
		RightLeg1gray.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);

		RightLeg1 = new ModelRenderer(this);
		RightLeg1.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeg1, 0.192F, 0.0F, 0.0349F);
		RightLeg1.texOffs(63, 113).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);

		RightLegglow = new ModelRenderer(this);
		RightLegglow.setPos(-2.9F, 12.0F, 1.0F);
		setRotationAngle(RightLegglow, 0.192F, 0.0F, 0.0349F);
		RightLegglow.texOffs(25, 103).addBox(0.0F, 8.7F, -2.0F, 2.0F, 3.0F, 2.0F, 1.0F, false);

		LeftLeg1gray = new ModelRenderer(this);
		LeftLeg1gray.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeg1gray, -0.1745F, 0.0F, -0.0349F);
		LeftLeg1gray.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);

		LeftLeg1 = new ModelRenderer(this);
		LeftLeg1.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeg1, -0.1745F, 0.0F, -0.0349F);
		LeftLeg1.texOffs(63, 129).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);

		LeftLegglow = new ModelRenderer(this);
		LeftLegglow.setPos(0.9F, 12.0F, 1.0F);
		setRotationAngle(LeftLegglow, -0.1745F, 0.0F, -0.0349F);
		LeftLegglow.texOffs(25, 110).addBox(0.0F, 10.0F, -2.0F, 2.0F, 2.0F, 2.0F, 1.0F, true);
	}

//	@Override
//	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
//		//previously the render function, render code was moved to a method below
//	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Head1gray.render(matrixStack, buffer, packedLight, packedOverlay);
		Head1.render(matrixStack, buffer, packedLight, packedOverlay);
		Headorange.render(matrixStack, buffer, packedLight, packedOverlay);
		Headgray.render(matrixStack, buffer, packedLight, packedOverlay);
		Headglow.render(matrixStack, buffer, packedLight, packedOverlay);
		Body1gray.render(matrixStack, buffer, packedLight, packedOverlay);
		Body1.render(matrixStack, buffer, packedLight, packedOverlay);
		Body12.render(matrixStack, buffer, packedLight, packedOverlay);
		Body1core.render(matrixStack, buffer, packedLight, packedOverlay);
		Bodyorange.render(matrixStack, buffer, packedLight, packedOverlay);
		Bodygray.render(matrixStack, buffer, packedLight, packedOverlay);
		Body2.render(matrixStack, buffer, packedLight, packedOverlay);
		RightArm1.render(matrixStack, buffer, packedLight, packedOverlay);
		RightArm12.render(matrixStack, buffer, packedLight, packedOverlay);
		RightArm2.render(matrixStack, buffer, packedLight, packedOverlay);
		RightArm1gray.render(matrixStack, buffer, packedLight, packedOverlay);
		RightArmgray.render(matrixStack, buffer, packedLight, packedOverlay);
		RightArmwhite.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftArm1.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftArm12.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftArm2.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftArm1gray.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftArmgray.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftArmwhite.render(matrixStack, buffer, packedLight, packedOverlay);
		RightLeg1gray.render(matrixStack, buffer, packedLight, packedOverlay);
		RightLeg1.render(matrixStack, buffer, packedLight, packedOverlay);
		RightLegglow.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftLeg1gray.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftLeg1.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftLegglow.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
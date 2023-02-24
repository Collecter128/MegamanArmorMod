package com.collecter128.megamanarmormod.client.models;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.inventory.EquipmentSlotType;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public class protomanarmor_maincolor extends BipedModel {
	private final ModelRenderer Head;
	private final ModelRenderer Head2;
	private final ModelRenderer Head3;
	private final ModelRenderer Head4;
	private final ModelRenderer Headglow;
//	private final ModelRenderer Body;
//	private final ModelRenderer Body2;
//	private final ModelRenderer cube_r1;
//	private final ModelRenderer Body3;
//	private final ModelRenderer RightArm;
//	private final ModelRenderer RightArm2;
//	private final ModelRenderer LeftArm;
//	private final ModelRenderer LeftArm2;
//	private final ModelRenderer RightLeg;
//	private final ModelRenderer RightLeg2;
//	private final ModelRenderer LeftLeg;
//	private final ModelRenderer LeftLeg2;
	
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
	
	EquipmentSlotType armorpart;

	public protomanarmor_maincolor(float modelSize, EquipmentSlotType part) {//EquipmentSlotType part
		super(modelSize);
		texWidth = 64;
		texHeight = 92;
		
		MainColorDefault = 16331285;//Main Body Color Protoman orangishRed
		SecondaryColorDefault = 9737364;//Secondary Color black?
		WhiteColorDefault = 15855562;
		ThirdColorDefault = 16765460;//Scarf
		GlowyColorDefault = 2359060;//Glow Green Bits
		GrayColorDefault = 12105912;
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
		
		armorpart = part;

		Head = new ModelRenderer(this);
		Head.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Head, -0.1047F, 0.0873F, 0.0F);
		Head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);

		Head2 = new ModelRenderer(this);
		Head2.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Head2, -0.1047F, 0.0873F, 0.0F);
		Head2.texOffs(3, 56).addBox(-5.5F, -8.8045F, -5.8244F, 11.0F, 6.0F, 0.0F, 0.1F, false);
		Head2.texOffs(12, 68).addBox(5.4F, -3.9451F, -0.5752F, 1.0F, 3.0F, 3.0F, 0.5F, false);
		Head2.texOffs(2, 68).addBox(-5.981F, -3.9489F, -0.538F, 1.0F, 3.0F, 3.0F, 0.5F, false);
		Head2.texOffs(39, 85).addBox(-4.0F, -4.3069F, -1.1323F, 8.0F, 3.0F, 3.0F, 0.9F, false);
		
		Head3 = new ModelRenderer(this);
		Head3.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Head3, -0.1047F, 0.0873F, 0.0F);
		Head3.texOffs(32, 0).addBox(-3.6706F, -7.6327F, -3.8533F, 8.0F, 7.0F, 8.0F, 0.55F, false);

		Head4 = new ModelRenderer(this);
		Head4.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Head4, -0.1047F, 0.0873F, 0.0F);
		Head4.texOffs(3, 61).addBox(-5.5F, -8.8045F, -5.8244F, 11.0F, 6.0F, 0.0F, 0.1F, false);

		Headglow = new ModelRenderer(this);
		Headglow.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headglow, -0.1047F, 0.0873F, 0.0F);
		Headglow.texOffs(33, 79).addBox(-4.0F, -4.3069F, -1.1323F, 8.0F, 3.0F, 3.0F, 1.0F, false);
		
//		Body = new ModelRenderer(this);
//		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
//		Body.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);
//
//		Body2 = new ModelRenderer(this);
//		Body2.setRotationPoint(0.0F, 0.0F, 0.0F);
//		Body2.setTextureOffset(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.71F, false);
//
//		cube_r1 = new ModelRenderer(this);
//		cube_r1.setRotationPoint(-3.0F, -1.0F, 3.0F);
//		Body2.addChild(cube_r1);
//		setRotationAngle(cube_r1, -0.48F, 3.1416F, 0.0F);
//		cube_r1.setTextureOffset(17, 47).addBox(-5.0F, 0.0F, 0.0F, 5.0F, 7.0F, 1.0F, 0.0F, false);
//
//		Body3 = new ModelRenderer(this);
//		Body3.setRotationPoint(0.0F, 0.0F, 0.0F);
//		Body3.setTextureOffset(1, 76).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
//
//		RightArm = new ModelRenderer(this);
//		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
//		setRotationAngle(RightArm, -0.1745F, 0.0F, 0.0F);
//		RightArm.setTextureOffset(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
//		RightArm.setTextureOffset(40, 32).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
//
//		RightArm2 = new ModelRenderer(this);
//		RightArm2.setRotationPoint(-5.0F, 2.0F, 0.0F);
//		setRotationAngle(RightArm2, -0.1745F, 0.0F, 0.0F);
//		RightArm2.setTextureOffset(32, 64).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
//
//		LeftArm = new ModelRenderer(this);
//		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
//		setRotationAngle(LeftArm, 0.2094F, 0.0F, 0.0F);
//		LeftArm.setTextureOffset(40, 40).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
//		LeftArm.setTextureOffset(40, 56).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
//
//		LeftArm2 = new ModelRenderer(this);
//		LeftArm2.setRotationPoint(5.0F, 2.0F, 0.0F);
//		setRotationAngle(LeftArm2, 0.2094F, 0.0F, 0.0F);
//		LeftArm2.setTextureOffset(48, 64).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
//
//		RightLeg = new ModelRenderer(this);
//		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
//		setRotationAngle(RightLeg, 0.192F, 0.0F, 0.0349F);
//		RightLeg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
//
//		RightLeg2 = new ModelRenderer(this);
//		RightLeg2.setRotationPoint(-2.9F, 15.0F, 2.0F);
//		setRotationAngle(RightLeg2, 0.192F, 0.0F, 0.0349F);
//		RightLeg2.setTextureOffset(1, 51).addBox(-0.0349F, 10.019F, -2.6093F, 2.0F, 1.0F, 2.0F, 0.75F, false);
//
//		LeftLeg = new ModelRenderer(this);
//		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
//		setRotationAngle(LeftLeg, -0.1745F, 0.0F, -0.0349F);
//		LeftLeg.setTextureOffset(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
//
//		LeftLeg2 = new ModelRenderer(this);
//		LeftLeg2.setRotationPoint(0.9F, 12.0F, 0.0F);
//		setRotationAngle(LeftLeg2, -0.1745F, 0.0F, -0.0349F);
//		LeftLeg2.setTextureOffset(8, 51).addBox(0.0296F, 12.9684F, -1.153F, 2.0F, 1.0F, 2.0F, 0.75F, true);
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
        //if(armorpart == EquipmentSlotType.HEAD) {
        	this.Head.copyFrom(this.head);
        	Head.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
       // }
        //if(armorpart == EquipmentSlotType.CHEST) {
//        	this.RightArm.copyModelAngles(this.bipedRightArm);
//        	RightArm.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//        	this.LeftArm.copyModelAngles(this.bipedLeftArm);
//        	LeftArm.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
        //}
        //if(armorpart == EquipmentSlotType.FEET) {
//        	this.RightLeg.copyModelAngles(this.bipedRightLeg);
//        	RightLeg.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//        	this.LeftLeg.copyModelAngles(this.bipedLeftLeg);
//        	LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
        //}

		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
        //if(armorpart == EquipmentSlotType.HEAD) {
        	this.Head4.copyFrom(this.head);
			Head4.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
        //}
        //if(armorpart == EquipmentSlotType.CHEST) {
//        	this.Body.copyModelAngles(this.bipedBody);
//        	Body.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//        	this.RightArm2.copyModelAngles(this.bipedRightArm);
//        	RightArm2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//        	this.LeftArm2.copyModelAngles(this.bipedLeftArm);
//        	LeftArm2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
        //}
		
        //if(armorpart == EquipmentSlotType.HEAD) {
        	fred = (float)( this.WhiteColor >> 16 & 255) / 255.0F;
        	fgreen = (float)(this.WhiteColor >> 8 & 255) / 255.0F;
        	fblue = (float)(this.WhiteColor & 255) / 255.0F;
        	this.Head2.copyFrom(this.head);
        	Head2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
        //}
		
        //if(armorpart == EquipmentSlotType.CHEST) {
        	fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
        	fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
        	fblue = (float)(this.ThirdColor & 255) / 255.0F;
//        	this.Body2.copyModelAngles(this.bipedBody);
//        	Body2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
        //}
		
		fred = (float)( this.GrayColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GrayColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GrayColor & 255) / 255.0F;
        //if(armorpart == EquipmentSlotType.HEAD) {
        	this.Head3.copyFrom(this.head);
        	Head3.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
        //}
        //if(armorpart == EquipmentSlotType.CHEST) {
//        	this.Body3.copyModelAngles(this.bipedBody);
//        	Body3.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
        //}
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
        //if(armorpart == EquipmentSlotType.HEAD) {
        	this.Headglow.copyFrom(this.head);
			Headglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
        //}
        //if(armorpart == EquipmentSlotType.FEET) {
//        	this.RightLeg2.copyModelAngles(this.bipedRightLeg);
//        	RightLeg2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//        	this.LeftLeg2.copyModelAngles(this.bipedLeftLeg);
//        	LeftLeg2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
        //}
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
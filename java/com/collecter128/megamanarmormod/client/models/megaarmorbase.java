package com.collecter128.megamanarmormod.client.models;

import javax.annotation.Nullable;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EquipmentSlotType;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class megaarmorbase extends BipedModel  {
	private final ModelRenderer Head3;
	private final ModelRenderer Bodygray;
	private final ModelRenderer Bodyglow;
	private final ModelRenderer Body3;
	private final ModelRenderer RightArm2;
	private final ModelRenderer RightArmgray;
	private final ModelRenderer RightArmwhite;
	private final ModelRenderer LeftArm2;
	private final ModelRenderer LeftArmgray;
	private final ModelRenderer LeftArmwhite;
	private final ModelRenderer Rightbootgray;
	private final ModelRenderer Rightbootglow;
	private final ModelRenderer LeftLbootgray;
	private final ModelRenderer Leftbootglow;
	private final ModelRenderer Legsgray;
	private final ModelRenderer Rightleg2;
	private final ModelRenderer LeftLegs2;
	
	public int MainColor;
	public int SecondaryColor;
	public int WhiteColor;
	public int ThirdColor;
	public int GlowyColor;
	public int GrayColor;
	public int FourthColor;
	public int MainColorDefault;
	public int SecondaryColorDefault;
	public int WhiteColorDefault;
	public int ThirdColorDefault;
	public int GlowyColorDefault;
	public int GrayColorDefault;
	public int FourthColorDefault;
	
	EquipmentSlotType equipmentslot;

	public megaarmorbase(float modelSize, EquipmentSlotType slot) {
		super(modelSize);
		texWidth = 90;
		texHeight = 55;
		
		equipmentslot = slot;
		
		MainColorDefault = 2781423;//Main Body Color X Blue
		SecondaryColorDefault = 5752303;//Secondary Cyan tiel color
		ThirdColorDefault = 16777215;
		WhiteColorDefault = 16777215;//Basic White
		GlowyColorDefault = 2752287;//Glow?green core thingy
		GrayColorDefault = 16777215;//Basic White
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;

		Head3 = new ModelRenderer(this);
		Head3.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Head3, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head3.texOffs(0, 0).addBox(-3.6706F, -7.6327F, -3.8533F, 8.0F, 7.0F, 8.0F, 0.55F, false);
		}
		
		Bodygray = new ModelRenderer(this);
		Bodygray.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodygray.texOffs(34, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		}
		
		Bodyglow = new ModelRenderer(this);
		Bodyglow.setPos(0.0F, -6.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyglow.texOffs(33, 5).addBox(-4.0F, 1.0F, -2.0F, 8.0F, 5.0F, 4.0F, 0.51F, false);
		}
		
		Body3 = new ModelRenderer(this);
		Body3.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Body3.texOffs(34, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		}
		
		RightArm2 = new ModelRenderer(this);
		RightArm2.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArm2, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArm2.texOffs(58, 0).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		RightArmgray = new ModelRenderer(this);
		RightArmgray.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmgray, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmgray.texOffs(58, 36).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		RightArmwhite = new ModelRenderer(this);
		RightArmwhite.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmwhite, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmwhite.texOffs(58, 20).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		LeftArm2 = new ModelRenderer(this);
		LeftArm2.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArm2, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArm2.texOffs(74, 0).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		LeftArmgray = new ModelRenderer(this);
		LeftArmgray.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgray, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmgray.texOffs(74, 36).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		LeftArmwhite = new ModelRenderer(this);
		LeftArmwhite.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmwhite, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmwhite.texOffs(74, 20).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		Rightbootgray = new ModelRenderer(this);
		Rightbootgray.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(Rightbootgray, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		Rightbootgray.texOffs(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		Rightbootglow = new ModelRenderer(this);
		Rightbootglow.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(Rightbootglow, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		Rightbootglow.texOffs(2, 49).addBox(-0.8947F, 14.2F, -1.0F, 2.0F, 1.0F, 2.0F, 1.0F, false);
		}
		
		LeftLbootgray = new ModelRenderer(this);
		LeftLbootgray.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLbootgray, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLbootgray.texOffs(17, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		Leftbootglow = new ModelRenderer(this);
		Leftbootglow.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(Leftbootglow, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		Leftbootglow.texOffs(12, 49).addBox(-1.2791F, 14.2F, -1.0F, 2.0F, 1.0F, 2.0F, 1.0F, true);
		}
		
		Legsgray = new ModelRenderer(this);
		Legsgray.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		Legsgray.texOffs(24, 48).addBox(-4.0F, 9.0F, -2.0F, 8.0F, 3.0F, 4.0F, 0.63F, false);
		}
		
		Rightleg2 = new ModelRenderer(this);
		Rightleg2.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(Rightleg2, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		Rightleg2.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		LeftLegs2 = new ModelRenderer(this);
		LeftLegs2.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegs2, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		LeftLegs2.texOffs(17, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
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
		this.Head3.copyFrom(this.head);
		Head3.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodygray.copyFrom(this.body);
		Bodygray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmgray.copyFrom(this.rightArm);
		RightArmgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmgray.copyFrom(this.leftArm);
		LeftArmgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Legsgray.copyFrom(this.body);
		Legsgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Rightbootgray.copyFrom(this.rightLeg);
		Rightbootgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLbootgray.copyFrom(this.leftLeg);
		LeftLbootgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
		this.Bodyglow.copyFrom(this.body);
		Bodyglow.render(matrixStack, buffer, 15728640, packedOverlay, fred, fgreen, fblue, alpha);
		this.Rightbootglow.copyFrom(this.rightLeg);
		Rightbootglow.render(matrixStack, buffer, 15728640, packedOverlay, fred, fgreen, fblue, alpha);
		this.Leftbootglow.copyFrom(this.leftLeg);
		Leftbootglow.render(matrixStack, buffer, 15728640, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.WhiteColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.WhiteColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.WhiteColor & 255) / 255.0F;
        this.RightArmwhite.copyFrom(this.rightArm);
		RightArmwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmwhite.copyFrom(this.leftArm);
		LeftArmwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
		this.Body3.copyFrom(this.body);
		Body3.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArm2.copyFrom(this.rightArm);
		RightArm2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArm2.copyFrom(this.leftArm);
		LeftArm2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Rightleg2.copyFrom(this.rightLeg);
		Rightleg2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegs2.copyFrom(this.leftLeg);
		LeftLegs2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
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
import net.minecraft.inventory.EquipmentSlotType;

// Made with Blockbench 4.6.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class fireman extends BipedModel {
	private final ModelRenderer Headgraymain;
	private final ModelRenderer Headredglow;
	private final ModelRenderer Headgray;
	private final ModelRenderer Headorangeglow;
	private final ModelRenderer Bodyred;
	private final ModelRenderer Bodygraymain;
	private final ModelRenderer RightArmred;
	private final ModelRenderer RightArmgraymain;
	private final ModelRenderer RightArmorangeglow;
	private final ModelRenderer LeftArmred;
	private final ModelRenderer LeftArmgraymain;
	private final ModelRenderer LeftArmgloworange;
	private final ModelRenderer RightLeggraymain;
	private final ModelRenderer RightLegred;
	private final ModelRenderer RightLegglow;
	private final ModelRenderer LeftLeggraymain;
	private final ModelRenderer LeftLegred;
	private final ModelRenderer LeftLegglow;
	
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

	public fireman(float modelSize, EquipmentSlotType slot) {
		super(modelSize);
		texWidth = 75;
		texHeight = 162;
		
		equipmentslot = slot;
		
		MainColorDefault = 16712965;//red
		SecondaryColorDefault = 12237498;//gray
		ThirdColorDefault = 16767749; //yellow(not used?)
		WhiteColorDefault = 15921906;//Basic White
		GlowyColorDefault = 16759813;//orange
		GrayColorDefault = 15592941;//also gray
		FourthColorDefault = 12237498;//gray again
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
		FourthColor = FourthColorDefault;

		Headgraymain = new ModelRenderer(this);
		Headgraymain.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headgraymain.texOffs(0, 7).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headgraymain.texOffs(49, 82).addBox(5.0643F, -3.9451F, -0.5752F, 1.0F, 3.0F, 3.0F, 0.5F, false);
		Headgraymain.texOffs(37, 82).addBox(-5.8938F, -3.8448F, -1.5287F, 1.0F, 3.0F, 3.0F, 0.5F, false);
		}
		
		Headredglow = new ModelRenderer(this);
		Headredglow.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headredglow.texOffs(0, 79).addBox(-4.0F, -17.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.3F, false);
		}
		
		Headgray = new ModelRenderer(this);
		Headgray.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headgray.texOffs(32, 9).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 7.0F, 8.0F, 0.75F, false);
		}
		
		Headorangeglow = new ModelRenderer(this);
		Headorangeglow.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headorangeglow.texOffs(0, 59).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headorangeglow.texOffs(3, 98).addBox(-5.3F, -3.3F, -1.0F, 1.0F, 2.0F, 2.0F, 0.5F, false);
		Headorangeglow.texOffs(16, 98).addBox(4.5F, -3.5F, 0.0F, 1.0F, 2.0F, 2.0F, 0.5F, false);
		}
		
		Bodyred = new ModelRenderer(this);
		Bodyred.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyred.texOffs(16, 24).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.7F, false);
		}
		
		Bodygraymain = new ModelRenderer(this);
		Bodygraymain.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodygraymain.texOffs(16, 40).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		}
		
		RightArmred = new ModelRenderer(this);
		RightArmred.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmred, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmred.texOffs(40, 24).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		RightArmred.texOffs(1, 145).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.7F, false);
		RightArmred.texOffs(40, 64).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 7.0F, 4.0F, 0.75F, false);
		}
		
		RightArmgraymain = new ModelRenderer(this);
		RightArmgraymain.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmgraymain, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmgraymain.texOffs(56, 24).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		RightArmgraymain.texOffs(41, 40).addBox(-2.0F, 8.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.5F, false);
		}
		
		RightArmorangeglow = new ModelRenderer(this);
		RightArmorangeglow.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmorangeglow, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmorangeglow.texOffs(1, 100).addBox(-2.0F, 11.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.5F, false);
		}
		
		LeftArmred = new ModelRenderer(this);
		LeftArmred.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmred, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmred.texOffs(40, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArmred.texOffs(20, 145).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.7F, true);
		LeftArmred.texOffs(57, 64).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 7.0F, 4.0F, 0.75F, false);
		}
		
		LeftArmgraymain = new ModelRenderer(this);
		LeftArmgraymain.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgraymain, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmgraymain.texOffs(56, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArmgraymain.texOffs(59, 41).addBox(0.0F, 9.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.5F, true);
		}
		
		LeftArmgloworange = new ModelRenderer(this);
		LeftArmgloworange.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgloworange, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmgloworange.texOffs(17, 100).addBox(0.0F, 11.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.5F, true);
		}
		
		RightLeggraymain = new ModelRenderer(this);
		RightLeggraymain.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeggraymain, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLeggraymain.texOffs(0, 24).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLegred = new ModelRenderer(this);
		RightLegred.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegred, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegred.texOffs(39, 144).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLegglow = new ModelRenderer(this);
		RightLegglow.setPos(-1.9F, 12.0F, -1.9632F);
		setRotationAngle(RightLegglow, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegglow.texOffs(31, 96).addBox(-2.0F, 8.5F, -0.0368F, 4.0F, 4.0F, 4.0F, 1.0F, false);
		}
		
		LeftLeggraymain = new ModelRenderer(this);
		LeftLeggraymain.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeggraymain, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLeggraymain.texOffs(0, 40).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLegred = new ModelRenderer(this);
		LeftLegred.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegred, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegred.texOffs(57, 144).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLegglow = new ModelRenderer(this);
		LeftLegglow.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegglow, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegglow.texOffs(50, 96).addBox(-2.0F, 8.2F, -2.0F, 4.0F, 4.0F, 4.0F, 1.0F, true);
		}
	}

//	@Override
//	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
//		//previously the render function, render code was moved to a method below
//	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		
		float fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
		float fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
		float fblue = (float)(this.SecondaryColor & 255) / 255.0F;
		this.Headgraymain.copyFrom(this.head);
		Headgraymain.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodygraymain.copyFrom(this.body);
		Bodygraymain.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmgraymain.copyFrom(this.rightArm);
		RightArmgraymain.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmgraymain.copyFrom(this.leftArm);
		LeftArmgraymain.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLeggraymain.copyFrom(this.rightLeg);
		RightLeggraymain.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeggraymain.copyFrom(this.leftLeg);
		LeftLeggraymain.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.MainColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.MainColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.MainColor & 255) / 255.0F;
		this.Headredglow.copyFrom(this.head);
		Headredglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodyred.copyFrom(this.body);
		Bodyred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmred.copyFrom(this.rightArm);
		RightArmred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmred.copyFrom(this.leftArm);
		LeftArmred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegred.copyFrom(this.rightLeg);
		RightLegred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegred.copyFrom(this.leftLeg);
		LeftLegred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GrayColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GrayColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GrayColor & 255) / 255.0F;
		this.Headgray.copyFrom(this.head);
		Headgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
		this.Headorangeglow.copyFrom(this.head);
		Headorangeglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmorangeglow.copyFrom(this.rightArm);
		RightArmorangeglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmgloworange.copyFrom(this.leftArm);
		LeftArmgloworange.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegglow.copyFrom(this.rightLeg);
		RightLegglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegglow.copyFrom(this.leftLeg);
		LeftLegglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
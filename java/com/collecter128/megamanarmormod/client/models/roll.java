package com.collecter128.megamanarmormod.client.models;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports

@OnlyIn(Dist.CLIENT)
public class roll extends BipedModel  {
	private final ModelRenderer Headyellowhair;
	private final ModelRenderer Head2_r1;
	private final ModelRenderer Headgreenbow;
	private final ModelRenderer Headglow_r1;
	private final ModelRenderer Headglow_r2;
	private final ModelRenderer Bodyred;
	private final ModelRenderer Bodywhite;
	private final ModelRenderer Bodyblack;
	private final ModelRenderer RightArmblack;
	private final ModelRenderer RightArmwhite;
	private final ModelRenderer LeftArmblack;
	private final ModelRenderer LeftArmwhite;
	private final ModelRenderer RightLegred;
	private final ModelRenderer RightLegblack;
	private final ModelRenderer RightLegwhite;
	private final ModelRenderer RightLegorangeglow;
	private final ModelRenderer Legsred;
	private final ModelRenderer Body_r1;
	private final ModelRenderer Body_r2;
	private final ModelRenderer LeftLegred;
	private final ModelRenderer LeftLegblack;
	private final ModelRenderer LeftLegwhite;
	private final ModelRenderer LeftLegorangeglow;
	
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

	public roll(float modelSize, EquipmentSlotType slot) {
		super(modelSize);
		texWidth = 75;
		texHeight = 123;
		
		equipmentslot = slot;
		
		MainColorDefault = 16731960;//Main Body Color red
		SecondaryColorDefault = 12708608;//Secondary Lime Green
		ThirdColorDefault = 16635420; //Hair Yellow
		WhiteColorDefault = 16777215;//Basic White
		GlowyColorDefault = 16749332;//Glow Orange
		GrayColorDefault = 6113907;//Black
		FourthColorDefault = 6113907; // Black
		
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
		FourthColor = FourthColorDefault;

		Headyellowhair = new ModelRenderer(this);
		Headyellowhair.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headyellowhair.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Head2_r1 = new ModelRenderer(this);
		Head2_r1.setPos(0.0F, -2.0F, 5.0F);
		Headyellowhair.addChild(Head2_r1);
		setRotationAngle(Head2_r1, 0.5236F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head2_r1.texOffs(49, 101).addBox(-3.0F, -3.0F, 2.0F, 6.0F, 9.0F, 6.0F, 1.0F, false);
		}
		
		Headgreenbow = new ModelRenderer(this);
		Headgreenbow.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headgreenbow.texOffs(39, 5).addBox(-4.0F, -9.0F, 6.0F, 2.0F, 2.0F, 1.0F, 1.0F, false);
		Headgreenbow.texOffs(47, 5).addBox(2.0F, -9.0F, 6.0F, 2.0F, 2.0F, 1.0F, 1.0F, false);
		}
		
		Headglow_r1 = new ModelRenderer(this);
		Headglow_r1.setPos(0.0F, -6.0F, 5.0F);
		Headgreenbow.addChild(Headglow_r1);
		setRotationAngle(Headglow_r1, 0.0F, 0.0F, -0.3927F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headglow_r1.texOffs(44, 10).addBox(2.0F, 3.0F, 1.0F, 1.0F, 4.0F, 1.0F, 1.0F, false);
		}
		
		Headglow_r2 = new ModelRenderer(this);
		Headglow_r2.setPos(0.0F, -6.0F, 5.0F);
		Headgreenbow.addChild(Headglow_r2);
		setRotationAngle(Headglow_r2, 0.0F, 0.0F, 0.3927F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headglow_r2.texOffs(39, 10).addBox(-3.0F, 3.0F, 1.0F, 1.0F, 4.0F, 1.0F, 1.0F, false);
		}
		
		Bodyred = new ModelRenderer(this);
		Bodyred.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyred.texOffs(16, 19).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		}
		
		Bodywhite = new ModelRenderer(this);
		Bodywhite.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodywhite.texOffs(16, 35).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		}
		
		Bodyblack = new ModelRenderer(this);
		Bodyblack.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyblack.texOffs(16, 51).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		}
		
		RightArmblack = new ModelRenderer(this);
		RightArmblack.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmblack, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmblack.texOffs(56, 19).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		RightArmwhite = new ModelRenderer(this);
		RightArmwhite.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmwhite, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmwhite.texOffs(40, 28).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 3.0F, 4.0F, 0.75F, false);
		}
		
		LeftArmblack = new ModelRenderer(this);
		LeftArmblack.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmblack, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmblack.texOffs(56, 35).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		LeftArmwhite = new ModelRenderer(this);
		LeftArmwhite.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmwhite, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmwhite.texOffs(40, 44).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 3.0F, 4.0F, 0.75F, false);
		}
		
		RightLegred = new ModelRenderer(this);
		RightLegred.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegred, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegred.texOffs(0, 19).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLegblack = new ModelRenderer(this);
		RightLegblack.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegblack, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegblack.texOffs(0, 83).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLegwhite = new ModelRenderer(this);
		RightLegwhite.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegwhite, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegwhite.texOffs(0, 51).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		RightLegwhite.texOffs(48, 58).addBox(-4.0F, 9.0F, -1.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		RightLegwhite.texOffs(59, 58).addBox(3.0F, 9.0F, -1.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		}
		
		RightLegorangeglow = new ModelRenderer(this);
		RightLegorangeglow.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegorangeglow, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegorangeglow.texOffs(25, 67).addBox(-4.0F, 9.0F, -1.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		RightLegorangeglow.texOffs(32, 67).addBox(3.0F, 9.0F, -1.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		}
		
		Legsred = new ModelRenderer(this);
		Legsred.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		Legsred.texOffs(7, 102).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		}
		
		Body_r1 = new ModelRenderer(this);
		Body_r1.setPos(0.0F, 8.0F, 0.0F);
		Legsred.addChild(Body_r1);
		setRotationAngle(Body_r1, 0.3054F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		Body_r1.texOffs(40, 82).addBox(-4.0F, 0.0F, -1.0F, 8.0F, 5.0F, 3.0F, 0.51F, false);
		}
		
		Body_r2 = new ModelRenderer(this);
		Body_r2.setPos(0.0F, 8.0F, 0.0F);
		Legsred.addChild(Body_r2);
		setRotationAngle(Body_r2, -0.3054F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		Body_r2.texOffs(40, 92).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 5.0F, 3.0F, 0.51F, false);
		}
		
		LeftLegred = new ModelRenderer(this);
		LeftLegred.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegred, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegred.texOffs(0, 35).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLegblack = new ModelRenderer(this);
		LeftLegblack.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegblack, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegblack.texOffs(19, 83).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLegwhite = new ModelRenderer(this);
		LeftLegwhite.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegwhite, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegwhite.texOffs(0, 67).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		LeftLegwhite.texOffs(59, 58).addBox(3.0F, 9.0F, -1.0F, 1.0F, 3.0F, 3.0F, 0.0F, true);
		LeftLegwhite.texOffs(59, 67).addBox(-4.0F, 9.0F, -1.0F, 1.0F, 3.0F, 3.0F, 0.0F, true);
		}
		
		LeftLegorangeglow = new ModelRenderer(this);
		LeftLegorangeglow.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegorangeglow, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegorangeglow.texOffs(25, 74).addBox(3.0F, 9.0F, -1.0F, 1.0F, 3.0F, 3.0F, 0.0F, true);
		LeftLegorangeglow.texOffs(32, 74).addBox(-4.0F, 9.0F, -1.0F, 1.0F, 3.0F, 3.0F, 0.0F, true);
		}
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
		this.Bodyred.copyFrom(this.body);
		Bodyred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Legsred.copyFrom(this.body);
		Legsred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegred.copyFrom(this.rightLeg);
		RightLegred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegred.copyFrom(this.leftLeg);
		LeftLegred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.ThirdColor & 255) / 255.0F;
		this.Headyellowhair.copyFrom(this.head);
		Headyellowhair.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
		this.Headgreenbow.copyFrom(this.head);
		Headgreenbow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.WhiteColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.WhiteColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.WhiteColor & 255) / 255.0F;
		this.Bodywhite.copyFrom(this.body);
		Bodywhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmwhite.copyFrom(this.rightArm);
		RightArmwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmwhite.copyFrom(this.leftArm);
		LeftArmwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegwhite.copyFrom(this.rightLeg);
		RightLegwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegwhite.copyFrom(this.leftLeg);
		LeftLegwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.FourthColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.FourthColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.FourthColor & 255) / 255.0F;
		this.Bodyblack.copyFrom(this.body);
		Bodyblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmblack.copyFrom(this.rightArm);
		RightArmblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmblack.copyFrom(this.leftArm);
		LeftArmblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegblack.copyFrom(this.rightLeg);
		RightLegblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegblack.copyFrom(this.leftLeg);
		LeftLegblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
		this.RightLegorangeglow.copyFrom(this.rightLeg);
		RightLegorangeglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegorangeglow.copyFrom(this.leftLeg);
		LeftLegorangeglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
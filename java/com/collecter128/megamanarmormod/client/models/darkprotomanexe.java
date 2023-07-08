package com.collecter128.megamanarmormod.client.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports

@OnlyIn(Dist.CLIENT)
public class darkprotomanexe extends BipedModel {
	private final ModelRenderer Headred;
	private final ModelRenderer Headyellowglow;
	private final ModelRenderer Headpurple;
	private final ModelRenderer Headblack;
	private final ModelRenderer Headredvisor;
	private final ModelRenderer Headlightgray;
	private final ModelRenderer Head_r1;
	private final ModelRenderer Bodygrayblack;
	private final ModelRenderer Bodyyellow;
	private final ModelRenderer Body_r1;
	private final ModelRenderer Bodywhite;
	private final ModelRenderer Bodyred;
	private final ModelRenderer RightArmred;
	private final ModelRenderer RightArmwhite;
	private final ModelRenderer RightArmdarkgray;
	private final ModelRenderer RightArmpurple;
	private final ModelRenderer RightArmyellow;
	private final ModelRenderer LeftArmred;
	private final ModelRenderer LeftArmdarkgray;
	private final ModelRenderer LeftArmwhite;
	private final ModelRenderer LeftArmyellow;
	private final ModelRenderer LeftArmpurple;
	private final ModelRenderer RightLegred;
	private final ModelRenderer RightLegdarkgray;
	private final ModelRenderer RightLegpurple;
	private final ModelRenderer LeftLegred;
	private final ModelRenderer LeftLegdarkgray;
	private final ModelRenderer LeftLegpurple;

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
	
	public darkprotomanexe(float modelSize, EquipmentSlotType slot) {
		super(modelSize);
		texWidth = 86;
		texHeight = 182;
		
		equipmentslot = slot;
		
		MainColorDefault = 11731009;//Main Body Color Dark Redish Purple
		SecondaryColorDefault = 6958199;//Secondary Dark purple
		ThirdColorDefault = 16754949; //Slightly Orangish Yellow
		WhiteColorDefault = 16777215;//Basic White
		GlowyColorDefault = 16754949;//Glow? Yellow
		GrayColorDefault = 14079702;//Light Gray
		FourthColorDefault = 5002091; //Dark Blue Gray 

		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
		FourthColor = FourthColorDefault;

		Headred = new ModelRenderer(this);
		Headred.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headred, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headred.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headred.texOffs(19, 67).addBox(-3.6706F, -7.6327F, -3.8533F, 8.0F, 7.0F, 8.0F, 0.55F, false);
		Headred.texOffs(72, 0).addBox(0.0F, -15.0F, -5.0F, 0.0F, 6.0F, 3.0F, 0.0F, false);
		}
		
		Headyellowglow = new ModelRenderer(this);
		Headyellowglow.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headyellowglow, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headyellowglow.texOffs(0, 166).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Headpurple = new ModelRenderer(this);
		Headpurple.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headpurple, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headpurple.texOffs(0, 134).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Headblack = new ModelRenderer(this);
		Headblack.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headblack, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headblack.texOffs(33, 150).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Headredvisor = new ModelRenderer(this);
		Headredvisor.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headredvisor, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headredvisor.texOffs(0, 150).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Headlightgray = new ModelRenderer(this);
		Headlightgray.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headlightgray, -0.1047F, 0.0873F, 0.0F);
		

		Head_r1 = new ModelRenderer(this);
		Head_r1.setPos(0.0F, 24.0F, 0.0F);
		Headlightgray.addChild(Head_r1);
		setRotationAngle(Head_r1, 0.2182F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head_r1.texOffs(60, 99).addBox(-3.0F, -22.0F, 10.0F, 6.0F, 12.0F, 6.0F, 0.3F, false);
		}
		
		Bodygrayblack = new ModelRenderer(this);
		Bodygrayblack.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodygrayblack.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.51F, false);
		Bodygrayblack.texOffs(35, 53).addBox(-2.5F, -0.5F, -3.0F, 5.0F, 5.0F, 0.0F, -1.02F, false);
		}
		
		Bodyyellow = new ModelRenderer(this);
		Bodyyellow.setPos(0.0F, 0.0F, 0.0F);
		

		Body_r1 = new ModelRenderer(this);
		Body_r1.setPos(1.0F, 17.0F, 4.0F);
		Bodyyellow.addChild(Body_r1);
		setRotationAngle(Body_r1, 0.0F, 3.1416F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Body_r1.texOffs(19, 59).addBox(-2.0F, -18.0F, 6.8F, 6.0F, 6.0F, 1.0F, -1.02F, false);
		}
		
		Bodywhite = new ModelRenderer(this);
		Bodywhite.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodywhite.texOffs(19, 53).addBox(-2.5F, -0.5F, -3.0F, 5.0F, 5.0F, 0.0F, -1.02F, false);
		}
		
		Bodyred = new ModelRenderer(this);
		Bodyred.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyred.texOffs(16, 32).addBox(-4.5F, 0.0F, -2.5F, 9.0F, 10.0F, 5.0F, 0.51F, false);
		}
		
		RightArmred = new ModelRenderer(this);
		RightArmred.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmred, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmred.texOffs(44, 32).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 3.0F, 4.0F, 0.75F, false);
		RightArmred.texOffs(21, 103).addBox(-3.0F, -2.3609F, -2.0F, 4.0F, 3.0F, 4.0F, 0.75F, false);
		RightArmred.texOffs(61, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		RightArmwhite = new ModelRenderer(this);
		RightArmwhite.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmwhite, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmwhite.texOffs(57, 79).addBox(-4.2F, 7.0F, -2.0F, 1.0F, 4.0F, 4.0F, -0.5F, false);
		}
		
		RightArmdarkgray = new ModelRenderer(this);
		RightArmdarkgray.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmdarkgray, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmdarkgray.texOffs(57, 89).addBox(-4.2F, 7.0F, -2.0F, 1.0F, 4.0F, 4.0F, -0.5F, false);
		RightArmdarkgray.texOffs(44, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		RightArmdarkgray.texOffs(41, 170).addBox(-3.0F, -2.3609F, -2.0F, 4.0F, 3.0F, 4.0F, 0.75F, false);
		}
		
		RightArmpurple = new ModelRenderer(this);
		RightArmpurple.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmpurple, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmpurple.texOffs(54, 65).addBox(-7.0F, 1.0F, -1.0F, 3.0F, 7.0F, 1.0F, 0.5F, false);
		RightArmpurple.texOffs(61, 65).addBox(-7.0F, 1.0F, 2.0F, 3.0F, 7.0F, 1.0F, 0.5F, false);
		}
		
		RightArmyellow = new ModelRenderer(this);
		RightArmyellow.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmyellow, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmyellow.texOffs(42, 2).addBox(-4.2F, 7.0F, -2.0F, 1.0F, 4.0F, 4.0F, -0.5F, false);
		RightArmyellow.texOffs(42, 137).addBox(-3.0F, -2.3609F, -2.0F, 4.0F, 3.0F, 4.0F, 0.75F, false);
		}
		
		LeftArmred = new ModelRenderer(this);
		LeftArmred.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmred, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmred.texOffs(61, 40).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArmred.texOffs(44, 56).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 3.0F, 4.0F, 0.75F, false);
		LeftArmred.texOffs(39, 103).addBox(-1.0F, -2.3609F, -2.0F, 4.0F, 3.0F, 4.0F, 0.75F, false);
		}
		
		LeftArmdarkgray = new ModelRenderer(this);
		LeftArmdarkgray.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmdarkgray, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmdarkgray.texOffs(45, 40).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArmdarkgray.texOffs(75, 89).addBox(3.1F, 7.0F, -2.0F, 1.0F, 4.0F, 4.0F, -0.5F, false);
		LeftArmdarkgray.texOffs(59, 170).addBox(-1.0F, -2.3609F, -2.0F, 4.0F, 3.0F, 4.0F, 0.75F, false);
		}
		
		LeftArmwhite = new ModelRenderer(this);
		LeftArmwhite.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmwhite, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmwhite.texOffs(73, 79).addBox(3.1F, 7.0F, -2.0F, 1.0F, 4.0F, 4.0F, -0.5F, false);
		}
		
		LeftArmyellow = new ModelRenderer(this);
		LeftArmyellow.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmyellow, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmyellow.texOffs(54, 2).addBox(3.1F, 7.0F, -2.0F, 1.0F, 4.0F, 4.0F, -0.5F, false);
		LeftArmyellow.texOffs(60, 137).addBox(-1.0F, -2.3609F, -2.0F, 4.0F, 3.0F, 4.0F, 0.75F, false);
		}
		
		LeftArmpurple = new ModelRenderer(this);
		LeftArmpurple.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmpurple, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmpurple.texOffs(70, 65).addBox(4.0F, 1.0F, -1.0F, 3.0F, 7.0F, 1.0F, 0.5F, true);
		LeftArmpurple.texOffs(77, 65).addBox(4.0F, 1.0F, 2.0F, 3.0F, 7.0F, 1.0F, 0.5F, true);
		}
		
		RightLegred = new ModelRenderer(this);
		RightLegred.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegred, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegred.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		RightLegred.texOffs(19, 85).addBox(-2.0F, 4.0F, -2.0F, 4.0F, 1.0F, 4.0F, 1.5F, false);
		}
		
		RightLegdarkgray = new ModelRenderer(this);
		RightLegdarkgray.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegdarkgray, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegdarkgray.texOffs(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLegpurple = new ModelRenderer(this);
		RightLegpurple.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegpurple, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegpurple.texOffs(0, 80).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		RightLegpurple.texOffs(0, 117).addBox(-3.0F, 2.0F, -6.0F, 1.0F, 4.0F, 3.0F, 1.5F, false);
		}
		
		LeftLegred = new ModelRenderer(this);
		LeftLegred.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegred, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegred.texOffs(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		LeftLegred.texOffs(36, 85).addBox(-2.0F, 4.0F, -2.0F, 4.0F, 1.0F, 4.0F, 1.5F, true);
		}
		
		LeftLegdarkgray = new ModelRenderer(this);
		LeftLegdarkgray.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegdarkgray, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegdarkgray.texOffs(0, 64).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLegpurple = new ModelRenderer(this);
		LeftLegpurple.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegpurple, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegpurple.texOffs(0, 96).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		LeftLegpurple.texOffs(10, 117).addBox(2.0F, 2.0F, -5.0F, 1.0F, 4.0F, 3.0F, 1.5F, true);
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
		this.Headred.copyFrom(this.head);
		Headred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
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
		
		fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.ThirdColor & 255) / 255.0F;
		this.Headyellowglow.copyFrom(this.head);
		Headyellowglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodyyellow.copyFrom(this.body);
		Bodyyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmyellow.copyFrom(this.rightArm);
		RightArmyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmyellow.copyFrom(this.leftArm);
		LeftArmyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
		this.Headpurple.copyFrom(this.head);
		Headpurple.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmpurple.copyFrom(this.rightArm);
		RightArmpurple.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmpurple.copyFrom(this.leftArm);
		LeftArmpurple.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegpurple.copyFrom(this.rightLeg);
		RightLegpurple.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegpurple.copyFrom(this.leftLeg);
		LeftLegpurple.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.FourthColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.FourthColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.FourthColor & 255) / 255.0F;
		this.Headblack.copyFrom(this.head);
		Headblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodygrayblack.copyFrom(this.body);
		Bodygrayblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmdarkgray.copyFrom(this.rightArm);
		RightArmdarkgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmdarkgray.copyFrom(this.leftArm);
		LeftArmdarkgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegdarkgray.copyFrom(this.rightLeg);
		RightLegdarkgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegdarkgray.copyFrom(this.leftLeg);
		LeftLegdarkgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		
		this.Headredvisor.copyFrom(this.head);
		Headredvisor.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		
		fred = (float)( this.GrayColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GrayColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GrayColor & 255) / 255.0F;
		this.Headlightgray.copyFrom(this.head);
		Headlightgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.WhiteColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.WhiteColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.WhiteColor & 255) / 255.0F;
		this.Bodywhite.copyFrom(this.body);
		Bodywhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmwhite.copyFrom(this.rightArm);
		RightArmwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmwhite.copyFrom(this.leftArm);
		LeftArmwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
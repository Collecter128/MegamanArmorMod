package com.collecter128.megamanarmormod.client.models;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

// Made with Blockbench 4.7.1
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports

@OnlyIn(Dist.CLIENT)
public class hubstyle extends BipedModel {
	private final ModelRenderer Headgreen;
	private final ModelRenderer Headyellow;
	private final ModelRenderer Headgreenglow;
	private final ModelRenderer Headlightbluegreen;
	private final ModelRenderer Headred;
	private final ModelRenderer Head_r1;
	private final ModelRenderer Headhair;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer Bodylightgreenglow;
	private final ModelRenderer Bodydarkgreen;
	private final ModelRenderer Bodyyellow;
	private final ModelRenderer Body_r1;
	private final ModelRenderer Bodyred;
	private final ModelRenderer cube_r3;
	private final ModelRenderer Body_r2;
	private final ModelRenderer Bodygreen;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer Body_r3;
	private final ModelRenderer RightArmgreen;
	private final ModelRenderer RightArmdarkgreen;
	private final ModelRenderer RightArmyellow;
	private final ModelRenderer LeftArmgreen;
	private final ModelRenderer LeftArmdarkgreen;
	private final ModelRenderer LeftArmyellow;
	private final ModelRenderer RightLeggreen;
	private final ModelRenderer RightLeggreenglow;
	private final ModelRenderer RightLegdarkgreen;
	private final ModelRenderer LeftLeggreen;
	private final ModelRenderer LeftLeggreenglow;
	private final ModelRenderer LeftLegdarkgreen;
	
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

	public hubstyle(float modelSize, EquipmentSlotType slot) {
		super(modelSize);
		texWidth = 74;
		texHeight = 181;
		
		equipmentslot = slot;
		
		MainColorDefault = 5439433;//Main Body green
		SecondaryColorDefault = 415304;//Secondary Dark Green
		ThirdColorDefault = 16630571; //golden?
		WhiteColorDefault = 2378966;//
		GlowyColorDefault = 16646401;//red
		GrayColorDefault = 2378966;//
		FourthColorDefault = 65428; //Blue Green
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
		FourthColor = FourthColorDefault;

		Headgreen = new ModelRenderer(this);
		Headgreen.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headgreen, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headgreen.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headgreen.texOffs(0, 56).addBox(-3.6706F, -7.6327F, -3.8533F, 8.0F, 7.0F, 8.0F, 0.55F, false);
		}
		
		Headyellow = new ModelRenderer(this);
		Headyellow.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headyellow, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headyellow.texOffs(34, 64).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headyellow.texOffs(37, 4).addBox(5.4872F, -4.841F, -1.5659F, 1.0F, 4.0F, 4.0F, 0.5F, false);
		Headyellow.texOffs(50, 4).addBox(-5.8938F, -4.8448F, -1.5287F, 1.0F, 4.0F, 4.0F, 0.5F, false);
		}
		
		Headgreenglow = new ModelRenderer(this);
		Headgreenglow.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headgreenglow, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headgreenglow.texOffs(35, 165).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Headlightbluegreen = new ModelRenderer(this);
		Headlightbluegreen.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headlightbluegreen, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headlightbluegreen.texOffs(34, 80).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Headred = new ModelRenderer(this);
		Headred.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headred, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headred.texOffs(52, 9).addBox(-6.3038F, -5.3091F, -1.9133F, 0.0F, 5.0F, 5.0F, -0.5F, false);
		}
		
		Head_r1 = new ModelRenderer(this);
		Head_r1.setPos(0.0F, 24.0F, 0.0F);
		Headred.addChild(Head_r1);
		setRotationAngle(Head_r1, 0.0F, 3.1416F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head_r1.texOffs(62, 2).addBox(-6.5F, -29.3F, -2.8F, 0.0F, 5.0F, 5.0F, -0.4F, false);
		}
		
		Headhair = new ModelRenderer(this);
		Headhair.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headhair, -0.1047F, 0.0873F, 0.0F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0F, 0.0F, 0.0F);
		Headhair.addChild(cube_r1);
		setRotationAngle(cube_r1, -1.1781F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		cube_r1.texOffs(58, 131).addBox(-4.1487F, -9.5153F, 0.5108F, 7.0F, 5.0F, 0.0F, 0.0F, false);
		}
		
		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(0.0F, 0.0F, 0.0F);
		Headhair.addChild(cube_r2);
		setRotationAngle(cube_r2, -1.9199F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		cube_r2.texOffs(58, 121).addBox(-3.7999F, -8.2606F, -3.4881F, 7.0F, 4.0F, 0.0F, 0.0F, false);
		}
		
		Bodylightgreenglow = new ModelRenderer(this);
		Bodylightgreenglow.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodylightgreenglow.texOffs(11, 103).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		}
		
		Bodydarkgreen = new ModelRenderer(this);
		Bodydarkgreen.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodydarkgreen.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.51F, false);
		}
		
		Bodyyellow = new ModelRenderer(this);
		Bodyyellow.setPos(0.0F, 0.0F, 0.0F);
		

		Body_r1 = new ModelRenderer(this);
		Body_r1.setPos(1.0F, 18.0F, -4.0F);
		Bodyyellow.addChild(Body_r1);
		setRotationAngle(Body_r1, 0.0F, 3.1416F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Body_r1.texOffs(19, 43).addBox(-2.0F, -18.0F, -1.2F, 6.0F, 6.0F, 1.0F, -1.02F, false);
		}
		
		Bodyred = new ModelRenderer(this);
		Bodyred.setPos(0.0F, 0.0F, 0.0F);
		

		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(-1.0F, 6.0F, 4.0F);
		Bodyred.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 3.1416F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		cube_r3.texOffs(68, 127).addBox(-2.0F, -2.0F, 0.2F, 2.0F, 2.0F, 0.0F, 0.5F, false);
		}
		
		Body_r2 = new ModelRenderer(this);
		Body_r2.setPos(2.0F, 17.0F, -5.0F);
		Bodyred.addChild(Body_r2);
		setRotationAngle(Body_r2, 0.0F, 3.1416F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Body_r2.texOffs(21, 37).addBox(-0.5F, -16.5F, -2.0F, 5.0F, 5.0F, 0.0F, -1.02F, false);
		}
		
		Bodygreen = new ModelRenderer(this);
		Bodygreen.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodygreen.texOffs(64, 114).addBox(-1.0F, 6.6F, 3.5F, 2.0F, 3.0F, 1.0F, -0.5F, false);
		}
		
		cube_r4 = new ModelRenderer(this);
		cube_r4.setPos(-2.0F, 8.0F, 4.0F);
		Bodygreen.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.7854F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		cube_r4.texOffs(50, 110).addBox(-1.6F, -2.4F, -1.0F, 2.0F, 2.0F, 2.0F, -0.5F, false);
		}
		
		cube_r5 = new ModelRenderer(this);
		cube_r5.setPos(-2.0F, 0.0F, 4.0F);
		Bodygreen.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.7854F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		cube_r5.texOffs(63, 106).addBox(-1.6F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F, -0.5F, false);
		}
		
		cube_r6 = new ModelRenderer(this);
		cube_r6.setPos(3.0F, 9.0F, 4.0F);
		Bodygreen.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.7854F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		cube_r6.texOffs(39, 110).addBox(-2.0F, -2.4F, -1.0F, 2.0F, 2.0F, 2.0F, -0.5F, false);
		}
		
		cube_r7 = new ModelRenderer(this);
		cube_r7.setPos(3.0F, 1.0F, 4.0F);
		Bodygreen.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.7854F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		cube_r7.texOffs(63, 99).addBox(-1.7F, -3.1F, -1.0F, 2.0F, 3.0F, 2.0F, -0.5F, false);
		}
		
		Body_r3 = new ModelRenderer(this);
		Body_r3.setPos(0.0F, 20.0F, 3.0F);
		Bodygreen.addChild(Body_r3);
		setRotationAngle(Body_r3, 0.0F, 3.1416F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Body_r3.texOffs(38, 97).addBox(-4.0F, -21.0F, -2.0F, 8.0F, 9.0F, 2.0F, -0.5F, false);
		}
		
		RightArmgreen = new ModelRenderer(this);
		RightArmgreen.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmgreen, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmgreen.texOffs(40, 32).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 3.0F, 4.0F, 0.75F, false);
		RightArmgreen.texOffs(57, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		RightArmdarkgreen = new ModelRenderer(this);
		RightArmdarkgreen.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmdarkgreen, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmdarkgreen.texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		RightArmyellow = new ModelRenderer(this);
		RightArmyellow.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmyellow, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmyellow.texOffs(0, 84).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		LeftArmgreen = new ModelRenderer(this);
		LeftArmgreen.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgreen, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmgreen.texOffs(57, 40).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArmgreen.texOffs(40, 56).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 3.0F, 4.0F, 0.75F, false);
		}
		
		LeftArmdarkgreen = new ModelRenderer(this);
		LeftArmdarkgreen.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmdarkgreen, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmdarkgreen.texOffs(40, 40).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		LeftArmyellow = new ModelRenderer(this);
		LeftArmyellow.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmyellow, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmyellow.texOffs(21, 84).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		RightLeggreen = new ModelRenderer(this);
		RightLeggreen.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeggreen, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLeggreen.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		RightLeggreen.texOffs(0, 73).addBox(-2.0F, 4.0F, -2.0F, 4.0F, 1.0F, 4.0F, 1.5F, false);
		}
		
		RightLeggreenglow = new ModelRenderer(this);
		RightLeggreenglow.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeggreenglow, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLeggreenglow.texOffs(0, 157).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLegdarkgreen = new ModelRenderer(this);
		RightLegdarkgreen.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegdarkgreen, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegdarkgreen.texOffs(35, 149).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		LeftLeggreen = new ModelRenderer(this);
		LeftLeggreen.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeggreen, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLeggreen.texOffs(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		LeftLeggreen.texOffs(17, 73).addBox(-2.0F, 4.0F, -2.0F, 4.0F, 1.0F, 4.0F, 1.5F, true);
		}
		
		LeftLeggreenglow = new ModelRenderer(this);
		LeftLeggreenglow.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeggreenglow, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLeggreenglow.texOffs(19, 157).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLegdarkgreen = new ModelRenderer(this);
		LeftLegdarkgreen.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegdarkgreen, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegdarkgreen.texOffs(54, 149).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
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
		this.Headgreen.copyFrom(this.head);
		Headgreen.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodygreen.copyFrom(this.body);
		Bodygreen.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmgreen.copyFrom(this.rightArm);
		RightArmgreen.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmgreen.copyFrom(this.leftArm);
		LeftArmgreen.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLeggreen.copyFrom(this.rightLeg);
		RightLeggreen.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeggreen.copyFrom(this.leftLeg);
		LeftLeggreen.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		
		this.Headgreenglow.copyFrom(this.head);
		Headgreenglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodylightgreenglow.copyFrom(this.body);
		Bodylightgreenglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLeggreenglow.copyFrom(this.rightLeg);
		RightLeggreenglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeggreenglow.copyFrom(this.leftLeg);
		LeftLeggreenglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
		this.Bodydarkgreen.copyFrom(this.body);
		Bodydarkgreen.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmdarkgreen.copyFrom(this.rightArm);
		RightArmdarkgreen.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmdarkgreen.copyFrom(this.leftArm);
		LeftArmdarkgreen.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegdarkgreen.copyFrom(this.rightLeg);
		RightLegdarkgreen.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegdarkgreen.copyFrom(this.leftLeg);
		LeftLegdarkgreen.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.ThirdColor & 255) / 255.0F;
		this.Headyellow.copyFrom(this.head);
		Headyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodyyellow.copyFrom(this.body);
		Bodyyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmyellow.copyFrom(this.rightArm);
		RightArmyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmyellow.copyFrom(this.leftArm);
		LeftArmyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.FourthColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.FourthColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.FourthColor & 255) / 255.0F;
		this.Headlightbluegreen.copyFrom(this.head);
		Headlightbluegreen.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
		this.Headred.copyFrom(this.head);
		Headred.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodyred.copyFrom(this.body);
		Bodyred.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		
		
		this.Headhair.copyFrom(this.head);
		Headhair.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
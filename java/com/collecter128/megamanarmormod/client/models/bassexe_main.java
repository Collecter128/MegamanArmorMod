package com.collecter128.megamanarmormod.client.models;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports

@OnlyIn(Dist.CLIENT)
public class bassexe_main extends BipedModel {
	private final ModelRenderer Headblack;
	private final ModelRenderer cube_r1;
	private final ModelRenderer LFin_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer RFin_r1;
	private final ModelRenderer Headgold;
	private final ModelRenderer cube_r3;
	private final ModelRenderer LFin_r2;
	private final ModelRenderer cube_r4;
	private final ModelRenderer RFin_r2;
	private final ModelRenderer Headgray;
	private final ModelRenderer Headglowblue;
	private final ModelRenderer Bodyblack;
	private final ModelRenderer Bodypurple;
	private final ModelRenderer Bodyyellow;
	private final ModelRenderer Bodywhite;
	private final ModelRenderer RightArmblack;
	private final ModelRenderer RightArmyellow;
	private final ModelRenderer RightArm_r1;
	private final ModelRenderer RightArmwhite;
	private final ModelRenderer LeftArmblack;
	private final ModelRenderer LeftArmyellow;
	private final ModelRenderer LeftArm_r1;
	private final ModelRenderer LeftArmwhite;
	private final ModelRenderer RightLegblack;
	private final ModelRenderer RightLegwhite;
	private final ModelRenderer RightLeggold;
	private final ModelRenderer LeftLegblack;
	private final ModelRenderer LeftLegwhite;
	private final ModelRenderer LeftLeggold;
	
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
	
	EquipmentSlotType equipmentslot;

	public bassexe_main(float modelSize, EquipmentSlotType slot) {
		super(modelSize);
		texWidth = 96;
		texHeight = 184;
		
		equipmentslot = slot;
		
		MainColorDefault = 4604492;//Main Body Color Black
		SecondaryColorDefault = 16694555;//Secondary Yellow
		ThirdColorDefault = 16694555; //gold/yellow
		WhiteColorDefault = 16777215;//Basic White
		GlowyColorDefault = 6651843;//Glow? blue
		GrayColorDefault = 11053224;//gray
		FourthColorDefault = 10250937; // purple (Hubstyle bass green 65428) 
		FifthColorDefault = 6651843; //Blue
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
		FourthColor = FourthColorDefault;
		FifthColor = FifthColorDefault;

		Headblack = new ModelRenderer(this);
		Headblack.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headblack, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headblack.texOffs(0, 3).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headblack.texOffs(61, 106).addBox(-3.6706F, -7.6327F, -3.8533F, 8.0F, 7.0F, 8.0F, 0.55F, false);
		}
		
		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0F, 0.0F, 0.0F);
		Headblack.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.2618F, -0.2618F, -0.2618F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		cube_r1.texOffs(46, 79).addBox(3.8F, -7.3064F, 4.0417F, 8.0F, 9.0F, 1.0F, 0.0F, false);
		}
		
		LFin_r1 = new ModelRenderer(this);
		LFin_r1.setPos(0.0F, 0.0F, 0.0F);
		Headblack.addChild(LFin_r1);
		setRotationAngle(LFin_r1, 0.0F, 0.0F, -0.7854F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		LFin_r1.texOffs(0, 82).addBox(4.2961F, -2.8609F, -6.0489F, 9.0F, 1.0F, 12.0F, 0.0F, false);
		}
		
		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(0.0F, 0.0F, 0.0F);
		Headblack.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.2618F, 0.2618F, 0.2618F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		cube_r2.texOffs(46, 89).addBox(-12.0F, -7.086F, 4.4969F, 8.0F, 9.0F, 1.0F, 0.0F, false);
		}
		
		RFin_r1 = new ModelRenderer(this);
		RFin_r1.setPos(0.0F, 0.0F, 0.0F);
		Headblack.addChild(RFin_r1);
		setRotationAngle(RFin_r1, 0.0F, 0.0F, 0.7854F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		RFin_r1.texOffs(0, 68).addBox(-13.2135F, -2.9693F, -6.0F, 9.0F, 1.0F, 12.0F, 0.0F, false);
		}
		
		Headgold = new ModelRenderer(this);
		Headgold.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headgold, -0.1047F, 0.0873F, 0.0F);
		

		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(0.0F, 0.0F, 0.0F);
		Headgold.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.2618F, -0.2618F, -0.2618F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		cube_r3.texOffs(51, 158).addBox(3.8F, -7.3064F, 4.0417F, 8.0F, 9.0F, 1.0F, 0.0F, false);
		}
		
		LFin_r2 = new ModelRenderer(this);
		LFin_r2.setPos(0.0F, 0.0F, 0.0F);
		Headgold.addChild(LFin_r2);
		setRotationAngle(LFin_r2, 0.0F, 0.0F, -0.7854F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		LFin_r2.texOffs(0, 170).addBox(4.2961F, -2.8609F, -6.0489F, 9.0F, 1.0F, 12.0F, 0.0F, false);
		}
		
		cube_r4 = new ModelRenderer(this);
		cube_r4.setPos(0.0F, 0.0F, 0.0F);
		Headgold.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.2618F, 0.2618F, 0.2618F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		cube_r4.texOffs(51, 168).addBox(-12.0F, -7.086F, 4.4969F, 8.0F, 9.0F, 1.0F, 0.0F, false);
		}
		
		RFin_r2 = new ModelRenderer(this);
		RFin_r2.setPos(0.0F, 0.0F, 0.0F);
		Headgold.addChild(RFin_r2);
		setRotationAngle(RFin_r2, 0.0F, 0.0F, 0.7854F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		RFin_r2.texOffs(0, 156).addBox(-13.2135F, -2.9693F, -6.0F, 9.0F, 1.0F, 12.0F, 0.0F, false);
		}
		
		Headgray = new ModelRenderer(this);
		Headgray.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headgray, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headgray.texOffs(51, 11).addBox(5.0F, -5.0F, -1.6519F, 1.0F, 4.0F, 4.0F, 0.5F, false);
		Headgray.texOffs(37, 11).addBox(-5.7F, -5.0F, -1.6147F, 1.0F, 4.0F, 4.0F, 0.5F, false);
		}
		
		Headglowblue = new ModelRenderer(this);
		Headglowblue.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headglowblue, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headglowblue.texOffs(43, 2).addBox(-1.5114F, -9.8794F, -5.216F, 3.0F, 5.0F, 1.0F, 0.1F, false);
		Headglowblue.texOffs(49, 7).addBox(5.5F, -4.5F, -1.0F, 0.0F, 3.0F, 3.0F, 0.5F, false);
		Headglowblue.texOffs(35, 7).addBox(-4.3F, -4.6311F, -1.0F, 0.0F, 3.0F, 3.0F, 0.5F, false);
		}
		
		Bodyblack = new ModelRenderer(this);
		Bodyblack.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyblack.texOffs(16, 19).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.51F, false);
		Bodyblack.texOffs(16, 35).addBox(-3.0F, 0.0F, -3.0F, 6.0F, 6.0F, 1.0F, -1.3F, false);
		}
		
		Bodypurple = new ModelRenderer(this);
		Bodypurple.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodypurple.texOffs(1, 99).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.51F, false);
		}
		
		Bodyyellow = new ModelRenderer(this);
		Bodyyellow.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyyellow.texOffs(16, 43).addBox(-3.0F, 0.0F, -3.0F, 6.0F, 6.0F, 1.0F, -1.3F, false);
		Bodyyellow.texOffs(29, 104).addBox(1.4F, 1.7F, 2.0F, 2.0F, 3.0F, 1.0F, -0.3F, false);
		Bodyyellow.texOffs(37, 104).addBox(-3.3F, 1.7F, 2.0F, 2.0F, 3.0F, 1.0F, -0.3F, false);
		}
		
		Bodywhite = new ModelRenderer(this);
		Bodywhite.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodywhite.texOffs(30, 43).addBox(-3.0F, 0.0F, -3.0F, 6.0F, 6.0F, 1.0F, -1.3F, false);
		Bodywhite.texOffs(76, 8).addBox(-3.5F, -0.5F, -3.9F, 7.0F, 7.0F, 1.0F, -1.0F, false);
		}
		
		RightArmblack = new ModelRenderer(this);
		RightArmblack.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmblack, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmblack.texOffs(44, 30).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		RightArmblack.texOffs(61, 46).addBox(-3.0F, 1.6391F, -2.0F, 4.0F, 6.0F, 4.0F, 0.75F, false);
		}
		
		RightArmyellow = new ModelRenderer(this);
		RightArmyellow.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmyellow, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmyellow.texOffs(66, 11).addBox(-2.0F, -3.2019F, -0.5F, 2.0F, 1.0F, 1.0F, 0.8F, false);
		RightArmyellow.texOffs(75, 166).addBox(-3.0F, 1.6391F, -2.0F, 4.0F, 6.0F, 4.0F, 0.8F, false);
		}
		
		RightArm_r1 = new ModelRenderer(this);
		RightArm_r1.setPos(-1.0F, 0.0F, 0.0F);
		RightArmyellow.addChild(RightArm_r1);
		setRotationAngle(RightArm_r1, 0.0F, 0.0F, 0.3054F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArm_r1.texOffs(41, 23).addBox(-5.0F, -2.2019F, -2.0F, 6.0F, 2.0F, 4.0F, 0.8F, false);
		}
		
		RightArmwhite = new ModelRenderer(this);
		RightArmwhite.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmwhite, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmwhite.texOffs(44, 57).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		LeftArmblack = new ModelRenderer(this);
		LeftArmblack.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmblack, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmblack.texOffs(61, 30).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArmblack.texOffs(44, 46).addBox(-1.0F, 1.6391F, -2.0F, 4.0F, 6.0F, 4.0F, 0.75F, false);
		}
		
		LeftArmyellow = new ModelRenderer(this);
		LeftArmyellow.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmyellow, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmyellow.texOffs(66, 14).addBox(0.0F, -3.3756F, -0.5F, 2.0F, 1.0F, 1.0F, 0.8F, false);
		LeftArmyellow.texOffs(75, 152).addBox(-1.0F, 1.6391F, -2.0F, 4.0F, 6.0F, 4.0F, 0.75F, false);
		}
		
		LeftArm_r1 = new ModelRenderer(this);	
		LeftArm_r1.setPos(1.0F, 0.0F, 0.0F);
		LeftArmyellow.addChild(LeftArm_r1);
		setRotationAngle(LeftArm_r1, 0.0F, 0.0F, -0.3054F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArm_r1.texOffs(62, 23).addBox(-1.0F, -2.3756F, -1.7921F, 6.0F, 2.0F, 4.0F, 0.8F, false);
		}
		
		LeftArmwhite = new ModelRenderer(this);
		LeftArmwhite.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmwhite, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmwhite.texOffs(61, 57).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		RightLegblack = new ModelRenderer(this);
		RightLegblack.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegblack, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegblack.texOffs(78, 63).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLegwhite = new ModelRenderer(this);
		RightLegwhite.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegwhite, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegwhite.texOffs(0, 19).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLeggold = new ModelRenderer(this);
		RightLeggold.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeggold, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLeggold.texOffs(78, 30).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		RightLeggold.texOffs(2, 52).addBox(-2.0F, 4.0F, -2.0F, 4.0F, 8.0F, 4.0F, 1.3F, false);
		RightLeggold.texOffs(68, 131).addBox(-1.6F, 3.0F, -2.0F, 3.0F, 2.0F, 1.0F, 1.0F, false);
		}
		
		LeftLegblack = new ModelRenderer(this);
		LeftLegblack.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegblack, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegblack.texOffs(78, 79).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLegwhite = new ModelRenderer(this);
		LeftLegwhite.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegwhite, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegwhite.texOffs(0, 35).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLeggold = new ModelRenderer(this);
		LeftLeggold.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeggold, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLeggold.texOffs(78, 46).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		LeftLeggold.texOffs(22, 52).addBox(-2.0F, 4.0F, -2.0F, 4.0F, 8.0F, 4.0F, 1.3F, true);
		LeftLeggold.texOffs(68, 139).addBox(-1.4F, 3.0F, -2.0F, 3.0F, 2.0F, 1.0F, 1.0F, true);
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
		this.Headblack.copyFrom(this.head);
		Headblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
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
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
		this.Headgold.copyFrom(this.head);
		Headgold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmyellow.copyFrom(this.rightArm);
		RightArmyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmyellow.copyFrom(this.leftArm);
		LeftArmyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLeggold.copyFrom(this.rightLeg);
		RightLeggold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeggold.copyFrom(this.leftLeg);
		LeftLeggold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
//		fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
//        fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
//        fblue = (float)(this.ThirdColor & 255) / 255.0F;
		this.Bodyyellow.copyFrom(this.body);
		Bodyyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.FourthColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.FourthColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.FourthColor & 255) / 255.0F;
		this.Bodypurple.copyFrom(this.body);
		Bodypurple.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GrayColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GrayColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GrayColor & 255) / 255.0F;
		this.Headgray.copyFrom(this.head);
		Headgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
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
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
		this.Headglowblue.copyFrom(this.head);
		Headglowblue.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);

	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
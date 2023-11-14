package com.collecter128.megamanarmormod.client.models;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports

@OnlyIn(Dist.CLIENT)
public class zeromainnew2 extends BipedModel {
	private final ModelRenderer Head;
	private final ModelRenderer Headwhite;
	private final ModelRenderer Headsilver;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer Headgold;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer Headglowblue;
	private final ModelRenderer Body;
	private final ModelRenderer Bodywhite;
	private final ModelRenderer Bodygold;
	private final ModelRenderer Bodyglowgreen;
	private final ModelRenderer Bodysecondary;
	private final ModelRenderer Bodygray;
	private final ModelRenderer RightArm;
	private final ModelRenderer RightArmwhite;
	private final ModelRenderer RightArmgray;
	private final ModelRenderer RightArmsecondary;
	private final ModelRenderer LeftArm;
	private final ModelRenderer LeftArmwhite;
	private final ModelRenderer LeftArmgray;
	private final ModelRenderer LeftArmsecondary;
	private final ModelRenderer RightLeg;
	private final ModelRenderer RightLegwhite;
	private final ModelRenderer RightLegyellow;
	private final ModelRenderer RightLegglowgreen;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer LeftLegwhite;
	private final ModelRenderer LeftLegyellow;
	private final ModelRenderer LeftLegglowgreen;
	
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

	public zeromainnew2(float modelSize, EquipmentSlotType slot) {
		super(modelSize);
		texWidth = 98;
		texHeight = 179;
		
		equipmentslot = slot;
		
		MainColorDefault = 16711680;//Main Body Color Zero Red
		SecondaryColorDefault = 2171169;//Secondary Black
		ThirdColorDefault = 16763151; // Hair
		WhiteColorDefault = 16777215;//Basic White
		GlowyColorDefault = 2448340;//Glow? 
		GrayColorDefault = 16777215;//Basic White
		//FourthColorDefault = ???; //
		FifthColorDefault = 2935135; //green
		
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
		//FourthColor = FourthColorDefault;
		FifthColor = FifthColorDefault;

		Head = new ModelRenderer(this);
		Head.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Head, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head.texOffs(0, 4).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Head.texOffs(32, 0).addBox(-3.6706F, -12.6327F, -3.8533F, 8.0F, 12.0F, 8.0F, 1.55F, false);
		}
		
		Headwhite = new ModelRenderer(this);
		Headwhite.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headwhite, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headwhite.texOffs(0, 116).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headwhite.texOffs(54, 71).addBox(5.0643F, -4.9396F, -0.6797F, 1.0F, 3.0F, 3.0F, 0.5F, false);
		Headwhite.texOffs(41, 71).addBox(-5.8938F, -4.8393F, -1.6332F, 1.0F, 3.0F, 3.0F, 0.5F, false);
		Headwhite.texOffs(32, 112).addBox(-3.6706F, -12.6327F, -3.8533F, 8.0F, 12.0F, 8.0F, 1.55F, false);
		}
		
		Headsilver = new ModelRenderer(this);
		Headsilver.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headsilver, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headsilver.texOffs(0, 163).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.75F, false);
		}
		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0F, -2.0F, 5.0F);
		Headsilver.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		cube_r1.texOffs(85, 10).addBox(-1.0F, -0.9F, -1.1853F, 2.0F, 2.0F, 1.0F, 0.5F, false);
		}
		
		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(0.0F, -2.0F, 5.0F);
		Headsilver.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.3491F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		cube_r2.texOffs(66, 69).addBox(-1.0F, -0.9517F, -0.1853F, 2.0F, 2.0F, 5.0F, 0.0F, false);
		}
		
		Headgold = new ModelRenderer(this);
		Headgold.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headgold, -0.1047F, 0.0873F, 0.0F);
		

		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(0.0F, -2.0F, 5.0F);
		Headgold.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.0436F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		cube_r3.texOffs(84, 3).addBox(-0.5F, -4.9F, -1.1853F, 1.0F, 3.0F, 1.0F, 0.5F, false);
		}
		
		cube_r4 = new ModelRenderer(this);
		cube_r4.setPos(0.0F, 0.0F, 10.0F);
		Headgold.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.3927F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		cube_r4.texOffs(41, 53).addBox(-3.0F, -1.1637F, -3.4193F, 6.0F, 12.0F, 6.0F, 0.0F, false);
		}
		
		Headglowblue = new ModelRenderer(this);
		Headglowblue.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headglowblue, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headglowblue.texOffs(55, 147).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headglowblue.texOffs(55, 131).addBox(-3.6706F, -7.6327F, -3.8533F, 8.0F, 7.0F, 8.0F, 1.55F, false);
		}
		
		Body = new ModelRenderer(this);
		Body.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Body.texOffs(16, 20).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.86F, false);
		}
		
		Bodywhite = new ModelRenderer(this);
		Bodywhite.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodywhite.texOffs(16, 68).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.86F, false);
		}
		
		Bodygold = new ModelRenderer(this);
		Bodygold.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodygold.texOffs(16, 52).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.86F, false);
		}
		
		Bodyglowgreen = new ModelRenderer(this);
		Bodyglowgreen.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyglowgreen.texOffs(16, 36).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.86F, false);
		}
		
		Bodysecondary = new ModelRenderer(this);
		Bodysecondary.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodysecondary.texOffs(16, 84).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		}
		
		Bodygray = new ModelRenderer(this);
		Bodygray.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodygray.texOffs(37, 163).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		}
		
		RightArm = new ModelRenderer(this);
		RightArm.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArm, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArm.texOffs(75, 28).addBox(-5.0F, -3.3755F, -1.5566F, 5.0F, 4.0F, 4.0F, 1.0F, false);
		RightArm.texOffs(75, 20).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		RightArmwhite = new ModelRenderer(this);
		RightArmwhite.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmwhite, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmwhite.texOffs(75, 36).addBox(-5.0F, -3.3755F, -1.5566F, 5.0F, 4.0F, 4.0F, 1.0F, false);
		RightArmwhite.texOffs(40, 36).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		RightArmgray = new ModelRenderer(this);
		RightArmgray.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmgray, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmgray.texOffs(77, 113).addBox(-3.0F, 8.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.77F, false);
		}
		
		RightArmsecondary = new ModelRenderer(this);
		RightArmsecondary.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmsecondary, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmsecondary.texOffs(40, 20).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		LeftArm = new ModelRenderer(this);
		LeftArm.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArm, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArm.texOffs(75, 52).addBox(0.0F, -3.3755F, -1.5566F, 5.0F, 4.0F, 4.0F, 1.0F, false);
		LeftArm.texOffs(75, 44).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		LeftArmwhite = new ModelRenderer(this);
		LeftArmwhite.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmwhite, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmwhite.texOffs(75, 60).addBox(0.0F, -3.3755F, -1.5566F, 5.0F, 4.0F, 4.0F, 1.0F, false);
		LeftArmwhite.texOffs(59, 36).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		LeftArmgray = new ModelRenderer(this);
		LeftArmgray.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgray, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmgray.texOffs(77, 120).addBox(-1.0F, 8.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.77F, false);
		}
		
		LeftArmsecondary = new ModelRenderer(this);
		LeftArmsecondary.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmsecondary, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmsecondary.texOffs(59, 20).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		RightLeg = new ModelRenderer(this);
		RightLeg.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeg, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLeg.texOffs(0, 20).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLegwhite = new ModelRenderer(this);
		RightLegwhite.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegwhite, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegwhite.texOffs(0, 84).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLegyellow = new ModelRenderer(this);
		RightLegyellow.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegyellow, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegyellow.texOffs(0, 52).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLegglowgreen = new ModelRenderer(this);
		RightLegglowgreen.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegglowgreen, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegglowgreen.texOffs(59, 90).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		LeftLeg = new ModelRenderer(this);
		LeftLeg.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeg, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLeg.texOffs(0, 36).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLegwhite = new ModelRenderer(this);
		LeftLegwhite.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegwhite, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegwhite.texOffs(0, 100).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLegyellow = new ModelRenderer(this);
		LeftLegyellow.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegyellow, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegyellow.texOffs(0, 68).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLegglowgreen = new ModelRenderer(this);
		LeftLegglowgreen.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegglowgreen, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegglowgreen.texOffs(77, 90).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
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
		this.Head.copyFrom(this.head);
		Head.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Body.copyFrom(this.body);
		Body.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArm.copyFrom(this.rightArm);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArm.copyFrom(this.leftArm);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLeg.copyFrom(this.rightLeg);
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeg.copyFrom(this.leftLeg);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.WhiteColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.WhiteColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.WhiteColor & 255) / 255.0F;
		this.Headwhite.copyFrom(this.head);
		Headwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
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
		
		fred = (float)( this.GrayColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GrayColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GrayColor & 255) / 255.0F;
		this.Headsilver.copyFrom(this.head);
		Headsilver.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodygray.copyFrom(this.body);
		Bodygray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmgray.copyFrom(this.rightArm);
		RightArmgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmgray.copyFrom(this.leftArm);
		LeftArmgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.ThirdColor & 255) / 255.0F;
		this.Headgold.copyFrom(this.head);
		Headgold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodygold.copyFrom(this.body);
		Bodygold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegyellow.copyFrom(this.rightLeg);
		RightLegyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegyellow.copyFrom(this.leftLeg);
		LeftLegyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
		this.Headglowblue.copyFrom(this.head);
		Headglowblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.FifthColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.FifthColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.FifthColor & 255) / 255.0F;
		this.Bodyglowgreen.copyFrom(this.body);
		Bodyglowgreen.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegglowgreen.copyFrom(this.rightLeg);
		RightLegglowgreen.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegglowgreen.copyFrom(this.leftLeg);
		LeftLegglowgreen.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
		this.Bodysecondary.copyFrom(this.body);
		Bodysecondary.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmsecondary.copyFrom(this.rightArm);
		RightArmsecondary.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmsecondary.copyFrom(this.leftArm);
		LeftArmsecondary.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
	
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
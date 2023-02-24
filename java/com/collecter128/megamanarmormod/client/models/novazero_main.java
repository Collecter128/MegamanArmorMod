package com.collecter128.megamanarmormod.client.models;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.inventory.EquipmentSlotType;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class novazero_main extends BipedModel {
	private final ModelRenderer Headgold;
	private final ModelRenderer Headsecondary;
	private final ModelRenderer cube_r1;
	private final ModelRenderer Headsilver;
	private final ModelRenderer cube_r2;
	private final ModelRenderer Headglow;
	private final ModelRenderer Bodysecondary;
	private final ModelRenderer Bodygold;
	private final ModelRenderer Bodysilver;
	private final ModelRenderer Bodygray;
	private final ModelRenderer RightArmGold;
	private final ModelRenderer RightArmsecondary;
	private final ModelRenderer RightArmsilver;
	private final ModelRenderer LeftArmGold;
	private final ModelRenderer LeftArmsecondary;
	private final ModelRenderer LeftArmsilver;
	private final ModelRenderer RightLeggold;
	private final ModelRenderer RightLegsilver;
	private final ModelRenderer RightLegyellow;
	private final ModelRenderer RightLegglowgreen;
	private final ModelRenderer LeftLeggold;
	private final ModelRenderer LeftLegsilver;
	private final ModelRenderer LeftLegyellow;
	private final ModelRenderer LeftLegglowgreen;
	
	EquipmentSlotType equipmentslot;
	
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

	public novazero_main(float modelSize, EquipmentSlotType slot) {
		super(modelSize);
		texWidth = 103;
		texHeight = 181;
		
		equipmentslot = slot;
		
		MainColorDefault = 16100352;//Main Body Color Gold
		SecondaryColorDefault = 4931443;//Secondary really dark blue
		ThirdColorDefault = 16763151; //yellow
		WhiteColorDefault = 12828878;//Silvery
		GlowyColorDefault = 13775416;//Dark Red
		GrayColorDefault = 12828878;//Silvery
		FourthColorDefault = 2728758;//Dark Green
		//??? body middle thing 6584982
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
		FourthColor = FourthColorDefault;

		Headgold = new ModelRenderer(this);
		Headgold.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headgold, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headgold.texOffs(0, 4).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headgold.texOffs(54, 71).addBox(5.0643F, -4.9396F, -0.6797F, 1.0F, 3.0F, 3.0F, 0.5F, false);
		Headgold.texOffs(41, 71).addBox(-5.8938F, -4.8393F, -1.6332F, 1.0F, 3.0F, 3.0F, 0.5F, false);
		Headgold.texOffs(32, 112).addBox(-3.6706F, -12.6327F, -3.8533F, 8.0F, 12.0F, 8.0F, 1.55F, false);
		Headgold.texOffs(32, 0).addBox(-3.6706F, -12.6327F, -3.8533F, 8.0F, 12.0F, 8.0F, 1.55F, false);
		}
		
		Headsecondary = new ModelRenderer(this);
		Headsecondary.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headsecondary, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headsecondary.texOffs(0, 116).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0F, -2.0F, 5.0F);
		Headsecondary.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.3491F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		cube_r1.texOffs(66, 69).addBox(-1.0F, -0.9517F, -0.1853F, 2.0F, 2.0F, 5.0F, 0.0F, false);
		}
		
		Headsilver = new ModelRenderer(this);
		Headsilver.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headsilver, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headsilver.texOffs(71, 4).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.75F, false);
		}
		
		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(0.0F, 0.0F, 10.0F);
		Headsilver.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.3927F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		cube_r2.texOffs(41, 53).addBox(-3.0F, -1.1637F, -3.4193F, 6.0F, 12.0F, 6.0F, 0.0F, false);
		}
		
		Headglow = new ModelRenderer(this);
		Headglow.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headglow, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headglow.texOffs(55, 132).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.55F, false);
		Headglow.texOffs(71, 118).addBox(-3.5F, -12.0F, -4.0F, 7.0F, 7.0F, 8.0F, 1.55F, false);
		}
		
		Bodysecondary = new ModelRenderer(this);
		Bodysecondary.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodysecondary.texOffs(53, 150).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 9.0F, 4.0F, 0.51F, false);
		Bodysecondary.texOffs(16, 20).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.86F, false);
		}
		
		Bodygold = new ModelRenderer(this);
		Bodygold.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodygold.texOffs(16, 36).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.88F, false);
		}
		
		Bodysilver = new ModelRenderer(this);
		Bodysilver.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodysilver.texOffs(16, 68).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.88F, false);
		}
		
		Bodygray = new ModelRenderer(this);
		Bodygray.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodygray.texOffs(16, 84).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 9.0F, 4.0F, 0.51F, false);
		}
		
		RightArmGold = new ModelRenderer(this);
		RightArmGold.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmGold, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmGold.texOffs(40, 36).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		RightArmGold.texOffs(75, 28).addBox(-5.0F, -3.3755F, -1.5566F, 5.0F, 4.0F, 4.0F, 1.0F, false);
		}
		
		RightArmsecondary = new ModelRenderer(this);
		RightArmsecondary.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmsecondary, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmsecondary.texOffs(75, 36).addBox(-5.0F, -3.3755F, -1.5566F, 5.0F, 4.0F, 4.0F, 1.0F, false);
		RightArmsecondary.texOffs(40, 20).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		RightArmsecondary.texOffs(75, 20).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		RightArmsilver = new ModelRenderer(this);
		RightArmsilver.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmsilver, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmsilver.texOffs(61, 108).addBox(-3.0F, 8.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.77F, false);
		RightArmsilver.texOffs(58, 165).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		LeftArmGold = new ModelRenderer(this);
		LeftArmGold.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmGold, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmGold.texOffs(75, 52).addBox(0.0F, -3.3755F, -1.5566F, 5.0F, 4.0F, 4.0F, 1.0F, false);
		LeftArmGold.texOffs(59, 36).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		LeftArmsecondary = new ModelRenderer(this);
		LeftArmsecondary.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmsecondary, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmsecondary.texOffs(75, 60).addBox(0.0F, -3.3755F, -1.5566F, 5.0F, 4.0F, 4.0F, 1.0F, false);
		LeftArmsecondary.texOffs(59, 20).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArmsecondary.texOffs(75, 44).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		LeftArmsilver = new ModelRenderer(this);
		LeftArmsilver.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmsilver, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmsilver.texOffs(77, 165).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArmsilver.texOffs(81, 108).addBox(-1.0F, 8.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.77F, false);
		}
		
		RightLeggold = new ModelRenderer(this);
		RightLeggold.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeggold, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLeggold.texOffs(0, 20).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLegsilver = new ModelRenderer(this);
		RightLegsilver.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegsilver, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegsilver.texOffs(0, 84).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
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
		
		LeftLeggold = new ModelRenderer(this);
		LeftLeggold.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeggold, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLeggold.texOffs(0, 36).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLegsilver = new ModelRenderer(this);	
		LeftLegsilver.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegsilver, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegsilver.texOffs(0, 100).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
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
//	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
//		//previously the render function, render code was moved to a method below
//	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		
		float fred = (float)( this.MainColor >> 16 & 255) / 255.0F;
        float fgreen = (float)(this.MainColor >> 8 & 255) / 255.0F;
        float fblue = (float)(this.MainColor & 255) / 255.0F;
		this.Headgold.copyFrom(this.head);
		Headgold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodygold.copyFrom(this.body);
		Bodygold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmGold.copyFrom(this.rightArm);
		RightArmGold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmGold.copyFrom(this.leftArm);
		LeftArmGold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLeggold.copyFrom(this.rightLeg);
		RightLeggold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeggold.copyFrom(this.leftLeg);
		LeftLeggold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
		this.Headsecondary.copyFrom(this.head);
		Headsecondary.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodysecondary.copyFrom(this.body);
		Bodysecondary.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmsecondary.copyFrom(this.rightArm);
		RightArmsecondary.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmsecondary.copyFrom(this.leftArm);
		LeftArmsecondary.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GrayColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GrayColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GrayColor & 255) / 255.0F;
		this.Headsilver.copyFrom(this.head);
		Headsilver.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodysilver.copyFrom(this.body);
		Bodysilver.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodygray.copyFrom(this.body);
		Bodygray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmsilver.copyFrom(this.rightArm);
		RightArmsilver.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmsilver.copyFrom(this.leftArm);
		LeftArmsilver.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegsilver.copyFrom(this.rightLeg);
		RightLegsilver.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegsilver.copyFrom(this.leftLeg);
		LeftLegsilver.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
		this.Headglow.copyFrom(this.head);
		Headglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.ThirdColor & 255) / 255.0F;
		this.RightLegyellow.copyFrom(this.rightLeg);
		RightLegyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegyellow.copyFrom(this.leftLeg);
		LeftLegyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.FourthColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.FourthColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.FourthColor & 255) / 255.0F;
		this.RightLegglowgreen.copyFrom(this.rightLeg);
		RightLegglowgreen.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegglowgreen.copyFrom(this.leftLeg);
		LeftLegglowgreen.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
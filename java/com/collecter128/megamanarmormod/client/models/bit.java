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
public class bit extends BipedModel {
	private final ModelRenderer Headgold;
	private final ModelRenderer Headeyesglow;
	private final ModelRenderer Headblack;
	private final ModelRenderer Headblue;
	private final ModelRenderer Headlightblue;
	private final ModelRenderer Headred;
	private final ModelRenderer Headwhite;
	private final ModelRenderer Bodygold;
	private final ModelRenderer Bodyred;
	private final ModelRenderer Bodyorange;
	private final ModelRenderer Bodygray;
	private final ModelRenderer RightArmgold;
	private final ModelRenderer RightArm_r1;
	private final ModelRenderer RightArmblue;
	private final ModelRenderer RightArmgray;
	private final ModelRenderer RightArmorange;
	private final ModelRenderer RightArm_r2;
	private final ModelRenderer RightArmred;
	private final ModelRenderer LeftArmgold;
	private final ModelRenderer LeftArm_r1;
	private final ModelRenderer LeftArmblue;
	private final ModelRenderer LeftArmgray;
	private final ModelRenderer LeftArmorange;
	private final ModelRenderer LeftArm_r2;
	private final ModelRenderer LeftArmred;
	private final ModelRenderer RightLeggold;
	private final ModelRenderer RightLegblue;
	private final ModelRenderer RightLegwhite;
	private final ModelRenderer RightLegglow;
	private final ModelRenderer LeftLeggold;
	private final ModelRenderer LeftLegblue;
	private final ModelRenderer LeftLegwhite;
	private final ModelRenderer LeftLegglow;
	
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

	public bit(float modelSize, EquipmentSlotType slot) {
		super(modelSize);
		texWidth = 79;
		texHeight = 207;
		
		equipmentslot = slot;
		
		MainColorDefault = 16634376;//Main gold
		SecondaryColorDefault = 16615944;//Secondary orange
		ThirdColorDefault = 14682880; //red
		WhiteColorDefault = 16777215;//Basic White
		GlowyColorDefault = 16714250;//Glow? red
		GrayColorDefault = 12434877;//gray
		FourthColorDefault = 3376639; //blue
		FifthColorDefault = 6411749; //light blue
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
		FourthColor = FourthColorDefault;
		FifthColor = FifthColorDefault;

		Headgold = new ModelRenderer(this);
		Headgold.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headgold.texOffs(2, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headgold.texOffs(66, 1).addBox(-8.0F, -6.0F, -1.5F, 3.0F, 2.0F, 3.0F, 0.0F, false);
		Headgold.texOffs(66, 7).addBox(5.0F, -6.0F, -1.5F, 3.0F, 2.0F, 3.0F, 0.0F, false);
		}
		
		Headeyesglow = new ModelRenderer(this);
		Headeyesglow.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headeyesglow.texOffs(29, 84).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Headblack = new ModelRenderer(this);
		Headblack.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headblack.texOffs(34, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Headblue = new ModelRenderer(this);
		Headblue.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headblue.texOffs(16, 66).addBox(-9.0F, -10.0F, -2.0F, 4.0F, 4.0F, 4.0F, -0.1F, false);
		Headblue.texOffs(34, 66).addBox(5.0F, -10.0F, -2.0F, 4.0F, 4.0F, 4.0F, -0.1F, false);
		Headblue.texOffs(1, 174).addBox(-9.0F, -4.0F, -2.0F, 4.0F, 4.0F, 4.0F, -0.1F, false);
		Headblue.texOffs(19, 174).addBox(5.0F, -4.0F, -2.0F, 4.0F, 4.0F, 4.0F, -0.1F, false);
		}
		
		Headlightblue = new ModelRenderer(this);
		Headlightblue.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headlightblue.texOffs(16, 75).addBox(-9.0F, -10.0F, -2.0F, 4.0F, 4.0F, 4.0F, -0.1F, false);
		Headlightblue.texOffs(34, 75).addBox(5.0F, -10.0F, -2.0F, 4.0F, 4.0F, 4.0F, -0.1F, false);
		Headlightblue.texOffs(1, 183).addBox(-9.0F, -4.0F, -2.0F, 4.0F, 4.0F, 4.0F, -0.1F, false);
		Headlightblue.texOffs(19, 183).addBox(5.0F, -4.0F, -2.0F, 4.0F, 4.0F, 4.0F, -0.1F, false);
		}
		
		Headred = new ModelRenderer(this);
		Headred.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headred.texOffs(0, 0).addBox(-2.0F, -12.0F, -5.0F, 4.0F, 7.0F, 1.0F, 0.2F, false);
		}
		
		Headwhite = new ModelRenderer(this);
		Headwhite.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headwhite.texOffs(29, 101).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Bodygold = new ModelRenderer(this);
		Bodygold.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodygold.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		}
		
		Bodyred = new ModelRenderer(this);
		Bodyred.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyred.texOffs(1, 191).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		}
		
		Bodyorange = new ModelRenderer(this);
		Bodyorange.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyorange.texOffs(39, 175).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		Bodyorange.texOffs(26, 3).addBox(-3.5F, 0.0F, -2.3F, 7.0F, 3.0F, 1.0F, 0.51F, false);
		}
		
		Bodygray = new ModelRenderer(this);
		Bodygray.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodygray.texOffs(16, 48).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.31F, false);
		Bodygray.texOffs(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.31F, false);
		}
		
		RightArmgold = new ModelRenderer(this);
		RightArmgold.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmgold, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmgold.texOffs(41, 48).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		RightArmgold.texOffs(41, 16).addBox(-3.0F, -2.3609F, -2.0F, 4.0F, 3.0F, 4.0F, 0.75F, false);
		RightArmgold.texOffs(46, 64).addBox(-2.0F, -2.3609F, -2.5F, 3.0F, 3.0F, 1.0F, 0.75F, false);
		RightArmgold.texOffs(50, 64).addBox(-2.0F, -2.3609F, 1.5F, 3.0F, 3.0F, 1.0F, 0.75F, false);
		}
		
		RightArm_r1 = new ModelRenderer(this);
		RightArm_r1.setPos(5.0F, -4.0F, 0.0F);
		RightArmgold.addChild(RightArm_r1);
		setRotationAngle(RightArm_r1, 0.6981F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArm_r1.texOffs(51, 70).addBox(-7.5F, -0.3609F, -2.2F, 1.0F, 2.0F, 3.0F, 0.75F, false);
		}
		
		RightArmblue = new ModelRenderer(this);
		RightArmblue.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmblue, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmblue.texOffs(41, 42).addBox(-3.0F, 5.6391F, -2.0F, 4.0F, 2.0F, 4.0F, 0.75F, false);
		}
		
		RightArmgray = new ModelRenderer(this);
		RightArmgray.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmgray, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmgray.texOffs(41, 24).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		RightArmorange = new ModelRenderer(this);
		RightArmorange.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmorange, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmorange.texOffs(1, 158).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		RightArmorange.texOffs(62, 92).addBox(-3.0F, -2.3609F, -2.0F, 4.0F, 3.0F, 4.0F, 0.75F, false);
		}
		
		RightArm_r2 = new ModelRenderer(this);
		RightArm_r2.setPos(5.0F, -4.0F, 0.0F);
		RightArmorange.addChild(RightArm_r2);
		setRotationAngle(RightArm_r2, 0.6981F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArm_r2.texOffs(61, 70).addBox(-7.7F, -1.3609F, -1.5F, 1.0F, 2.0F, 3.0F, 0.75F, false);
		}
		
		RightArmred = new ModelRenderer(this);
		RightArmred.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmred, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmred.texOffs(39, 158).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		LeftArmgold = new ModelRenderer(this);
		LeftArmgold.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgold, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmgold.texOffs(59, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArmgold.texOffs(59, 16).addBox(-1.0F, -2.3609F, -2.0F, 4.0F, 3.0F, 4.0F, 0.75F, false);
		LeftArmgold.texOffs(62, 64).addBox(0.0F, -2.3609F, -2.5F, 3.0F, 3.0F, 1.0F, 0.75F, false);
		LeftArmgold.texOffs(66, 64).addBox(0.0F, -2.3609F, 1.5F, 3.0F, 3.0F, 1.0F, 0.75F, false);
		}
		
		LeftArm_r1 = new ModelRenderer(this);
		LeftArm_r1.setPos(-5.0F, -4.0F, 0.0F);
		LeftArmgold.addChild(LeftArm_r1);
		setRotationAngle(LeftArm_r1, 0.6981F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArm_r1.texOffs(53, 80).addBox(6.5F, -0.3609F, -2.0F, 1.0F, 2.0F, 3.0F, 0.75F, false);
		}
		
		LeftArmblue = new ModelRenderer(this);
		LeftArmblue.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmblue, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmblue.texOffs(59, 41).addBox(-1.0F, 5.6391F, -2.0F, 4.0F, 2.0F, 4.0F, 0.75F, false);
		}
		
		LeftArmgray = new ModelRenderer(this);
		LeftArmgray.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgray, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmgray.texOffs(59, 24).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		LeftArmorange = new ModelRenderer(this);
		LeftArmorange.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmorange, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmorange.texOffs(19, 158).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArmorange.texOffs(62, 109).addBox(-1.0F, -2.3609F, -2.0F, 4.0F, 3.0F, 4.0F, 0.75F, false);
		}
		
		LeftArm_r2 = new ModelRenderer(this);
		LeftArm_r2.setPos(-5.0F, -4.0F, 0.0F);
		LeftArmorange.addChild(LeftArm_r2);
		setRotationAngle(LeftArm_r2, 0.6981F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArm_r2.texOffs(64, 80).addBox(6.7F, -1.3609F, -2.0F, 1.0F, 2.0F, 3.0F, 0.75F, false);
		}
		
		LeftArmred = new ModelRenderer(this);
		LeftArmred.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmred, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmred.texOffs(57, 158).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		RightLeggold = new ModelRenderer(this);
		RightLeggold.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeggold, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLeggold.texOffs(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLegblue = new ModelRenderer(this);
		RightLegblue.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegblue, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegblue.texOffs(0, 64).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLegwhite = new ModelRenderer(this);
		RightLegwhite.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegwhite, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegwhite.texOffs(0, 96).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLegglow = new ModelRenderer(this);
		RightLegglow.setPos(-1.9F, 12.0F, -1.9632F);
		setRotationAngle(RightLegglow, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegglow.texOffs(15, 99).addBox(-2.0F, 8.5F, -0.0368F, 4.0F, 4.0F, 4.0F, 1.0F, false);
		}
		
		LeftLeggold = new ModelRenderer(this);
		LeftLeggold.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeggold, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLeggold.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLegblue = new ModelRenderer(this);
		LeftLegblue.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegblue, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegblue.texOffs(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLegwhite = new ModelRenderer(this);
		LeftLegwhite.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegwhite, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegwhite.texOffs(0, 80).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLegglow = new ModelRenderer(this);
		LeftLegglow.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegglow, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegglow.texOffs(15, 109).addBox(-2.0F, 8.2F, -2.0F, 4.0F, 4.0F, 4.0F, 1.0F, true);
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
		this.Headgold.copyFrom(this.head);
		Headgold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodygold.copyFrom(this.body);
		Bodygold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmgold.copyFrom(this.rightArm);
		RightArmgold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmgold.copyFrom(this.leftArm);
		LeftArmgold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLeggold.copyFrom(this.rightLeg);
		RightLeggold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeggold.copyFrom(this.leftLeg);
		LeftLeggold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.WhiteColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.WhiteColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.WhiteColor & 255) / 255.0F;
		this.Headwhite.copyFrom(this.head);
		Headwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegwhite.copyFrom(this.rightLeg);
		RightLegwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegwhite.copyFrom(this.leftLeg);
		LeftLegwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		this.Headeyesglow.copyFrom(this.head);
		Headeyesglow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		
		this.Headblack.copyFrom(this.head);
		Headblack.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		
		fred = (float)( this.FourthColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.FourthColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.FourthColor & 255) / 255.0F;
		this.Headblue.copyFrom(this.head);
		Headblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmblue.copyFrom(this.rightArm);
		RightArmblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmblue.copyFrom(this.leftArm);
		LeftArmblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegblue.copyFrom(this.rightLeg);
		RightLegblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegblue.copyFrom(this.leftLeg);
		LeftLegblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.FifthColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.FifthColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.FifthColor & 255) / 255.0F;
		this.Headlightblue.copyFrom(this.head);
		Headlightblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.ThirdColor & 255) / 255.0F;
		this.Headred.copyFrom(this.head);
		Headred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodyred.copyFrom(this.body);
		Bodyred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmred.copyFrom(this.rightArm);
		RightArmred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmred.copyFrom(this.leftArm);
		LeftArmred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
		this.Bodyorange.copyFrom(this.body);
		Bodyorange.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmorange.copyFrom(this.rightArm);
		RightArmorange.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmorange.copyFrom(this.leftArm);
		LeftArmorange.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GrayColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GrayColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GrayColor & 255) / 255.0F;
		this.Bodygray.copyFrom(this.body);
		Bodygray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmgray.copyFrom(this.rightArm);
		RightArmgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmgray.copyFrom(this.leftArm);
		LeftArmgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
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
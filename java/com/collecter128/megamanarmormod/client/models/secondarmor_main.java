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

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class secondarmor_main extends BipedModel  {
	private final ModelRenderer Head;
	private final ModelRenderer Head2;
	private final ModelRenderer Headgray;
	private final ModelRenderer Headwhite;
	private final ModelRenderer Headyellow;
	private final ModelRenderer Headglow;
	private final ModelRenderer Headglow_r1;
	private final ModelRenderer Body;
	private final ModelRenderer Bodygold;
	private final ModelRenderer Bodywhite;
	private final ModelRenderer Bodygray;
	private final ModelRenderer Body2;
	private final ModelRenderer RightArm;
	private final ModelRenderer RightArm2;
	private final ModelRenderer RightArmwhite;
	private final ModelRenderer RightArmgray;
	private final ModelRenderer LeftArm_r1;
	private final ModelRenderer RightArmred;
	private final ModelRenderer RightArmgreen;
	private final ModelRenderer LeftArm;
	private final ModelRenderer LeftArm2;
	private final ModelRenderer LeftArmwhite;
	private final ModelRenderer LeftArmgray;
	private final ModelRenderer LeftArm_r2;
	private final ModelRenderer LeftArmred;
	private final ModelRenderer LeftArmgreen;
	private final ModelRenderer RightLeg;
	private final ModelRenderer RightLegred;
	private final ModelRenderer RightLeggold;
	private final ModelRenderer RightLegwhite;
	private final ModelRenderer RightLeggold2;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer LeftLegred;
	private final ModelRenderer LeftLegglow;
	private final ModelRenderer LeftLeggold;
	private final ModelRenderer LeftLegwhite;
	
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
	
	EquipmentSlotType equipmentslot;

	public secondarmor_main(float modelSize, EquipmentSlotType slot) {
		super(modelSize);
		texWidth = 101;
		texHeight = 178;
		
		equipmentslot = slot;
		
		MainColorDefault = 2781423;//Main Body Color X Blue
		SecondaryColorDefault = 5752303;//Secondary Cyan tiel color
		ThirdColorDefault = 16642337; //Yellow Bits
		WhiteColorDefault = 16777215;//Basic White
		GlowyColorDefault = 16468504;//Glow?Red crystal thingy
		GrayColorDefault = 16777215;//Basic White
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;

		Head = new ModelRenderer(this);
		Head.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Head, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Head2 = new ModelRenderer(this);
		Head2.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Head2, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head2.texOffs(64, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Headgray = new ModelRenderer(this);
		Headgray.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headgray, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headgray.texOffs(32, 0).addBox(5.4872F, -3.841F, -1.566F, 1.0F, 3.0F, 3.0F, 0.5F, false);
		Headgray.texOffs(56, 0).addBox(-5.8938F, -3.8448F, -1.5287F, 1.0F, 3.0F, 3.0F, 0.5F, false);
		Headgray.texOffs(32, 0).addBox(-3.6706F, -7.6327F, -3.8533F, 8.0F, 7.0F, 8.0F, 0.55F, false);
		}
		
		Headwhite = new ModelRenderer(this);
		Headwhite.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headwhite, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headwhite.texOffs(65, 103).addBox(-4.5F, -11.0F, -4.5F, 9.0F, 11.0F, 9.0F, 1.0F, false);
		Headwhite.texOffs(0, 127).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Headyellow = new ModelRenderer(this);
		Headyellow.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headyellow, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headyellow.texOffs(65, 125).addBox(-4.5F, -9.0F, -4.5F, 9.0F, 9.0F, 9.0F, 1.0F, false);
		Headyellow.texOffs(33, 127).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Headglow = new ModelRenderer(this);
		Headglow.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headglow, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headglow.texOffs(66, 1).addBox(-5.8256F, -3.1932F, -1.2815F, 0.0F, 2.0F, 2.0F, 0.0F, false);
		Headglow.texOffs(90, 1).addBox(6.2159F, -3.1984F, -1.2317F, 0.0F, 2.0F, 2.0F, 0.0F, false);
		}
		
		Headglow_r1 = new ModelRenderer(this);
		Headglow_r1.setPos(0.0F, -7.0F, 0.0F);
		Headglow.addChild(Headglow_r1);
		setRotationAngle(Headglow_r1, 0.0F, 0.0F, -0.7854F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headglow_r1.texOffs(26, 2).addBox(-0.25F, -1.8411F, -5.6852F, 2.0F, 2.0F, 1.0F, 0.3F, false);
		}
		
		Body = new ModelRenderer(this);
		Body.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Body.texOffs(20, 15).addBox(-4.5F, 0.0F, -2.5F, 9.0F, 10.0F, 5.0F, 0.6F, false);
		}
		
		Bodygold = new ModelRenderer(this);
		Bodygold.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodygold.texOffs(20, 63).addBox(-4.5F, 0.0F, -2.5F, 9.0F, 10.0F, 5.0F, 0.6F, false);
		}
		
		Bodywhite = new ModelRenderer(this);
		Bodywhite.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodywhite.texOffs(20, 47).addBox(-4.5F, 0.0F, -2.5F, 9.0F, 10.0F, 5.0F, 0.6F, false);
		}
		
		Bodygray = new ModelRenderer(this);
		Bodygray.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodygray.texOffs(22, 79).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		}
		
		Body2 = new ModelRenderer(this);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Body2.texOffs(20, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		}
		
		RightArm = new ModelRenderer(this);
		RightArm.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArm, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArm.texOffs(48, 40).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.65F, false);
		RightArm.texOffs(48, 24).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		RightArm2 = new ModelRenderer(this);
		RightArm2.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArm2, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArm2.texOffs(48, 55).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		RightArmwhite = new ModelRenderer(this);
		RightArmwhite.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmwhite, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmwhite.texOffs(47, 16).addBox(-8.0F, -2.3974F, -2.0F, 6.0F, 4.0F, 4.0F, 0.8F, false);
		RightArmwhite.texOffs(48, 48).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.65F, false);
		}
		
		RightArmgray = new ModelRenderer(this);
		RightArmgray.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmgray, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmgray.texOffs(46, 87).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		LeftArm_r1 = new ModelRenderer(this);
		LeftArm_r1.setPos(5.0F, 22.0F, 0.0F);
		RightArmgray.addChild(LeftArm_r1);
		setRotationAngle(LeftArm_r1, 0.0F, -1.5708F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArm_r1.texOffs(85, 53).addBox(-2.5F, -25.0F, 4.5F, 5.0F, 5.0F, 1.0F, 0.8F, false);
		}
		
		RightArmred = new ModelRenderer(this);
		RightArmred.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmred, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmred.texOffs(48, 71).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		RightArmred.texOffs(79, 28).addBox(-9.0F, -2.3974F, -2.0F, 7.0F, 4.0F, 4.0F, 0.8F, false);
		}
		
		RightArmgreen = new ModelRenderer(this);
		RightArmgreen.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmgreen, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmgreen.texOffs(84, 62).addBox(-0.5F, -2.3207F, -3.4F, 1.0F, 4.0F, 1.0F, 0.2F, false);
		RightArmgreen.texOffs(82, 71).addBox(-0.5F, -2.3776F, 2.4F, 1.0F, 4.0F, 1.0F, 0.2F, false);
		}
		
		LeftArm = new ModelRenderer(this);
		LeftArm.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArm, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArm.texOffs(65, 40).addBox(-1.0F, 3.8F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		LeftArm.texOffs(65, 24).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		LeftArm2 = new ModelRenderer(this);
		LeftArm2.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArm2, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArm2.texOffs(65, 55).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		LeftArmwhite = new ModelRenderer(this);
		LeftArmwhite.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmwhite, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmwhite.texOffs(97, 129).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArmwhite.texOffs(65, 48).addBox(-1.0F, 3.8F, -2.0F, 4.0F, 5.0F, 4.0F, 0.75F, false);
		LeftArmwhite.texOffs(67, 16).addBox(2.0F, -2.3974F, -2.0F, 7.0F, 4.0F, 4.0F, 0.8F, false);
		}
		
		LeftArmgray = new ModelRenderer(this);
		LeftArmgray.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgray, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmgray.texOffs(63, 87).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		LeftArm_r2 = new ModelRenderer(this);
		LeftArm_r2.setPos(-5.0F, 22.0F, 0.0F);
		LeftArmgray.addChild(LeftArm_r2);
		setRotationAngle(LeftArm_r2, 0.0F, -1.5708F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArm_r2.texOffs(85, 53).addBox(-2.5F, -25.0F, -5.5F, 5.0F, 5.0F, 1.0F, 0.8F, false);
		}
		
		LeftArmred = new ModelRenderer(this);
		LeftArmred.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmred, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmred.texOffs(65, 71).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArmred.texOffs(79, 42).addBox(2.0F, -2.3974F, -2.0F, 7.0F, 4.0F, 4.0F, 0.8F, false);
		}
		
		LeftArmgreen = new ModelRenderer(this);
		LeftArmgreen.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgreen, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmgreen.texOffs(91, 62).addBox(-0.5F, -2.3207F, -3.4F, 1.0F, 4.0F, 1.0F, 0.2F, false);
		LeftArmgreen.texOffs(89, 71).addBox(-0.5F, -2.3776F, 2.4F, 1.0F, 4.0F, 1.0F, 0.2F, false);
		}
		
		RightLeg = new ModelRenderer(this);
		RightLeg.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeg, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLeg.texOffs(0, 50).addBox(-3.0F, 0.0F, -2.0F, 5.0F, 12.0F, 5.0F, 0.6F, false);
		}
		
		RightLegred = new ModelRenderer(this);
		RightLegred.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegred, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegred.texOffs(0, 84).addBox(-3.0F, 0.0F, -2.0F, 5.0F, 12.0F, 5.0F, 0.6F, false);
		RightLegred.texOffs(0, 84).addBox(-3.1F, 10.5F, 3.9F, 5.0F, 1.0F, 0.0F, 0.0F, false);
		}
		
		RightLeggold = new ModelRenderer(this);
		RightLeggold.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeggold, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLeggold.texOffs(22, 96).addBox(-3.0F, 0.0F, -2.0F, 5.0F, 12.0F, 5.0F, 0.6F, false);
		}
		
		RightLegwhite = new ModelRenderer(this);
		RightLegwhite.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegwhite, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegwhite.texOffs(0, 16).addBox(-3.0F, 0.0F, -2.0F, 5.0F, 12.0F, 5.0F, 0.6F, false);
		RightLegwhite.texOffs(0, 16).addBox(-3.1F, 10.5F, 3.9F, 5.0F, 1.0F, 0.0F, 0.0F, false);
		}
		
		RightLeggold2 = new ModelRenderer(this);
		RightLeggold2.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeggold2, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLeggold2.texOffs(0, 84).addBox(-3.0F, 12.1F, -2.0F, 5.0F, 0.0F, 5.0F, 0.6F, false);
		}
		
		LeftLeg = new ModelRenderer(this);
		LeftLeg.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeg, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLeg.texOffs(0, 67).addBox(-3.0F, 0.0F, -2.0F, 5.0F, 12.0F, 5.0F, 0.6F, true);
		}
		
		LeftLegred = new ModelRenderer(this);
		LeftLegred.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegred, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegred.texOffs(0, 101).addBox(-3.0F, 0.0F, -2.0F, 5.0F, 12.0F, 5.0F, 0.6F, true);
		}
		
		LeftLegglow = new ModelRenderer(this);
		LeftLegglow.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegglow, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegglow.texOffs(0, 101).addBox(-3.0F, 11.1F, -2.0F, 5.0F, 1.0F, 5.0F, 0.6F, true);
		}
		
		LeftLeggold = new ModelRenderer(this);
		LeftLeggold.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeggold, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLeggold.texOffs(44, 103).addBox(-3.0F, 0.0F, -2.0F, 5.0F, 12.0F, 5.0F, 0.6F, true);
		}
		
		LeftLegwhite = new ModelRenderer(this);
		LeftLegwhite.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegwhite, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegwhite.texOffs(0, 33).addBox(-3.0F, 0.0F, -2.0F, 5.0F, 12.0F, 5.0F, 0.6F, true);
		LeftLegwhite.texOffs(0, 33).addBox(-2.9024F, 10.6375F, 3.9242F, 5.0F, 1.0F, 0.0F, 0.0F, false);
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
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
		this.Head2.copyFrom(this.head);
		Head2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Body2.copyFrom(this.body);
		Body2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArm2.copyFrom(this.rightArm);
		RightArm2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArm2.copyFrom(this.leftArm);
		LeftArm2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GrayColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GrayColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GrayColor & 255) / 255.0F;
		this.Headgray.copyFrom(this.head);
		Headgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodygray.copyFrom(this.body);
		Bodygray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmgray.copyFrom(this.rightArm);
		RightArmgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmgray.copyFrom(this.leftArm);
		LeftArmgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
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
		
		fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.ThirdColor & 255) / 255.0F;
		this.Headyellow.copyFrom(this.head);
		Headyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodygold.copyFrom(this.body);
		Bodygold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLeggold.copyFrom(this.rightLeg);
		RightLeggold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeggold.copyFrom(this.leftLeg);
		LeftLeggold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
		this.Headglow.copyFrom(this.head);
		Headglow.render(matrixStack, buffer, 15728640, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLeggold2.copyFrom(this.rightLeg);
		RightLeggold2.render(matrixStack, buffer, 15728640, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegglow.copyFrom(this.leftLeg);
		LeftLegglow.render(matrixStack, buffer, 15728640, packedOverlay, fred, fgreen, fblue, alpha);
		
		
		this.RightArmred.copyFrom(this.rightArm);
		RightArmred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmred.copyFrom(this.leftArm);
		LeftArmred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegred.copyFrom(this.rightLeg);
		RightLegred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegred.copyFrom(this.leftLeg);
		LeftLegred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		
		this.RightArmgreen.copyFrom(this.rightArm);
		RightArmgreen.render(matrixStack, buffer, 15728640, packedOverlay);
		this.LeftArmgreen.copyFrom(this.leftArm);
		LeftArmgreen.render(matrixStack, buffer, 15728640, packedOverlay);
		
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
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
public class over1 extends BipedModel {
	private final ModelRenderer Headblue;
	private final ModelRenderer Headwhite;
	private final ModelRenderer Head4_r1;
	private final ModelRenderer Headgray;
	private final ModelRenderer Headgoldglow;
	private final ModelRenderer Head3_r1;
	private final ModelRenderer Headblack;
	private final ModelRenderer Head4_r2;
	private final ModelRenderer Headredglow;
	private final ModelRenderer Bodyblue;
	private final ModelRenderer Bodygray;
	private final ModelRenderer Bodywhite;
	private final ModelRenderer Bodyredglow;
	private final ModelRenderer Bodyblack;
	private final ModelRenderer Bodyred;
	private final ModelRenderer RightArmblue;
	private final ModelRenderer RightArmwhite;
	private final ModelRenderer RightArmredglow;
	private final ModelRenderer RightArmblack;
	private final ModelRenderer RightArmgray;
	private final ModelRenderer LeftArmblue;
	private final ModelRenderer LeftArmwhite;
	private final ModelRenderer LeftArmredglow;
	private final ModelRenderer LeftArmblack;
	private final ModelRenderer LeftArmgray;
	private final ModelRenderer RightLegblue;
	private final ModelRenderer RightLegwhite;
	private final ModelRenderer RightLegblack;
	private final ModelRenderer RightLegredglow;
	private final ModelRenderer LeftLegblue;
	private final ModelRenderer LeftLegwhite;
	private final ModelRenderer LeftLegblack;
	private final ModelRenderer LeftLegredglow;
	
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

	public over1(float modelSize, EquipmentSlotType slot) {
		super(modelSize);
		texWidth = 74;
		texHeight = 259;
		
		equipmentslot = slot;
		
		MainColorDefault = 4022712;//Main Dark Blue
		SecondaryColorDefault = 4542568;//Secondary Black
		ThirdColorDefault = 14170939; //Red
		WhiteColorDefault = 16777215;//White
		GlowyColorDefault = 14170939;//red
		GrayColorDefault = 10724259;//gray
		FourthColorDefault = 16765235;//gold
		//FifthColorDefault
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
		FourthColor = FourthColorDefault;
		//FifthColor = FifthColorDefault;

		Headblue = new ModelRenderer(this);
		Headblue.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headblue.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Headwhite = new ModelRenderer(this);
		Headwhite.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headwhite.texOffs(0, 82).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headwhite.texOffs(45, 80).addBox(-1.0F, -9.5707F, -4.5F, 2.0F, 1.0F, 9.0F, 0.25F, false);
		Headwhite.texOffs(19, 33).addBox(5.0643F, -3.9451F, -0.5752F, 1.0F, 3.0F, 3.0F, 0.5F, false);
		Headwhite.texOffs(19, 39).addBox(-5.8938F, -3.8448F, -0.5287F, 1.0F, 3.0F, 3.0F, 0.5F, false);
		}
		
		Head4_r1 = new ModelRenderer(this);
		Head4_r1.setPos(0.0F, -1.0F, 0.0F);
		Headwhite.addChild(Head4_r1);
		setRotationAngle(Head4_r1, 0.5236F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head4_r1.texOffs(50, -2).addBox(-5.9357F, -2.9451F, -3.5752F, 0.0F, 3.0F, 4.0F, 0.5F, false);
		Head4_r1.texOffs(26, -2).addBox(6.0643F, -2.9451F, -3.5752F, 0.0F, 3.0F, 4.0F, 0.5F, false);
		}
		
		Headgray = new ModelRenderer(this);
		Headgray.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headgray.texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 7.0F, 8.0F, 0.75F, false);
		}
		
		Headgoldglow = new ModelRenderer(this);
		Headgoldglow.setPos(0.0F, 0.0F, 0.0F);
		

		Head3_r1 = new ModelRenderer(this);
		Head3_r1.setPos(0.0F, 24.0F, 0.0F);
		Headgoldglow.addChild(Head3_r1);
		setRotationAngle(Head3_r1, 0.0F, 0.0F, 0.7854F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head3_r1.texOffs(1, 49).addBox(-23.0F, -23.0F, -5.5F, 2.0F, 2.0F, 1.0F, 0.25F, false);
		}
		
		Headblack = new ModelRenderer(this);
		Headblack.setPos(0.0F, 0.0F, 0.0F);
		

		Head4_r2 = new ModelRenderer(this);
		Head4_r2.setPos(0.0F, 24.0F, 0.0F);
		Headblack.addChild(Head4_r2);
		setRotationAngle(Head4_r2, 0.0F, 0.0F, 0.7854F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head4_r2.texOffs(8, 49).addBox(-23.0F, -23.0F, -5.5F, 2.0F, 2.0F, 1.0F, 0.25F, false);
		}
		
		Headredglow = new ModelRenderer(this);
		Headredglow.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headredglow.texOffs(64, 2).addBox(4.5F, -3.5F, 0.0F, 1.0F, 2.0F, 2.0F, 0.5F, false);
		Headredglow.texOffs(67, 9).addBox(-5.5F, -3.5F, 0.0F, 1.0F, 2.0F, 2.0F, 0.5F, false);
		}
		
		Bodyblue = new ModelRenderer(this);
		Bodyblue.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyblue.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		}
		
		Bodygray = new ModelRenderer(this);
		Bodygray.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodygray.texOffs(3, 235).addBox(-5.5F, -2.0F, -2.0F, 11.0F, 3.0F, 7.0F, 0.51F, false);
		Bodygray.texOffs(8, 71).addBox(-3.5F, 0.0F, -3.0F, 1.0F, 4.0F, 1.0F, 0.51F, false);
		Bodygray.texOffs(23, 71).addBox(2.5F, 0.0F, -3.0F, 1.0F, 4.0F, 1.0F, 0.51F, false);
		}
		
		Bodywhite = new ModelRenderer(this);
		Bodywhite.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodywhite.texOffs(0, 98).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		Bodywhite.texOffs(18, 35).addBox(1.0F, 2.0F, 2.0F, 3.0F, 3.0F, 1.0F, 0.51F, false);
		Bodywhite.texOffs(0, 54).addBox(1.0F, 4.0F, 3.0F, 3.0F, 3.0F, 1.0F, 0.1F, false);
		Bodywhite.texOffs(7, 54).addBox(-4.0F, 4.0F, 3.0F, 3.0F, 3.0F, 1.0F, 0.1F, false);
		Bodywhite.texOffs(18, 41).addBox(-4.0F, 2.0F, 2.0F, 3.0F, 3.0F, 1.0F, 0.51F, false);
		}
		
		Bodyredglow = new ModelRenderer(this);
		Bodyredglow.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyredglow.texOffs(27, 35).addBox(1.5F, 2.5F, 1.8F, 2.0F, 2.0F, 1.0F, 0.51F, false);
		Bodyredglow.texOffs(27, 42).addBox(-3.5F, 2.5F, 1.8F, 2.0F, 2.0F, 1.0F, 0.51F, false);
		}
		
		Bodyblack = new ModelRenderer(this);
		Bodyblack.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyblack.texOffs(42, 96).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		}
		
		Bodyred = new ModelRenderer(this);
		Bodyred.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyred.texOffs(16, 48).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		}
		
		RightArmblue = new ModelRenderer(this);
		RightArmblue.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmblue, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmblue.texOffs(40, 24).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		RightArmblue.texOffs(40, 40).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		RightArmwhite = new ModelRenderer(this);
		RightArmwhite.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmwhite, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmwhite.texOffs(37, 147).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		RightArmwhite.texOffs(18, 223).addBox(-3.0F, 2.6391F, -2.0F, 4.0F, 6.0F, 4.0F, 0.9F, false);
		}
		
		RightArmredglow = new ModelRenderer(this);
		RightArmredglow.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmredglow, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmredglow.texOffs(0, 248).addBox(-3.0F, 2.6391F, -2.0F, 4.0F, 6.0F, 4.0F, 0.9F, false);
		}
		
		RightArmblack = new ModelRenderer(this);
		RightArmblack.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmblack, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmblack.texOffs(40, 48).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		RightArmblack.texOffs(36, 165).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		RightArmblack.texOffs(43, 236).addBox(-3.0F, 2.6391F, -2.0F, 4.0F, 6.0F, 4.0F, 0.9F, false);
		}
		
		RightArmgray = new ModelRenderer(this);
		RightArmgray.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmgray, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmgray.texOffs(40, 64).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		LeftArmblue = new ModelRenderer(this);
		LeftArmblue.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmblue, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmblue.texOffs(57, 24).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArmblue.texOffs(57, 40).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		LeftArmwhite = new ModelRenderer(this);
		LeftArmwhite.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmwhite, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmwhite.texOffs(54, 147).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArmwhite.texOffs(18, 248).addBox(-1.0F, 2.6391F, -2.0F, 4.0F, 6.0F, 4.0F, 0.9F, false);
		}
		
		LeftArmredglow = new ModelRenderer(this);
		LeftArmredglow.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmredglow, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmredglow.texOffs(52, 248).addBox(-1.0F, 2.6391F, -2.0F, 4.0F, 6.0F, 4.0F, 0.9F, false);
		}
		
		LeftArmblack = new ModelRenderer(this);
		LeftArmblack.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmblack, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmblack.texOffs(57, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArmblack.texOffs(53, 165).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArmblack.texOffs(35, 248).addBox(-1.0F, 2.6391F, -2.0F, 4.0F, 6.0F, 4.0F, 0.9F, false);
		}
		
		LeftArmgray = new ModelRenderer(this);
		LeftArmgray.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgray, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmgray.texOffs(57, 64).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		RightLegblue = new ModelRenderer(this);
		RightLegblue.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegblue, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegblue.texOffs(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLegwhite = new ModelRenderer(this);
		RightLegwhite.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegwhite, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegwhite.texOffs(0, 147).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		RightLegwhite.texOffs(0, 165).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.3F, false);
		}
		
		RightLegblack = new ModelRenderer(this);
		RightLegblack.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegblack, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegblack.texOffs(0, 182).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.3F, false);
		}
		
		RightLegredglow = new ModelRenderer(this);
		RightLegredglow.setPos(-1.9F, 12.0F, -1.9632F);
		setRotationAngle(RightLegredglow, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegredglow.texOffs(59, 143).addBox(-1.0F, 10.5F, 0.0632F, 2.0F, 2.0F, 2.0F, 1.0F, false);
		RightLegredglow.texOffs(37, 182).addBox(-2.0F, 0.0F, -1.0368F, 4.0F, 12.0F, 4.0F, 1.3F, false);
		}
		
		LeftLegblue = new ModelRenderer(this);
		LeftLegblue.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegblue, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegblue.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLegwhite = new ModelRenderer(this);
		LeftLegwhite.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegwhite, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegwhite.texOffs(18, 147).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		LeftLegwhite.texOffs(17, 165).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.3F, true);
		}
		
		LeftLegblack = new ModelRenderer(this);
		LeftLegblack.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegblack, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegblack.texOffs(17, 182).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.3F, true);
		}
		
		LeftLegredglow = new ModelRenderer(this);
		LeftLegredglow.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegredglow, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegredglow.texOffs(59, 136).addBox(-1.0F, 10.2F, -1.0F, 2.0F, 2.0F, 2.0F, 1.0F, true);
		LeftLegredglow.texOffs(54, 182).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.3F, true);
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
		this.Headblue.copyFrom(this.head);
		Headblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodyblue.copyFrom(this.body);
		Bodyblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmblue.copyFrom(this.rightArm);
		RightArmblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmblue.copyFrom(this.leftArm);
		LeftArmblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegblue.copyFrom(this.rightLeg);
		RightLegblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen,fblue, alpha);
		this.LeftLegblue.copyFrom(this.leftLeg);
		LeftLegblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
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
		this.Headgray.copyFrom(this.head);
		Headgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodygray.copyFrom(this.body);
		Bodygray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmgray.copyFrom(this.rightArm);
		RightArmgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmgray.copyFrom(this.leftArm);
		LeftArmgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.FourthColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.FourthColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.FourthColor & 255) / 255.0F;
		this.Headgoldglow.copyFrom(this.head);
		Headgoldglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
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
		
		fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.ThirdColor & 255) / 255.0F;
		this.Bodyred.copyFrom(this.body);
		Bodyred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
		this.Headredglow.copyFrom(this.head);
		Headredglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodyredglow.copyFrom(this.body);
		Bodyredglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmredglow.copyFrom(this.rightArm);
		RightArmredglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmredglow.copyFrom(this.leftArm);
		LeftArmredglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegredglow.copyFrom(this.rightLeg);
		RightLegredglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegredglow.copyFrom(this.leftLeg);
		LeftLegredglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
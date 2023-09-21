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
public class gutsmanexe extends BipedModel {
	private final ModelRenderer Headyellow;
	private final ModelRenderer Headgray;
	private final ModelRenderer Headeyes;
	private final ModelRenderer Headblack;
	private final ModelRenderer Head_r1;
	private final ModelRenderer Headgreen;
	private final ModelRenderer Head_r2;
	private final ModelRenderer Bodygray;
	private final ModelRenderer Body_r1;
	private final ModelRenderer Body_r2;
	private final ModelRenderer Bodyred;
	private final ModelRenderer Bodydarkblue;
	private final ModelRenderer Bodyyellow;
	private final ModelRenderer Body_r3;
	private final ModelRenderer Bodygreen;
	private final ModelRenderer Body_r4;
	private final ModelRenderer Bodyblack;
	private final ModelRenderer Body_r5;
	private final ModelRenderer RightArmgray;
	private final ModelRenderer RightArmyellow;
	private final ModelRenderer LeftArmgray;
	private final ModelRenderer LeftArmyellow;
	private final ModelRenderer RightLegyellow;
	private final ModelRenderer RightLegblack;
	private final ModelRenderer LeftLegyellow;
	private final ModelRenderer LeftLegblack;
	
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

	public gutsmanexe(float modelSize, EquipmentSlotType slot) {
		super(modelSize);
		texWidth = 74;
		texHeight = 167;
		
		equipmentslot = slot;
		
		MainColorDefault = 16637468;//Main Body Color Yellow
		SecondaryColorDefault = 16590620;//Secondary Red
		ThirdColorDefault = 5395026; //Black
		WhiteColorDefault = 16777215;//Basic White
		GlowyColorDefault = 4296775;//Glow? green
		GrayColorDefault = 12895428;//Gray
		FourthColorDefault = 4296775; //Green
		
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
		FourthColor = FourthColorDefault;

		Headyellow = new ModelRenderer(this);
		Headyellow.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headyellow, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headyellow.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Headgray = new ModelRenderer(this);
		Headgray.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headgray, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headgray.texOffs(38, 151).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headgray.texOffs(0, 85).addBox(-4.0F, -1.0F, -7.0F, 8.0F, 2.0F, 3.0F, 1.2F, false);
		Headgray.texOffs(34, 4).addBox(5.4872F, -4.841F, -2.0F, 1.0F, 4.0F, 4.0F, 0.5F, false);
		Headgray.texOffs(48, 4).addBox(-5.8938F, -4.8448F, -2.0F, 1.0F, 4.0F, 4.0F, 0.5F, false);
		}
		
		Headeyes = new ModelRenderer(this);
		Headeyes.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headeyes, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headeyes.texOffs(58, 5).addBox(-3.5F, -6.0F, -4.3F, 7.0F, 5.0F, 1.0F, 1.0F, false);
		}
		
		Headblack = new ModelRenderer(this);
		Headblack.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headblack, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headblack.texOffs(25, 59).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headblack.texOffs(66, 32).addBox(-6.5F, -4.3F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, false);
		}
		
		Head_r1 = new ModelRenderer(this);
		Head_r1.setPos(0.0F, 24.0F, 0.0F);
		Headblack.addChild(Head_r1);
		setRotationAngle(Head_r1, 0.0F, 3.1416F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head_r1.texOffs(66, 13).addBox(-6.5F, -28.3F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, false);
		}
		Headgreen = new ModelRenderer(this);
		Headgreen.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headgreen, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headgreen.texOffs(49, -2).addBox(-6.5F, -4.3F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, false);
		Headgreen.texOffs(34, 79).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Head_r2 = new ModelRenderer(this);
		Head_r2.setPos(0.0F, 24.0F, 0.0F);
		Headgreen.addChild(Head_r2);
		setRotationAngle(Head_r2, 0.0F, 3.1416F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head_r2.texOffs(33, -2).addBox(-6.5F, -28.3F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, false);
		}
		
		Bodygray = new ModelRenderer(this);
		Bodygray.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodygray.texOffs(11, 103).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		Bodygray.texOffs(0, 67).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.71F, false);
		}
		
		Body_r1 = new ModelRenderer(this);
		Body_r1.setPos(0.0F, 20.0F, 3.0F);
		Bodygray.addChild(Body_r1);
		setRotationAngle(Body_r1, 0.0F, 3.1416F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Body_r1.texOffs(58, 74).addBox(0.5F, -20.0F, -3.0F, 4.0F, 6.0F, 4.0F, -0.5F, false);
		Body_r1.texOffs(58, 60).addBox(-4.5F, -20.0F, -3.0F, 4.0F, 6.0F, 4.0F, -0.5F, false);
		}
		
		Body_r2 = new ModelRenderer(this);
		Body_r2.setPos(1.0F, 18.0F, -4.0F);
		Bodygray.addChild(Body_r2);
		setRotationAngle(Body_r2, 0.0F, 3.1416F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Body_r2.texOffs(20, 45).addBox(-1.5F, -17.0F, -1.2F, 5.0F, 5.0F, 1.0F, -0.5F, false);
		}
		
		Bodyred = new ModelRenderer(this);
		Bodyred.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyred.texOffs(0, 51).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.71F, false);
		}
		
		Bodydarkblue = new ModelRenderer(this);
		Bodydarkblue.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodydarkblue.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.51F, false);
		}
		
		Bodyyellow = new ModelRenderer(this);
		Bodyyellow.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyyellow.texOffs(60, 120).addBox(-6.0F, 0.0F, -2.0F, 1.0F, 4.0F, 4.0F, 0.71F, false);
		Bodyyellow.texOffs(60, 131).addBox(5.0F, 0.0F, -2.0F, 1.0F, 4.0F, 4.0F, 0.71F, false);
		}
		
		Body_r3 = new ModelRenderer(this);
		Body_r3.setPos(0.0F, 20.0F, 3.0F);
		Bodyyellow.addChild(Body_r3);
		setRotationAngle(Body_r3, 0.0F, 3.1416F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Body_r3.texOffs(55, 106).addBox(0.5F, -20.0F, -3.0F, 4.0F, 6.0F, 4.0F, -0.5F, false);
		Body_r3.texOffs(37, 106).addBox(-4.5F, -20.0F, -3.0F, 4.0F, 6.0F, 4.0F, -0.5F, false);
		Body_r3.texOffs(47, 98).addBox(-2.5F, -19.0F, -2.0F, 5.0F, 5.0F, 2.0F, -0.5F, false);
		}
		
		Bodygreen = new ModelRenderer(this);
		Bodygreen.setPos(0.0F, 0.0F, 0.0F);
		

		Body_r4 = new ModelRenderer(this);
		Body_r4.setPos(1.0F, 18.0F, -4.0F);
		Bodygreen.addChild(Body_r4);
		setRotationAngle(Body_r4, 0.0F, 3.1416F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Body_r4.texOffs(20, 33).addBox(-1.5F, -17.0F, -1.2F, 5.0F, 5.0F, 1.0F, -0.5F, false);
		}
		
		Bodyblack = new ModelRenderer(this);
		Bodyblack.setPos(0.0F, 0.0F, 0.0F);
		

		Body_r5 = new ModelRenderer(this);
		Body_r5.setPos(1.0F, 18.0F, -4.0F);
		Bodyblack.addChild(Body_r5);
		setRotationAngle(Body_r5, 0.0F, 3.1416F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Body_r5.texOffs(20, 39).addBox(-1.5F, -17.0F, -1.2F, 5.0F, 5.0F, 1.0F, -0.5F, false);
		}
		
		RightArmgray = new ModelRenderer(this);
		RightArmgray.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmgray, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmgray.texOffs(41, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		RightArmyellow = new ModelRenderer(this);
		RightArmyellow.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmyellow, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmyellow.texOffs(58, 23).addBox(-3.0F, 4.6391F, -2.0F, 4.0F, 5.0F, 4.0F, 0.75F, false);
		RightArmyellow.texOffs(58, 14).addBox(-3.3F, 7.6391F, -1.5F, 1.0F, 3.0F, 3.0F, 0.75F, false);
		RightArmyellow.texOffs(41, 52).addBox(-3.0F, 4.6391F, -2.0F, 4.0F, 1.0F, 4.0F, 0.9F, false);
		}
		
		LeftArmgray = new ModelRenderer(this);
		LeftArmgray.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgray, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmgray.texOffs(41, 34).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		LeftArmyellow = new ModelRenderer(this);
		LeftArmyellow.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmyellow, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmyellow.texOffs(58, 41).addBox(-1.0F, 4.6391F, -2.0F, 4.0F, 5.0F, 4.0F, 0.75F, false);
		LeftArmyellow.texOffs(58, 33).addBox(4.9F, 7.6391F, -1.5F, 1.0F, 3.0F, 3.0F, 0.75F, false);
		LeftArmyellow.texOffs(58, 52).addBox(-1.0F, 4.6391F, -2.0F, 4.0F, 1.0F, 4.0F, 0.9F, false);
		}
		
		RightLegyellow = new ModelRenderer(this);
		RightLegyellow.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegyellow, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegyellow.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLegblack = new ModelRenderer(this);
		RightLegblack.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegblack, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegblack.texOffs(0, 151).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		LeftLegyellow = new ModelRenderer(this);
		LeftLegyellow.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegyellow, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegyellow.texOffs(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLegblack = new ModelRenderer(this);
		LeftLegblack.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegblack, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegblack.texOffs(17, 151).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
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
		this.Headyellow.copyFrom(this.head);
		Headyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodyyellow.copyFrom(this.body);
		Bodyyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmyellow.copyFrom(this.rightArm);
		RightArmyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmyellow.copyFrom(this.leftArm);
		LeftArmyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegyellow.copyFrom(this.rightLeg);
		RightLegyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegyellow.copyFrom(this.leftLeg);
		LeftLegyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
		this.Bodyred.copyFrom(this.body);
		Bodyred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
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
		
		
		this.Headeyes.copyFrom(this.head);
		Headeyes.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		
		fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.ThirdColor & 255) / 255.0F;
		this.Headblack.copyFrom(this.head);
		Headblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodydarkblue.copyFrom(this.body);
		Bodydarkblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodyblack.copyFrom(this.body);
		Bodyblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegblack.copyFrom(this.rightLeg);
		RightLegblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegblack.copyFrom(this.leftLeg);
		LeftLegblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.FourthColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.FourthColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.FourthColor & 255) / 255.0F;
		this.Headgreen.copyFrom(this.head);
		Headgreen.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodygreen.copyFrom(this.body);
		Bodygreen.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
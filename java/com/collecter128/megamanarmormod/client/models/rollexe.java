package com.collecter128.megamanarmormod.client.models;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports

@OnlyIn(Dist.CLIENT)
public class rollexe extends BipedModel {
	private final ModelRenderer Headpink;
	private final ModelRenderer Headpaleyellow;
	private final ModelRenderer Headred;
	private final ModelRenderer Headyellow;
	private final ModelRenderer Head_r1;
	private final ModelRenderer Headgreen;
	private final ModelRenderer Head_r2;
	private final ModelRenderer Headredglow;
	private final ModelRenderer Head_r3;
	private final ModelRenderer Headpaleyellowtransparent;
	private final ModelRenderer Headyellowglow;
	private final ModelRenderer Head_r4;
	private final ModelRenderer Bodypink;
	private final ModelRenderer Bodypaleyellow;
	private final ModelRenderer Body_r1;
	private final ModelRenderer Bodyredglow;
	private final ModelRenderer Body_r2;
	private final ModelRenderer Bodyred;
	private final ModelRenderer Body_r3;
	private final ModelRenderer Bodyyellowglow;
	private final ModelRenderer Body_r4;
	private final ModelRenderer RightArmred;
	private final ModelRenderer RightArmblack;
	private final ModelRenderer RightArmpaleyellow;
	private final ModelRenderer LeftArmred;
	private final ModelRenderer LeftArmdarkblue;
	private final ModelRenderer LeftArmpaleyellow;
	private final ModelRenderer RightLegpink;
	private final ModelRenderer RightLegred;
	private final ModelRenderer RightLegpaleyellow;
	private final ModelRenderer RightLegblack;
	private final ModelRenderer LeftLegpink;
	private final ModelRenderer LeftLegred;
	private final ModelRenderer LeftLegpaleyellow;
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

	public rollexe(float modelSize, EquipmentSlotType slot) {
		super(modelSize);
		texWidth = 74;
		texHeight = 171;
		
		equipmentslot = slot;
		
		MainColorDefault = 16744603;//Main Body Color Pink
		SecondaryColorDefault = 16138578;//Secondary pinkish red
		ThirdColorDefault = 15525763; //Pale Yellow
		WhiteColorDefault = 16777215;//Basic White
		GlowyColorDefault = 16762900;//Glow? yellow
		GrayColorDefault = 7757920;//black
		FourthColorDefault = 4599860; //black
		
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
		FourthColor = FourthColorDefault;

		Headpink = new ModelRenderer(this);
		Headpink.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headpink, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headpink.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headpink.texOffs(0, 55).addBox(-3.6706F, -7.6327F, -3.8533F, 8.0F, 7.0F, 8.0F, 0.55F, false);
		Headpink.texOffs(2, 2).addBox(-0.5F, -8.0F, -5.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		}
		
		Headpaleyellow = new ModelRenderer(this);
		Headpaleyellow.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headpaleyellow, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headpaleyellow.texOffs(34, 65).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headpaleyellow.texOffs(36, 4).addBox(5.4872F, -6.0F, -2.0F, 1.0F, 4.0F, 4.0F, 0.5F, false);
		Headpaleyellow.texOffs(50, 4).addBox(-5.8938F, -6.0F, -2.0F, 1.0F, 4.0F, 4.0F, 0.5F, false);
		}
		
		Headred = new ModelRenderer(this);
		Headred.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headred, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headred.texOffs(0, 154).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Headyellow = new ModelRenderer(this);
		Headyellow.setPos(-6.0F, -6.0F, -1.0F);
		//Headyellow.setPos(-6.0F, 0.0F, -1.0F);
		setRotationAngle(Headyellow, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headyellow.texOffs(43, 134).addBox(-4.0F, -7.0F, -6.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Headyellow.texOffs(52, 134).addBox(2.0F, -7.0F, -6.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		}
		
		Head_r1 = new ModelRenderer(this);
		Head_r1.setPos(0.0F, 24.0F, 0.0F);
		Headyellow.addChild(Head_r1);
		setRotationAngle(Head_r1, 0.3927F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head_r1.texOffs(56, 81).addBox(-3.0F, -20.0F, 14.0F, 7.0F, 19.0F, 1.0F, 0.0F, false);
		}
		
		Headgreen = new ModelRenderer(this);
		Headgreen.setPos(-6.0F, -6.0F, -1.0F);
		setRotationAngle(Headgreen, -0.1047F, 0.0873F, 0.0F);
		

		Head_r2 = new ModelRenderer(this);
		Head_r2.setPos(0.0F, 24.0F, 0.0F);
		Headgreen.addChild(Head_r2);
		setRotationAngle(Head_r2, 0.3927F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head_r2.texOffs(56, 105).addBox(-3.0F, -20.0F, 14.0F, 7.0F, 19.0F, 1.0F, 0.0F, false);
		}
		
		Headredglow = new ModelRenderer(this);
		Headredglow.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headredglow, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headredglow.texOffs(33, 0).addBox(-6.3038F, -5.0F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, false);
		}
		
		Head_r3 = new ModelRenderer(this);
		Head_r3.setPos(0.0F, 24.0F, 0.0F);
		Headredglow.addChild(Head_r3);
		setRotationAngle(Head_r3, 0.0F, 3.1416F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head_r3.texOffs(46, 0).addBox(-6.5F, -29.0F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, false);
		}
		
		Headpaleyellowtransparent = new ModelRenderer(this);
		Headpaleyellowtransparent.setPos(-6.0F, -6.0F, -1.0F);
		setRotationAngle(Headpaleyellowtransparent, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headpaleyellowtransparent.texOffs(3, 138).addBox(-7.0F, -7.0F, -4.0F, 3.0F, 1.0F, 11.0F, 1.0F, false);
		Headpaleyellowtransparent.texOffs(33, 138).addBox(5.0F, -7.0F, -4.0F, 3.0F, 1.0F, 11.0F, 1.0F, false);
		}
		
		Headyellowglow = new ModelRenderer(this);
		Headyellowglow.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headyellowglow, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headyellowglow.texOffs(41, 161).addBox(-6.3038F, -5.0F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, false);
		}
		
		Head_r4 = new ModelRenderer(this);
		Head_r4.setPos(0.0F, 24.0F, 0.0F);
		Headyellowglow.addChild(Head_r4);
		setRotationAngle(Head_r4, 0.0F, 3.1416F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head_r4.texOffs(57, 161).addBox(-6.5F, -29.0F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, false);
		}
		
		Bodypink = new ModelRenderer(this);
		Bodypink.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodypink.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.51F, false);
		}
		
		Bodypaleyellow = new ModelRenderer(this);
		Bodypaleyellow.setPos(0.0F, 0.0F, 0.0F);
		

		Body_r1 = new ModelRenderer(this);
		Body_r1.setPos(1.0F, 18.0F, -4.0F);
		Bodypaleyellow.addChild(Body_r1);
		setRotationAngle(Body_r1, 0.0F, 3.1416F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Body_r1.texOffs(19, 47).addBox(-2.0F, -18.0F, -1.2F, 6.0F, 6.0F, 1.0F, -1.02F, false);
		}
		
		Bodyredglow = new ModelRenderer(this);
		Bodyredglow.setPos(0.0F, 0.0F, 0.0F);
		

		Body_r2 = new ModelRenderer(this);
		Body_r2.setPos(2.0F, 17.0F, -5.0F);
		Bodyredglow.addChild(Body_r2);
		setRotationAngle(Body_r2, 0.0F, 3.1416F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Body_r2.texOffs(21, 35).addBox(-0.5F, -16.5F, -2.0F, 5.0F, 5.0F, 0.0F, -1.02F, false);
		}
		
		Bodyred = new ModelRenderer(this);
		Bodyred.setPos(0.0F, 0.0F, 0.0F);
		

		Body_r3 = new ModelRenderer(this);
		Body_r3.setPos(2.0F, 17.0F, -5.0F);
		Bodyred.addChild(Body_r3);
		setRotationAngle(Body_r3, 0.0F, 3.1416F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Body_r3.texOffs(26, 110).addBox(1.5F, -12.3F, -3.0F, 1.0F, 1.0F, 0.0F, -1.02F, false);
		}
		
		Bodyyellowglow = new ModelRenderer(this);
		Bodyyellowglow.setPos(0.0F, 0.0F, 0.0F);
		

		Body_r4 = new ModelRenderer(this);
		Body_r4.setPos(2.0F, 17.0F, -5.0F);
		Bodyyellowglow.addChild(Body_r4);
		setRotationAngle(Body_r4, 0.0F, 3.1416F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Body_r4.texOffs(21, 42).addBox(-0.5F, -16.5F, -2.0F, 5.0F, 5.0F, 0.0F, -1.02F, false);
		}
		
		RightArmred = new ModelRenderer(this);
		RightArmred.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmred, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmred.texOffs(57, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		RightArmblack = new ModelRenderer(this);
		RightArmblack.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmblack, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmblack.texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		RightArmpaleyellow = new ModelRenderer(this);
		RightArmpaleyellow.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmpaleyellow, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmpaleyellow.texOffs(40, 35).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 1.0F, 4.0F, 0.75F, false);
		}
		
		LeftArmred = new ModelRenderer(this);
		LeftArmred.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmred, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmred.texOffs(57, 40).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		LeftArmdarkblue = new ModelRenderer(this);
		LeftArmdarkblue.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmdarkblue, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmdarkblue.texOffs(40, 40).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		LeftArmpaleyellow = new ModelRenderer(this);
		LeftArmpaleyellow.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmpaleyellow, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmpaleyellow.texOffs(41, 56).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 1.0F, 4.0F, 0.75F, false);
		}
		
		RightLegpink = new ModelRenderer(this);
		RightLegpink.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegpink, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegpink.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLegred = new ModelRenderer(this);
		RightLegred.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegred, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegred.texOffs(0, 72).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLegpaleyellow = new ModelRenderer(this);
		RightLegpaleyellow.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegpaleyellow, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegpaleyellow.texOffs(40, 35).addBox(-2.0F, 4.0F, -2.0F, 4.0F, 1.0F, 4.0F, 1.25F, false);
		}
		
		RightLegblack = new ModelRenderer(this);
		RightLegblack.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegblack, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegblack.texOffs(1, 122).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		LeftLegpink = new ModelRenderer(this);
		LeftLegpink.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegpink, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegpink.texOffs(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLegred = new ModelRenderer(this);
		LeftLegred.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegred, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegred.texOffs(17, 72).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLegpaleyellow = new ModelRenderer(this);
		LeftLegpaleyellow.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegpaleyellow, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegpaleyellow.texOffs(41, 56).addBox(-2.0F, 4.0F, -2.0F, 4.0F, 1.0F, 4.0F, 1.5F, true);
		}
		
		LeftLegblack = new ModelRenderer(this);
		LeftLegblack.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegblack, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegblack.texOffs(20, 122).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
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
		this.Headpink.copyFrom(this.head);
		Headpink.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodypink.copyFrom(this.body);
		Bodypink.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegpink.copyFrom(this.rightLeg);
		RightLegpink.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegpink.copyFrom(this.leftLeg);
		LeftLegpink.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
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
		
		this.Headredglow.copyFrom(this.head);
		Headredglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodyredglow.copyFrom(this.body);
		Bodyredglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		
		
		this.Headgreen.copyFrom(this.head);
		Headgreen.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		
		fred = (float)( this.FourthColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.FourthColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.FourthColor & 255) / 255.0F;
		this.RightArmblack.copyFrom(this.rightArm);
		RightArmblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmdarkblue.copyFrom(this.leftArm);
		LeftArmdarkblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegblack.copyFrom(this.rightLeg);
		RightLegblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegblack.copyFrom(this.leftLeg);
		LeftLegblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
		this.Headyellow.copyFrom(this.head);
		Headyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		this.Headyellowglow.copyFrom(this.head);
		Headyellowglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodyyellowglow.copyFrom(this.body);
		Bodyyellowglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.ThirdColor & 255) / 255.0F;
		this.Headpaleyellow.copyFrom(this.head);
		Headpaleyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodypaleyellow.copyFrom(this.body);
		Bodypaleyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmpaleyellow.copyFrom(this.rightArm);
		RightArmpaleyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmpaleyellow.copyFrom(this.leftArm);
		LeftArmpaleyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegpaleyellow.copyFrom(this.rightLeg);
		RightLegpaleyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegpaleyellow.copyFrom(this.leftLeg);
		LeftLegpaleyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		buffer = Minecraft.getInstance().renderBuffers().bufferSource().getBuffer(RenderType.entityTranslucent(new ResourceLocation(
				"megamanarmormod:textures/armor/rollexe.png")));
		
		this.Headpaleyellowtransparent.copyFrom(this.head);
		Headpaleyellowtransparent.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
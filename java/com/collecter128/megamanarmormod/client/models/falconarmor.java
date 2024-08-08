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
public class falconarmor extends BipedModel {
	private final ModelRenderer Headblue;
	private final ModelRenderer Headyellow;
	private final ModelRenderer Headwhite;
	private final ModelRenderer Headgray;
	private final ModelRenderer Headredglow;
	private final ModelRenderer Bodyblue;
	private final ModelRenderer Body_r1;
	private final ModelRenderer Bodygreenglow;
	private final ModelRenderer Bodywhite;
	private final ModelRenderer Bodyred;
	private final ModelRenderer Bodygold;
	private final ModelRenderer Bodylightblue;
	private final ModelRenderer Bodygray;
	private final ModelRenderer RightArmblue;
	private final ModelRenderer RightArmwhite;
	private final ModelRenderer RightArmgreenglow;
	private final ModelRenderer RightArmyellow;
	private final ModelRenderer RightArmgray;
	private final ModelRenderer RightArmlightblue;
	private final ModelRenderer RightArmred;
	private final ModelRenderer LeftArmblue;
	private final ModelRenderer LeftArmwhite;
	private final ModelRenderer LeftArmgreenglow;
	private final ModelRenderer LeftArmyellow;
	private final ModelRenderer LeftArmgray;
	private final ModelRenderer LeftArmlightblue;
	private final ModelRenderer LeftArmred;
	private final ModelRenderer RightLegwhite;
	private final ModelRenderer RightLegblue;
	private final ModelRenderer RightLegyellow;
	private final ModelRenderer RightLegredglow;
	private final ModelRenderer LeftLegwhite;
	private final ModelRenderer LeftLegblue;
	private final ModelRenderer LeftLegyellow;
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

	public falconarmor(float modelSize, EquipmentSlotType slot) {
		super(modelSize);
		texWidth = 83;
		texHeight = 310;
		
		equipmentslot = slot;
		
		MainColorDefault = 2781423;//Main Body Color X Blue
		SecondaryColorDefault = 5752303;//Secondary Cyan tiel color
		ThirdColorDefault = 16642337; //Yellow Bits
		WhiteColorDefault = 16777215;//Basic White
		GlowyColorDefault = 16468504;//Glow?Red crystal thingy
		GrayColorDefault = 16777215;//Basic White
		FourthColorDefault = 9614024; //??? (Chest thingy for other armors?
		FifthColorDefault = 2935135; //green
		
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
		FourthColor = FourthColorDefault;
		FifthColor = FifthColorDefault;

		Headblue = new ModelRenderer(this);
		Headblue.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headblue, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headblue.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Headyellow = new ModelRenderer(this);
		Headyellow.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headyellow, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headyellow.texOffs(0, 148).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 11.0F, 1.5F, false);
		Headyellow.texOffs(0, 236).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Headwhite = new ModelRenderer(this);
		Headwhite.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headwhite, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headwhite.texOffs(24, 219).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headwhite.texOffs(48, 71).addBox(-1.0872F, -9.7F, -4.4855F, 2.0F, 5.0F, 10.0F, 0.4F, false);
		Headwhite.texOffs(10, 253).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 11.0F, 1.5F, false);
		}
		
		Headgray = new ModelRenderer(this);
		Headgray.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headgray, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headgray.texOffs(72, 0).addBox(5.4F, -4.9341F, -0.7842F, 1.0F, 3.0F, 3.0F, 0.5F, false);
		Headgray.texOffs(72, 7).addBox(-5.981F, -4.938F, -0.747F, 1.0F, 3.0F, 3.0F, 0.5F, false);
		Headgray.texOffs(32, 0).addBox(-3.6706F, -7.6327F, -3.8533F, 8.0F, 7.0F, 8.0F, 0.55F, false);
		}
		
		Headredglow = new ModelRenderer(this);
		Headredglow.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headredglow, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headredglow.texOffs(33, 236).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headredglow.texOffs(1, 2).addBox(-1.0F, -8.8411F, -5.6852F, 2.0F, 3.0F, 1.0F, 0.1F, false);
		Headredglow.texOffs(62, 0).addBox(5.1F, -3.9341F, -0.3F, 1.0F, 2.0F, 2.0F, 0.5F, false);
		Headredglow.texOffs(65, 7).addBox(-5.7F, -3.938F, -0.3F, 1.0F, 2.0F, 2.0F, 0.5F, false);
		}
		
		Bodyblue = new ModelRenderer(this);
		Bodyblue.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyblue.texOffs(20, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);
		Bodyblue.texOffs(4, 272).addBox(-2.0F, -1.0F, -2.0F, 0.0F, 6.0F, 20.0F, 0.7F, false);
		Bodyblue.texOffs(4, 272).addBox(3.5F, -1.0F, -2.0F, 0.0F, 6.0F, 20.0F, 0.7F, false);
		}
		
		Body_r1 = new ModelRenderer(this);
		Body_r1.setPos(0.0F, 5.0F, -3.0F);
		Bodyblue.addChild(Body_r1);
		setRotationAngle(Body_r1, 0.0F, -0.7854F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Body_r1.texOffs(65, 74).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.7F, false);
		}
		
		Bodygreenglow = new ModelRenderer(this);
		Bodygreenglow.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodygreenglow.texOffs(0, 220).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);
		}
		
		Bodywhite = new ModelRenderer(this);
		Bodywhite.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodywhite.texOffs(20, 64).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);
		Bodywhite.texOffs(2, 192).addBox(-2.0F, -1.0F, -2.0F, 0.0F, 6.0F, 20.0F, 0.7F, false);
		Bodywhite.texOffs(43, 192).addBox(3.5F, -1.0F, -2.0F, 0.0F, 6.0F, 20.0F, 0.7F, false);
		}
		
		Bodyred = new ModelRenderer(this);
		Bodyred.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyred.texOffs(4, 279).addBox(-2.0F, -1.0F, -2.0F, 0.0F, 6.0F, 20.0F, 0.7F, false);
		Bodyred.texOffs(43, 185).addBox(3.5F, -1.0F, -2.0F, 0.0F, 6.0F, 20.0F, 0.7F, false);
		}
		
		Bodygold = new ModelRenderer(this);	
		Bodygold.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodygold.texOffs(20, 80).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);
		}
		
		Bodylightblue = new ModelRenderer(this);
		Bodylightblue.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodylightblue.texOffs(20, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		}
		
		Bodygray = new ModelRenderer(this);
		Bodygray.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodygray.texOffs(20, 48).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		}
		
		RightArmblue = new ModelRenderer(this);
		RightArmblue.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmblue, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmblue.texOffs(44, 16).addBox(-5.0F, -3.2019F, -2.0F, 5.0F, 4.0F, 4.0F, 0.8F, false);
		RightArmblue.texOffs(61, 122).addBox(-3.5F, 2.6391F, -2.5F, 5.0F, 6.0F, 5.0F, 0.4F, false);
		}
		
		RightArmwhite = new ModelRenderer(this);
		RightArmwhite.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmwhite, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmwhite.texOffs(23, 99).addBox(-5.0F, -3.2019F, -2.0F, 5.0F, 4.0F, 4.0F, 0.8F, false);
		RightArmwhite.texOffs(61, 95).addBox(-3.5F, 2.6391F, -2.5F, 5.0F, 6.0F, 5.0F, 0.4F, false);
		}
		
		RightArmgreenglow = new ModelRenderer(this);
		RightArmgreenglow.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmgreenglow, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmgreenglow.texOffs(61, 109).addBox(-3.5F, 2.6391F, -2.5F, 5.0F, 6.0F, 5.0F, 0.4F, false);
		}
		
		RightArmyellow = new ModelRenderer(this);
		RightArmyellow.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmyellow, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmyellow.texOffs(61, 135).addBox(-3.5F, 2.6391F, -2.5F, 5.0F, 6.0F, 5.0F, 0.4F, false);
		}
		
		RightArmgray = new ModelRenderer(this);
		RightArmgray.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmgray, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmgray.texOffs(1, 88).addBox(-5.0F, -3.2019F, -2.0F, 5.0F, 4.0F, 4.0F, 0.8F, false);
		}
		
		RightArmlightblue = new ModelRenderer(this);
		RightArmlightblue.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmlightblue, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmlightblue.texOffs(44, 24).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		RightArmred = new ModelRenderer(this);
		RightArmred.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmred, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmred.texOffs(44, 41).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		RightArmred.texOffs(45, 87).addBox(-5.0F, -3.2019F, -2.0F, 5.0F, 4.0F, 4.0F, 0.8F, false);
		}
		
		LeftArmblue = new ModelRenderer(this);	
		LeftArmblue.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmblue, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmblue.texOffs(63, 16).addBox(0.0F, -3.3974F, -2.0F, 5.0F, 4.0F, 4.0F, 0.8F, false);
		LeftArmblue.texOffs(63, 150).addBox(-1.5F, 2.6391F, -2.5F, 5.0F, 6.0F, 5.0F, 0.4F, false);
		}
		
		LeftArmwhite = new ModelRenderer(this);
		LeftArmwhite.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmwhite, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmwhite.texOffs(42, 99).addBox(0.0F, -3.3974F, -2.0F, 5.0F, 4.0F, 4.0F, 0.8F, false);
		LeftArmwhite.texOffs(41, 150).addBox(-1.5F, 2.6391F, -2.5F, 5.0F, 6.0F, 5.0F, 0.4F, false);
		}
		
		LeftArmgreenglow = new ModelRenderer(this);
		LeftArmgreenglow.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgreenglow, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmgreenglow.texOffs(41, 163).addBox(-1.5F, 2.6391F, -2.5F, 5.0F, 6.0F, 5.0F, 0.4F, false);
		}
		
		LeftArmyellow = new ModelRenderer(this);
		LeftArmyellow.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmyellow, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmyellow.texOffs(63, 163).addBox(-1.5F, 2.6391F, -2.5F, 5.0F, 6.0F, 5.0F, 0.4F, false);
		}
		
		LeftArmgray = new ModelRenderer(this);
		LeftArmgray.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgray, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmgray.texOffs(1, 98).addBox(0.0F, -3.3974F, -2.0F, 5.0F, 4.0F, 4.0F, 0.8F, false);
		}
		
		LeftArmlightblue = new ModelRenderer(this);
		LeftArmlightblue.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmlightblue, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmlightblue.texOffs(61, 24).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		LeftArmred = new ModelRenderer(this);
		LeftArmred.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmred, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmred.texOffs(61, 41).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArmred.texOffs(64, 87).addBox(0.0F, -3.3974F, -2.0F, 5.0F, 4.0F, 4.0F, 0.8F, false);
		}
		
		RightLegwhite = new ModelRenderer(this);
		RightLegwhite.setPos(-1.9F, 13.0F, 0.0F);
		setRotationAngle(RightLegwhite, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegwhite.texOffs(0, 50).addBox(-2.6F, 0.5F, -2.5F, 5.0F, 12.0F, 5.0F, 0.6F, false);
		}
		
		RightLegblue = new ModelRenderer(this);
		RightLegblue.setPos(-1.9F, 13.0F, 0.0F);
		setRotationAngle(RightLegblue, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegblue.texOffs(0, 16).addBox(-2.6F, 0.5F, -2.5F, 5.0F, 12.0F, 5.0F, 0.6F, false);
		}
		
		RightLegyellow = new ModelRenderer(this);
		RightLegyellow.setPos(-1.9F, 13.0F, 0.0F);
		setRotationAngle(RightLegyellow, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegyellow.texOffs(0, 178).addBox(-2.6F, 0.5F, -2.5F, 5.0F, 12.0F, 5.0F, 0.6F, false);
		}
		
		RightLegredglow = new ModelRenderer(this);
		RightLegredglow.setPos(-1.9F, 13.0F, 0.0F);
		setRotationAngle(RightLegredglow, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegredglow.texOffs(42, 178).addBox(-2.6F, 0.5F, -2.5F, 5.0F, 12.0F, 5.0F, 0.6F, false);
		}
		
		LeftLegwhite = new ModelRenderer(this);
		LeftLegwhite.setPos(2.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegwhite, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegwhite.texOffs(0, 67).addBox(-2.4F, 0.5F, -2.5F, 5.0F, 12.0F, 5.0F, 0.6F, true);
		}
		
		LeftLegblue = new ModelRenderer(this);
		LeftLegblue.setPos(2.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegblue, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegblue.texOffs(0, 33).addBox(-2.4F, 0.5F, -2.5F, 5.0F, 12.0F, 5.0F, 0.6F, true);
		}
		
		LeftLegyellow = new ModelRenderer(this);
		LeftLegyellow.setPos(2.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegyellow, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegyellow.texOffs(21, 178).addBox(-2.4F, 0.5F, -2.5F, 5.0F, 12.0F, 5.0F, 0.6F, true);
		}
		
		LeftLegredglow = new ModelRenderer(this);
		LeftLegredglow.setPos(2.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegredglow, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegredglow.texOffs(63, 178).addBox(-2.4F, 0.5F, -2.5F, 5.0F, 12.0F, 5.0F, 0.6F, true);
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
		RightLegblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegblue.copyFrom(this.leftLeg);
		LeftLegblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
		this.Bodylightblue.copyFrom(this.body);
		Bodylightblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmlightblue.copyFrom(this.rightArm);
		RightArmlightblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmlightblue.copyFrom(this.leftArm);
		LeftArmlightblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.ThirdColor & 255) / 255.0F;
		this.Headyellow.copyFrom(this.head);
		Headyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodygold.copyFrom(this.body);
		Bodygold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmyellow.copyFrom(this.rightArm);
		RightArmyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmyellow.copyFrom(this.leftArm);
		LeftArmyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegyellow.copyFrom(this.rightLeg);
		RightLegyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegyellow.copyFrom(this.leftLeg);
		LeftLegyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
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
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
		this.Bodyred.copyFrom(this.body);
		Bodyred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmred.copyFrom(this.rightArm);
		RightArmred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmred.copyFrom(this.leftArm);
		LeftArmred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		this.Headredglow.copyFrom(this.head);
		Headredglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegredglow.copyFrom(this.rightLeg);
		RightLegredglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegredglow.copyFrom(this.leftLeg);
		LeftLegredglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.FifthColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.FifthColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.FifthColor & 255) / 255.0F;
		this.Bodygreenglow.copyFrom(this.body);
		Bodygreenglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmgreenglow.copyFrom(this.rightArm);
		RightArmgreenglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmgreenglow.copyFrom(this.leftArm);
		LeftArmgreenglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
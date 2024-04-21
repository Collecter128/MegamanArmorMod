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
public class modelpx extends BipedModel {
	private final ModelRenderer Headblack;
	private final ModelRenderer Headpurple;
	private final ModelRenderer Headwhite;
	private final ModelRenderer Headgray;
	private final ModelRenderer Headredglow;
	private final ModelRenderer Head2_r1;
	private final ModelRenderer Bodypurple;
	private final ModelRenderer Bodyred;
	private final ModelRenderer Body_r1;
	private final ModelRenderer Body_r2;
	private final ModelRenderer Bodyblack;
	private final ModelRenderer Bodygold;
	private final ModelRenderer RightArmpurple;
	private final ModelRenderer RightArmgold;
	private final ModelRenderer RightArmredglow;
	private final ModelRenderer RightArmblack;
	private final ModelRenderer RightArmwhite;
	private final ModelRenderer LeftArmpurple;
	private final ModelRenderer LeftArmgold;
	private final ModelRenderer LeftArmredglow;
	private final ModelRenderer LeftArmblack;
	private final ModelRenderer LeftArmwhite;
	private final ModelRenderer RightLegpurple;
	private final ModelRenderer RightLegblack;
	private final ModelRenderer RightLeggold;
	private final ModelRenderer RightLegglow;
	private final ModelRenderer LeftLegpurple;
	private final ModelRenderer LeftLegblack;
	private final ModelRenderer LeftLeggold;
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

	public modelpx(float modelSize, EquipmentSlotType slot) {
		super(modelSize);
		texWidth = 78;
		texHeight = 243;
		
		equipmentslot = slot;
		
		MainColorDefault = 14354054;//Main Purple
		SecondaryColorDefault = 16641486;//Secondary cream white
		ThirdColorDefault = 16761907; //Gold Color
		WhiteColorDefault = 16641486;//Cream White
		GlowyColorDefault = 16454464;//Glow? red
		GrayColorDefault = 13287110;//Gray
		FourthColorDefault = 8611706;//Blackish color
		FifthColorDefault = 16724835; //Red
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
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headblack.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Headpurple = new ModelRenderer(this);
		Headpurple.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headpurple.texOffs(2, 205).addBox(-4.0F, -11.0F, -4.0F, 8.0F, 11.0F, 8.0F, 1.5F, false);
		Headpurple.texOffs(4, 96).addBox(-4.0F, -2.0F, -4.0F, 8.0F, 3.0F, 4.0F, 1.6F, false);
		}
		
		Headwhite = new ModelRenderer(this);
		Headwhite.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headwhite.texOffs(4, 107).addBox(-4.0F, -2.0F, -4.0F, 8.0F, 3.0F, 4.0F, 1.6F, false);
		Headwhite.texOffs(0, 66).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headwhite.texOffs(2, 224).addBox(-4.0F, -11.0F, -4.0F, 8.0F, 11.0F, 8.0F, 1.5F, false);
		}
		
		Headgray = new ModelRenderer(this);
		Headgray.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headgray.texOffs(0, 50).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 7.0F, 8.0F, 0.75F, false);
		}
		
		Headredglow = new ModelRenderer(this);
		Headredglow.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headredglow.texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headredglow.texOffs(42, 68).addBox(-1.5F, -9.5707F, -4.5F, 3.0F, 4.0F, 10.0F, 0.25F, false);
		}
		
		Head2_r1 = new ModelRenderer(this);
		Head2_r1.setPos(0.0F, -8.0F, -5.0F);
		Headredglow.addChild(Head2_r1);
		setRotationAngle(Head2_r1, 0.6109F, -0.7854F, -0.4363F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head2_r1.texOffs(25, 1).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F, 0.25F, false);
		}
		
		Bodypurple = new ModelRenderer(this);
		Bodypurple.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodypurple.texOffs(16, 16).addBox(-4.5F, 0.0F, -2.5F, 9.0F, 12.0F, 5.0F, 0.6F, false);
		}
		
		Bodyred = new ModelRenderer(this);
		Bodyred.setPos(0.0F, 0.0F, 0.0F);
		

		Body_r1 = new ModelRenderer(this);
		Body_r1.setPos(0.0F, -1.0F, 3.0F);
		Bodyred.addChild(Body_r1);
		setRotationAngle(Body_r1, 0.4363F, -0.2618F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Body_r1.texOffs(57, 218).addBox(-5.5F, 1.0F, 1.5F, 7.0F, 21.0F, 1.0F, 0.6F, false);
		}
		
		Body_r2 = new ModelRenderer(this);
		Body_r2.setPos(0.0F, -1.0F, 3.0F);
		Bodyred.addChild(Body_r2);
		setRotationAngle(Body_r2, 0.4363F, 0.2618F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Body_r2.texOffs(39, 218).addBox(-0.5F, 1.0F, 1.5F, 7.0F, 21.0F, 1.0F, 0.6F, false);
		}
		
		Bodyblack = new ModelRenderer(this);
		Bodyblack.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyblack.texOffs(16, 33).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		}
		
		Bodygold = new ModelRenderer(this);
		Bodygold.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodygold.texOffs(29, 91).addBox(-4.5F, 0.0F, -2.5F, 9.0F, 12.0F, 5.0F, 0.6F, false);
		}
		
		RightArmpurple = new ModelRenderer(this);
		RightArmpurple.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmpurple, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmpurple.texOffs(1, 166).addBox(-3.0F, -2.3609F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		RightArmgold = new ModelRenderer(this);
		RightArmgold.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmgold, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmgold.texOffs(44, 33).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 5.0F, 4.0F, 0.75F, false);
		}
		
		RightArmredglow = new ModelRenderer(this);
		RightArmredglow.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmredglow, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmredglow.texOffs(42, 53).addBox(-3.3F, 5.5F, -1.5F, 1.0F, 3.0F, 3.0F, 0.75F, false);
		}
		
		RightArmblack = new ModelRenderer(this);
		RightArmblack.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmblack, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmblack.texOffs(44, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		RightArmwhite = new ModelRenderer(this);
		RightArmwhite.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmwhite, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmwhite.texOffs(45, 165).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		RightArmwhite.texOffs(1, 175).addBox(-3.0F, -3.3609F, -2.0F, 4.0F, 4.0F, 4.0F, 0.8F, false);
		}
		
		LeftArmpurple = new ModelRenderer(this);
		LeftArmpurple.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmpurple, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmpurple.texOffs(18, 167).addBox(-1.0F, -2.3609F, -2.0F, 4.0F, 2.0F, 4.0F, 0.75F, false);
		}
		
		LeftArmgold = new ModelRenderer(this);
		LeftArmgold.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgold, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmgold.texOffs(61, 33).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 5.0F, 4.0F, 0.75F, false);
		}
		
		LeftArmredglow = new ModelRenderer(this);
		LeftArmredglow.setPos(5.0F, 2.0F, 1.0F);
		setRotationAngle(LeftArmredglow, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmredglow.texOffs(46, 53).addBox(2.2F, 5.5F, -1.5F, 1.0F, 3.0F, 3.0F, 0.75F, false);
		}
		
		LeftArmblack = new ModelRenderer(this);
		LeftArmblack.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmblack, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmblack.texOffs(61, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		LeftArmwhite = new ModelRenderer(this);
		LeftArmwhite.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmwhite, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmwhite.texOffs(62, 165).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArmwhite.texOffs(18, 176).addBox(-1.0F, -2.3609F, -2.0F, 4.0F, 3.0F, 4.0F, 0.8F, false);
		}
		
		RightLegpurple = new ModelRenderer(this);
		RightLegpurple.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegpurple, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegpurple.texOffs(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		RightLegpurple.texOffs(41, 209).addBox(-1.0F, 4.0F, -3.0F, 2.0F, 3.0F, 1.0F, 1.0F, false);
		}
		
		RightLegblack = new ModelRenderer(this);
		RightLegblack.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegblack, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegblack.texOffs(34, 187).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLeggold = new ModelRenderer(this);
		RightLeggold.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeggold, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLeggold.texOffs(0, 187).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLegglow = new ModelRenderer(this);
		RightLegglow.setPos(-2.9F, 12.0F, -0.9632F);
		setRotationAngle(RightLegglow, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegglow.texOffs(67, 184).addBox(0.0F, 9.5F, -0.0368F, 2.0F, 3.0F, 2.0F, 1.0F, false);
		}
		
		LeftLegpurple = new ModelRenderer(this);
		LeftLegpurple.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegpurple, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegpurple.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		LeftLegpurple.texOffs(49, 209).addBox(-1.0F, 4.0F, -3.0F, 2.0F, 3.0F, 1.0F, 1.0F, true);
		}
		
		LeftLegblack = new ModelRenderer(this);
		LeftLegblack.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegblack, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegblack.texOffs(51, 187).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLeggold = new ModelRenderer(this);
		LeftLeggold.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeggold, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLeggold.texOffs(17, 187).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLegglow = new ModelRenderer(this);
		LeftLegglow.setPos(0.9F, 12.0F, 1.0F);
		setRotationAngle(LeftLegglow, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegglow.texOffs(67, 193).addBox(0.0F, 8.2F, -2.0F, 2.0F, 4.0F, 2.0F, 1.0F, true);
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
		this.Headpurple.copyFrom(this.head);
		Headpurple.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodypurple.copyFrom(this.body);
		Bodypurple.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmpurple.copyFrom(this.rightArm);
		RightArmpurple.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmpurple.copyFrom(this.leftArm);
		LeftArmpurple.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegpurple.copyFrom(this.rightLeg);
		RightLegpurple.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegpurple.copyFrom(this.leftLeg);
		LeftLegpurple.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.FourthColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.FourthColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.FourthColor & 255) / 255.0F;
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
		
		fred = (float)( this.FifthColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.FifthColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.FifthColor & 255) / 255.0F;
		this.Bodyred.copyFrom(this.body);
		Bodyred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.WhiteColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.WhiteColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.WhiteColor & 255) / 255.0F;
		this.Headwhite.copyFrom(this.head);
		Headwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmwhite.copyFrom(this.rightArm);
		RightArmwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmwhite.copyFrom(this.leftArm);
		LeftArmwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GrayColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GrayColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GrayColor & 255) / 255.0F;
		this.Headgray.copyFrom(this.head);
		Headgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
		this.Headredglow.copyFrom(this.head);
		Headredglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmredglow.copyFrom(this.rightArm);
		RightArmredglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmredglow.copyFrom(this.leftArm);
		LeftArmredglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
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
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
public class harpnote extends BipedModel {
	private final ModelRenderer Headdarkpink;
	private final ModelRenderer Headpink;
	private final ModelRenderer Headgray;
	private final ModelRenderer Head5_r1;
	private final ModelRenderer Head4_r1;
	private final ModelRenderer Headyellow;
	private final ModelRenderer Headclearlightblue;
	private final ModelRenderer Bodyblack;
	private final ModelRenderer Bodydarkpink;
	private final ModelRenderer Bodygray;
	private final ModelRenderer Body_r1;
	private final ModelRenderer Bodyyellow;
	private final ModelRenderer RightArmdarkpink;
	private final ModelRenderer RightArmblack;
	private final ModelRenderer RightArmgray;
	private final ModelRenderer RightArmyellow;
	private final ModelRenderer LeftArmblack;
	private final ModelRenderer LeftArmdarkpink;
	private final ModelRenderer LeftArmgray;
	private final ModelRenderer LeftArmyellow;
	private final ModelRenderer Legsskirtblack;
	private final ModelRenderer LegsSkirtdarkpink;
	private final ModelRenderer Body_r2;
	private final ModelRenderer Body_r3;
	private final ModelRenderer LegsSkirtgray;
	private final ModelRenderer Body_r4;
	private final ModelRenderer LegsRightBlack;
	private final ModelRenderer LegsLeftblack;
	private final ModelRenderer RightLegdarkpink;
	private final ModelRenderer RightLegyellow;
	private final ModelRenderer RightLeggray;
	private final ModelRenderer LeftLegdarkpink;
	private final ModelRenderer LeftLegyellow;
	private final ModelRenderer LeftLeggray;
	
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

	public harpnote(float modelSize, EquipmentSlotType slot) {
		super(modelSize);
		texWidth = 74;
		texHeight = 168;
		
		equipmentslot = slot;
		
		MainColorDefault = 16737926;//Main Body Color Dark Pink
		SecondaryColorDefault = 16751006;//Secondary Pink
		ThirdColorDefault = 16768845; //Yellow
		WhiteColorDefault = 16777215;//Basic White
		GlowyColorDefault = 391167;//Glow Light Blue
		GrayColorDefault = 13686748;// Grey
		FourthColorDefault = 7161450; // Black
		
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
		FourthColor = FourthColorDefault;

		Headdarkpink = new ModelRenderer(this);
		Headdarkpink.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headdarkpink.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Headpink = new ModelRenderer(this);
		Headpink.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headpink.texOffs(0, 3).addBox(-1.5F, -8.5F, -5.0F, 3.0F, 3.0F, 1.0F, 0.1F, false);
		}
		
		Headgray = new ModelRenderer(this);
		Headgray.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headgray.texOffs(0, 89).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Head5_r1 = new ModelRenderer(this);
		Head5_r1.setPos(0.0F, -4.0F, 0.0F);
		Headgray.addChild(Head5_r1);
		setRotationAngle(Head5_r1, 0.0F, 0.0F, -0.48F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head5_r1.texOffs(37, 1).addBox(5.2F, -1.5F, -1.5F, 1.0F, 2.0F, 2.0F, 1.0F, false);
		Head5_r1.texOffs(42, 5).addBox(6.0F, -2.0F, -2.0F, 1.0F, 3.0F, 3.0F, 1.0F, false);
		}
		
		Head4_r1 = new ModelRenderer(this);
		Head4_r1.setPos(0.0F, -4.0F, 0.0F);
		Headgray.addChild(Head4_r1);
		setRotationAngle(Head4_r1, 0.0F, 0.0F, 0.48F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head4_r1.texOffs(31, 1).addBox(-6.2F, -1.5F, -1.5F, 1.0F, 2.0F, 2.0F, 1.0F, false);
		Head4_r1.texOffs(33, 5).addBox(-7.0F, -2.0F, -2.0F, 1.0F, 3.0F, 3.0F, 1.0F, false);
		}
		
		Headyellow = new ModelRenderer(this);
		Headyellow.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headyellow.texOffs(0, 72).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Headclearlightblue = new ModelRenderer(this);
		Headclearlightblue.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headclearlightblue.texOffs(0, 55).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Bodyblack = new ModelRenderer(this);
		Bodyblack.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyblack.texOffs(33, 67).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		}

		Bodydarkpink = new ModelRenderer(this);
		Bodydarkpink.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodydarkpink.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.71F, false);
		Bodydarkpink.texOffs(19, 35).addBox(-3.5F, 1.0F, -4.0F, 7.0F, 6.0F, 1.0F, -1.0F, false);
		}
		
		Bodygray = new ModelRenderer(this);
		Bodygray.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodygray.texOffs(32, 83).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.71F, false);
		}
		
		Body_r1 = new ModelRenderer(this);
		Body_r1.setPos(0.0F, 2.0F, 0.0F);
		Bodygray.addChild(Body_r1);
		setRotationAngle(Body_r1, 0.3491F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Body_r1.texOffs(63, 128).addBox(-1.0F, -1.0F, 1.0F, 2.0F, 12.0F, 2.0F, 0.71F, false);
		}
		
		Bodyyellow = new ModelRenderer(this);
		Bodyyellow.setPos(-1.0F, -5.0F, -2.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyyellow.texOffs(19, 42).addBox(-3.5F, 1.0F, -4.0F, 7.0F, 6.0F, 1.0F, -1.0F, false);
		}
		
		RightArmdarkpink = new ModelRenderer(this);
		RightArmdarkpink.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmdarkpink, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmdarkpink.texOffs(57, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		RightArmblack = new ModelRenderer(this);
		RightArmblack.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmblack, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmblack.texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		RightArmgray = new ModelRenderer(this);
		RightArmgray.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmgray, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmgray.texOffs(58, 79).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		RightArmyellow = new ModelRenderer(this);
		RightArmyellow.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmyellow, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmyellow.texOffs(53, 5).addBox(-3.5F, 6.6391F, -2.5F, 5.0F, 1.0F, 5.0F, 0.75F, false);
		}
		
		LeftArmblack = new ModelRenderer(this);
		LeftArmblack.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmblack, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmblack.texOffs(40, 40).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		LeftArmdarkpink = new ModelRenderer(this);
		LeftArmdarkpink.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmdarkpink, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmdarkpink.texOffs(57, 40).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		LeftArmgray = new ModelRenderer(this);
		LeftArmgray.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgray, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmgray.texOffs(58, 96).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		LeftArmyellow = new ModelRenderer(this);
		LeftArmyellow.setPos(5.0F, 3.0F, 0.0F);
		setRotationAngle(LeftArmyellow, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmyellow.texOffs(37, 60).addBox(-1.5F, 6.6391F, -2.5F, 5.0F, 1.0F, 5.0F, 0.75F, false);
		}
		
		Legsskirtblack = new ModelRenderer(this);
		Legsskirtblack.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		Legsskirtblack.texOffs(16, 108).addBox(-4.0F, 9.0F, -2.0F, 8.0F, 3.0F, 4.0F, 0.41F, false);
		}
		
		LegsSkirtdarkpink = new ModelRenderer(this);
		LegsSkirtdarkpink.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		LegsSkirtdarkpink.texOffs(5, 125).addBox(-4.0F, 1.0F, -2.0F, 8.0F, 11.0F, 4.0F, 0.61F, false);
		}
		
		Body_r2 = new ModelRenderer(this);
		Body_r2.setPos(0.0F, 8.0F, 0.0F);
		LegsSkirtdarkpink.addChild(Body_r2);
		setRotationAngle(Body_r2, 0.3054F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		Body_r2.texOffs(34, 133).addBox(-4.0F, 0.0F, -1.0F, 8.0F, 5.0F, 3.0F, 0.51F, false);
		}
		
		Body_r3 = new ModelRenderer(this);
		Body_r3.setPos(0.0F, 8.0F, 0.0F);
		LegsSkirtdarkpink.addChild(Body_r3);
		setRotationAngle(Body_r3, -0.3054F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		Body_r3.texOffs(35, 124).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 5.0F, 3.0F, 0.51F, false);
		}
		
		LegsSkirtgray = new ModelRenderer(this);
		LegsSkirtgray.setPos(0.0F, 0.0F, 0.0F);
		

		Body_r4 = new ModelRenderer(this);
		Body_r4.setPos(0.0F, 8.0F, 0.0F);
		LegsSkirtgray.addChild(Body_r4);
		setRotationAngle(Body_r4, -0.3054F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		Body_r4.texOffs(35, 143).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 5.0F, 3.0F, 0.51F, false);
		}
		
		LegsRightBlack = new ModelRenderer(this);
		LegsRightBlack.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(LegsRightBlack, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		LegsRightBlack.texOffs(0, 107).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.51F, false);
		}
		
		LegsLeftblack = new ModelRenderer(this);
		LegsLeftblack.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LegsLeftblack, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		LegsLeftblack.texOffs(40, 107).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.51F, true);
		}
		
		RightLegdarkpink = new ModelRenderer(this);
		RightLegdarkpink.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegdarkpink, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegdarkpink.texOffs(39, 161).addBox(-2.0F, 4.0F, -2.0F, 4.0F, 3.0F, 4.0F, 1.2F, false);
		RightLegdarkpink.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLegyellow = new ModelRenderer(this);
		RightLegyellow.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegyellow, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegyellow.texOffs(39, 154).addBox(-2.0F, 4.0F, -2.0F, 4.0F, 3.0F, 4.0F, 1.2F, false);
		}
		
		RightLeggray = new ModelRenderer(this);
		RightLeggray.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeggray, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLeggray.texOffs(0, 152).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		LeftLegdarkpink = new ModelRenderer(this);
		LeftLegdarkpink.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegdarkpink, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegdarkpink.texOffs(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		LeftLegdarkpink.texOffs(57, 161).addBox(-2.0F, 4.0F, -2.0F, 4.0F, 3.0F, 4.0F, 1.2F, true);
		}
		
		LeftLegyellow = new ModelRenderer(this);
		LeftLegyellow.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegyellow, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegyellow.texOffs(57, 154).addBox(-2.0F, 4.0F, -2.0F, 4.0F, 3.0F, 4.0F, 1.2F, true);
		}
		
		LeftLeggray = new ModelRenderer(this);
		LeftLeggray.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeggray, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLeggray.texOffs(18, 152).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
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
		this.Headdarkpink.copyFrom(this.head);
		Headdarkpink.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodydarkpink.copyFrom(this.body);
		Bodydarkpink.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmdarkpink.copyFrom(this.rightArm);
		RightArmdarkpink.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmdarkpink.copyFrom(this.leftArm);
		LeftArmdarkpink.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LegsSkirtdarkpink.copyFrom(this.body);
		LegsSkirtdarkpink.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegdarkpink.copyFrom(this.rightLeg);
		RightLegdarkpink.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegdarkpink.copyFrom(this.leftLeg);
		LeftLegdarkpink.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
		this.Headpink.copyFrom(this.head);
		Headpink.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
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
		this.LegsSkirtgray.copyFrom(this.body);
		LegsSkirtgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLeggray.copyFrom(this.rightLeg);
		RightLeggray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeggray.copyFrom(this.leftLeg);
		LeftLeggray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.ThirdColor & 255) / 255.0F;
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
		
		fred = (float)( this.FourthColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.FourthColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.FourthColor & 255) / 255.0F;
		this.Bodyblack.copyFrom(this.body);
		Bodyblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmblack.copyFrom(this.rightArm);
		RightArmblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmblack.copyFrom(this.leftArm);
		LeftArmblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Legsskirtblack.copyFrom(this.body);
		Legsskirtblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LegsRightBlack.copyFrom(this.rightLeg);
		LegsRightBlack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LegsLeftblack.copyFrom(this.leftLeg);
		LegsLeftblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
        
        buffer = Minecraft.getInstance().renderBuffers().bufferSource().getBuffer(RenderType.entityTranslucent(new ResourceLocation(
				"megamanarmormod:textures/armor/harpnote.png")));
		this.Headclearlightblue.copyFrom(this.head);
		Headclearlightblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
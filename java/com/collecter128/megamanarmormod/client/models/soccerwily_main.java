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
public class soccerwily_main extends BipedModel {
	private final ModelRenderer Headwhite;
	private final ModelRenderer Bodywhite;
	private final ModelRenderer Bodypink;
	private final ModelRenderer Bodyblue;
	private final ModelRenderer Bodyyellowglow;
	private final ModelRenderer Bodyyellow;
	private final ModelRenderer RightArmpink;
	private final ModelRenderer RightArm_r1;
	private final ModelRenderer RightArmyellow;
	private final ModelRenderer RightArm_r2;
	private final ModelRenderer RightArmblue;
	private final ModelRenderer RightArm4_r1;
	private final ModelRenderer RightArm4_r2;
	private final ModelRenderer RightArm3_r1;
	private final ModelRenderer LeftArmpink;
	private final ModelRenderer LeftArm_r1;
	private final ModelRenderer LeftArmyellow;
	private final ModelRenderer LeftArm_r2;
	private final ModelRenderer LeftArmblue;
	private final ModelRenderer LeftArm4_r1;
	private final ModelRenderer LeftArm4_r2;
	private final ModelRenderer LeftArm3_r1;
	private final ModelRenderer RightLegpink;
	private final ModelRenderer RightLegyellow;
	private final ModelRenderer RightLeg3_r1;
	private final ModelRenderer LeftLegpink;
	private final ModelRenderer LeftLegyellow;
	private final ModelRenderer LeftLeg3_r1;
	
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

	public soccerwily_main(float modelSize, EquipmentSlotType slot) {
		super(modelSize);
		texWidth = 74;
		texHeight = 140;
		
		equipmentslot = slot;
		
		MainColorDefault = 16723659;//Main Body Color pink
		SecondaryColorDefault = 7109589;//Secondary blue
		ThirdColorDefault = 16763904; //yellow
		WhiteColorDefault = 14409185;//White
		GlowyColorDefault = 16763904;//Glow? yellow
		GrayColorDefault = 9018020;//gray
		FourthColorDefault = 15073291; //red
		
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
		FourthColor = FourthColorDefault;

		Headwhite = new ModelRenderer(this);
		Headwhite.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headwhite.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Bodywhite = new ModelRenderer(this);
		Bodywhite.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodywhite.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		Bodywhite.texOffs(20, 48).addBox(-2.5F, 6.0F, -2.3F, 5.0F, 3.0F, 1.0F, 0.51F, false);
		}
		
		Bodypink = new ModelRenderer(this);
		Bodypink.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodypink.texOffs(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		}
		
		Bodyblue = new ModelRenderer(this);
		Bodyblue.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyblue.texOffs(37, 65).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		}
		
		Bodyyellowglow = new ModelRenderer(this);
		Bodyyellowglow.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyyellowglow.texOffs(0, 124).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		}
		
		Bodyyellow = new ModelRenderer(this);
		Bodyyellow.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyyellow.texOffs(27, 124).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		}
		
		RightArmpink = new ModelRenderer(this);
		RightArmpink.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmpink, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmpink.texOffs(57, 39).addBox(-3.0F, 4.6391F, -2.0F, 4.0F, 6.0F, 4.0F, 0.75F, false);
		}
		
		RightArm_r1 = new ModelRenderer(this);
		RightArm_r1.setPos(0.0F, 0.0F, 0.0F);
		RightArmpink.addChild(RightArm_r1);
		setRotationAngle(RightArm_r1, 0.0F, 0.0F, 0.1745F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArm_r1.texOffs(2, 62).addBox(-5.0F, -3.3609F, -2.0F, 5.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		RightArmyellow = new ModelRenderer(this);
		RightArmyellow.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmyellow, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmyellow.texOffs(57, 12).addBox(-3.0F, 4.6391F, -2.0F, 4.0F, 6.0F, 4.0F, 0.75F, false);
		}
		
		RightArm_r2 = new ModelRenderer(this);
		RightArm_r2.setPos(0.0F, 0.0F, 0.0F);
		RightArmyellow.addChild(RightArm_r2);
		setRotationAngle(RightArm_r2, 0.0F, 0.0F, -0.2182F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArm_r2.texOffs(23, 64).addBox(-5.0F, -6.3609F, 0.5F, 5.0F, 4.0F, 1.0F, 0.75F, false);
		}
		
		RightArmblue = new ModelRenderer(this);
		RightArmblue.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmblue, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmblue.texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		RightArm4_r1 = new ModelRenderer(this);
		RightArm4_r1.setPos(-1.0F, 11.0F, 0.0F);
		RightArmblue.addChild(RightArm4_r1);
		setRotationAngle(RightArm4_r1, 0.0F, 0.3054F, -0.3927F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArm4_r1.texOffs(46, 34).addBox(-4.0F, -1.0F, 1.0F, 2.0F, 3.0F, 1.0F, 0.5F, false);
		}
		
		RightArm4_r2 = new ModelRenderer(this);
		RightArm4_r2.setPos(-1.0F, 11.0F, 0.0F);
		RightArmblue.addChild(RightArm4_r2);
		setRotationAngle(RightArm4_r2, 0.0F, 0.0F, 0.3054F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArm4_r2.texOffs(51, 34).addBox(1.0F, -1.0F, -1.0F, 2.0F, 3.0F, 1.0F, 0.5F, false);
		}
		
		RightArm3_r1 = new ModelRenderer(this);
		RightArm3_r1.setPos(-1.0F, 11.0F, 0.0F);
		RightArmblue.addChild(RightArm3_r1);
		setRotationAngle(RightArm3_r1, 0.0F, -0.3927F, -0.3927F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArm3_r1.texOffs(41, 34).addBox(-4.0F, -1.0F, -1.0F, 2.0F, 3.0F, 1.0F, 0.5F, false);
		}
		
		LeftArmpink = new ModelRenderer(this);
		LeftArmpink.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmpink, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmpink.texOffs(57, 50).addBox(-1.0F, 4.6391F, -2.0F, 4.0F, 6.0F, 4.0F, 0.75F, false);
		}
		
		LeftArm_r1 = new ModelRenderer(this);
		LeftArm_r1.setPos(0.0F, 0.0F, 0.0F);
		LeftArmpink.addChild(LeftArm_r1);
		setRotationAngle(LeftArm_r1, 0.0F, 0.0F, -0.1745F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArm_r1.texOffs(2, 72).addBox(0.0F, -3.3609F, -2.0F, 5.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		LeftArmyellow = new ModelRenderer(this);
		LeftArmyellow.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmyellow, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmyellow.texOffs(57, 23).addBox(-1.0F, 4.6391F, -2.0F, 4.0F, 6.0F, 4.0F, 0.75F, false);
		}
		
		LeftArm_r2 = new ModelRenderer(this);
		LeftArm_r2.setPos(0.0F, 0.0F, 0.0F);
		LeftArmyellow.addChild(LeftArm_r2);
		setRotationAngle(LeftArm_r2, 0.0F, 0.0F, 0.2182F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArm_r2.texOffs(22, 73).addBox(3.0F, -6.3609F, -0.5F, 2.0F, 3.0F, 1.0F, 0.75F, false);
		}
		
		LeftArmblue = new ModelRenderer(this);
		LeftArmblue.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmblue, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmblue.texOffs(40, 41).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		LeftArm4_r1 = new ModelRenderer(this);
		LeftArm4_r1.setPos(-5.0F, 22.0F, 0.0F);
		LeftArmblue.addChild(LeftArm4_r1);
		setRotationAngle(LeftArm4_r1, 0.0F, -0.3054F, 0.3927F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArm4_r1.texOffs(40, 59).addBox(3.0F, -13.0F, 1.0F, 2.0F, 3.0F, 1.0F, 0.5F, true);
		}
		
		LeftArm4_r2 = new ModelRenderer(this);
		LeftArm4_r2.setPos(-5.0F, 22.0F, 0.0F);
		LeftArmblue.addChild(LeftArm4_r2);
		setRotationAngle(LeftArm4_r2, 0.0F, 0.0F, -0.3054F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArm4_r2.texOffs(50, 59).addBox(6.0F, -10.0F, 1.0F, 2.0F, 3.0F, 1.0F, 0.5F, true);
		}
		
		LeftArm3_r1 = new ModelRenderer(this);
		LeftArm3_r1.setPos(-5.0F, 22.0F, 0.0F);
		LeftArmblue.addChild(LeftArm3_r1);
		setRotationAngle(LeftArm3_r1, 0.0F, 0.3927F, 0.3927F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArm3_r1.texOffs(40, 59).addBox(3.0F, -13.0F, 1.0F, 2.0F, 3.0F, 1.0F, 0.5F, true);
		}
		
		RightLegpink = new ModelRenderer(this);
		RightLegpink.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegpink, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegpink.texOffs(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLegyellow = new ModelRenderer(this);
		RightLegyellow.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegyellow, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegyellow.texOffs(58, 91).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLeg3_r1 = new ModelRenderer(this);
		RightLeg3_r1.setPos(1.9F, 12.0F, 0.0F);
		RightLegyellow.addChild(RightLeg3_r1);
		setRotationAngle(RightLeg3_r1, 0.6981F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLeg3_r1.texOffs(1, 51).addBox(-3.5F, -5.0F, -2.0F, 1.0F, 3.0F, 2.0F, 1.0F, false);
		}
		
		LeftLegpink = new ModelRenderer(this);
		LeftLegpink.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegpink, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegpink.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLegyellow = new ModelRenderer(this);
		LeftLegyellow.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegyellow, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegyellow.texOffs(41, 91).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLeg3_r1 = new ModelRenderer(this);
		LeftLeg3_r1.setPos(-1.9F, 12.0F, 0.0F);
		LeftLegyellow.addChild(LeftLeg3_r1);
		setRotationAngle(LeftLeg3_r1, 0.6981F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLeg3_r1.texOffs(9, 51).addBox(2.9F, -5.0F, -2.0F, 1.0F, 3.0F, 2.0F, 1.0F, true);
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
		this.Bodypink.copyFrom(this.body);
		Bodypink.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmpink.copyFrom(this.rightArm);
		RightArmpink.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmpink.copyFrom(this.leftArm);
		LeftArmpink.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegpink.copyFrom(this.rightLeg);
		RightLegpink.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegpink.copyFrom(this.leftLeg);
		LeftLegpink.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.WhiteColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.WhiteColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.WhiteColor & 255) / 255.0F;
		this.Headwhite.copyFrom(this.head);
		Headwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodywhite.copyFrom(this.body);
		Bodywhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
		this.Bodyblue.copyFrom(this.body);
		Bodyblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmblue.copyFrom(this.rightArm);
		RightArmblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmblue.copyFrom(this.leftArm);
		LeftArmblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
		this.Bodyyellowglow.copyFrom(this.body);
		Bodyyellowglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.ThirdColor & 255) / 255.0F;
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
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
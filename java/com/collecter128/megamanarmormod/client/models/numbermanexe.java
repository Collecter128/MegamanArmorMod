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

// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports

@OnlyIn(Dist.CLIENT)
public class numbermanexe extends BipedModel {
	private final ModelRenderer Headwhite;
	private final ModelRenderer Headblack;
	private final ModelRenderer Headyellowglow;
	private final ModelRenderer Headclearwhite;
	private final ModelRenderer Headgreen;
	private final ModelRenderer Bodyblack;
	private final ModelRenderer Bodyorange;
	private final ModelRenderer Bodygreen;
	private final ModelRenderer Bodygray;
	private final ModelRenderer RightArmgreen;
	private final ModelRenderer RightArmorange;
	private final ModelRenderer RightArmcream;
	private final ModelRenderer RightArmwhite;
	private final ModelRenderer LeftArmgreen;
	private final ModelRenderer LeftArmorange;
	private final ModelRenderer LeftArmcream;
	private final ModelRenderer LeftArmwhite;
	private final ModelRenderer RightLeggreen;
	private final ModelRenderer RightLegyellowglow;
	private final ModelRenderer RightLegblack;
	private final ModelRenderer LeftLeggreen;
	private final ModelRenderer LeftLegyellowglow;
	private final ModelRenderer LeftLegblack;
	
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

	public numbermanexe(float modelSize, EquipmentSlotType slot) {
		super(modelSize);
		texWidth = 74;
		texHeight = 167;
		
equipmentslot = slot;
		
		MainColorDefault = 10091319;//Main Green
			//DS 7877055
			//Sp 1040384
		SecondaryColorDefault = 14532503;//Secondary Cream
			//DS 9689008
			//Sp 13752399
		ThirdColorDefault = 16600343; //Orange parts
			//DS 15807117
			//Sp 16056384
		WhiteColorDefault = 12305609;//Slightly Blue, mostly white
			//DS 11908533
			//Sp 13422731
		GlowyColorDefault = 16635947;//Glow? Yellow
			//DS 5439464
			//Sp 16772946
		GrayColorDefault = 11579568;//gray
			//DS 9868950
			//Sp 9868950
		FourthColorDefault = 6710886; //Black
			//DS 4671303
			//Sp 6052956
		FifthColorDefault = 16635947; //yellow
			//DS 5439464
			//Sp 16772946
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
		FourthColor = FourthColorDefault;
		FifthColor = FifthColorDefault;

		Headwhite = new ModelRenderer(this);
		Headwhite.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headwhite, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headwhite.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Headblack = new ModelRenderer(this);
		Headblack.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headblack, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headblack.texOffs(33, 0).addBox(-4.0F, -18.0F, -4.0F, 8.0F, 7.0F, 8.0F, 3.0F, false);
		}
		
		Headyellowglow = new ModelRenderer(this);
		Headyellowglow.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headyellowglow, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headyellowglow.texOffs(1, 117).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headyellowglow.texOffs(41, 84).addBox(-4.0F, -18.0F, -4.0F, 8.0F, 7.0F, 8.0F, 3.0F, false);
		}
		
		Headclearwhite = new ModelRenderer(this);
		Headclearwhite.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headclearwhite, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headclearwhite.texOffs(34, 155).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 4.0F, 8.0F, 1.5F, false);
		Headclearwhite.texOffs(35, 117).addBox(-4.0F, -18.0F, -4.0F, 8.0F, 7.0F, 8.0F, 4.0F, false);
		}
		
		Headgreen = new ModelRenderer(this);
		Headgreen.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headgreen, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headgreen.texOffs(4, 82).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Bodyblack = new ModelRenderer(this);
		Bodyblack.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyblack.texOffs(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.51F, false);
		Bodyblack.texOffs(67, 5).addBox(-0.5F, 4.5F, -3.0F, 1.0F, 1.0F, 1.0F, 0.1F, false);
		}
		
		Bodyorange = new ModelRenderer(this);
		Bodyorange.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {	
		Bodyorange.texOffs(16, 48).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.8F, false);
		Bodyorange.texOffs(37, 140).addBox(-3.0F, 0.0F, 4.0F, 6.0F, 6.0F, 2.0F, 0.8F, false);
		Bodyorange.texOffs(58, 143).addBox(2.0F, 5.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.4F, false);
		Bodyorange.texOffs(58, 146).addBox(2.0F, 2.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.4F, false);
		Bodyorange.texOffs(58, 149).addBox(-3.0F, 2.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.4F, false);
		Bodyorange.texOffs(58, 152).addBox(-3.0F, 5.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.4F, false);
		Bodyorange.texOffs(47, 153).addBox(-0.5F, 3.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		}
		
		Bodygreen = new ModelRenderer(this);
		Bodygreen.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodygreen.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.8F, false);
		}
		
		Bodygray = new ModelRenderer(this);
		Bodygray.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodygray.texOffs(59, 1).addBox(-2.5F, 2.0F, -3.0F, 5.0F, 2.0F, 1.0F, 0.2F, false);
		}
		
		RightArmgreen = new ModelRenderer(this);
		RightArmgreen.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmgreen, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmgreen.texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		RightArmgreen.texOffs(40, 72).addBox(-3.0F, 3.0F, -2.0F, 4.0F, 7.0F, 4.0F, 0.7F, false);
		}
		
		RightArmorange = new ModelRenderer(this);
		RightArmorange.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmorange, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmorange.texOffs(0, 134).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		RightArmorange.texOffs(40, 60).addBox(-3.0F, 3.0F, -2.0F, 4.0F, 7.0F, 4.0F, 0.7F, false);
		}
		
		RightArmcream = new ModelRenderer(this);
		RightArmcream.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmcream, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmcream.texOffs(17, 134).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		RightArmcream.texOffs(40, 48).addBox(-3.0F, 3.0F, -2.0F, 4.0F, 7.0F, 4.0F, 0.7F, false);
		}
		
		RightArmwhite = new ModelRenderer(this);
		RightArmwhite.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmwhite, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmwhite.texOffs(1, 2).addBox(0.0F, 10.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.2F, false);
		RightArmwhite.texOffs(26, 2).addBox(-3.0F, 10.0F, -2.0F, 1.0F, 3.0F, 1.0F, 0.2F, false);
		RightArmwhite.texOffs(34, 2).addBox(-3.0F, 10.0F, 1.0F, 1.0F, 3.0F, 1.0F, 0.2F, false);
		}
		
		LeftArmgreen = new ModelRenderer(this);
		LeftArmgreen.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgreen, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmgreen.texOffs(40, 32).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArmgreen.texOffs(57, 72).addBox(-1.0F, 3.0F, -2.0F, 4.0F, 7.0F, 4.0F, 0.7F, true);
		}
		
		LeftArmorange = new ModelRenderer(this);
		LeftArmorange.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmorange, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmorange.texOffs(0, 150).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArmorange.texOffs(57, 60).addBox(-1.0F, 3.0F, -2.0F, 4.0F, 7.0F, 4.0F, 0.7F, true);
		}
		
		LeftArmcream = new ModelRenderer(this);
		LeftArmcream.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmcream, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmcream.texOffs(17, 150).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArmcream.texOffs(57, 48).addBox(-1.0F, 3.0F, -2.0F, 4.0F, 7.0F, 4.0F, 0.7F, true);
		}
		
		LeftArmwhite = new ModelRenderer(this);
		LeftArmwhite.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmwhite, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmwhite.texOffs(67, 10).addBox(2.0F, 11.0F, -2.0F, 1.0F, 3.0F, 1.0F, 0.2F, true);
		LeftArmwhite.texOffs(67, 85).addBox(2.0F, 11.0F, 1.0F, 1.0F, 3.0F, 1.0F, 0.2F, true);
		LeftArmwhite.texOffs(41, 85).addBox(-1.0F, 11.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.2F, true);
		}
		
		RightLeggreen = new ModelRenderer(this);
		RightLeggreen.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeggreen, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLeggreen.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLegyellowglow = new ModelRenderer(this);
		RightLegyellowglow.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegyellowglow, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegyellowglow.texOffs(25, 68).addBox(-3.0F, 7.0F, -3.0F, 3.0F, 3.0F, 1.0F, 0.5F, false);
		}
		
		RightLegblack = new ModelRenderer(this);
		RightLegblack.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegblack, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegblack.texOffs(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		LeftLeggreen = new ModelRenderer(this);
		LeftLeggreen.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeggreen, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLeggreen.texOffs(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLegyellowglow = new ModelRenderer(this);
		LeftLegyellowglow.setPos(2.9F, 10.0F, -1.0F);
		setRotationAngle(LeftLegyellowglow, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegyellowglow.texOffs(30, 68).addBox(-0.0F, 7.0F, -3.0F, 3.0F, 3.0F, 1.0F, 0.5F, true);
		}
		
		LeftLegblack = new ModelRenderer(this);
		LeftLegblack.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegblack, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegblack.texOffs(0, 64).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
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
		this.Headgreen.copyFrom(this.head);
		Headgreen.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodygreen.copyFrom(this.body);
		Bodygreen.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmgreen.copyFrom(this.rightArm);
		RightArmgreen.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmgreen.copyFrom(this.leftArm);
		LeftArmgreen.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLeggreen.copyFrom(this.rightLeg);
		RightLeggreen.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeggreen.copyFrom(this.leftLeg);
		LeftLeggreen.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
		this.RightArmcream.copyFrom(this.rightArm);
		RightArmcream.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmcream.copyFrom(this.leftArm);
		LeftArmcream.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.ThirdColor & 255) / 255.0F;
		this.Bodyorange.copyFrom(this.body);
		Bodyorange.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmorange.copyFrom(this.rightArm);
		RightArmorange.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmorange.copyFrom(this.leftArm);
		LeftArmorange.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.FourthColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.FourthColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.FourthColor & 255) / 255.0F;
		this.Headblack.copyFrom(this.head);
		Headblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodyblack.copyFrom(this.body);
		Bodyblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegblack.copyFrom(this.rightLeg);
		RightLegblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegblack.copyFrom(this.leftLeg);
		LeftLegblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
		this.Headyellowglow.copyFrom(this.head);
		Headyellowglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegyellowglow.copyFrom(this.rightLeg);
		RightLegyellowglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegyellowglow.copyFrom(this.leftLeg);
		LeftLegyellowglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GrayColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GrayColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GrayColor & 255) / 255.0F;
		this.Bodygray.copyFrom(this.body);
		Bodygray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.WhiteColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.WhiteColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.WhiteColor & 255) / 255.0F;
		this.Headwhite.copyFrom(this.head);
		Headwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmwhite.copyFrom(this.rightArm);
		RightArmwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmwhite.copyFrom(this.leftArm);
		LeftArmwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		buffer = Minecraft.getInstance().renderBuffers().bufferSource().getBuffer(RenderType.entityTranslucent(new ResourceLocation(
				"megamanarmormod:textures/armor/numbermanexe.png")));
		this.Headclearwhite.copyFrom(this.head);
		Headclearwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
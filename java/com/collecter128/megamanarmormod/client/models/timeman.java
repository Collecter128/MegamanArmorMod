package com.collecter128.megamanarmormod.client.models;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

// Made with Blockbench 4.7.1
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports

@OnlyIn(Dist.CLIENT)
public class timeman extends BipedModel {
	private final ModelRenderer Headpurple;
	private final ModelRenderer Headgold;
	private final ModelRenderer Head4_r1;
	private final ModelRenderer Head3_r1;
	private final ModelRenderer Headred;
	private final ModelRenderer Headgray;
	private final ModelRenderer Headblueglow;
	private final ModelRenderer Bodylightpurple;
	private final ModelRenderer Bodywhite;
	private final ModelRenderer Bodyyellow;
	private final ModelRenderer Bodyblue;
	private final ModelRenderer Bodyred;
	private final ModelRenderer Bodygray;
	private final ModelRenderer RightArmpurple;
	private final ModelRenderer RightArmgold;
	private final ModelRenderer RightArmlightpurple;
	private final ModelRenderer LeftArmpurple;
	private final ModelRenderer LeftArmgold;
	private final ModelRenderer LeftArmlightpurple;
	private final ModelRenderer RightLegpurple;
	private final ModelRenderer RightLegblueglow;
	private final ModelRenderer LeftLegpurple;
	private final ModelRenderer LeftLegblueglow;
	
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

	public timeman(float modelSize, EquipmentSlotType slot) {
		super(modelSize);
		texWidth = 75;
		texHeight = 120;
		
		equipmentslot = slot;
		
		MainColorDefault = 10514621;//Main Body Color purple
		SecondaryColorDefault = 12808110;//Secondary Light Purple
		ThirdColorDefault = 16764728; //gold
		WhiteColorDefault = 16777215;//White
		GlowyColorDefault = 4491492;//Blue
		GrayColorDefault = 10592673;//Gray
		FourthColorDefault = 16716820; //Red
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
		FourthColor = FourthColorDefault;

		Headpurple = new ModelRenderer(this);
		Headpurple.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headpurple.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Headgold = new ModelRenderer(this);
		Headgold.setPos(0.0F, 0.0F, 0.0F);
		

		Head4_r1 = new ModelRenderer(this);
		Head4_r1.setPos(0.0F, -3.0F, 0.0F);
		Headgold.addChild(Head4_r1);
		setRotationAngle(Head4_r1, 0.0F, 0.0F, -0.4363F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head4_r1.texOffs(59, 81).addBox(10.0F, -4.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, false);
		Head4_r1.texOffs(59, 80).addBox(8.0F, -6.0F, -2.0F, 2.0F, 5.0F, 5.0F, 1.0F, false);
		}
		
		Head3_r1 = new ModelRenderer(this);
		Head3_r1.setPos(0.0F, -3.0F, 0.0F);
		Headgold.addChild(Head3_r1);
		setRotationAngle(Head3_r1, 0.0F, 0.0F, 0.4363F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head3_r1.texOffs(59, 68).addBox(-11.0F, -4.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, false);
		Head3_r1.texOffs(59, 67).addBox(-10.0F, -6.0F, -2.0F, 2.0F, 5.0F, 5.0F, 1.0F, false);
		}
		
		Headred = new ModelRenderer(this);
		Headred.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headred.texOffs(45, 2).addBox(-1.0F, -13.5F, -0.5F, 2.0F, 2.0F, 2.0F, 0.5F, false);
		}
		
		Headgray = new ModelRenderer(this);
		Headgray.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headgray.texOffs(59, 2).addBox(-6.0F, -4.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.2F, false);
		Headgray.texOffs(36, 4).addBox(-0.5F, -11.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.2F, false);
		Headgray.texOffs(67, 2).addBox(5.0F, -4.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.2F, false);
		Headgray.texOffs(58, 6).addBox(-7.0F, -4.5F, -0.5F, 1.0F, 2.0F, 2.0F, 0.2F, false);
		Headgray.texOffs(66, 6).addBox(6.0F, -4.5F, -0.5F, 1.0F, 2.0F, 2.0F, 0.2F, false);
		}
		
		Headblueglow = new ModelRenderer(this);
		Headblueglow.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headblueglow.texOffs(27, 2).addBox(-2.5F, -7.4829F, -5.0F, 5.0F, 3.0F, 0.0F, 0.25F, false);
		}
		
		Bodylightpurple = new ModelRenderer(this);
		Bodylightpurple.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodylightpurple.texOffs(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		}
		
		Bodywhite = new ModelRenderer(this);
		Bodywhite.setPos(-1.0F, -5.0F, -1.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodywhite.texOffs(41, 103).addBox(-3.5F, 2.0F, -2.1F, 7.0F, 7.0F, 0.0F, 0.51F, false);
		}
		
		Bodyyellow = new ModelRenderer(this);
		Bodyyellow.setPos(-1.0F, -5.0F, -1.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyyellow.texOffs(60, 95).addBox(-3.5F, 2.0F, -2.4F, 7.0F, 7.0F, 0.0F, 0.51F, false);
		}
		
		Bodyblue = new ModelRenderer(this);
		Bodyblue.setPos(-1.0F, -5.0F, -1.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyblue.texOffs(54, 103).addBox(-1.5F, 2.0F, -2.3F, 3.0F, 7.0F, 0.0F, 0.51F, false);
		}
		
		Bodyred = new ModelRenderer(this);
		Bodyred.setPos(-1.0F, -5.0F, -1.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyred.texOffs(62, 103).addBox(-1.5F, 2.0F, -2.2F, 5.0F, 7.0F, 0.0F, 0.51F, false);
		}
		
		Bodygray = new ModelRenderer(this);
		Bodygray.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodygray.texOffs(16, 48).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.31F, false);
		}
		
		RightArmpurple = new ModelRenderer(this);
		RightArmpurple.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmpurple, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmpurple.texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		RightArmpurple.texOffs(41, 50).addBox(-3.0F, -2.3609F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		RightArmgold = new ModelRenderer(this);
		RightArmgold.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmgold, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmgold.texOffs(41, 59).addBox(-3.0F, 5.6391F, -2.0F, 4.0F, 1.0F, 4.0F, 0.75F, false);
		}
		
		RightArmlightpurple = new ModelRenderer(this);
		RightArmlightpurple.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmlightpurple, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmlightpurple.texOffs(56, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		LeftArmpurple = new ModelRenderer(this);
		LeftArmpurple.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmpurple, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmpurple.texOffs(40, 33).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArmpurple.texOffs(58, 50).addBox(-1.0F, -2.3609F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		LeftArmgold = new ModelRenderer(this);
		LeftArmgold.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgold, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmgold.texOffs(58, 59).addBox(-1.0F, 5.6391F, -2.0F, 4.0F, 1.0F, 4.0F, 0.75F, false);
		}
		
		LeftArmlightpurple = new ModelRenderer(this);
		LeftArmlightpurple.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmlightpurple, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmlightpurple.texOffs(56, 33).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		RightLegpurple = new ModelRenderer(this);
		RightLegpurple.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegpurple, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegpurple.texOffs(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLegblueglow = new ModelRenderer(this);
		RightLegblueglow.setPos(-1.9F, 12.0F, -1.9632F);
		setRotationAngle(RightLegblueglow, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegblueglow.texOffs(11, 105).addBox(-2.0F, 8.5F, -2.0368F, 4.0F, 4.0F, 4.0F, 1.0F, false);
		}
		
		LeftLegpurple = new ModelRenderer(this);
		LeftLegpurple.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegpurple, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegpurple.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLegblueglow = new ModelRenderer(this);
		LeftLegblueglow.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegblueglow, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegblueglow.texOffs(22, 105).addBox(-2.0F, 8.2F, -2.0F, 4.0F, 4.0F, 4.0F, 1.0F, true);
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
		this.RightArmpurple.copyFrom(this.rightArm);
		RightArmpurple.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmpurple.copyFrom(this.leftArm);
		LeftArmpurple.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegpurple.copyFrom(this.rightLeg);
		RightLegpurple.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegpurple.copyFrom(this.leftLeg);
		LeftLegpurple.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
		this.Bodylightpurple.copyFrom(this.body);
		Bodylightpurple.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmlightpurple.copyFrom(this.rightArm);
		RightArmlightpurple.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmlightpurple.copyFrom(this.leftArm);
		LeftArmlightpurple.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.ThirdColor & 255) / 255.0F;
		this.Headgold.copyFrom(this.head);
		Headgold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodyyellow.copyFrom(this.body);
		Bodyyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmgold.copyFrom(this.rightArm);
		RightArmgold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmgold.copyFrom(this.leftArm);
		LeftArmgold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.FourthColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.FourthColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.FourthColor & 255) / 255.0F;
		this.Headred.copyFrom(this.head);
		Headred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodyred.copyFrom(this.body);
		Bodyred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GrayColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GrayColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GrayColor & 255) / 255.0F;
		this.Headgray.copyFrom(this.head);
		Headgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodygray.copyFrom(this.body);
		Bodygray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
		this.Headblueglow.copyFrom(this.head);
		Headblueglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodyblue.copyFrom(this.body);
		Bodyblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegblueglow.copyFrom(this.rightLeg);
		RightLegblueglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegblueglow.copyFrom(this.leftLeg);
		LeftLegblueglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.WhiteColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.WhiteColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.WhiteColor & 255) / 255.0F;
		this.Bodywhite.copyFrom(this.body);
		Bodywhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
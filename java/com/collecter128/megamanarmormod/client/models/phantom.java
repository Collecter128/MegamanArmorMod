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
public class phantom extends BipedModel {
	private final ModelRenderer Headgraypurple;
	private final ModelRenderer HeadGray;
	private final ModelRenderer HeadWhite;
	private final ModelRenderer Headredglow;
	private final ModelRenderer Bodygraypurple;
	private final ModelRenderer Bodygrayred;
	private final ModelRenderer Body_r1;
	private final ModelRenderer Bodywhite;
	private final ModelRenderer Bodygold;
	private final ModelRenderer RightArmgraypurple;
	private final ModelRenderer RightArmgold;
	private final ModelRenderer RightArmwhite;
	private final ModelRenderer LeftArmgraypurple;
	private final ModelRenderer LeftArmgold;
	private final ModelRenderer LeftArmwhite;
	private final ModelRenderer RightLegblue;
	private final ModelRenderer RightLeggold;
	private final ModelRenderer RightLegwhite;
	private final ModelRenderer LeftLegblue;
	private final ModelRenderer LeftLeggold;
	private final ModelRenderer LeftLegwhite;
	
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

	public phantom(float modelSize, EquipmentSlotType slot) {
		super(modelSize);
		texWidth = 82;
		texHeight = 162;
		
		equipmentslot = slot;
		
		MainColorDefault = 7428758;//Main Grayish Purple
		SecondaryColorDefault = 16453210;//Secondary Red
		ThirdColorDefault = 15578448; //gold
		WhiteColorDefault = 16777215;//Basic White
		GlowyColorDefault = 16653125;//Glow? red
		GrayColorDefault = 12625359;//gray
		FourthColorDefault = 16777215; //White
		FifthColorDefault = 16653125; //Red
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
		FourthColor = FourthColorDefault;
		FifthColor = FifthColorDefault;

		Headgraypurple = new ModelRenderer(this);
		Headgraypurple.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headgraypurple, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headgraypurple.texOffs(0, 3).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headgraypurple.texOffs(27, 142).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 9.0F, 1.5F, false);
		}
		
		HeadGray = new ModelRenderer(this);
		HeadGray.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(HeadGray, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		HeadGray.texOffs(0, 123).addBox(-3.6706F, -7.6327F, -3.8533F, 8.0F, 7.0F, 8.0F, 0.55F, false);
		}
		
		HeadWhite = new ModelRenderer(this);
		HeadWhite.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(HeadWhite, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		HeadWhite.texOffs(35, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		HeadWhite.texOffs(0, 143).addBox(-1.0F, -9.0F, -4.0F, 2.0F, 6.0F, 10.0F, 0.5F, false);
		HeadWhite.texOffs(44, 70).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 9.0F, 1.5F, false);
		}
		
		Headredglow = new ModelRenderer(this);
		Headredglow.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headredglow, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headredglow.texOffs(72, 2).addBox(-1.0F, -8.8411F, -5.6852F, 2.0F, 2.0F, 1.0F, 0.1F, false);
		Headredglow.texOffs(47, 124).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Bodygraypurple = new ModelRenderer(this);
		Bodygraypurple.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodygraypurple.texOffs(16, 19).addBox(-5.0F, 0.0F, -2.0F, 9.0F, 10.0F, 5.0F, 0.7F, false);
		}
		
		Bodygrayred = new ModelRenderer(this);
		Bodygrayred.setPos(0.0F, 0.0F, 0.0F);
		

		Body_r1 = new ModelRenderer(this);
		Body_r1.setPos(0.0F, 22.0F, 0.0F);
		Bodygrayred.addChild(Body_r1);
		setRotationAngle(Body_r1, 0.3054F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Body_r1.texOffs(60, 144).addBox(-3.0F, -20.0F, 9.0F, 5.0F, 13.0F, 1.0F, 0.7F, false);
		}
		
		Bodywhite = new ModelRenderer(this);
		Bodywhite.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodywhite.texOffs(16, 35).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		}
		
		Bodygold = new ModelRenderer(this);
		Bodygold.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodygold.texOffs(16, 103).addBox(-5.0F, 0.0F, -2.0F, 9.0F, 10.0F, 5.0F, 0.7F, false);
		}
		
		RightArmgraypurple = new ModelRenderer(this);
		RightArmgraypurple.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmgraypurple, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmgraypurple.texOffs(44, 53).addBox(-3.0F, -1.0F, -2.0F, 4.0F, 11.0F, 4.0F, 0.5F, false);
		}
		
		RightArmgold = new ModelRenderer(this);
		RightArmgold.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmgold, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmgold.texOffs(44, 35).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		RightArmwhite = new ModelRenderer(this);
		RightArmwhite.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmwhite, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmwhite.texOffs(44, 19).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		LeftArmgraypurple = new ModelRenderer(this);
		LeftArmgraypurple.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgraypurple, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmgraypurple.texOffs(62, 53).addBox(-1.0F, -1.0F, -2.0F, 4.0F, 11.0F, 4.0F, 0.5F, true);
		}
		
		LeftArmgold = new ModelRenderer(this);
		LeftArmgold.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgold, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmgold.texOffs(62, 35).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		LeftArmwhite = new ModelRenderer(this);
		LeftArmwhite.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmwhite, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmwhite.texOffs(62, 19).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		RightLegblue = new ModelRenderer(this);	
		RightLegblue.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegblue, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegblue.texOffs(0, 19).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLeggold = new ModelRenderer(this);
		RightLeggold.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeggold, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLeggold.texOffs(0, 52).addBox(-2.0F, 4.0F, -2.0F, 4.0F, 2.0F, 4.0F, 1.3F, false);
		RightLeggold.texOffs(0, 66).addBox(-2.0F, 9.0F, -2.0F, 4.0F, 2.0F, 4.0F, 1.3F, false);
		}
		
		RightLegwhite = new ModelRenderer(this);
		RightLegwhite.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegwhite, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegwhite.texOffs(0, 82).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		LeftLegblue = new ModelRenderer(this);
		LeftLegblue.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegblue, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegblue.texOffs(0, 35).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLeggold = new ModelRenderer(this);
		LeftLeggold.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeggold, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLeggold.texOffs(0, 59).addBox(-2.0F, 4.0F, -2.0F, 4.0F, 2.0F, 4.0F, 1.3F, true);
		LeftLeggold.texOffs(0, 73).addBox(-2.0F, 9.0F, -2.0F, 4.0F, 2.0F, 4.0F, 1.3F, true);
		}
		
		LeftLegwhite = new ModelRenderer(this);
		LeftLegwhite.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegwhite, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegwhite.texOffs(0, 98).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
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
		this.Headgraypurple.copyFrom(this.head);
		Headgraypurple.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodygraypurple.copyFrom(this.body);
		Bodygraypurple.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmgraypurple.copyFrom(this.rightArm);
		RightArmgraypurple.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmgraypurple.copyFrom(this.leftArm);
		LeftArmgraypurple.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegblue.copyFrom(this.rightLeg);
		RightLegblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegblue.copyFrom(this.leftLeg);
		LeftLegblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
		this.Bodygrayred.copyFrom(this.body);
		Bodygrayred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
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
		
		fred = (float)( this.GrayColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GrayColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GrayColor & 255) / 255.0F;
		this.HeadGray.copyFrom(this.head);
		HeadGray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.WhiteColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.WhiteColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.WhiteColor & 255) / 255.0F;
		this.HeadWhite.copyFrom(this.head);
		HeadWhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
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
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
		this.Headredglow.copyFrom(this.head);
		Headredglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
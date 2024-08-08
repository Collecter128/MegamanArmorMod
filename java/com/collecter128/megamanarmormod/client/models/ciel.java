package com.collecter128.megamanarmormod.client.models;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports

@OnlyIn(Dist.CLIENT)
public class ciel extends BipedModel {
	private final ModelRenderer Headyellowhair;
	private final ModelRenderer Head2_r1;
	private final ModelRenderer Headpink;
	private final ModelRenderer Headwhite;
	private final ModelRenderer Bodypink;
	private final ModelRenderer Bodyyellow;
	private final ModelRenderer Bodydarkpink;
	private final ModelRenderer RightArmblack;
	private final ModelRenderer RightArmwhite;
	private final ModelRenderer LeftArmblack;
	private final ModelRenderer LeftArmwhite;
	private final ModelRenderer Legspink;
	private final ModelRenderer Body_r1;
	private final ModelRenderer Body_r2;
	private final ModelRenderer Legsblack;
	private final ModelRenderer RightLegsblack;
	private final ModelRenderer LeftLegsblack;
	private final ModelRenderer RightLegpink;
	private final ModelRenderer RightLegblack;
	private final ModelRenderer RightLegwhite;
	private final ModelRenderer LeftLegpink;
	private final ModelRenderer LeftLegblack;
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

	public ciel(float modelSize, EquipmentSlotType slot) {
		super(modelSize);
		texWidth = 80;
		texHeight = 180;
		
		equipmentslot = slot;
		
		MainColorDefault = 16727445;//Main Pink
		SecondaryColorDefault = 16056442;//Secondary Dark Pink
		ThirdColorDefault = 16759306; //Yellow
		WhiteColorDefault = 16777215;//Basic White
		GlowyColorDefault = 16754899;//Glow? pink Not used
		GrayColorDefault = 12423076;//Not used
		FourthColorDefault = 7687541; //Black
		FifthColorDefault = 358881; //Not used
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
		FourthColor = FourthColorDefault;
		FifthColor = FifthColorDefault;

		Headyellowhair = new ModelRenderer(this);
		Headyellowhair.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headyellowhair.texOffs(33, 143).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headyellowhair.texOffs(39, 6).addBox(-4.0F, -9.0F, -4.5F, 10.0F, 8.0F, 1.0F, 1.0F, false);
		Headyellowhair.texOffs(60, 118).addBox(-2.0F, -4.0F, 10.0F, 4.0F, 9.0F, 4.0F, 0.0F, false);
		}
		
		Head2_r1 = new ModelRenderer(this);
		Head2_r1.setPos(-1.0F, -5.0F, 6.0F);
		Headyellowhair.addChild(Head2_r1);
		setRotationAngle(Head2_r1, 0.5236F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head2_r1.texOffs(52, 103).addBox(-1.0F, -3.0F, 2.0F, 4.0F, 9.0F, 4.0F, 0.3F, false);
		}
		
		Headpink = new ModelRenderer(this);
		Headpink.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headpink.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Headwhite = new ModelRenderer(this);
		Headwhite.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headwhite.texOffs(0, 143).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headwhite.texOffs(64, 6).addBox(-2.0F, -10.0F, 5.0F, 4.0F, 4.0F, 2.0F, 0.0F, false);
		}
		
		Bodypink = new ModelRenderer(this);
		Bodypink.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodypink.texOffs(16, 19).addBox(-4.5F, -0.5F, -2.5F, 9.0F, 12.0F, 5.0F, 0.51F, false);
		Bodypink.texOffs(0, 160).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		}
		
		Bodyyellow = new ModelRenderer(this);
		Bodyyellow.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyyellow.texOffs(16, 53).addBox(-4.5F, -0.5F, -2.5F, 9.0F, 12.0F, 5.0F, 0.51F, false);
		}
		
		Bodydarkpink = new ModelRenderer(this);
		Bodydarkpink.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodydarkpink.texOffs(16, 37).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		}
		
		RightArmblack = new ModelRenderer(this);
		RightArmblack.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmblack, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmblack.texOffs(61, 19).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		RightArmwhite = new ModelRenderer(this);
		RightArmwhite.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmwhite, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmwhite.texOffs(45, 28).addBox(-3.0F, 4.6391F, -2.0F, 4.0F, 2.0F, 4.0F, 0.75F, false);
		RightArmwhite.texOffs(46, 164).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		LeftArmblack = new ModelRenderer(this);
		LeftArmblack.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmblack, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmblack.texOffs(61, 35).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		LeftArmwhite = new ModelRenderer(this);
		LeftArmwhite.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmwhite, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmwhite.texOffs(45, 44).addBox(-1.0F, 4.6391F, -2.0F, 4.0F, 2.0F, 4.0F, 0.75F, false);
		LeftArmwhite.texOffs(63, 164).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		Legspink = new ModelRenderer(this);
		Legspink.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		Legspink.texOffs(7, 102).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.7F, false);
		}
		
		Body_r1 = new ModelRenderer(this);
		Body_r1.setPos(0.0F, 8.0F, 0.0F);
		Legspink.addChild(Body_r1);
		setRotationAngle(Body_r1, 0.3054F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		Body_r1.texOffs(40, 90).addBox(-4.0F, 0.0F, -1.0F, 8.0F, 5.0F, 3.0F, 0.7F, false);
		}
		
		Body_r2 = new ModelRenderer(this);
		Body_r2.setPos(0.0F, 8.0F, 0.0F);
		Legspink.addChild(Body_r2);
		setRotationAngle(Body_r2, -0.3054F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		Body_r2.texOffs(40, 82).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 5.0F, 3.0F, 0.7F, false);
		}
		
		Legsblack = new ModelRenderer(this);
		Legsblack.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		Legsblack.texOffs(16, 133).addBox(-4.0F, 8.0F, -2.0F, 8.0F, 4.0F, 4.0F, 0.51F, false);
		}
		
		RightLegsblack = new ModelRenderer(this);
		RightLegsblack.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegsblack, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		RightLegsblack.texOffs(0, 123).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		LeftLegsblack = new ModelRenderer(this);
		LeftLegsblack.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegsblack, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		LeftLegsblack.texOffs(40, 123).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		RightLegpink = new ModelRenderer(this);
		RightLegpink.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegpink, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegpink.texOffs(0, 19).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		RightLegblack = new ModelRenderer(this);
		RightLegblack.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegblack, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegblack.texOffs(0, 83).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		RightLegwhite = new ModelRenderer(this);
		RightLegwhite.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegwhite, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegwhite.texOffs(0, 51).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		RightLegwhite.texOffs(47, 56).addBox(-2.0F, 7.0F, -2.0F, 4.0F, 1.0F, 4.0F, 1.0F, false);
		}
		
		LeftLegpink = new ModelRenderer(this);
		LeftLegpink.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegpink, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegpink.texOffs(0, 35).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		LeftLegblack = new ModelRenderer(this);
		LeftLegblack.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegblack, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegblack.texOffs(19, 83).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		LeftLegwhite = new ModelRenderer(this);
		LeftLegwhite.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegwhite, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegwhite.texOffs(0, 67).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftLegwhite.texOffs(47, 64).addBox(-2.0F, 7.0F, -2.0F, 4.0F, 1.0F, 4.0F, 1.0F, true);
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
		this.Legspink.copyFrom(this.body);
		Legspink.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegpink.copyFrom(this.rightLeg);
		RightLegpink.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegpink.copyFrom(this.leftLeg);
		LeftLegpink.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
		this.Bodydarkpink.copyFrom(this.body);
		Bodydarkpink.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.ThirdColor & 255) / 255.0F;
		this.Headyellowhair.copyFrom(this.head);
		Headyellowhair.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodyyellow.copyFrom(this.body);
		Bodyyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.WhiteColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.WhiteColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.WhiteColor & 255) / 255.0F;
		this.Headwhite.copyFrom(this.head);
		Headwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmwhite.copyFrom(this.rightArm);
		RightArmwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmwhite.copyFrom(this.leftArm);
		LeftArmwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegwhite.copyFrom(this.rightLeg);
		RightLegwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegwhite.copyFrom(this.leftLeg);
		LeftLegwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.FourthColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.FourthColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.FourthColor & 255) / 255.0F;
		this.RightArmblack.copyFrom(this.rightArm);
		RightArmblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmblack.copyFrom(this.leftArm);
		LeftArmblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Legsblack.copyFrom(this.body);
		Legsblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegsblack.copyFrom(this.rightLeg);
		RightLegsblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegsblack.copyFrom(this.leftLeg);
		LeftLegsblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegblack.copyFrom(this.rightLeg);
		RightLegblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegblack.copyFrom(this.leftLeg);
		LeftLegblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
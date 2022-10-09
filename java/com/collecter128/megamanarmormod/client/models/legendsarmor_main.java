package com.collecter128.megamanarmormod.client.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;

// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class legendsarmor_main extends BipedModel {
	private final ModelRenderer Head;
	private final ModelRenderer Head2;
	private final ModelRenderer Headgrayblue;
	private final ModelRenderer Headglow;
	private final ModelRenderer Body;
	private final ModelRenderer Body2;
	private final ModelRenderer Bodygray;
	private final ModelRenderer Body_r1;
	private final ModelRenderer Bodyorange;
	private final ModelRenderer Body_r2;
	private final ModelRenderer RightArm;
	private final ModelRenderer RightArmbluegray;
	private final ModelRenderer RightArmgray;
	private final ModelRenderer RightArm2;
	private final ModelRenderer LeftArm;
	private final ModelRenderer LeftArm2;
	private final ModelRenderer LeftArmgray;
	private final ModelRenderer LeftArmbluegray;
	private final ModelRenderer RightLeg;
	private final ModelRenderer RightLeg2;
	private final ModelRenderer RightLegglow;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer LeftLeg2;
	private final ModelRenderer LeftLegglow;
	
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

	public legendsarmor_main(float modelSize, EquipmentSlotType slot) {
		super(modelSize);
		texWidth = 79;
		texHeight = 188;
		
		MainColorDefault = 3173117;//Main Body Color Blue
		SecondaryColorDefault = 6736383;// Tiel
		ThirdColorDefault = 15693594; // Orange
		WhiteColorDefault = 16777215;// White
		GlowyColorDefault = 13449015;// Red
		GrayColorDefault = 10000825;// ???
		FourthColorDefault = 10000825;// Grayish Blue
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
		FourthColor = FourthColorDefault;
		
		this.equipmentslot = slot;

		Head = new ModelRenderer(this);
		Head.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Head, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Head.texOffs(0, 68).addBox(-3.6706F, -7.6327F, -3.8533F, 8.0F, 7.0F, 8.0F, 0.55F, false);
		}

		Head2 = new ModelRenderer(this);
		Head2.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Head2, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head2.texOffs(0, 127).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Head2.texOffs(49, 51).addBox(-1.0872F, -9.9562F, -4.4855F, 2.0F, 5.0F, 10.0F, 0.4F, false);
		}

		Headgrayblue = new ModelRenderer(this);
		Headgrayblue.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headgrayblue, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headgrayblue.texOffs(57, 1).addBox(5.4F, -3.9341F, -0.7842F, 1.0F, 3.0F, 3.0F, 0.5F, false);
		Headgrayblue.texOffs(25, 1).addBox(-5.981F, -3.938F, -0.747F, 1.0F, 3.0F, 3.0F, 0.5F, false);
		Headgrayblue.texOffs(0, 143).addBox(-3.6706F, -7.6327F, -3.8533F, 8.0F, 7.0F, 8.0F, 0.55F, false);
		}
		
		Headglow = new ModelRenderer(this);
		Headglow.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headglow, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headglow.texOffs(72, -1).addBox(-4.981F, -2.938F, -0.5F, 0.0F, 2.0F, 2.0F, 0.5F, false);
		Headglow.texOffs(72, 6).addBox(6.4F, -2.9341F, -0.5F, 0.0F, 2.0F, 2.0F, 0.5F, false);
		}
		
		Body = new ModelRenderer(this);
		Body.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Body.texOffs(16, 49).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.9F, false);
		}
		
		Body2 = new ModelRenderer(this);
		Body2.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Body2.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.7F, false);
		}
		
		Bodygray = new ModelRenderer(this);
		Bodygray.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodygray.texOffs(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		}
		
		Body_r1 = new ModelRenderer(this);
		Body_r1.setPos(0.0F, 22.0F, 0.0F);
		Bodygray.addChild(Body_r1);
		setRotationAngle(Body_r1, 0.0F, 3.1416F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Body_r1.texOffs(66, 97).addBox(-1.5F, -22.5F, -8.5F, 3.0F, 3.0F, 1.0F, 0.05F, false);
		Body_r1.texOffs(59, 97).addBox(-1.0F, -22.0F, -8.0F, 2.0F, 2.0F, 1.0F, 0.4F, false);
		Body_r1.texOffs(21, 178).addBox(-3.0F, -23.0F, -7.0F, 6.0F, 6.0F, 4.0F, 0.9F, false);
		}
		
		Bodyorange = new ModelRenderer(this);
		Bodyorange.setPos(0.0F, 0.0F, 0.0F);
		

		Body_r2 = new ModelRenderer(this);
		Body_r2.setPos(0.0F, 22.0F, 0.0F);
		Bodyorange.addChild(Body_r2);
		setRotationAngle(Body_r2, 0.0F, 3.1416F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Body_r2.texOffs(0, 178).addBox(-3.0F, -23.0F, -7.0F, 6.0F, 6.0F, 4.0F, 0.9F, false);
		}
		
		RightArm = new ModelRenderer(this);
		RightArm.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArm, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArm.texOffs(41, 42).addBox(-4.0F, -3.2019F, -2.0F, 4.0F, 4.0F, 4.0F, 0.8F, false);
		RightArm.texOffs(41, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		RightArm.texOffs(41, 33).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		RightArmbluegray = new ModelRenderer(this);
		RightArmbluegray.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmbluegray, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmbluegray.texOffs(35, 120).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		RightArmgray = new ModelRenderer(this);
		RightArmgray.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmgray, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmgray.texOffs(35, 137).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		RightArmgray.texOffs(1, 119).addBox(-4.0F, -3.2019F, -2.0F, 4.0F, 4.0F, 4.0F, 0.8F, false);
		}
		
		RightArm2 = new ModelRenderer(this);
		RightArm2.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArm2, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArm2.texOffs(42, 177).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		LeftArm = new ModelRenderer(this);
		LeftArm.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArm, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArm.texOffs(58, 42).addBox(0.0F, -2.3974F, -2.0F, 4.0F, 4.0F, 4.0F, 0.8F, false);
		LeftArm.texOffs(58, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArm.texOffs(58, 33).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		LeftArm2 = new ModelRenderer(this);
		LeftArm2.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArm2, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArm2.texOffs(59, 177).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		LeftArmgray = new ModelRenderer(this);
		LeftArmgray.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgray, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmgray.texOffs(52, 136).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArmgray.texOffs(18, 119).addBox(0.0F, -2.3974F, -2.0F, 4.0F, 4.0F, 4.0F, 0.8F, false);
		}
		
		LeftArmbluegray = new ModelRenderer(this);
		LeftArmbluegray.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmbluegray, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmbluegray.texOffs(52, 120).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		RightLeg = new ModelRenderer(this);
		RightLeg.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeg, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLeg.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		RightLeg.texOffs(0, 103).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.3F, false);
		}
		
		RightLeg2 = new ModelRenderer(this);
		RightLeg2.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeg2, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLeg2.texOffs(39, 160).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		RightLeg2.texOffs(1, 52).addBox(-1.0F, 5.0F, -3.0F, 2.0F, 2.0F, 1.0F, 0.5F, false);
		}
		
		RightLegglow = new ModelRenderer(this);
		RightLegglow.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegglow, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegglow.texOffs(1, 59).addBox(-0.8947F, 14.2F, -1.0F, 2.0F, 1.0F, 2.0F, 1.0F, false);
		}
		
		LeftLeg = new ModelRenderer(this);
		LeftLeg.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeg, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLeg.texOffs(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		LeftLeg.texOffs(17, 103).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.3F, true);
		}
		
		LeftLeg2 = new ModelRenderer(this);
		LeftLeg2.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeg2, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLeg2.texOffs(57, 160).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		LeftLeg2.texOffs(1, 52).addBox(-0.8F, 5.0F, -3.0F, 2.0F, 2.0F, 1.0F, 0.5F, false);
		}
		
		LeftLegglow = new ModelRenderer(this);
		LeftLegglow.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegglow, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegglow.texOffs(9, 59).addBox(-1.2791F, 14.2F, -1.0F, 2.0F, 1.0F, 2.0F, 1.0F, true);
		}
	}

//	@Override
//	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
//		//previously the render function, render code was moved to a method below
//	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		
		float fred = (float)( this.MainColor >> 16 & 255) / 255.0F;
        float fgreen = (float)(this.MainColor >> 8 & 255) / 255.0F;
        float fblue = (float)(this.MainColor & 255) / 255.0F;
		this.Head.copyFrom(this.head);
		Head.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Body.copyFrom(this.body);
		Body.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArm.copyFrom(this.rightArm);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArm.copyFrom(this.leftArm);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLeg.copyFrom(this.rightLeg);
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeg.copyFrom(this.leftLeg);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
		this.Head2.copyFrom(this.head);
		Head2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Body2.copyFrom(this.body);
		Body2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArm2.copyFrom(this.rightArm);
		RightArm2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArm2.copyFrom(this.leftArm);
		LeftArm2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLeg2.copyFrom(this.rightLeg);
		RightLeg2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeg2.copyFrom(this.leftLeg);
		LeftLeg2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.FourthColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.FourthColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.FourthColor & 255) / 255.0F;
		this.Headgrayblue.copyFrom(this.head);
		Headgrayblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmbluegray.copyFrom(this.rightArm);
		RightArmbluegray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmbluegray.copyFrom(this.leftArm);
		LeftArmbluegray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.ThirdColor & 255) / 255.0F;
		this.Bodyorange.copyFrom(this.body);
		Bodyorange.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GrayColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GrayColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GrayColor & 255) / 255.0F;
		this.Bodygray.copyFrom(this.body);
		Bodygray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmgray.copyFrom(this.rightArm);
		RightArmgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmgray.copyFrom(this.leftArm);
		LeftArmgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
		this.Headglow.copyFrom(this.head);
		Headglow.render(matrixStack, buffer, 15728640, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegglow.copyFrom(this.rightLeg);
		RightLegglow.render(matrixStack, buffer, 15728640, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegglow.copyFrom(this.leftLeg);
		LeftLegglow.render(matrixStack, buffer, 15728640, packedOverlay, fred, fgreen, fblue, alpha);
		
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
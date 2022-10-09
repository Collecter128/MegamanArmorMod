package com.collecter128.megamanarmormod.client.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EquipmentSlotType;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class ryuGi extends BipedModel {
	private final ModelRenderer Headband;
	private final ModelRenderer Bodyrobe;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer Bodyblack;
	private final ModelRenderer RightArmrobe;
	private final ModelRenderer LeftArmrobe;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;
	private final ModelRenderer Legsbody;
	private final ModelRenderer Rightleg;
	private final ModelRenderer LeftLegs;
	
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

	public ryuGi(float modelSize, EquipmentSlotType slot) {
		super(modelSize);
		texWidth = 64;
		texHeight = 71;
		
		this.equipmentslot = slot;
		
		//body 16777215 white
		//headband  16714296 red
		//belt 7368816 black/dark gray
		//Hadouken 2086655 light blueish
		
		//2nd player
		//body 10405596
		//headband 16777215    main
		//belt 0     second
		//gloves 7423539   third
		//hadouken 2086655 light blueish
		
		//Evil Ryu
			//body 4539758 Darkish blue
			//headband  16714296 red
			//belt 7368816 black/dark gray
			//Hadouken 6888384 Dark evil purple
		
		//Ken
			//body 16714296 red
			//gloves 9331247 brown
			//belt 7368816 black/dark gray
			//Hadouken 2086655 light blueish
		
		//2nd player
		//body7808735
		//gloves8276794
		//belt 0
		//
		
		MainColorDefault = 16714296;//Headband Red
		SecondaryColorDefault = 7368816; //Belt
		WhiteColorDefault = 16777215; //Main Body
		ThirdColorDefault = 16714296; // red gloves
		GlowyColorDefault = 2086655; // It's Hadouken!
		GrayColorDefault = 16777215; //Main Body
		FourthColorDefault = 9331247; //Brown
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
		FourthColor = FourthColorDefault;

		Headband = new ModelRenderer(this);
		Headband.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headband, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headband.texOffs(0, 42).addBox(-3.6706F, -7.6217F, -4.0623F, 8.0F, 5.0F, 8.0F, 0.55F, false);
		Headband.texOffs(43, 47).addBox(-3.4512F, -8.557F, 5.3005F, 7.0F, 8.0F, 0.0F, 0.0F, false);
		}
		
		Bodyrobe = new ModelRenderer(this);
		Bodyrobe.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyrobe.texOffs(16, 1).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 1.01F, false);
		}
		
		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(9.0F, 0.0F, -2.0F);
		Bodyrobe.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -1.2654F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		cube_r1.texOffs(0, 1).addBox(-4.0F, -4.0F, 0.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		}
		
		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(-8.0F, 4.0F, -2.0F);
		Bodyrobe.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 1.2654F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		cube_r2.texOffs(0, 1).addBox(-4.0F, -4.0F, 0.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		}
		
		Bodyblack = new ModelRenderer(this);
		Bodyblack.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyblack.texOffs(16, 18).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 1.04F, false);
		Bodyblack.texOffs(22, 34).addBox(-2.0F, 9.0F, -3.7F, 5.0F, 6.0F, 0.0F, 0.0F, false);
		}
		
		RightArmrobe = new ModelRenderer(this);
		RightArmrobe.setPos(-5.0F, 2.0F, 0.0F);
//		if(equipmentslot == EquipmentSlotType.CHEST) {
		setRotationAngle(RightArmrobe, -0.1745F, 0.0F, 0.0F);
//		}

		LeftArmrobe = new ModelRenderer(this);
		LeftArmrobe.setPos(5.0F, 2.0F, 0.0F);
//		if(equipmentslot == EquipmentSlotType.CHEST) {
		setRotationAngle(LeftArmrobe, 0.2094F, 0.0F, 0.0F);
//		}
		
		RightArm = new ModelRenderer(this);
		RightArm.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArm, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArm.texOffs(0, 17).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		LeftArm = new ModelRenderer(this);
		LeftArm.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArm, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArm.texOffs(40, 17).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}

		Legsbody = new ModelRenderer(this);
		Legsbody.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		Legsbody.texOffs(16, 57).addBox(-4.0F, 8.0F, -2.0F, 8.0F, 4.0F, 4.0F, 0.63F, false);
		}
		
		Rightleg = new ModelRenderer(this);
		Rightleg.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(Rightleg, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		Rightleg.texOffs(0, 56).addBox(-2.0349F, 0.019F, -1.8093F, 4.0F, 11.0F, 4.0F, 0.5F, false);
		}
		LeftLegs = new ModelRenderer(this);
		LeftLegs.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegs, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.LEGS) {
		LeftLegs.texOffs(40, 56).addBox(-1.9651F, 0.0158F, -2.1735F, 4.0F, 11.0F, 4.0F, 0.5F, true);
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
		this.Headband.copyFrom(this.head);
		Headband.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.ThirdColor & 255) / 255.0F;
		this.RightArm.copyFrom(this.rightArm);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArm.copyFrom(this.leftArm);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
		this.Bodyblack.copyFrom(this.body);
		Bodyblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.WhiteColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.WhiteColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.WhiteColor & 255) / 255.0F;
		this.Bodyrobe.copyFrom(this.body);
		Bodyrobe.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmrobe.copyFrom(this.body);
		RightArmrobe.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmrobe.copyFrom(this.body);
		LeftArmrobe.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		
		this.Legsbody.copyFrom(this.body);
		Legsbody.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Rightleg.copyFrom(this.rightLeg);
		Rightleg.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegs.copyFrom(this.leftLeg);
		LeftLegs.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
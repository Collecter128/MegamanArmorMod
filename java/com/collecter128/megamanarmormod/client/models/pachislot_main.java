package com.collecter128.megamanarmormod.client.models;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.inventory.EquipmentSlotType;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class pachislot_main extends BipedModel {
	private final ModelRenderer Headblue;
	private final ModelRenderer Headgray;
	private final ModelRenderer Headsilver;
	private final ModelRenderer Head_r1;
	private final ModelRenderer Head_r2;
	private final ModelRenderer Headlightblue;
	private final ModelRenderer Headglow;
	private final ModelRenderer Head_r3;
	private final ModelRenderer Bodymainblue;
	private final ModelRenderer Bodyglow;
	private final ModelRenderer Bodysilver;
	private final ModelRenderer Bodylightblue;
	private final ModelRenderer Bodydarkblue;
	private final ModelRenderer Bodydarkgray;
	private final ModelRenderer RightArmblue;
	private final ModelRenderer RightArmdarkblue;
	private final ModelRenderer RightArmyellow;
	private final ModelRenderer LeftArmblue;
	private final ModelRenderer LeftArmdarkblue;
	private final ModelRenderer RightLegblue;
	private final ModelRenderer RightLegdarkblue;
	private final ModelRenderer RightLegglow;
	private final ModelRenderer LeftLegblue;
	private final ModelRenderer LeftLegdarkblue;
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

	public pachislot_main(float modelSize, EquipmentSlotType slot) {
		super(modelSize);
		texWidth = 95;
		texHeight = 162;
		
		equipmentslot = slot;
		
		MainColorDefault = 4356095;//Main Body Color Dark Blue
		SecondaryColorDefault = 3489365;//Secondary Really Dark blue
		ThirdColorDefault = 11579568; //Silver parts
		WhiteColorDefault = 16579836;//Basic White
		GlowyColorDefault = 3407723;//Glow? green
		GrayColorDefault = 5395026;//Kinda dark
		FourthColorDefault = 8584431; //Cyan Color
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
		FourthColor = FourthColorDefault;


		Headblue = new ModelRenderer(this);
		Headblue.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headblue, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headblue.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headblue.texOffs(63, 1).addBox(-3.6706F, -7.6327F, -3.8533F, 8.0F, 7.0F, 8.0F, 0.55F, false);
		}
		
		Headgray = new ModelRenderer(this);
		Headgray.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headgray, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headgray.texOffs(62, 100).addBox(-3.6706F, -7.6327F, -3.8533F, 8.0F, 7.0F, 8.0F, 0.4F, false);
		}
		
		Headsilver = new ModelRenderer(this);
		Headsilver.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headsilver, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headsilver.texOffs(36, 2).addBox(5.4872F, -5.841F, -1.5659F, 1.0F, 5.0F, 5.0F, 0.5F, false);
		Headsilver.texOffs(50, 2).addBox(-5.8938F, -5.8448F, -1.5287F, 1.0F, 5.0F, 5.0F, 0.5F, false);
		Headsilver.texOffs(38, 144).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Head_r1 = new ModelRenderer(this);
		Head_r1.setPos(0.0F, -7.0F, -4.0F);
		Headsilver.addChild(Head_r1);
		setRotationAngle(Head_r1, 0.5672F, -0.6109F, -2.3998F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head_r1.texOffs(31, 1).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 1.0F, 0.3F, false);
		}
		
		Head_r2 = new ModelRenderer(this);
		Head_r2.setPos(0.0F, -8.0F, -6.0F);
		Headsilver.addChild(Head_r2);
		setRotationAngle(Head_r2, 0.5236F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head_r2.texOffs(1, 2).addBox(-1.0F, 0.0F, 1.1F, 2.0F, 1.0F, 1.0F, 0.7F, false);
		}
		
		Headlightblue = new ModelRenderer(this);
		Headlightblue.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headlightblue, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headlightblue.texOffs(0, 144).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headlightblue.texOffs(67, 117).addBox(-1.0F, -9.0F, -4.0F, 2.0F, 5.0F, 9.0F, 1.0F, false);
		}
		
		Headglow = new ModelRenderer(this);
		Headglow.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headglow, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headglow.texOffs(50, 11).addBox(-5.8938F, -5.8448F, -1.5287F, 1.0F, 5.0F, 5.0F, 0.5F, false);
		Headglow.texOffs(30, 11).addBox(5.4872F, -5.841F, -1.5659F, 1.0F, 5.0F, 5.0F, 0.5F, false);
		}
		
		Head_r3 = new ModelRenderer(this);
		Head_r3.setPos(0.0F, -7.0F, -4.0F);
		Headglow.addChild(Head_r3);
		setRotationAngle(Head_r3, 0.5672F, -0.6109F, -2.3998F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head_r3.texOffs(24, 1).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 1.0F, 0.3F, false);
		}
		
		Bodymainblue = new ModelRenderer(this);
		Bodymainblue.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodymainblue.texOffs(16, 25).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.7F, false);
		}
		
		Bodyglow = new ModelRenderer(this);
		Bodyglow.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyglow.texOffs(16, 73).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.7F, false);
		}
		
		Bodysilver = new ModelRenderer(this);
		Bodysilver.setPos(0.0F, -1.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodysilver.texOffs(16, 89).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.7F, false);
		}
		
		Bodylightblue = new ModelRenderer(this);
		Bodylightblue.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodylightblue.texOffs(41, 79).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.7F, false);
		}
		
		Bodydarkblue = new ModelRenderer(this);
		Bodydarkblue.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodydarkblue.texOffs(16, 57).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.51F, false);
		}
		
		Bodydarkgray = new ModelRenderer(this);
		Bodydarkgray.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodydarkgray.texOffs(70, 143).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.51F, false);
		Bodydarkgray.texOffs(16, 41).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.4F, false);
		}
		
		RightArmblue = new ModelRenderer(this);
		RightArmblue.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmblue, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmblue.texOffs(42, 52).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		RightArmblue.texOffs(42, 26).addBox(-3.5F, -3.0F, -2.5F, 4.0F, 4.0F, 5.0F, 0.5F, false);
		}
		
		RightArmdarkblue = new ModelRenderer(this);
		RightArmdarkblue.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmdarkblue, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmdarkblue.texOffs(42, 61).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		RightArmyellow = new ModelRenderer(this);
		RightArmyellow.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmyellow, -0.1745F, 0.0F, 0.0F);
		//RightArmyellow.texOffs(0, 84).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		LeftArmblue = new ModelRenderer(this);
		LeftArmblue.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmblue, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmblue.texOffs(61, 26).addBox(-0.5F, -3.0F, -2.5F, 4.0F, 4.0F, 5.0F, 0.5F, true);
		LeftArmblue.texOffs(59, 52).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		LeftArmdarkblue = new ModelRenderer(this);
		LeftArmdarkblue.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmdarkblue, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmdarkblue.texOffs(59, 61).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		RightLegblue = new ModelRenderer(this);
		RightLegblue.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegblue, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegblue.texOffs(0, 25).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		RightLegblue.texOffs(1, 93).addBox(-1.0F, 4.0F, -3.0F, 2.0F, 2.0F, 1.0F, 0.5F, false);
		}
		
		RightLegdarkblue = new ModelRenderer(this);
		RightLegdarkblue.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegdarkblue, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegdarkblue.texOffs(0, 57).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLegglow = new ModelRenderer(this);
		RightLegglow.setPos(-2.9F, 12.0F, 1.0F);
		setRotationAngle(RightLegglow, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegglow.texOffs(84, 28).addBox(0.0F, 7.0F, -2.0F, 2.0F, 5.0F, 2.0F, 1.0F, false);
		}
		
		LeftLegblue = new ModelRenderer(this);
		LeftLegblue.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegblue, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegblue.texOffs(0, 41).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		LeftLegblue.texOffs(7, 93).addBox(-1.0F, 4.0F, -3.0F, 2.0F, 2.0F, 1.0F, 0.5F, true);
		}
		
		LeftLegdarkblue = new ModelRenderer(this);
		LeftLegdarkblue.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegdarkblue, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegdarkblue.texOffs(0, 73).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLegglow = new ModelRenderer(this);
		LeftLegglow.setPos(0.9F, 12.0F, 1.0F);
		setRotationAngle(LeftLegglow, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegglow.texOffs(84, 43).addBox(0.0F, 7.0F, -2.0F, 2.0F, 5.0F, 2.0F, 1.0F, true);
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
		this.Headblue.copyFrom(this.head);
		Headblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodymainblue.copyFrom(this.body);
		Bodymainblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
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
		this.Bodydarkblue.copyFrom(this.body);
		Bodydarkblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmdarkblue.copyFrom(this.rightArm);
		RightArmdarkblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmyellow.copyFrom(this.rightArm);
		RightArmyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmdarkblue.copyFrom(this.leftArm);
		LeftArmdarkblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegdarkblue.copyFrom(this.rightLeg);
		RightLegdarkblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegdarkblue.copyFrom(this.leftLeg);
		LeftLegdarkblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GrayColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GrayColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GrayColor & 255) / 255.0F;
		this.Headgray.copyFrom(this.head);
		Headgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodydarkgray.copyFrom(this.body);
		Bodydarkgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.ThirdColor & 255) / 255.0F;
		this.Headsilver.copyFrom(this.head);
		Headsilver.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodysilver.copyFrom(this.body);
		Bodysilver.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.FourthColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.FourthColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.FourthColor & 255) / 255.0F;
		this.Headlightblue.copyFrom(this.head);
		Headlightblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodylightblue.copyFrom(this.body);
		Bodylightblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
		this.Headglow.copyFrom(this.head);
		Headglow.render(matrixStack, buffer, 15728640, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodyglow.copyFrom(this.body);
		Bodyglow.render(matrixStack, buffer, 15728640, packedOverlay, fred, fgreen, fblue, alpha);
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
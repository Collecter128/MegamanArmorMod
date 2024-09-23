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
public class uncustomizednavi extends BipedModel {
	private final ModelRenderer Headgreen;
	private final ModelRenderer Headskin;
	private final ModelRenderer Headeyes;
	private final ModelRenderer Headthirdgray;
	private final ModelRenderer Headsecondarylightblue;
	private final ModelRenderer Headglowblack;
	private final ModelRenderer Head_r1;
	private final ModelRenderer Bodygreen;
	private final ModelRenderer Bodythirdgray;
	private final ModelRenderer Body_r1;
	private final ModelRenderer Bodyglowblack;
	private final ModelRenderer Body_r2;
	private final ModelRenderer RightArmlightgray;
	private final ModelRenderer RightArmgreen;
	private final ModelRenderer RightArmthirdgray;
	private final ModelRenderer LeftArmlightgray;
	private final ModelRenderer LeftArmgreen;
	private final ModelRenderer LeftArmthirdgray;
	private final ModelRenderer RightLeglightgray;
	private final ModelRenderer LeftLeglightgray;
	
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

	public uncustomizednavi(float modelSize, EquipmentSlotType slot) {
		super(modelSize);
		texWidth = 74;
		texHeight = 141;
		
		equipmentslot = slot;
		
		MainColorDefault = 5804917;//Main green
		SecondaryColorDefault = 7712415;//Secondary Light Blue
		ThirdColorDefault = 8553090; //Grayish
		WhiteColorDefault = 16777215;//Basic White not used
		GlowyColorDefault = 0;//Glow? black
		GrayColorDefault = 13552310;//light gray
		FourthColorDefault = 5804917; //??? Unused green
		FifthColorDefault = 5333642; //??? Unused eye blue
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
		FourthColor = FourthColorDefault;
		FifthColor = FifthColorDefault;

		Headgreen = new ModelRenderer(this);
		Headgreen.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headgreen, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headgreen.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Headskin = new ModelRenderer(this);
		Headskin.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headskin, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headskin.texOffs(41, 81).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Headeyes = new ModelRenderer(this);
		Headeyes.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headeyes, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headeyes.texOffs(41, 98).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Headthirdgray = new ModelRenderer(this);
		Headthirdgray.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headthirdgray, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headthirdgray.texOffs(34, 64).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headthirdgray.texOffs(37, 4).addBox(5.4872F, -4.841F, -1.5659F, 1.0F, 4.0F, 4.0F, 0.5F, false);
		Headthirdgray.texOffs(51, 4).addBox(-5.8938F, -4.8448F, -1.5287F, 1.0F, 4.0F, 4.0F, 0.5F, false);
		}
		
		Headsecondarylightblue = new ModelRenderer(this);
		Headsecondarylightblue.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headsecondarylightblue, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headsecondarylightblue.texOffs(0, 55).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Headglowblack = new ModelRenderer(this);
		Headglowblack.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headglowblack, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headglowblack.texOffs(35, 0).addBox(-5.0F, -4.3091F, -0.9133F, 0.0F, 3.0F, 3.0F, 0.5F, false);
		}
		
		Head_r1 = new ModelRenderer(this);
		Head_r1.setPos(-1.0F, 23.0F, 0.0F);
		Headglowblack.addChild(Head_r1);
		setRotationAngle(Head_r1, 0.0F, 3.1416F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head_r1.texOffs(49, 0).addBox(-6.5F, -27.3F, -2.0F, 0.0F, 3.0F, 3.0F, 0.5F, false);
		}
		
		Bodygreen = new ModelRenderer(this);
		Bodygreen.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodygreen.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.51F, false);
		}
		
		Bodythirdgray = new ModelRenderer(this);
		Bodythirdgray.setPos(0.0F, 0.0F, 0.0F);
		

		Body_r1 = new ModelRenderer(this);
		Body_r1.setPos(1.0F, 18.0F, -4.0F);
		Bodythirdgray.addChild(Body_r1);
		setRotationAngle(Body_r1, 0.0F, 3.1416F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Body_r1.texOffs(19, 43).addBox(-2.0F, -18.0F, -1.2F, 6.0F, 6.0F, 1.0F, -1.02F, false);
		}
		
		Bodyglowblack = new ModelRenderer(this);
		Bodyglowblack.setPos(0.0F, 0.0F, 0.0F);
		

		Body_r2 = new ModelRenderer(this);
		Body_r2.setPos(2.0F, 17.0F, -5.0F);
		Bodyglowblack.addChild(Body_r2);
		setRotationAngle(Body_r2, 0.0F, 3.1416F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Body_r2.texOffs(21, 37).addBox(-0.5F, -16.5F, -2.0F, 5.0F, 5.0F, 0.0F, -1.02F, false);
		}
		
		RightArmlightgray = new ModelRenderer(this);
		RightArmlightgray.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmlightgray, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmlightgray.texOffs(57, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		RightArmgreen = new ModelRenderer(this);
		RightArmgreen.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmgreen, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmgreen.texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		RightArmthirdgray = new ModelRenderer(this);
		RightArmthirdgray.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmthirdgray, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmthirdgray.texOffs(0, 84).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		LeftArmlightgray = new ModelRenderer(this);
		LeftArmlightgray.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmlightgray, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {	
		LeftArmlightgray.texOffs(57, 40).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		LeftArmgreen = new ModelRenderer(this);
		LeftArmgreen.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgreen, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmgreen.texOffs(40, 40).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		LeftArmthirdgray = new ModelRenderer(this);
		LeftArmthirdgray.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmthirdgray, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmthirdgray.texOffs(17, 84).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		RightLeglightgray = new ModelRenderer(this);
		RightLeglightgray.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeglightgray, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLeglightgray.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		LeftLeglightgray = new ModelRenderer(this);
		LeftLeglightgray.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeglightgray, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLeglightgray.texOffs(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
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
		
		
		this.Headskin.copyFrom(this.head);
		Headskin.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		
		this.Headeyes.copyFrom(this.head);
		Headeyes.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		
		fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.ThirdColor & 255) / 255.0F;
		this.Headthirdgray.copyFrom(this.head);
		Headthirdgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodythirdgray.copyFrom(this.body);
		Bodythirdgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmthirdgray.copyFrom(this.rightArm);
		RightArmthirdgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmthirdgray.copyFrom(this.leftArm);
		LeftArmthirdgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
		this.Headsecondarylightblue.copyFrom(this.head);
		Headsecondarylightblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
		this.Headglowblack.copyFrom(this.head);
		Headglowblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodyglowblack.copyFrom(this.body);
		Bodyglowblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GrayColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GrayColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GrayColor & 255) / 255.0F;
		this.RightArmlightgray.copyFrom(this.rightArm);
		RightArmlightgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmlightgray.copyFrom(this.leftArm);
		LeftArmlightgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLeglightgray.copyFrom(this.rightLeg);
		RightLeglightgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeglightgray.copyFrom(this.leftLeg);
		LeftLeglightgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
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
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

@OnlyIn(Dist.CLIENT)
public class zerofirstfeet extends BipedModel {
//	private final ModelRenderer Head;
//	private final ModelRenderer Headwhite;
//	private final ModelRenderer Headsilver;
//	private final ModelRenderer cube_r1;
//	private final ModelRenderer Headgold;
//	private final ModelRenderer cube_r2;
//	private final ModelRenderer Headglow;
//	private final ModelRenderer Body;
//	private final ModelRenderer Bodyglow;
//	private final ModelRenderer Bodygold;
//	private final ModelRenderer Bodywhite;
//	private final ModelRenderer Bodygray;
//	private final ModelRenderer RightArm;
//	private final ModelRenderer RightArmwhite;
//	private final ModelRenderer RightArmgray;
//	private final ModelRenderer LeftArm;
//	private final ModelRenderer LeftArmwhite;
//	private final ModelRenderer LeftArmgray;
	private final ModelRenderer RightLeg;
	private final ModelRenderer RightLegwhite;
	private final ModelRenderer RightLegglow;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer LeftLegwhite;
	private final ModelRenderer LeftLegglow;
	
	public int MainColor;
	public int SecondaryColor;
	public int WhiteColor;
	public int ThirdColor;
	public int GlowyColor;
	public int GrayColor;
	public int MainColorDefault;
	public int SecondaryColorDefault;
	public int WhiteColorDefault;
	public int ThirdColorDefault;
	public int GlowyColorDefault;
	public int GrayColorDefault;
	
	EquipmentSlotType Slottype;

	public zerofirstfeet(float modelSize) {
		super(modelSize);
		texWidth = 82;
		texHeight = 152;
		
		MainColorDefault = 15339559;//Main Body Color Zero Red old ver
		SecondaryColorDefault = 5752303;//
		ThirdColorDefault = 16763151; // Hair
		WhiteColorDefault = 16777215;//Basic White
		GlowyColorDefault = 4570959;//Glow? 
		GrayColorDefault = 16777215;//Basic White
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;

//		Head = new ModelRenderer(this);
//		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
//		setRotationAngle(Head, -0.1047F, 0.0873F, 0.0F);
//		Head.setTextureOffset(0, 4).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
//		Head.setTextureOffset(32, 0).addBox(-3.6706F, -12.6327F, -3.8533F, 8.0F, 12.0F, 8.0F, 1.55F, false);
//
//		Headwhite = new ModelRenderer(this);
//		Headwhite.setRotationPoint(0.0F, 0.0F, 0.0F);
//		setRotationAngle(Headwhite, -0.1047F, 0.0873F, 0.0F);
//		Headwhite.setTextureOffset(0, 104).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
//		Headwhite.setTextureOffset(4, 87).addBox(5.0643F, -4.9396F, -0.6797F, 1.0F, 3.0F, 3.0F, 0.5F, false);
//		Headwhite.setTextureOffset(4, 96).addBox(-5.8938F, -4.8393F, -1.6332F, 1.0F, 3.0F, 3.0F, 0.5F, false);
//
//		Headsilver = new ModelRenderer(this);
//		Headsilver.setRotationPoint(0.0F, 0.0F, 0.0F);
//		setRotationAngle(Headsilver, -0.1047F, 0.0873F, 0.0F);
//		Headsilver.setTextureOffset(47, 89).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.75F, false);
//
//		cube_r1 = new ModelRenderer(this);
//		cube_r1.setRotationPoint(0.0F, -2.0F, 5.0F);
//		Headsilver.addChild(cube_r1);
//		setRotationAngle(cube_r1, -0.3491F, 0.0F, 0.0F);
//		cube_r1.setTextureOffset(68, 11).addBox(-1.0F, -0.9517F, -0.1853F, 2.0F, 2.0F, 5.0F, 0.0F, false);
//
//		Headgold = new ModelRenderer(this);
//		Headgold.setRotationPoint(0.0F, 0.0F, 0.0F);
//		setRotationAngle(Headgold, -0.1047F, 0.0873F, 0.0F);
//		
//
//		cube_r2 = new ModelRenderer(this);
//		cube_r2.setRotationPoint(0.0F, 0.0F, 10.0F);
//		Headgold.addChild(cube_r2);
//		setRotationAngle(cube_r2, 0.3927F, 0.0F, 0.0F);
//		cube_r2.setTextureOffset(58, 60).addBox(-3.0F, -1.1637F, -3.4193F, 6.0F, 12.0F, 6.0F, 0.0F, false);
//
//		Headglow = new ModelRenderer(this);
//		Headglow.setRotationPoint(0.0F, 0.0F, 0.0F);
//		setRotationAngle(Headglow, -0.1047F, 0.0873F, 0.0F);
//		Headglow.setTextureOffset(33, 104).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
//		Headglow.setTextureOffset(41, 82).addBox(-3.9322F, -4.9396F, -0.9856F, 8.0F, 3.0F, 3.0F, 1.55F, false);
//
//	//if(Slottype == EquipmentSlotType.CHEST) {
//		Body = new ModelRenderer(this);
//		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
//		Body.setTextureOffset(16, 20).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.86F, false);
//
//		Bodyglow = new ModelRenderer(this);
//		Bodyglow.setRotationPoint(0.0F, 0.0F, 0.0F);
//		Bodyglow.setTextureOffset(16, 52).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.86F, false);
//		
//		Bodygold = new ModelRenderer(this);
//		Bodygold.setRotationPoint(0.0F, 0.0F, 0.0F);
//		Bodygold.setTextureOffset(16, 82).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
//
//		Bodywhite = new ModelRenderer(this);
//		Bodywhite.setRotationPoint(0.0F, 0.0F, 0.0F);
//		Bodywhite.setTextureOffset(16, 36).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.86F, false);
//
//		Bodygray = new ModelRenderer(this);
//		Bodygray.setRotationPoint(0.0F, 0.0F, 0.0F);
//		Bodygray.setTextureOffset(16, 69).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
//	
//		RightArm = new ModelRenderer(this);
//		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
//		setRotationAngle(RightArm, -0.1745F, 0.0F, 0.0F);
//		RightArm.setTextureOffset(40, 36).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
//
//		RightArmwhite = new ModelRenderer(this);
//		RightArmwhite.setRotationPoint(-5.0F, 2.0F, 0.0F);
//		setRotationAngle(RightArmwhite, -0.1745F, 0.0F, 0.0F);
//		RightArmwhite.setTextureOffset(40, 44).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
//		RightArmwhite.setTextureOffset(65, 123).addBox(-3.0F, 7.0152F, -2.0F, 4.0F, 4.0F, 4.0F, 0.77F, false);
//
//		RightArmgray = new ModelRenderer(this);
//		RightArmgray.setRotationPoint(-5.0F, 2.0F, 0.0F);
//		setRotationAngle(RightArmgray, -0.1745F, 0.0F, 0.0F);
//		RightArmgray.setTextureOffset(40, 20).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
//
//		LeftArm = new ModelRenderer(this);
//		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
//		setRotationAngle(LeftArm, 0.2094F, 0.0F, 0.0F);
//		LeftArm.setTextureOffset(57, 36).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
//
//		LeftArmwhite = new ModelRenderer(this);
//		LeftArmwhite.setRotationPoint(5.0F, 2.0F, 0.0F);
//		setRotationAngle(LeftArmwhite, 0.2094F, 0.0F, 0.0F);
//		LeftArmwhite.setTextureOffset(57, 44).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
//		LeftArmwhite.setTextureOffset(63, 132).addBox(-1.0F, 7.0218F, -2.0F, 4.0F, 4.0F, 4.0F, 0.77F, false);
//
//		LeftArmgray = new ModelRenderer(this);
//		LeftArmgray.setRotationPoint(5.0F, 2.0F, 0.0F);
//		setRotationAngle(LeftArmgray, 0.2094F, 0.0F, 0.0F);
//		LeftArmgray.setTextureOffset(57, 20).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
	//}
	
		RightLeg = new ModelRenderer(this);
		RightLeg.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeg, 0.192F, 0.0F, 0.0349F);
		RightLeg.texOffs(0, 20).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);

		RightLegwhite = new ModelRenderer(this);
		RightLegwhite.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegwhite, 0.192F, 0.0F, 0.0349F);
		RightLegwhite.texOffs(0, 52).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);

		RightLegglow = new ModelRenderer(this);
		RightLegglow.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegglow, 0.192F, 0.0F, 0.0349F);
		RightLegglow.texOffs(73, 31).addBox(-0.8598F, 14.34F, -0.8062F, 2.0F, 2.0F, 2.0F, 1.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeg, -0.1745F, 0.0F, -0.0349F);
		LeftLeg.texOffs(0, 36).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);

		LeftLegwhite = new ModelRenderer(this);
		LeftLegwhite.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegwhite, -0.1745F, 0.0F, -0.0349F);
		LeftLegwhite.texOffs(0, 68).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);

		LeftLegglow = new ModelRenderer(this);
		LeftLegglow.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegglow, -0.1745F, 0.0F, -0.0349F);
		LeftLegglow.texOffs(73, 19).addBox(-1.139F, 13.9025F, -1.312F, 2.0F, 2.0F, 2.0F, 1.0F, true);
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
//		this.Head.copyModelAngles(this.bipedHead);
//		Head.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.Body.copyModelAngles(this.bipedBody);
//		Body.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.RightArm.copyModelAngles(this.bipedRightArm);
//		RightArm.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.LeftArm.copyModelAngles(this.bipedLeftArm);
//		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLeg.copyFrom(this.rightLeg);
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeg.copyFrom(this.leftLeg);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		

//		fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
//        fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
//        fblue = (float)(this.ThirdColor & 255) / 255.0F;
//		this.Headgold.copyModelAngles(this.bipedHead);
//		Headgold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.Bodygold.copyModelAngles(this.bipedBody);
//		Bodygold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);

		
		fred = (float)( this.WhiteColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.WhiteColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.WhiteColor & 255) / 255.0F;
//		this.Headwhite.copyModelAngles(this.bipedHead);
//		Headwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.Bodywhite.copyModelAngles(this.bipedBody);
//		Bodywhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.RightArmwhite.copyModelAngles(this.bipedRightArm);
//		RightArmwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
//		this.LeftArmwhite.copyModelAngles(this.bipedLeftArm);
//		LeftArmwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegwhite.copyFrom(this.rightLeg);
		RightLegwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegwhite.copyFrom(this.leftLeg);
		LeftLegwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);

		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
//		this.Headglow.copyModelAngles(this.bipedHead);
//		Headglow.render(matrixStack, buffer, 15728640, packedOverlay, fred, fgreen, fblue, alpha);
//		this.Bodyglow.copyModelAngles(this.bipedBody);
//		Bodyglow.render(matrixStack, buffer, 15728640, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegglow.copyFrom(this.rightLeg);
		RightLegglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegglow.copyFrom(this.leftLeg);
		LeftLegglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		

	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
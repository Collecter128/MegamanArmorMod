package com.collecter128.megamanarmormod.client.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;

// Made with Blockbench 4.6.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class xkai_legs extends BipedModel {
	private final ModelRenderer Bodyblack;
	private final ModelRenderer Bodyorangeglow;
	private final ModelRenderer Bodygold;
	private final ModelRenderer Bodygray;
	private final ModelRenderer RightLegblackblue;
	private final ModelRenderer RightLeggold;
	private final ModelRenderer RightLeggray;
	private final ModelRenderer RightLegorangeglow;
	private final ModelRenderer LeftLegblackblue;
	private final ModelRenderer LeftLeggold;
	private final ModelRenderer LeftLeggray;
	private final ModelRenderer LeftLegorangeglow;
	
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

	public xkai_legs(float modelSize) {
		super(modelSize);
		texWidth = 93;
		texHeight = 255;
		
		MainColorDefault = 4671303;//black
		SecondaryColorDefault = 4281708;//blue gray
		ThirdColorDefault = 13883451; //gold
		WhiteColorDefault = 16777215;//White
		GlowyColorDefault = 9060564;//purple
		GrayColorDefault = 15592941;//gray
		FourthColorDefault = 16743685;//orange
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
		FourthColor = FourthColorDefault;

		Bodyblack = new ModelRenderer(this);
		Bodyblack.setPos(0.0F, 1.0F, 0.0F);
		Bodyblack.texOffs(19, 121).addBox(-4.5F, 7.5F, -2.5F, 9.0F, 5.0F, 5.0F, 0.51F, false);

		Bodyorangeglow = new ModelRenderer(this);
		Bodyorangeglow.setPos(0.0F, 1.0F, 0.0F);
		Bodyorangeglow.texOffs(19, 225).addBox(-4.5F, 7.5F, -2.5F, 9.0F, 5.0F, 5.0F, 0.51F, false);

		Bodygold = new ModelRenderer(this);
		Bodygold.setPos(0.0F, 1.0F, 0.0F);
		Bodygold.texOffs(19, 241).addBox(-4.5F, 7.5F, -2.5F, 9.0F, 5.0F, 5.0F, 0.51F, false);

		Bodygray = new ModelRenderer(this);
		Bodygray.setPos(0.0F, 0.0F, 0.0F);
		Bodygray.texOffs(20, 134).addBox(-4.0F, 10.0F, -2.0F, 8.0F, 3.0F, 4.0F, 0.51F, false);

		RightLegblackblue = new ModelRenderer(this);
		RightLegblackblue.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegblackblue, 0.192F, 0.0F, 0.0349F);
		RightLegblackblue.texOffs(0, 121).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		RightLeggold = new ModelRenderer(this);
		RightLeggold.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeggold, 0.192F, 0.0F, 0.0349F);
		RightLeggold.texOffs(0, 226).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		RightLeggray = new ModelRenderer(this);
		RightLeggray.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeggray, 0.192F, 0.0F, 0.0349F);
		RightLeggray.texOffs(0, 137).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		RightLegorangeglow = new ModelRenderer(this);
		RightLegorangeglow.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegorangeglow, 0.192F, 0.0F, 0.0349F);
		RightLegorangeglow.texOffs(21, 148).addBox(-0.9994F, 7.2251F, -1.025F, 2.0F, 5.0F, 2.0F, 0.5F, false);

		LeftLegblackblue = new ModelRenderer(this);
		LeftLegblackblue.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegblackblue, -0.1745F, 0.0F, -0.0349F);
		LeftLegblackblue.texOffs(48, 122).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		LeftLeggold = new ModelRenderer(this);
		LeftLeggold.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeggold, -0.1745F, 0.0F, -0.0349F);
		LeftLeggold.texOffs(52, 226).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		LeftLeggray = new ModelRenderer(this);
		LeftLeggray.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeggray, -0.1745F, 0.0F, -0.0349F);
		LeftLeggray.texOffs(48, 138).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		LeftLegorangeglow = new ModelRenderer(this);
		LeftLegorangeglow.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegorangeglow, -0.1745F, 0.0F, -0.0349F);
		LeftLegorangeglow.texOffs(31, 148).addBox(-0.9994F, 6.792F, -1.0212F, 2.0F, 5.0F, 2.0F, 0.5F, true);
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
		this.Bodyblack.copyFrom(this.body);
		Bodyblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.FourthColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.FourthColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.FourthColor & 255) / 255.0F;
		this.Bodyorangeglow.copyFrom(this.body);
		Bodyorangeglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegorangeglow.copyFrom(this.rightLeg);
		RightLegorangeglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegorangeglow.copyFrom(this.leftLeg);
		LeftLegorangeglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.ThirdColor & 255) / 255.0F;
		this.Bodygold.copyFrom(this.body);
		Bodygold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLeggold.copyFrom(this.rightLeg);
		RightLeggold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeggold.copyFrom(this.leftLeg);
		LeftLeggold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GrayColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GrayColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GrayColor & 255) / 255.0F;
		this.Bodygray.copyFrom(this.body);
		Bodygray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLeggray.copyFrom(this.rightLeg);
		RightLeggray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeggray.copyFrom(this.leftLeg);
		LeftLeggray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
		this.RightLegblackblue.copyFrom(this.rightLeg);
		RightLegblackblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegblackblue.copyFrom(this.leftLeg);
		LeftLegblackblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
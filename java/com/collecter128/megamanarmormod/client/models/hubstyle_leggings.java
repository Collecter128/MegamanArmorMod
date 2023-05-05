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
public class hubstyle_leggings extends BipedModel {
	private final ModelRenderer Bodydarkgreen;
	private final ModelRenderer Bodylightgreenglow;
	private final ModelRenderer RightLegdarkgreen;
	private final ModelRenderer RightLeglightgreenglow;
	private final ModelRenderer LeftLegdarkgreen;
	private final ModelRenderer LeftLeglightgreenglow;
	
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

	public hubstyle_leggings(float modelSize) {
		super(modelSize);
		texWidth = 74;
		texHeight = 181;
		
		MainColorDefault = 5439433;//Main Body green
		SecondaryColorDefault = 415304;//Secondary Dark Green
		ThirdColorDefault = 16630571; //golden?
		WhiteColorDefault = 2378966;//
		GlowyColorDefault = 16646401;//red
		GrayColorDefault = 2378966;//
		FourthColorDefault = 65428; //Blue Green
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
		FourthColor = FourthColorDefault;

		Bodydarkgreen = new ModelRenderer(this);
		Bodydarkgreen.setPos(0.0F, 0.0F, 0.0F);
		Bodydarkgreen.texOffs(16, 119).addBox(-4.0F, 9.0F, -2.0F, 8.0F, 3.0F, 4.0F, 0.51F, false);

		Bodylightgreenglow = new ModelRenderer(this);
		Bodylightgreenglow.setPos(0.0F, 0.0F, 0.0F);
		Bodylightgreenglow.texOffs(16, 130).addBox(-4.0F, 9.0F, -2.0F, 8.0F, 3.0F, 4.0F, 0.51F, false);

		RightLegdarkgreen = new ModelRenderer(this);
		RightLegdarkgreen.setPos(-2.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegdarkgreen, 0.192F, 0.0F, 0.0349F);
		RightLegdarkgreen.texOffs(0, 118).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		RightLeglightgreenglow = new ModelRenderer(this);
		RightLeglightgreenglow.setPos(-2.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeglightgreenglow, 0.192F, 0.0F, 0.0349F);
		RightLeglightgreenglow.texOffs(0, 135).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		LeftLegdarkgreen = new ModelRenderer(this);
		LeftLegdarkgreen.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegdarkgreen, -0.1745F, 0.0F, -0.0349F);
		LeftLegdarkgreen.texOffs(40, 118).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		LeftLeglightgreenglow = new ModelRenderer(this);
		LeftLeglightgreenglow.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeglightgreenglow, -0.1745F, 0.0F, -0.0349F);
		LeftLeglightgreenglow.texOffs(40, 133).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
	}

//	@Override
//	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
//		//previously the render function, render code was moved to a method below
//	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		
		float fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
		float fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
		float fblue = (float)(this.SecondaryColor & 255) / 255.0F;
		this.Bodydarkgreen.copyFrom(this.body);
		Bodydarkgreen.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegdarkgreen.copyFrom(this.rightLeg);
		RightLegdarkgreen.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegdarkgreen.copyFrom(this.leftLeg);
		LeftLegdarkgreen.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.MainColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.MainColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.MainColor & 255) / 255.0F;
		this.Bodylightgreenglow.copyFrom(this.body);
		Bodylightgreenglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLeglightgreenglow.copyFrom(this.rightLeg);
		RightLeglightgreenglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeglightgreenglow.copyFrom(this.leftLeg);
		LeftLeglightgreenglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
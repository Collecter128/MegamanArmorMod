package com.collecter128.megamanarmormod.client.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports

@OnlyIn(Dist.CLIENT)
public class darkprotomanexe_leggings extends BipedModel {
	private final ModelRenderer Bodydarkgray;
	private final ModelRenderer RightLegdarkgray;
	private final ModelRenderer LeftLegdarkgray;
	
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

	public darkprotomanexe_leggings(float modelSize) {
		super(modelSize);
		texWidth = 86;
		texHeight = 182;
		
		MainColorDefault = 11731009;//Main Body Color Dark Redish Purple
		SecondaryColorDefault = 6958199;//Secondary Dark purple
		ThirdColorDefault = 16754949; //Slightly Orangish Yellow
		WhiteColorDefault = 16777215;//Basic White
		GlowyColorDefault = 16754949;//Glow? Yellow
		GrayColorDefault = 14079702;//Light Gray
		FourthColorDefault = 5002091; //Dark Blue Gray 

		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
		FourthColor = FourthColorDefault;

		Bodydarkgray = new ModelRenderer(this);
		Bodydarkgray.setPos(0.0F, 0.0F, 0.0F);
		Bodydarkgray.texOffs(46, 119).addBox(-4.0F, 9.0F, -2.0F, 8.0F, 3.0F, 4.0F, 0.51F, false);

		RightLegdarkgray = new ModelRenderer(this);
		RightLegdarkgray.setPos(-2.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegdarkgray, 0.192F, 0.0F, 0.0349F);
		RightLegdarkgray.texOffs(30, 118).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		LeftLegdarkgray = new ModelRenderer(this);
		LeftLegdarkgray.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegdarkgray, -0.1745F, 0.0F, -0.0349F);
		LeftLegdarkgray.texOffs(70, 118).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
	}

//	@Override
//	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
//		//previously the render function, render code was moved to a method below
//	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		
		float fred = (float)( this.FourthColor >> 16 & 255) / 255.0F;
		float fgreen = (float)(this.FourthColor >> 8 & 255) / 255.0F;
		float fblue = (float)(this.FourthColor & 255) / 255.0F;
		this.Bodydarkgray.copyFrom(this.body);
		Bodydarkgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		this.RightLegdarkgray.copyFrom(this.rightLeg);
		RightLegdarkgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		this.LeftLegdarkgray.copyFrom(this.leftLeg);
		LeftLegdarkgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
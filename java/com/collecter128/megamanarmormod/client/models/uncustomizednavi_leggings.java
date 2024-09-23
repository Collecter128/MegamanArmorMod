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
public class uncustomizednavi_leggings extends BipedModel {
	private final ModelRenderer Bodygreen;
	private final ModelRenderer RightLeggreen;
	private final ModelRenderer LeftLeggreen;
	
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

	public uncustomizednavi_leggings(float modelSize) {
		super(modelSize);
		texWidth = 74;
		texHeight = 141;
		
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

		Bodygreen = new ModelRenderer(this);
		Bodygreen.setPos(0.0F, 0.0F, 0.0F);
		Bodygreen.texOffs(16, 119).addBox(-4.0F, 9.0F, -2.0F, 8.0F, 3.0F, 4.0F, 0.51F, false);

		RightLeggreen = new ModelRenderer(this);
		RightLeggreen.setPos(-2.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeggreen, 0.192F, 0.0F, 0.0349F);
		RightLeggreen.texOffs(0, 118).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		LeftLeggreen = new ModelRenderer(this);
		LeftLeggreen.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeggreen, -0.1745F, 0.0F, -0.0349F);
		LeftLeggreen.texOffs(40, 117).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
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
		this.Bodygreen.copyFrom(this.body);
		Bodygreen.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLeggreen.copyFrom(this.rightLeg);
		RightLeggreen.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeggreen.copyFrom(this.leftLeg);
		LeftLeggreen.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
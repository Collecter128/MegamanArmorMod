package com.collecter128.megamanarmormod.client.models;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

// Made with Blockbench 4.7.1
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports

@OnlyIn(Dist.CLIENT)
public class timeman_leggings extends BipedModel {
	private final ModelRenderer Bodylightpurple;
	private final ModelRenderer Bodygray;
	private final ModelRenderer RightLeglightpurple;
	private final ModelRenderer RightLeggray;
	private final ModelRenderer RightLegblueglow;
	private final ModelRenderer LeftLeglightpurple;
	private final ModelRenderer LeftLeggray;
	private final ModelRenderer LeftLegblueglow;
	
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

	public timeman_leggings(float modelSize) {
		super(modelSize);
		texWidth = 75;
		texHeight = 120;
		
		MainColorDefault = 10514621;//Main Body Color purple
		SecondaryColorDefault = 12808110;//Secondary Light Purple
		ThirdColorDefault = 16764728; //gold
		WhiteColorDefault = 16777215;//White
		GlowyColorDefault = 4491492;//Blue
		GrayColorDefault = 10592673;//Gray
		FourthColorDefault = 16716820; //Red
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
		FourthColor = FourthColorDefault;

		Bodylightpurple = new ModelRenderer(this);
		Bodylightpurple.setPos(0.0F, 0.0F, 0.0F);
		Bodylightpurple.texOffs(16, 77).addBox(-4.0F, 9.0F, -2.0F, 8.0F, 3.0F, 4.0F, 0.51F, false);
		Bodylightpurple.texOffs(16, 85).addBox(-4.0F, 9.0F, -2.0F, 8.0F, 3.0F, 4.0F, 0.4F, false);

		Bodygray = new ModelRenderer(this);
		Bodygray.setPos(0.0F, 0.0F, 0.0F);
		Bodygray.texOffs(16, 92).addBox(-4.0F, 9.0F, -2.0F, 8.0F, 3.0F, 4.0F, 0.4F, false);

		RightLeglightpurple = new ModelRenderer(this);
		RightLeglightpurple.setPos(-2.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeglightpurple, 0.192F, 0.0F, 0.0349F);
		RightLeglightpurple.texOffs(0, 67).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		RightLeggray = new ModelRenderer(this);
		RightLeggray.setPos(-2.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeggray, 0.192F, 0.0F, 0.0349F);
		RightLeggray.texOffs(0, 83).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		RightLegblueglow = new ModelRenderer(this);
		RightLegblueglow.setPos(-2.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegblueglow, 0.192F, 0.0F, 0.0349F);
		RightLegblueglow.texOffs(18, 18).addBox(-1.0F, 7.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.5F, false);

		LeftLeglightpurple = new ModelRenderer(this);
		LeftLeglightpurple.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeglightpurple, -0.1745F, 0.0F, -0.0349F);
		LeftLeglightpurple.texOffs(40, 67).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		LeftLeggray = new ModelRenderer(this);
		LeftLeggray.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeggray, -0.1745F, 0.0F, -0.0349F);
		LeftLeggray.texOffs(40, 83).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		LeftLegblueglow = new ModelRenderer(this);
		LeftLegblueglow.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegblueglow, -0.1745F, 0.0F, -0.0349F);
		LeftLegblueglow.texOffs(28, 18).addBox(-1.0F, 6.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.5F, true);
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
		this.Bodylightpurple.copyFrom(this.body);
		Bodylightpurple.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLeglightpurple.copyFrom(this.rightLeg);
		RightLeglightpurple.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeglightpurple.copyFrom(this.leftLeg);
		LeftLeglightpurple.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GrayColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GrayColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GrayColor & 255) / 255.0F;
		this.Bodygray.copyFrom(this.body);
		Bodygray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLeggray.copyFrom(this.rightLeg);
		RightLeggray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeggray.copyFrom(this.leftLeg);
		LeftLeggray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
		this.RightLegblueglow.copyFrom(this.rightLeg);
		RightLegblueglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegblueglow.copyFrom(this.leftLeg);
		LeftLegblueglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
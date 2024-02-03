package com.collecter128.megamanarmormod.client.models;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports

@OnlyIn(Dist.CLIENT)
public class zeroexarmor_leggings extends BipedModel {
	private final ModelRenderer Bodywhite;
	private final ModelRenderer Bodygray;
	private final ModelRenderer Bodygold;
	private final ModelRenderer RightLegsecondary;
	private final ModelRenderer RightLeggray;
	private final ModelRenderer RightLegblueglow;
	private final ModelRenderer LeftLegsecondary;
	private final ModelRenderer LeftLeggray;
	private final ModelRenderer LeftLegblueglow;
	
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

	public zeroexarmor_leggings(float modelSize) {
		super(modelSize);
		texWidth = 105;
		texHeight = 195;
		
		MainColorDefault = 16711680;//Main Body Color Zero Red
		SecondaryColorDefault = 2171169;//Secondary Black
		ThirdColorDefault = 16763151; // Hair
		WhiteColorDefault = 16777215;//Basic White
		GlowyColorDefault = 2448340;//Glow? 
		GrayColorDefault = 16777215;//Basic White
		//FourthColorDefault = ???; //
		FifthColorDefault = 2935135; //green
		
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
		//FourthColor = FourthColorDefault;
		FifthColor = FifthColorDefault;

		Bodywhite = new ModelRenderer(this);
		Bodywhite.setPos(0.0F, 1.0F, 0.0F);
		Bodywhite.texOffs(16, 141).addBox(-4.0F, 9.0F, -2.0F, 8.0F, 3.0F, 4.0F, 1.01F, false);
		Bodywhite.texOffs(16, 155).addBox(-4.0F, 9.0F, -2.0F, 8.0F, 3.0F, 4.0F, 0.51F, false);

		Bodygray = new ModelRenderer(this);
		Bodygray.setPos(0.0F, 0.0F, 0.0F);
		Bodygray.texOffs(16, 148).addBox(-4.0F, 10.0F, -2.0F, 8.0F, 3.0F, 4.0F, 0.51F, false);

		Bodygold = new ModelRenderer(this);
		Bodygold.setPos(0.0F, 1.0F, 0.0F);
		Bodygold.texOffs(16, 132).addBox(-4.0F, 9.0F, -2.0F, 8.0F, 3.0F, 4.0F, 1.01F, false);

		RightLegsecondary = new ModelRenderer(this);
		RightLegsecondary.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegsecondary, 0.192F, 0.0F, 0.0349F);
		RightLegsecondary.texOffs(17, 100).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		RightLeggray = new ModelRenderer(this);
		RightLeggray.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeggray, 0.192F, 0.0F, 0.0349F);
		RightLeggray.texOffs(0, 132).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		RightLegblueglow = new ModelRenderer(this);
		RightLegblueglow.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegblueglow, 0.192F, 0.0F, 0.0349F);
		RightLegblueglow.texOffs(40, 136).addBox(-0.9994F, 8.2251F, -1.025F, 2.0F, 4.0F, 2.0F, 0.5F, false);

		LeftLegsecondary = new ModelRenderer(this);
		LeftLegsecondary.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegsecondary, -0.1745F, 0.0F, -0.0349F);
		LeftLegsecondary.texOffs(34, 100).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		LeftLeggray = new ModelRenderer(this);
		LeftLeggray.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeggray, -0.1745F, 0.0F, -0.0349F);
		LeftLeggray.texOffs(0, 148).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		LeftLegblueglow = new ModelRenderer(this);
		LeftLegblueglow.setPos(0.9F, 12.0F, 1.0F);
		setRotationAngle(LeftLegblueglow, -0.1745F, 0.0F, -0.0349F);
		LeftLegblueglow.texOffs(40, 149).addBox(0.0F, 8.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.5F, true);
	}

//	@Override
//	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
//		//previously the render function, render code was moved to a method below
//	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		
		float fred = (float)( this.WhiteColor >> 16 & 255) / 255.0F;
        float fgreen = (float)(this.WhiteColor >> 8 & 255) / 255.0F;
        float fblue = (float)(this.WhiteColor & 255) / 255.0F;
		this.Bodywhite.copyFrom(this.body);
		Bodywhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GrayColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GrayColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GrayColor & 255) / 255.0F;
		this.Bodygray.copyFrom(this.body);
		Bodygray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLeggray.copyFrom(this.rightLeg);
		RightLeggray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeggray.copyFrom(this.leftLeg);
		LeftLeggray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.ThirdColor & 255) / 255.0F;
		this.Bodygold.copyFrom(this.body);
		Bodygold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
		this.RightLegsecondary.copyFrom(this.rightLeg);
		RightLegsecondary.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegsecondary.copyFrom(this.leftLeg);
		LeftLegsecondary.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
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
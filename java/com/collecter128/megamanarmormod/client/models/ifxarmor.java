package com.collecter128.megamanarmormod.client.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

@OnlyIn(Dist.CLIENT)
public class ifxarmor extends BipedModel {
	private final ModelRenderer Body;
	private final ModelRenderer Body2;
	private final ModelRenderer Body4;
	private final ModelRenderer Bodygray;
	private final ModelRenderer zeroRightArm;
	private final ModelRenderer zeroRightArmblack;
	private final ModelRenderer zeroRightArmwhite;
	//private final ModelRenderer zeroRightArm4;
	private final ModelRenderer LeftArm;
	private final ModelRenderer LeftArm2;
	private final ModelRenderer LeftArmwhite;
	private final ModelRenderer LeftArmgray;
	
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
	
	public int ZeroMainColor;
	public int ZeroWhiteColor;
	public int ZeroThirdColor;
	public int ZeroGrayColor;
	public int ZeroMainColorDefault;
	public int ZeroWhiteColorDefault;
	public int ZeroThirdColorDefault;
	public int ZeroGrayColorDefault;

	public ifxarmor(float modelSize) {
		super(modelSize);
		texWidth = 60;
		texHeight = 65;
		
		MainColorDefault = 2781423;//Main Body Color X Blue
		SecondaryColorDefault = 5752303;//Secondary Cyan tiel color
		ThirdColorDefault = 16642337; //yellow gold
		WhiteColorDefault = 16777215;//Basic White
		GlowyColorDefault = 16468504;//Glow?Red crystal thingy
		GrayColorDefault = 16777215;//Basic White
		FourthColorDefault = 9614024; //Chest Thingy
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
		FourthColor = FourthColorDefault;
		
		ZeroMainColorDefault = 16711680;//Main Body Color Zero Red
		ZeroThirdColorDefault = 16763151; // Hair
		ZeroWhiteColorDefault = 16777215;//Basic White
		ZeroGrayColorDefault = 16777215;//Basic White
		ZeroMainColor = ZeroMainColorDefault;
		ZeroThirdColor = ZeroThirdColorDefault;
		ZeroWhiteColor = ZeroWhiteColorDefault;
		ZeroGrayColor = ZeroGrayColorDefault;

		Body = new ModelRenderer(this);
		Body.setPos(0.0F, 0.0F, 0.0F);
		Body.texOffs(0, 1).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);

		Body2 = new ModelRenderer(this);
		Body2.setPos(0.0F, 0.0F, 0.0F);
		Body2.texOffs(0, 17).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);

		Body4 = new ModelRenderer(this);
		Body4.setPos(0.0F, 0.0F, 0.0F);
		Body4.texOffs(0, 47).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);

		Bodygray = new ModelRenderer(this);
		Bodygray.setPos(0.0F, 0.0F, 0.0F);
		Bodygray.texOffs(0, 33).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);

		zeroRightArm = new ModelRenderer(this);
		zeroRightArm.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(zeroRightArm, -0.1745F, 0.0F, 0.0F);
		zeroRightArm.texOffs(25, 43).addBox(-5.0F, -3.2019F, -2.0F, 5.0F, 4.0F, 4.0F, 0.8F, false);
		zeroRightArm.texOffs(25, 35).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);

		zeroRightArmblack = new ModelRenderer(this);
		zeroRightArmblack.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(zeroRightArmblack, -0.1745F, 0.0F, 0.0F);
		zeroRightArmblack.texOffs(26, 1).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		zeroRightArmwhite = new ModelRenderer(this);
		zeroRightArmwhite.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(zeroRightArmwhite, -0.1745F, 0.0F, 0.0F);
		zeroRightArmwhite.texOffs(26, 17).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		zeroRightArmwhite.texOffs(25, 51).addBox(-5.0F, -3.2019F, -2.0F, 5.0F, 4.0F, 4.0F, 0.8F, false);
		zeroRightArmwhite.texOffs(27, 58).addBox(-3.0F, 5.6391F, -2.0F, 4.0F, 2.0F, 4.0F, 0.76F, false);

//		zeroRightArm4 = new ModelRenderer(this);
//		zeroRightArm4.setRotationPoint(-5.0F, 2.0F, 0.0F);
//		setRotationAngle(zeroRightArm4, -0.1745F, 0.0F, 0.0F);
//		zeroRightArm4.setTextureOffset(40, 64).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArm, 0.2094F, 0.0F, 0.0F);
		LeftArm.texOffs(44, 1).addBox(0.0F, -2.3974F, -2.0F, 4.0F, 4.0F, 4.0F, 0.8F, false);
		LeftArm.texOffs(44, 25).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);

		LeftArm2 = new ModelRenderer(this);
		LeftArm2.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArm2, 0.2094F, 0.0F, 0.0F);
		LeftArm2.texOffs(44, 9).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		LeftArmwhite = new ModelRenderer(this);
		LeftArmwhite.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmwhite, 0.2094F, 0.0F, 0.0F);
		LeftArmwhite.texOffs(44, 33).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		LeftArmgray = new ModelRenderer(this);
		LeftArmgray.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgray, 0.2094F, 0.0F, 0.0F);
		LeftArmgray.texOffs(44, 49).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
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
		this.Body.copyFrom(this.body);
		Body.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArm.copyFrom(this.leftArm);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
		this.Body2.copyFrom(this.body);
		Body2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArm2.copyFrom(this.leftArm);
		LeftArm2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.FourthColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.FourthColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.FourthColor & 255) / 255.0F;
		this.Body4.copyFrom(this.body);
		Body4.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GrayColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GrayColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GrayColor & 255) / 255.0F;
		this.Bodygray.copyFrom(this.body);
		Bodygray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmgray.copyFrom(this.leftArm);
		LeftArmgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.WhiteColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.WhiteColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.WhiteColor & 255) / 255.0F;
		this.LeftArmwhite.copyFrom(this.leftArm);
		LeftArmwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
	
		fred = (float)( this.ZeroMainColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.ZeroMainColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.ZeroMainColor & 255) / 255.0F;
		this.zeroRightArm.copyFrom(this.rightArm);
		zeroRightArm.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.ZeroGrayColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.ZeroGrayColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.ZeroGrayColor & 255) / 255.0F;
		this.zeroRightArmblack.copyFrom(this.rightArm);
		zeroRightArmblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.ZeroWhiteColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.ZeroWhiteColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.ZeroWhiteColor & 255) / 255.0F;
		this.zeroRightArmwhite.copyFrom(this.rightArm);
		zeroRightArmwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
//		fred = (float)( this.ZeroGrayColor >> 16 & 255) / 255.0F;
//        fgreen = (float)(this.ZeroGrayColor >> 8 & 255) / 255.0F;
//        fblue = (float)(this.ZeroGrayColor & 255) / 255.0F;
//		this.zeroRightArm4.copyModelAngles(this.bipedRightArm);
//		zeroRightArm4.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
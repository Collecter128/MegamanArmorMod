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

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports

@OnlyIn(Dist.CLIENT)
public class ifzeroarmornew extends BipedModel {
	private final ModelRenderer Body;
	private final ModelRenderer Bodygold;
	private final ModelRenderer Bodywhite;
	private final ModelRenderer Bodyglow;
	private final ModelRenderer Bodygray;
	private final ModelRenderer Body2;
	private final ModelRenderer XRightArm;
	private final ModelRenderer XRightArmwhite;
	private final ModelRenderer XRightArmgray;
	private final ModelRenderer XRightArm2;
	private final ModelRenderer LeftArm;
	private final ModelRenderer LeftArmwhite;
	private final ModelRenderer LeftArm2;
	private final ModelRenderer LeftArmgray;
	
	public int MainColor;
	public int SecondaryColor;
	public int WhiteColor;
	public int ThirdColor;
	public int GlowyColor;
	public int GrayColor;
	public int FifthColor;
	public int MainColorDefault;
	public int SecondaryColorDefault;
	public int WhiteColorDefault;
	public int ThirdColorDefault;
	public int GlowyColorDefault;
	public int GrayColorDefault;
	public int FifthColorDefault;
	
	public int XMainColor;
	public int XSecondaryColor;
	public int XWhiteColor;
	public int XGrayColor;
	public int XMainColorDefault;
	public int XSecondaryColorDefault;
	public int XWhiteColorDefault;
	public int XGrayColorDefault;

	public ifzeroarmornew(float modelSize) {
		super(modelSize);
		texWidth = 78;
		texHeight = 79;
		
		MainColorDefault = 16711680;//Main Body Color Zero Red
		SecondaryColorDefault = 2171169;//Secondary black color
		ThirdColorDefault = 16763151; // Hair
		WhiteColorDefault = 16777215;//Basic White
		GlowyColorDefault = 2448340;//Glow? 
		GrayColorDefault = 16777215;//Basic White
		FifthColorDefault = 2935135; //green
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
		FifthColor = FifthColorDefault;
		
		XMainColorDefault = 2781423;//Main Body Color X Blue
		XSecondaryColorDefault = 5752303;//Secondary Cyan tiel color
		XWhiteColorDefault = 16777215;//Basic White
		XGrayColorDefault = 16777215;//Basic White
		XMainColor = XMainColorDefault;
		XSecondaryColor = XSecondaryColorDefault;
		XWhiteColor = XWhiteColorDefault;
		XGrayColor = XGrayColorDefault;

		Body = new ModelRenderer(this);
		Body.setPos(0.0F, 0.0F, 0.0F);
		Body.texOffs(0, 1).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.86F, false);

		Bodygold = new ModelRenderer(this);
		Bodygold.setPos(0.0F, 0.0F, 0.0F);
		Bodygold.texOffs(0, 33).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.86F, false);

		Bodywhite = new ModelRenderer(this);
		Bodywhite.setPos(0.0F, 0.0F, 0.0F);
		Bodywhite.texOffs(0, 49).addBox(-4.0F, -1.0F, -2.0F, 8.0F, 6.0F, 4.0F, 0.86F, false);

		Bodyglow = new ModelRenderer(this);
		Bodyglow.setPos(0.0F, 0.0F, 0.0F);
		Bodyglow.texOffs(0, 17).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.86F, false);

		Bodygray = new ModelRenderer(this);
		Bodygray.setPos(0.0F, -3.0F, 0.0F);
		Bodygray.texOffs(28, 46).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 9.0F, 4.0F, 0.51F, false);

		Body2 = new ModelRenderer(this);
		Body2.setPos(0.0F, -3.0F, 0.0F);
		Body2.texOffs(28, 63).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 9.0F, 4.0F, 0.51F, false);

		XRightArm = new ModelRenderer(this);
		XRightArm.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(XRightArm, -0.1745F, 0.0F, 0.0F);
		XRightArm.texOffs(25, 1).addBox(-4.0F, -3.3755F, -1.5566F, 4.0F, 4.0F, 4.0F, 1.0F, false);
		XRightArm.texOffs(25, 26).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);

		XRightArmwhite = new ModelRenderer(this);
		XRightArmwhite.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(XRightArmwhite, -0.1745F, 0.0F, 0.0F);
		XRightArmwhite.texOffs(43, 17).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		XRightArmgray = new ModelRenderer(this);
		XRightArmgray.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(XRightArmgray, -0.1745F, 0.0F, 0.0F);
		XRightArmgray.texOffs(43, 17).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		XRightArm2 = new ModelRenderer(this);
		XRightArm2.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(XRightArm2, -0.1745F, 0.0F, 0.0F);
		XRightArm2.texOffs(25, 9).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArm, 0.2094F, 0.0F, 0.0F);
		LeftArm.texOffs(60, 9).addBox(0.0F, -3.3755F, -1.5566F, 5.0F, 4.0F, 4.0F, 1.0F, false);
		LeftArm.texOffs(60, 1).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);

		LeftArmwhite = new ModelRenderer(this);
		LeftArmwhite.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmwhite, 0.2094F, 0.0F, 0.0F);
		LeftArmwhite.texOffs(60, 17).addBox(0.0F, -3.3755F, -1.5566F, 5.0F, 4.0F, 4.0F, 1.0F, false);
		LeftArmwhite.texOffs(61, 30).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		LeftArm2 = new ModelRenderer(this);
		LeftArm2.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArm2, 0.2094F, 0.0F, 0.0F);
		LeftArm2.texOffs(43, 1).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		LeftArmgray = new ModelRenderer(this);
		LeftArmgray.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgray, 0.2094F, 0.0F, 0.0F);
		LeftArmgray.texOffs(61, 46).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArmgray.texOffs(42, 38).addBox(-1.0F, 8.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.77F, false);
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
		this.Body.copyFrom(this.body);
		Body.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArm.copyFrom(this.leftArm);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.ThirdColor & 255) / 255.0F;
		this.Bodygold.copyFrom(this.body);
		Bodygold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.WhiteColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.WhiteColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.WhiteColor & 255) / 255.0F;
		this.Bodywhite.copyFrom(this.body);
		Bodywhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmwhite.copyFrom(this.leftArm);
		LeftArmwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.FifthColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.FifthColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.FifthColor & 255) / 255.0F;
		this.Bodyglow.copyFrom(this.body);
		Bodyglow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GrayColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GrayColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GrayColor & 255) / 255.0F;
		this.Bodygray.copyFrom(this.body);
		Bodygray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmgray.copyFrom(this.leftArm);
		LeftArmgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
		this.Body2.copyFrom(this.body);
		Body2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArm2.copyFrom(this.leftArm);
		LeftArm2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		
		fred = (float)( this.XMainColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.XMainColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.XMainColor & 255) / 255.0F;
		this.XRightArm.copyFrom(this.rightArm);
		XRightArm.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.XWhiteColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.XWhiteColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.XWhiteColor & 255) / 255.0F;
		this.XRightArmwhite.copyFrom(this.rightArm);
		XRightArmwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.XGrayColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.XGrayColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.XGrayColor & 255) / 255.0F;
		this.XRightArmgray.copyFrom(this.rightArm);
		XRightArmgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.XSecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.XSecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.XSecondaryColor & 255) / 255.0F;
		this.XRightArm2.copyFrom(this.rightArm);
		XRightArm2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
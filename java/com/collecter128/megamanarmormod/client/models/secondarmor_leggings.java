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
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

@OnlyIn(Dist.CLIENT)
public class secondarmor_leggings extends BipedModel  {
	private final ModelRenderer Body;
	private final ModelRenderer Bodywhite;
	private final ModelRenderer Bodygray;
	private final ModelRenderer Bodyyellow;
	private final ModelRenderer RightLeggray;
	private final ModelRenderer RightLeggsecondary;
	private final ModelRenderer RightLegglow;
	private final ModelRenderer LeftLeggray;
	private final ModelRenderer LeftLegsecondary;
	private final ModelRenderer LeftLegglow;
	
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

	public secondarmor_leggings(float modelSize) {
		super(modelSize);
		texWidth = 101;
		texHeight = 178;
		
		MainColorDefault = 2781423;//Main Body Color X Blue
		SecondaryColorDefault = 5752303;//Secondary Cyan tiel color
		ThirdColorDefault = 16642337; //Yellow Bits
		WhiteColorDefault = 16777215;//Basic White
		GlowyColorDefault = 16468504;//Glow?Red crystal thingy
		GrayColorDefault = 16777215;//Basic White
		FifthColorDefault = 2935135; //green
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
		FifthColor = FifthColorDefault;

		Body = new ModelRenderer(this);
		Body.setPos(0.0F, 0.0F, 0.0F);
		Body.texOffs(65, 152).addBox(-4.0F, 9.0F, -2.0F, 8.0F, 4.0F, 4.0F, 1.2F, false);

		Bodywhite = new ModelRenderer(this);
		Bodywhite.setPos(0.0F, 0.0F, 0.0F);
		Bodywhite.texOffs(16, 156).addBox(-4.0F, 9.0F, -2.0F, 8.0F, 4.0F, 4.0F, 1.2F, false);
		Bodywhite.texOffs(16, 146).addBox(-4.0F, 9.0F, -2.0F, 8.0F, 4.0F, 4.0F, 1.6F, false);

		Bodygray = new ModelRenderer(this);
		Bodygray.setPos(0.0F, 0.0F, 0.0F);
		Bodygray.texOffs(16, 164).addBox(-4.0F, 10.0F, -2.0F, 8.0F, 3.0F, 4.0F, 0.51F, false);

		Bodyyellow = new ModelRenderer(this);
		Bodyyellow.setPos(0.0F, 0.0F, 0.0F);
		Bodyyellow.texOffs(65, 166).addBox(-4.0F, 9.0F, -2.0F, 8.0F, 4.0F, 4.0F, 1.2F, false);

		RightLeggray = new ModelRenderer(this);
		RightLeggray.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeggray, 0.192F, 0.0F, 0.0349F);
		RightLeggray.texOffs(0, 162).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		RightLeggsecondary = new ModelRenderer(this);
		RightLeggsecondary.setPos(-2.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeggsecondary, 0.192F, 0.0F, 0.0349F);
		RightLeggsecondary.texOffs(0, 146).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		RightLegglow = new ModelRenderer(this);
		RightLegglow.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegglow, 0.192F, 0.0F, 0.0349F);
		RightLegglow.texOffs(91, 149).addBox(-0.9994F, 7.2251F, -1.025F, 2.0F, 5.0F, 2.0F, 0.5F, false);

		LeftLeggray = new ModelRenderer(this);
		LeftLeggray.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeggray, -0.1745F, 0.0F, -0.0349F);
		LeftLeggray.texOffs(40, 162).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		LeftLegsecondary = new ModelRenderer(this);
		LeftLegsecondary.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegsecondary, -0.1745F, 0.0F, -0.0349F);
		LeftLegsecondary.texOffs(40, 146).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		LeftLegglow = new ModelRenderer(this);
		LeftLegglow.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegglow, -0.1745F, 0.0F, -0.0349F);
		LeftLegglow.texOffs(91, 156).addBox(-0.9994F, 6.792F, -1.0212F, 2.0F, 5.0F, 2.0F, 0.5F, true);
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
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
		this.RightLeggsecondary.copyFrom(this.rightLeg);
		RightLeggsecondary.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegsecondary.copyFrom(this.leftLeg);
		LeftLegsecondary.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.WhiteColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.WhiteColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.WhiteColor & 255) / 255.0F;
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
		this.Bodyyellow.copyFrom(this.body);
		Bodyyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
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
package com.collecter128.megamanarmormod.client.models;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports

@OnlyIn(Dist.CLIENT)
public class serges_hat extends BipedModel {
	private final ModelRenderer Headskin;
	private final ModelRenderer Headblack;
	private final ModelRenderer Headgreenglow;
	private final ModelRenderer Headgray;
	private final ModelRenderer Headyellow;
	private final ModelRenderer Headglowred;
	
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

	public serges_hat(float modelSize) {
		super(modelSize);
		texWidth = 74;
		texHeight = 216;
		
		MainColorDefault = 1012479;//Main Body Color blue
		SecondaryColorDefault = 16715561;//Secondary red
		ThirdColorDefault = 16766735; //yellow
		WhiteColorDefault = 16777215;//Basic White
		GlowyColorDefault = 16583976;//Glow? red
		GrayColorDefault = 16777215;//Basic White
		FourthColorDefault = 4871268; //Dark Gray
		FifthColorDefault = 3066929; //glow green
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
		FourthColor = FourthColorDefault;
		FifthColor = FifthColorDefault;

		Headskin = new ModelRenderer(this);
		Headskin.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headskin, -0.1047F, 0.0873F, 0.0F);
		Headskin.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);

		Headblack = new ModelRenderer(this);
		Headblack.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headblack, -0.1047F, 0.0873F, 0.0F);
		Headblack.texOffs(33, 0).addBox(-4.0F, -16.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.3F, false);

		Headgreenglow = new ModelRenderer(this);
		Headgreenglow.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headgreenglow, -0.1047F, 0.0873F, 0.0F);
		Headgreenglow.texOffs(34, 166).addBox(-4.0F, -16.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.3F, false);

		Headgray = new ModelRenderer(this);
		Headgray.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headgray, -0.1047F, 0.0873F, 0.0F);
		Headgray.texOffs(0, 183).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headgray.texOffs(44, 58).addBox(5.0F, -5.0F, -1.0F, 1.0F, 3.0F, 3.0F, 1.0F, false);
		Headgray.texOffs(55, 58).addBox(-6.0F, -5.0F, -1.0F, 1.0F, 3.0F, 3.0F, 1.0F, false);
		Headgray.texOffs(2, 76).addBox(-6.5F, -12.9562F, 5.5145F, 13.0F, 9.0F, 0.0F, 0.4F, false);
		Headgray.texOffs(24, 2).addBox(-4.0F, -3.9562F, -5.4855F, 8.0F, 6.0F, 0.0F, 0.4F, false);
		Headgray.texOffs(1, 1).addBox(-1.5F, -0.9562F, -4.4855F, 3.0F, 6.0F, 0.0F, 0.4F, false);

		Headyellow = new ModelRenderer(this);
		Headyellow.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headyellow, -0.1047F, 0.0873F, 0.0F);
		Headyellow.texOffs(0, 151).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headyellow.texOffs(34, 151).addBox(-4.0F, -16.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.3F, false);

		Headglowred = new ModelRenderer(this);
		Headglowred.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headglowred, -0.1047F, 0.0873F, 0.0F);
		Headglowred.texOffs(0, 167).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headglowred.texOffs(42, 53).addBox(4.0F, -4.5F, -0.5F, 1.0F, 2.0F, 2.0F, 1.0F, false);
		Headglowred.texOffs(57, 53).addBox(-5.0F, -4.5F, -0.5F, 1.0F, 2.0F, 2.0F, 1.0F, false);
	}

//	@Override
//	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
//		//previously the render function, render code was moved to a method below
//	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		
		
		this.Headskin.copyFrom(this.head);
		Headskin.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		
		float fred = (float)( this.GrayColor >> 16 & 255) / 255.0F;
		float fgreen = (float)(this.GrayColor >> 8 & 255) / 255.0F;
		float fblue = (float)(this.GrayColor & 255) / 255.0F;
		this.Headgray.copyFrom(this.head);
		Headgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
		fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.ThirdColor & 255) / 255.0F;
		this.Headyellow.copyFrom(this.head);
		Headyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.FourthColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.FourthColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.FourthColor & 255) / 255.0F;
		this.Headblack.copyFrom(this.head);
		Headblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
		this.Headglowred.copyFrom(this.head);
		Headglowred.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.FifthColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.FifthColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.FifthColor & 255) / 255.0F;
		this.Headgreenglow.copyFrom(this.head);
		Headgreenglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
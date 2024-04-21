package com.collecter128.megamanarmormod.client.models;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports

@OnlyIn(Dist.CLIENT)
public class bit_leggings extends BipedModel {
	private final ModelRenderer Bodygold;
	private final ModelRenderer Bodyredglow;
	private final ModelRenderer Bodyorange;
	private final ModelRenderer Bodyred;
	private final ModelRenderer Body_r1;
	private final ModelRenderer Body_r2;
	private final ModelRenderer Bodygray;
	private final ModelRenderer RightLeggray;
	private final ModelRenderer RightLegglow;
	private final ModelRenderer LeftLeggray;
	private final ModelRenderer LeftLegglow;
	
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

	public bit_leggings(float modelSize) {
		super(modelSize);
		texWidth = 79;
		texHeight = 207;
		
		MainColorDefault = 16634376;//Main gold
		SecondaryColorDefault = 16615944;//Secondary orange
		ThirdColorDefault = 14682880; //red
		WhiteColorDefault = 16777215;//Basic White
		GlowyColorDefault = 16714250;//Glow? red
		GrayColorDefault = 12434877;//gray
		FourthColorDefault = 3376639; //blue
		FifthColorDefault = 6411749; //light blue
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
		FourthColor = FourthColorDefault;
		FifthColor = FifthColorDefault;

		Bodygold = new ModelRenderer(this);
		Bodygold.setPos(0.0F, 0.0F, 0.0F);
		Bodygold.texOffs(17, 128).addBox(-4.0F, 10.0F, -2.0F, 8.0F, 3.0F, 4.0F, 1.01F, false);
		Bodygold.texOffs(17, 121).addBox(-4.0F, 10.0F, -2.0F, 8.0F, 2.0F, 4.0F, 1.3F, false);

		Bodyredglow = new ModelRenderer(this);
		Bodyredglow.setPos(0.0F, 0.0F, 0.0F);
		Bodyredglow.texOffs(32, 192).addBox(-1.5F, 8.5F, -3.0F, 3.0F, 3.0F, 1.0F, 0.5F, false);

		Bodyorange = new ModelRenderer(this);
		Bodyorange.setPos(0.0F, 0.0F, 0.0F);
		Bodyorange.texOffs(50, 189).addBox(-4.0F, 10.0F, -2.0F, 8.0F, 2.0F, 4.0F, 1.3F, false);

		Bodyred = new ModelRenderer(this);
		Bodyred.setPos(0.0F, 0.0F, 0.0F);
		

		Body_r1 = new ModelRenderer(this);
		Body_r1.setPos(0.0F, 14.0F, 0.0F);
		Bodyred.addChild(Body_r1);
		setRotationAngle(Body_r1, 0.0F, 0.0F, -0.5236F);
		Body_r1.texOffs(59, 126).addBox(2.0F, 1.0F, -2.0F, 3.0F, 2.0F, 4.0F, 1.3F, false);

		Body_r2 = new ModelRenderer(this);
		Body_r2.setPos(0.0F, 14.0F, 0.0F);
		Bodyred.addChild(Body_r2);
		setRotationAngle(Body_r2, 0.0F, 0.0F, 0.5236F);
		Body_r2.texOffs(59, 121).addBox(-5.0F, 1.0F, -2.0F, 3.0F, 2.0F, 4.0F, 1.3F, false);

		Bodygray = new ModelRenderer(this);
		Bodygray.setPos(0.0F, 0.0F, 0.0F);
		Bodygray.texOffs(17, 135).addBox(-4.0F, 10.0F, -2.0F, 8.0F, 3.0F, 4.0F, 0.51F, false);

		RightLeggray = new ModelRenderer(this);
		RightLeggray.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeggray, 0.192F, 0.0F, 0.0349F);
		RightLeggray.texOffs(1, 126).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		RightLeggray.texOffs(1, 142).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		RightLegglow = new ModelRenderer(this);
		RightLegglow.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegglow, 0.192F, 0.0F, 0.0349F);
		RightLegglow.texOffs(18, 149).addBox(-0.9994F, 7.2251F, -1.025F, 2.0F, 5.0F, 2.0F, 0.5F, false);

		LeftLeggray = new ModelRenderer(this);
		LeftLeggray.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeggray, -0.1745F, 0.0F, -0.0349F);
		LeftLeggray.texOffs(41, 126).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftLeggray.texOffs(41, 142).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		LeftLegglow = new ModelRenderer(this);
		LeftLegglow.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegglow, -0.1745F, 0.0F, -0.0349F);
		LeftLegglow.texOffs(28, 149).addBox(-0.9994F, 6.792F, -1.0212F, 2.0F, 5.0F, 2.0F, 0.5F, true);
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
		this.Bodygold.copyFrom(this.body);
		Bodygold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.ThirdColor & 255) / 255.0F;
		this.Bodyred.copyFrom(this.body);
		Bodyred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
		this.Bodyredglow.copyFrom(this.body);
		Bodyredglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegglow.copyFrom(this.rightLeg);
		RightLegglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegglow.copyFrom(this.leftLeg);
		LeftLegglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
		this.Bodyorange.copyFrom(this.body);
		Bodyorange.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GrayColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GrayColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GrayColor & 255) / 255.0F;
		this.Bodygray.copyFrom(this.body);
		Bodygray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLeggray.copyFrom(this.rightLeg);
		RightLeggray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeggray.copyFrom(this.leftLeg);
		LeftLeggray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
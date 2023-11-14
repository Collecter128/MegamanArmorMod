package com.collecter128.megamanarmormod.client.models;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports

@OnlyIn(Dist.CLIENT)
public class vile_cannon extends BipedModel {
	private final ModelRenderer Bodymainpurple;
	private final ModelRenderer Bodyblue;
	private final ModelRenderer Body_r1;
	private final ModelRenderer Body_r2;
	private final ModelRenderer Bodygreen;
	private final ModelRenderer Body_r3;
	private final ModelRenderer Body_r4;
	private final ModelRenderer Bodysilver;
	private final ModelRenderer Body_r5;
	private final ModelRenderer Body_r6;
	private final ModelRenderer Bodybrown;
	private final ModelRenderer Bodywhite;
	private final ModelRenderer Bodygold;
	private final ModelRenderer Body_r7;
	private final ModelRenderer Body_r8;
	private final ModelRenderer Bodyglow;
	private final ModelRenderer Body_r9;
	private final ModelRenderer Body_r10;
	private final ModelRenderer Body_r11;
	private final ModelRenderer RightArmmain;
	private final ModelRenderer RightArmblack;
	private final ModelRenderer RightArmsilver;
	private final ModelRenderer RightArmwhite;
	private final ModelRenderer RightArmgold;
	private final ModelRenderer RightArmglow;
	private final ModelRenderer LeftArmmain;
	private final ModelRenderer LeftArmblack;
	private final ModelRenderer LeftArmsilver;
	private final ModelRenderer LeftArmwhite;
	private final ModelRenderer LeftArmgold;
	private final ModelRenderer LeftArmglow;
	
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

	public vile_cannon(float modelSize) {
		super(modelSize);
		texWidth = 76;
		texHeight = 198;
		
		MainColorDefault = 8728033;//Main Body Color Purple vile
		SecondaryColorDefault = 5066061;//Secondary Color Vile Black
		WhiteColorDefault = 16777215;//White
		ThirdColorDefault = 16772915;//Gold
		GlowyColorDefault = 16728361;//Glow Red Bits
		GrayColorDefault = 12105912;//Gray
		FourthColorDefault = 3892666;// Blue
		FifthColorDefault = 6470203;// Green
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
		FourthColor = FourthColorDefault;
		FifthColor = FifthColorDefault;

		Bodymainpurple = new ModelRenderer(this);
		Bodymainpurple.setPos(0.0F, 0.0F, 0.0F);
		Bodymainpurple.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);

		Bodyblue = new ModelRenderer(this);
		Bodyblue.setPos(0.0F, 0.0F, 0.0F);
		

		Body_r1 = new ModelRenderer(this);
		Body_r1.setPos(0.0F, 22.0F, 0.0F);
		Bodyblue.addChild(Body_r1);
		setRotationAngle(Body_r1, -0.7418F, 3.1416F, 0.0F);
		Body_r1.texOffs(26, 117).addBox(1.0F, -5.0F, -16.0F, 2.0F, 2.0F, 2.0F, 0.7F, false);
		Body_r1.texOffs(17, 117).addBox(-3.0F, -5.0F, -16.0F, 2.0F, 2.0F, 2.0F, 0.7F, false);

		Body_r2 = new ModelRenderer(this);
		Body_r2.setPos(0.0F, 22.0F, 0.0F);
		Bodyblue.addChild(Body_r2);
		setRotationAngle(Body_r2, 0.0F, 3.1416F, 0.0F);
		Body_r2.texOffs(0, 114).addBox(5.5F, -28.0F, -8.0F, 4.0F, 11.0F, 4.0F, 0.7F, false);
		Body_r2.texOffs(16, 103).addBox(-3.5F, -22.0F, -8.0F, 7.0F, 8.0F, 4.0F, 0.7F, false);

		Bodygreen = new ModelRenderer(this);
		Bodygreen.setPos(0.0F, 0.0F, 0.0F);
		

		Body_r3 = new ModelRenderer(this);
		Body_r3.setPos(0.0F, 22.0F, 0.0F);
		Bodygreen.addChild(Body_r3);
		setRotationAngle(Body_r3, 0.0F, 1.5708F, 0.0F);
		Body_r3.texOffs(31, 178).addBox(-2.5F, -28.0F, -9.5F, 18.0F, 4.0F, 4.0F, 0.5F, false);

		Body_r4 = new ModelRenderer(this);
		Body_r4.setPos(0.0F, 22.0F, 0.0F);
		Bodygreen.addChild(Body_r4);
		setRotationAngle(Body_r4, 0.0F, 3.1416F, 0.0F);
		Body_r4.texOffs(53, 154).addBox(-3.5F, -22.0F, -8.0F, 7.0F, 8.0F, 4.0F, 0.7F, false);

		Bodysilver = new ModelRenderer(this);
		Bodysilver.setPos(0.0F, 0.0F, 0.0F);
		

		Body_r5 = new ModelRenderer(this);
		Body_r5.setPos(0.0F, 22.0F, 0.0F);
		Bodysilver.addChild(Body_r5);
		setRotationAngle(Body_r5, 0.0F, 1.5708F, 0.0F);
		Body_r5.texOffs(31, 130).addBox(-2.5F, -28.0F, -9.5F, 18.0F, 4.0F, 4.0F, 0.5F, false);

		Body_r6 = new ModelRenderer(this);
		Body_r6.setPos(0.0F, 22.0F, 0.0F);
		Bodysilver.addChild(Body_r6);
		setRotationAngle(Body_r6, 0.0F, 3.1416F, 0.0F);
		Body_r6.texOffs(2, 131).addBox(5.5F, -28.0F, -11.0F, 4.0F, 4.0F, 2.0F, 0.5F, false);
		Body_r6.texOffs(0, 139).addBox(5.5F, -28.0F, -8.0F, 4.0F, 11.0F, 4.0F, 0.7F, false);
		Body_r6.texOffs(7, 154).addBox(-3.5F, -22.0F, -8.0F, 7.0F, 8.0F, 4.0F, 0.7F, false);

		Bodybrown = new ModelRenderer(this);
		Bodybrown.setPos(0.0F, 0.0F, 0.0F);
		Bodybrown.texOffs(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);

		Bodywhite = new ModelRenderer(this);
		Bodywhite.setPos(0.0F, 0.0F, 0.0F);
		Bodywhite.texOffs(16, 48).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);

		Bodygold = new ModelRenderer(this);
		Bodygold.setPos(0.0F, 0.0F, 0.0F);
		Bodygold.texOffs(16, 64).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);

		Body_r7 = new ModelRenderer(this);
		Body_r7.setPos(0.0F, 22.0F, 0.0F);
		Bodygold.addChild(Body_r7);
		setRotationAngle(Body_r7, 0.0F, 1.5708F, 0.0F);
		Body_r7.texOffs(31, 139).addBox(-2.5F, -28.0F, -9.5F, 18.0F, 4.0F, 4.0F, 0.5F, false);

		Body_r8 = new ModelRenderer(this);
		Body_r8.setPos(0.0F, 22.0F, 0.0F);
		Bodygold.addChild(Body_r8);
		setRotationAngle(Body_r8, 0.0F, 3.1416F, 0.0F);
		Body_r8.texOffs(30, 154).addBox(-3.5F, -22.0F, -8.0F, 7.0F, 8.0F, 4.0F, 0.7F, false);

		Bodyglow = new ModelRenderer(this);
		Bodyglow.setPos(0.0F, 0.0F, 0.0F);
		Bodyglow.texOffs(16, 80).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);

		Body_r9 = new ModelRenderer(this);
		Body_r9.setPos(0.0F, 22.0F, 0.0F);
		Bodyglow.addChild(Body_r9);
		setRotationAngle(Body_r9, 0.0F, 1.5708F, 0.0F);
		Body_r9.texOffs(54, 122).addBox(13.5F, -27.0F, -8.5F, 2.0F, 2.0F, 2.0F, 0.5F, false);

		Body_r10 = new ModelRenderer(this);
		Body_r10.setPos(0.0F, 22.0F, 0.0F);
		Bodyglow.addChild(Body_r10);
		setRotationAngle(Body_r10, 0.0F, 3.1416F, 0.0F);
		Body_r10.texOffs(20, 143).addBox(5.5F, -28.0F, -11.0F, 4.0F, 4.0F, 2.0F, 0.5F, false);
		Body_r10.texOffs(4, 181).addBox(-3.5F, -22.0F, -8.0F, 7.0F, 8.0F, 4.0F, 0.7F, false);

		Body_r11 = new ModelRenderer(this);
		Body_r11.setPos(0.0F, 22.0F, 0.0F);
		Bodyglow.addChild(Body_r11);
		setRotationAngle(Body_r11, -0.7418F, 3.1416F, 0.0F);
		Body_r11.texOffs(26, 124).addBox(1.0F, -3.0F, -16.0F, 2.0F, 2.0F, 2.0F, 0.7F, false);
		Body_r11.texOffs(17, 124).addBox(-3.0F, -3.0F, -16.0F, 2.0F, 2.0F, 2.0F, 0.7F, false);

		RightArmmain = new ModelRenderer(this);
		RightArmmain.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmmain, -0.1745F, 0.0F, 0.0F);
		RightArmmain.texOffs(40, 24).addBox(-5.0F, -3.2019F, -2.0F, 5.0F, 4.0F, 4.0F, 0.8F, false);
		RightArmmain.texOffs(40, 55).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);

		RightArmblack = new ModelRenderer(this);
		RightArmblack.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmblack, -0.1745F, 0.0F, 0.0F);
		RightArmblack.texOffs(40, 39).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		RightArmsilver = new ModelRenderer(this);
		RightArmsilver.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmsilver, -0.1745F, 0.0F, 0.0F);
		RightArmsilver.texOffs(40, 63).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		RightArmwhite = new ModelRenderer(this);
		RightArmwhite.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmwhite, -0.1745F, 0.0F, 0.0F);
		RightArmwhite.texOffs(40, 79).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		RightArmgold = new ModelRenderer(this);
		RightArmgold.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmgold, -0.1745F, 0.0F, 0.0F);
		RightArmgold.texOffs(40, 16).addBox(-5.0F, -3.2019F, -2.0F, 5.0F, 4.0F, 4.0F, 0.8F, false);

		RightArmglow = new ModelRenderer(this);
		RightArmglow.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmglow, -0.1745F, 0.0F, 0.0F);
		RightArmglow.texOffs(40, 31).addBox(-5.0F, -3.2019F, -2.0F, 5.0F, 4.0F, 4.0F, 0.8F, false);

		LeftArmmain = new ModelRenderer(this);
		LeftArmmain.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmmain, 0.2094F, 0.0F, 0.0F);
		LeftArmmain.texOffs(58, 24).addBox(-1.0F, -2.3974F, -2.0F, 5.0F, 4.0F, 4.0F, 0.8F, false);
		LeftArmmain.texOffs(58, 55).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);

		LeftArmblack = new ModelRenderer(this);
		LeftArmblack.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmblack, 0.2094F, 0.0F, 0.0F);
		LeftArmblack.texOffs(58, 39).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		LeftArmsilver = new ModelRenderer(this);
		LeftArmsilver.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmsilver, 0.2094F, 0.0F, 0.0F);
		LeftArmsilver.texOffs(58, 63).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		LeftArmwhite = new ModelRenderer(this);
		LeftArmwhite.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmwhite, 0.2094F, 0.0F, 0.0F);
		LeftArmwhite.texOffs(58, 79).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		LeftArmgold = new ModelRenderer(this);
		LeftArmgold.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgold, 0.2094F, 0.0F, 0.0F);
		LeftArmgold.texOffs(58, 16).addBox(-1.0F, -2.3974F, -2.0F, 5.0F, 4.0F, 4.0F, 0.8F, false);

		LeftArmglow = new ModelRenderer(this);
		LeftArmglow.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmglow, 0.2094F, 0.0F, 0.0F);
		LeftArmglow.texOffs(58, 31).addBox(-1.0F, -2.3974F, -2.0F, 5.0F, 4.0F, 4.0F, 0.8F, false);
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
		this.Bodymainpurple.copyFrom(this.body);
		Bodymainpurple.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmmain.copyFrom(this.rightArm);
		RightArmmain.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmmain.copyFrom(this.leftArm);
		LeftArmmain.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.FourthColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.FourthColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.FourthColor & 255) / 255.0F;
		this.Bodyblue.copyFrom(this.body);
		Bodyblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.FifthColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.FifthColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.FifthColor & 255) / 255.0F;
		this.Bodygreen.copyFrom(this.body);
		Bodygreen.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GrayColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GrayColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GrayColor & 255) / 255.0F;
		this.Bodysilver.copyFrom(this.body);
		Bodysilver.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmsilver.copyFrom(this.rightArm);
		RightArmsilver.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmsilver.copyFrom(this.leftArm);
		LeftArmsilver.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		
		this.Bodybrown.copyFrom(this.body);
		Bodybrown.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		
		fred = (float)( this.WhiteColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.WhiteColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.WhiteColor & 255) / 255.0F;
		this.Bodywhite.copyFrom(this.body);
		Bodywhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmwhite.copyFrom(this.rightArm);
		RightArmwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmwhite.copyFrom(this.leftArm);
		LeftArmwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.ThirdColor & 255) / 255.0F;
		this.Bodygold.copyFrom(this.body);
		Bodygold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmgold.copyFrom(this.rightArm);
		RightArmgold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmgold.copyFrom(this.leftArm);
		LeftArmgold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
		this.Bodyglow.copyFrom(this.body);
		Bodyglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmglow.copyFrom(this.rightArm);
		RightArmglow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmglow.copyFrom(this.leftArm);
		LeftArmglow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
		this.RightArmblack.copyFrom(this.rightArm);
		RightArmblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmblack.copyFrom(this.leftArm);
		LeftArmblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
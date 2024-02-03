package com.collecter128.megamanarmormod.client.models;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports

@OnlyIn(Dist.CLIENT)
public class zeroixarmor extends BipedModel  {
	private final ModelRenderer Bodyred;
	private final ModelRenderer Bodywhite;
	private final ModelRenderer Bodygold;
	private final ModelRenderer Bodyglowgreen;
	private final ModelRenderer Bodysecondary;
	private final ModelRenderer Bodygray;
	private final ModelRenderer RightArmred;
	private final ModelRenderer RightArmgreenish;
	private final ModelRenderer RightArmwhite;
	private final ModelRenderer RightArmwhiteclear;
	private final ModelRenderer RightArmgray;
	private final ModelRenderer RightArmglowblue;
	private final ModelRenderer RightArmsecondary;
	private final ModelRenderer LeftArmred;
	private final ModelRenderer LeftArmgreenish;
	private final ModelRenderer LeftArmwhite;
	private final ModelRenderer LeftArmwhiteclear;
	private final ModelRenderer LeftArmgray;
	private final ModelRenderer LeftArmblueglow;
	private final ModelRenderer LeftArmsecondary;
	
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

	public zeroixarmor(float modelSize, EquipmentSlotType slot) {
		super(modelSize);
		texWidth = 105;
		texHeight = 195;
		
		MainColorDefault = 16711680;//Main Body Color Zero Red
		SecondaryColorDefault = 2171169;//Secondary Black
		ThirdColorDefault = 16763151; // Hair
		WhiteColorDefault = 16777215;//Basic White
		GlowyColorDefault = 2448340;//Glow? 
		GrayColorDefault = 16777215;//Basic White
		FourthColorDefault = 1420413; //Greenish shoulders
		FifthColorDefault = 2935135; //green
		
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
		FourthColor = FourthColorDefault;
		FifthColor = FifthColorDefault;

		Bodyred = new ModelRenderer(this);
		Bodyred.setPos(0.0F, 0.0F, 0.0F);
		Bodyred.texOffs(16, 20).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.86F, false);

		Bodywhite = new ModelRenderer(this);
		Bodywhite.setPos(0.0F, 0.0F, 0.0F);
		Bodywhite.texOffs(16, 68).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.86F, false);

		Bodygold = new ModelRenderer(this);
		Bodygold.setPos(0.0F, 0.0F, 0.0F);
		Bodygold.texOffs(16, 52).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.86F, false);

		Bodyglowgreen = new ModelRenderer(this);
		Bodyglowgreen.setPos(0.0F, 0.0F, 0.0F);
		Bodyglowgreen.texOffs(16, 36).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.86F, false);

		Bodysecondary = new ModelRenderer(this);
		Bodysecondary.setPos(0.0F, 0.0F, 0.0F);
		Bodysecondary.texOffs(16, 84).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);

		Bodygray = new ModelRenderer(this);
		Bodygray.setPos(0.0F, 0.0F, 0.0F);
		Bodygray.texOffs(37, 163).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);

		RightArmred = new ModelRenderer(this);
		RightArmred.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmred, -0.1745F, 0.0F, 0.0F);
		RightArmred.texOffs(75, 20).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);

		RightArmgreenish = new ModelRenderer(this);
		RightArmgreenish.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmgreenish, -0.1745F, 0.0F, 0.0F);
		RightArmgreenish.texOffs(75, 28).addBox(-5.0F, -2.8F, -1.5566F, 5.0F, 4.0F, 4.0F, 1.0F, false);
		RightArmgreenish.texOffs(64, 167).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		RightArmwhite = new ModelRenderer(this);
		RightArmwhite.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmwhite, -0.1745F, 0.0F, 0.0F);
		RightArmwhite.texOffs(40, 36).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		RightArmwhiteclear = new ModelRenderer(this);
		RightArmwhiteclear.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmwhiteclear, -0.1745F, 0.0F, 0.0F);
		RightArmwhiteclear.texOffs(76, 36).addBox(-4.0F, -4.8F, -1.5566F, 3.0F, 3.0F, 4.0F, 1.0F, false);

		RightArmgray = new ModelRenderer(this);
		RightArmgray.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmgray, -0.1745F, 0.0F, 0.0F);
		RightArmgray.texOffs(77, 113).addBox(-3.0F, 8.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.77F, false);
		RightArmgray.texOffs(96, 33).addBox(-2.0F, -0.8F, -2.5566F, 2.0F, 2.0F, 1.0F, 0.5F, false);
		RightArmgray.texOffs(96, 42).addBox(-2.0F, -0.8F, 2.4434F, 2.0F, 2.0F, 1.0F, 0.5F, false);

		RightArmglowblue = new ModelRenderer(this);
		RightArmglowblue.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmglowblue, -0.1745F, 0.0F, 0.0F);
		RightArmglowblue.texOffs(96, 37).addBox(-2.0F, -0.8F, -2.5566F, 2.0F, 2.0F, 1.0F, 0.5F, false);
		RightArmglowblue.texOffs(96, 46).addBox(-2.0F, -0.8F, 2.4434F, 2.0F, 2.0F, 1.0F, 0.5F, false);

		RightArmsecondary = new ModelRenderer(this);
		RightArmsecondary.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmsecondary, -0.1745F, 0.0F, 0.0F);
		RightArmsecondary.texOffs(40, 20).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		LeftArmred = new ModelRenderer(this);
		LeftArmred.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmred, 0.2094F, 0.0F, 0.0F);
		LeftArmred.texOffs(75, 45).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);

		LeftArmgreenish = new ModelRenderer(this);
		LeftArmgreenish.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgreenish, 0.2094F, 0.0F, 0.0F);
		LeftArmgreenish.texOffs(75, 53).addBox(0.0F, -2.8F, -1.5566F, 5.0F, 4.0F, 4.0F, 1.0F, false);
		LeftArmgreenish.texOffs(82, 167).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		LeftArmwhite = new ModelRenderer(this);
		LeftArmwhite.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmwhite, 0.2094F, 0.0F, 0.0F);
		LeftArmwhite.texOffs(59, 36).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		LeftArmwhiteclear = new ModelRenderer(this);
		LeftArmwhiteclear.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmwhiteclear, 0.2094F, 0.0F, 0.0F);
		LeftArmwhiteclear.texOffs(76, 61).addBox(1.0F, -4.8F, -1.5566F, 3.0F, 3.0F, 4.0F, 1.0F, false);

		LeftArmgray = new ModelRenderer(this);
		LeftArmgray.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgray, 0.2094F, 0.0F, 0.0F);
		LeftArmgray.texOffs(77, 120).addBox(-1.0F, 8.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.77F, false);
		LeftArmgray.texOffs(96, 57).addBox(0.0F, -0.8F, -2.5566F, 2.0F, 2.0F, 1.0F, 0.5F, false);
		LeftArmgray.texOffs(96, 65).addBox(0.0F, -0.8F, 2.4434F, 2.0F, 2.0F, 1.0F, 0.5F, false);

		LeftArmblueglow = new ModelRenderer(this);
		LeftArmblueglow.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmblueglow, 0.2094F, 0.0F, 0.0F);
		LeftArmblueglow.texOffs(96, 61).addBox(0.0F, -0.8F, -2.5566F, 2.0F, 2.0F, 1.0F, 0.5F, false);
		LeftArmblueglow.texOffs(96, 69).addBox(0.0F, -0.8F, 2.4434F, 2.0F, 2.0F, 1.0F, 0.5F, false);

		LeftArmsecondary = new ModelRenderer(this);
		LeftArmsecondary.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmsecondary, 0.2094F, 0.0F, 0.0F);
		LeftArmsecondary.texOffs(59, 20).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
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
		this.Bodyred.copyFrom(this.body);
		Bodyred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmred.copyFrom(this.rightArm);
		RightArmred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmred.copyFrom(this.leftArm);
		LeftArmred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.ThirdColor & 255) / 255.0F;
		this.Bodygold.copyFrom(this.body);
		Bodygold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.FifthColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.FifthColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.FifthColor & 255) / 255.0F;
		this.Bodyglowgreen.copyFrom(this.body);
		Bodyglowgreen.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
		this.Bodysecondary.copyFrom(this.body);
		Bodysecondary.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmsecondary.copyFrom(this.rightArm);
		RightArmsecondary.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmsecondary.copyFrom(this.leftArm);
		LeftArmsecondary.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GrayColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GrayColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GrayColor & 255) / 255.0F;
		this.Bodygray.copyFrom(this.body);
		Bodygray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmgray.copyFrom(this.rightArm);
		RightArmgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmgray.copyFrom(this.leftArm);
		LeftArmgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.FourthColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.FourthColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.FourthColor & 255) / 255.0F;
		this.RightArmgreenish.copyFrom(this.rightArm);
		RightArmgreenish.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmgreenish.copyFrom(this.leftArm);
		LeftArmgreenish.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
		this.RightArmglowblue.copyFrom(this.rightArm);
		RightArmglowblue.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmblueglow.copyFrom(this.leftArm);
		LeftArmblueglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.WhiteColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.WhiteColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.WhiteColor & 255) / 255.0F;
		this.Bodywhite.copyFrom(this.body);
		Bodywhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmwhite.copyFrom(this.rightArm);
		RightArmwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmwhite.copyFrom(this.leftArm);
		LeftArmwhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		buffer = Minecraft.getInstance().renderBuffers().bufferSource().getBuffer(RenderType.entityTranslucent(new ResourceLocation(
				"megamanarmormod:textures/armor/zeroarmorix.png")));
		
		this.RightArmwhiteclear.copyFrom(this.rightArm);
		RightArmwhiteclear.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmwhiteclear.copyFrom(this.leftArm);
		LeftArmwhiteclear.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
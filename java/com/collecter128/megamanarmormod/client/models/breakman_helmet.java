package com.collecter128.megamanarmormod.client.models;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.inventory.EquipmentSlotType;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class breakman_helmet extends BipedModel {
	private final ModelRenderer Head;
	private final ModelRenderer Head2;
	private final ModelRenderer Head3_r1;
	private final ModelRenderer Head3_r2;
	private final ModelRenderer Head3;
	private final ModelRenderer Head4;
	private final ModelRenderer Headglow;
	
	public int MainColor;
	public int SecondaryColor;
	public int WhiteColor;
	public int ThirdColor;
	public int GlowyColor;
	public int GrayColor;
	public int MainColorDefault;
	public int SecondaryColorDefault;
	public int WhiteColorDefault;
	public int ThirdColorDefault;
	public int GlowyColorDefault;
	public int GrayColorDefault;

	public breakman_helmet(float modelSize) {
		super(modelSize);
		textureWidth = 68;
		textureHeight = 41;
		
		//Default is protoman armor color
		MainColorDefault = 16740644;//Main Body Color Protoman orangishRed
		SecondaryColorDefault = 9737364;//Secondary Color black?
		WhiteColorDefault = 15855562;
		ThirdColorDefault = 16765460;//Scarf
		GlowyColorDefault = 2359060;//Glow Green Bits
		GrayColorDefault = 12105912;
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(Head, -0.1047F, 0.0873F, 0.0F);
		Head.setTextureOffset(0, 0).addBox(-3.9128F, -7.8959F, -4.9907F, 8.0F, 8.0F, 9.0F, 1.0F, false);
		Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Head.setTextureOffset(28, 32).addBox(-5.5F, -7.8264F, -5.3064F, 11.0F, 9.0F, 0.0F, 0.1F, false);

		Head2 = new ModelRenderer(this);
		Head2.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(Head2, -0.1047F, 0.0873F, 0.0F);
		Head2.setTextureOffset(28, 25).addBox(-5.5F, -8.8045F, -5.5244F, 11.0F, 6.0F, 0.0F, 0.1F, false);
		Head2.setTextureOffset(13, 17).addBox(5.4F, -3.9451F, -0.5752F, 1.0F, 3.0F, 3.0F, 0.5F, false);
		Head2.setTextureOffset(3, 17).addBox(-5.981F, -3.9489F, -0.538F, 1.0F, 3.0F, 3.0F, 0.5F, false);
		Head2.setTextureOffset(3, 32).addBox(-4.0F, -4.3069F, -1.1323F, 8.0F, 3.0F, 3.0F, 0.9F, false);

		Head3_r1 = new ModelRenderer(this);
		Head3_r1.setRotationPoint(-1.0F, 3.0F, 0.0F);
		Head2.addChild(Head3_r1);
		setRotationAngle(Head3_r1, 0.3491F, -0.2618F, 0.0F);
		Head3_r1.setTextureOffset(39, 32).addBox(-5.0925F, -6.339F, -2.4463F, 1.0F, 3.0F, 5.0F, 0.2F, false);

		Head3_r2 = new ModelRenderer(this);
		Head3_r2.setRotationPoint(1.0F, 3.0F, 0.0F);
		Head2.addChild(Head3_r2);
		setRotationAngle(Head3_r2, 0.3491F, 0.2618F, 0.0F);
		Head3_r2.setTextureOffset(52, 32).addBox(4.0945F, -6.3396F, -2.4464F, 1.0F, 3.0F, 5.0F, 0.2F, false);
		
		Head3 = new ModelRenderer(this);
		Head3.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(Head3, -0.1047F, 0.0873F, 0.0F);
		Head3.setTextureOffset(34, 0).addBox(-3.6706F, -7.6327F, -3.8533F, 8.0F, 7.0F, 8.0F, 0.55F, false);

		Head4 = new ModelRenderer(this);
		Head4.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(Head4, -0.1047F, 0.0873F, 0.0F);
		Head4.setTextureOffset(28, 17).addBox(-5.5F, -8.8099F, -5.4199F, 11.0F, 7.0F, 0.0F, 0.1F, false);

		Headglow = new ModelRenderer(this);
		Headglow.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headglow, -0.1047F, 0.0873F, 0.0F);
		Headglow.setTextureOffset(3, 25).addBox(-4.0F, -4.3069F, -1.1323F, 8.0F, 3.0F, 3.0F, 1.0F, false);
		Headglow.setTextureOffset(44, 24).addBox(-5.5F, -8.8099F, -5.4199F, 11.0F, 7.0F, 0.0F, 0.1F, false);
	}

//	@Override
//	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
//		//previously the render function, render code was moved to a method below
//	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		
		float fred = (float)( this.MainColor >> 16 & 255) / 255.0F;
        float fgreen = (float)(this.MainColor >> 8 & 255) / 255.0F;
        float fblue = (float)(this.MainColor & 255) / 255.0F;
        this.Head.copyModelAngles(this.bipedHead);
		Head.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
    	fred = (float)( this.WhiteColor >> 16 & 255) / 255.0F;
    	fgreen = (float)(this.WhiteColor >> 8 & 255) / 255.0F;
    	fblue = (float)(this.WhiteColor & 255) / 255.0F;
		this.Head2.copyModelAngles(this.bipedHead);
		Head2.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GrayColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GrayColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GrayColor & 255) / 255.0F;
		this.Head3.copyModelAngles(this.bipedHead);
		Head3.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
		this.Head4.copyModelAngles(this.bipedHead);
		Head4.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
		this.Headglow.copyModelAngles(this.bipedHead);
		Headglow.render(matrixStack, buffer, 15728640, packedOverlay, fred, fgreen, fblue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
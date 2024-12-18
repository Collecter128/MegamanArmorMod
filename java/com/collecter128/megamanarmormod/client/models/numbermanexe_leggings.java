package com.collecter128.megamanarmormod.client.models;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports

@OnlyIn(Dist.CLIENT)
public class numbermanexe_leggings extends BipedModel {
	private final ModelRenderer Bodycream;
	private final ModelRenderer Bodyorange;
	private final ModelRenderer RightLegcream;
	private final ModelRenderer LeftLegcream;
	
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

	public numbermanexe_leggings(float modelSize) {
		super(modelSize);
		texWidth = 74;
		texHeight = 167;
		
	MainColorDefault = 10091319;//Main Green
		//DS 7877055
		//Sp 1040384
	SecondaryColorDefault = 14532503;//Secondary Cream
		//DS 9689008
		//Sp 13752399
	ThirdColorDefault = 16600343; //Orange parts
		//DS 15807117
		//Sp 16056384
	WhiteColorDefault = 12305609;//Slightly Blue, mostly white
		//DS 11908533
		//Sp 13422731
	GlowyColorDefault = 16635947;//Glow? Yellow
		//DS 5439464
		//Sp 16772946
	GrayColorDefault = 11579568;//gray
		//DS 9868950
		//Sp 9868950
	FourthColorDefault = 6710886; //Black
		//DS 6710886
		//Sp 7039314
	FifthColorDefault = 16635947; //yellow
		//DS 5439464
		//Sp 16772946
	MainColor = MainColorDefault;
	SecondaryColor = SecondaryColorDefault;
	ThirdColor = ThirdColorDefault;
	WhiteColor = WhiteColorDefault;
	GlowyColor = GlowyColorDefault;
	GrayColor = GrayColorDefault;
	FourthColor = FourthColorDefault;
	FifthColor = FifthColorDefault;

		Bodycream = new ModelRenderer(this);
		Bodycream.setPos(0.0F, 0.0F, 0.0F);
		Bodycream.texOffs(16, 101).addBox(-4.0F, 9.0F, -2.0F, 8.0F, 3.0F, 4.0F, 0.51F, false);

		Bodyorange = new ModelRenderer(this);
		Bodyorange.setPos(0.0F, 0.0F, 0.0F);
		Bodyorange.texOffs(16, 109).addBox(-4.0F, 9.0F, -2.0F, 8.0F, 3.0F, 4.0F, 0.51F, false);

		RightLegcream = new ModelRenderer(this);
		RightLegcream.setPos(-2.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegcream, 0.192F, 0.0F, 0.0349F);
		RightLegcream.texOffs(0, 100).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		LeftLegcream = new ModelRenderer(this);
		LeftLegcream.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegcream, -0.1745F, 0.0F, -0.0349F);
		LeftLegcream.texOffs(40, 100).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
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
		this.Bodycream.copyFrom(this.body);
		Bodycream.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegcream.copyFrom(this.rightLeg);
		RightLegcream.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegcream.copyFrom(this.leftLeg);
		LeftLegcream.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.ThirdColor & 255) / 255.0F;
		this.Bodyorange.copyFrom(this.body);
		Bodyorange.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
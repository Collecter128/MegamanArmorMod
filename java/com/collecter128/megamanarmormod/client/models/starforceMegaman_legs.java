package com.collecter128.megamanarmormod.client.models;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports

@OnlyIn(Dist.CLIENT)
public class starforceMegaman_legs extends BipedModel {
	private final ModelRenderer Bodydarkblue;
	private final ModelRenderer Bodygold;
	private final ModelRenderer Rightdarkblue;
	private final ModelRenderer RightLeggold;
	private final ModelRenderer LeftLegdarkblue;
	private final ModelRenderer LeftLeggold;
	
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

	public starforceMegaman_legs(float modelSize) {
		super(modelSize);
		texWidth = 78;
		texHeight = 242;
		
		MainColorDefault = 708351;//Main Body Color light blue
		SecondaryColorDefault = 4013982;//Secondary dark blue
		ThirdColorDefault = 16771133; //gold
		WhiteColorDefault = 16777215;//Basic White
		GlowyColorDefault = 16727060;//Glow? red
		GrayColorDefault = 13619151;//gray
		FourthColorDefault = 4091380; //blue
		
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
		FourthColor = FourthColorDefault;

		Bodydarkblue = new ModelRenderer(this);
		Bodydarkblue.setPos(0.0F, 0.0F, 0.0F);
		Bodydarkblue.texOffs(16, 119).addBox(-4.0F, 8.0F, -2.0F, 8.0F, 3.0F, 4.0F, 0.61F, false);

		Bodygold = new ModelRenderer(this);
		Bodygold.setPos(0.0F, 0.0F, 0.0F);
		Bodygold.texOffs(16, 208).addBox(-4.0F, 8.0F, -2.0F, 8.0F, 3.0F, 4.0F, 0.61F, false);

		Rightdarkblue = new ModelRenderer(this);
		Rightdarkblue.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(Rightdarkblue, 0.192F, 0.0F, 0.0349F);
		Rightdarkblue.texOffs(0, 118).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		RightLeggold = new ModelRenderer(this);
		RightLeggold.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeggold, 0.192F, 0.0F, 0.0349F);
		RightLeggold.texOffs(0, 207).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		LeftLegdarkblue = new ModelRenderer(this);
		LeftLegdarkblue.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegdarkblue, -0.1745F, 0.0F, -0.0349F);
		LeftLegdarkblue.texOffs(40, 118).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		LeftLeggold = new ModelRenderer(this);
		LeftLeggold.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeggold, -0.1745F, 0.0F, -0.0349F);
		LeftLeggold.texOffs(40, 207).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
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
		this.Bodydarkblue.copyFrom(this.body);
		Bodydarkblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Rightdarkblue.copyFrom(this.rightLeg);
		Rightdarkblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegdarkblue.copyFrom(this.leftLeg);
		LeftLegdarkblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.ThirdColor & 255) / 255.0F;
		this.Bodygold.copyFrom(this.body);
		Bodygold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLeggold.copyFrom(this.rightLeg);
		RightLeggold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeggold.copyFrom(this.leftLeg);
		LeftLeggold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
package com.collecter128.megamanarmormod.client.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

@OnlyIn(Dist.CLIENT)
public class rockmanShadow extends BipedModel {
	private final ModelRenderer Head1;
	private final ModelRenderer HeadOrange;
	private final ModelRenderer Headlightgray;
	private final ModelRenderer Headlightgray_r1;
	private final ModelRenderer Headglow;
	private final ModelRenderer Headlightgray_r2;
	private final ModelRenderer HeadYellow;
	private final ModelRenderer Headvisor;
	
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

	public rockmanShadow(float modelSize) {
		super(modelSize);
		texWidth = 76;
		texHeight = 38;
		
		MainColorDefault = 3709250;//Main Body Color quint green
		SecondaryColorDefault = 10413478;//Secondary quintlight green
		ThirdColorDefault = 16755768; //Orange parts
		WhiteColorDefault = 16777215;//Basic White
		GlowyColorDefault = 16764984;//Glow? yellow color
		GrayColorDefault = 12105912;//Kinda Blue
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;

		Head1 = new ModelRenderer(this);
		Head1.setPos(0.0F, 0.0F, 0.0F);
		Head1.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);

		HeadOrange = new ModelRenderer(this);
		HeadOrange.setPos(0.0F, 0.0F, 0.0F);
		HeadOrange.texOffs(0, 16).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);

		Headlightgray = new ModelRenderer(this);
		Headlightgray.setPos(0.0F, 0.0F, 0.0F);
		Headlightgray.texOffs(32, 1).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 7.0F, 8.0F, 0.75F, false);
		Headlightgray.texOffs(47, 22).addBox(5.0643F, -7.9451F, -0.5752F, 1.0F, 7.0F, 3.0F, 0.5F, false);
		Headlightgray.texOffs(37, 22).addBox(-5.8938F, -7.8448F, -0.5287F, 1.0F, 7.0F, 3.0F, 0.5F, false);

		Headlightgray_r1 = new ModelRenderer(this);
		Headlightgray_r1.setPos(0.0F, 24.0F, 0.0F);
		Headlightgray.addChild(Headlightgray_r1);
		setRotationAngle(Headlightgray_r1, -1.5708F, 0.0F, 0.0F);
		Headlightgray_r1.texOffs(60, 19).addBox(-2.5F, -2.0F, -34.0F, 5.0F, 5.0F, 1.0F, 0.75F, false);

		Headglow = new ModelRenderer(this);
		Headglow.setPos(0.0F, 0.0F, 0.0F);
		

		Headlightgray_r2 = new ModelRenderer(this);
		Headlightgray_r2.setPos(0.0F, 24.0F, 0.0F);
		Headglow.addChild(Headlightgray_r2);
		setRotationAngle(Headlightgray_r2, -1.5708F, 0.0F, 0.0F);
		Headlightgray_r2.texOffs(65, 11).addBox(-2.0F, -1.5F, -33.0F, 4.0F, 4.0F, 0.0F, 0.75F, false);

		HeadYellow = new ModelRenderer(this);
		HeadYellow.setPos(0.0F, 0.0F, 0.0F);
		HeadYellow.texOffs(57, 1).addBox(-4.5F, -11.4829F, -5.54F, 9.0F, 7.0F, 0.0F, 0.25F, false);

		Headvisor = new ModelRenderer(this);
		Headvisor.setPos(0.0F, 0.0F, 0.0F);
		Headvisor.texOffs(56, 27).addBox(-4.0F, -6.5F, -4.5F, 8.0F, 4.0F, 1.0F, 0.25F, false);
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
		this.Head1.copyFrom(this.head);
		Head1.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.ThirdColor & 255) / 255.0F;
		this.HeadOrange.copyFrom(this.head);
		HeadOrange.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GrayColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GrayColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GrayColor & 255) / 255.0F;
		this.Headlightgray.copyFrom(this.head);
		Headlightgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
		this.Headglow.copyFrom(this.head);
		Headglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		
		
		this.HeadYellow.copyFrom(this.head);
		HeadYellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		buffer = Minecraft.getInstance().renderBuffers().bufferSource().getBuffer(RenderType.entityTranslucent(new ResourceLocation(
				"megamanarmormod:textures/armor/rockmanshadowhelmet.png")));
		this.Headvisor.copyFrom(this.head);
		Headvisor.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
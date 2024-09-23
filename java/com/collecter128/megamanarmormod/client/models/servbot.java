package com.collecter128.megamanarmormod.client.models;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class servbot extends BipedModel {
	private final ModelRenderer Headyellow;
	private final ModelRenderer Headwhiteeyes;
	private final ModelRenderer Headblackeyes;
	private final ModelRenderer Headredmouth;
	private final ModelRenderer Headgray;
	private final ModelRenderer Bodyblue;
	private final ModelRenderer Bodyyellow;
	private final ModelRenderer Bodygray;
	private final ModelRenderer RightArmdarkblue;
	private final ModelRenderer RightArmlightblue;
	private final ModelRenderer RightArmyellow;
	private final ModelRenderer RightArmgray;
	private final ModelRenderer LeftArmDarkBlue;
	private final ModelRenderer LeftArmLightBlue;
	private final ModelRenderer LeftArmyellow;
	private final ModelRenderer LeftArmgray;
	private final ModelRenderer RightLegdarkblue;
	private final ModelRenderer RightLeglightblue;
	private final ModelRenderer LeftLegdarkblue;
	private final ModelRenderer LeftLeglightblue;
	
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
	
	EquipmentSlotType equipmentslot;

	public servbot(float modelSize, EquipmentSlotType slot) {
		super(modelSize);
		texWidth = 75;
		texHeight = 148;
		
		equipmentslot = slot;
		
		MainColorDefault = 2913020;//Main Body Color Dark Blue
		SecondaryColorDefault = 9431294;//Secondary LightBlue
		ThirdColorDefault = 16771123; //Yellow parts
		WhiteColorDefault = 16777215;//Basic White
		GlowyColorDefault = 16726579;//Glow? red not used
		GrayColorDefault = 9737364;//Gray
		FourthColorDefault = 9737364; //Not Used Gray 
		FifthColorDefault = 16729897; //Red
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
		FourthColor = FourthColorDefault;
		FifthColor = FifthColorDefault;

		Headyellow = new ModelRenderer(this);
		Headyellow.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headyellow.texOffs(0, 0).addBox(-4.5F, -8.0F, -4.5F, 9.0F, 8.0F, 9.0F, 1.0F, false);
		}
		
		Headwhiteeyes = new ModelRenderer(this);
		Headwhiteeyes.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headwhiteeyes.texOffs(36, 6).addBox(-4.5F, -7.0F, -6.0F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		Headwhiteeyes.texOffs(46, 6).addBox(0.5F, -7.0F, -6.0F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		}
		
		Headblackeyes = new ModelRenderer(this);
		Headblackeyes.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headblackeyes.texOffs(36, 72).addBox(-4.5F, -7.0F, -6.0F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		Headblackeyes.texOffs(46, 72).addBox(0.5F, -7.0F, -6.0F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		}
		
		Headredmouth = new ModelRenderer(this);
		Headredmouth.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headredmouth.texOffs(0, 66).addBox(-4.5F, -8.0F, -4.5F, 9.0F, 8.0F, 9.0F, 1.0F, false);
		}
		
		Headgray = new ModelRenderer(this);
		Headgray.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headgray.texOffs(0, 87).addBox(-3.5F, -10.0F, -3.5F, 7.0F, 1.0F, 7.0F, 0.75F, false);
		}
		
		Bodyblue = new ModelRenderer(this);
		Bodyblue.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyblue.texOffs(16, 17).addBox(-4.0F, 0.0F, -2.5F, 8.0F, 12.0F, 5.0F, 0.51F, false);
		}
		
		Bodyyellow = new ModelRenderer(this);
		Bodyyellow.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyyellow.texOffs(17, 43).addBox(-3.0F, 6.0F, -3.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Bodyyellow.texOffs(24, 43).addBox(1.0F, 6.0F, -3.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		}
		
		Bodygray = new ModelRenderer(this);
		Bodygray.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodygray.texOffs(16, 49).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.31F, false);
		}
		
		RightArmdarkblue = new ModelRenderer(this);
		RightArmdarkblue.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmdarkblue, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmdarkblue.texOffs(43, 57).addBox(-3.0F, 4.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		RightArmlightblue = new ModelRenderer(this);
		RightArmlightblue.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmlightblue, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmlightblue.texOffs(34, 86).addBox(-3.0F, -2.3609F, -2.0F, 4.0F, 3.0F, 4.0F, 0.75F, false);
		}
		
		RightArmyellow = new ModelRenderer(this);
		RightArmyellow.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmyellow, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmyellow.texOffs(43, 41).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		RightArmyellow.texOffs(47, 131).addBox(-3.0F, 10.0F, -2.0F, 1.0F, 3.0F, 4.0F, 0.3F, false);
		RightArmyellow.texOffs(61, 131).addBox(0.0F, 10.0F, -2.0F, 1.0F, 3.0F, 4.0F, 0.3F, false);
		}
		
		RightArmgray = new ModelRenderer(this);
		RightArmgray.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmgray, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmgray.texOffs(59, 41).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		LeftArmDarkBlue = new ModelRenderer(this);
		LeftArmDarkBlue.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmDarkBlue, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmDarkBlue.texOffs(43, 33).addBox(-1.0F, 4.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		LeftArmLightBlue = new ModelRenderer(this);
		LeftArmLightBlue.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmLightBlue, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmLightBlue.texOffs(52, 86).addBox(-1.0F, -2.3609F, -2.0F, 4.0F, 3.0F, 4.0F, 0.75F, false);
		}
		
		LeftArmyellow = new ModelRenderer(this);
		LeftArmyellow.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmyellow, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmyellow.texOffs(43, 17).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArmyellow.texOffs(47, 140).addBox(2.0F, 10.0F, -2.0F, 1.0F, 3.0F, 4.0F, 0.3F, true);
		LeftArmyellow.texOffs(61, 140).addBox(-1.0F, 10.0F, -2.0F, 1.0F, 3.0F, 4.0F, 0.3F, true);
		}
		
		LeftArmgray = new ModelRenderer(this);
		LeftArmgray.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgray, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmgray.texOffs(59, 17).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		RightLegdarkblue = new ModelRenderer(this);
		RightLegdarkblue.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegdarkblue, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegdarkblue.texOffs(0, 33).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		RightLegdarkblue.texOffs(0, 140).addBox(-2.0F, 11.0F, -3.0F, 4.0F, 1.0F, 5.0F, 1.3F, false);
		}
		
		RightLeglightblue = new ModelRenderer(this);
		RightLeglightblue.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeglightblue, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLeglightblue.texOffs(0, 132).addBox(-2.0F, 11.0F, -3.0F, 4.0F, 1.0F, 5.0F, 1.3F, false);
		}
		
		LeftLegdarkblue = new ModelRenderer(this);
		LeftLegdarkblue.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegdarkblue, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegdarkblue.texOffs(0, 17).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		LeftLegdarkblue.texOffs(21, 140).addBox(-2.0F, 11.0F, -3.0F, 4.0F, 1.0F, 5.0F, 1.3F, true);
		}
		
		LeftLeglightblue = new ModelRenderer(this);
		LeftLeglightblue.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeglightblue, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLeglightblue.texOffs(21, 132).addBox(-2.0F, 11.0F, -3.0F, 4.0F, 1.0F, 5.0F, 1.3F, true);
		}
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
		this.Bodyblue.copyFrom(this.body);
		Bodyblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmdarkblue.copyFrom(this.rightArm);
		RightArmdarkblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmDarkBlue.copyFrom(this.leftArm);
		LeftArmDarkBlue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegdarkblue.copyFrom(this.rightLeg);
		RightLegdarkblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegdarkblue.copyFrom(this.leftLeg);
		LeftLegdarkblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.ThirdColor & 255) / 255.0F;
		this.Headyellow.copyFrom(this.head);
		Headyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodyyellow.copyFrom(this.body);
		Bodyyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmyellow.copyFrom(this.rightArm);
		RightArmyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmyellow.copyFrom(this.leftArm);
		LeftArmyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		
		this.Headwhiteeyes.copyFrom(this.head);
		Headwhiteeyes.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		
		
		this.Headblackeyes.copyFrom(this.head);
		Headblackeyes.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		
		fred = (float)( this.FifthColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.FifthColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.FifthColor & 255) / 255.0F;
		this.Headredmouth.copyFrom(this.head);
		Headredmouth.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GrayColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GrayColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GrayColor & 255) / 255.0F;
		this.Headgray.copyFrom(this.head);
		Headgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodygray.copyFrom(this.body);
		Bodygray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmgray.copyFrom(this.rightArm);
		RightArmgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmgray.copyFrom(this.leftArm);
		LeftArmgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
		this.RightArmlightblue.copyFrom(this.rightArm);
		RightArmlightblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmLightBlue.copyFrom(this.leftArm);
		LeftArmLightBlue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLeglightblue.copyFrom(this.rightLeg);
		RightLeglightblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeglightblue.copyFrom(this.leftLeg);
		LeftLeglightblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
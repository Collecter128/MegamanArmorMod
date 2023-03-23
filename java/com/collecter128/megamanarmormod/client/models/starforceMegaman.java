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

// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports

@OnlyIn(Dist.CLIENT)
public class starforceMegaman extends BipedModel {
	private final ModelRenderer Headblue;
	private final ModelRenderer Headlightblue;
	private final ModelRenderer Headdarkblue;
	private final ModelRenderer Head5_r1;
	private final ModelRenderer Headgray;
	private final ModelRenderer Head6_r1;
	private final ModelRenderer Headredglow;
	private final ModelRenderer Headtransparentred;
	private final ModelRenderer Headhair;
	private final ModelRenderer cube_r1;
	private final ModelRenderer Bodydarkblue;
	private final ModelRenderer Bodyblue;
	private final ModelRenderer Bodylightblue;
	private final ModelRenderer Body6_r1;
	private final ModelRenderer Body3_r1;
	private final ModelRenderer Bodygold;
	private final ModelRenderer Bodygray;
	private final ModelRenderer Body7_r1;
	private final ModelRenderer Bodyglowred;
	private final ModelRenderer Body4_r1;
	private final ModelRenderer RightArmdarkblue;
	private final ModelRenderer RightArmgray;
	private final ModelRenderer RightArmlightblue;
	private final ModelRenderer LeftArmdarkblue;
	private final ModelRenderer LeftArmblue;
	private final ModelRenderer LeftArmgreen;
	private final ModelRenderer LeftArmlightblue;
	private final ModelRenderer LeftArmgray;
	private final ModelRenderer LeftArmglowred;
	private final ModelRenderer RightLeglightblue;
	private final ModelRenderer RightLegdarkblue;
	private final ModelRenderer RightLeggray;
	private final ModelRenderer LeftLeglightblue;
	private final ModelRenderer LeftLegdarkblue;
	private final ModelRenderer LeftLeggray;
	
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
	
	EquipmentSlotType equipmentslot;

	public starforceMegaman(float modelSize, EquipmentSlotType slot) {
		super(modelSize);
		texWidth = 78;
		texHeight = 242;
		
		equipmentslot = slot;
		
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

		Headblue = new ModelRenderer(this);
		Headblue.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headblue.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headblue.texOffs(0, 55).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 7.0F, 8.0F, 0.75F, false);
		}
		
		Headlightblue = new ModelRenderer(this);
		Headlightblue.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headlightblue.texOffs(0, 98).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Headdarkblue = new ModelRenderer(this);
		Headdarkblue.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headdarkblue.texOffs(36, 6).addBox(-5.8938F, -4.8448F, -1.5287F, 1.0F, 4.0F, 4.0F, 0.5F, false);
		Headdarkblue.texOffs(51, 6).addBox(5.0643F, -4.9451F, -1.5752F, 1.0F, 4.0F, 4.0F, 0.5F, false);
		}
		
		Head5_r1 = new ModelRenderer(this);
		Head5_r1.setPos(0.0F, 24.0F, 0.0F);
		Headdarkblue.addChild(Head5_r1);
		setRotationAngle(Head5_r1, -0.4363F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head5_r1.texOffs(66, 10).addBox(-5.8938F, -21.8448F, -11.5287F, 1.0F, 2.0F, 1.0F, 0.5F, false);
		Head5_r1.texOffs(66, 4).addBox(-5.8938F, -29.8448F, -10.5287F, 1.0F, 3.0F, 1.0F, 0.5F, false);
		Head5_r1.texOffs(60, 10).addBox(5.0643F, -21.9451F, -11.5752F, 1.0F, 2.0F, 1.0F, 0.5F, false);
		Head5_r1.texOffs(60, 4).addBox(5.0643F, -29.9451F, -10.5752F, 1.0F, 3.0F, 1.0F, 0.5F, false);
		}
		
		Headgray = new ModelRenderer(this);
		Headgray.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headgray.texOffs(50, 160).addBox(5.0643F, -4.9451F, -1.5752F, 1.0F, 4.0F, 4.0F, 0.5F, false);
		Headgray.texOffs(35, 160).addBox(-5.8938F, -4.8448F, -1.5287F, 1.0F, 4.0F, 4.0F, 0.5F, false);
		Headgray.texOffs(0, 138).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Head6_r1 = new ModelRenderer(this);
		Head6_r1.setPos(0.0F, 24.0F, 0.0F);
		Headgray.addChild(Head6_r1);
		setRotationAngle(Head6_r1, -0.4363F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head6_r1.texOffs(73, 10).addBox(-5.8938F, -21.8448F, -11.5287F, 1.0F, 2.0F, 1.0F, 0.5F, false);
		Head6_r1.texOffs(69, 4).addBox(5.0643F, -29.9451F, -10.5752F, 1.0F, 3.0F, 1.0F, 0.5F, false);
		Head6_r1.texOffs(73, 4).addBox(-5.8938F, -29.8448F, -10.5287F, 1.0F, 3.0F, 1.0F, 0.5F, false);
		Head6_r1.texOffs(69, 10).addBox(5.0643F, -21.9451F, -11.5752F, 1.0F, 2.0F, 1.0F, 0.5F, false);
		Head6_r1.texOffs(69, 4).addBox(5.0643F, -29.9451F, -10.5752F, 1.0F, 3.0F, 1.0F, 0.5F, false);
		}
		
		Headredglow = new ModelRenderer(this);
		Headredglow.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headredglow.texOffs(35, 2).addBox(-6.8938F, -4.5F, -1.0F, 0.0F, 3.0F, 3.0F, 0.2F, false);
		Headredglow.texOffs(48, 2).addBox(6.8F, -4.5F, -1.0F, 0.0F, 3.0F, 3.0F, 0.2F, false);
		}
		
		Headtransparentred = new ModelRenderer(this);
		Headtransparentred.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headtransparentred.texOffs(0, 154).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Headhair = new ModelRenderer(this);
		Headhair.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headhair.texOffs(0, 186).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0F, 0.0F, 0.0F);
		Headhair.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.6109F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		cube_r1.texOffs(54, 107).addBox(-1.0F, -15.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F, false);
		}
		
		Bodydarkblue = new ModelRenderer(this);
		Bodydarkblue.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodydarkblue.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		}
		
		Bodyblue = new ModelRenderer(this);
		Bodyblue.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyblue.texOffs(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		}
		
		Bodylightblue = new ModelRenderer(this);
		Bodylightblue.setPos(0.0F, 0.0F, 0.0F);
		

		Body6_r1 = new ModelRenderer(this);
		Body6_r1.setPos(0.0F, 24.0F, 0.0F);
		Bodylightblue.addChild(Body6_r1);
		setRotationAngle(Body6_r1, 0.1745F, 3.1416F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Body6_r1.texOffs(64, 162).addBox(1.5F, -22.0F, 0.0F, 1.0F, 4.0F, 2.0F, 0.1F, false);
		Body6_r1.texOffs(64, 148).addBox(-2.5F, -22.0F, 0.0F, 1.0F, 4.0F, 2.0F, 0.1F, false);
		}
		
		Body3_r1 = new ModelRenderer(this);
		Body3_r1.setPos(0.0F, 24.0F, 0.0F);
		Bodylightblue.addChild(Body3_r1);
		setRotationAngle(Body3_r1, 0.0873F, 3.1416F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Body3_r1.texOffs(35, 103).addBox(-1.5F, -22.0F, -1.0F, 3.0F, 4.0F, 4.0F, 0.51F, false);
		}
		
		Bodygold = new ModelRenderer(this);
		Bodygold.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodygold.texOffs(0, 224).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		Bodygold.texOffs(25, 54).addBox(-2.5F, 0.0F, -3.5F, 5.0F, 4.0F, 1.0F, -0.7F, false);
		}
		
		Bodygray = new ModelRenderer(this);
		Bodygray.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodygray.texOffs(34, 138).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		}
		
		Body7_r1 = new ModelRenderer(this);
		Body7_r1.setPos(0.0F, 24.0F, 0.0F);
		Bodygray.addChild(Body7_r1);
		setRotationAngle(Body7_r1, 0.1745F, 3.1416F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Body7_r1.texOffs(64, 155).addBox(1.5F, -22.0F, 0.0F, 1.0F, 4.0F, 2.0F, 0.1F, false);
		Body7_r1.texOffs(64, 140).addBox(-2.5F, -22.0F, 0.0F, 1.0F, 4.0F, 2.0F, 0.1F, false);
		}
		
		Bodyglowred = new ModelRenderer(this);
		Bodyglowred.setPos(0.0F, 0.0F, 0.0F);
		

		Body4_r1 = new ModelRenderer(this);
		Body4_r1.setPos(0.0F, 24.0F, 0.0F);
		Bodyglowred.addChild(Body4_r1);
		setRotationAngle(Body4_r1, 0.0873F, 3.1416F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Body4_r1.texOffs(62, 128).addBox(-1.5F, -22.0F, -1.0F, 3.0F, 4.0F, 4.0F, 0.51F, false);
		}
		
		RightArmdarkblue = new ModelRenderer(this);
		RightArmdarkblue.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmdarkblue, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmdarkblue.texOffs(44, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		RightArmdarkblue.texOffs(38, 197).addBox(-3.7F, -2.3609F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		RightArmgray = new ModelRenderer(this);
		RightArmgray.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmgray, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmgray.texOffs(38, 187).addBox(-3.7F, -2.3609F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		RightArmlightblue = new ModelRenderer(this);
		RightArmlightblue.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmlightblue, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmlightblue.texOffs(61, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		RightArmlightblue.texOffs(44, 32).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		RightArmlightblue.texOffs(2, 85).addBox(-3.7F, -2.3609F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		LeftArmdarkblue = new ModelRenderer(this);
		LeftArmdarkblue.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmdarkblue, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmdarkblue.texOffs(44, 40).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArmdarkblue.texOffs(56, 78).addBox(-1.0F, 6.0F, -2.5F, 4.0F, 5.0F, 4.0F, 0.78F, false);
		LeftArmdarkblue.texOffs(54, 197).addBox(-0.7F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		LeftArmblue = new ModelRenderer(this);
		LeftArmblue.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmblue, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmblue.texOffs(56, 69).addBox(-1.0F, 7.6F, -2.0F, 4.0F, 3.0F, 4.0F, 0.78F, false);
		}
		
		LeftArmgreen = new ModelRenderer(this);
		LeftArmgreen.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgreen, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmgreen.texOffs(39, 66).addBox(-1.0F, 4.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.75F, false);
		}
		
		LeftArmlightblue = new ModelRenderer(this);
		LeftArmlightblue.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmlightblue, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmlightblue.texOffs(61, 40).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArmlightblue.texOffs(38, 80).addBox(-1.0F, 6.0F, -6.5F, 4.0F, 5.0F, 4.0F, 0.82F, false);
		LeftArmlightblue.texOffs(18, 85).addBox(-0.7F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		LeftArmgray = new ModelRenderer(this);
		LeftArmgray.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgray, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmgray.texOffs(54, 187).addBox(-0.7F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		LeftArmgray.texOffs(69, 95).addBox(3.3F, 5.0F, -2.0F, 1.0F, 3.0F, 3.0F, 0.1F, false);
		LeftArmgray.texOffs(67, 88).addBox(-0.7F, 6.0F, -3.5F, 3.0F, 5.0F, 1.0F, 0.1F, false);
		LeftArmgray.texOffs(56, 95).addBox(-2.3F, 5.0F, -2.0F, 1.0F, 3.0F, 3.0F, 0.1F, false);
		}
		
		LeftArmglowred = new ModelRenderer(this);
		LeftArmglowred.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmglowred, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmglowred.texOffs(58, 104).addBox(-1.0F, 6.0F, -2.5F, 4.0F, 5.0F, 4.0F, 0.78F, false);
		}
		
		RightLeglightblue = new ModelRenderer(this);
		RightLeglightblue.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeglightblue, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLeglightblue.texOffs(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLegdarkblue = new ModelRenderer(this);
		RightLegdarkblue.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegdarkblue, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegdarkblue.texOffs(37, 170).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLeggray = new ModelRenderer(this);
		RightLeggray.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeggray, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLeggray.texOffs(0, 170).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		LeftLeglightblue = new ModelRenderer(this);
		LeftLeglightblue.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeglightblue, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLeglightblue.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		LeftLegdarkblue = new ModelRenderer(this);
		LeftLegdarkblue.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegdarkblue, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegdarkblue.texOffs(55, 170).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		LeftLeggray = new ModelRenderer(this);
		LeftLeggray.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeggray, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLeggray.texOffs(19, 170).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
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
		this.Headlightblue.copyFrom(this.head);
		Headlightblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodylightblue.copyFrom(this.body);
		Bodylightblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmlightblue.copyFrom(this.rightArm);
		RightArmlightblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmlightblue.copyFrom(this.leftArm);
		LeftArmlightblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLeglightblue.copyFrom(this.rightLeg);
		RightLeglightblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeglightblue.copyFrom(this.leftLeg);
		LeftLeglightblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
		this.Headdarkblue.copyFrom(this.head);
		Headdarkblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodydarkblue.copyFrom(this.body);
		Bodydarkblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmdarkblue.copyFrom(this.rightArm);
		RightArmdarkblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmdarkblue.copyFrom(this.leftArm);
		LeftArmdarkblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegdarkblue.copyFrom(this.rightLeg);
		RightLegdarkblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegdarkblue.copyFrom(this.leftLeg);
		LeftLegdarkblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.FourthColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.FourthColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.FourthColor & 255) / 255.0F;
		this.Headblue.copyFrom(this.head);
		Headblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodyblue.copyFrom(this.body);
		Bodyblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmblue.copyFrom(this.leftArm);
		LeftArmblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
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
		this.RightLeggray.copyFrom(this.rightLeg);
		RightLeggray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLeggray.copyFrom(this.leftLeg);
		LeftLeggray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.ThirdColor & 255) / 255.0F;
		this.Bodygold.copyFrom(this.body);
		Bodygold.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		
		this.Headhair.copyFrom(this.head);
		Headhair.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		
		this.LeftArmgreen.copyFrom(this.leftArm);
		LeftArmgreen.render(matrixStack, buffer, 0xF000F0, packedOverlay, red, green, blue, alpha);
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
		this.Headredglow.copyFrom(this.head);
		Headredglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodyglowred.copyFrom(this.body);
		Bodyglowred.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmglowred.copyFrom(this.leftArm);
		LeftArmglowred.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		
		buffer = Minecraft.getInstance().renderBuffers().bufferSource().getBuffer(RenderType.entityTranslucent(new ResourceLocation(
				"megamanarmormod:textures/armor/megamanstarforce.png")));
		this.Headtransparentred.copyFrom(this.head);
		Headtransparentred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
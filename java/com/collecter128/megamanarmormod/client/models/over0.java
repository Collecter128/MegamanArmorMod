package com.collecter128.megamanarmormod.client.models;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

// Made with Blockbench 4.7.0
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports

@OnlyIn(Dist.CLIENT)
public class over0 extends BipedModel {
	private final ModelRenderer Headblue;
	private final ModelRenderer Headlightblue;
	private final ModelRenderer Headgray;
	private final ModelRenderer Headgoldglow;
	private final ModelRenderer Head3_r1;
	private final ModelRenderer Headblack;
	private final ModelRenderer Headredglow;
	private final ModelRenderer Bodyblue;
	private final ModelRenderer Bodylightblue;
	private final ModelRenderer Bodyredglow;
	private final ModelRenderer Bodyblack;
	private final ModelRenderer Bodygray;
	private final ModelRenderer Bodyblueglow;
	private final ModelRenderer RightArmblue;
	private final ModelRenderer RightArmlightblue;
	private final ModelRenderer RightArmblueglow;
	private final ModelRenderer RightArmredglow;
	private final ModelRenderer RightArmblack;
	private final ModelRenderer RightArmgray;
	private final ModelRenderer LeftArmblue;
	private final ModelRenderer LeftArmlightblue;
	private final ModelRenderer LeftArmredglow;
	private final ModelRenderer LeftArmblueglow;
	private final ModelRenderer LeftArmblueblack;
	private final ModelRenderer LeftArmbluegray;
	private final ModelRenderer RightLegblue;
	private final ModelRenderer RightLeglightblue;
	private final ModelRenderer RightLegblack;
	private final ModelRenderer RightLegredglow;
	private final ModelRenderer LeftLegblue;
	private final ModelRenderer LeftLeglightblue;
	private final ModelRenderer LeftLegblack;
	private final ModelRenderer LeftLegredglow;
	
	EquipmentSlotType equipmentslot;
	
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

	public over0(float modelSize, EquipmentSlotType slot) {
		super(modelSize);
		texWidth = 74;
		texHeight = 235;
		
		equipmentslot = slot;
		
		MainColorDefault = 4022712;//Main Dark Blue
		SecondaryColorDefault = 4542568;//Secondary Black
		ThirdColorDefault = 8039403; //Light Blue
		WhiteColorDefault = 16777215;//White
		GlowyColorDefault = 14170939;//red
		GrayColorDefault = 10724259;//gray
		FourthColorDefault = 16765235;//gold
		//??? body middle thing 6584982
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
		}
		
		Headlightblue = new ModelRenderer(this);
		Headlightblue.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headlightblue.texOffs(0, 65).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headlightblue.texOffs(44, 80).addBox(-1.0F, -9.5707F, -4.5F, 2.0F, 5.0F, 10.0F, 0.25F, false);
		Headlightblue.texOffs(19, 33).addBox(5.0643F, -3.9451F, -0.5752F, 1.0F, 3.0F, 3.0F, 0.5F, false);
		Headlightblue.texOffs(19, 39).addBox(-5.8938F, -3.8448F, -0.5287F, 1.0F, 3.0F, 3.0F, 0.5F, false);
		}
		
		Headgray = new ModelRenderer(this);
		Headgray.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headgray.texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 7.0F, 8.0F, 0.75F, false);
		}
		
		Headgoldglow = new ModelRenderer(this);
		Headgoldglow.setPos(0.0F, 0.0F, 0.0F);
		

		Head3_r1 = new ModelRenderer(this);
		Head3_r1.setPos(0.0F, 24.0F, 0.0F);
		Headgoldglow.addChild(Head3_r1);
		setRotationAngle(Head3_r1, 0.0F, 0.0F, 0.7854F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head3_r1.texOffs(4, 49).addBox(-23.0F, -23.0F, -5.0F, 2.0F, 2.0F, 1.0F, 0.25F, false);
		}
		
		Headblack = new ModelRenderer(this);
		Headblack.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headblack.texOffs(0, 81).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Headredglow = new ModelRenderer(this);
		Headredglow.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headredglow.texOffs(64, 2).addBox(4.5F, -3.5F, 0.0F, 1.0F, 2.0F, 2.0F, 0.5F, false);
		Headredglow.texOffs(67, 9).addBox(-5.5F, -3.5F, 0.0F, 1.0F, 2.0F, 2.0F, 0.5F, false);
		}
		
		Bodyblue = new ModelRenderer(this);
		Bodyblue.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyblue.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		}
		
		Bodylightblue = new ModelRenderer(this);
		Bodylightblue.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodylightblue.texOffs(42, 96).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		Bodylightblue.texOffs(2, 55).addBox(1.0F, 2.0F, 2.0F, 3.0F, 3.0F, 1.0F, 0.51F, false);
		Bodylightblue.texOffs(2, 61).addBox(-4.0F, 2.0F, 2.0F, 3.0F, 3.0F, 1.0F, 0.51F, false);
		}
		
		Bodyredglow = new ModelRenderer(this);
		Bodyredglow.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyredglow.texOffs(27, 35).addBox(1.5F, 2.5F, 1.8F, 2.0F, 2.0F, 1.0F, 0.51F, false);
		Bodyredglow.texOffs(27, 42).addBox(-3.5F, 2.5F, 1.8F, 2.0F, 2.0F, 1.0F, 0.51F, false);
		}
		
		Bodyblack = new ModelRenderer(this);
		Bodyblack.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyblack.texOffs(0, 98).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.51F, false);
		}
		
		Bodygray = new ModelRenderer(this);
		Bodygray.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodygray.texOffs(16, 48).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.31F, false);
		Bodygray.texOffs(61, 207).addBox(-1.5F, 1.5F, -3.0F, 3.0F, 3.0F, 1.0F, 0.2F, false);
		}
		
		Bodyblueglow = new ModelRenderer(this);
		Bodyblueglow.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyblueglow.texOffs(64, 214).addBox(-1.0F, 2.0F, -2.9F, 2.0F, 2.0F, 1.0F, 0.2F, false);
		}
		
		RightArmblue = new ModelRenderer(this);
		RightArmblue.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmblue, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmblue.texOffs(40, 24).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		RightArmblue.texOffs(40, 40).addBox(-3.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		RightArmlightblue = new ModelRenderer(this);
		RightArmlightblue.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmlightblue, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmlightblue.texOffs(36, 165).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		RightArmlightblue.texOffs(2, 168).addBox(-2.0F, 5.0F, -3.0F, 3.0F, 3.0F, 1.0F, 0.1F, false);
		RightArmlightblue.texOffs(2, 174).addBox(-2.0F, 5.0F, 2.0F, 3.0F, 3.0F, 1.0F, 0.1F, false);
		}
		
		RightArmblueglow = new ModelRenderer(this);
		RightArmblueglow.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmblueglow, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmblueglow.texOffs(37, 147).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		RightArmredglow = new ModelRenderer(this);
		RightArmredglow.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmredglow, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmredglow.texOffs(15, 167).addBox(-1.5F, 5.5F, -2.9F, 2.0F, 2.0F, 1.0F, 0.1F, false);
		RightArmredglow.texOffs(12, 174).addBox(-1.5F, 5.5F, 1.9F, 2.0F, 2.0F, 1.0F, 0.1F, false);
		}
		
		RightArmblack = new ModelRenderer(this);
		RightArmblack.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmblack, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmblack.texOffs(40, 48).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		RightArmgray = new ModelRenderer(this);
		RightArmgray.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmgray, 0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmgray.texOffs(40, 64).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		LeftArmblue = new ModelRenderer(this);
		LeftArmblue.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmblue, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmblue.texOffs(57, 24).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArmblue.texOffs(57, 40).addBox(-1.0F, 3.6391F, -2.0F, 4.0F, 4.0F, 4.0F, 0.75F, false);
		}
		
		LeftArmlightblue = new ModelRenderer(this);
		LeftArmlightblue.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmlightblue, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmlightblue.texOffs(53, 165).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArmlightblue.texOffs(2, 184).addBox(-1.0F, 5.0F, -3.0F, 3.0F, 3.0F, 1.0F, 0.1F, true);
		LeftArmlightblue.texOffs(2, 190).addBox(-1.0F, 5.0F, 2.0F, 3.0F, 3.0F, 1.0F, 0.1F, true);
		}
		
		LeftArmredglow = new ModelRenderer(this);
		LeftArmredglow.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmredglow, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmredglow.texOffs(13, 184).addBox(-0.5F, 5.5F, -2.9F, 2.0F, 2.0F, 1.0F, 0.1F, true);
		LeftArmredglow.texOffs(10, 191).addBox(-0.5F, 5.5F, 1.9F, 2.0F, 2.0F, 1.0F, 0.1F, true);
		}
		
		LeftArmblueglow = new ModelRenderer(this);
		LeftArmblueglow.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmblueglow, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmblueglow.texOffs(54, 147).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		LeftArmblueblack = new ModelRenderer(this);
		LeftArmblueblack.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmblueblack, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmblueblack.texOffs(57, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		LeftArmbluegray = new ModelRenderer(this);
		LeftArmbluegray.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmbluegray, -0.1309F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmbluegray.texOffs(57, 64).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		}
		
		RightLegblue = new ModelRenderer(this);
		RightLegblue.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegblue, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegblue.texOffs(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLeglightblue = new ModelRenderer(this);
		RightLeglightblue.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeglightblue, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLeglightblue.texOffs(29, 185).addBox(-3.6F, 9.0F, -1.5F, 1.0F, 3.0F, 3.0F, 0.1F, false);
		RightLeglightblue.texOffs(29, 191).addBox(2.4F, 9.0F, -1.5F, 1.0F, 3.0F, 3.0F, 0.1F, false);
		}
		
		RightLegblack = new ModelRenderer(this);
		RightLegblack.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegblack, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegblack.texOffs(0, 147).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLegredglow = new ModelRenderer(this);
		RightLegredglow.setPos(-1.9F, 12.0F, -1.9632F);
		setRotationAngle(RightLegredglow, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegredglow.texOffs(20, 229).addBox(-1.0F, 9.5F, 0.0F, 2.0F, 3.0F, 2.0F, 1.0F, false);
		RightLegredglow.texOffs(40, 186).addBox(-3.5F, 10.0F, 0.0F, 1.0F, 2.0F, 2.0F, 0.1F, false);
		RightLegredglow.texOffs(37, 193).addBox(2.3F, 10.0F, 0.0F, 1.0F, 2.0F, 2.0F, 0.1F, false);
		}
		
		LeftLegblue = new ModelRenderer(this);
		LeftLegblue.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegblue, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegblue.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLeglightblue = new ModelRenderer(this);
		LeftLeglightblue.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeglightblue, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLeglightblue.texOffs(51, 185).addBox(2.6F, 9.0F, -1.5F, 1.0F, 3.0F, 3.0F, 0.1F, true);
		LeftLeglightblue.texOffs(51, 191).addBox(-3.4F, 9.0F, -1.5F, 1.0F, 3.0F, 3.0F, 0.1F, true);
		}
		
		LeftLegblack = new ModelRenderer(this);
		LeftLegblack.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegblack, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegblack.texOffs(18, 147).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLegredglow = new ModelRenderer(this);
		LeftLegredglow.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegredglow, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegredglow.texOffs(30, 229).addBox(-1.0F, 10.2F, -1.0F, 2.0F, 2.0F, 2.0F, 1.0F, true);
		LeftLegredglow.texOffs(62, 186).addBox(2.5F, 10.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.1F, true);
		LeftLegredglow.texOffs(59, 193).addBox(-3.3F, 10.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.1F, true);
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
		this.Headblue.copyFrom(this.head);
		Headblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodyblue.copyFrom(this.body);
		Bodyblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmblue.copyFrom(this.rightArm);
		RightArmblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmblue.copyFrom(this.leftArm);
		LeftArmblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegblue.copyFrom(this.rightLeg);
		RightLegblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegblue.copyFrom(this.leftLeg);
		LeftLegblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		this.Bodyblueglow.copyFrom(this.body);
		Bodyblueglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmblueglow.copyFrom(this.rightArm);
		RightArmblueglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmblueglow.copyFrom(this.leftArm);
		LeftArmblueglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.ThirdColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.ThirdColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.ThirdColor & 255) / 255.0F;
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
		
		fred = (float)( this.GrayColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GrayColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GrayColor & 255) / 255.0F;
		this.Headgray.copyFrom(this.head);
		Headgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodygray.copyFrom(this.body);
		Bodygray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmgray.copyFrom(this.rightArm);
		RightArmgray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmbluegray.copyFrom(this.leftArm);
		LeftArmbluegray.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.FourthColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.FourthColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.FourthColor & 255) / 255.0F;
		this.Headgoldglow.copyFrom(this.head);
		Headgoldglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
		this.Headblack.copyFrom(this.head);
		Headblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodyblack.copyFrom(this.body);
		Bodyblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmblack.copyFrom(this.rightArm);
		RightArmblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmblueblack.copyFrom(this.leftArm);
		LeftArmblueblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegblack.copyFrom(this.rightLeg);
		RightLegblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegblack.copyFrom(this.leftLeg);
		LeftLegblack.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
		this.Headredglow.copyFrom(this.head);
		Headredglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodyredglow.copyFrom(this.body);
		Bodyredglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmredglow.copyFrom(this.rightArm);
		RightArmredglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmredglow.copyFrom(this.leftArm);
		LeftArmredglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegredglow.copyFrom(this.rightLeg);
		RightLegredglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegredglow.copyFrom(this.leftLeg);
		LeftLegredglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
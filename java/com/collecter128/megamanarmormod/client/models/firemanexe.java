package com.collecter128.megamanarmormod.client.models;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports

@OnlyIn(Dist.CLIENT)
public class firemanexe extends BipedModel {
	private final ModelRenderer Headgray;
	private final ModelRenderer Headyellow;
	private final ModelRenderer Headeyes;
	private final ModelRenderer Headlightyellowglow;
	private final ModelRenderer Head_r1;
	private final ModelRenderer Head_r2;
	private final ModelRenderer Head_r3;
	private final ModelRenderer Bodyred;
	private final ModelRenderer Bodygray;
	private final ModelRenderer Bodyyellow;
	private final ModelRenderer Body_r1;
	private final ModelRenderer Bodywhite;
	private final ModelRenderer Bodyredglow;
	private final ModelRenderer Body_r2;
	private final ModelRenderer Bodyorangeglow;
	private final ModelRenderer Body_r3;
	private final ModelRenderer RightArmred;
	private final ModelRenderer RightArmgray;
	private final ModelRenderer RightArmblue;
	private final ModelRenderer RightArmbrown;
	private final ModelRenderer LeftArmred;
	private final ModelRenderer LeftArmgray;
	private final ModelRenderer LeftArmblue;
	private final ModelRenderer LeftArmbrown;
	private final ModelRenderer RightLeggray;
	private final ModelRenderer RightLegblue;
	private final ModelRenderer LeftLeggray;
	private final ModelRenderer LeftLegblue;
	
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

	public firemanexe(float modelSize, EquipmentSlotType slot) {
		super(modelSize);
		texWidth = 74;
		texHeight = 154;
		
		equipmentslot = slot;
		
		MainColorDefault = 13576746;//Main red
			//DS	12203002
			//SP	16011536
		SecondaryColorDefault = 2786767;//Secondary blue
			//DS	3822974
			//SP	5536176
		ThirdColorDefault = 16566843; //Yellow
			//DS	16355866
			//SP	16363802
		WhiteColorDefault = 16777215;//Basic White
			//DS	16777215
			//SP	16777215
		GlowyColorDefault = 16770411;//Glow? Light Yellow
			//DS	14449365
			//SP	16433986
		GrayColorDefault = 10724259;//Gray
			//DS	9737364
			//SP	9938874
		FourthColorDefault = 13212475; //brown
			//DS	12203002
			//SP	12542498
		FifthColorDefault = 16546077; //orange
			//DS	6756328
			//SP	15210311
		MainColor = MainColorDefault;
		SecondaryColor = SecondaryColorDefault;
		ThirdColor = ThirdColorDefault;
		WhiteColor = WhiteColorDefault;
		GlowyColor = GlowyColorDefault;
		GrayColor = GrayColorDefault;
		FourthColor = FourthColorDefault;
		FifthColor = FifthColorDefault;

		Headgray = new ModelRenderer(this);
		Headgray.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headgray, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headgray.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Headgray.texOffs(0, 50).addBox(-4.6706F, -10.6327F, -4.3F, 9.0F, 4.0F, 9.0F, 1.0F, false);
		}
		
		Headyellow = new ModelRenderer(this);
		Headyellow.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headyellow, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headyellow.texOffs(36, 4).addBox(5.4872F, -4.841F, -1.5659F, 1.0F, 4.0F, 4.0F, 0.5F, false);
		Headyellow.texOffs(50, 4).addBox(-5.8938F, -4.8448F, -1.5287F, 1.0F, 4.0F, 4.0F, 0.5F, false);
		}
		
		Headeyes = new ModelRenderer(this);
		Headeyes.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headeyes, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headeyes.texOffs(0, 81).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		}
		
		Headlightyellowglow = new ModelRenderer(this);
		Headlightyellowglow.setPos(0.0F, 0.0F, 0.0F);
		setRotationAngle(Headlightyellowglow, -0.1047F, 0.0873F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Headlightyellowglow.texOffs(48, 0).addBox(-5.3038F, -4.3091F, -0.9133F, 0.0F, 3.0F, 3.0F, 0.0F, false);
		}
		
		Head_r1 = new ModelRenderer(this);
		Head_r1.setPos(-4.0F, -10.0F, -9.0F);
		Headlightyellowglow.addChild(Head_r1);
		setRotationAngle(Head_r1, 0.0F, -0.6545F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head_r1.texOffs(36, 103).addBox(10.0F, -5.0F, 1.0F, 1.0F, 4.0F, 8.0F, 1.0F, false);
		}
		
		Head_r2 = new ModelRenderer(this);
		Head_r2.setPos(-1.0F, -10.0F, 0.0F);
		Headlightyellowglow.addChild(Head_r2);
		setRotationAngle(Head_r2, 0.0F, -0.6545F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head_r2.texOffs(2, 102).addBox(-3.0F, -9.0F, 1.0F, 14.0F, 8.0F, 1.0F, 1.0F, false);
		}
		
		Head_r3 = new ModelRenderer(this);
		Head_r3.setPos(0.0F, 23.0F, -1.0F);
		Headlightyellowglow.addChild(Head_r3);
		setRotationAngle(Head_r3, 0.0F, 3.1416F, 0.0F);
		if(equipmentslot == EquipmentSlotType.HEAD) {
		Head_r3.texOffs(34, 0).addBox(-6.5F, -27.3F, -2.8F, 0.0F, 3.0F, 3.0F, 0.0F, false);
		}
		
		Bodyred = new ModelRenderer(this);
		Bodyred.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyred.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.51F, false);
		Bodyred.texOffs(34, 86).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);
		}
		
		Bodygray = new ModelRenderer(this);
		Bodygray.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodygray.texOffs(34, 69).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.7F, false);
		}
		
		Bodyyellow = new ModelRenderer(this);
		Bodyyellow.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodyyellow.texOffs(54, 103).addBox(-3.5F, 0.0F, 2.8F, 7.0F, 7.0F, 1.0F, 0.0F, false);
		Bodyyellow.texOffs(60, 96).addBox(3.0F, 3.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.5F, false);
		Bodyyellow.texOffs(66, 96).addBox(-4.0F, 3.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.5F, false);
		}
		
		Body_r1 = new ModelRenderer(this);
		Body_r1.setPos(1.0F, 17.0F, -4.0F);
		Bodyyellow.addChild(Body_r1);
		setRotationAngle(Body_r1, 0.0F, 3.1416F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Body_r1.texOffs(19, 40).addBox(-2.0F, -18.0F, -1.2F, 6.0F, 6.0F, 1.0F, -1.02F, false);
		}
		
		Bodywhite = new ModelRenderer(this);
		Bodywhite.setPos(0.0F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Bodywhite.texOffs(54, 112).addBox(-3.5F, 0.0F, 2.8F, 7.0F, 7.0F, 1.0F, 0.0F, false);
		}
		
		Bodyredglow = new ModelRenderer(this);
		Bodyredglow.setPos(0.0F, 0.0F, 0.0F);
		

		Body_r2 = new ModelRenderer(this);
		Body_r2.setPos(1.0F, 17.0F, -4.0F);
		Bodyredglow.addChild(Body_r2);
		setRotationAngle(Body_r2, 0.0F, 3.1416F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Body_r2.texOffs(19, 33).addBox(-2.0F, -18.0F, -1.2F, 6.0F, 6.0F, 1.0F, -1.02F, false);
		}
		
		Bodyorangeglow = new ModelRenderer(this);
		Bodyorangeglow.setPos(0.0F, 0.0F, 0.0F);
		

		Body_r3 = new ModelRenderer(this);
		Body_r3.setPos(1.0F, 17.0F, -4.0F);
		Bodyorangeglow.addChild(Body_r3);
		setRotationAngle(Body_r3, 0.0F, 3.1416F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		Body_r3.texOffs(47, 142).addBox(-2.0F, -18.0F, -1.2F, 6.0F, 6.0F, 1.0F, -1.02F, false);
		}
		
		RightArmred = new ModelRenderer(this);
		RightArmred.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmred, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmred.texOffs(1, 136).addBox(-4.0F, -2.3609F, -2.0F, 5.0F, 3.0F, 4.0F, 0.75F, false);
		RightArmred.texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		}
		
		RightArmgray = new ModelRenderer(this);
		RightArmgray.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmgray, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmgray.texOffs(40, 57).addBox(-3.0F, 4.6391F, -2.0F, 4.0F, 7.0F, 4.0F, 0.75F, false);
		RightArmgray.texOffs(1, 145).addBox(-4.0F, -2.3609F, -2.0F, 5.0F, 3.0F, 4.0F, 0.75F, false);
		}
		
		RightArmblue = new ModelRenderer(this);
		RightArmblue.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmblue, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmblue.texOffs(40, 45).addBox(-3.0F, 4.6391F, -2.0F, 4.0F, 7.0F, 4.0F, 0.75F, false);
		}
		
		RightArmbrown = new ModelRenderer(this);
		RightArmbrown.setPos(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArmbrown, -0.1745F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		RightArmbrown.texOffs(40, 33).addBox(-3.0F, 4.6391F, -2.0F, 4.0F, 7.0F, 4.0F, 0.75F, false);
		}
		
		LeftArmred = new ModelRenderer(this);
		LeftArmred.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmred, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmred.texOffs(57, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);
		LeftArmred.texOffs(20, 136).addBox(-1.0F, -2.3609F, -2.0F, 5.0F, 3.0F, 4.0F, 0.75F, false);
		}
		
		LeftArmgray = new ModelRenderer(this);
		LeftArmgray.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmgray, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmgray.texOffs(57, 57).addBox(-1.0F, 4.0F, -2.0F, 4.0F, 7.0F, 4.0F, 0.75F, true);
		LeftArmgray.texOffs(20, 145).addBox(-1.0F, -2.3609F, -2.0F, 5.0F, 3.0F, 4.0F, 0.75F, false);
		}
		
		LeftArmblue = new ModelRenderer(this);
		LeftArmblue.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmblue, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmblue.texOffs(57, 45).addBox(-1.0F, 4.0F, -2.0F, 4.0F, 7.0F, 4.0F, 0.75F, true);
		}
		
		LeftArmbrown = new ModelRenderer(this);
		LeftArmbrown.setPos(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArmbrown, 0.2094F, 0.0F, 0.0F);
		if(equipmentslot == EquipmentSlotType.CHEST) {
		LeftArmbrown.texOffs(57, 33).addBox(-1.0F, 4.0F, -2.0F, 4.0F, 7.0F, 4.0F, 0.75F, true);
		}
		
		RightLeggray = new ModelRenderer(this);
		RightLeggray.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeggray, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLeggray.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		RightLegblue = new ModelRenderer(this);
		RightLegblue.setPos(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLegblue, 0.192F, 0.0F, 0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		RightLegblue.texOffs(0, 64).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, false);
		}
		
		LeftLeggray = new ModelRenderer(this);
		LeftLeggray.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeggray, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLeggray.texOffs(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
		}
		
		LeftLegblue = new ModelRenderer(this);
		LeftLegblue.setPos(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLegblue, -0.1745F, 0.0F, -0.0349F);
		if(equipmentslot == EquipmentSlotType.FEET) {
		LeftLegblue.texOffs(17, 64).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, true);
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
		this.Bodyred.copyFrom(this.body);
		Bodyred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightArmred.copyFrom(this.rightArm);
		RightArmred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmred.copyFrom(this.leftArm);
		LeftArmred.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.SecondaryColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.SecondaryColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.SecondaryColor & 255) / 255.0F;
		this.RightArmblue.copyFrom(this.rightArm);
		RightArmblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmblue.copyFrom(this.leftArm);
		LeftArmblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.RightLegblue.copyFrom(this.rightLeg);
		RightLegblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftLegblue.copyFrom(this.leftLeg);
		LeftLegblue.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
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
		this.Headyellow.copyFrom(this.head);
		Headyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodyyellow.copyFrom(this.body);
		Bodyyellow.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		
		this.Headeyes.copyFrom(this.head);
		Headeyes.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		
		fred = (float)( this.GlowyColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.GlowyColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.GlowyColor & 255) / 255.0F;
		this.Headlightyellowglow.copyFrom(this.head);
		Headlightyellowglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		this.Bodyorangeglow.copyFrom(this.body);
		Bodyorangeglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.WhiteColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.WhiteColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.WhiteColor & 255) / 255.0F;
		this.Bodywhite.copyFrom(this.body);
		Bodywhite.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.FifthColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.FifthColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.FifthColor & 255) / 255.0F;
		this.Bodyredglow.copyFrom(this.body);
		Bodyredglow.render(matrixStack, buffer, 0xF000F0, packedOverlay, fred, fgreen, fblue, alpha);
		
		fred = (float)( this.FourthColor >> 16 & 255) / 255.0F;
        fgreen = (float)(this.FourthColor >> 8 & 255) / 255.0F;
        fblue = (float)(this.FourthColor & 255) / 255.0F;
		this.RightArmbrown.copyFrom(this.rightArm);
		RightArmbrown.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
		this.LeftArmbrown.copyFrom(this.leftArm);
		LeftArmbrown.render(matrixStack, buffer, packedLight, packedOverlay, fred, fgreen, fblue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
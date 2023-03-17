package com.collecter128.megamanarmormod.items;

import com.collecter128.megamanarmormod.client.models.megamanarmor_chestplate;
import com.collecter128.megamanarmormod.client.models.megamanarmor_main;
import com.collecter128.megamanarmormod.core.Imorecolorfularmor;
import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class MegamanArmorchest extends ArmorItem implements Imorecolorfularmor{//armorItem
	
	   //private final int primaryColor;
	  // private final int secondaryColor;

	public MegamanArmorchest(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builderIn) {
		super(materialIn, slot, builderIn);
		
	}
	@OnlyIn(Dist.CLIENT)
	@Override
	public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
		megamanarmor_chestplate model = new megamanarmor_chestplate(1.0f);
		model.hat.visible = armorSlot == EquipmentSlotType.CHEST;
        //model.bipedBody..addChild(_default.bipedBody);
        //model.bipedRightArm.addChild(_default.bipedRightArm);
        model.body = new megamanarmor_chestplate(0f).Body;
        model.rightArm = new megamanarmor_chestplate(0f).RightArm;
        model.leftArm = new megamanarmor_chestplate(0f).LeftArm;
        //model.bipedLeftArm.rotateAngleX = entityLiving.
        //model.bipedRightArm.addChild(entityLiving.);
        //model.bipedLeftArm.addChild(_default.bipedLeftArm);
        //playermodel.rightArmPose
        //armorModel.bipedRightArm = new NameOfModelHere().NameOfRightArmHere;
        //armorModel.bipedLeftArm = new NameOfModelHere().NameOfLeftArmHere;
        //Imorecolorfularmor.setColor(itemStack, 66);
        //Imorecolorfularmor.getColor(itemStack);
        //model.bipedBody.addChild(new megamanarmor_chestplate.);
        model.rightArm.visible = armorSlot == EquipmentSlotType.CHEST;


        model.young = _default.young;
        model.crouching = _default.crouching;
        model.riding = _default.riding;
        model.rightArmPose = _default.rightArmPose;
        model.leftArmPose = _default.leftArmPose;
      //setColor(itemStack, 6);
        //        model.isChild = _default.isChild;
//        model.isSneak = entityLiving.isSneaking();
//        model.isSitting = _default.isSitting;
//model.rightArmPose = entityLiving.;
//        //model.leftArmPose = _default.leftArmPose;
		
		
		//New Code below Here
		
//		megamanarmor_chestplate model = new megamanarmor_chestplate(1.0f);
//        model.bipedBody.showModel = armorSlot == EquipmentSlotType.CHEST;
//
//       // model.bipedBody.addChild(new megamanarmor_chestplate.);
//        model.bipedRightArm.showModel = armorSlot == EquipmentSlotType.CHEST;
//        //model.bipedLeftArm = new ModelHumanoid().LeftArm
//      //model.bipedLeftArm = new megamanarmor_chestplate().LeftArm
//        model.isChild = _default.isChild;
//        model.isSneak = _default.isSneak;
//        model.isSitting = _default.isSitting;
//        model.rightArmPose = _default.rightArmPose;
//        model.leftArmPose = _default.leftArmPose;
      
//      ItemStack itemstack = entityLiving.getItemStackFromSlot(equipslottype);
//      if (itemstack.getItem() instanceof ArmorItem) {
//    	  ColorfulArmor armoritem = (ColorfulArmor)itemstack.getItem();
//         if (armoritem.getEquipmentSlot() == EquipmentSlotType.CHEST) {
//        	 //Body = getArmorModelHook(entity, itemstack, equipslottype, this.);
//            //this.getEntityModel().setModelAttributes(armormodel);
//            boolean flag1 = itemstack.hasEffect();
//           // if (armoritem instanceof net.minecraft.item.IDyeableArmorItem) {
//               int i = armoritem.getColor(itemstack);//Get Color, or default color
//               float fred = (float)(i >> 16 & 255) / 255.0F;
//               float fblue = (float)(i >> 8 & 255) / 255.0F;
//               float fgreen = (float)(i & 255) / 255.0F;
//               this.func_241738_a_(matrixStack, Irender, packedLight, flag1, model, fred, fblue, fgreen, this.getArmorTexture(itemstack, entityLiving, EquipmentSlotType.CHEST, null));//Main Blue Part
//			   this.func_241738_a_(matrixStack, Irender, packedLight, flag1, model, fred, fblue, fgreen, this.getArmorTexture(itemstack, entityLiving, EquipmentSlotType.CHEST, null));//Secondary Blue Part
//               this.func_241738_a_(matrixStack, Irender, packedLight, flag1, model, 1.0F, 1.0F, 1.0F, this.getArmorTexture(itemstack, entityLiving, EquipmentSlotType.CHEST, "overlay")); //Everything else

        return (A) model;
	}
	
//
   // @Override
    //public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
    //    return null;
    //}
	
//	  @OnlyIn(Dist.CLIENT)
//	   public int getColor(int tintIndex) {
//	      return tintIndex == 0 ? this.primaryColor : this.secondaryColor;
//	   }


//	@Nullable
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
        return "megamanarmormod:textures/armor/megamanarmor_layer_1.png";
    }
	
}

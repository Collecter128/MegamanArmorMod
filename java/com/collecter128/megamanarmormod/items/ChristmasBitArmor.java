package com.collecter128.megamanarmormod.items;

import com.collecter128.megamanarmormod.client.models.christmas_bit;
import com.collecter128.megamanarmormod.client.models.christmas_bit_leggings;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ChristmasBitArmor extends ArmorItem{
	
	public int MainColorDefault = 16719647;//Main red
	public int SecondaryColorDefault = 49692;//Secondary green
	public int ThirdColorDefault = 16243202; //yellow
	public int WhiteColorDefault = 16777215;//Basic White
	public int GlowyColorDefault = 2726655;//Glow? blue
	public int GrayColorDefault = 14079702;//gray
	public int FourthColorDefault = 3881787; //black
	public int FifthColorDefault = 11924736; //light green
	public int MainColor = MainColorDefault;
	public int SecondaryColor = SecondaryColorDefault;
	public int ThirdColor = ThirdColorDefault;
	public int WhiteColor = WhiteColorDefault;
	public int GlowyColor = GlowyColorDefault;
	public int GrayColor = GrayColorDefault;
	public int FourthColor = FourthColorDefault;
	public int FifthColor = FifthColorDefault;

	public ChristmasBitArmor(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builderIn) {
		super(materialIn, slot, builderIn);
		
	}
	@OnlyIn(Dist.CLIENT)
	@Override
	public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
		
		if(armorSlot != EquipmentSlotType.LEGS) {
			christmas_bit model = new christmas_bit(1.0f, armorSlot);
		model.hat.visible = armorSlot == EquipmentSlotType.HEAD;

		model.young = _default.young;
        model.crouching = _default.crouching;
        model.riding = _default.riding;
        model.rightArmPose = _default.rightArmPose;
        model.leftArmPose = _default.leftArmPose;
        
        CompoundNBT compoundnbt = itemStack.getTagElement("displaymm");

	      if(compoundnbt != null && compoundnbt.contains("MainColor", 99)) {
	    	  //CompoundNBT maincompund = itemStack.getChildTag("MainColor");
	    	  //armorcolorer = compoundnbt.getInt("MainColor");
	    	  model.MainColor = compoundnbt.getInt("MainColor");

	      }
	      if(compoundnbt != null && compoundnbt.contains("SecondaryColor", 99)) {

	    	  model.SecondaryColor = compoundnbt.getInt("SecondaryColor");

	      }
	      
	      if(compoundnbt != null && compoundnbt.contains("WhiteColor", 99)) {

	    	  model.WhiteColor = compoundnbt.getInt("WhiteColor");

	      }
	      
	      if(compoundnbt != null && compoundnbt.contains("ThirdColor", 99)) {

	    	  model.ThirdColor = compoundnbt.getInt("ThirdColor");

	      }
	      
	      if(compoundnbt != null && compoundnbt.contains("GlowyColor", 99)) {

	    	  model.GlowyColor = compoundnbt.getInt("GlowyColor");

	      }
	      
	      if(compoundnbt != null && compoundnbt.contains("GrayColor", 99)) {

	    	  model.GrayColor = compoundnbt.getInt("GrayColor");

	      }
	      if(compoundnbt != null && compoundnbt.contains("FourthColor", 99)) {

	    	  model.FourthColor = compoundnbt.getInt("FourthColor");

	      }
	      if(compoundnbt != null && compoundnbt.contains("FifthColor", 99)) {

	    	  model.FifthColor = compoundnbt.getInt("FifthColor");

	      }
      
		this.MainColor = model.MainColor;
		this.SecondaryColor = model.SecondaryColor;
		this.WhiteColor = model.WhiteColor;
		this.ThirdColor = model.ThirdColor;
		this.GlowyColor = model.GlowyColor;
		this.GrayColor = model.GrayColor;

        return (A) model;
		}
		else {
			christmas_bit_leggings model = new christmas_bit_leggings(1.0f);
			model.hat.visible = armorSlot == EquipmentSlotType.HEAD;

			model.young = _default.young;
	        model.crouching = _default.crouching;
	        model.riding = _default.riding;
	        model.rightArmPose = _default.rightArmPose;
	        model.leftArmPose = _default.leftArmPose;
	        
	        CompoundNBT compoundnbt = itemStack.getTagElement("displaymm");

		      if(compoundnbt != null && compoundnbt.contains("MainColor", 99)) {
		    	  //CompoundNBT maincompund = itemStack.getChildTag("MainColor");
		    	  //armorcolorer = compoundnbt.getInt("MainColor");
		    	  model.MainColor = compoundnbt.getInt("MainColor");

		      }
		      if(compoundnbt != null && compoundnbt.contains("SecondaryColor", 99)) {

		    	  model.SecondaryColor = compoundnbt.getInt("SecondaryColor");

		      }
		      
		      if(compoundnbt != null && compoundnbt.contains("WhiteColor", 99)) {

		    	  model.WhiteColor = compoundnbt.getInt("WhiteColor");

		      }
		      
		      if(compoundnbt != null && compoundnbt.contains("ThirdColor", 99)) {

		    	  model.ThirdColor = compoundnbt.getInt("ThirdColor");

		      }
		      
		      if(compoundnbt != null && compoundnbt.contains("GlowyColor", 99)) {

		    	  model.GlowyColor = compoundnbt.getInt("GlowyColor");

		      }
		      
		      if(compoundnbt != null && compoundnbt.contains("GrayColor", 99)) {

		    	  model.GrayColor = compoundnbt.getInt("GrayColor");

		      }
		      if(compoundnbt != null && compoundnbt.contains("FourthColor", 99)) {

		    	  model.FourthColor = compoundnbt.getInt("FourthColor");

		      }
		      if(compoundnbt != null && compoundnbt.contains("FifthColor", 99)) {

		    	  model.FifthColor = compoundnbt.getInt("FifthColor");

		      }
	      
			this.MainColor = model.MainColor;
			this.SecondaryColor = model.SecondaryColor;
			this.WhiteColor = model.WhiteColor;
			this.ThirdColor = model.ThirdColor;
			this.GlowyColor = model.GlowyColor;
			this.GrayColor = model.GrayColor;

	        return (A) model;
			}
        
//		if(slot == EquipmentSlotType.HEAD) {
//			protomanarmor_main model = new protomanarmor_main(1.0f);
//			model.bipedHeadwear.showModel = armorSlot == EquipmentSlotType.HEAD;
//		}
//		if(slot == EquipmentSlotType.CHEST) {
//			protomanarmor_chestplate modelchestplate = new protomanarmor_chestplate(1.0f);
//			model.bipedHeadwear.showModel = armorSlot == EquipmentSlotType.CHEST;
//
//        modelchestplate.isChild = _default.isChild;
//        modelchestplate.isSneak = _default.isSneak;
//        modelchestplate.isSitting = _default.isSitting;
//        modelchestplate.rightArmPose = _default.rightArmPose;
//        modelchestplate.leftArmPose = _default.leftArmPose;
//
//        return (A) modelchestplate;
//		}
	}
	
//
   // @Override
    //public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
    //    return null;
    //}

//	@Nullable
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
        return "megamanarmormod:textures/armor/christmas_bit.png";
    }
	
}

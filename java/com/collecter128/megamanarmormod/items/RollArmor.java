package com.collecter128.megamanarmormod.items;

import com.collecter128.megamanarmormod.client.models.axlarmor_leggings;
import com.collecter128.megamanarmormod.client.models.axlarmor_main;
import com.collecter128.megamanarmormod.client.models.hubstyle;
import com.collecter128.megamanarmormod.client.models.hubstyle_leggings;
import com.collecter128.megamanarmormod.client.models.roll;

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

public class RollArmor extends ArmorItem{
	
	public int MainColorDefault = 16731960;//Main Body Color red
	public int SecondaryColorDefault = 12708608;//Secondary Lime Green
	public int ThirdColorDefault = 16635420; //Hair Yellow
	public int WhiteColorDefault = 16777215;//Basic White
	public int GlowyColorDefault = 16749332;//Glow Orange
	public int GrayColorDefault = 6113907;//Black
	public int FourthColorDefault = 6113907; // Black
	public int MainColor = MainColorDefault;
	public int SecondaryColor = SecondaryColorDefault;
	public int ThirdColor = ThirdColorDefault;
	public int WhiteColor = WhiteColorDefault;
	public int GlowyColor = GlowyColorDefault;
	public int GrayColor = GrayColorDefault;
	public int FourthColor = FourthColorDefault;

	public RollArmor(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builderIn) {
		super(materialIn, slot, builderIn);
		
	}
	
	@OnlyIn(Dist.CLIENT)
	@Override
	public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
		
		//if(armorSlot != ) {
			roll model = new roll(1.0f, armorSlot);
		model.hat.visible = armorSlot == EquipmentSlotType.HEAD;

		model.young = _default.young;
        model.crouching = _default.crouching;
        model.riding = _default.riding;
        model.rightArmPose = _default.rightArmPose;
        model.leftArmPose = _default.leftArmPose;
        
        CompoundNBT compoundnbt = itemStack.getTagElement("displaymm");

	      if(compoundnbt != null && compoundnbt.contains("MainColor", 99)) {
	    	  model.MainColor = compoundnbt.getInt("MainColor");

	      }
//	      else
//	    	  itemStack.getOrCreateTagElement("displaymm").putInt("MainColor", MainColorDefault);
	      if(compoundnbt != null && compoundnbt.contains("SecondaryColor", 99)) {
	    	  model.SecondaryColor = compoundnbt.getInt("SecondaryColor");

	      }
//	      else
//	    	  itemStack.getOrCreateTagElement("displaymm").putInt("SecondaryColor", SecondaryColorDefault);
	      if(compoundnbt != null && compoundnbt.contains("WhiteColor", 99)) {
	    	  model.WhiteColor = compoundnbt.getInt("WhiteColor");

	      }
//	      else
//	    	  itemStack.getOrCreateTagElement("displaymm").putInt("WhiteColor", WhiteColorDefault);
	      if(compoundnbt != null && compoundnbt.contains("ThirdColor", 99)) {
	    	  model.ThirdColor = compoundnbt.getInt("ThirdColor");

	      }
//	      else
//	    	  itemStack.getOrCreateTagElement("displaymm").putInt("ThirdColor", ThirdColorDefault);
	      if(compoundnbt != null && compoundnbt.contains("GlowyColor", 99)) {
	    	  model.GlowyColor = compoundnbt.getInt("GlowyColor");

	      }
//	      else
//	    	  itemStack.getOrCreateTagElement("displaymm").putInt("GlowyColor", GlowyColorDefault);
	      if(compoundnbt != null && compoundnbt.contains("GrayColor", 99)) {
	    	  model.GrayColor = compoundnbt.getInt("GrayColor");

	      }
//	      else
//	    	  itemStack.getOrCreateTagElement("displaymm").putInt("GrayColor", GrayColorDefault);
	      if(compoundnbt != null && compoundnbt.contains("FourthColor", 99)) {
	    	  model.FourthColor = compoundnbt.getInt("FourthColor");

	      }
//	      else
//	    	  itemStack.getOrCreateTagElement("displaymm").putInt("FourthColor", FourthColorDefault);
	      
		this.MainColor = model.MainColor;
		this.SecondaryColor = model.SecondaryColor;
		this.WhiteColor = model.WhiteColor;
		this.ThirdColor = model.ThirdColor;
		this.GlowyColor = model.GlowyColor;
		this.GrayColor = model.GrayColor;

        return (A) model;
		//}
		
	}
	
//
   // @Override
    //public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
    //    return null;
    //}

//	@Nullable
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
        return "megamanarmormod:textures/armor/roll.png";
    }
	
}
package com.collecter128.megamanarmormod.items;

import com.collecter128.megamanarmormod.client.models.DrWilyCoatEvilColor;
import com.collecter128.megamanarmormod.client.models.Wily_Jacket;
import com.collecter128.megamanarmormod.client.models.megamanarmor_main;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;

public class WilyCoat extends ArmorItem{
	
	public int MainColorDefault = 16385505;//Main Body Color pinkypurpley Labcoat lining
	public int SecondaryColorDefault = 9900006;//Secondary Purple Color Evil Tie
	public int ThirdColorDefault = 16777215;
	public int WhiteColorDefault = 16777215;
	public int GlowyColorDefault = 5769606;//Glow? Darkness!
	public int GrayColorDefault = 16777215;//Labcoat color
	public int MainColor = MainColorDefault;
	public int SecondaryColor = SecondaryColorDefault;
	public int ThirdColor = ThirdColorDefault;
	public int WhiteColor = WhiteColorDefault;
	public int GlowyColor = GlowyColorDefault;
	public int GrayColor = GrayColorDefault;

	public WilyCoat(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builderIn) {
		super(materialIn, slot, builderIn);
		
	}
	
	@Override
	public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
		//Wily_Jacket model = new Wily_Jacket(1.0f);
		DrWilyCoatEvilColor model = new DrWilyCoatEvilColor(1.0f);
        model.bipedHeadwear.showModel = armorSlot == EquipmentSlotType.CHEST;
        
        model.isChild = _default.isChild;
        model.isSneak = _default.isSneak;
        model.isSitting = _default.isSitting;
        model.rightArmPose = _default.rightArmPose;
        model.leftArmPose = _default.leftArmPose;
        
        CompoundNBT compoundnbt = itemStack.getChildTag("displaymm");
	     // compoundnbt != null && compoundnbt.contains("MainColor", 99);
	      if(compoundnbt != null && compoundnbt.contains("MainColor", 99)) {
	    	  //CompoundNBT maincompund = itemStack.getChildTag("MainColor");
	    	  //armorcolorer = compoundnbt.getInt("MainColor");
	    	  model.MainColor = compoundnbt.getInt("MainColor");
				//model.MainColor = maincompund.getInt("MainColor");
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
	      
			this.MainColor = model.MainColor;
			this.SecondaryColor = model.SecondaryColor;
			this.WhiteColor = model.WhiteColor;
			this.ThirdColor = model.ThirdColor;
			this.GlowyColor = model.GlowyColor;
			this.GrayColor = model.GrayColor;

        return (A) model;
	}
	
	public void colorize(int[]colors, ItemStack stack) {
		stack.getOrCreateChildTag("displaymm").putInt("MainColor", colors[0]);
		stack.getOrCreateChildTag("displaymm").putInt("SecondaryColor", colors[1]);
		stack.getOrCreateChildTag("displaymm").putInt("ThirdColor", colors[2]);
		stack.getOrCreateChildTag("displaymm").putInt("WhiteColor", colors[3]);
		stack.getOrCreateChildTag("displaymm").putInt("GlowyColor", colors[4]);
		stack.getOrCreateChildTag("displaymm").putInt("GrayColor", colors[5]);
	}
	
	public static int[] getdefaultcolors() {
		int[] colors = new int[4];
		colors[0] = 16385505;
		colors[1] = 9900006;
		colors[2] = 16777215;
		colors[3] = 16777215;
		colors[4] = 5769606;
		colors[5] = 16777215;
		return colors;
	}
	
	public static int getColor(ItemStack itemStackIn) {
	      CompoundNBT compoundnbt = itemStackIn.getTag();
	      if (compoundnbt != null && compoundnbt.contains("MainColor", 99)) {
	         return compoundnbt.getInt("MainColor");
	      } else {
	         return  16385505;
	      }
	   }
	
//
   // @Override
    //public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
    //    return null;
    //}

//	@Nullable
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
        //if nbt
    	//	return specialarmor texture? 
    	//else
    	return "megamanarmormod:textures/armor/wily_coat.png";
    }
	
}

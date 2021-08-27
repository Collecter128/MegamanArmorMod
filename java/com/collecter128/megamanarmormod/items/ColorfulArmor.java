package com.collecter128.megamanarmormod.items;

import com.collecter128.megamanarmormod.core.Imorecolorfularmor;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.DyeColor;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.IDyeableArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ColorfulArmor extends ArmorItem implements Imorecolorfularmor {

	public ColorfulArmor(IArmorMaterial Amaterial, EquipmentSlotType equipSlot, Item.Properties properties) {
		super(Amaterial, equipSlot, properties);
	}
	
	//from shield?
//	public static DyeColor getColor(ItemStack stack) {
//	      return DyeColor.byId(stack.getOrCreateChildTag("BlockEntityTag").getInt("Base"));
//	   }
}

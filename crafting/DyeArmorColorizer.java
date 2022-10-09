package com.collecter128.megamanarmormod.items.crafting;

import java.util.List;

import com.collecter128.megamanarmormod.core.Imorecolorfularmor;
import com.collecter128.megamanarmormod.items.ArmorColorizerCustom;
import com.google.common.collect.Lists;

import net.minecraft.inventory.CraftingInventory;
import net.minecraft.item.DyeItem;
import net.minecraft.item.IDyeableArmorItem;
//import net.minecraft.item.IDyeableArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.ArmorDyeRecipe;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.SpecialRecipe;
import net.minecraft.item.crafting.SpecialRecipeSerializer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class DyeArmorColorizer extends SpecialRecipe {//extends ArmorDyeRecipe
	public DyeArmorColorizer(ResourceLocation idIn) {
	      super(idIn);
	   }
	
	
//	public ArmorDyeRecipe(ResourceLocation idIn) {
//	      super(idIn);
//	   }
	   SpecialRecipeSerializer<DyeArmorColorizer> CRAFTING_SPECIAL_ARMORCOLORIZERDYE = IRecipeSerializer.register("crafting_special_armorcolorizerdye", new SpecialRecipeSerializer<>(DyeArmorColorizer::new));
	   /**
	    * Used to check if a recipe matches current crafting inventory
	    */
	   @Override
	   public boolean matches(CraftingInventory inv, World worldIn) {
	      ItemStack itemstack = ItemStack.EMPTY;
	      List<ItemStack> list = Lists.newArrayList();

	      for(int i = 0; i < inv.getContainerSize(); ++i) {
	         ItemStack itemstack1 = inv.getItem(i);
	         if (!itemstack1.isEmpty()) {
	            if (itemstack1.getItem() instanceof ArmorColorizerCustom) {
	               if (!itemstack.isEmpty()) {
	                  return false;
	               }

	               itemstack = itemstack1;
	            } else {
	               if (!(itemstack1.getItem() instanceof DyeItem)) {
	                  return false;
	               }

	               list.add(itemstack1);
	            }
	         }
	      }

	      return !itemstack.isEmpty() && !list.isEmpty();
	   }

	   /**
	    * Returns an Item that is the result of this recipe
	    */
	   public ItemStack getCraftingResult(CraftingInventory inv) {
	      List<DyeItem> list = Lists.newArrayList();
	      ItemStack itemstack = ItemStack.EMPTY;

	      for(int i = 0; i < inv.getContainerSize(); ++i) {
	         ItemStack itemstack1 = inv.getItem(i);
	         if (!itemstack1.isEmpty()) {
	            Item item = itemstack1.getItem();
	            if (item instanceof ArmorColorizerCustom) {//Imorecolorfularmor
	               if (!itemstack.isEmpty()) {
	                  return ItemStack.EMPTY;
	               }

	               itemstack = itemstack1.copy();
	            } else {
	               if (!(item instanceof DyeItem)) {
	                  return ItemStack.EMPTY;
	               }

	               list.add((DyeItem)item);
	            }
	         }
	      }

	      return !itemstack.isEmpty() && !list.isEmpty() ? IDyeableArmorItem.dyeArmor(itemstack, list) : ItemStack.EMPTY;
	   }
	   
//	   public ItemStack customitemcolor(ItemStack item) {
//		   IDyeableArmorItem.dyeItem(itemstack, list)
//		   return item;
//	   }

	   /**
	    * Used to determine if this recipe can fit in a grid of the given width/height
	    */
	   public boolean canFit(int width, int height) {
	      return width * height >= 2;
	   }

	   @Override
	   public IRecipeSerializer<?> getSerializer() {
	      return CRAFTING_SPECIAL_ARMORCOLORIZERDYE;
	   }

	@Override
	public ItemStack assemble(CraftingInventory p_77572_1_) {
		List<DyeItem> list = Lists.newArrayList();
	      ItemStack itemstack = ItemStack.EMPTY;

	      for(int i = 0; i < p_77572_1_.getContainerSize(); ++i) {
	         ItemStack itemstack1 = p_77572_1_.getItem(i);
	         if (!itemstack1.isEmpty()) {
	            Item item = itemstack1.getItem();
	            if (item instanceof IDyeableArmorItem) {
	               if (!itemstack.isEmpty()) {
	                  return ItemStack.EMPTY;
	               }

	               itemstack = itemstack1.copy();
	            } else {
	               if (!(item instanceof DyeItem)) {
	                  return ItemStack.EMPTY;
	               }

	               list.add((DyeItem)item);
	            }
	         }
	      }

	      return !itemstack.isEmpty() && !list.isEmpty() ? IDyeableArmorItem.dyeArmor(itemstack, list) : ItemStack.EMPTY;
	}

	@Override
	public boolean canCraftInDimensions(int p_194133_1_, int p_194133_2_) {
		return p_194133_1_ * p_194133_2_ >= 2;
	}

	
}

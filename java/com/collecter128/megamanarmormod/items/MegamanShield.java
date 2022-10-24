package com.collecter128.megamanarmormod.items;

import java.awt.Color;
import java.util.List;
import java.util.Objects;
import java.util.Random;

import javax.annotation.Nullable;

import com.collecter128.megamanarmormod.core.ItemInit;

import net.minecraft.block.AbstractBannerBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.DispenserBlock;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.client.renderer.entity.model.ShieldModel;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.item.ArmorStandEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.BannerItem;
import net.minecraft.item.DyeColor;
import net.minecraft.item.IDyeableArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.UseAction;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.stats.Stats;
import net.minecraft.tags.ItemTags;
import net.minecraft.tileentity.MobSpawnerTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.spawner.AbstractSpawner;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class MegamanShield extends Item{

	public MegamanShield(Item.Properties p_i48470_1_) {
	      super(p_i48470_1_);
	      DispenserBlock.registerBehavior(this, ArmorItem.DISPENSE_ITEM_BEHAVIOR);
	   }

	   public String getDescriptionId(ItemStack p_77667_1_) {
	      return p_77667_1_.getTagElement("BlockEntityTag") != null ? this.getDescriptionId() + '.' + getColor(p_77667_1_).getName() : super.getDescriptionId(p_77667_1_);
	   }

	   @OnlyIn(Dist.CLIENT)
	   public void appendHoverText(ItemStack p_77624_1_, @Nullable World p_77624_2_, List<ITextComponent> p_77624_3_, ITooltipFlag p_77624_4_) {
	      BannerItem.appendHoverTextFromBannerBlockEntityTag(p_77624_1_, p_77624_3_);
	   }

	   public UseAction getUseAnimation(ItemStack p_77661_1_) {
	      return UseAction.BLOCK;
	   }

	   public int getUseDuration(ItemStack p_77626_1_) {
	      return 72000;
	   }

	   public ActionResult<ItemStack> use(World p_77659_1_, PlayerEntity p_77659_2_, Hand p_77659_3_) {
	      ItemStack itemstack = p_77659_2_.getItemInHand(p_77659_3_);
	      p_77659_2_.startUsingItem(p_77659_3_);
	      return ActionResult.consume(itemstack);
	   }

	   public boolean isValidRepairItem(ItemStack p_82789_1_, ItemStack p_82789_2_) {
	      boolean isIngot = false;
	      if(p_82789_2_.getItem() == ItemInit.SpecialSteel.get()) {
	    	  isIngot = true;
	      }
		   return isIngot || super.isValidRepairItem(p_82789_1_, p_82789_2_);
	   }

	   public static DyeColor getColor(ItemStack p_195979_0_) {
	      return DyeColor.byId(p_195979_0_.getOrCreateTagElement("BlockEntityTag").getInt("Base"));
	   }
}

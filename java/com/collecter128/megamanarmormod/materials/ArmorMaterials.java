package com.collecter128.megamanarmormod.materials;

import java.util.function.Supplier;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.item.Items;
import net.minecraft.block.Blocks;

import com.collecter128.megamanarmormod.core.ItemInit;;

public enum ArmorMaterials implements IArmorMaterial{
	
	MegamanArmor("megamanarmor", 6, new int[] {2, 5, 6, 3}, 6, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1f, 0.1f, () -> Ingredient.fromItems(ItemInit.Ceratanium.get())),
	LightLabcoat("lightlabcoat", 6, new int[] {1, 2, 3, 1}, 3, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f, 0f, () -> Ingredient.fromItems(Blocks.WHITE_WOOL)),
	ProtomanArmor("protomanarmor", 6, new int[] {2, 5, 6, 3}, 6, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1f, 0.1f, () -> Ingredient.fromItems(ItemInit.Ceratanium.get())),
	
	WilyLabcoat("wilylabcoat", 6, new int[] {1, 2, 3, 1}, 3, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f, 0f, () -> Ingredient.fromItems(Blocks.WHITE_WOOL)),
	BassArmor("bassarmor", 6, new int[] {2, 5, 6, 2}, 7, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1f, 0.1f, () -> Ingredient.fromItems(ItemInit.Fortenium.get())),
	
	XArmor("xarmor", 6, new int[] {2, 5, 6, 3}, 6, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1f, 0.1f, () -> Ingredient.fromItems(ItemInit.TitaniumX.get())),
	XTransparentArmor("xtransparentarmor", 6, new int[] {2, 5, 7, 3}, 6, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1f, 0.1f, () -> Ingredient.fromItems(ItemInit.TitaniumX.get())),
	
	ZeroArmor("zeroarmor", 6, new int[] {2, 5, 7, 3}, 6, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1f, 0.1f, () -> Ingredient.fromItems(ItemInit.TitaniumX.get())),
	SigmaArmor("sigmaarmor", 7, new int[] {3, 6, 8, 4}, 8, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2f, 0.2f, () -> Ingredient.fromItems(ItemInit.TitaniumX.get())),
	VileArmor("vilearmor", 6, new int[] {2, 5, 7, 3}, 8, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2f, 0.2f, () -> Ingredient.fromItems(ItemInit.TitaniumX.get())),;
	
	public static final int[] basedurability = {128, 144, 160, 112};
	private final String name;
	private final int durabilityMultiplier;
	private final int[] armorValue;
	private final int enchantibility;
	private final SoundEvent equipSound;
	private final float toughness;
	private final float knockbackresistance;
	private final Ingredient RepairIngredient;

	ArmorMaterials(String name, int durabilityMultiplier, int[] armorValue, int enchantibility, SoundEvent equipSound, float toughness, float knockbackresistance, Supplier<Ingredient> RepairIngredient){
		this.name = name;
		this.durabilityMultiplier = durabilityMultiplier;
		this.armorValue = armorValue;
		this.enchantibility = enchantibility;
		this.equipSound = equipSound;
		this.toughness = toughness;
		this.knockbackresistance = knockbackresistance;
		this.RepairIngredient = RepairIngredient.get();
	}
	
	@Override
	public int getDurability(EquipmentSlotType slotIn) {
		return this.basedurability[slotIn.getIndex()] * this.durabilityMultiplier;
	}

	@Override
	public int getDamageReductionAmount(EquipmentSlotType slotIn) {
		return this.armorValue[slotIn.getIndex()];
	}

	@Override
	public int getEnchantability() {
		return this.enchantibility;
	}

	@Override
	public SoundEvent getSoundEvent() {
		return this.equipSound;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return this.RepairIngredient;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public float getToughness() {
		return this.toughness;
	}

	@Override
	public float getKnockbackResistance() {
		return this.knockbackresistance;
	}

}

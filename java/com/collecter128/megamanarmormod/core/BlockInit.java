package com.collecter128.megamanarmormod.core;

import com.collecter128.megamanarmormod.MegamanArmorMod;
import com.collecter128.megamanarmormod.blocks.colorizerluckyblock;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

	public static final DeferredRegister<Block> Blocks = DeferredRegister.create(ForgeRegistries.BLOCKS, "megamanarmormod"); //MegamanArmorMod.Mod_ID
	
	public static final RegistryObject<Block> CerataniumOre = Blocks.register("ceratanium_ore",
			() -> new Block((AbstractBlock.Properties.create(Material.ROCK, MaterialColor.BLUE).harvestTool(ToolType.PICKAXE)
					.setRequiresTool().hardnessAndResistance(3.0F, 3.0F)) //.group(MegamanArmorMod.MMTab)
					.sound(SoundType.CORAL)));//MegamanArmorMod.ArmorItems_Group  .group(MegamanArmorMod.MMTab)
	
	public static final RegistryObject<Block> CustomizerOre = Blocks.register("colorizerluckyblock",
			() -> new colorizerluckyblock((AbstractBlock.Properties.create(Material.ANVIL, MaterialColor.EMERALD)
					.setRequiresTool().hardnessAndResistance(3.0F)) //.group(MegamanArmorMod.MMTab)
					.sound(SoundType.BAMBOO)));//MegamanArmorMod.ArmorItems_Group  .group(MegamanArmorMod.MMTab)
}

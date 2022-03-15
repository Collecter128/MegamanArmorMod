package com.collecter128.megamanarmormod.core;

import net.minecraft.block.BlockState;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class FeatureInit {
	
	public static void addOres(BiomeLoadingEvent event) {
		addOre(event, OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, 
				BlockInit.CerataniumOre.get().getDefaultState(), 5, 0, 30, 8);
	}
	
	public static void addOre(final BiomeLoadingEvent event, RuleTest testrule, BlockState state, int veinsize, int MinHeight, int MaxHeight, int amount) {
		event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, 
				Feature.ORE.withConfiguration(new OreFeatureConfig(testrule, state, veinsize))
				.withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(MinHeight, 0, MaxHeight))).square().func_242731_b(amount));
		//min height, offset, maximum height, 
	}

}

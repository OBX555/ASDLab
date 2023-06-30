
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package org.gsdistance.obx.adslab.init;

import org.gsdistance.obx.adslab.block.SoftRubbyOreBlock;
import org.gsdistance.obx.adslab.block.RubbyOreBlock;
import org.gsdistance.obx.adslab.block.DeepslateSoftRubbyOreBlock;
import org.gsdistance.obx.adslab.block.DeepslateRubbbyBlock;
import org.gsdistance.obx.adslab.block.BlueiumWoodBlock;
import org.gsdistance.obx.adslab.block.BlueiumLeavesBlock;
import org.gsdistance.obx.adslab.block.BlueiumGrassBlock;
import org.gsdistance.obx.adslab.block.BlueiumDirtBlock;
import org.gsdistance.obx.adslab.block.BlueiumDimensionPortalBlock;
import org.gsdistance.obx.adslab.block.BlueiumBerryBlockBlock;
import org.gsdistance.obx.adslab.AsdlabMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class AsdlabModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AsdlabMod.MODID);
	public static final RegistryObject<Block> RUBBY_ORE = REGISTRY.register("rubby_ore", () -> new RubbyOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_RUBBBY = REGISTRY.register("deepslate_rubbby", () -> new DeepslateRubbbyBlock());
	public static final RegistryObject<Block> SOFT_RUBBY_ORE = REGISTRY.register("soft_rubby_ore", () -> new SoftRubbyOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_SOFT_RUBBY_ORE = REGISTRY.register("deepslate_soft_rubby_ore", () -> new DeepslateSoftRubbyOreBlock());
	public static final RegistryObject<Block> BLUEIUM_WOOD = REGISTRY.register("blueium_wood", () -> new BlueiumWoodBlock());
	public static final RegistryObject<Block> BLUEIUM_LEAVES = REGISTRY.register("blueium_leaves", () -> new BlueiumLeavesBlock());
	public static final RegistryObject<Block> BLUEIUM_DIRT = REGISTRY.register("blueium_dirt", () -> new BlueiumDirtBlock());
	public static final RegistryObject<Block> BLUEIUM_GRASS = REGISTRY.register("blueium_grass", () -> new BlueiumGrassBlock());
	public static final RegistryObject<Block> BLUEIUM_BERRY_BLOCK = REGISTRY.register("blueium_berry_block", () -> new BlueiumBerryBlockBlock());
	public static final RegistryObject<Block> BLUEIUM_DIMENSION_PORTAL = REGISTRY.register("blueium_dimension_portal", () -> new BlueiumDimensionPortalBlock());
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package org.gsdistance.obx.adslab.init;

import org.gsdistance.obx.adslab.item.UpItem;
import org.gsdistance.obx.adslab.item.ToastedsliceofbreadItem;
import org.gsdistance.obx.adslab.item.TimeItem;
import org.gsdistance.obx.adslab.item.SteelSytcheItem;
import org.gsdistance.obx.adslab.item.SteelStickItem;
import org.gsdistance.obx.adslab.item.SteelIngotItem;
import org.gsdistance.obx.adslab.item.Soulgem4Item;
import org.gsdistance.obx.adslab.item.SoulItem;
import org.gsdistance.obx.adslab.item.SoulGemItem;
import org.gsdistance.obx.adslab.item.SoulGem3Item;
import org.gsdistance.obx.adslab.item.SoulGem2Item;
import org.gsdistance.obx.adslab.item.SoftRubbyItem;
import org.gsdistance.obx.adslab.item.SliceofbreadItem;
import org.gsdistance.obx.adslab.item.RubbyItem;
import org.gsdistance.obx.adslab.item.RightItem;
import org.gsdistance.obx.adslab.item.ReapersSytcheItem;
import org.gsdistance.obx.adslab.item.ReapersSytche3Item;
import org.gsdistance.obx.adslab.item.ReapersSytche2Item;
import org.gsdistance.obx.adslab.item.PngforwelcomeadvancmentItem;
import org.gsdistance.obx.adslab.item.PackagedBloodItem;
import org.gsdistance.obx.adslab.item.PackagedBlood3Item;
import org.gsdistance.obx.adslab.item.PackagedBlood2Item;
import org.gsdistance.obx.adslab.item.MiniStoneGeneratorItem;
import org.gsdistance.obx.adslab.item.LongsteelstickItem;
import org.gsdistance.obx.adslab.item.LeftItem;
import org.gsdistance.obx.adslab.item.HotSteelItem;
import org.gsdistance.obx.adslab.item.HotRubbyItem;
import org.gsdistance.obx.adslab.item.HotHardRubbyItem;
import org.gsdistance.obx.adslab.item.HotForgedSteelItem;
import org.gsdistance.obx.adslab.item.HotForgedSteel7Item;
import org.gsdistance.obx.adslab.item.HotForgedSteel6Item;
import org.gsdistance.obx.adslab.item.HotForgedSteel4Item;
import org.gsdistance.obx.adslab.item.HotForgedSteel3Item;
import org.gsdistance.obx.adslab.item.HotForgedSteel2Item;
import org.gsdistance.obx.adslab.item.HardRubbyItem;
import org.gsdistance.obx.adslab.item.HardRubby2Item;
import org.gsdistance.obx.adslab.item.ForgedSteelItem;
import org.gsdistance.obx.adslab.item.ForgedSteel8Item;
import org.gsdistance.obx.adslab.item.ForgedSteel7Item;
import org.gsdistance.obx.adslab.item.ForgedSteel6Item;
import org.gsdistance.obx.adslab.item.ForgedSteel5Item;
import org.gsdistance.obx.adslab.item.ForgedSteel4Item;
import org.gsdistance.obx.adslab.item.ForgedSteel3Item;
import org.gsdistance.obx.adslab.item.ForgedSteel2Item;
import org.gsdistance.obx.adslab.item.ForgedHotSteelItem;
import org.gsdistance.obx.adslab.item.DownItem;
import org.gsdistance.obx.adslab.item.DiaitemdothatsItem;
import org.gsdistance.obx.adslab.item.CombinedSoulItem;
import org.gsdistance.obx.adslab.item.CarbonCoalItem;
import org.gsdistance.obx.adslab.item.BlueiumDimensionItem;
import org.gsdistance.obx.adslab.item.BlueiumBerryItem;
import org.gsdistance.obx.adslab.item.BloodyBoneSwordItem;
import org.gsdistance.obx.adslab.item.BloodyBoneItem;
import org.gsdistance.obx.adslab.item.BloodItem;
import org.gsdistance.obx.adslab.AsdlabMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

public class AsdlabModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AsdlabMod.MODID);
	public static final RegistryObject<Item> BLOOD = REGISTRY.register("blood", () -> new BloodItem());
	public static final RegistryObject<Item> PNGFORWELCOMEADVANCMENT = REGISTRY.register("pngforwelcomeadvancment", () -> new PngforwelcomeadvancmentItem());
	public static final RegistryObject<Item> BLOODY_BONE = REGISTRY.register("bloody_bone", () -> new BloodyBoneItem());
	public static final RegistryObject<Item> UNEXPERIENCED_VAMPIRE_SPAWN_EGG = REGISTRY.register("unexperienced_vampire_spawn_egg", () -> new ForgeSpawnEggItem(AsdlabModEntities.UNEXPERIENCED_VAMPIRE, -16777216, -13434880, new Item.Properties()));
	public static final RegistryObject<Item> BLOODY_BONE_SWORD = REGISTRY.register("bloody_bone_sword", () -> new BloodyBoneSwordItem());
	public static final RegistryObject<Item> STEEL_INGOT = REGISTRY.register("steel_ingot", () -> new SteelIngotItem());
	public static final RegistryObject<Item> CARBON_COAL = REGISTRY.register("carbon_coal", () -> new CarbonCoalItem());
	public static final RegistryObject<Item> STEEL_STICK = REGISTRY.register("steel_stick", () -> new SteelStickItem());
	public static final RegistryObject<Item> LONGSTEELSTICK = REGISTRY.register("longsteelstick", () -> new LongsteelstickItem());
	public static final RegistryObject<Item> STEEL_SYTCHE = REGISTRY.register("steel_sytche", () -> new SteelSytcheItem());
	public static final RegistryObject<Item> RUBBY_ORE = block(AsdlabModBlocks.RUBBY_ORE);
	public static final RegistryObject<Item> RUBBY = REGISTRY.register("rubby", () -> new RubbyItem());
	public static final RegistryObject<Item> DEEPSLATE_RUBBBY = block(AsdlabModBlocks.DEEPSLATE_RUBBBY);
	public static final RegistryObject<Item> SOUL = REGISTRY.register("soul", () -> new SoulItem());
	public static final RegistryObject<Item> SOUL_GEM = REGISTRY.register("soul_gem", () -> new SoulGemItem());
	public static final RegistryObject<Item> REAPERS_SYTCHE = REGISTRY.register("reapers_sytche", () -> new ReapersSytcheItem());
	public static final RegistryObject<Item> HOT_STEEL = REGISTRY.register("hot_steel", () -> new HotSteelItem());
	public static final RegistryObject<Item> FORGED_STEEL = REGISTRY.register("forged_steel", () -> new ForgedSteelItem());
	public static final RegistryObject<Item> FORGED_HOT_STEEL = REGISTRY.register("forged_hot_steel", () -> new ForgedHotSteelItem());
	public static final RegistryObject<Item> FORGED_STEEL_2 = REGISTRY.register("forged_steel_2", () -> new ForgedSteel2Item());
	public static final RegistryObject<Item> HOT_FORGED_STEEL_2 = REGISTRY.register("hot_forged_steel_2", () -> new HotForgedSteel2Item());
	public static final RegistryObject<Item> FORGED_STEEL_3 = REGISTRY.register("forged_steel_3", () -> new ForgedSteel3Item());
	public static final RegistryObject<Item> HOT_FORGED_STEEL_3 = REGISTRY.register("hot_forged_steel_3", () -> new HotForgedSteel3Item());
	public static final RegistryObject<Item> FORGED_STEEL_4 = REGISTRY.register("forged_steel_4", () -> new ForgedSteel4Item());
	public static final RegistryObject<Item> HOT_FORGED_STEEL_4 = REGISTRY.register("hot_forged_steel_4", () -> new HotForgedSteel4Item());
	public static final RegistryObject<Item> FORGED_STEEL_5 = REGISTRY.register("forged_steel_5", () -> new ForgedSteel5Item());
	public static final RegistryObject<Item> SOUL_GEM_2 = REGISTRY.register("soul_gem_2", () -> new SoulGem2Item());
	public static final RegistryObject<Item> REAPERS_SYTCHE_2 = REGISTRY.register("reapers_sytche_2", () -> new ReapersSytche2Item());
	public static final RegistryObject<Item> HOT_RUBBY = REGISTRY.register("hot_rubby", () -> new HotRubbyItem());
	public static final RegistryObject<Item> HARD_RUBBY = REGISTRY.register("hard_rubby", () -> new HardRubbyItem());
	public static final RegistryObject<Item> HOT_HARD_RUBBY = REGISTRY.register("hot_hard_rubby", () -> new HotHardRubbyItem());
	public static final RegistryObject<Item> HARD_RUBBY_2 = REGISTRY.register("hard_rubby_2", () -> new HardRubby2Item());
	public static final RegistryObject<Item> PACKAGED_BLOOD = REGISTRY.register("packaged_blood", () -> new PackagedBloodItem());
	public static final RegistryObject<Item> VAMPIRE_SPAWN_EGG = REGISTRY.register("vampire_spawn_egg", () -> new ForgeSpawnEggItem(AsdlabModEntities.VAMPIRE, -16777216, -14811136, new Item.Properties()));
	public static final RegistryObject<Item> SOUL_GEM_3 = REGISTRY.register("soul_gem_3", () -> new SoulGem3Item());
	public static final RegistryObject<Item> PACKAGED_BLOOD_2 = REGISTRY.register("packaged_blood_2", () -> new PackagedBlood2Item());
	public static final RegistryObject<Item> HOT_FORGED_STEEL = REGISTRY.register("hot_forged_steel", () -> new HotForgedSteelItem());
	public static final RegistryObject<Item> FORGED_STEEL_6 = REGISTRY.register("forged_steel_6", () -> new ForgedSteel6Item());
	public static final RegistryObject<Item> HOT_FORGED_STEEL_6 = REGISTRY.register("hot_forged_steel_6", () -> new HotForgedSteel6Item());
	public static final RegistryObject<Item> FORGED_STEEL_7 = REGISTRY.register("forged_steel_7", () -> new ForgedSteel7Item());
	public static final RegistryObject<Item> REAPERS_SYTCHE_3 = REGISTRY.register("reapers_sytche_3", () -> new ReapersSytche3Item());
	public static final RegistryObject<Item> SOFT_RUBBY = REGISTRY.register("soft_rubby", () -> new SoftRubbyItem());
	public static final RegistryObject<Item> HOT_FORGED_STEEL_7 = REGISTRY.register("hot_forged_steel_7", () -> new HotForgedSteel7Item());
	public static final RegistryObject<Item> FORGED_STEEL_8 = REGISTRY.register("forged_steel_8", () -> new ForgedSteel8Item());
	public static final RegistryObject<Item> MINI_STONE_GENERATOR = REGISTRY.register("mini_stone_generator", () -> new MiniStoneGeneratorItem());
	public static final RegistryObject<Item> SLICEOFBREAD = REGISTRY.register("sliceofbread", () -> new SliceofbreadItem());
	public static final RegistryObject<Item> TOASTEDSLICEOFBREAD = REGISTRY.register("toastedsliceofbread", () -> new ToastedsliceofbreadItem());
	public static final RegistryObject<Item> RIGHT = REGISTRY.register("right", () -> new RightItem());
	public static final RegistryObject<Item> LEFT = REGISTRY.register("left", () -> new LeftItem());
	public static final RegistryObject<Item> UP = REGISTRY.register("up", () -> new UpItem());
	public static final RegistryObject<Item> DOWN = REGISTRY.register("down", () -> new DownItem());
	public static final RegistryObject<Item> TIME = REGISTRY.register("time", () -> new TimeItem());
	public static final RegistryObject<Item> SOFT_RUBBY_ORE = block(AsdlabModBlocks.SOFT_RUBBY_ORE);
	public static final RegistryObject<Item> DEEPSLATE_SOFT_RUBBY_ORE = block(AsdlabModBlocks.DEEPSLATE_SOFT_RUBBY_ORE);
	public static final RegistryObject<Item> SOULGEM_4 = REGISTRY.register("soulgem_4", () -> new Soulgem4Item());
	public static final RegistryObject<Item> DIAITEMDOTHATS = REGISTRY.register("diaitemdothats", () -> new DiaitemdothatsItem());
	public static final RegistryObject<Item> BLUEIUM_WOOD = block(AsdlabModBlocks.BLUEIUM_WOOD);
	public static final RegistryObject<Item> BLUEIUM_LEAVES = block(AsdlabModBlocks.BLUEIUM_LEAVES);
	public static final RegistryObject<Item> BLUEIUM_DIRT = block(AsdlabModBlocks.BLUEIUM_DIRT);
	public static final RegistryObject<Item> BLUEIUM_GRASS = block(AsdlabModBlocks.BLUEIUM_GRASS);
	public static final RegistryObject<Item> BLUEIUM_BERRY = REGISTRY.register("blueium_berry", () -> new BlueiumBerryItem());
	public static final RegistryObject<Item> BLUEIUM_BERRY_BLOCK = block(AsdlabModBlocks.BLUEIUM_BERRY_BLOCK);
	public static final RegistryObject<Item> BLUEIUM_DIMENSION = REGISTRY.register("blueium_dimension", () -> new BlueiumDimensionItem());
	public static final RegistryObject<Item> LIVING_CHEESE_BLOCK_SPAWN_EGG = REGISTRY.register("living_cheese_block_spawn_egg", () -> new ForgeSpawnEggItem(AsdlabModEntities.LIVING_CHEESE_BLOCK, -4468, -7680, new Item.Properties()));
	public static final RegistryObject<Item> VAMPIRE_TIER_1_SPAWN_EGG = REGISTRY.register("vampire_tier_1_spawn_egg", () -> new ForgeSpawnEggItem(AsdlabModEntities.VAMPIRE_TIER_1, -12517376, -65536, new Item.Properties()));
	public static final RegistryObject<Item> PACKAGED_BLOOD_3 = REGISTRY.register("packaged_blood_3", () -> new PackagedBlood3Item());
	public static final RegistryObject<Item> COMBINED_SOUL = REGISTRY.register("combined_soul", () -> new CombinedSoulItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}

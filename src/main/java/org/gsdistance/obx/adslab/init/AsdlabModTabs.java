
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package org.gsdistance.obx.adslab.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AsdlabModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(AsdlabModItems.LIVING_CHEESE_BLOCK_SPAWN_EGG.get());
		}

		if (tabData.getTab() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(AsdlabModItems.STEEL_INGOT.get());
			tabData.accept(AsdlabModItems.CARBON_COAL.get());
			tabData.accept(AsdlabModItems.STEEL_STICK.get());
			tabData.accept(AsdlabModItems.LONGSTEELSTICK.get());
			tabData.accept(AsdlabModItems.RUBBY.get());
			tabData.accept(AsdlabModItems.HOT_STEEL.get());
			tabData.accept(AsdlabModItems.FORGED_STEEL.get());
			tabData.accept(AsdlabModItems.FORGED_HOT_STEEL.get());
			tabData.accept(AsdlabModItems.FORGED_STEEL_2.get());
			tabData.accept(AsdlabModItems.HOT_FORGED_STEEL_2.get());
			tabData.accept(AsdlabModItems.FORGED_STEEL_3.get());
			tabData.accept(AsdlabModItems.HOT_FORGED_STEEL_3.get());
			tabData.accept(AsdlabModItems.FORGED_STEEL_4.get());
			tabData.accept(AsdlabModItems.HOT_FORGED_STEEL_4.get());
			tabData.accept(AsdlabModItems.FORGED_STEEL_5.get());
			tabData.accept(AsdlabModItems.HOT_RUBBY.get());
			tabData.accept(AsdlabModItems.HARD_RUBBY.get());
			tabData.accept(AsdlabModItems.HOT_HARD_RUBBY.get());
			tabData.accept(AsdlabModItems.HARD_RUBBY_2.get());
			tabData.accept(AsdlabModItems.HOT_FORGED_STEEL.get());
			tabData.accept(AsdlabModItems.FORGED_STEEL_6.get());
			tabData.accept(AsdlabModItems.HOT_FORGED_STEEL_6.get());
			tabData.accept(AsdlabModItems.FORGED_STEEL_7.get());
			tabData.accept(AsdlabModItems.SOFT_RUBBY.get());
			tabData.accept(AsdlabModItems.HOT_FORGED_STEEL_7.get());
			tabData.accept(AsdlabModItems.FORGED_STEEL_8.get());
			tabData.accept(AsdlabModItems.RIGHT.get());
			tabData.accept(AsdlabModItems.LEFT.get());
			tabData.accept(AsdlabModItems.UP.get());
			tabData.accept(AsdlabModItems.DOWN.get());
		}

		if (tabData.getTab() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(AsdlabModItems.STEEL_SYTCHE.get());
			tabData.accept(AsdlabModItems.MINI_STONE_GENERATOR.get());
		}

		if (tabData.getTab() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(AsdlabModBlocks.RUBBY_ORE.get().asItem());
			tabData.accept(AsdlabModBlocks.DEEPSLATE_RUBBBY.get().asItem());
			tabData.accept(AsdlabModBlocks.SOFT_RUBBY_ORE.get().asItem());
		}

		if (tabData.getTab() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(AsdlabModItems.SLICEOFBREAD.get());
			tabData.accept(AsdlabModItems.TOASTEDSLICEOFBREAD.get());
		}
	}

	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("asdlab", "items_blocks"),
				builder -> builder.title(Component.translatable("item_group.asdlab.items_blocks")).icon(() -> new ItemStack(AsdlabModItems.BLOOD.get())).displayItems((parameters, tabData) -> {
					tabData.accept(AsdlabModItems.BLOOD.get());
					tabData.accept(AsdlabModItems.BLOODY_BONE.get());
					tabData.accept(AsdlabModItems.UNEXPERIENCED_VAMPIRE_SPAWN_EGG.get());
					tabData.accept(AsdlabModItems.BLOODY_BONE_SWORD.get());
					tabData.accept(AsdlabModItems.SOUL.get());
					tabData.accept(AsdlabModItems.SOUL_GEM.get());
					tabData.accept(AsdlabModItems.REAPERS_SYTCHE.get());
					tabData.accept(AsdlabModItems.SOUL_GEM_2.get());
					tabData.accept(AsdlabModItems.REAPERS_SYTCHE_2.get());
					tabData.accept(AsdlabModItems.PACKAGED_BLOOD.get());
					tabData.accept(AsdlabModItems.VAMPIRE_SPAWN_EGG.get());
					tabData.accept(AsdlabModItems.SOUL_GEM_3.get());
					tabData.accept(AsdlabModItems.PACKAGED_BLOOD_2.get());
					tabData.accept(AsdlabModItems.REAPERS_SYTCHE_3.get());
					tabData.accept(AsdlabModItems.TIME.get());
					tabData.accept(AsdlabModBlocks.DEEPSLATE_SOFT_RUBBY_ORE.get().asItem());
					tabData.accept(AsdlabModItems.SOULGEM_4.get());
					tabData.accept(AsdlabModBlocks.BLUEIUM_BERRY_BLOCK.get().asItem());
					tabData.accept(AsdlabModItems.VAMPIRE_TIER_1_SPAWN_EGG.get());
					tabData.accept(AsdlabModItems.PACKAGED_BLOOD_3.get());
					tabData.accept(AsdlabModItems.COMBINED_SOUL.get());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("asdlab", "dia_family"),
				builder -> builder.title(Component.translatable("item_group.asdlab.dia_family")).icon(() -> new ItemStack(AsdlabModItems.DIAITEMDOTHATS.get())).displayItems((parameters, tabData) -> {
					tabData.accept(AsdlabModItems.DIAITEMDOTHATS.get());
					tabData.accept(AsdlabModBlocks.BLUEIUM_WOOD.get().asItem());
					tabData.accept(AsdlabModBlocks.BLUEIUM_LEAVES.get().asItem());
					tabData.accept(AsdlabModBlocks.BLUEIUM_DIRT.get().asItem());
					tabData.accept(AsdlabModBlocks.BLUEIUM_GRASS.get().asItem());
					tabData.accept(AsdlabModItems.BLUEIUM_BERRY.get());
					tabData.accept(AsdlabModItems.BLUEIUM_DIMENSION.get());
				})

		);
	}
}

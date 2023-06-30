
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package org.gsdistance.obx.adslab.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class AsdlabModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == AsdlabModVillagerProfessions.CHEF.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2),

					new ItemStack(Items.COOKED_COD, 10), 64, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2),

					new ItemStack(Items.COOKED_SALMON, 10), 64, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3),

					new ItemStack(Items.BAKED_POTATO, 30), 64, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3),

					new ItemStack(Items.COOKED_PORKCHOP, 5), 64, 10, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3),

					new ItemStack(Items.COOKED_BEEF, 5), 64, 10, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2),

					new ItemStack(Items.COOKED_CHICKEN, 5), 64, 8, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2),

					new ItemStack(Items.COOKED_RABBIT, 5), 64, 8, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD),

					new ItemStack(Items.COOKIE, 24), 64, 9, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 4),

					new ItemStack(Items.CAKE, 5), 20, 20, 0.12f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2),

					new ItemStack(Items.GOLDEN_APPLE), 64, 15, 0.08f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3),

					new ItemStack(Items.COOKED_MUTTON, 5), 64, 10, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 10),

					new ItemStack(Items.ENCHANTED_GOLDEN_APPLE), 30, 30, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 4),

					new ItemStack(Items.GOLDEN_CARROT, 32), 128, 10, 0.05f));
		}
	}
}

package org.gsdistance.obx.adslab.procedures;

import net.minecraft.world.item.ItemStack;

public class ReapersSytche2ItemIsCraftedsmeltedProcedure {
	public static void execute(ItemStack itemstack) {
		itemstack.getOrCreateTag().putDouble("xp", 0);
		itemstack.getOrCreateTag().putDouble("xpn", 100);
		itemstack.getOrCreateTag().putDouble("lvl", 0);
	}
}

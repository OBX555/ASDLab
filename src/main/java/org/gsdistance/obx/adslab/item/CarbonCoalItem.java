
package org.gsdistance.obx.adslab.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CarbonCoalItem extends Item {
	public CarbonCoalItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
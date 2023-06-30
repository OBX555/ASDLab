
package org.gsdistance.obx.adslab.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BloodyBoneItem extends Item {
	public BloodyBoneItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}

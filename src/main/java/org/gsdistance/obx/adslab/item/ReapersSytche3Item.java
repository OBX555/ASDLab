
package org.gsdistance.obx.adslab.item;

import org.gsdistance.obx.adslab.procedures.Reaperssytche3lvlvupProcedure;
import org.gsdistance.obx.adslab.procedures.ReapersSytche2ItemIsCraftedsmeltedProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;

import java.util.List;

public class ReapersSytche3Item extends HoeItem {
	public ReapersSytche3Item() {
		super(new Tier() {
			public int getUses() {
				return 5000;
			}

			public float getSpeed() {
				return 14f;
			}

			public float getAttackDamageBonus() {
				return 22f;
			}

			public int getLevel() {
				return 10;
			}

			public int getEnchantmentValue() {
				return 60;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 0, -3f, new Item.Properties());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		Reaperssytche3lvlvupProcedure.execute(entity, itemstack);
		return retval;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Tier2"));
	}

	@Override
	public void onCraftedBy(ItemStack itemstack, Level world, Player entity) {
		super.onCraftedBy(itemstack, world, entity);
		ReapersSytche2ItemIsCraftedsmeltedProcedure.execute(itemstack);
	}
}

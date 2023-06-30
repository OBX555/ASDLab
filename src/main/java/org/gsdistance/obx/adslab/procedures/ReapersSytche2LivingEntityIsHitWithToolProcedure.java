package org.gsdistance.obx.adslab.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class ReapersSytche2LivingEntityIsHitWithToolProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		itemstack.getOrCreateTag().putDouble("xp", (1 + itemstack.getOrCreateTag().getDouble("xp")));
		if (itemstack.getOrCreateTag().getDouble("xp") >= itemstack.getOrCreateTag().getDouble("xpn")) {
			itemstack.getOrCreateTag().putDouble("xp", (itemstack.getOrCreateTag().getDouble("xp") - itemstack.getOrCreateTag().getDouble("xpn")));
			itemstack.getOrCreateTag().putDouble("lvl", (1 + itemstack.getOrCreateTag().getDouble("lvl")));
			itemstack.getOrCreateTag().putDouble("xpn", (1.5 * itemstack.getOrCreateTag().getDouble("xpn")));
		}
		if (entity instanceof LivingEntity _entity)
			_entity.hurt(new DamageSource(_entity.level.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)) {
				@Override
				public Component getLocalizedDeathMessage(LivingEntity _msgEntity) {
					return Component.translatable("death.attack." + "reapersytchet2");
				}
			}, (float) (1 * itemstack.getOrCreateTag().getDouble("lvl")));
		itemstack.setHoverName(Component.literal(("Reapers Sytche Lvl" + new java.text.DecimalFormat("##").format(itemstack.getOrCreateTag().getDouble("lvl")))));
	}
}

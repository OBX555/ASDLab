
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package org.gsdistance.obx.adslab.init;

import org.gsdistance.obx.adslab.entity.VampireTier1Entity;
import org.gsdistance.obx.adslab.entity.VampireEntity;
import org.gsdistance.obx.adslab.entity.UnexperiencedVampireEntity;
import org.gsdistance.obx.adslab.entity.LivingCheeseBlockEntity;
import org.gsdistance.obx.adslab.AsdlabMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AsdlabModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, AsdlabMod.MODID);
	public static final RegistryObject<EntityType<UnexperiencedVampireEntity>> UNEXPERIENCED_VAMPIRE = register("unexperienced_vampire",
			EntityType.Builder.<UnexperiencedVampireEntity>of(UnexperiencedVampireEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(70).setUpdateInterval(3)
					.setCustomClientFactory(UnexperiencedVampireEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<VampireEntity>> VAMPIRE = register("vampire",
			EntityType.Builder.<VampireEntity>of(VampireEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(80).setUpdateInterval(3).setCustomClientFactory(VampireEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<LivingCheeseBlockEntity>> LIVING_CHEESE_BLOCK = register("living_cheese_block",
			EntityType.Builder.<LivingCheeseBlockEntity>of(LivingCheeseBlockEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LivingCheeseBlockEntity::new)

					.sized(1f, 1f));
	public static final RegistryObject<EntityType<VampireTier1Entity>> VAMPIRE_TIER_1 = register("vampire_tier_1",
			EntityType.Builder.<VampireTier1Entity>of(VampireTier1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(90).setUpdateInterval(3).setCustomClientFactory(VampireTier1Entity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			UnexperiencedVampireEntity.init();
			VampireEntity.init();
			LivingCheeseBlockEntity.init();
			VampireTier1Entity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(UNEXPERIENCED_VAMPIRE.get(), UnexperiencedVampireEntity.createAttributes().build());
		event.put(VAMPIRE.get(), VampireEntity.createAttributes().build());
		event.put(LIVING_CHEESE_BLOCK.get(), LivingCheeseBlockEntity.createAttributes().build());
		event.put(VAMPIRE_TIER_1.get(), VampireTier1Entity.createAttributes().build());
	}
}

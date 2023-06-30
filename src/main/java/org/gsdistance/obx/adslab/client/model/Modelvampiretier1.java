package org.gsdistance.obx.adslab.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelvampiretier1<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("asdlab", "modelvampiretier_1"), "main");
	public final ModelPart bb_main;

	public Modelvampiretier1(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 40).addBox(-6.0F, -16.0F, -3.0F, 4.0F, 16.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 27).addBox(-2.0F, -16.0F, -3.0F, 4.0F, 16.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, -32.0F, -3.0F, 8.0F, 16.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 27).addBox(2.0F, -32.0F, -3.0F, 4.0F, 16.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 20)
						.addBox(-10.0F, -32.0F, -3.0F, 4.0F, 16.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(18, 14).addBox(-6.0F, -39.0F, -4.0F, 8.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(-4, -4)
						.addBox(-6.0F, -41.0F, -4.0F, 8.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}

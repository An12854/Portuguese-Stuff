package site.an12854.portuguesestuff.world.feature;

import site.an12854.portuguesestuff.portuguesestuff;
import site.an12854.portuguesestuff.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModPlacedFeatures {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, portuguesestuff.MODID);


    public static final RegistryObject<PlacedFeature> CORK_OAK_CHECKED = PLACED_FEATURES.register("cork_oak_checked",
            () -> new PlacedFeature(ModConfiguredFeatures.CORK_OAK.getHolder().get(),
                    List.of(PlacementUtils.filteredByBlockSurvival(ModBlocks.CORK_OAK_SAPLING.get()))));

    public static final RegistryObject<PlacedFeature> CORK_OAK_PLACED = PLACED_FEATURES.register("cork_oak_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.CORK_OAK_SPAWN.getHolder().get(), VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(3, 0.1f, 2))));


    public static void register(IEventBus eventBus) {
        PLACED_FEATURES.register(eventBus);
    }
}
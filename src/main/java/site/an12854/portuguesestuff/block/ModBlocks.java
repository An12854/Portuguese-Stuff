package site.an12854.portuguesestuff.block;

import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.grower.OakTreeGrower;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fml.common.Mod;
import site.an12854.portuguesestuff.block.custom.LupinBlock;
import site.an12854.portuguesestuff.block.custom.ModFlammableRotatedPillarBlock;
import site.an12854.portuguesestuff.item.ModCreativeModeTab;
import site.an12854.portuguesestuff.portuguesestuff;
import site.an12854.portuguesestuff.item.ModItems;
import site.an12854.portuguesestuff.world.feature.tree.CorkOakTreeGrower;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, portuguesestuff.MODID);

    public static final RegistryObject<Block> YELLOW_LUPINE = BLOCKS.register("lupine",
            () -> new LupinBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> CORK_OAK_LOG = registerBlock("cork_oak_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.PTS_TAB);
    public static final RegistryObject<Block> CORK_OAK_WOOD = registerBlock("cork_oak_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), ModCreativeModeTab.PTS_TAB);
    public static final RegistryObject<Block> STRIPPED_CORK_OAK_LOG = registerBlock("stripped_cork_oak_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)), ModCreativeModeTab.PTS_TAB);
    public static final RegistryObject<Block> STRIPPED_CORK_OAK_WOOD = registerBlock("stripped_cork_oak_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), ModCreativeModeTab.PTS_TAB);

    public static final RegistryObject<Block> CORK_OAK_PLANKS = registerBlock("cork_oak_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)), ModCreativeModeTab.PTS_TAB);
    public static final RegistryObject<Block> CORK_OAK_LEAVES = registerBlock("cork_oak_leaves",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)), ModCreativeModeTab.PTS_TAB);
    public static final RegistryObject<Block> CORK_OAK_SAPLING = registerBlock("cork_oak_sapling",
            () -> new SaplingBlock(new CorkOakTreeGrower(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), ModCreativeModeTab.PTS_TAB);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
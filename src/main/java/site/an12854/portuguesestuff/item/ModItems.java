package site.an12854.portuguesestuff.item;

import site.an12854.portuguesestuff.block.ModBlocks;
import site.an12854.portuguesestuff.portuguesestuff;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, portuguesestuff.MODID);

    //I'm only calling them by their english name for other people to recognize, it's making me die of cringe
    public static final RegistryObject<Item> LUPIN_BEAN = ITEMS.register("lupin_bean",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PTS_TAB).food(ModFoods.LUPIN_BEAN)));
    public static final RegistryObject<Item> RAW_LUPIN_BEAN = ITEMS.register("raw_lupin_bean",
            () -> new ItemNameBlockItem(ModBlocks.YELLOW_LUPINE.get(), (new Item.Properties().tab(ModCreativeModeTab.PTS_TAB).food(ModFoods.RAW_LUPIN_BEAN))));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

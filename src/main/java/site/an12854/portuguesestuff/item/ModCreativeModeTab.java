package site.an12854.portuguesestuff.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab PTS_TAB = new CreativeModeTab("ptstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.LUPIN_BEAN.get());
        }
    };
}

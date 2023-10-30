package site.an12854.portuguesestuff.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockBehaviour;
import site.an12854.portuguesestuff.block.ModBlocks;
import site.an12854.portuguesestuff.item.ModItems;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class LupinBlock extends CropBlock {
    public static final IntegerProperty AGE = IntegerProperty.create("age", 0, 3);

    public LupinBlock(Properties properties) {
        super(properties);
    }

    @Override
    public BlockState getPlant(BlockGetter world, BlockPos pos) {
        return ModBlocks.YELLOW_LUPINE.get().defaultBlockState();
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.RAW_LUPIN_BEAN.get();
    }

    @Override
    public IntegerProperty getAgeProperty() {
        return AGE;
    }

    @Override
    public int getMaxAge() {
        return 3;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }
}

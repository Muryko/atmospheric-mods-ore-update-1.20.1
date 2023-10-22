/*
 * Decompiled with CFR 0.2.1 (FabricMC 53fa44c9).
 */
package net.atmospheric.oreupdate.block;

import net.atmospheric.oreupdate.block.custom.SafiraClusterBlock;
import net.atmospheric.oreupdate.block.custom.RubyClusterBlock;
import net.atmospheric.oreupdate.block.custom.SafiraClusterBlock;
import net.minecraft.block.AmethystBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.fluid.Fluids;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;

public class BuddingSafiraBlock
        extends AmethystBlock {
    public static final int GROW_CHANCE = 5;
    private static final Direction[] DIRECTIONS = Direction.values();

    public BuddingSafiraBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (random.nextInt(5) != 0) {
            return;
        }
        Direction direction = DIRECTIONS[random.nextInt(DIRECTIONS.length)];
        BlockPos blockPos = pos.offset(direction);
        BlockState blockState = world.getBlockState(blockPos);
        Block block = null;
        if (BuddingSafiraBlock.canGrowIn(blockState)) {
            block = ModBlocks.SMALL_SAFIRA_BUD;
        } else if (blockState.isOf(ModBlocks.SMALL_SAFIRA_BUD) && blockState.get(SafiraClusterBlock.FACING) == direction) {
            block = ModBlocks.MEDIUM_SAFIRA_BUD;
        } else if (blockState.isOf(ModBlocks.MEDIUM_SAFIRA_BUD) && blockState.get(SafiraClusterBlock.FACING) == direction) {
            block = ModBlocks.LARGE_SAFIRA_BUD;
        } else if (blockState.isOf(ModBlocks.LARGE_SAFIRA_BUD) && blockState.get(SafiraClusterBlock.FACING) == direction) {
            block = ModBlocks.SAFIRA_CLUSTER;
        }
        if (block != null) {
            BlockState blockState2 = (BlockState)((BlockState)block.getDefaultState().with(SafiraClusterBlock.FACING, direction)).with(SafiraClusterBlock.WATERLOGGED, blockState.getFluidState().getFluid() == Fluids.WATER);
            world.setBlockState(blockPos, blockState2);
        }
    }

    public static boolean canGrowIn(BlockState state) {
        return state.isAir() || state.isOf(Blocks.WATER) && state.getFluidState().getLevel() == 8;
    }
}


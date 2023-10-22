/*
 * Decompiled with CFR 0.2.1 (FabricMC 53fa44c9).
 */
package net.atmospheric.oreupdate.block;

import net.atmospheric.oreupdate.block.custom.JadeClusterBlock;
import net.atmospheric.oreupdate.block.custom.PiritaClusterBlock;
import net.minecraft.block.AmethystBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.fluid.Fluids;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;

public class BuddingPiritaBlock
        extends AmethystBlock {
    public static final int GROW_CHANCE = 5;
    private static final Direction[] DIRECTIONS = Direction.values();

    public BuddingPiritaBlock(Settings settings) {
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
        if (BuddingPiritaBlock.canGrowIn(blockState)) {
            block = ModBlocks.SMALL_PIRITA_BUD;
        } else if (blockState.isOf(ModBlocks.SMALL_PIRITA_BUD) && blockState.get(PiritaClusterBlock.FACING) == direction) {
            block = ModBlocks.MEDIUM_PIRITA_BUD;
        } else if (blockState.isOf(ModBlocks.MEDIUM_PIRITA_BUD) && blockState.get(PiritaClusterBlock.FACING) == direction) {
            block = ModBlocks.LARGE_PIRITA_BUD;
        } else if (blockState.isOf(ModBlocks.LARGE_PIRITA_BUD) && blockState.get(PiritaClusterBlock.FACING) == direction) {
            block = ModBlocks.PIRITA_CLUSTER;
        }
        if (block != null) {
            BlockState blockState2 = (BlockState)((BlockState)block.getDefaultState().with(PiritaClusterBlock.FACING, direction)).with(PiritaClusterBlock.WATERLOGGED, blockState.getFluidState().getFluid() == Fluids.WATER);
            world.setBlockState(blockPos, blockState2);
        }
    }

    public static boolean canGrowIn(BlockState state) {
        return state.isAir() || state.isOf(Blocks.WATER) && state.getFluidState().getLevel() == 8;
    }
}


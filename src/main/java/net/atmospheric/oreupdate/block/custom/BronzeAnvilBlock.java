package net.atmospheric.oreupdate.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

import java.util.stream.Stream;

public class BronzeAnvilBlock extends Block {

    private static final VoxelShape SHAPE_1_E = Block.createCuboidShape(2.0, 0.0, 3.0, 12.0, 2.0, 10.0);
    private static final VoxelShape SHAPE_2_E = Block.createCuboidShape(3.0, 2.0, 4.0, 10.0, 1.0, 8.0);
    private static final VoxelShape SHAPE_3_E = Block.createCuboidShape(4.0, 3.0, 6.0, 8.0, 5.0, 4.0);
    private static final VoxelShape SHAPE_4_E = Block.createCuboidShape(2.0, 8.0, 3.0, 12.0, 1.0, 10.0);
    private static final VoxelShape SHAPE_5_E = Block.createCuboidShape(0, 9.0, 2.0, 16.0, 7.0, 12.0);
    private static final VoxelShape SHAPE_1_N = Block.createCuboidShape(3.0, 0.0, 2.0, 10.0, 2.0, 12.0);
    private static final VoxelShape SHAPE_2_N = Block.createCuboidShape(4.0, 2.0, 3.0, 8.0, 1.0, 10.0);
    private static final VoxelShape SHAPE_3_N = Block.createCuboidShape(6.0, 3.0, 4.0, 4.0, 5.0, 8.0);
    private static final VoxelShape SHAPE_4_N = Block.createCuboidShape(2.0, 8.0, 3.0, 10.0, 1.0, 12.0);
    private static final VoxelShape SHAPE_5_N = Block.createCuboidShape(2.0, 9.0, 0, 12.0, 7.0, 16.0);
    private static final VoxelShape N_AXIS_SHAPE = VoxelShapes.union(SHAPE_1_N, SHAPE_2_N, SHAPE_3_N, SHAPE_4_N, SHAPE_5_N);
    private static final VoxelShape E_AXIS_SHAPE = VoxelShapes.union(SHAPE_1_E, SHAPE_2_E, SHAPE_3_E, SHAPE_4_E, SHAPE_5_E);

    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;

    public BronzeAnvilBlock(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        switch (state.get(FACING)) {
            case NORTH:
                return N_AXIS_SHAPE;
            case SOUTH:
                return N_AXIS_SHAPE;
            case WEST:
                return E_AXIS_SHAPE;
            case EAST:
                return E_AXIS_SHAPE;
            default:
                return N_AXIS_SHAPE;
        }
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return super.getPlacementState(ctx);
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}
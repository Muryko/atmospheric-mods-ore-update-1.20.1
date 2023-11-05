package net.atmospheric.oreupdate.block.custom;

import net.atmospheric.oreupdate.block.entity.BronzeAnvilBlockEntity;
import net.atmospheric.oreupdate.block.entity.ModBlockEntities;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.FurnaceBlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.stat.Stats;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.*;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class BronzeAnvilBlock extends BlockWithEntity implements BlockEntityProvider {

    private static final VoxelShape SHAPE_1_E = VoxelShapes.cuboid(0.375, 0.1875, 0.25, 0.625, 0.5, 0.75);
    private static final VoxelShape SHAPE_2_E = VoxelShapes.cuboid(0.125, 0.5625, 0, 0.875, 1, 1);
    private static final VoxelShape SHAPE_3_E = VoxelShapes.cuboid(0.1875, 0, 0.125, 0.8125, 0.125, 0.875);
    private static final VoxelShape SHAPE_4_E = VoxelShapes.cuboid(0.1875, 0.5, 0.125, 0.8125, 0.5625, 0.875);
    private static final VoxelShape SHAPE_5_E = VoxelShapes.cuboid(0.25, 0.125, 0.1875, 0.75, 0.1875, 0.8125);
    private static final VoxelShape SHAPE_1_N = VoxelShapes.cuboid(0.25, 0.1875, 0.375, 0.75, 0.5, 0.625);
    private static final VoxelShape SHAPE_2_N = VoxelShapes.cuboid(0, 0.5625, 0.125, 1, 1, 0.875);
    private static final VoxelShape SHAPE_3_N = VoxelShapes.cuboid(0.125, 0, 0.1875, 0.875, 0.125, 0.8125);
    private static final VoxelShape SHAPE_4_N = VoxelShapes.cuboid(0.125, 0.5, 0.1875, 0.875, 0.5625, 0.8125);
    private static final VoxelShape SHAPE_5_N = VoxelShapes.cuboid(0.1875, 0.125, 0.25, 0.8125, 0.1875, 0.75);
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
        return (BlockState)this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing());
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

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new BronzeAnvilBlockEntity(pos, state);
    }

    @Override
    public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        if (state.getBlock() != newState.getBlock()) {
            BlockEntity blockEntity = world.getBlockEntity(pos);
            if (blockEntity instanceof BronzeAnvilBlockEntity) {
                ItemScatterer.spawn(world, pos, (BronzeAnvilBlockEntity)blockEntity);
                world.updateComparators(pos, this);
            }
        }
        super.onStateReplaced(state, world, pos, newState, moved);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient) {
            NamedScreenHandlerFactory screenHandlerFactory = ((BronzeAnvilBlockEntity) world.getBlockEntity(pos));

            if (screenHandlerFactory != null) {
                player.openHandledScreen(screenHandlerFactory);
            }
        }

        return ActionResult.SUCCESS;
    }

    @Nullable
    protected static <E extends BlockEntity, A extends BlockEntity> BlockEntityTicker<A> validateTicker(
            BlockEntityType<A> givenType, BlockEntityType<E> expectedType, BlockEntityTicker<A> ticker
    ) {
        return expectedType == givenType ? ticker : null;
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return validateTicker(type, ModBlockEntities.BRONZE_ANVIL_BLOCK_ENTITY,
                (world1, pos, state1, blockEntity) -> blockEntity.tick(world1, pos, state1));
    }
}
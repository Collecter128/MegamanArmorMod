package com.collecter128.megamanarmormod.blocks;

import java.util.Random;

import javax.annotation.Nullable;

import com.collecter128.megamanarmormod.core.ItemInit;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

public class blockrotatableLadder extends Block{
	public static final DirectionProperty FACING = HorizontalBlock.FACING;
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
	   protected static final VoxelShape EAST_AABB = Block.box(0.0D, 0.0D, 0.0D, 3.0D, 16.0D, 16.0D);
	   protected static final VoxelShape WEST_AABB = Block.box(13.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);
	   protected static final VoxelShape SOUTH_AABB = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 3.0D);
	   protected static final VoxelShape NORTH_AABB = Block.box(0.0D, 0.0D, 13.0D, 16.0D, 16.0D, 16.0D);
	
	   public blockrotatableLadder(Properties properties) {
		super(properties);
		 this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(WATERLOGGED, Boolean.valueOf(false)));
	   }
	   
	   public VoxelShape getShape(BlockState p_220053_1_, IBlockReader p_220053_2_, BlockPos p_220053_3_, ISelectionContext p_220053_4_) {
		      switch((Direction)p_220053_1_.getValue(FACING)) {
		      case NORTH:
		         return NORTH_AABB;
		      case SOUTH:
		         return SOUTH_AABB;
		      case WEST:
		         return WEST_AABB;
		      case EAST:
		      default:
		         return EAST_AABB;
		      }
		   }
	   
	   private boolean canAttachTo(IBlockReader p_196471_1_, BlockPos p_196471_2_, Direction p_196471_3_) {
		      BlockState blockstate = p_196471_1_.getBlockState(p_196471_2_);
		      return blockstate.isFaceSturdy(p_196471_1_, p_196471_2_, p_196471_3_);
		   }

		   public boolean canSurvive(BlockState p_196260_1_, IWorldReader p_196260_2_, BlockPos p_196260_3_) {
		      Direction direction = p_196260_1_.getValue(FACING);
		      return this.canAttachTo(p_196260_2_, p_196260_3_.relative(direction.getOpposite()), direction);
		   }
		   
		   public BlockState updateShape(BlockState p_196271_1_, Direction p_196271_2_, BlockState p_196271_3_, IWorld p_196271_4_, BlockPos p_196271_5_, BlockPos p_196271_6_) {
			      if (p_196271_2_.getOpposite() == p_196271_1_.getValue(FACING) && !p_196271_1_.canSurvive(p_196271_4_, p_196271_5_)) {
			         return Blocks.AIR.defaultBlockState();
			      } else {
			         if (p_196271_1_.getValue(WATERLOGGED)) {
			            p_196271_4_.getLiquidTicks().scheduleTick(p_196271_5_, Fluids.WATER, Fluids.WATER.getTickDelay(p_196271_4_));
			         }

			         return super.updateShape(p_196271_1_, p_196271_2_, p_196271_3_, p_196271_4_, p_196271_5_, p_196271_6_);
			      }
			   }
	   
	   @Override
		public void entityInside(BlockState state, World worldIn, BlockPos pos, Entity entityIn)
		{
			super.entityInside(state, worldIn, pos, entityIn);
			if(entityIn instanceof LivingEntity&&!((LivingEntity)entityIn).onClimbable()) {
				Vector3d motion = entityIn.getDeltaMovement();
				float maxMotion = 0.15F;
				motion = new Vector3d(
						motion.x,
						Math.max(motion.y, -maxMotion),
						motion.z
				);

				entityIn.fallDistance = 0.0F;

				if(motion.y < 0&&entityIn instanceof PlayerEntity&&entityIn.isShiftKeyDown())
					motion = new Vector3d(motion.x, 0, motion.z);
				else if(entityIn.horizontalCollision)
					motion = new Vector3d(motion.x, 0.2, motion.z);
				entityIn.setDeltaMovement(motion);
			}
		}
	   

	   @Nullable
	   public BlockState getStateForPlacement(BlockItemUseContext p_196258_1_) {
	      if (!p_196258_1_.replacingClickedOnBlock()) {
	         BlockState blockstate = p_196258_1_.getLevel().getBlockState(p_196258_1_.getClickedPos().relative(p_196258_1_.getClickedFace().getOpposite()));
	         if (blockstate.is(this) && blockstate.getValue(FACING) == p_196258_1_.getClickedFace()) {
	            return null;
	         }
	      }

	      BlockState blockstate1 = this.defaultBlockState();
	      IWorldReader iworldreader = p_196258_1_.getLevel();
	      BlockPos blockpos = p_196258_1_.getClickedPos();
	      FluidState fluidstate = p_196258_1_.getLevel().getFluidState(p_196258_1_.getClickedPos());

	      for(Direction direction : p_196258_1_.getNearestLookingDirections()) {
	         if (direction.getAxis().isHorizontal()) {
	            blockstate1 = blockstate1.setValue(FACING, direction.getOpposite());
	            if (blockstate1.canSurvive(iworldreader, blockpos)) {
	               return blockstate1.setValue(WATERLOGGED, Boolean.valueOf(fluidstate.getType() == Fluids.WATER));
	            }
	         }
	      }

	      return null;
	   }
	   
	   /**
	    * Returns the blockstate with the given rotation from the passed blockstate. If inapplicable, returns the passed
	    * blockstate.
	    * @deprecated call via {@link IBlockState#withRotation(Rotation)} whenever possible. Implementing/overriding is
	    * fine.
	    */
	   public BlockState rotate(BlockState state, Rotation rot) {
	      return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	   }

	   /**
	    * Returns the blockstate with the given mirror of the passed blockstate. If inapplicable, returns the passed
	    * blockstate.
	    * @deprecated call via {@link IBlockState#withMirror(Mirror)} whenever possible. Implementing/overriding is fine.
	    */
	   public BlockState mirror(BlockState state, Mirror mirrorIn) {
	      return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	   }

	   protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
	      builder.add(FACING, WATERLOGGED);
	   }

	   public FluidState getFluidState(BlockState p_204507_1_) {
		      return p_204507_1_.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(p_204507_1_);
		   }
}

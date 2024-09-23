package com.collecter128.megamanarmormod.blocks;

import com.collecter128.megamanarmormod.core.BlockInit;
//import com.collecter128.megamanarmormod.core.ItemInit;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

public class BlueMysteryDataGeneratorBlock extends Block{
	public static final DirectionProperty FACING = HorizontalBlock.FACING;
	
	   public BlueMysteryDataGeneratorBlock(Properties properties) {
		super(properties);
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	   }
	   
	   public BlockState getStateForPlacement(BlockItemUseContext context) {
		      return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
		   }
	   
	   public ActionResultType use(BlockState p_225533_1_, World p_225533_2_, BlockPos p_225533_3_, PlayerEntity p_225533_4_, Hand p_225533_5_, BlockRayTraceResult p_225533_6_) {
		      ItemStack itemstack = p_225533_4_.getItemInHand(p_225533_5_);
		      if (itemstack.isEmpty()) {
		         return ActionResultType.PASS;
		      } else {
		         //int i = p_225533_1_.getValue(LEVEL);
		         Item item = itemstack.getItem();
 
		         if(item == Items.REDSTONE && (p_225533_2_.getBlockState(p_225533_3_.above()) == Blocks.AIR.defaultBlockState()) ) {
		        	 if (!p_225533_2_.isClientSide) {
			            	itemstack.shrink(1);
			            	

			            	//p_225533_4_.inventory.add(new ItemStack(BlockInit.BlueMysteryData.get(), 1));
			            	popResource(p_225533_2_, p_225533_3_.above(), new ItemStack(BlockInit.BlueMysteryData.get(), 1));
			            	//p_225533_2_.setBlock(p_225533_3_.above(), BlockInit.BlueMysteryData.get().defaultBlockState(), 0);
			               p_225533_2_.playSound((PlayerEntity)null, p_225533_3_, SoundEvents.EXPERIENCE_ORB_PICKUP, SoundCategory.BLOCKS, 1.0F, 1.0F);
		        	 
		        	 }
		        	 return ActionResultType.sidedSuccess(p_225533_2_.isClientSide);
		         }//turn iron into scrap
		         
			        	 
			        	 
		            else {
		               return ActionResultType.PASS;
		            }
		         }// If Itemstack is not empty

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
	      builder.add(FACING);
	   }

}

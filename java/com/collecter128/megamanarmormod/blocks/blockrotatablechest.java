package com.collecter128.megamanarmormod.blocks;

import java.util.Random;

import com.collecter128.megamanarmormod.core.ItemInit;

import net.minecraft.block.AbstractChestBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ContainerBlock;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.tileentity.ChestTileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

public class blockrotatablechest extends Block{
	public static final DirectionProperty FACING = HorizontalBlock.FACING;
	
	   public blockrotatablechest(Properties properties) {
		super(properties);
		 this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	   }
	   
	   

	   public BlockState getStateForPlacement(BlockItemUseContext context) {
	      return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
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

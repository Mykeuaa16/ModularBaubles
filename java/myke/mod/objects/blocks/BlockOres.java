package myke.mod.objects.blocks;

import myke.mod.Main;
import myke.mod.init.BlockInit;
import myke.mod.init.ItemInit;
import myke.mod.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

import java.util.Random;


public class BlockOres extends BlockBase
{
	
	
	 public BlockOres(String name, Material material)
		{
	    	super(name, material);
	    	setSoundType(SoundType.STONE);
			setHardness(5.0F);
			setResistance(15.0F);
			setHarvestLevel("pickaxe", 2);
		}
	 @Override
	 public Item getItemDropped(IBlockState state, Random rand, int fortune)
	 {
		 return ItemInit.RUBY;
	 }
	 
	   @Override
	   public int quantityDropped(Random rand)
	   {
		   int max = 4;
		   int min = 1;
		   return rand.nextInt(max) +min;
	   }
}
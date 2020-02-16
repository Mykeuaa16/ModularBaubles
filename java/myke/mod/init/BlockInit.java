package myke.mod.init;

import java.util.ArrayList;
import java.util.List;

import myke.mod.objects.blocks.BlockBase;
import myke.mod.objects.blocks.BlockOres;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block BLOCK_RUBY = new BlockBase("block_ruby", Material.ROCK);

	public static final Block ORE_RUBY = new BlockOres("ore_ruby", Material.ROCK);
}

package myke.mod.world.biome;

import java.util.Random;

import myke.mod.init.BlockInit;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeDesert;
import net.minecraft.world.gen.feature.WorldGenerator;

public class RubyGenDessert extends BiomeDesert{
	
	   public RubyGenDessert(BiomeProperties properties) {
		   
		   
		super(properties);
	}
	   public void decorate(World worldIn, Random rand, BlockPos pos)
	    {
	        super.decorate(worldIn, rand, pos);

	        net.minecraftforge.common.MinecraftForge.ORE_GEN_BUS.post(new net.minecraftforge.event.terraingen.OreGenEvent.Pre(worldIn, rand, pos));
	        WorldGenerator rubies = new RubyGenerator();
	        if (net.minecraftforge.event.terraingen.TerrainGen.generateOre(worldIn, rand, rubies, pos, net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.CUSTOM))
	            rubies.generate(worldIn, rand, pos);

	        for (int j1 = 0; j1 < 7; ++j1)
	        {
	            int k1 = rand.nextInt(16);
	            int l1 = rand.nextInt(64);
	            int i2 = rand.nextInt(16);
	        }
	        net.minecraftforge.common.MinecraftForge.ORE_GEN_BUS.post(new net.minecraftforge.event.terraingen.OreGenEvent.Post(worldIn, rand, pos));
	    }

	private static class RubyGenerator extends WorldGenerator
	    {
	        @Override
	        public boolean generate(World worldIn, Random rand, BlockPos pos)
	        {
	            int count = 3 + rand.nextInt(6);
	            for (int i = 0; i < count; i++)
	            {
	                int offset = net.minecraftforge.common.ForgeModContainer.fixVanillaCascading ? 8 : 0; // MC-114332
	                BlockPos blockpos = pos.add(rand.nextInt(16) + offset, rand.nextInt(28) + 8, rand.nextInt(16) + offset);

	                net.minecraft.block.state.IBlockState state = worldIn.getBlockState(blockpos);
	                if (state.getBlock().isReplaceableOreGen(state, worldIn, blockpos, net.minecraft.block.state.pattern.BlockMatcher.forBlock(Blocks.STONE)))
	                {
	                    worldIn.setBlockState(blockpos, BlockInit.ORE_RUBY.getDefaultState(), 16 | 2);
	                }
	            }
	            return true;
	        }
	    }
}

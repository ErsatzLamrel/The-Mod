package nat.nshm.world;

import java.util.Random;

import nat.nshm.init.ModBlocks;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class SuperHeroGeneration  implements IWorldGenerator {

	private WorldGenerator SuperHeroGeneration;
	private WorldGenMinable gen_dwarfstar_ore;
	private WorldGenMinable gen_palladium_ore;
	
	public SuperHeroGeneration(){
		this.gen_dwarfstar_ore = new WorldGenMinable(ModBlocks.DwarfStarOre.getDefaultState(), 6, BlockMatcher.forBlock(Blocks.STONE));
		this.gen_palladium_ore = new WorldGenMinable(ModBlocks.PalladiumOre.getDefaultState(), 6, BlockMatcher.forBlock(Blocks.STONE));
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.getDimension() ){
		case 0: //overworld
			this.runGenerator(gen_dwarfstar_ore, world, random, chunkX, chunkZ, 7, 6, 27);
			this.runGenerator(gen_palladium_ore, world, random, chunkX, chunkZ, 7, 6, 27);
		
		case -1: //nether
		
		case 1: //end
		} 	
	}
	
	private void runGenerator(WorldGenerator generator, World world, Random random, int chunk_X, int chunk_Z, int chancesToSpawn, int minheight, int maxheight) {
		if (minheight < 0 || maxheight > 256 || minheight > maxheight);{
			
		}
	}
}
			
				
			
	
	




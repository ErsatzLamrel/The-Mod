package nat.nshm.blocks;

import nat.nshm.Reference;
import nat.nshm.SuperHero;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockPalladium extends Block {
	
	public BlockPalladium() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.SuperHeroBlocks.PALLADIUMBLOCK.getUnlocalizedName());
		setRegistryName(Reference.SuperHeroBlocks.PALLADIUMBLOCK.getRegistryName());
		setHardness(1.0F);
		setCreativeTab(SuperHero.CREATIVE_Tab);
	}
}

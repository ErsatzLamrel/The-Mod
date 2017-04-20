package nat.nshm.blocks;

import nat.nshm.Reference;
import nat.nshm.SuperHero;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockPalladiumOre extends Block {

	public BlockPalladiumOre() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.SuperHeroBlocks.PALLADIUMORE.getUnlocalizedName());
		setRegistryName(Reference.SuperHeroBlocks.PALLADIUMORE.getRegistryName());
		setHardness(1.0F);
		setCreativeTab(SuperHero.CREATIVE_Tab);
	}
}

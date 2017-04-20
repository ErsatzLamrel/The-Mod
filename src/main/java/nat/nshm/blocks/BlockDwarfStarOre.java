package nat.nshm.blocks;

import nat.nshm.Reference;
import nat.nshm.SuperHero;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockDwarfStarOre extends Block {

	public BlockDwarfStarOre() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.SuperHeroBlocks.DWARFSTARORE.getUnlocalizedName());
		setRegistryName(Reference.SuperHeroBlocks.DWARFSTARORE.getRegistryName());
		setHardness(1.0F);
		setCreativeTab(SuperHero.CREATIVE_Tab);
	}

}

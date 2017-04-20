package nat.nshm.items;

import nat.nshm.Reference;
import nat.nshm.SuperHero;
import net.minecraft.item.Item;

public class ItemCarbonFiberMesh extends Item {

	public ItemCarbonFiberMesh() {
		setUnlocalizedName(Reference.SuperHeroItems.CARBONFIBERMESH.getUnlocalizedName());
		setRegistryName(Reference.SuperHeroItems.CARBONFIBERMESH.getRegistryName());
		setCreativeTab(SuperHero.CREATIVE_Tab);
	}
	
}

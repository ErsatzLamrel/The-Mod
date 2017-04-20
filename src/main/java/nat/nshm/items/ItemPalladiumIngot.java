package nat.nshm.items;

import nat.nshm.Reference;
import nat.nshm.SuperHero;
import net.minecraft.item.Item;

public class ItemPalladiumIngot extends Item {
	
	public ItemPalladiumIngot() {
		setUnlocalizedName(Reference.SuperHeroItems.PALLADIUMINGOT.getUnlocalizedName());
		setRegistryName(Reference.SuperHeroItems.PALLADIUMINGOT.getRegistryName());
		setCreativeTab(SuperHero.CREATIVE_Tab);
	}
}

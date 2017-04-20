package nat.nshm.items;

import nat.nshm.Reference;
import nat.nshm.SuperHero;
import net.minecraft.item.Item;

public class ItemIronRod extends Item {
	public ItemIronRod() {
		setUnlocalizedName(Reference.SuperHeroItems.IRONROD.getUnlocalizedName());
		setRegistryName(Reference.SuperHeroItems.IRONROD.getRegistryName());
		setCreativeTab(SuperHero.CREATIVE_Tab);
	}

}

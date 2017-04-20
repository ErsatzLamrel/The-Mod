package nat.nshm.items;

import nat.nshm.Reference;
import nat.nshm.SuperHero;
import net.minecraft.item.Item;

public class ItemQuantumSplicer extends Item {

	public ItemQuantumSplicer() {
		setUnlocalizedName(Reference.SuperHeroItems.QUANTUMSPLICER.getUnlocalizedName());
		setRegistryName(Reference.SuperHeroItems.QUANTUMSPLICER.getRegistryName());
		setCreativeTab(SuperHero.CREATIVE_Tab);
	}

}

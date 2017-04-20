package nat.nshm.items;

import nat.nshm.Reference;
import nat.nshm.SuperHero;
import net.minecraft.item.Item;

public class ItemSteelIngot extends Item {

	public ItemSteelIngot() {
		setUnlocalizedName(Reference.SuperHeroItems.STEELINGOT.getUnlocalizedName());
		setRegistryName(Reference.SuperHeroItems.STEELINGOT.getRegistryName());
		setCreativeTab(SuperHero.CREATIVE_Tab);
	}
}

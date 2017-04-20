package nat.nshm.items;

import nat.nshm.Reference;
import nat.nshm.SuperHero;
import net.minecraft.item.Item;

public class ItemIonizedPalladiumIngot extends Item {

	public ItemIonizedPalladiumIngot() {
		setUnlocalizedName(Reference.SuperHeroItems.IONIZEDPALLADIUMINGOT.getUnlocalizedName());
		setRegistryName(Reference.SuperHeroItems.IONIZEDPALLADIUMINGOT.getRegistryName());
		setCreativeTab(SuperHero.CREATIVE_Tab);
	}
}

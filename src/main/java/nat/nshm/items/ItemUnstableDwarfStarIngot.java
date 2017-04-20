package nat.nshm.items;

import nat.nshm.Reference;
import nat.nshm.SuperHero;
import net.minecraft.item.Item;

public class ItemUnstableDwarfStarIngot extends Item {
	
	public ItemUnstableDwarfStarIngot() {
		setUnlocalizedName(Reference.SuperHeroItems.UNSTABLEDWARFSTARINGOT.getUnlocalizedName());
		setRegistryName(Reference.SuperHeroItems.UNSTABLEDWARFSTARINGOT.getRegistryName());
		setCreativeTab(SuperHero.CREATIVE_Tab);
	}
}

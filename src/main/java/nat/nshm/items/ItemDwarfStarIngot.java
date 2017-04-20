package nat.nshm.items;

import nat.nshm.Reference;
import nat.nshm.SuperHero;
import net.minecraft.item.Item;

public class ItemDwarfStarIngot extends Item {
	
	public ItemDwarfStarIngot() {
		setUnlocalizedName(Reference.SuperHeroItems.DWARFSTARINGOT.getUnlocalizedName());
		setRegistryName(Reference.SuperHeroItems.DWARFSTARINGOT.getRegistryName());
		setCreativeTab(SuperHero.CREATIVE_Tab);
	}
}

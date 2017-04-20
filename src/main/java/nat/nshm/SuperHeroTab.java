package nat.nshm;

import nat.nshm.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SuperHeroTab extends CreativeTabs{

	public SuperHeroTab() {
		super("tabSuperHero");
	}

	@Override
	public Item getTabIconItem() {
	
		return ModItems.DwarfStarIngot;
	}

}

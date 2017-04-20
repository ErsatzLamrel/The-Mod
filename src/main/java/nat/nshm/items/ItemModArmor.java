package nat.nshm.items;

import nat.nshm.Reference;
import nat.nshm.SuperHero;
import nat.nshm.SuperHeroTab;
import nat.nshm.init.ModItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.world.World;

public class ItemModArmor extends ItemArmor {

	public ItemModArmor(String unlocalizedName, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(SuperHero.CREATIVE_Tab);
		this.setMaxStackSize(1);
	}

}

package nat.nshm.items;

import org.omg.PortableServer.ServantRetentionPolicyOperations;

import nat.nshm.Reference;
import nat.nshm.SuperHero;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntityTippedArrow;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemDwarfStarTippedArrow extends ItemArrow {
	    public ItemDwarfStarTippedArrow()
	    {
	        this.setCreativeTab(SuperHero.CREATIVE_Tab);
	        setUnlocalizedName(Reference.SuperHeroItems.DWARFSTARTIPPEDARROW.getUnlocalizedName());
			setRegistryName(Reference.SuperHeroItems.DWARFSTARTIPPEDARROW.getRegistryName());
	    }

	    public EntityArrow createArrow(World worldIn, ItemStack stack, EntityLivingBase shooter)
	    {
	        EntityTippedArrow entitytippedarrow = new EntityTippedArrow(worldIn, shooter);
	        entitytippedarrow.setPotionEffect(stack);
	        return entitytippedarrow;
	    }

	    public boolean isInfinite(ItemStack stack, ItemStack bow, net.minecraft.entity.player.EntityPlayer player)
	    {
	        int enchant = net.minecraft.enchantment.EnchantmentHelper.getEnchantmentLevel(net.minecraft.init.Enchantments.INFINITY, bow);
	        return enchant <= 0 ? false : this.getClass() == ItemDwarfStarTippedArrow.class;
	    }
	}
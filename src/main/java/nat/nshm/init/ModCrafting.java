package nat.nshm.init;

import net.minecraft.client.Minecraft;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

	public static void register() {
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.SteelIngot),"CCC", "CIC", "CCC", 'C', Items.COAL, 'I', Items.IRON_INGOT );
		GameRegistry.addSmelting(ModBlocks.PalladiumOre, new ItemStack(ModItems.PalladiumIngot), 6);
		GameRegistry.addSmelting(ModBlocks.DwarfStarOre, new ItemStack(ModItems.DwarfStarIngot), 10);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.PalladiumBlock),"CCC", "CCC", "CCC", 'C', ModItems.PalladiumIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.DwarfStarBlock),"CCC", "CCC", "CCC", 'C', ModItems.DwarfStarIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.IonizedPalladiumIngot),"CCC", "CIC", "CCC", 'C', Items.REDSTONE, 'I', ModItems.PalladiumIngot );
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.UnstableDwarfStarIngot),"GD", 'G', Items.GUNPOWDER, 'D', ModItems.DwarfStarIngot );
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.DwarfStarIngot),"D  ", "   ", "   ", 'D', ModBlocks.DwarfStarBlock );
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.PalladiumIngot),"D  ", "   ", "   ", 'D', ModBlocks.PalladiumBlock );
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.IronRod),"I  ", " I ", "   ", 'I', Items.IRON_INGOT );
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.DwarfStarBlock),"CCC", "CCC", "CCC", 'C', ModItems.DwarfStarIngot);
GameRegistry.addShapedRecipe(new ItemStack(ModItems.dwarfstar_helmet),"CCC", "C C", "   ", 'C', ModItems.DwarfStarIngot);
	GameRegistry.addShapedRecipe(new ItemStack(ModItems.dwarfstar_chestplate),"C C", "CCC", "CCC", 'C', ModItems.DwarfStarIngot);
GameRegistry.addShapedRecipe(new ItemStack(ModItems.dwarfstar_leggings),"CCC", "C C", "C C", 'C', ModItems.DwarfStarIngot);
	GameRegistry.addShapedRecipe(new ItemStack(ModItems.dwarfstar_boots),"   ", "C C", "C C", 'C', ModItems.DwarfStarIngot);
	GameRegistry.addShapedRecipe(new ItemStack(ModItems.palladium_helmet),"CCC", "C C", "   ", 'C', ModItems.PalladiumIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.palladium_chestplate),"C C", "CCC", "CCC", 'C', ModItems.PalladiumIngot);
	GameRegistry.addShapedRecipe(new ItemStack(ModItems.palladium_leggings),"CCC", "C C", "C C", 'C', ModItems.PalladiumIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.palladium_boots),"   ", "C C", "C C", 'C', ModItems.PalladiumIngot);

	}

}

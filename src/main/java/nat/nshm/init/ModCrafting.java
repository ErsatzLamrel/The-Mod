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
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.DwarfStarIngot, 9), ModBlocks.DwarfStarBlock );
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.PalladiumIngot, 9), ModBlocks.PalladiumBlock );
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.IronRod),"I  ", " I ", "   ", 'I', Items.IRON_INGOT );
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.DwarfStarBlock),"CCC", "CCC", "CCC", 'C', ModItems.DwarfStarIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.DwarfStarTippedArrow),"C  ", " I ", "  F", 'C', ModItems.UnstableDwarfStarIngot, 'F', Items.FEATHER, 'I', ModItems.IronRod);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.CarbonFiberMesh),"C  ", " I ", "   ", 'C', Items.COAL, 'I', Items.STRING);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.QuantumSplicer),"PDP", "DMD", "PDP", 'P', ModItems.PalladiumIngot, 'M', Items.MAGMA_CREAM, 'D', Items.DIAMOND);

		//Armor Dwarf-Star
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.dwarfstar_helmet),"CCC", "C C", "   ", 'C', ModItems.DwarfStarIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.dwarfstar_chestplate),"C C", "CCC", "CCC", 'C', ModItems.DwarfStarIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.dwarfstar_leggings),"CCC", "C C", "C C", 'C', ModItems.DwarfStarIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.dwarfstar_boots),"   ", "C C", "C C", 'C', ModItems.DwarfStarIngot);

		//Armor Palladium
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.palladium_helmet),"CCC", "C C", "   ", 'C', ModItems.PalladiumIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.palladium_chestplate),"C C", "CCC", "CCC", 'C', ModItems.PalladiumIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.palladium_leggings),"CCC", "C C", "C C", 'C', ModItems.PalladiumIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.palladium_boots),"   ", "C C", "C C", 'C', ModItems.PalladiumIngot);


		//Armor Carbon
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.carbon_helmet),"CCC", "C C", "   ", 'C', ModItems.CarbonFiberMesh);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.carbon_chestplate),"C C", "CCC", "CCC", 'C', ModItems.CarbonFiberMesh);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.carbon_leggings),"CCC", "C C", "C C", 'C', ModItems.CarbonFiberMesh);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.carbon_boots),"   ", "C C", "C C", 'C', ModItems.CarbonFiberMesh);


		//Tools Dwarf-Star
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.dwarfstar_axe),"CC ", "CS ", " S ", 'C', ModItems.DwarfStarIngot, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.dwarfstar_pickaxe),"CCC", " S ", " S ", 'C', ModItems.DwarfStarIngot, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.dwarfstar_shovel)," C ", " S ", " S ", 'C', ModItems.DwarfStarIngot, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.dwarfstar_hoe),"CC ", " S ", " S ", 'C', ModItems.DwarfStarIngot, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.dwarfstar_sword)," C ", " C ", " S ", 'C', ModItems.DwarfStarIngot, 'S', Items.STICK);

		//Tools Palladium
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.palladium_axe),"CC ", "CS ", " S ", 'C', ModItems.PalladiumIngot, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.palladium_pickaxe),"CCC", " S ", " S ", 'C', ModItems.PalladiumIngot, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.palladium_shovel)," C ", " S ", " S ", 'C', ModItems.PalladiumIngot, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.palladium_hoe),"CC ", " S ", " S ", 'C', ModItems.PalladiumIngot, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.palladium_sword)," C ", " C ", " S ", 'C', ModItems.PalladiumIngot, 'S', Items.STICK);

	}

}

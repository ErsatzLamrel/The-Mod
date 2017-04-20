package nat.nshm.init;


import nat.nshm.items.ItemCarbonFiberMesh;
import nat.nshm.items.ItemDwarfStarIngot;
import nat.nshm.items.ItemIonizedPalladiumIngot;
import nat.nshm.items.ItemIronRod;
import nat.nshm.items.ItemModArmor;
import nat.nshm.items.ItemPalladiumIngot;
import nat.nshm.items.ItemSteelIngot;
import nat.nshm.items.ItemUnstableDwarfStarIngot;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {


	//Items
	public static Item DwarfStarIngot;

	public static Item UnstableDwarfStarIngot;

	public static Item CarbonFiberMesh;

	public static Item PalladiumIngot;

	public static Item SteelIngot;

	public static Item IonizedPalladiumIngot;

	public static Item DwarfStarTippedArrow;

	public static Item IronRod;

	//Armor
	public static ArmorMaterial DwarfStarArmor = EnumHelper.addArmorMaterial("DwarfStarArmor", "SuperHero:DwarfStar", 60, new int[]{4,9,6,3} , 64, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, (float) 9.0);
	public static Item dwarfstar_helmet;
	public static Item dwarfstar_chestplate;
	public static Item dwarfstar_leggings;
	public static Item dwarfstar_boots;
	//Palaldium Armor
	public static ArmorMaterial PalladiumArmor = EnumHelper.addArmorMaterial("PalladiumArmor", "SuperHero:Palladium", 60, new int[]{3,7,5,3} , 64, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, (float) 2.0);
	public static Item palladium_helmet;
	public static Item palladium_chestplate;
	public static Item palladium_leggings;
	public static Item palladium_boots;


	


	public static void init(){
		DwarfStarIngot = new ItemDwarfStarIngot();
		UnstableDwarfStarIngot = new ItemUnstableDwarfStarIngot();
		DwarfStarTippedArrow = new ItemDwarfStarTippedArrow();

		IronRod = new ItemIronRod();

		CarbonFiberMesh = new ItemCarbonFiberMesh();

		PalladiumIngot = new ItemPalladiumIngot();

		SteelIngot = new ItemSteelIngot();

		IonizedPalladiumIngot = new ItemIonizedPalladiumIngot();
	}
	public static void register(){
		GameRegistry.register(DwarfStarIngot);
		GameRegistry.register(UnstableDwarfStarIngot);

		GameRegistry.register(CarbonFiberMesh);

		GameRegistry.register(PalladiumIngot);
		GameRegistry.register(IronRod);

		GameRegistry.register(SteelIngot);
		GameRegistry.register(DwarfStarTippedArrow);
	//Dwarf-Star Armor
		GameRegistry.register(IonizedPalladiumIngot);
		GameRegistry.registerItem(dwarfstar_helmet = new ItemModArmor("dwarfstar_helmet", DwarfStarArmor, 1, EntityEquipmentSlot.HEAD), dwarfstar_helmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(dwarfstar_chestplate = new ItemModArmor("dwarfstar_chestplate", DwarfStarArmor, 1, EntityEquipmentSlot.CHEST), dwarfstar_chestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(dwarfstar_leggings = new ItemModArmor("dwarfstar_leggings", DwarfStarArmor, 1, EntityEquipmentSlot.LEGS), dwarfstar_leggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(dwarfstar_boots = new ItemModArmor("dwarfstar_boots", DwarfStarArmor, 1, EntityEquipmentSlot.FEET), dwarfstar_boots.getUnlocalizedName().substring(5));
	//Paladium Armor
		GameRegistry.registerItem(palladium_helmet = new ItemModArmor("palladiumstar_helmet", PalladiumArmor, 1, EntityEquipmentSlot.HEAD), palladium_helmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(palladium_chestplate = new ItemModArmor("palladium_chestplate", PalladiumArmor, 1, EntityEquipmentSlot.CHEST), palladium_chestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(palladium_leggings = new ItemModArmor("palladium_leggings", PalladiumArmor, 1, EntityEquipmentSlot.LEGS), palladium_leggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(palladium_boots = new ItemModArmor("palladium_boots", PalladiumArmor, 1, EntityEquipmentSlot.FEET), palladium_boots.getUnlocalizedName().substring(5));

	}
	public static void registerRenders(){
		registerRender(DwarfStarIngot);
		registerRender(UnstableDwarfStarIngot);
		registerRender(DwarfStarTippedArrow);
		//Armor Dwarf-Star
		registerRender(dwarfstar_helmet);
		registerRender(dwarfstar_chestplate);
		registerRender(dwarfstar_leggings);
		registerRender(dwarfstar_boots);
		//Armor Palladium
		registerRender(palladium_helmet);
		registerRender(palladium_chestplate);
		registerRender(palladium_leggings);
		registerRender(palladium_boots);

		registerRender(CarbonFiberMesh);

		registerRender(PalladiumIngot);

		registerRender(SteelIngot);
		registerRender(IronRod);

		registerRender(IonizedPalladiumIngot);
	}

	private static void registerRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}

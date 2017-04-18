package nat.nshm.init;

import nat.nshm.items.ItemCarbonFiberMesh;
import nat.nshm.items.ItemDwarfStarIngot;
import nat.nshm.items.ItemIonizedPalladiumIngot;
import nat.nshm.items.ItemPalladiumIngot;
import nat.nshm.items.ItemSteelIngot;
import nat.nshm.items.ItemUnstableDwarfStarIngot;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item DwarfStarIngot;
	
	public static Item UnstableDwarfStarIngot;
	
	public static Item CarbonFiberMesh;
	
	public static Item PalladiumIngot;
	
	public static Item SteelIngot;
	
	public static Item IonizedPalladiumIngot;
	
	
	public static void init(){
		DwarfStarIngot = new ItemDwarfStarIngot();
		UnstableDwarfStarIngot = new ItemUnstableDwarfStarIngot();
		
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
		
		GameRegistry.register(SteelIngot);
		
		GameRegistry.register(IonizedPalladiumIngot);
		
	}
	public static void registerRenders(){
		registerRender(DwarfStarIngot);
		registerRender(UnstableDwarfStarIngot);
		
		registerRender(CarbonFiberMesh);
		
		registerRender(PalladiumIngot);
		
		registerRender(SteelIngot);
		
		registerRender(IonizedPalladiumIngot);
	}
		
	private static void registerRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}

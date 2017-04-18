package nat.nshm.init;

import nat.nshm.items.ItemDwarfStarIngot;
import nat.nshm.items.ItemPalladiumIngot;
import nat.nshm.items.ItemSteelIngot;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item DwarfStarIngot;
	public static Item PalladiumIngot;
	public static Item SteelIngot;
	
	public static void init(){
		DwarfStarIngot = new ItemDwarfStarIngot();
		PalladiumIngot = new ItemPalladiumIngot();
		SteelIngot = new ItemSteelIngot();
	}
	public static void register(){
		GameRegistry.register(DwarfStarIngot);
		GameRegistry.register(PalladiumIngot);
		GameRegistry.register(SteelIngot);
	}
	public static void registerRenders(){
		registerRender(DwarfStarIngot);
		registerRender(PalladiumIngot);
		registerRender(SteelIngot);
	}
		
	private static void registerRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}

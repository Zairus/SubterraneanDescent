package zairus.subterraneandescent;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class SDProxy
{
	public void preInit(FMLPreInitializationEvent e)
	{
		//Register entities
	}
	
	public void init(FMLInitializationEvent e)
	{
		;
	}
	
	public void postInit(FMLPostInitializationEvent e)
	{
		;
	}
	/*
	public void registerItem(Item item, String name, int meta, boolean model)
	{
		if (meta == 0)
			GameRegistry.register(item);
	}
	
	public void registerBlock(Block block, String name, boolean model)
	{
		registerBlock(block, name, model, model);
	}
	
	public void registerBlock(Block block, String name, boolean model, boolean item)
	{
		GameRegistry.register(block);
		
		if (item)
			registerItem(new ItemBlock(block).setRegistryName(new ResourceLocation(SDConstants.MODID, name)), name, 0, model);
	}
	
	public void registerBlock(Block block, String name, Class<? extends TileEntity> clazz, String tileEntityId, boolean model)
	{
		registerBlock(block, name, model);
		GameRegistry.registerTileEntity(clazz, tileEntityId);
	}
	*/
	public void initBuiltinShapes()
	{
	}
}

	package myke.mod.objects.items;

	import myke.mod.Main;
	import myke.mod.init.ItemInit;
	import myke.mod.util.IHasModel;
	import net.minecraft.creativetab.CreativeTabs;
	import net.minecraft.item.EnumRarity;
	import net.minecraft.item.Item;
	import net.minecraft.item.ItemStack;

	public class ItemBase extends Item implements IHasModel
	{
		public ItemBase(String name)
		{
			setUnlocalizedName(name);
			setRegistryName(name);
			setCreativeTab(Main.modularbaublestab);
			
			ItemInit.ITEMS.add(this);
		}

		@Override
		public void registerModels() 
		{
			Main.proxy.registerItemRenderer(this, 0, "inventory");
		}
	}
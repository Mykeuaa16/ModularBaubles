package myke.mod.tabs;

import myke.mod.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ModularBaublesTab extends CreativeTabs{
	public ModularBaublesTab(String label) {super ("mobularbaublestab");
	this.setBackgroundImageName("modularbaublestab.png");
	}

	@Override
	public ItemStack getTabIconItem() {return new ItemStack(ItemInit.AMULET_EMERALD);
	}
}

package myke.mod.init;

import java.util.ArrayList;
import java.util.List;

import baubles.api.BaubleSlot;
import baubles.api.BaubleSlot;
import myke.mod.objects.items.BaublesBase;
import myke.mod.objects.items.BaublesBase;
import myke.mod.objects.items.BaublesBase;
import myke.mod.objects.items.BaublesBase;
import myke.mod.objects.items.BaublesBase;
import myke.mod.objects.items.ItemBase;
import myke.mod.objects.items.BaublesBase.BaublesMaterial;
import myke.mod.objects.items.BaublesBase;
import net.minecraft.item.Item;

public class ItemInit 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//items
	public static final Item RUBY = new ItemBase("ruby");
	
	//RINGS
	public static final Item RING_IRON = new BaublesBase("ring_iron",  BaublesMaterial.IRON, BaubleSlot.RING);
	public static final Item RING_SILVER = new BaublesBase("ring_silver", BaublesMaterial.SILVER, BaubleSlot.RING);
	public static final Item RING_GOLD = new BaublesBase("ring_gold", BaublesMaterial.GOLD, BaubleSlot.RING);
	public static final Item RING_RUBY = new BaublesBase("ring_ruby", BaublesMaterial.RUBY, BaubleSlot.RING);
	public static final Item RING_SAPPHIRE = new BaublesBase("ring_sapphire", BaublesMaterial.SAPPHIRE, BaubleSlot.RING);
	public static final Item RING_EMERALD = new BaublesBase("ring_emerald", BaublesMaterial.EMERALD, BaubleSlot.RING);
	public static final Item RING_DIAMOND = new BaublesBase("ring_diamond", BaublesMaterial.DIAMOND, BaubleSlot.RING);
	//BODIES
	public static final Item CLOAK_IRON = new BaublesBase("cloak_iron", BaublesMaterial.IRON, BaubleSlot.BODY);
	public static final Item CLOAK_SILVER = new BaublesBase("cloak_silver", BaublesMaterial.SILVER, BaubleSlot.BODY);
	public static final Item CLOAK_GOLD = new BaublesBase("cloak_gold",BaublesMaterial.GOLD, BaubleSlot.BODY);
	public static final Item CLOAK_RUBY = new BaublesBase("cloak_ruby",BaublesMaterial.RUBY, BaubleSlot.BODY);
	public static final Item CLOAK_SAPPHIRE = new BaublesBase("cloak_sapphire", BaublesMaterial.SAPPHIRE, BaubleSlot.BODY);
	public static final Item CLOAK_EMERALD = new BaublesBase("cloak_emerald", BaublesMaterial.EMERALD, BaubleSlot.BODY);
	public static final Item CLOAK_DIAMOND = new BaublesBase("cloak_diamond", BaublesMaterial.DIAMOND, BaubleSlot.BODY);
	
	//CHARMS
	public static final Item CHARM_RUBY = new BaublesBase("charm_ruby",BaublesMaterial.RUBY, BaubleSlot.CHARM);
	public static final Item CHARM_SAPPHIRE = new BaublesBase("charm_sapphire", BaublesMaterial.SAPPHIRE, BaubleSlot.CHARM);
	public static final Item CHARM_EMERALD = new BaublesBase("charm_emerald", BaublesMaterial.EMERALD, BaubleSlot.CHARM);
	public static final Item CHARM_DIAMOND = new BaublesBase("charm_diamond", BaublesMaterial.DIAMOND,  BaubleSlot.CHARM);
	//AMULETS
	public static final Item AMULET_RUBY = new BaublesBase("amulet_ruby", BaublesMaterial.RUBY,  BaubleSlot.AMULET);
	public static final Item AMULET_SAPPHIRE = new BaublesBase("amulet_sapphire", BaublesMaterial.SAPPHIRE, BaubleSlot.AMULET);
	public static final Item AMULET_EMERALD = new BaublesBase("amulet_emerald", BaublesMaterial.EMERALD, BaubleSlot.AMULET);
	public static final Item AMULET_DIAMOND = new BaublesBase("amulet_diamond", BaublesMaterial.DIAMOND, BaubleSlot.AMULET);
	//BELTS
	public static final Item BELTIRON = new BaublesBase("belt_iron", BaublesMaterial.IRON, BaubleSlot.AMULET);
	public static final Item BELT_SILVER = new BaublesBase("belt_silver", BaublesMaterial.SILVER, BaubleSlot.AMULET);
	public static final Item BELT_GOLD = new BaublesBase("belt_gold", BaublesMaterial.GOLD, BaubleSlot.AMULET);
	public static final Item BELT_RUBY = new BaublesBase("belt_ruby", BaublesMaterial.RUBY, BaubleSlot.AMULET);
	public static final Item BELT_SAPPHIRE = new BaublesBase("belt_sapphire", BaublesMaterial.SAPPHIRE, BaubleSlot.AMULET);
	public static final Item BELTE_MERALD = new BaublesBase("belt_emerald", BaublesMaterial.EMERALD, BaubleSlot.AMULET);
	public static final Item BELT_DIAMOND = new BaublesBase("belt_diamond", BaublesMaterial.DIAMOND, BaubleSlot.AMULET);
}
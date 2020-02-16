package myke.mod.objects.items;

import java.util.List;
import java.util.UUID;


import com.google.common.base.Predicates;
import com.google.common.collect.Multimap;

import baubles.api.BaubleSlot;
import baubles.api.IBauble;
import myke.mod.Main;
import myke.mod.init.ItemInit;
import myke.mod.objects.items.BaublesBase.BaublesMaterial;
import myke.mod.util.IHasModel;
import net.minecraft.block.BlockDispenser;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.dispenser.BehaviorDefaultDispenseItem;
import net.minecraft.dispenser.IBehaviorDispenseItem;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.enchantment.Enchantment.Rarity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EntitySelectors;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BaublesBase extends Item implements IHasModel, IBauble
	{
	public final BaubleSlot baublestype;

	    private BaublesMaterial material = null;

	    	public BaublesBase(String name, BaublesMaterial materialIn, BaubleSlot baubleSlot)
	    	{
	    		setUnlocalizedName(name);
	    		setRegistryName(name);
	    		setCreativeTab(Main.modularbaublestab);
	    		ItemInit.ITEMS.add(this);
	    		this.baublestype = baubleSlot;
				this.material = materialIn;
	    		this.maxStackSize = 4;
	    	}
	    	
	    	@Override
	    	public void registerModels() 
	    	{
	    		Main.proxy.registerItemRenderer(this, 0, "inventory");
	    	}
	    	
	    @SideOnly(Side.CLIENT)
		public BaubleSlot getBaubleType(ItemStack arg0) {
			
			return null;
		}
	    public int getItemEnchantability()
	    {
	        return this.material.getEnchantability();
	    }

	    public BaublesBase.BaublesMaterial getBaublesMaterial()
	    {
	        return this.material;
	    }
	    
	    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
	    {
	        ItemStack mat = this.material.getRepairItemStack();
	        if (!mat.isEmpty() && net.minecraftforge.oredict.OreDictionary.itemMatches(mat,repair,false)) return true;
	        return super.getIsRepairable(toRepair, repair);
	    }

	    public enum BaublesMaterial
	    {
	        
	        IRON("iron", 10, Rarity.UNCOMMON),
	        SILVER("silver", 15, Rarity.RARE),
	        GOLD("gold", 20, Rarity.VERY_RARE),
	        
	        RUBY("ruby", 25, Rarity.COMMON),
	        SAPPHIRE("sapphire", 30, Rarity.UNCOMMON),
	    	EMERALD("emerald", 35, Rarity.RARE),
	    	DIAMOND("diamond", 40, Rarity.VERY_RARE);

	        private final String name;
	        
	        private final int enchantability;
	        //Added by forge for custom Armor materials.
	        public ItemStack repairMaterial = ItemStack.EMPTY;

	        private BaublesMaterial(String nameIn, int enchantabilityIn, Rarity materialIn)
	        {
	            this.name = nameIn;
	            this.enchantability = enchantabilityIn;
	           
	        }

	        
	        public int getEnchantability()
	        {
	            return this.enchantability;
	        }

	        @Deprecated 
	        public Item getRepairItem()
	        {
	        	if (this == RUBY)
	        	{
	        		return ItemInit.RUBY;
	            }
	            else if (this == IRON)
	            {
	                return Items.IRON_NUGGET;
	            }
	            else if (this == GOLD)
	            {
	                return Items.GOLD_NUGGET;
	            }
	            else if (this == DIAMOND) 
	            {    	
	                return Items.DIAMOND;
	            }
	        	else if (this == EMERALD);
	        	{
	        		return Items.EMERALD;
	        	}
	        	
	        }

	        @SideOnly(Side.CLIENT)
	        public String getName()
	        {
	            return this.name;
	        }

	        public BaublesMaterial setRepairItem(ItemStack stack)
	        {
	            if (!this.repairMaterial.isEmpty()) throw new RuntimeException("Repair material has already been set");
	            if (this == GOLD || this == SILVER || this == IRON || this == DIAMOND || this == EMERALD || this == SAPPHIRE || this == RUBY);
	            this.repairMaterial = stack;
	            return this;
	        }

	        public ItemStack getRepairItemStack()
	        {
	            if (!repairMaterial.isEmpty()) return repairMaterial;
	            Item ret = this.getRepairItem();
	            if (ret != null) repairMaterial = new ItemStack(ret,1,net.minecraftforge.oredict.OreDictionary.WILDCARD_VALUE);
	            return repairMaterial;
	        }
		}
	}
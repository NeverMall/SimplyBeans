package com.ironnugget.simplybeans.init;

import com.ironnugget.simplybeans.SimplyBeans;
import com.ironnugget.simplybeans.SimplyBeans.SimplyBeansItemGroup;

import net.minecraft.item.Foods;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SoupItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings("unused")
public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, SimplyBeans.MOD_ID);
	
	public static final RegistryObject<Item> coal_soup = ITEMS.register("coal_soup",
			() ->  new SoupItem(new Item.Properties().maxStackSize(1).group(SimplyBeansItemGroup.instance).food(Foods.BEETROOT_SOUP)));
	public static final RegistryObject<Item> iron_soup = ITEMS.register("iron_soup",
			() ->  new SoupItem(new Item.Properties().maxStackSize(1).group(SimplyBeansItemGroup.instance).food(Foods.BEETROOT_SOUP)));
	public static final RegistryObject<Item> gold_soup = ITEMS.register("gold_soup",
			() ->  new SoupItem(new Item.Properties().maxStackSize(1).group(SimplyBeansItemGroup.instance).food(Foods.BEETROOT_SOUP)));
	public static final RegistryObject<Item> lapis_soup = ITEMS.register("lapis_soup",
			() ->  new SoupItem(new Item.Properties().maxStackSize(1).group(SimplyBeansItemGroup.instance).food(Foods.BEETROOT_SOUP)));
	public static final RegistryObject<Item> redstone_soup = ITEMS.register("redstone_soup",
			() ->  new SoupItem(new Item.Properties().maxStackSize(1).group(SimplyBeansItemGroup.instance).food(Foods.BEETROOT_SOUP)));
	public static final RegistryObject<Item> quartz_soup = ITEMS.register("quartz_soup",
			() ->  new SoupItem(new Item.Properties().maxStackSize(1).group(SimplyBeansItemGroup.instance).food(Foods.BEETROOT_SOUP)));
	public static final RegistryObject<Item> diamond_soup = ITEMS.register("diamond_soup",
			() ->  new SoupItem(new Item.Properties().maxStackSize(1).group(SimplyBeansItemGroup.instance).food(Foods.BEETROOT_SOUP)));
	public static final RegistryObject<Item> emerald_soup = ITEMS.register("emerald_soup",
			() ->  new SoupItem(new Item.Properties().maxStackSize(1).group(SimplyBeansItemGroup.instance).food(Foods.BEETROOT_SOUP)));

}
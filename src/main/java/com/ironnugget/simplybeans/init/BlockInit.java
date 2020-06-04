package com.ironnugget.simplybeans.init;

import com.ironnugget.simplybeans.SimplyBeans;
import com.ironnugget.simplybeans.objects.blocks.BeanBlock;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, SimplyBeans.MOD_ID);
	
	public static final RegistryObject<Block> coal_bean = BLOCKS.register("coal_bean",
			() -> new BeanBlock(Block.Properties.create(Material.PLANTS).tickRandomly().hardnessAndResistance(0.2f, 3f).sound(SoundType.STONE).notSolid()));	
	public static final RegistryObject<Block> iron_bean = BLOCKS.register("iron_bean",
			() -> new BeanBlock(Block.Properties.create(Material.PLANTS).tickRandomly().hardnessAndResistance(0.2f, 3f).sound(SoundType.METAL).notSolid()));
	public static final RegistryObject<Block> gold_bean = BLOCKS.register("gold_bean",
			() -> new BeanBlock(Block.Properties.create(Material.PLANTS).tickRandomly().hardnessAndResistance(0.2f, 3f).sound(SoundType.METAL).notSolid()));
	public static final RegistryObject<Block> lapis_bean = BLOCKS.register("lapis_bean",
			() -> new BeanBlock(Block.Properties.create(Material.PLANTS).tickRandomly().hardnessAndResistance(0.2f, 3f).sound(SoundType.METAL).notSolid()));
	public static final RegistryObject<Block> redstone_bean = BLOCKS.register("redstone_bean",
			() -> new BeanBlock(Block.Properties.create(Material.PLANTS).tickRandomly().hardnessAndResistance(0.2f, 3f).sound(SoundType.METAL).notSolid()));
	public static final RegistryObject<Block> quartz_bean = BLOCKS.register("quartz_bean",
			() -> new BeanBlock(Block.Properties.create(Material.PLANTS).tickRandomly().hardnessAndResistance(0.2f, 3f).sound(SoundType.METAL).notSolid()));
	public static final RegistryObject<Block> diamond_bean = BLOCKS.register("diamond_bean",
			() -> new BeanBlock(Block.Properties.create(Material.PLANTS).tickRandomly().hardnessAndResistance(0.2f, 3f).sound(SoundType.METAL).notSolid()));
	public static final RegistryObject<Block> emerald_bean = BLOCKS.register("emerald_bean",
			() -> new BeanBlock(Block.Properties.create(Material.PLANTS).tickRandomly().hardnessAndResistance(0.2f, 3f).sound(SoundType.METAL).notSolid()));
}

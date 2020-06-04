package com.ironnugget.simplybeans.util;

import com.ironnugget.simplybeans.SimplyBeans;
import com.ironnugget.simplybeans.init.BlockInit;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;


@Mod.EventBusSubscriber(modid = SimplyBeans.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

	@SubscribeEvent
	public static void clientSetup(FMLClientSetupEvent event)
	{
		RenderTypeLookup.setRenderLayer(BlockInit.coal_bean.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.iron_bean.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.gold_bean.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.lapis_bean.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.redstone_bean.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.quartz_bean.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.diamond_bean.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.emerald_bean.get(), RenderType.getCutout());
	}
}

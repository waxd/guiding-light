package dev.waxd.lighthouse;

import dev.waxd.lighthouse.client.LighthouseController;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("lighthouse")
public class Lighthouse {

    private static final Logger LOGGER = LogManager.getLogger();
    private static final Block lighthouseControllerBlock = new LighthouseController().setRegistryName("lighthouse", "lighthouse_controller_block");

    public Lighthouse() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
    }

    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
            blockRegistryEvent.getRegistry().register(lighthouseControllerBlock);
        }

        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Item lighthouseController = new BlockItem(lighthouseControllerBlock, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName("lighthouse", "lighthouse_controller_item");

            event.getRegistry().register(lighthouseController);
        }
    }
}

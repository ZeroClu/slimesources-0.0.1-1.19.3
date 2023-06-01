package net.zeroclu.practicemod.item;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.zeroclu.slimesources.SlimeSources;
import net.zeroclu.slimesources.item.ModItems;

@Mod.EventBusSubscriber(modid = SlimeSources.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab SLIMESOURCES_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        SLIMESOURCES_TAB = event.registerCreativeModeTab(new ResourceLocation(SlimeSources.MOD_ID, "slimesources_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.IRON_SLIMEBALL.get()))
                        .title(Component.translatable("creativemodetab.slimesources_tab")));
    }
}

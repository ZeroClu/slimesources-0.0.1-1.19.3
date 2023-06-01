package net.zeroclu.slimesources.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.zeroclu.slimesources.SlimeSources;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SlimeSources.MOD_ID);

    public static final RegistryObject<Item> IRON_SLIMEBALL = ITEMS.register("iron_slimeball",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) { ITEMS.register(eventBus); }
}

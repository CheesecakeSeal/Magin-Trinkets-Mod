package net.nacinw.magintrinkets.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nacinw.magintrinkets.MaginTrinketsMod;

public class ModItems{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MaginTrinketsMod.MOD_ID);

    public static final RegistryObject<Item> THONK = ITEMS.register("thonk",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MAGIN_TRINKETS_TAB)));

    public static final RegistryObject<Item>  LEGIT_PENGUIN = ITEMS.register("legitpenguin",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MAGIN_TRINKETS_TAB)));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

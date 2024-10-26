package net.nacinw.magintrinkets.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab{
    public static final CreativeModeTab MAGIN_TRINKETS_TAB = new CreativeModeTab("magin_trinkets_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.THONK.get());
        }
    };
}

package net.nacinw.magintrinkets.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nacinw.magintrinkets.MaginTrinketsMod;
import net.nacinw.magintrinkets.item.ModCreativeModeTab;
import net.nacinw.magintrinkets.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks{
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MaginTrinketsMod.MOD_ID);

    public static final RegistryObject<Block> TEA_BLOCK = registerBlock("tea_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.MOSS).strength(10f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.MAGIN_TRINKETS_TAB);

    public static final RegistryObject<Block> HOOFLEOK_ORE = registerBlock("hoofleok_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)), ModCreativeModeTab.MAGIN_TRINKETS_TAB);

    public static final RegistryObject<Block> DEEPSLATE_HOOFLEOK_ORE = registerBlock("deepslate_hoofleok_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(8f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)), ModCreativeModeTab.MAGIN_TRINKETS_TAB);

    public static final RegistryObject<Block> NETHERRACK_HOOFLEOK_ORE = registerBlock("netherrack_hoofleok_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(8f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)), ModCreativeModeTab.MAGIN_TRINKETS_TAB);

    public static final RegistryObject<Block> ENDSTONE_HOOFLEOK_ORE = registerBlock("endstone_hoofleok_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(8f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)), ModCreativeModeTab.MAGIN_TRINKETS_TAB);

    public static final RegistryObject<Block> HOOFLEOK_BLOCK = registerBlock("hoofleok_block",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(10f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.MAGIN_TRINKETS_TAB);

// registers block
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }
// Registers Item associated with block
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}

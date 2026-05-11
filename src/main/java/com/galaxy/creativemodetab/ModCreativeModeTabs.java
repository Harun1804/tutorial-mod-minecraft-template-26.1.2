package com.galaxy.creativemodetab;

import com.galaxy.TutorialMod26x;
import com.galaxy.item.ModItems;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {
    public static void registerModCreativeModeTabs() {
        TutorialMod26x.LOGGER.info("Registering Creative Mode Tabs for " + TutorialMod26x.MOD_ID);
    }

    public static final CreativeModeTab FLUORITE_BLOCK_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
        Identifier.fromNamespaceAndPath(TutorialMod26x.MOD_ID,"fluorite_blocks"),
        FabricCreativeModeTab.builder()
            .icon(() -> new ItemStack(ModItems.FLUORITE))
            .title(Component.translatable("creativemodetab.tutorial-mod-26x.fluorite_blocks"))
            .displayItems((context, output) -> {
                output.accept(ModItems.RAW_FLUORITE);
            })
            .build()
    );

    public static final CreativeModeTab FLUORITE_ITEM_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
        Identifier.fromNamespaceAndPath(TutorialMod26x.MOD_ID,"fluorite_items"),
        FabricCreativeModeTab.builder()
            .icon(() -> new ItemStack(ModItems.FLUORITE))
            .title(Component.translatable("creativemodetab.tutorial-mod-26x.fluorite_items"))
            .displayItems((context, output) -> {
                output.accept(ModItems.FLUORITE);
                output.accept(ModItems.RAW_FLUORITE);
            })
            .build()
    );
}

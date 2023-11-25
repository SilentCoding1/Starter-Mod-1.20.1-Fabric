package net.silent.examplemod.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.silent.examplemod.ExampleMod;

public class ModTags {
    public static class Blocks  {

        public static final TagKey<Block> METAL_DETECTOR_DETECTABLE_BLOCK =
                createTag("metal_detector_detectable_blocks");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(ExampleMod.MOD_ID, name));
        }

    }

    public static class Items {

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(ExampleMod.MOD_ID, name));
        }

    }

}

package com.itayfeder.slime_crafter.init;

import com.itayfeder.slime_crafter.SlimeCrafter;
import com.itayfeder.slime_crafter.items.PlortItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SlimeCrafter.MOD_ID);

    public static final RegistryObject<Item> PINK_PLORT = ITEMS.register("pink_plort",
            () -> new PlortItem(new Item.Properties().group(SlimeCrafter.SlimeCrafterItemGroup.instance).maxStackSize(64)));

    public static final RegistryObject<Item> ROCK_PLORT = ITEMS.register("rock_plort",
            () -> new PlortItem(new Item.Properties().group(SlimeCrafter.SlimeCrafterItemGroup.instance).maxStackSize(64)));

    public static final RegistryObject<Item> PHOSPHOR_PLORT = ITEMS.register("phosphor_plort",
            () -> new PlortItem(new Item.Properties().group(SlimeCrafter.SlimeCrafterItemGroup.instance).maxStackSize(64)));

    public static final RegistryObject<Item> TABBY_PLORT = ITEMS.register("tabby_plort",
            () -> new PlortItem(new Item.Properties().group(SlimeCrafter.SlimeCrafterItemGroup.instance).maxStackSize(64)));

    public static final RegistryObject<Item> RAD_PLORT = ITEMS.register("rad_plort",
            () -> new PlortItem(new Item.Properties().group(SlimeCrafter.SlimeCrafterItemGroup.instance).maxStackSize(64)));

    public static final RegistryObject<Item> HONEY_PLORT = ITEMS.register("honey_plort",
            () -> new PlortItem(new Item.Properties().group(SlimeCrafter.SlimeCrafterItemGroup.instance).maxStackSize(64)));

    public static final RegistryObject<Item> BOOM_PLORT = ITEMS.register("boom_plort",
            () -> new PlortItem(new Item.Properties().group(SlimeCrafter.SlimeCrafterItemGroup.instance).maxStackSize(64)));
}

package net.bidibits.stonebrick;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

@Mod(modid = StoneBrickS.MODID, version = StoneBrickS.VERSION, acceptableRemoteVersions = "*")
public class StoneBrickS {
    public static final String MODID = "stonebrick";
    public static final String VERSION = "1.0.0";

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        // Chiseled Stone Bricks (98:3)
        GameRegistry.addShapelessRecipe(
                new ItemStack(Blocks.stonebrick, 2, 3), // Output: 2 Chiseled Stone Brick
                new ItemStack(Blocks.stonebrick, 1, 0), // Input: Regular Stone Brick
                new ItemStack(Blocks.stonebrick, 1, 0)
        );

        // Cracked Stone Bricks (98:2)
        GameRegistry.addSmelting(
                new ItemStack(Blocks.stonebrick, 1, 0), // Input: Regular Stone Bricks
                new ItemStack(Blocks.stonebrick, 2, 2), // Output: 1 Cracked Stone Brick
                0.1F                                                       // XP reward
        );

        // Mossy Stone Bricks (98:1)
        GameRegistry.addShapelessRecipe(
                new ItemStack(Blocks.stonebrick, 2, 1), // Output: 2 Mossy Stone Brick
                new ItemStack(Blocks.stonebrick, 1, 0), // Input: Regular Stone Brick
                new ItemStack(Blocks.stonebrick, 1, 0),
                Blocks.vine
        );
    }
}

package uk.co.mysterymayhem.gravitymod.common.items.armour;

import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import uk.co.mysterymayhem.gravitymod.api.IWeakGravityEnabler;
import uk.co.mysterymayhem.gravitymod.common.items.materials.ItemGravityIngot;
import uk.co.mysterymayhem.gravitymod.common.registries.IGravityModItem;
import uk.co.mysterymayhem.gravitymod.common.registries.StaticItems;

/**
 * Created by Mysteryem on 2016-11-05.
 */
public class ItemGravityLeggings extends ItemArmor implements IGravityModItem<ItemGravityLeggings>, IWeakGravityEnabler {
    public ItemGravityLeggings() {
        super(ItemGravityIngot.ARMOUR_MATERIAL, 2, EntityEquipmentSlot.LEGS);
    }

    @Override
    public String getModObjectName() {
        return "gravityleggings";
    }

    @Override
    public void postInit() {
        GameRegistry.addRecipe(new ShapedOreRecipe(
                new ItemStack(this),
                "III",
                "ILI",
                "I I",
                'I', "ingotIron",
                'L', StaticItems.LIQUID_ANTI_MASS_BUCKET));
        GameRegistry.addRecipe(new ShapedOreRecipe(
                new ItemStack(this),
                "III",
                "I I",
                "ILI",
                'I', "ingotIron",
                'L', StaticItems.LIQUID_ANTI_MASS_BUCKET));
        GameRegistry.addShapelessRecipe(new ItemStack(this), Items.IRON_LEGGINGS, StaticItems.LIQUID_ANTI_MASS_BUCKET);
    }
}

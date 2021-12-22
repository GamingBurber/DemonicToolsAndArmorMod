
package net.mcreator.demonicsword.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.demonicsword.itemgroup.DemonicSwordItemsItemGroup;
import net.mcreator.demonicsword.DemonicSwordModElements;

@DemonicSwordModElements.ModElement.Tag
public class DemonicHoeItem extends DemonicSwordModElements.ModElement {
	@ObjectHolder("demonic_sword:demonic_hoe")
	public static final Item block = null;
	public DemonicHoeItem(DemonicSwordModElements instance) {
		super(instance, 25);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 100000;
			}

			public float getEfficiency() {
				return 30f;
			}

			public float getAttackDamage() {
				return 1f;
			}

			public int getHarvestLevel() {
				return 5;
			}

			public int getEnchantability() {
				return 30;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 0, -1f, new Item.Properties().group(DemonicSwordItemsItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("demonic_hoe"));
	}
}


package net.mcreator.demonicsword.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.demonicsword.itemgroup.DemonicSwordItemsItemGroup;
import net.mcreator.demonicsword.DemonicSwordModElements;

@DemonicSwordModElements.ModElement.Tag
public class DemonicShovelItem extends DemonicSwordModElements.ModElement {
	@ObjectHolder("demonic_sword:demonic_shovel")
	public static final Item block = null;
	public DemonicShovelItem(DemonicSwordModElements instance) {
		super(instance, 24);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 10000;
			}

			public float getEfficiency() {
				return 30f;
			}

			public float getAttackDamage() {
				return 4f;
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
		}, 1, 1f, new Item.Properties().group(DemonicSwordItemsItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("demonic_shovel"));
	}
}

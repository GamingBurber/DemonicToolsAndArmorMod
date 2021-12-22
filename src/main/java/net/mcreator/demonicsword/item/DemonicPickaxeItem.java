
package net.mcreator.demonicsword.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.demonicsword.itemgroup.DemonicSwordItemsItemGroup;
import net.mcreator.demonicsword.DemonicSwordModElements;

@DemonicSwordModElements.ModElement.Tag
public class DemonicPickaxeItem extends DemonicSwordModElements.ModElement {
	@ObjectHolder("demonic_sword:demonic_pickaxe")
	public static final Item block = null;
	public DemonicPickaxeItem(DemonicSwordModElements instance) {
		super(instance, 20);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 100000;
			}

			public float getEfficiency() {
				return 30f;
			}

			public float getAttackDamage() {
				return 3f;
			}

			public int getHarvestLevel() {
				return 5;
			}

			public int getEnchantability() {
				return 30;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(ReinforcedDemonicIngotItem.block));
			}
		}, 1, -2f, new Item.Properties().group(DemonicSwordItemsItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("demonic_pickaxe"));
	}
}

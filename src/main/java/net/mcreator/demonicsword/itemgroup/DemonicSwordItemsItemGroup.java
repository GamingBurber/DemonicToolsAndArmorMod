
package net.mcreator.demonicsword.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.demonicsword.item.DemonicSwordItem;
import net.mcreator.demonicsword.DemonicSwordModElements;

@DemonicSwordModElements.ModElement.Tag
public class DemonicSwordItemsItemGroup extends DemonicSwordModElements.ModElement {
	public DemonicSwordItemsItemGroup(DemonicSwordModElements instance) {
		super(instance, 14);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabdemonic_sword_items") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(DemonicSwordItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}

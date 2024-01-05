
package net.mcreator.ceshi.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.mcreator.ceshi.init.PrimogemcraftModItems;

import java.util.List;

public class Ljtg01Item extends ShieldItem {
	public Ljtg01Item() {
		super(new Item.Properties().durability(200));
	}

	@Override
	public boolean isValidRepairItem(ItemStack itemstack, ItemStack repairitem) {
		return Ingredient.of(new ItemStack(PrimogemcraftModItems.LAJITONGSUIPIAN.get()), new ItemStack(PrimogemcraftModItems.JLZA.get())).test(repairitem);
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A77\u771F\u7684\u4E0D\u662F\u4E00\u4E2A\u666E\u901A\u7684"));
		list.add(Component.literal("\u00A77\u5783\u573E\u6876\u76D6\u5417\uFF1F"));
	}
}

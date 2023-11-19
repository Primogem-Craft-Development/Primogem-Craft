
package net.mcreator.ceshi.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;
import net.minecraft.client.Minecraft;

import net.mcreator.ceshi.procedures.Liulang_jingyan_shuxingProcedure;
import net.mcreator.ceshi.procedures.Jingyanshu_beibaonaijiuProcedure;
import net.mcreator.ceshi.procedures.Dayingxiong_shu_faguangProcedure;

import java.util.List;

public class LiulangzhedejingyanItem extends Item {
	public LiulangzhedejingyanItem() {
		super(new Item.Properties().durability(551).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		Entity entity = Minecraft.getInstance().player;
		return Dayingxiong_shu_faguangProcedure.execute(entity, itemstack);
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A7"));
		list.add(Component.literal("\u00A77\u53EF\u4EE5\u50A8\u5B58\u00A7b20\u00A7a\u7ECF\u9A8C\u7B49\u7EA7\u00A77\u7684\u00A7a\u7ECF\u9A8C\u503C\uFF01"));
		list.add(Component.literal("\u00A77---------------------"));
		list.add(Component.literal("\u00A77\u5B58\u5165\u5F53\u524D\u7ECF\u9A8C\u503C\u00A7e[\u53F3\u952E]"));
		list.add(Component.literal("\u00A76[shift+\u53F3\u952E]\u00A77\u53D6\u51FA\u6240\u6709\u7ECF\u9A8C\u503C"));
		list.add(Component.literal("\u00A7"));
		list.add(Component.literal("\u00A7c - \u5347\u7EA7\u540E\u4E0D\u4FDD\u7559\u7ECF\u9A8C"));
		list.add(Component.literal("\u00A7c - \u7ECF\u9A8C\u4E66\u9891\u7E41\u5B58\u53D6\u53EF\u80FD"));
		list.add(Component.literal("\u00A7c\u635F\u5931\u4E00\u5C0F\u90E8\u5206\u7ECF\u9A8C\uFF01"));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		Liulang_jingyan_shuxingProcedure.execute(world, entity, ar.getObject());
		return ar;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		Jingyanshu_beibaonaijiuProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity, itemstack);
	}
}


package net.mcreator.ceshi.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import net.mcreator.ceshi.procedures.ZizaitaoshuxingProcedure;
import net.mcreator.ceshi.init.PrimogemcraftModItems;

import java.util.List;

import com.google.common.collect.Iterables;

public abstract class ZizaizuantaoItem extends ArmorItem {
	public ZizaizuantaoItem(ArmorItem.Type type, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForType(ArmorItem.Type type) {
				return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 117;
			}

			@Override
			public int getDefenseForType(ArmorItem.Type type) {
				return new int[]{4, 7, 9, 4}[type.getSlot().getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 14;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_diamond"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PrimogemcraftModItems.ZIZIYOUSONGSHISUIXIE.get()), new ItemStack(Items.DIAMOND));
			}

			@Override
			public String getName() {
				return "zizaizuantao";
			}

			@Override
			public float getToughness() {
				return 2f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.1f;
			}
		}, type, properties);
	}

	public static class Helmet extends ZizaizuantaoItem {
		public Helmet() {
			super(ArmorItem.Type.HELMET, new Item.Properties().fireResistant());
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(Component.literal("\u00A72\u5305\u542B\u5957\u88C5\u6570\u503C\uFF1A\u00A7e[1]"));
			list.add(Component.literal("\u00A7"));
			list.add(Component.literal("\u00A77 - 2\u5957\u88C5\uFF1A\u83B7\u5F97\u6C38\u4E45\u7FBD\u5760\u6548\u679C"));
			list.add(Component.literal("\u00A77 - 4\u5957\u88C5\uFF1A\u83B7\u5F97\u6C38\u4E45\u8DF3\u8DC3\u63D0\u5347\u6548\u679C"));
			list.add(Component.literal("\u00A7"));
			list.add(Component.literal("\u00A7d\u63D0\u5347\u7A0B\u5EA6\u57FA\u4E8E\u5957\u88C5\u6570\u503C"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "primogemcraft:textures/models/armor/zizaizuan__layer_1.png";
		}

		@Override
		public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
			super.inventoryTick(itemstack, world, entity, slot, selected);
			if (entity instanceof Player player && Iterables.contains(player.getArmorSlots(), itemstack)) {
				ZizaitaoshuxingProcedure.execute(entity, itemstack);
			}
		}
	}

	public static class Chestplate extends ZizaizuantaoItem {
		public Chestplate() {
			super(ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant());
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(Component.literal("\u00A72\u5305\u542B\u5957\u88C5\u6570\u503C\uFF1A\u00A7e[1]"));
			list.add(Component.literal("\u00A7"));
			list.add(Component.literal("\u00A77 - 2\u5957\u88C5\uFF1A\u83B7\u5F97\u6C38\u4E45\u7FBD\u5760\u6548\u679C"));
			list.add(Component.literal("\u00A77 - 4\u5957\u88C5\uFF1A\u83B7\u5F97\u6C38\u4E45\u8DF3\u8DC3\u63D0\u5347\u6548\u679C"));
			list.add(Component.literal("\u00A7"));
			list.add(Component.literal("\u00A7d\u63D0\u5347\u7A0B\u5EA6\u57FA\u4E8E\u5957\u88C5\u6570\u503C"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "primogemcraft:textures/models/armor/zizaizuan__layer_1.png";
		}

		@Override
		public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
			super.inventoryTick(itemstack, world, entity, slot, selected);
			if (entity instanceof Player player && Iterables.contains(player.getArmorSlots(), itemstack)) {
				ZizaitaoshuxingProcedure.execute(entity, itemstack);
			}
		}
	}

	public static class Leggings extends ZizaizuantaoItem {
		public Leggings() {
			super(ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant());
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(Component.literal("\u00A72\u5305\u542B\u5957\u88C5\u6570\u503C\uFF1A\u00A7e[1]"));
			list.add(Component.literal("\u00A7"));
			list.add(Component.literal("\u00A77 - 2\u5957\u88C5\uFF1A\u83B7\u5F97\u6C38\u4E45\u7FBD\u5760\u6548\u679C"));
			list.add(Component.literal("\u00A77 - 4\u5957\u88C5\uFF1A\u83B7\u5F97\u6C38\u4E45\u8DF3\u8DC3\u63D0\u5347\u6548\u679C"));
			list.add(Component.literal("\u00A7"));
			list.add(Component.literal("\u00A7d\u63D0\u5347\u7A0B\u5EA6\u57FA\u4E8E\u5957\u88C5\u6570\u503C"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "primogemcraft:textures/models/armor/zizaizuan__layer_2.png";
		}

		@Override
		public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
			super.inventoryTick(itemstack, world, entity, slot, selected);
			if (entity instanceof Player player && Iterables.contains(player.getArmorSlots(), itemstack)) {
				ZizaitaoshuxingProcedure.execute(entity, itemstack);
			}
		}
	}

	public static class Boots extends ZizaizuantaoItem {
		public Boots() {
			super(ArmorItem.Type.BOOTS, new Item.Properties().fireResistant());
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(Component.literal("\u00A72\u5305\u542B\u5957\u88C5\u6570\u503C\uFF1A\u00A7e[1]"));
			list.add(Component.literal("\u00A7"));
			list.add(Component.literal("\u00A77 - 2\u5957\u88C5\uFF1A\u83B7\u5F97\u6C38\u4E45\u7FBD\u5760\u6548\u679C"));
			list.add(Component.literal("\u00A77 - 4\u5957\u88C5\uFF1A\u83B7\u5F97\u6C38\u4E45\u8DF3\u8DC3\u63D0\u5347\u6548\u679C"));
			list.add(Component.literal("\u00A7"));
			list.add(Component.literal("\u00A7d\u63D0\u5347\u7A0B\u5EA6\u57FA\u4E8E\u5957\u88C5\u6570\u503C"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "primogemcraft:textures/models/armor/zizaizuan__layer_1.png";
		}

		@Override
		public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
			super.inventoryTick(itemstack, world, entity, slot, selected);
			if (entity instanceof Player player && Iterables.contains(player.getArmorSlots(), itemstack)) {
				ZizaitaoshuxingProcedure.execute(entity, itemstack);
			}
		}
	}
}

package net.mcreator.ceshi.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;

public class Hdlz_sx_1Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("qw_hdlz")) {
			entity.getPersistentData().putBoolean("qw_hdlz", false);
			itemstack.getOrCreateTag().putDouble("qw_hdlz_wp", (itemstack.getOrCreateTag().getDouble("qw_hdlz_wp") + 1));
		}
		if (itemstack.getOrCreateTag().getDouble("qw_hdlz_wp") >= 64 && (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).isEnchantable()) {
			{
				CompoundTag _nbtTag = ((EnchantmentHelper.enchantItem(RandomSource.create(), (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY), 1, false)).copy()).getTag();
				if (_nbtTag != null)
					(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).setTag(_nbtTag.copy());
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.enchantment_table.use")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.enchantment_table.use")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			itemstack.getOrCreateTag().putDouble("qw_hdlz_wp", 0);
		}
	}
}

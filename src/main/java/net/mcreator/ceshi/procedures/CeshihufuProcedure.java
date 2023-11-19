package net.mcreator.ceshi.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;

import net.mcreator.ceshi.PrimogemcraftMod;

public class CeshihufuProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (world.dayTime() == 40260) {
			{
				ItemStack _ist = itemstack;
				if (_ist.hurt(1, RandomSource.create(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
		}
		if (!entity.onGround()) {
			PrimogemcraftMod.queueServerWork(1, () -> {
				if (entity.onGround()) {
					entity.fallDistance = 0;
				}
			});
		}
	}
}

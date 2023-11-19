package net.mcreator.ceshi.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.ceshi.init.PrimogemcraftModMobEffects;
import net.mcreator.ceshi.init.PrimogemcraftModItems;

public class SzjsxProcedure {
	public static void execute(Entity entity, Entity sourceentity, ItemStack itemstack) {
		if (entity == null || sourceentity == null)
			return;
		if (itemstack.getItem() == PrimogemcraftModItems.SZTJ.get()) {
			if (!(sourceentity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(PrimogemcraftModMobEffects.QIANYELENGQUE.get()))) {
				if (entity instanceof Player) {
					if (entity instanceof LivingEntity _livEnt4 && _livEnt4.hasEffect(MobEffects.CONFUSION)) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, (int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.CONFUSION) ? _livEnt.getEffect(MobEffects.CONFUSION).getDuration() : 0) + 100),
									(int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.CONFUSION) ? _livEnt.getEffect(MobEffects.CONFUSION).getAmplifier() : 0) - 1)));
					} else {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 100, 0));
					}
				} else {
					if (entity instanceof LivingEntity _livEnt9 && _livEnt9.hasEffect(PrimogemcraftModMobEffects.QIANYE.get())) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(PrimogemcraftModMobEffects.QIANYE.get(),
									(int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(PrimogemcraftModMobEffects.QIANYE.get()) ? _livEnt.getEffect(PrimogemcraftModMobEffects.QIANYE.get()).getDuration() : 0) + 60),
									(int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(PrimogemcraftModMobEffects.QIANYE.get()) ? _livEnt.getEffect(PrimogemcraftModMobEffects.QIANYE.get()).getAmplifier() : 0) - 1)));
					} else {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(PrimogemcraftModMobEffects.QIANYE.get(), 60, 0));
					}
				}
				if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(PrimogemcraftModMobEffects.QIANYELENGQUE.get(), 40, 0, false, false));
			}
		}
		if (itemstack.getItem() == PrimogemcraftModItems.SZZSJ.get()) {
			if (!(sourceentity instanceof LivingEntity _livEnt17 && _livEnt17.hasEffect(PrimogemcraftModMobEffects.QIANYELENGQUE.get()))) {
				if (entity instanceof Player) {
					if (entity instanceof LivingEntity _livEnt19 && _livEnt19.hasEffect(MobEffects.CONFUSION)) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, (int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.CONFUSION) ? _livEnt.getEffect(MobEffects.CONFUSION).getDuration() : 0) + 160),
									(int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.CONFUSION) ? _livEnt.getEffect(MobEffects.CONFUSION).getAmplifier() : 0) - 1)));
					} else {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 160, 0));
					}
				} else {
					if (entity instanceof LivingEntity _livEnt24 && _livEnt24.hasEffect(PrimogemcraftModMobEffects.QIANYE.get())) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(PrimogemcraftModMobEffects.QIANYE.get(),
									(int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(PrimogemcraftModMobEffects.QIANYE.get()) ? _livEnt.getEffect(PrimogemcraftModMobEffects.QIANYE.get()).getDuration() : 0) + 100),
									(int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(PrimogemcraftModMobEffects.QIANYE.get()) ? _livEnt.getEffect(PrimogemcraftModMobEffects.QIANYE.get()).getAmplifier() : 0) - 1)));
					} else {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(PrimogemcraftModMobEffects.QIANYE.get(), 100, 1));
					}
				}
				if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(PrimogemcraftModMobEffects.QIANYELENGQUE.get(), 80, 0, false, false));
			}
		}
		if (itemstack.getItem() == PrimogemcraftModItems.SZHJJ.get()) {
			if (!(sourceentity instanceof LivingEntity _livEnt32 && _livEnt32.hasEffect(PrimogemcraftModMobEffects.QIANYELENGQUE.get()))) {
				if (entity instanceof Player) {
					if (entity instanceof LivingEntity _livEnt34 && _livEnt34.hasEffect(MobEffects.CONFUSION)) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, (int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.CONFUSION) ? _livEnt.getEffect(MobEffects.CONFUSION).getDuration() : 0) + 200),
									(int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.CONFUSION) ? _livEnt.getEffect(MobEffects.CONFUSION).getAmplifier() : 0) - 1)));
					} else {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 200, 1));
					}
				} else {
					if (entity instanceof LivingEntity _livEnt39 && _livEnt39.hasEffect(PrimogemcraftModMobEffects.QIANYE.get())) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(PrimogemcraftModMobEffects.QIANYE.get(),
									(int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(PrimogemcraftModMobEffects.QIANYE.get()) ? _livEnt.getEffect(PrimogemcraftModMobEffects.QIANYE.get()).getDuration() : 0) + 120),
									(int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(PrimogemcraftModMobEffects.QIANYE.get()) ? _livEnt.getEffect(PrimogemcraftModMobEffects.QIANYE.get()).getAmplifier() : 0) - 1)));
					} else {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(PrimogemcraftModMobEffects.QIANYE.get(), 120, 2));
					}
				}
				if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(PrimogemcraftModMobEffects.QIANYELENGQUE.get(), 160, 0, false, false));
			}
		}
	}
}

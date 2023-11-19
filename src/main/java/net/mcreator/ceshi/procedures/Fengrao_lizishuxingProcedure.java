package net.mcreator.ceshi.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.ceshi.init.PrimogemcraftModParticleTypes;
import net.mcreator.ceshi.init.PrimogemcraftModMobEffects;

import java.util.List;
import java.util.Comparator;

public class Fengrao_lizishuxingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(32 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof Player) {
					if (Math.random() < 0.2) {
						if (entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(PrimogemcraftModMobEffects.FENGRAO.get())) {
							world.addParticle((SimpleParticleType) (PrimogemcraftModParticleTypes.MOYIN.get()), (x + Mth.nextDouble(RandomSource.create(), 0 - 0.2, 0.2)), (y + Mth.nextDouble(RandomSource.create(), 0, 0.25)),
									(z - Mth.nextDouble(RandomSource.create(), 0 - 0.2, 0.2)), 0, (Mth.nextDouble(RandomSource.create(), 0.01, 0.3)), 0);
							world.addParticle((SimpleParticleType) (PrimogemcraftModParticleTypes.MOYIN.get()), x, (y + Mth.nextDouble(RandomSource.create(), 0, 0.25)), z, 0, (Mth.nextDouble(RandomSource.create(), 0.01, 0.3)), 0);
							world.addParticle((SimpleParticleType) (PrimogemcraftModParticleTypes.MOYIN.get()), (x - Mth.nextDouble(RandomSource.create(), 0 - 0.2, 0.8)), (y + Mth.nextDouble(RandomSource.create(), 0, 0.25)),
									(z + Mth.nextDouble(RandomSource.create(), 0 - 0.2, 0.8)), 0, (Mth.nextDouble(RandomSource.create(), 0.01, 0.3)), 0);
						}
					}
				}
			}
		}
		if (!(entity instanceof Player)) {
			if (!(entity instanceof LivingEntity _livEnt17 && _livEnt17.hasEffect(MobEffects.DAMAGE_RESISTANCE))) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 60, 1, false, false));
			}
		}
	}
}

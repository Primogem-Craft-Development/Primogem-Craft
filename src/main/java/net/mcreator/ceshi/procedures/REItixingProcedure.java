package net.mcreator.ceshi.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class REItixingProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (!ModList.get().isLoaded("roughlyenoughitems")) {
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level().getServer(), _ent),
							"/tellraw @s [{\"text\":\"\u539F\u77F3\u5DE5\u827A\uFF1A\",\"color\":\"aqua\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false},{\"text\":\"\\n\u4E0D\u4F1A\u73A9\uFF1F\u914D\u65B9\u6709\u8BEF\uFF1FJEI\u914D\u65B9\u4E0D\u5168\uFF1F\u5BF9\u6A21\u7EC4\u6709\u7591\u95EE\uFF1F\\n\u5982\u679C\u60A8\u6CA1\u6709\u4F7F\u7528\u5F3A\u5927\u7684REI\u6A21\u7EC4\uFF0C\u90A3\u4E48\",\"color\":\"white\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false},{\"text\":\"\\nhttps://www.mcmod.cn/class/1674.html\",\"color\":\"dark_aqua\",\"bold\":false,\"italic\":false,\"underlined\":true,\"strikethrough\":false,\"obfuscated\":false,\"clickEvent\":{\"action\":\"open_url\",\"value\":\"https://www.mcmod.cn/class/1674.html\"},\"hoverEvent\":{\"action\":\"show_text\",\"value\":\"MCMOD\u767E\u79D1\"}},{\"text\":\"\\n\u4F1A\u9002\u5408\u4F60\uFF01\",\"color\":\"white\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false},{\"text\":\"\\n\u5BF9\u8054\u52A8\u7684\u6A21\u7EC4\u6709\u5174\u8DA3\uFF1F\",\"color\":\"yellow\",\"bold\":false,\"italic\":false,\"underlined\":false,\"strikethrough\":false,\"obfuscated\":false},{\"text\":\"\u4E86\u89E3\u66F4\u591A\",\"color\":\"aqua\",\"bold\":false,\"italic\":false,\"underlined\":true,\"strikethrough\":false,\"obfuscated\":false,\"clickEvent\":{\"action\":\"open_url\",\"value\":\"https://www.mcmod.cn/class/10429.html\"},\"hoverEvent\":{\"action\":\"show_text\",\"value\":\"MC\u767E\u79D1\uFF1A\u539F\u77F3\u5DE5\u827A\"}}]");
				}
			}
		}
	}
}

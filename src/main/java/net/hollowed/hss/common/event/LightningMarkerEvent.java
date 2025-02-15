package net.hollowed.hss.common.event;

import net.hollowed.hss.HollowedsSwordsAndSorcery;
import net.minecraft.commands.CommandSource;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;

public class LightningMarkerEvent {
    public static void execute(LevelAccessor world, Entity entity) {
        if (entity == null)
            return;
        HollowedsSwordsAndSorcery.queueServerWork(1, () -> {
            {
                Entity _ent = entity;
                if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                    _ent.getServer().getCommands().performPrefixedCommand(
                            new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
                                    _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
                                    _ent.getDisplayName(), _ent.level.getServer(), _ent),
                            "/execute at @e[tag=lightning] run particle hss:electric_pulse ~ ~2 ~");
                }
            }
            {
                Entity _ent = entity;
                if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                    _ent.getServer().getCommands().performPrefixedCommand(
                            new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
                                    _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
                                    _ent.getDisplayName(), _ent.level.getServer(), _ent),
                            "/execute at @e[tag=lightning] run playsound minecraft:entity.evoker.prepare_summon player @a ~ ~ ~ 3");
                }
            }
            {
                Entity _ent = entity;
                if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                    _ent.getServer().getCommands().performPrefixedCommand(
                            new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
                                    _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
                                    _ent.getDisplayName(), _ent.level.getServer(), _ent),
                            "/execute at @e[tag=lightning] run effect give @e[distance=..4] minecraft:levitation 1 0 true");
                }
            }
            HollowedsSwordsAndSorcery.queueServerWork(20, () -> {

                    {
                        Entity _ent = entity;
                        if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                            _ent.getServer().getCommands().performPrefixedCommand(
                                    new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
                                            _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
                                            _ent.getDisplayName(), _ent.level.getServer(), _ent),
                                    "/execute at @e[tag=lightning] run particle hss:electrical_crackle ~ ~ ~ 2 2 2 0.01 30 normal");
                        }
                    }
                    {
                        Entity _ent = entity;
                        if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                            _ent.getServer().getCommands().performPrefixedCommand(
                                    new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
                                            _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
                                            _ent.getDisplayName(), _ent.level.getServer(), _ent),
                                    "/execute at @e[tag=lightning] run particle hss:friction_sparks ~ ~2 ~ 0 0 0 0.2 50 normal");
                        }
                    }
                    {
                        Entity _ent = entity;
                        if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                            _ent.getServer().getCommands().performPrefixedCommand(
                                    new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
                                            _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
                                            _ent.getDisplayName(), _ent.level.getServer(), _ent),
                                    "execute at @e[tag=lightning] run playsound minecraft:item.trident.thunder player @a ~ ~ ~ 5");
                        }
                    }
                    {
                        Entity _ent = entity;
                        if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                            _ent.getServer().getCommands().performPrefixedCommand(
                                    new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
                                            _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
                                            _ent.getDisplayName(), _ent.level.getServer(), _ent),
                                    "execute at @e[tag=lightning] run summon minecraft:lightning_bolt ~ ~ ~");
                        }
                    }
                    {
                        Entity _ent = entity;
                        if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                            _ent.getServer().getCommands()
                                    .performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
                                            _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
                                            _ent.getDisplayName(), _ent.level.getServer(), _ent), "kill @e[tag=lightning]");
                        }
                    }
                });
            });
        }
    }

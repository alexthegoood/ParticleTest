package org.atg.particleTest;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import io.papermc.paper.command.brigadier.CommandSourceStack;
import io.papermc.paper.command.brigadier.Commands;
import io.papermc.paper.plugin.lifecycle.event.types.LifecycleEvents;
import org.bukkit.Location;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.UUID;
import java.util.logging.Logger;

public final class ParticleTest extends JavaPlugin {

    private final Logger log = getLogger();
    public HashMap<Location, UUID> particlesMap = new HashMap<>();

    @Override
    public void onEnable() {
        log.info("Plugin is enabled");
        this.getLifecycleManager().registerEventHandler(LifecycleEvents.COMMANDS, commands -> {
            commands.registrar().register(PluginCommands.command("test"));
        });
    }

    @Override
    public void onDisable() {
        log.info("Plugin is disabled");
    }
}

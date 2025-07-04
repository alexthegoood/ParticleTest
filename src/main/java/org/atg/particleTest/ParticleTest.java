package org.atg.particleTest;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class ParticleTest extends JavaPlugin {

    private final Logger log = getLogger();

    @Override
    public void onEnable() {
        log.info("Plugin is enabled");
    }

    @Override
    public void onDisable() {
        log.info("Plugin is disabled");
    }
}

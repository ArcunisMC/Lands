package com.arcunis.lands;

import io.papermc.paper.plugin.bootstrap.BootstrapContext;
import io.papermc.paper.plugin.bootstrap.PluginBootstrap;
import io.papermc.paper.plugin.bootstrap.PluginProviderContext;
import org.bukkit.plugin.java.JavaPlugin;

public class Bootstrapper implements PluginBootstrap {

    public static Lands plugin;

    @Override
    public void bootstrap(BootstrapContext bootstrapContext) {

    }

    @Override
    public JavaPlugin createPlugin(PluginProviderContext context) {
        plugin = new Lands();
        return plugin;
    }

}

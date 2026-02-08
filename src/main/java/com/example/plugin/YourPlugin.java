package com.example.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public class YourPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("YourPlugin has been enabled!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("YourPlugin has been disabled!");
    }
}
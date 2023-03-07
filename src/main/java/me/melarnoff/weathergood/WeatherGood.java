package me.melarnoff.weathergood;

import me.melarnoff.weathergood.commands.WeatherGoodCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class WeatherGood extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("weathergood").setExecutor(new WeatherGoodCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

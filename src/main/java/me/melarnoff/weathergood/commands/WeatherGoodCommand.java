package me.melarnoff.weathergood.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class WeatherGoodCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        Player player = (Player) sender;
        if (player.hasPermission("weatherset.good")) {
            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "time set 0");
            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "weather clear");
            player.sendMessage("ура погода норм");
        }

        return true;
    }
}

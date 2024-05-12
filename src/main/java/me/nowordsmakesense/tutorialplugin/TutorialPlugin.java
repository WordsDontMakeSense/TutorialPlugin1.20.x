package me.nowordsmakesense.tutorialplugin;

import me.nowordsmakesense.tutorialplugin.Commands.TutorialCommand;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class TutorialPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "TutorialPlugin Enabled!");
        getCommand("tutorial").setExecutor(new TutorialCommand());
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "TutorialPlugin Disabled!");
    }
}

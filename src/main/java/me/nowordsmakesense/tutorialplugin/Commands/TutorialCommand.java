package me.nowordsmakesense.tutorialplugin.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class TutorialCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        // Command: /tutorial
        sendInfoMessage(sender);
        return true;
    }

    private void sendInfoMessage(CommandSender sender) {
        sender.sendMessage("");
        sender.sendMessage(ChatColor.GOLD + "Tutorial Plugin v1.0.0");
        sender.sendMessage("");
        sender.sendMessage(ChatColor.GOLD + "Made by " + ChatColor.LIGHT_PURPLE + "WordsDontMakeSense");
        sender.sendMessage("");
    }
}

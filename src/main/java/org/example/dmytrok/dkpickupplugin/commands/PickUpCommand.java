package org.example.dmytrok.dkpickupplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.example.dmytrok.dkpickupplugin.utils.PickUpManager;

public class PickUpCommand implements CommandExecutor {
    private final PickUpManager pickUpManager;

    public PickUpCommand(PickUpManager pickUpManager) {
        this.pickUpManager = pickUpManager;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("§cYou must be a player");
            return false;
        }

        Player player = (Player) sender;

        if (args.length != 1) {
            player.sendMessage("§cUsage: /pickup <enable|disable>");
            return true;
        }

        String option = args[0].toLowerCase();
        if (option.equals("enable")) {
            pickUpManager.enableForPlayer(player);
            player.sendMessage("§aYou will now receive messages when picking up items");
        } else if (option.equals("disable")) {
            pickUpManager.disableForPlayer(player);
            player.sendMessage("§aYou will no longer receive messages when picking up items");
        } else {
            player.sendMessage(ChatColor.RED + "Usage: /pickup <enable|disable>");
        }

        return true;
    }
}

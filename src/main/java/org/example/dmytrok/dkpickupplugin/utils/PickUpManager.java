package org.example.dmytrok.dkpickupplugin.utils;

import org.bukkit.entity.Player;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class PickUpManager {
    private final Set<UUID> enabledPlayers = new HashSet<>();

    public void enableForPlayer(Player player) {
        enabledPlayers.add(player.getUniqueId());
    }

    public void disableForPlayer(Player player) {
        enabledPlayers.remove(player.getUniqueId());
    }

    public boolean isEnabledForPlayer(Player player) {
        return enabledPlayers.contains(player.getUniqueId());
    }
}
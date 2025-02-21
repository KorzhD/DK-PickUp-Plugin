package org.example.dmytrok.dkpickupplugin.events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPickupItemEvent;
import org.example.dmytrok.dkpickupplugin.utils.PickUpManager;

public class PickUpEvent implements Listener {
    private final PickUpManager pickUpManager;

    public PickUpEvent(PickUpManager pickUpManager) {
        this.pickUpManager = pickUpManager;
    }

    @EventHandler
    public void onPlayerPickUp(EntityPickupItemEvent event) {
        if (event.getEntity() instanceof Player) {
            Player player = (Player) event.getEntity();

            if (!pickUpManager.isEnabledForPlayer(player)) {
                return;
            }

            Material type = event.getItem().getItemStack().getType();
            int amount = event.getItem().getItemStack().getAmount();
            String color = "§7";

            if (type == Material.DRAGON_EGG || type == Material.NETHER_STAR) {
                color = "§5§l";
            } else if (type == Material.ELYTRA || type == Material.GOLDEN_APPLE) {
                color = "§6";
            }

            player.sendMessage("§8Picked up: " + color + type.name() + " x" + amount);
        }
    }
}
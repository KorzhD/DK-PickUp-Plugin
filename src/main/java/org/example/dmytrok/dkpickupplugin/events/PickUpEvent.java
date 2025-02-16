package org.example.dmytrok.dkpickupplugin.events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPickupItemEvent;

public class PickUpEvent implements Listener {
    @EventHandler
    public void onPLayerPickUp(EntityPickupItemEvent event) {
        if (event.getEntity() instanceof Player) {

            Player player = (Player) event.getEntity();

            if(event.getItem().getItemStack().getType().equals(Material.DRAGON_EGG)) {
                player.sendMessage("§8Picked up: " + "§5§l" + event.getItem().getItemStack().getType().name() + " x"
                        + event.getItem().getItemStack().getAmount());
                return;
            }
            if(event.getItem().getItemStack().getType().equals(Material.NETHER_STAR)) {
                player.sendMessage("§8Picked up: " + "§5§l" + event.getItem().getItemStack().getType().name() + " x"
                        + event.getItem().getItemStack().getAmount());
                return;
            }
            if(event.getItem().getItemStack().getType().equals(Material.ELYTRA)) {
                player.sendMessage("§8Picked up: " + "§6" + event.getItem().getItemStack().getType().name() + " x"
                        + event.getItem().getItemStack().getAmount());
                return;
            }
            if(event.getItem().getItemStack().getType().equals(Material.GOLDEN_APPLE)) {
                player.sendMessage("§8Picked up: " + "§6" + event.getItem().getItemStack().getType().name() + " x"
                        + event.getItem().getItemStack().getAmount());
                return;
            }
            player.sendMessage("§8Picked up: " + "§7" + event.getItem().getItemStack().getType().name() + " x"
                    + event.getItem().getItemStack().getAmount());
        }
    }
}

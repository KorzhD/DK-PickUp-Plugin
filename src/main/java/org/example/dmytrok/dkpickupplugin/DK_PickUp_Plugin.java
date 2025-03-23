package org.example.dmytrok.dkpickupplugin;

import org.bukkit.plugin.java.JavaPlugin;
import org.example.dmytrok.dkpickupplugin.commands.PickUpCommand;
import org.example.dmytrok.dkpickupplugin.events.PickUpEvent;
import org.example.dmytrok.dkpickupplugin.utils.PickUpManager;

public final class DK_PickUp_Plugin extends JavaPlugin {

    private final PickUpManager pickUpManager = new PickUpManager();
    @Override
    public void onEnable() {
        getLogger().info("\u001B[32m!---------------PickUp Plugin enabled---------------!\u001B[0m");

        getServer().getPluginManager().registerEvents(new PickUpEvent(pickUpManager), this);
        getServer().getPluginCommand("pickUp").setExecutor(new PickUpCommand(pickUpManager));


    }

    @Override
    public void onDisable() {
        getLogger().info("\u001B[32m!---------------PickUp Plugin enabled---------------!\u001B[0m");
    }
}

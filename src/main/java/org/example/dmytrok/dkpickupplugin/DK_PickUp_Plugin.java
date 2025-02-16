package org.example.dmytrok.dkpickupplugin;

import org.bukkit.plugin.java.JavaPlugin;
import org.example.dmytrok.dkpickupplugin.events.PickUpEvent;

public final class DK_PickUp_Plugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("PickUp plugin enabled");

        getServer().getPluginManager().registerEvents(new PickUpEvent(), this);

    }

    @Override
    public void onDisable() {
        getLogger().info("PickUp plugin disabled");
    }
}

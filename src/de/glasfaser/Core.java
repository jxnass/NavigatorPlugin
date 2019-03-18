package de.glasfaser;

import de.glasfaser.events.PlayerInteractItem;
import de.glasfaser.events.PlayerInventoryClick;
import de.glasfaser.wrapper.ChestInventory;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.Map;

public class Core extends JavaPlugin {

    /**
     * Moin wie versprochen mein Plugin.
     */

    public static Map<String, ChestInventory> chestInventories;

    @Override
    public void onEnable() {
        //this.getLogger().info("Lol.");
        doSetup();
        registerEvents();
    }

    private void doSetup() {
        chestInventories = new HashMap<>();
    }

    private void registerEvents() {
        this.getServer().getPluginManager().registerEvents(new PlayerInteractItem(), this);
        this.getServer().getPluginManager().registerEvents(new PlayerInventoryClick(), this);
    }

}

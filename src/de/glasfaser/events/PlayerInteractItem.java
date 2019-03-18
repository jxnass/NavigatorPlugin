package de.glasfaser.events;

import de.glasfaser.functionality.navigator.PlayerInventory;
import de.glasfaser.wrapper.ChestInventory;
import de.glasfaser.wrapper.InventoryEntry;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class PlayerInteractItem implements Listener {

    @EventHandler
    public void PlayerClick(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        if (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (event.getItem().getType() == Material.STICK) {
                ChestInventory chestInventory = new ChestInventory("§4Erze!");
                chestInventory.addInventoryEntry(new InventoryEntry(Material.DIAMOND, "§9Diamant", new Location(Bukkit.getWorld("world"), 0, 70, 0)));
                chestInventory.addInventoryEntry(new InventoryEntry(Material.GOLD_INGOT, "§6Gold", new Location(Bukkit.getWorld("world"), 0, 80, 0)));
                chestInventory.addInventoryEntry(new InventoryEntry(Material.IRON_INGOT, "§7Eisen", new Location(Bukkit.getWorld("world"), 0, 90, 0)));
                player.openInventory(new PlayerInventory(chestInventory).getInventory());
            }
        }
    }
}

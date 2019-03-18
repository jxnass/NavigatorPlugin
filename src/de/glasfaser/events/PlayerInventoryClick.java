package de.glasfaser.events;

import de.glasfaser.Core;
import de.glasfaser.wrapper.ChestInventory;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class PlayerInventoryClick implements Listener {

    @EventHandler
    public void PlayerNavigatorOpen(InventoryClickEvent event) {
        if (Core.chestInventories.containsKey(event.getInventory().getName())) {
            if (event.getWhoClicked() instanceof Player) {
                Player player = (Player) event.getWhoClicked();
                player.sendMessage("Sucess!");
                event.setCancelled(true);
                ChestInventory chestInventory = Core.chestInventories.get(event.getInventory().getName());
                String itemClicked = event.getInventory().getItem(event.getSlot()).getItemMeta().getDisplayName();
                player.teleport(chestInventory.getEntryByName(itemClicked).getLocTo());
            }
        }
    }

}

package de.glasfaser.functionality.navigator;

import de.glasfaser.wrapper.ChestInventory;
import de.glasfaser.wrapper.InventoryEntry;
import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class PlayerInventory {

    private ArrayList<InventoryEntry> inventoryEntries;
    private String name;

    public PlayerInventory(ChestInventory chest) {
        this.inventoryEntries = (ArrayList<InventoryEntry>) chest.getInventoryEntries();
        this.name = chest.getChestName();
    }

    public Inventory getInventory() {
        Inventory inventory = Bukkit.createInventory(null, 9, this.name);
        for (InventoryEntry entry : inventoryEntries) {
            ItemStack itemStack = new ItemStack(entry.getVisibleStack());
            ItemMeta meta = itemStack.getItemMeta();
            meta.setDisplayName(entry.getName());
            itemStack.setItemMeta(meta);
            inventory.addItem(itemStack);
        }
        return inventory;
    }





}

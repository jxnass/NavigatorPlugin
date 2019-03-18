package de.glasfaser.wrapper;

import de.glasfaser.Core;

import java.util.ArrayList;
import java.util.List;

public class ChestInventory {

    private List<InventoryEntry> inventoryEntries;
    private String chestName;

    public ChestInventory(String chestName) {
        this.chestName = chestName;
        inventoryEntries = new ArrayList<>();
        Core.chestInventories.put(this.getChestName(), this);
    }

    public InventoryEntry getEntryByName(String name) {
        for (InventoryEntry inventoryEntry : inventoryEntries) {
            if (inventoryEntry.getName().equalsIgnoreCase(name))
                return inventoryEntry;
        }
        return null;
    }

    public void addInventoryEntry(InventoryEntry inventoryEntry) {
        this.inventoryEntries.add(inventoryEntry);
    }

    public List<InventoryEntry> getInventoryEntries() {
        return inventoryEntries;
    }

    public String getChestName() {
        return chestName;
    }
}

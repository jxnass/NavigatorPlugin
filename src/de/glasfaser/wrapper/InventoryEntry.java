package de.glasfaser.wrapper;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class InventoryEntry {

    private Material visibleStack;
    private String name;
    private Location locTo;

    public InventoryEntry(Material visibleStack, String name, Location locTo) {
        this.visibleStack = visibleStack;
        this.name = name;
        this.locTo = locTo;
    }


    public Material getVisibleStack() {
        return visibleStack;
    }

    public String getName() {
        return name;
    }

    public Location getLocTo() {
        return locTo;
    }
}

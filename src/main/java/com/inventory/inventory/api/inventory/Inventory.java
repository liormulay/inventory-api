package com.inventory.inventory.api.inventory;

import com.inventory.inventory.api.item.Item;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Inventory {

    @Id
    private String inventoryCode;
    private List<Item> items = new ArrayList<>();

    public Inventory() {
    }

    public Inventory(String inventoryCode) {
        this.inventoryCode = inventoryCode;
    }

    public String getInventoryCode() {
        return inventoryCode;
    }

    public void setInventoryCode(String inventoryCode) {
        this.inventoryCode = inventoryCode;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}

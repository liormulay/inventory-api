package com.inventory.inventory.api.item;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {
    @Id
    private String itemNo;
    private String itemDetails;
    private int quantity;

    public Item() {
    }

    public Item(String itemNo, String itemDetails, int quantity) {
        this.itemNo = itemNo;
        this.itemDetails = itemDetails;
        this.quantity = quantity;
    }

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    public String getItemDetails() {
        return itemDetails;
    }

    public void setItemDetails(String itemDetails) {
        this.itemDetails = itemDetails;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

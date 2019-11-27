package com.inventory.inventory.api.item;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {
    @Id
    private String itemNo;
    private String itemDetails;

    public Item() {
    }

    public Item(String itemNo, String itemDetails) {
        this.itemNo = itemNo;
        this.itemDetails = itemDetails;
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

}

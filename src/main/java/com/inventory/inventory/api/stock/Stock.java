package com.inventory.inventory.api.stock;

import com.inventory.inventory.api.item.Item;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Stock {
    private List<Item> items = new ArrayList<>();
}

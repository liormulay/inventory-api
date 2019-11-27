package com.inventory.inventory.api.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public List<Item> getAllItems() {
        List<Item> items = new ArrayList<>();
        itemRepository.findAll().forEach(items::add);
        return items;
    }

    public void addItem(Item item){
        itemRepository.save(item);
    }

    public Item getItem(String itemNo) throws Throwable {
        return itemRepository.findById(itemNo).orElseThrow(() -> new Throwable("No such item"));
    }
}

package com.inventory.inventory.api.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("/items")
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/items")
    public void addItem(@RequestBody Item item) {
        itemService.addItem(item);
    }

    @RequestMapping("/items/{id}")
    public String getItemDetails(@PathVariable("id") String itemNo) throws Throwable {
        return itemService.getItem(itemNo).getItemDetails();
    }

    @RequestMapping("/items/{id}/withdrawal/{quantity}")
    public void withdrawalQuantity(@PathVariable("id") String itemNo, @PathVariable int quantity) throws Throwable {
        Item item = itemService.getItem(itemNo);
        int newQuantity = item.getQuantity() - quantity;
        if (newQuantity < 0){
            throw new Exception("There is no enough items to withdrawal");
        }
        item.setQuantity(newQuantity);
        itemService.addItem(item);
    }
}

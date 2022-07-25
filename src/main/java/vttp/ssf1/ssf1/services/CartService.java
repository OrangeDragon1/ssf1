package vttp.ssf1.ssf1.services;

import java.util.ArrayList;
import java.util.List;

import vttp.ssf1.ssf1.models.Item;

public class CartService {
    List<Item> items;

    public CartService() {
        this.items = new ArrayList<>();
        addDefaultItems();
    }

    public List<Item> getItems() {
        return this.items;
    }

    private void addDefaultItems() {
        this.items.add(new Item("Channel Bag", 2));
        this.items.add(new Item("Prada Bag", 3));
        this.items.add(new Item("LV Bag", 2));
        this.items.add(new Item("LV Wallet", 4));
        this.items.add(new Item("Goyard Wallet", 3));
    }
}

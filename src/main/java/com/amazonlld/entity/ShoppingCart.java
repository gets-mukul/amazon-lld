package com.amazonlld.entity;

import java.util.List;

public class ShoppingCart {
    List<Item> items;

    public boolean addItem(Item item) {
        return true;
    }

    public boolean removeItem(Item item) {
        return true;
    }

    public boolean updateItemQuantity(Item item, int quantity) {
        return false;
    }

    public List<Item> getItems() {
        return null;
    }

    public boolean checkout() {
        return false;
    }


}

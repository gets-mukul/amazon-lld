package com.amazonlld.entity;

import java.security.PublicKey;

public class Customer {

    private ShoppingCart shoppingCart;
    private Order order;

    public ShoppingCart addItemToCart(Item item){
        return null;
    }

    public boolean removeItemFromCart(Item item){
        return true;
    }

    public ShoppingCart getShoppingCart(){
        return null;
    }
}

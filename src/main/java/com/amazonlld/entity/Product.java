package com.amazonlld.entity;

public class Product {
    private String productId;
    private String name;
    private String description;
    private double price;
    private ProductCategory category;
    private int availableItemCount;
    private Account seller;

    public int getAvailableCount() {
        return 0;
    }

    public boolean updatePrice(double newPrice) {
        return true;
    }
}

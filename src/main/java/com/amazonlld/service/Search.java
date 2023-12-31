package com.amazonlld.service;

import com.amazonlld.entity.Product;

import java.util.List;

public interface Search {
    public List<Product> searchProductsByName(String name);
    public List<Product> searchProductsByCategory(String category);
}

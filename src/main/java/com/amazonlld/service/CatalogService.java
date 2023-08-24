package com.amazonlld.service;

import com.amazonlld.entity.Product;

import java.util.HashMap;
import java.util.List;

public class CatalogService implements Search {

    HashMap<String, List<Product>> productNames;
    HashMap<String, List<Product>> productCategories;

    @Override
    public List<Product> searchProductsByName(String name) {
        return productNames.get(name);
    }

    @Override
    public List<Product> searchProductsByCategory(String category) {
        return productCategories.get(category);
    }
}

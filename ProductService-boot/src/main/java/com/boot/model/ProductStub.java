package com.boot.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProductStub {
    private static HashMap<Long, Product> products = new HashMap<Long, Product>();

    static {
        Product product1 = new Product(1L, "RDMI", "Redmi Note", "Redmi smart phones seris");
        Product product2 = new Product(2L, "NKA", "Nokia Smart Phones", "Nokia Smart Phone seris");
        Product product3 = new Product(3L, "SMZ", "Samsung edge", "Samsung smart phones seris");
        products.put(1L, product1);
        products.put(2L, product2);
        products.put(3L, product3);
    }

    public static List<Product> list() {
        return new ArrayList<Product>(products.values());
    }
}

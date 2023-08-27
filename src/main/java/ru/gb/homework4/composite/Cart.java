package ru.gb.homework4.composite;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products = new ArrayList<>();


    public void addProduct(Product product) {
        products.add(product);
    }

    public float getTotalPrice() {
        float totalPrice = 0;
        for (Product p : products) {
            totalPrice += p.getPrice();
        }
        return totalPrice;/////
    }
}

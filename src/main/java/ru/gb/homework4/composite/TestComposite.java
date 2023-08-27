package ru.gb.homework4.composite;

public class TestComposite {
    public static void main(String[] args) {
        Product tv = new Electronics("Samsung", 20000.00);
        Product jacket = new Clothes("Colombia", 7000.00);

        Cart cart = new Cart();

        cart.addProduct(tv);
        cart.addProduct(jacket);

        System.out.println("Общая стоимость корзины: " + cart.getTotalPrice());
    }
}

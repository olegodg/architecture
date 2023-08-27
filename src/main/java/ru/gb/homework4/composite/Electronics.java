package ru.gb.homework4.composite;

public class Electronics implements Product {
    private String title;
    private double price;

    public Electronics(String title, double price) {
        this.title = title;
        this.price = price;
    }


    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(float price) {
        this.price = price;
    }
}

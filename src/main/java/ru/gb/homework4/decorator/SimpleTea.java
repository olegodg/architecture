package ru.gb.homework4.decorator;

public class SimpleTea implements Tea {


    @Override
    public double getPrice() {
        return 10.0;
    }

    @Override
    public String getComposition() {
        return "Simple Tea";
    }
}

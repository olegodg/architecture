package ru.gb.homework4.decorator;

public class RaspberryTea implements Tea {

    private Tea tea;

    public RaspberryTea(Tea tea) {
        this.tea = tea;
    }

    @Override
    public double getPrice() {
        return tea.getPrice() + 5.0;
    }

    @Override
    public String getComposition() {
        return this.tea.getComposition() + ", raspberry";
    }
}

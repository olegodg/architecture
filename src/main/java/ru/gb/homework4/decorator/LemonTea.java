package ru.gb.homework4.decorator;

public class LemonTea implements Tea {

    private Tea tea;

    public LemonTea(Tea tea) {
        this.tea = tea;
    }

    @Override
    public double getPrice() {
        return tea.getPrice() + 7.0;
    }

    @Override
    public String getComposition() {
        return this.tea.getComposition() + ", lemon";
    }
}

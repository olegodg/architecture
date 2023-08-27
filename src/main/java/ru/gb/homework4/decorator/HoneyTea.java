package ru.gb.homework4.decorator;

public class HoneyTea implements Tea {

    private Tea tea;

    public HoneyTea(Tea tea) {
        this.tea = tea;
    }

    @Override
    public double getPrice() {
        return tea.getPrice() + 6.0;
    }

    @Override
    public String getComposition() {
        return this.tea.getComposition() + ", honey";
    }
}

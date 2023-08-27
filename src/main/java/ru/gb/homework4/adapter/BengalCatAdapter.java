package ru.gb.homework4.adapter;

public class BengalCatAdapter implements Dog {

    private BengalCat bengalCat;

    public BengalCatAdapter(BengalCat bengalCat) {
        this.bengalCat = bengalCat;
    }

    @Override
    public void bark() {
        this.bengalCat.meow();
    }
}

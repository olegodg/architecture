package ru.gb.homework4.adapter;

public class TestAdapter {
    public static void main(String[] args) {
        CorgiDog corgiDog = new CorgiDog();
        LabradorDog labradorDog = new LabradorDog();
        BengalCat bengalCat = new BengalCat();

        AnimalTrainer trainer = new AnimalTrainer();

        trainer.train(corgiDog);
        trainer.train(labradorDog);

        trainer.train(new BengalCatAdapter(bengalCat));
    }
}

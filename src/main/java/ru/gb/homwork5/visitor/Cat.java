package ru.gb.homwork5.visitor;

public class Cat implements Animal {
    public void meow(){
        System.out.println("Мяу!");
    }

    @Override
    public void accept(AnimalOperation operation) {
        operation.visitCat(this);
    }
}

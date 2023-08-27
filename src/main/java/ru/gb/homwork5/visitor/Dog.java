package ru.gb.homwork5.visitor;

public class Dog implements Animal {

    public void bark(){
        System.out.println("ГАВ!");
    }
    @Override
    public void accept(AnimalOperation operation) {
        operation.visitDog(this);

    }
}

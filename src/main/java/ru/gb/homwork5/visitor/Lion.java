package ru.gb.homwork5.visitor;

public class Lion implements Animal {

    public void roar(){
        System.out.println("РРРР АРРР!!!");
    }
    @Override
    public void accept(AnimalOperation operation) {
        operation.visitLion(this);

    }
}

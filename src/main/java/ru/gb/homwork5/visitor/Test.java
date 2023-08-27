package ru.gb.homwork5.visitor;

public class Test {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal dog = new Dog();
        Animal cat = new Cat();

        Speak speak = new Speak();
        Jump jump = new Jump();

        lion.accept(speak);
        lion.accept(jump);
        cat.accept(speak);
        cat.accept(jump);
        dog.accept(speak);
        dog.accept(jump);


    }

}

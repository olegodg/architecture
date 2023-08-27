package ru.gb.homework3.factory_method;

public class Duck extends Bird {

    @Override
    public Action action() {
        return new Action() {

            @Override
            public void toFly() {
                System.out.println("The duck is flying");
            }

            @Override
            public void toSwim() {
                System.out.println("The duck is swimming");
            }
        };
    }


    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.action().toFly();
        duck.action().toSwim();
    }
}

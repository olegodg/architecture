package ru.gb.homework4.decorator;

public class TestDecorator {
    public static void main(String[] args) {
        Tea simpleTea = new SimpleTea();
        System.out.printf("Состав чая: %s; Цена: %s%n", simpleTea.getComposition(), simpleTea.getPrice());

        Tea RTea = new RaspberryTea(simpleTea);
        System.out.printf("Состав чая: %s; Цена: %s%n", RTea.getComposition(), RTea.getPrice());

        Tea HTea = new HoneyTea(RTea);
        System.out.printf("Состав чая: %s; Цена: %s%n", HTea.getComposition(), HTea.getPrice());

        Tea LTea = new LemonTea(HTea);
        System.out.printf("Состав чая: %s; Цена: %s%n", LTea.getComposition(), LTea.getPrice());


    }
}

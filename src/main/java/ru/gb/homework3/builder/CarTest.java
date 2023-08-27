package ru.gb.homework3.builder;

import java.time.LocalDate;

public class CarTest {
    public static void main(String[] args) {
        Car car = Car.createBuilder()
                .withBrand("Honda")
                .withModel("Accord")
                .withColor("Gray")
                .withDate(LocalDate.of(2010, 6, 7))
                .build();

        System.out.println(car.getBrand());
        System.out.println(car.getDate());

    }
}

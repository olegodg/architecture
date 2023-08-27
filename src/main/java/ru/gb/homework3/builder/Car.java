package ru.gb.homework3.builder;

import java.time.LocalDate;

public class Car {

    private String brand;

    private String model;

    private LocalDate date;

    private String color;


    private Car() {
    }

    public Car(String brand, String model, LocalDate date, String color, String profession) {
        this.brand = brand;
        this.model = model;
        this.date = date;
        this.color = color;
    }

    public Car(String brand, String model, LocalDate date, String color) {
        this.brand = brand;
        this.model = model;
        this.date = date;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getColor() {
        return color;
    }


    public static Builder createBuilder() {
        return new Builder();
    }

    public static class Builder {

        private final Car car;

        public Builder() {
            this.car = new Car();
        }

        public Builder withBrand(String brand) {
            this.car.brand = brand;
            return this;
        }

        public Builder withModel(String model) {
            this.car.model = model;
            return this;
        }

        public Builder withDate(LocalDate date) {
            this.car.date = date;
            return this;
        }

        public Builder withColor(String color) {
            this.car.color = color;
            return this;
        }

        public Car build() {
            return car;
        }

    }

}

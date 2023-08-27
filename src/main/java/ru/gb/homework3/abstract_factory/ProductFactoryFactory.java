package ru.gb.homework3.abstract_factory;

public class ProductFactoryFactory {

    public static ProductFactory create(String type) {
        switch (type) {
            case "Samsung":
                return new SamsungFactory();
            case "Mi":
                return new MiFactory();
            default:
                throw new IllegalArgumentException();

        }

    }
    public static void main(String[] args) {
        ProductFactory miFactory = ProductFactoryFactory.create("Mi");
        String phone = miFactory.creatPhone();
        System.out.println(phone);
    }
}

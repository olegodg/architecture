package ru.gb.homework3.abstract_factory;

public class SamsungFactory implements ProductFactory {


    public String creatPhone() {
        return "Phone Samsung S20";
    }

    public String creatTV() {
        return "TV Samsung UE55TU8500U";
    }

    public String creatNotebook() {
        return "Notebook Samsung Galaxy Book Flex";
    }
}

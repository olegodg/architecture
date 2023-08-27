package ru.gb.homework3.abstract_factory;

public class MiFactory implements ProductFactory {
    public String creatPhone() {
        return "Phone Xiaomi Mi 11 Lite 4G";
    }
    public String creatTV() {
        return "TV Xiaomi Mi TV 4S 65 T2S 65";
    }

    public String creatNotebook() {
        return "Notebook Xiaomi RedmiBook Pro 14";
    }
}

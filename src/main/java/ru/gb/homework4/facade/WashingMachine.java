package ru.gb.homework4.facade;

public class WashingMachine {

    public String setWashingMode() {
        return "Выбран режим стирки";
    }

    public String fillDrum() {
        return "Стиральный барабан наполнен водой";
    }

    public String basicWashing() {
        return "Произведена основная стрика";
    }

    public String delicateWashing() {
        return "Произведена деликатная стирка стрика";
    }

    public String rinsing() {
        return "Произведено полоскание";
    }

    public String waterDrained() {
        return "Вода слита";
    }

    public String wringing() {
        return "Произведен отжим";
    }

    public String done() {
        return "Готово!";
    }


}

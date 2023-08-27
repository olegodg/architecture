package ru.gb.homework4.bridge;

public class НatchbackCar implements Car {

    private Color color;

    @Override
    public void paint(Color color) {
        this.color = color;
    }

    @Override
    public void present() {
        System.out.println("Данный хэтчбэк представлен в " + color.getColor());
    }
}

package ru.gb.homework4.bridge;

public class TestBridge {

    public static void main(String[] args) {
        SedanCar sedanCar = new SedanCar();
        НatchbackCar нatchbackCar = new НatchbackCar();

        sedanCar.paint(new WhiteColor());
        нatchbackCar.paint(new BalckColor());

        sedanCar.present();
        нatchbackCar.present();
    }

}

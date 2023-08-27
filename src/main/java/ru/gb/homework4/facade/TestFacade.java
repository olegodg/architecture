package ru.gb.homework4.facade;

public class TestFacade {
    public static void main(String[] args) {
        WashingMachineFacade washingMachine = new WashingMachineFacade(new WashingMachine());


        System.out.println("Включить основной режим стирки: \n" + washingMachine.startBasicWash() + " \n");

        System.out.println("Включить деликатный режим стирки: \n" + washingMachine.startDelicateWash() + " \n");

        System.out.println("Включить отжим: \n" + washingMachine.startRinseMode() + " \n");

    }


}

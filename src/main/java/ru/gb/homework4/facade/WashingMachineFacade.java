package ru.gb.homework4.facade;

public class WashingMachineFacade {

    WashingMachine washingMachine;


    public WashingMachineFacade(WashingMachine washingMachine) {
        this.washingMachine = washingMachine;
    }

    public String startBasicWash() {
        return this.washingMachine.setWashingMode() + "\n" +
                this.washingMachine.fillDrum() + "\n" +
                this.washingMachine.basicWashing() + "\n" +
                this.washingMachine.rinsing() + "\n" +
                this.washingMachine.waterDrained() + "\n" +
                this.washingMachine.wringing() + "\n" +
                this.washingMachine.done();
    }

    public String startDelicateWash() {
        return this.washingMachine.setWashingMode() + "\n" +
                this.washingMachine.fillDrum() + "\n" +
                this.washingMachine.delicateWashing() + "\n" +
                this.washingMachine.rinsing() + "\n" +
                this.washingMachine.waterDrained() + "\n" +
                this.washingMachine.wringing() + "\n" +
                this.washingMachine.done();
    }


    public String startRinseMode() {
        return this.washingMachine.setWashingMode() + "\n" +
                this.washingMachine.fillDrum() + "\n" +
                this.washingMachine.rinsing() + "\n" +
                this.washingMachine.waterDrained() + "\n" +
                this.washingMachine.wringing() + "\n" +
                this.washingMachine.done();
    }

}

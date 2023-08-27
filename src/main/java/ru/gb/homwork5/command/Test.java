package ru.gb.homwork5.command;

public class Test {

    public static void main(String[] args) {


        Bulb bulb = new Bulb();

        Command on = new TurnOn(bulb);
        Command off = new TurnOff(bulb);

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.submit(on);
        remoteControl.submit(off);
    }
}

package ru.gb.homwork5.command;

public class TurnOn implements Command {

    private Bulb bulb;

    public TurnOn(Bulb bulb) {
        this.bulb = bulb;
    }

    @Override
    public void execute() {
        this.bulb.turnOn();
    }

    @Override
    public void redo() {
        this.bulb.turnOff();
    }

    @Override
    public void undo() {
        this.execute();
    }
}

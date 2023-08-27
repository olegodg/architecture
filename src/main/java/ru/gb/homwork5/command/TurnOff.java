package ru.gb.homwork5.command;

public class TurnOff implements Command {

    private Bulb bulb;

    public TurnOff(Bulb bulb) {
        this.bulb = bulb;
    }

    @Override
    public void execute() {
        this.bulb.turnOff();
    }

    @Override
    public void redo() {
        this.bulb.turnOn();
    }

    @Override
    public void undo() {
        this.execute();
    }
}

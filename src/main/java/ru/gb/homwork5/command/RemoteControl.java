package ru.gb.homwork5.command;

public class RemoteControl {

    public void submit(Command command){
        command.execute();
    }
}

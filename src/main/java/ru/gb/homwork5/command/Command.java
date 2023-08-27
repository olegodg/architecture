package ru.gb.homwork5.command;

public interface Command {
    void execute();
    void redo();
    void undo();
}

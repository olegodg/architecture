package ru.gb.homwork5.state;

public class Test {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor(new DefaultText());
        textEditor.type("слова СЛОВА");

        textEditor.setState(new UpperCase());
        textEditor.type("слова СЛОВА");

        textEditor.setState(new LowerCase());
        textEditor.type("слова СЛОВА");

    }
}

package ru.gb.homwork5.memento;

public class Test {
    public static void main(String[] args) {
        Editor editor = new Editor();

        editor.type("Рыбка");
        editor.type("Акула");

        EditorMemento saved = editor.save();

        editor.type("Черепаха");

        System.out.println(editor.getContent());

        editor.restore(saved);

        System.out.println(editor.getContent());




    }

}

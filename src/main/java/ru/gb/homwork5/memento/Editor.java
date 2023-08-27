package ru.gb.homwork5.memento;

public class Editor {

    private String content;

    public Editor() {
        content = "";
    }

    public void type(String words) {
        content += " " + words;
    }

    public String getContent() {
        return content;
    }

    public EditorMemento save() {
        return new EditorMemento(content);
    }

    public void restore(EditorMemento memento) {
        content = memento.getContent();
    }


}

package ru.gb.homwork5.state;

public class UpperCase implements WritingState{
    @Override
    public void write(String words) {
        System.out.println(words.toUpperCase());

    }
}

package ru.gb.homwork5.mediator;

public class Test {
    public static void main(String[] args) {
        ChatRoom mediator = new ChatRoom();

        User bob =new User("Bob",mediator);
        User john =new User("John",mediator);

        bob.sendMsg("Привет! Как дела?");
        john.sendMsg("Привет! Хорошо!");

    }
}

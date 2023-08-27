package ru.gb.homwork5.mediator;

public class User {

    private String name;
    private ChatRoomMediator chatRoom;

    public User(String name, ChatRoomMediator chatRoom) {
        this.name = name;
        this.chatRoom = chatRoom;
    }

    public String getName() {
        return name;
    }

    public void sendMsg(String msg){
        this.chatRoom.showMessage(this, msg);
    }
}

package ru.gb.homwork5.mediator;

import java.time.LocalDateTime;



public class ChatRoom implements ChatRoomMediator{
    @Override
    public void showMessage(User user, String msg) {
        LocalDateTime time = LocalDateTime.now();
        String sender = user.getName();
        System.out.printf("[%s] %s: %s \n",time,sender,msg);
    }
}

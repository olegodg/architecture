package ru.gb.homework4.proxy;

public class SocialNetworkAccount implements Account {


    @Override
    public void logIn(String password) {
        System.out.println("Выполнен вход в аккаунт соц сети");
    }


    @Override
    public void logOut() {
        System.out.println("Выполнен выход из аккаунта соц сети");
    }
}

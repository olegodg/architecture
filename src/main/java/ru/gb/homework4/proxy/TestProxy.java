package ru.gb.homework4.proxy;

public class TestProxy {
    public static void main(String[] args) {
        PasswordProtectedAccount account = new PasswordProtectedAccount(new SocialNetworkAccount());
        account.logIn("badPass");
        account.logIn("qwerty");
        account.logOut();

    }


}

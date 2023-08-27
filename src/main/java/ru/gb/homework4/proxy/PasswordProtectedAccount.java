package ru.gb.homework4.proxy;

public class PasswordProtectedAccount implements Account {

    Account account;

    public PasswordProtectedAccount(Account account) {
        this.account = account;
    }


    @Override
    public void logIn(String password) {
        if (authentication(password)) {
            this.account.logIn(password);
        } else System.out.println("Неверный пароль");
    }


    @Override
    public void logOut() {
        this.account.logOut();

    }


    private boolean authentication(String password) {
        return "qwerty".equals(password);
    }
}


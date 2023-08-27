package ru.gb.homwork5.chain_of_responsibility;

public class Bank extends Account {
    private double balance;

    public Bank(double balance) {
        super(balance);
        this.balance = balance;
    }
}

package ru.gb.homwork5.chain_of_responsibility;

public class Bitcoin extends Account {
    private double balance;

    public Bitcoin(double balance) {
        super(balance);
        this.balance = balance;
    }
}

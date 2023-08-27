package ru.gb.homwork5.chain_of_responsibility;

public class PayPal extends Account {
    private double balance;

    public PayPal(double balance) {
        super(balance);
        this.balance = balance;
    }
}

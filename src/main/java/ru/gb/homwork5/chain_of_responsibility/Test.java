package ru.gb.homwork5.chain_of_responsibility;

public class Test {

    public static void main(String[] args) throws Exception {

        Account bank = new Bank(100);
        Account paypal = new PayPal(200);
        Account bitcoin = new Bitcoin(300);

        bank.setNext(paypal);
        paypal.setNext(bitcoin);

        bank.pay(259);
    }
}

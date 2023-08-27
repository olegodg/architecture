package ru.gb.homwork5.chain_of_responsibility;

public abstract class Account {

    private Account successor;
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }


    public void setNext(Account account){
        this.successor=account;
    }

    public void pay(double amountToPay) throws Exception {

        if (this.canPay(amountToPay)){
            double result = this.balance - amountToPay;
            System.out.printf("Успешная оплата: %s. Осталось на счету %s \n", this.getClass().getSimpleName(),result);
        }else if (this.successor!=null){
            Thread.sleep(1000);
            System.out.printf("Не удалось оплатить: %s. Пробуем оплатить %s... \n", this.getClass().getSimpleName(),successor.getClass().getSimpleName());
            this.successor.pay(amountToPay);
        }else {
            System.out.printf("Не удалось оплатить: %s.\n", this.getClass().getSimpleName());
            throw new Exception("НЕ хватает ДС ни на одном способе оплаты.");
        }



    }


    public boolean canPay (double amount){
        return this.balance >= amount;
    }

}

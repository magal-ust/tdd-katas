package org.katas.onbording;

public class Account {
    private AccountManager manager;
    private int balance;

    public Account(AccountManager manager) {
        this.manager = manager;
    }

    public void deposit(int amount) {
        this.balance += amount;
        manager.register(amount, balance);
    }

    public void withdraw(int amount) {
        this.balance -= amount;
        manager.register(-amount, balance);
    }

    public void printStatement() {
        System.out.println("Date | Amount | Balance");
        manager.getTransactions().forEach(t ->
                System.out.println(t.getDate() + " | " + t.getAmount() + " | " + t.getBalance())
        );
    }
}

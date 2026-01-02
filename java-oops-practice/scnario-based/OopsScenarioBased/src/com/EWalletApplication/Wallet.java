package com.EWalletApplication;

import java.util.ArrayList;
import java.util.List;

abstract class Wallet implements Transferrable {
    private double balance;
    protected List<Transaction> transactions = new ArrayList<>();

    public Wallet() {
        this.balance = 0;
    }

    public Wallet(boolean referral) {
        this.balance = referral ? 100 : 0;
    }

    public double getBalance() {
        return balance;
    }

    protected void credit(double amount) {
        balance += amount;
        transactions.add(new Transaction("Credit", amount));
    }

    protected boolean debit(double amount) {
        if (balance >= amount) {
            balance -= amount;
            transactions.add(new Transaction("Debit", amount));
            return true;
        }
        return false;
    }

    public void loadMoney(double amount) {
        credit(amount);
    }

    public void showTransactions() {
        transactions.forEach(System.out::println);
    }
}


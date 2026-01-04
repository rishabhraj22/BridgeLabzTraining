package com.MyBank;

abstract class Account implements ITransaction {
    protected String accountNumber;
    private double balance;

    public Account(String accountNumber, double openingBalance) {
        this.accountNumber = accountNumber;
        this.balance = openingBalance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("❌ Insufficient Balance");
        }
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    protected double getBalance() {
        return balance;
    }

    public abstract double calculateInterest();
}


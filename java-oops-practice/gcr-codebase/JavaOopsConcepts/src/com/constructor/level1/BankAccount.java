package com.constructor.level1;

public class BankAccount {

    // Public variable
    public long accountNumber;

    // Protected variable
    protected String accountHolder;

    // Private variable
    private double balance;

    // Parameterized constructor
    public BankAccount(long accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public method to get balance
    public double getBalance() {
        return balance;
    }

    // Public method to update balance
    public void setBalance(double balance) {
        this.balance = balance;
    }
}


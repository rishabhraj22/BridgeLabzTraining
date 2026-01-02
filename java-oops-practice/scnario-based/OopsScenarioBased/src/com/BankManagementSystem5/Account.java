package com.BankManagementSystem5;

public abstract class Account {

    protected String accountNumber;
    protected double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // ✅ Helper Method: Validate amount
    protected boolean validateAmount(double amount) {
        return amount > 0;
    }

    // ✅ Helper Method: Check sufficient balance
    protected boolean hasSufficientBalance(double amount) {
        return balance >= amount;
    }

    public void deposit(double amount) {
        if (!validateAmount(amount)) {
            System.out.println("Invalid deposit amount");
            return;
        }
        balance += amount;
    }

    public abstract boolean withdraw(double amount);

    public double getBalance() {
        return balance;
    }
}

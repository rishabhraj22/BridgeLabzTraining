package com.BankManagementSystem5;

public class CurrentAccount extends Account {

    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    // ✅ Helper Method: Check overdraft
    private boolean withinOverdraftLimit(double amount) {
        return (balance + overdraftLimit) >= amount;
    }

    @Override
    public boolean withdraw(double amount) {
        if (!validateAmount(amount)) {
            System.out.println("Invalid withdrawal amount");
            return false;
        }

        if (!withinOverdraftLimit(amount)) {
            System.out.println("Overdraft limit exceeded");
            return false;
        }

        balance -= amount;
        return true;
    }
}


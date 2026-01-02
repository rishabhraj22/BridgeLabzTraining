package com.BankManagementSystem5;

public class SavingsAccount extends Account {

    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // ✅ Helper Method: Calculate interest
    private double calculateInterest() {
        return balance * interestRate / 100;
    }

    public void addInterest() {
        balance += calculateInterest();
    }

    @Override
    public boolean withdraw(double amount) {
        if (!validateAmount(amount)) {
            System.out.println("Invalid withdrawal amount");
            return false;
        }

        if (!hasSufficientBalance(amount)) {
            System.out.println("Insufficient balance");
            return false;
        }

        balance -= amount;
        return true;
    }
}


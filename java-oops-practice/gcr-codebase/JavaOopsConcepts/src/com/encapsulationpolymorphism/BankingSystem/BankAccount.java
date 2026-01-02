package com.encapsulationpolymorphism.BankingSystem;

public abstract class BankAccount {

    private String accountNumber;
    private String holderName;
    protected double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Encapsulation: controlled access
    public String getAccountNumber() {
        return "XXXXXX" + accountNumber.substring(accountNumber.length() - 4);
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    // Concrete method
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit must be positive");
        }
        balance += amount;
    }

    // Concrete method
    public void withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            throw new IllegalArgumentException("Invalid withdrawal amount");
        }
        balance -= amount;
    }

    // Abstract method
    public abstract double calculateInterest();

    // Common display method
    public void displayAccountDetails() {
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
}


package com.collections.bankingsystem;
public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public double getBalance() { return balance; }

    public void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public String toString() {
        return accountNumber + " : ₹" + balance;
    }
}

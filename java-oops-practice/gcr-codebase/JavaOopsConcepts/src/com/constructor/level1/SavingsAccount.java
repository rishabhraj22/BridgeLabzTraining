package com.constructor.level1;

public class SavingsAccount extends BankAccount {

    // Parameterized constructor
    public SavingsAccount(long accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    // Method to display savings account details
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);  // public
        System.out.println("Account Holder: " + accountHolder);  // protected
        System.out.println("Balance: " + getBalance());          // private via method
    }
}


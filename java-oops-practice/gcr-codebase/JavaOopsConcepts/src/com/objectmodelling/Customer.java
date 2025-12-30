package com.objectmodelling;

public class Customer {

    // Declaring customer name
    String customerName;

    // Associated bank reference
    Bank bank;

    // Account balance
    double balance;

    // Parameterized constructor
    public Customer(String customerName) {
        this.customerName = customerName;
    }

    // Method to set associated bank
    public void setBank(Bank bank) {
        this.bank = bank;
    }

    // Method to set account balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to view account balance
    public void viewBalance() {

        // Checking if customer has a bank account
        if (bank != null) {
            System.out.println("Customer: " + customerName);
            System.out.println("Bank: " + bank.bankName);
            System.out.println("Balance: ₹" + balance);
        } else {
            System.out.println("No bank account found.");
        }
    }
}


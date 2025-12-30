package com.objectmodelling;

import java.util.ArrayList;

public class Bank {

    // Declaring bank name
    String bankName;

    // List to store customers associated with the bank
    ArrayList<Customer> customers;

    // Parameterized constructor
    public Bank(String bankName) {
        this.bankName = bankName;
        customers = new ArrayList<>();
    }

    // Method to open account for a customer
    public void openAccount(Customer customer, double initialBalance) {

        // Setting customer's bank and balance
        customer.setBank(this);
        customer.setBalance(initialBalance);

        // Adding customer to bank's customer list
        customers.add(customer);

        // Displaying confirmation message
        System.out.println("Account opened for " + customer.customerName +
                           " in " + bankName);
    }
}


package com.BankManagementSystem5;

public class BankApp {

    public static void main(String[] args) {

        // Create Savings Account
        Account savings = new SavingsAccount(
                "SA101",   // account number
                5000,      // balance
                4.5        // interest rate
        );

        // Create Current Account
        Account current = new CurrentAccount(
                "CA201",   // account number
                3000,      // balance
                2000       // overdraft limit
        );

        // Create Customers
        Customer c1 = new Customer("Rohit", "C001", savings);
        Customer c2 = new Customer("Anita", "C002", current);

        // Perform operations
        c1.performWithdraw(2000);
        ((SavingsAccount) savings).addInterest();
        c1.showBalance();

        System.out.println("-------------------");

        c2.performWithdraw(4500);
        c2.showBalance();
    }
}


package com.objectmodelling;

public class BankCustomerDriver {

    public static void main(String[] args) {

        // Creating Bank object
        Bank sbi = new Bank("State Bank of India");

        // Creating Customer objects
        Customer c1 = new Customer("Ravi");
        Customer c2 = new Customer("Amit");

        // Opening accounts for customers
        sbi.openAccount(c1, 25000);
        sbi.openAccount(c2, 40000);

        System.out.println();

        // Customers viewing their account balances
        c1.viewBalance();
        System.out.println();
        c2.viewBalance();
    }
}


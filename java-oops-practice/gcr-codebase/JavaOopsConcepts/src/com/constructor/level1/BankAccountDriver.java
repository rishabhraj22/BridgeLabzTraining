package com.constructor.level1;

public class BankAccountDriver {

    public static void main(String[] args) {

        // Creating SavingsAccount object
        SavingsAccount account =
                new SavingsAccount(123456789L, "Amit", 25000);

        // Displaying account details
        account.displayDetails();

        System.out.println();

        // Updating balance using public method
        account.setBalance(30000);

        // Displaying updated account details
        account.displayDetails();
    }
}


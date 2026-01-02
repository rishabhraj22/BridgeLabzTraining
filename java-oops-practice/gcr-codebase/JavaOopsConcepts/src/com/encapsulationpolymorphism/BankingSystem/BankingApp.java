package com.encapsulationpolymorphism.BankingSystem;

import java.util.ArrayList;
import java.util.List;

public class BankingApp {

    public static void main(String[] args) {

        List<BankAccount> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount("1234567890", "Rohit", 60000));
        accounts.add(new CurrentAccount("9876543210", "Aman", 150000));

        for (BankAccount account : accounts) {

            account.displayAccountDetails();

            double interest = account.calculateInterest();
            System.out.println("Calculated Interest: " + interest);

            if (account instanceof Loanable) {
                Loanable loanAccount = (Loanable) account;
                System.out.println("Loan Eligible: " + loanAccount.calculateLoanEligibility());
            }

            System.out.println("--------------------------------");
        }
    }
}


package com.encapsulationpolymorphism.BankingSystem;

public class SavingsAccount extends BankAccount implements Loanable {

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.04; // 4% interest
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Savings Account Loan Applied: " + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return balance >= 50000;
    }
}


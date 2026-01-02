package com.encapsulationpolymorphism.BankingSystem;

public class CurrentAccount extends BankAccount implements Loanable {

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.01; // 1% interest
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Current Account Business Loan Applied: " + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return balance >= 100000;
    }
}


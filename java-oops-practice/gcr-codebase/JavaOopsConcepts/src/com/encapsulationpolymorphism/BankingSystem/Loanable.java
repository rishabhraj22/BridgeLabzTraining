package com.encapsulationpolymorphism.BankingSystem;

public interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}


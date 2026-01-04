package com.MyBank;

class SavingsAccount extends Account {
    private final double interestRate = 4.0;

    public SavingsAccount(String accNo, double openingBalance) {
        super(accNo, openingBalance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }
}


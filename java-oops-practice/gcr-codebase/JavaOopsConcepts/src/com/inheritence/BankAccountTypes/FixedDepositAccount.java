package com.inheritence.BankAccountTypes;

class FixedDepositAccount extends BankAccount {
    int lockInPeriod; // in months

    FixedDepositAccount(String accountNumber, double balance, int lockInPeriod) {
        super(accountNumber, balance);
        this.lockInPeriod = lockInPeriod;
    }

    @Override
    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }

    void displayFDDetails() {
        System.out.println("Lock-in Period: " + lockInPeriod + " months");
    }
}


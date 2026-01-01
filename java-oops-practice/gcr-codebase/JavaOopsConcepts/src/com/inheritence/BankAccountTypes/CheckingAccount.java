package com.inheritence.BankAccountTypes;

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }

    void displayCheckingDetails() {
        System.out.println("Withdrawal Limit: ₹" + withdrawalLimit);
    }
}


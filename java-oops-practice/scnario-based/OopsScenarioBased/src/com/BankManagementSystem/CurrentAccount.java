package com.BankManagementSystem;

public class CurrentAccount extends Account {

    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Current Account");
    }
}


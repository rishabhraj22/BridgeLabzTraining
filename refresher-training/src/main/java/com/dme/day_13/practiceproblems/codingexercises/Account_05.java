package com.dme.day_13.classwork.practiceproblems.codingexercises;

class Account {
    private double balance = 5000;
    protected double getBalance() {
        return balance;
    }
}

class CurrentAccount extends Account {
    void showBalance() {
        // Direct access to private variable is NOT allowed
        // System.out.println(balance);
        // Access through protected getter
        System.out.println("Balance: " + getBalance());
    }
}

public class Account_05 {

    public static void main(String[] args) {
        CurrentAccount account = new CurrentAccount();
        account.showBalance();
    }
}

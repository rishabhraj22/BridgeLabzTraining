package com.dme.day_13.classwork.practiceproblems.codingexercises;

class BankAccount {
    String accountHolder;
    double balance;
    BankAccount() {
        this("Unknown", 0);
    }
    BankAccount(String accountHolder) {
        this(accountHolder, 0);
    }
    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    void display() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}


class SavingsAccount extends BankAccount {
    double interestRate;
    SavingsAccount(String accountHolder, double balance, double interestRate) {
        super(accountHolder, balance);
        this.interestRate = interestRate;
    }
    void displaySavingsAccount() {
        display();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

public class BankAccount_02 {

    public static void main(String[] args) {

        // No-argument constructor
        BankAccount b1 = new BankAccount();

        // One-argument constructor
        BankAccount b2 = new BankAccount("Rishabh");

        // Two-argument constructor
        BankAccount b3 = new BankAccount("Rahul", 5000);

        System.out.println("Account 1:");
        b1.display();
        System.out.println("\nAccount 2:");
        b2.display();
        System.out.println("\nAccount 3:");
        b3.display();

        SavingsAccount s1 = new SavingsAccount("Aman", 10000, 7.5);
        System.out.println("\nSavings Account:");
        s1.displaySavingsAccount();
    }
}

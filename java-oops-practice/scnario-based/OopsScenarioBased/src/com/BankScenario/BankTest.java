package com.BankScenario;

public class BankTest {
    public static void main(String[] args) {

        // Savings account customer
        SavingsAccount sa = new SavingsAccount(5000, 5);
        Customer c1 = new Customer("Rohit", sa);

        c1.deposit(2000);
        sa.calculateInterest();
        c1.withdraw(3000);
        c1.showBalance();

        System.out.println("------------------");

        // Current account customer
        CurrentAccount ca = new CurrentAccount(10000);
        Customer c2 = new Customer("Anita", ca);

        c2.deposit(1000);
        c2.withdraw(5000);
        c2.showBalance();
    }
}


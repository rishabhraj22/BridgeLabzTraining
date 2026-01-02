package com.BankManagementSystem;

public class BankApp {

    public static void main(String[] args) {

        // Savings account customer
        Account savings = new SavingsAccount("SA101", 5000, 4.0);
        Customer c1 = new Customer("C001", "Rohit", savings);

        // Current account customer
        Account current = new CurrentAccount("CA201", 10000);
        Customer c2 = new Customer("C002", "Anita", current);

        Bank bank = new Bank();

        c1.deposit(2000);
        ((SavingsAccount) savings).addInterest();
        c1.withdraw(3000);

        bank.showCustomerInfo(c1);

        c2.deposit(1500);
        c2.withdraw(4000);

        bank.showCustomerInfo(c2);
    }
}


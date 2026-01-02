package com.BankScenario;

class Customer {
    private String name;
    private Account account;

    Customer(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    void deposit(double amount) {
        account.deposit(amount);
    }

    void withdraw(double amount) {
        account.withdraw(amount);
    }

    void showBalance() {
        System.out.println(name + "'s Balance: ₹" + account.getBalance());
    }
}


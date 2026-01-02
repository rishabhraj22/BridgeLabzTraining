package com.BankManagementSystem5;

public class Customer {

    private String name;
    private String id;
    private Account account;

    public Customer(String name, String id, Account account) {
        this.name = name;
        this.id = id;
        this.account = account;
    }

    public void performWithdraw(double amount) {
        if (account.withdraw(amount)) {
            System.out.println("Withdrawal successful");
        }
    }

    public void showBalance() {
        System.out.println(name + "'s Balance: ₹" + account.getBalance());
    }
}


package com.bankingsystemwithmultipletransactions;
public class TransactionThread extends Thread {

    private BankAccount account;
    private String customerName;
    private int amount;

    public TransactionThread(BankAccount account, String customerName, int amount) {
        this.account = account;
        this.customerName = customerName;
        this.amount = amount;
        this.setName(customerName); // Proper thread naming
    }

    @Override
    public void run() {
        System.out.println("[" + getName() + "] Attempting to withdraw " + amount);
        account.withdraw(customerName, amount);
    }
}

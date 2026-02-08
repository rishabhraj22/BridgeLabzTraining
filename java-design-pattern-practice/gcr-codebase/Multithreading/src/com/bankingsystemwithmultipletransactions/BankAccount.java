package com.bankingsystemwithmultipletransactions;
import java.time.LocalDateTime;

public class BankAccount {

    private int balance;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    // Synchronized to prevent race conditions
    public synchronized boolean withdraw(String customerName, int amount) {
        System.out.println("[" + customerName + "] Checking balance for withdrawal of " + amount);

        if (balance >= amount) {
            // Simulate some processing delay
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                // ignore
            }

            balance -= amount;

            System.out.println("Transaction successful: " + customerName +
                    ", Amount: " + amount +
                    ", Balance: " + balance +
                    ", Time: " + LocalDateTime.now());

            return true;
        } else {
            System.out.println("Transaction failed: " + customerName +
                    ", Amount: " + amount +
                    ", Balance: " + balance +
                    ", Time: " + LocalDateTime.now());

            return false;
        }
    }

    public int getBalance() {
        return balance;
    }
}

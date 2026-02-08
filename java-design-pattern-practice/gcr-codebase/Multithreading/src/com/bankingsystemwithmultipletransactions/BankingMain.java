package com.bankingsystemwithmultipletransactions;
public class BankingMain {

    public static void main(String[] args) {

        System.out.println("Starting Banking System with Multiple Transactions...\n");

        BankAccount account = new BankAccount(10000);

        // Create 5 transaction threads with different amounts
        TransactionThread t1 = new TransactionThread(account, "Customer-1", 3000);
        TransactionThread t2 = new TransactionThread(account, "Customer-2", 4000);
        TransactionThread t3 = new TransactionThread(account, "Customer-3", 2000);
        TransactionThread t4 = new TransactionThread(account, "Customer-4", 5000);
        TransactionThread t5 = new TransactionThread(account, "Customer-5", 1500);

        // Display thread state before processing
        System.out.println("Thread states before start:");
        System.out.println("Customer-1: " + t1.getState());
        System.out.println("Customer-2: " + t2.getState());
        System.out.println("Customer-3: " + t3.getState());
        System.out.println("Customer-4: " + t4.getState());
        System.out.println("Customer-5: " + t5.getState());
        System.out.println();

        // Start all threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        // Wait for all threads to finish
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("\nAll transactions processed.");
        System.out.println("Final Account Balance: " + account.getBalance());
    }
}

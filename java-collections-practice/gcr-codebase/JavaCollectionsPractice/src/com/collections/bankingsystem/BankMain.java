package com.collections.bankingsystem;
import java.util.*;

public class BankMain {
    public static void main(String[] args) {

        BankingSystem bank = new BankingSystem();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of accounts: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Account number: ");
            String acc = sc.next();
            System.out.print("Balance: ");
            double bal = sc.nextDouble();
            bank.addAccount(new BankAccount(acc, bal));
        }

        System.out.print("\nEnter number of withdrawals: ");
        int w = sc.nextInt();

        for (int i = 0; i < w; i++) {
            System.out.print("Account: ");
            String acc = sc.next();
            System.out.print("Amount: ");
            double amt = sc.nextDouble();
            bank.requestWithdrawal(acc, amt);
        }

        bank.processWithdrawals();
        bank.displaySortedByBalance();
    }
}

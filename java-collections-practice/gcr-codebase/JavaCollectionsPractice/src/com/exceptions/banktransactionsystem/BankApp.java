package com.exceptions.banktransactionsystem;
import java.util.Scanner;

public class BankApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(balance);

        try {
            System.out.print("Enter withdrawal amount: ");
            double amount = sc.nextDouble();

            account.withdraw(amount);
            System.out.println("Withdrawal successful, new balance: " + account.getBalance());

        } catch (InsufficientBalanceException e) {
            System.out.println("Insufficient balance!");

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid amount!");
        }

        sc.close();
    }
}

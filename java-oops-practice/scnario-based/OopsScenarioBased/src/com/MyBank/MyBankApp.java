package com.MyBank;

import java.util.Scanner;

public class MyBankApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.println("🏦 Welcome to MyBank");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        System.out.print("Choose Account Type: ");
        int choice = sc.nextInt();

        sc.nextLine(); // consume newline

        System.out.print("Enter Account Number: ");
        String accNo = sc.nextLine();

        System.out.print("Enter Opening Balance: ");
        double openingBalance = sc.nextDouble();

        if (choice == 1) {
            account = new SavingsAccount(accNo, openingBalance);
        } else {
            account = new CurrentAccount(accNo, openingBalance);
        }

        int option;
        do {
            System.out.println("\n--- Banking Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Calculate Interest");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    account.deposit(sc.nextDouble());
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    account.withdraw(sc.nextDouble());
                    break;

                case 3:
                    System.out.println("Current Balance: ₹" + account.checkBalance());
                    break;

                case 4:
                    System.out.println("Interest Earned: ₹" + account.calculateInterest());
                    break;

                case 5:
                    System.out.println("Thank you for banking with MyBank!");
                    break;

                default:
                    System.out.println("❌ Invalid option");
            }
        } while (option != 5);

        sc.close();
    }
}



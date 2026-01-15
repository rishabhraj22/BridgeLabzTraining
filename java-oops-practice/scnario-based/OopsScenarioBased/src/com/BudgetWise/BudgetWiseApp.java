package com.BudgetWise;
import java.util.Scanner;

public class BudgetWiseApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("💰 Welcome to BudgetWise – Personal Finance Tracker");

        // Budget Type
        System.out.println("Select Budget Type:");
        System.out.println("1. Monthly Budget");
        System.out.println("2. Annual Budget");
        System.out.print("Enter choice: ");
        int type = sc.nextInt();
        sc.nextLine();

        Budget budget;

        // Common Inputs
        System.out.print("Enter Income: ");
        double income = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter number of categories: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] categories = new String[n];
        double[] limits = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Category " + (i + 1) + " name: ");
            categories[i] = sc.nextLine();

            System.out.print("Limit for " + categories[i] + ": ");
            limits[i] = sc.nextDouble();
            sc.nextLine();
        }

        if (type == 1) {
            System.out.print("Enter Month (e.g., March): ");
            String month = sc.nextLine();
            budget = new MonthlyBudget(month, income, categories, limits);
        } else {
            System.out.print("Enter Year: ");
            int year = sc.nextInt();
            sc.nextLine();
            budget = new AnnualBudget(year, income, categories, limits);
        }

        int choice;
        do {
            System.out.println("\n--- BudgetWise Menu ---");
            System.out.println("1. Add Expense");
            System.out.println("2. Generate Report");
            System.out.println("3. Detect Overspend");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Expense Amount: ");
                    double amt = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter Category: ");
                    String cat = sc.nextLine();

                    System.out.print("Enter Date (dd-mm-yyyy): ");
                    String date = sc.nextLine();

                    Transaction t = new Transaction(amt, "expense", date, cat);
                    budget.addTransaction(t);
                    System.out.println("Expense added.");
                    break;

                case 2:
                    budget.generateReport();
                    break;

                case 3:
                    budget.detectOverspend();
                    break;

                case 4:
                    System.out.println("Thank you for using BudgetWise 💰");
                    break;

                default:
                    System.out.println("❌ Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }
}

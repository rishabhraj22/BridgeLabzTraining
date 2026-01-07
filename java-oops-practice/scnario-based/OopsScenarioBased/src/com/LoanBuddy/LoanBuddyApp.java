package com.LoanBuddy;
import java.util.Scanner;

public class LoanBuddyApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to LoanBuddy – FinlyTech");

        // Applicant Input
        System.out.print("Enter Applicant Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Credit Score: ");
        int creditScore = sc.nextInt();

        System.out.print("Enter Monthly Income: ");
        double income = sc.nextDouble();

        System.out.print("Enter Loan Amount: ");
        double loanAmount = sc.nextDouble();

        Applicant applicant = new Applicant(name, creditScore, income, loanAmount);

        // Loan Type
        System.out.println("\nSelect Loan Type:");
        System.out.println("1. Home Loan");
        System.out.println("2. Auto Loan");
        System.out.println("3. Personal Loan");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter Loan Term (months): ");
        int term = sc.nextInt();

        LoanApplication loan;
        if (choice == 1) {
            loan = new HomeLoan(applicant, term);
        } else if (choice == 2) {
            loan = new AutoLoan(applicant, term);
        } else {
            loan = new PersonalLoan(applicant, term);
        }

        // Approval & EMI
        boolean approved = loan.approveLoan();

        System.out.println("\n--- Loan Result ---");
        System.out.println("Applicant: " + applicant.getName());
        System.out.println("Loan Status: " + loan.getLoanStatus());

        if (approved) {
            System.out.println("Monthly EMI: ₹" + loan.calculateEMI());
        } else {
            System.out.println("Loan Rejected due to eligibility criteria.");
        }

        sc.close();
    }
}

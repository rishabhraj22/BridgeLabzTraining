package com.designpattern.smartuniversitylibrarymanagementsystem.usercreation;
import java.util.Scanner;

public class FactoryDemoMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Smart University Library System - Factory Demo");
        System.out.print("Enter user role (student / faculty / librarian): ");
        String role = sc.nextLine();

        User user = UserFactory.createUser(role);

        if (user == null) {
            System.out.println("❌ Invalid role entered. Cannot create user.");
        } else {
            System.out.println("✅ User created successfully!");
            user.showRole();
            System.out.println("Borrowing allowed for " + user.getBorrowDays() + " days.");
        }

        sc.close();
    }
}

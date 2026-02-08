package com.designpattern.smartuniversitylibrarymanagementsystem.notifications;
import java.util.Scanner;

public class ObserverDemoMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BookCatalog catalog = new BookCatalog();

        System.out.println("Smart University Library System - Observer Demo");

        System.out.print("Enter number of users to subscribe: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter name of user " + i + ": ");
            String name = sc.nextLine();
            Observer userObserver = new UserObserver(name);
            catalog.addObserver(userObserver);
        }

        System.out.print("\nEnter name of new book added: ");
        String bookName = sc.nextLine();

        catalog.addNewBook(bookName);

        sc.close();
    }
}

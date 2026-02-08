package com.designpattern.smartuniversitylibrarymanagementsystem.centralizedcatalog;
import java.util.Scanner;

public class SingletonDemoMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Smart University Library System - Singleton Demo");
        System.out.print("Press Enter to access catalog first time...");
        sc.nextLine();

        LibraryCatalog catalog1 = LibraryCatalog.getInstance();
        catalog1.showMessage();

        System.out.print("\nPress Enter to access catalog second time...");
        sc.nextLine();

        LibraryCatalog catalog2 = LibraryCatalog.getInstance();
        catalog2.showMessage();

        System.out.println("\nChecking whether both references point to same object:");
        if (catalog1 == catalog2) {
            System.out.println("✅ Both catalog1 and catalog2 refer to the SAME instance.");
        } else {
            System.out.println("❌ Different instances found (Singleton failed).");
        }

        sc.close();
    }
}

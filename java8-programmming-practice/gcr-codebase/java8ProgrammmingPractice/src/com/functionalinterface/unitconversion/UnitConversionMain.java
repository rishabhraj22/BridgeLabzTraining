package com.functionalinterface.unitconversion;
import java.util.Scanner;

public class UnitConversionMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Conversion:");
        System.out.println("1. KM to Miles");
        System.out.println("2. KG to Pounds");
        int choice = sc.nextInt();

        System.out.print("Enter value: ");
        double value = sc.nextDouble();

        if (choice == 1) {
            System.out.println("Miles: " + UnitConverter.kmToMiles(value));
        } else if (choice == 2) {
            System.out.println("Pounds: " + UnitConverter.kgToPounds(value));
        } else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}

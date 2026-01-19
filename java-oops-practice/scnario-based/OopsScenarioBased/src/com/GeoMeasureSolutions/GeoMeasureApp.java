package com.GeoMeasureSolutions;
import java.util.ArrayList;
import java.util.Scanner;

public class GeoMeasureApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<LineComparisonRecord> records = new ArrayList<>();

        int choice;

        System.out.println("📐 Welcome to GeoMeasure Solutions");

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Compare Two Lines");
            System.out.println("2. Show All Comparisons");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\nEnter coordinates for Line 1");
                    System.out.print("x1: ");
                    double x1 = sc.nextDouble();
                    System.out.print("y1: ");
                    double y1 = sc.nextDouble();
                    System.out.print("x2: ");
                    double x2 = sc.nextDouble();
                    System.out.print("y2: ");
                    double y2 = sc.nextDouble();

                    Line line1 = new Line(x1, y1, x2, y2);

                    System.out.println("\nEnter coordinates for Line 2");
                    System.out.print("x1: ");
                    double x3 = sc.nextDouble();
                    System.out.print("y1: ");
                    double y3 = sc.nextDouble();
                    System.out.print("x2: ");
                    double x4 = sc.nextDouble();
                    System.out.print("y2: ");
                    double y4 = sc.nextDouble();

                    Line line2 = new Line(x3, y3, x4, y4);

                    LineComparisonRecord record =
                            new LineComparisonRecord(line1, line2);

                    record.compare();
                    records.add(record);
                    break;

                case 2:
                    System.out.println("\n📊 All Previous Comparisons");
                    for (LineComparisonRecord r : records) {
                        r.compare();
                    }
                    break;

                case 3:
                    System.out.println("Thank you for using GeoMeasure Solutions 📐");
                    break;

                default:
                    System.out.println("❌ Invalid choice");
            }

        } while (choice != 3);

        sc.close();
    }
}

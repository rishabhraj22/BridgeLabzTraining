package com.TailorShop;
import java.util.Scanner;

public class TailorShop {

    // Insertion Sort by delivery deadline
    public static void insertionSort(Order[] orders, int count) {

        for (int i = 1; i < count; i++) {
            Order key = orders[i];
            int j = i - 1;

            // Shift orders with later deadlines to the right
            while (j >= 0 && orders[j].getDeliveryDate() > key.getDeliveryDate()) {
                orders[j + 1] = orders[j];
                j--;
            }

            orders[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of orders to add: ");
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer

        Order[] orders = new Order[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("\nAdd Order " + (i + 1));

            System.out.print("Order ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Customer Name: ");
            String name = sc.nextLine();

            System.out.print("Delivery Date (YYYYMMDD): ");
            int date = sc.nextInt();
            sc.nextLine();

            orders[count] = new Order(id, name, date);
            count++;

            // Maintain sorted order after every insertion
            insertionSort(orders, count);
        }

        System.out.println("\n🧾 TailorShop – Orders Sorted by Delivery Deadline:");
        for (int i = 0; i < count; i++) {
            orders[i].display();
        }
    }
}

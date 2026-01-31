package com.lambdaexpression.customsorting;
import java.util.*;

public class ECommerceSortMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 60000, 4.5, 10));
        products.add(new Product("Phone", 30000, 4.7, 15));
        products.add(new Product("Headphones", 3000, 4.2, 25));

        System.out.println("Sort products by:");
        System.out.println("1. Price");
        System.out.println("2. Rating");
        System.out.println("3. Discount");

        int choice = sc.nextInt();

        if (choice == 1) {
            products.sort((a, b) -> Double.compare(a.getPrice(), b.getPrice()));
        } 
        else if (choice == 2) {
            products.sort((a, b) -> Double.compare(b.getRating(), a.getRating()));
        } 
        else if (choice == 3) {
            products.sort((a, b) -> Double.compare(b.getDiscount(), a.getDiscount()));
        } 
        else {
            System.out.println("Invalid choice!");
            sc.close();
            return;
        }

        System.out.println("\nSorted Products:");
        products.forEach(System.out::println);

        sc.close();
    }
}

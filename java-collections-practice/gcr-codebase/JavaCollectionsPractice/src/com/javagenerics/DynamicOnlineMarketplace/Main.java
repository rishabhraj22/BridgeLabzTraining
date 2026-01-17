package com.javagenerics.DynamicOnlineMarketplace;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Product<?>> catalog = new ArrayList<>();

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nChoose product type: 1.Book 2.Clothing 3.Gadget");
            int choice = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            switch (choice) {
                case 1:
                    catalog.add(new Product<>(name, price, BookCategory.TECHNOLOGY));
                    break;

                case 2:
                    catalog.add(new Product<>(name, price, ClothingCategory.MEN));
                    break;

                case 3:
                    catalog.add(new Product<>(name, price, GadgetCategory.MOBILE));
                    break;
            }
        }

        System.out.print("\nEnter discount percentage: ");
        double discount = sc.nextDouble();

        for (Product<?> product : catalog) {
            DiscountUtil.applyDiscount(product, discount);
        }

        System.out.println("\n🛍️ Updated Catalog:");
        for (Product<?> product : catalog) {
            System.out.println(product);
        }

        sc.close();
    }
}

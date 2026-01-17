package com.javagenerics.SmartWarehouseManagementSystem;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        System.out.print("Enter number of electronics items: ");
        int eCount = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < eCount; i++) {
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            electronicsStorage.addItem(new Electronics(name, price));
        }

        System.out.print("Enter number of groceries items: ");
        int gCount = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < gCount; i++) {
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            groceriesStorage.addItem(new Groceries(name, price));
        }

        System.out.print("Enter number of furniture items: ");
        int fCount = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < fCount; i++) {
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            furnitureStorage.addItem(new Furniture(name, price));
        }

        System.out.println("\n Electronics:");
        WarehouseUtil.displayItems(electronicsStorage.getItems());

        System.out.println("\n Groceries:");
        WarehouseUtil.displayItems(groceriesStorage.getItems());

        System.out.println("\n Furniture:");
        WarehouseUtil.displayItems(furnitureStorage.getItems());

        sc.close();
    }
}

package com.collections.shoppingcart;
import java.util.*;

public class ShoppingMain {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Item name: ");
            String name = sc.nextLine();
            System.out.print("Item price: ");
            double price = sc.nextDouble();
            sc.nextLine();
            cart.addItem(name, price);
        }

        cart.displayInsertionOrder();
        cart.displaySortedByPrice();
        System.out.println("\nTotal: ₹" + cart.getTotal());
    }
}

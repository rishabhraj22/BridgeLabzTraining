package com.constructor.level1;

public class ProductDriver {

    public static void main(String[] args) {

        // Creating product objects
        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Mobile", 20000);

        // Displaying product details
        p1.displayProductDetails();
        System.out.println();
        p2.displayProductDetails();

        System.out.println();

        // Displaying total number of products
        Product.displayTotalProducts();
    }
}


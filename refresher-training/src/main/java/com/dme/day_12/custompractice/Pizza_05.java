package com.dme.day_12.custompractice;

class Pizza {

    String size;
    String crustType;
    int toppingsCount;
    double price;

    Pizza(String size) {
        this(size, "Regular", 0);
    }

    Pizza(String size, String crustType) {
        this(size, crustType, 0);
    }

    Pizza(String size, String crustType, int toppingsCount) {
        this.size = size;
        this.crustType = crustType;
        this.toppingsCount = toppingsCount;
        if (size.equalsIgnoreCase("Small")) {
            price = 100;
        } else if (size.equalsIgnoreCase("Medium")) {
            price = 150;
        } else if (size.equalsIgnoreCase("Large")) {
            price = 200;
        } else {
            price = 0;
        }
        price += toppingsCount * 20;
    }

    Pizza(String size, String crustType, int toppingsCount, double price) {
        this.size = size;
        this.crustType = crustType;
        this.toppingsCount = toppingsCount;
        this.price = price;
    }

    void display() {
        System.out.println("Size: " + size + ", Crust: " + crustType + ", Toppings: " + toppingsCount + ", Price: " + price);
    }
}

class Main_05 {

    public static void main(String[] args) {
        Pizza p1 = new Pizza("Small");
        Pizza p2 = new Pizza("Medium", "Thin");
        Pizza p3 = new Pizza("Large", "Cheese", 3);
        Pizza p4 = new Pizza("Large", "Stuffed", 2, 500);
        p1.display();
        p2.display();
        p3.display();
        p4.display();
    }
}

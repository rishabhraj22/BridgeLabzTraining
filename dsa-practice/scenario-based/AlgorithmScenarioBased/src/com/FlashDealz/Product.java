package com.FlashDealz;
class Product {
    private int id;
    private String name;
    private double discount; // in %

    public Product(int id, String name, double discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public void show() {
        System.out.println(id + " | " + name + " | Discount: " + discount + "%");
    }
}

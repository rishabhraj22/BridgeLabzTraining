package com.IceCreamRush;
public class IceCreamFlavor {

    private String flavorName;
    private int salesCount;

    public IceCreamFlavor(String flavorName, int salesCount) {
        this.flavorName = flavorName;
        this.salesCount = salesCount;
    }

    public int getSalesCount() {
        return salesCount;
    }

    public void display() {
        System.out.println("Flavor: " + flavorName + ", Sold: " + salesCount + " times");
    }
}

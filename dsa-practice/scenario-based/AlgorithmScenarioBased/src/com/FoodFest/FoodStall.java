package com.FoodFest;
public class FoodStall {

    private String stallName;
    private int footfall; // number of customers

    public FoodStall(String stallName, int footfall) {
        this.stallName = stallName;
        this.footfall = footfall;
    }

    public int getFootfall() {
        return footfall;
    }

    public void display() {
        System.out.println("Stall: " + stallName + ", Footfall: " + footfall);
    }
}

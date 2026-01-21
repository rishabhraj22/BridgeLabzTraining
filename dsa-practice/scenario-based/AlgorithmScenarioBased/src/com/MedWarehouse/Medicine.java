package com.MedWarehouse;
public class Medicine {

    private String medicineName;
    private int expiryDate; // YYYYMMDD format

    public Medicine(String medicineName, int expiryDate) {
        this.medicineName = medicineName;
        this.expiryDate = expiryDate;
    }

    public int getExpiryDate() {
        return expiryDate;
    }

    public void display() {
        System.out.println(
            "Medicine: " + medicineName +
            ", Expiry Date: " + expiryDate
        );
    }
}

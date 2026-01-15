package com.ZipZipMart;
public class Transaction {

    private int transactionId;
    private String date;   // format: YYYY-MM-DD
    private double amount;

    public Transaction(int transactionId, String date, double amount) {
        this.transactionId = transactionId;
        this.date = date;
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public void display() {
        System.out.println("ID: " + transactionId + ", Date: " + date + ", Amount: " + amount);
    }
}

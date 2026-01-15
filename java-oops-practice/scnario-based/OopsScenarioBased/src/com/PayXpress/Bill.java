package com.PayXpress;
abstract class Bill implements IPayable {

    protected String type;
    protected double amount;
    protected String dueDate;

    private boolean isPaid; // cannot be changed directly
    private double penalty = 50; // late fee

    public Bill(String type, double amount, String dueDate) {
        this.type = type;
        this.amount = amount;
        this.dueDate = dueDate;
        this.isPaid = false;
    }

    // Constructor for recurring bill
    public Bill(String type, double amount, String dueDate, boolean recurring) {
        this(type, amount, dueDate);
        if (recurring) {
            System.out.println(type + " bill set as recurring.");
        }
    }

    protected double calculateLateFee() {
        return amount + penalty; // operator usage
    }

    protected void markPaid() {
        isPaid = true;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void showBill() {
        System.out.println(type + " | Amount: ₹" + amount + " | Due: " + dueDate +
                " | Status: " + (isPaid ? "Paid" : "Pending"));
    }

    @Override
    public abstract void pay();

    @Override
    public abstract void sendReminder();
}

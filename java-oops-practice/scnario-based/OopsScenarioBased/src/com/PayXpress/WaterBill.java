package com.PayXpress;
class WaterBill extends Bill {

    public WaterBill(double amount, String dueDate) {
        super("Water", amount, dueDate);
    }

    public WaterBill(double amount, String dueDate, boolean recurring) {
        super("Water", amount, dueDate, recurring);
    }

    @Override
    public void pay() {
        if (!isPaid()) {
            markPaid();
            System.out.println("💧 Water bill paid successfully.");
        } else {
            System.out.println("⚠️ Water bill already paid.");
        }
    }

    @Override
    public void sendReminder() {
        System.out.println("💧 Reminder: Water bill is due on " + dueDate);
    }
}

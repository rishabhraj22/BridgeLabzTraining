package com.PayXpress;
class ElectricityBill extends Bill {

    public ElectricityBill(double amount, String dueDate) {
        super("Electricity", amount, dueDate);
    }

    public ElectricityBill(double amount, String dueDate, boolean recurring) {
        super("Electricity", amount, dueDate, recurring);
    }

    @Override
    public void pay() {
        if (!isPaid()) {
            markPaid();
            System.out.println("⚡ Electricity bill paid successfully.");
        } else {
            System.out.println("⚠️ Electricity bill already paid.");
        }
    }

    @Override
    public void sendReminder() {
        System.out.println("⚡ Reminder: Please pay your Electricity bill before " + dueDate);
    }
}

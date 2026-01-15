package com.PayXpress;
class InternetBill extends Bill {

    public InternetBill(double amount, String dueDate) {
        super("Internet", amount, dueDate);
    }

    public InternetBill(double amount, String dueDate, boolean recurring) {
        super("Internet", amount, dueDate, recurring);
    }

    @Override
    public void pay() {
        if (!isPaid()) {
            markPaid();
            System.out.println("🌐 Internet bill paid successfully.");
        } else {
            System.out.println("⚠️ Internet bill already paid.");
        }
    }

    @Override
    public void sendReminder() {
        System.out.println("🌐 Reminder: Your internet will be disconnected after " + dueDate);
    }
}

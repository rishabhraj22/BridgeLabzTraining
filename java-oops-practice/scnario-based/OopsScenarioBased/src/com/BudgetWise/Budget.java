package com.BudgetWise;
import java.util.ArrayList;
import java.util.List;

abstract class Budget implements IAnalyzable {

    protected double income;
    protected String[] categories;
    protected double[] categoryLimits;

    private List<Transaction> transactions = new ArrayList<>(); // hidden

    public Budget(double income, String[] categories, double[] categoryLimits) {
        this.income = income;
        this.categories = categories;
        this.categoryLimits = categoryLimits;
    }

    // Encapsulated method to add transaction
    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    protected double getTotalExpenses() {
        double total = 0;
        for (Transaction t : transactions) {
            if (t.getType().equalsIgnoreCase("expense")) {
                total += t.getAmount();
            }
        }
        return total;
    }

    protected double getCategoryTotal(String category) {
        double sum = 0;
        for (Transaction t : transactions) {
            if (t.getType().equalsIgnoreCase("expense") &&
                t.getCategory().equalsIgnoreCase(category)) {
                sum += t.getAmount();
            }
        }
        return sum;
    }

    protected double getNetSavings() {
        return income - getTotalExpenses(); // operator usage
    }

    @Override
    public abstract void generateReport();

    @Override
    public void detectOverspend() {
        System.out.println("\n--- Overspend Check ---");
        for (int i = 0; i < categories.length; i++) {
            double spent = getCategoryTotal(categories[i]);
            if (spent > categoryLimits[i]) {
                System.out.println("⚠️ Overspent in " + categories[i] +
                        " | Limit: ₹" + categoryLimits[i] +
                        " | Spent: ₹" + spent);
            }
        }
    }
}

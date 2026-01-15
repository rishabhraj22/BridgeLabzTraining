package com.BudgetWise;
class MonthlyBudget extends Budget {

    private String month;

    public MonthlyBudget(String month, double income, String[] categories, double[] categoryLimits) {
        super(income, categories, categoryLimits);
        this.month = month;
    }

    @Override
    public void generateReport() {
        System.out.println("\n📅 Monthly Report – " + month);
        System.out.println("Income: ₹" + income);
        System.out.println("Total Expenses: ₹" + getTotalExpenses());
        System.out.println("Net Savings: ₹" + getNetSavings());
    }
}

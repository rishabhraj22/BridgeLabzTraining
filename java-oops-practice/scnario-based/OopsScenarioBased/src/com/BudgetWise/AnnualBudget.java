package com.BudgetWise;
class AnnualBudget extends Budget {

    private int year;

    public AnnualBudget(int year, double income, String[] categories, double[] categoryLimits) {
        super(income, categories, categoryLimits);
        this.year = year;
    }

    @Override
    public void generateReport() {
        System.out.println("\n📆 Annual Report – " + year);
        System.out.println("Total Income: ₹" + income);
        System.out.println("Total Expenses: ₹" + getTotalExpenses());
        System.out.println("Net Savings: ₹" + getNetSavings());
    }
}

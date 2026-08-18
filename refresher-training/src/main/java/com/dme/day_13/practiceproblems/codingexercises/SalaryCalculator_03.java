package com.dme.day_13.classwork.practiceproblems.codingexercises;

class SalaryCalculator {
    double calculateSalary(double basicSalary) {
        return basicSalary;
    }
    double calculateSalary(double basicSalary, double bonus) {
        return basicSalary + bonus;
    }
    double calculateSalary(double basicSalary, double bonus, double deduction) {
        return basicSalary + bonus - deduction;
    }
}

public class SalaryCalculator_03 {

    public static void main(String[] args) {
        SalaryCalculator calculator = new SalaryCalculator();
        double salary1 = calculator.calculateSalary(30000);
        double salary2 = calculator.calculateSalary(30000, 5000);
        double salary3 = calculator.calculateSalary(30000, 5000, 2000);
        System.out.println("Salary with basic only: " + salary1);
        System.out.println("Salary with basic + bonus: " + salary2);
        System.out.println("Salary with basic + bonus + deduction: " + salary3);
    }
}

package com.sortingalgorithms.HeapSortJobSalaries;
public class JobSalaries {

    private double[] salaries;

    public JobSalaries(double[] salaries) {
        this.salaries = salaries;
    }

    public double[] getSalaries() {
        return salaries;
    }

    public void displaySalaries() {
        for (double salary : salaries) {
            System.out.print(salary + " ");
        }
        System.out.println();
    }
}

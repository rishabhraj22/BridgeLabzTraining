package com.sortingalgorithms.InsertionSortEmployeeIDs;
public class EmployeeIDs {

    private int[] employeeIds;

    public EmployeeIDs(int[] employeeIds) {
        this.employeeIds = employeeIds;
    }

    public int[] getEmployeeIds() {
        return employeeIds;
    }

    public void displayEmployeeIds() {
        for (int id : employeeIds) {
            System.out.print(id + " ");
        }
        System.out.println();
    }
}

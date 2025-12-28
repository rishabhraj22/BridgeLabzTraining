package com.constructor.level1;

public class EmployeeDriver {

    public static void main(String[] args) {

        // Creating Manager object
        Manager manager = new Manager(501, "IT", 75000);

        // Displaying manager details
        manager.displayDetails();

        System.out.println();

        // Updating salary using public method
        manager.setSalary(85000);

        // Displaying updated details
        manager.displayDetails();
    }
}


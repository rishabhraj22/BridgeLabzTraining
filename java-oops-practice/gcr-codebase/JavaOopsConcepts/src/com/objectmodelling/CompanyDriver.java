package com.objectmodelling;

public class CompanyDriver {

    public static void main(String[] args) {

        // Creating Company object
        Company company = new Company("Tech Solutions Pvt Ltd");

        // Creating Department objects
        Department itDept = new Department("IT");
        Department hrDept = new Department("HR");

        // Adding employees to departments
        itDept.addEmployee("Ravi", 101);
        itDept.addEmployee("Amit", 102);

        hrDept.addEmployee("Neha", 201);

        // Adding departments to company
        company.addDepartment(itDept);
        company.addDepartment(hrDept);

        // Displaying company details
        company.displayCompany();

        // Closing the company
        company.closeCompany();
    }
}


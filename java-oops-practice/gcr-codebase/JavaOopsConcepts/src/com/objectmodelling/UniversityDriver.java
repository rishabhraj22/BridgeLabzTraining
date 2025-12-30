package com.objectmodelling;

public class UniversityDriver {

    public static void main(String[] args) {

        // Creating Faculty objects (independent)
        Faculty f1 = new Faculty("Dr. Sharma", "Computer Science");
        Faculty f2 = new Faculty("Dr. Mehta", "Mathematics");

        // Creating UniDepartment objects
        UniDepartment csDept = new UniDepartment("Computer Science");
        UniDepartment mathDept = new UniDepartment("Mathematics");

        // Adding faculty to departments
        csDept.addFaculty(f1);
        mathDept.addFaculty(f2);

        // Creating University object
        University university = new University("National University");

        // Adding departments to university
        university.addDepartment(csDept);
        university.addDepartment(mathDept);

        // Displaying university details
        university.displayUniversity();

        // Deleting university
        university.deleteUniversity();

        // Faculty still exists independently
        System.out.println("\nFaculty still exists after university deletion:");
        f1.displayFaculty();
    }
}



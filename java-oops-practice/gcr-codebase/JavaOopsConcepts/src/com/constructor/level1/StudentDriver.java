package com.constructor.level1;

public class StudentDriver {

    public static void main(String[] args) {

        // Creating PostgraduateStudent object
        PostgraduateStudent pgStudent =
                new PostgraduateStudent(101, "Ravi", 8.5);

        // Displaying student details
        pgStudent.displayDetails();

        System.out.println();

        // Updating CGPA using public method
        pgStudent.setCGPA(9.0);

        // Displaying updated details
        pgStudent.displayDetails();
    }
}


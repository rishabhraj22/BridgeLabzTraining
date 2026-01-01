package com.inheritence.SchoolSystem;

public class SchoolTest {
    public static void main(String[] args) {

        Person p1 = new Teacher("Mr. Sharma", 40, "Mathematics");
        Person p2 = new Student("Aman", 16, "10th Grade");
        Person p3 = new Staff("Ramesh", 35, "Administration");

        p1.displayBasicInfo();
        p1.displayRole();
        System.out.println("------------------");

        p2.displayBasicInfo();
        p2.displayRole();
        System.out.println("------------------");

        p3.displayBasicInfo();
        p3.displayRole();
    }
}


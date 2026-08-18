package com.dme.day_13.classwork.practiceproblems.codingexercises;

class Employee {
    String name;
    double salary;
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    void getDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    int teamSize;
    Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }
    @Override
    void getDetails() {
        super.getDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

public class Employee_04 {

    public static void main(String[] args) {
        Employee e1 = new Employee("Rahul", 40000);
        Manager m1 = new Manager("Rishabh", 80000, 10);
        System.out.println("Employee Details:");
        e1.getDetails();
        System.out.println("\nManager Details:");
        m1.getDetails();
    }
}

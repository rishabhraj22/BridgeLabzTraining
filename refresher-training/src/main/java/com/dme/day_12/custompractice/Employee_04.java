package com.dme.day_12.custompractice;

class Employee {

    private static int nextId = 1001;
    private int employeeId;
    String name;

    Employee(String name) {
        this.name = name;
        employeeId = nextId;
        nextId++;
    }

    public int getEmployeeId() {
        return employeeId;
    }
}

class Main_04 {

    public static void main(String[] args) {
        Employee e1 = new Employee("Rahul");
        Employee e2 = new Employee("Aman");
        Employee e3 = new Employee("Riya");
        Employee e4 = new Employee("Neha");
        System.out.println(e1.name + " -> " + e1.getEmployeeId());
        System.out.println(e2.name + " -> " + e2.getEmployeeId());
        System.out.println(e3.name + " -> " + e3.getEmployeeId());
        System.out.println(e4.name + " -> " + e4.getEmployeeId());
    }
}

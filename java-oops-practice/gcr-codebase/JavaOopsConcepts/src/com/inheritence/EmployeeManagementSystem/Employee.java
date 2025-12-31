package com.inheritence.EmployeeManagementSystem;

//Base class
class Employee {
 String name;
 int id;
 double salary;

 // Constructor
 Employee(String name, int id, double salary) {
     this.name = name;
     this.id = id;
     this.salary = salary;
 }

 // Method to be overridden
 void displayDetails() {
     System.out.println("Name: " + name);
     System.out.println("ID: " + id);
     System.out.println("Salary: " + salary);
 }
}


package com.functionalinterface.cloningprototypeobjects;
public class CloningMain {

    public static void main(String[] args) {
        try {
            Employee original = new Employee(101, "Amit");
            Employee copy = (Employee) original.clone();

            System.out.println("Original: " + original.getInfo());
            System.out.println("Cloned  : " + copy.getInfo());
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported!");
        }
    }
}

package com.dme.day_12.custompractice;

class Address {

    String street;
    String city;
    String zipCode;

    Address(String street, String city, String zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }

    Address(Address other) {
        this.street = other.street;
        this.city = other.city;
        this.zipCode = other.zipCode;
    }
}

class Student {

    String name;
    Address address;

    Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    Student(Student other) {
        this.name = other.name;
        this.address = new Address(other.address);
    }
}

class Main_06 {

    public static void main(String[] args) {

        Address address1 = new Address("MG Road", "Ranchi", "834001");

        Student s1 = new Student("Rishabh", address1);
        Student s2 = new Student(s1);

        System.out.println("Before modification:");
        System.out.println("s1 city: " + s1.address.city);
        System.out.println("s2 city: " + s2.address.city);

        s2.address.city = "Delhi";

        System.out.println("\nAfter modifying s2:");
        System.out.println("s1 city: " + s1.address.city);
        System.out.println("s2 city: " + s2.address.city);
    }
}

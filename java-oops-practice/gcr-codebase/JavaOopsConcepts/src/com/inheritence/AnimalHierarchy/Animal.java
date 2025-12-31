package com.inheritence.AnimalHierarchy;

//Superclass
class Animal {
 String name;
 int age;

 // Constructor
 Animal(String name, int age) {
     this.name = name;
     this.age = age;
 }

 // Method to be overridden
 void makeSound() {
     System.out.println("Animal makes a sound");
 }
}


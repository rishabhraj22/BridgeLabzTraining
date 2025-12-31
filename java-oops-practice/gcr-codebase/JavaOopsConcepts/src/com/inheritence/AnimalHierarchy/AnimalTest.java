package com.inheritence.AnimalHierarchy;

public class AnimalTest {
    public static void main(String[] args) {

        Animal a1 = new Dog("Buddy", 3);
        Animal a2 = new Cat("Kitty", 2);
        Animal a3 = new Bird("Tweety", 1);

        a1.makeSound();  // Dog barks
        a2.makeSound();  // Cat meows
        a3.makeSound();  // Bird chirps
    }
}


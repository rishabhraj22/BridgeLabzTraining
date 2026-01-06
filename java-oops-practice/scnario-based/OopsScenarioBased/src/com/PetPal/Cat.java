package com.PetPal;
class Cat extends Pet {

    public Cat(String name, int age) {
        super(name, "Cat", age);
    }

    public Cat(String name, int age, int hunger, int energy) {
        super(name, "Cat", age, hunger, energy);
    }

    @Override
    public void feed() {
        System.out.println("Feeding cat...");
        decreaseHunger(15);
    }

    @Override
    public void play() {
        System.out.println("Playing with yarn...");
        decreaseEnergy(10);
        increaseHunger(5);
    }

    @Override
    public void sleep() {
        System.out.println("Cat is napping...");
        increaseEnergy(20);
    }

    @Override
    public void makeSound() {
        System.out.println("Cat says: Meow!");
    }
}

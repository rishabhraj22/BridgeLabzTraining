package com.PetPal;
class Dog extends Pet {

    public Dog(String name, int age) {
        super(name, "Dog", age);
    }

    public Dog(String name, int age, int hunger, int energy) {
        super(name, "Dog", age, hunger, energy);
    }

    @Override
    public void feed() {
        System.out.println("Feeding dog...");
        decreaseHunger(20);
    }

    @Override
    public void play() {
        System.out.println("Playing fetch with dog...");
        decreaseEnergy(15);
        increaseHunger(10);
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping...");
        increaseEnergy(25);
    }

    @Override
    public void makeSound() {
        System.out.println("Dog says: Woof Woof!");
    }
}

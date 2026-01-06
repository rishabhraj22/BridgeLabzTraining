package com.PetPal;
class Bird extends Pet {

    public Bird(String name, int age) {
        super(name, "Bird", age);
    }

    public Bird(String name, int age, int hunger, int energy) {
        super(name, "Bird", age, hunger, energy);
    }

    @Override
    public void feed() {
        System.out.println("Feeding bird...");
        decreaseHunger(10);
    }

    @Override
    public void play() {
        System.out.println("Bird is flying around...");
        decreaseEnergy(20);
        increaseHunger(10);
    }

    @Override
    public void sleep() {
        System.out.println("Bird is resting...");
        increaseEnergy(15);
    }

    @Override
    public void makeSound() {
        System.out.println("Bird says: Tweet Tweet!");
    }
}

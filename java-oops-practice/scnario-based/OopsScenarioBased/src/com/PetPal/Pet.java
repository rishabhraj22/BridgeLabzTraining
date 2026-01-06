package com.PetPal;
import java.util.Random;

abstract class Pet implements IInteractable {
    protected String name;
    protected String type;
    protected int age;

    private int hunger;   // 0 = full, 100 = very hungry
    private int energy;   // 0 = tired, 100 = energetic
    private String mood;  // Happy, Normal, Sad

    public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;

        // Random defaults
        Random r = new Random();
        this.hunger = r.nextInt(50) + 20;
        this.energy = r.nextInt(50) + 20;
        updateMood();
    }

    public Pet(String name, String type, int age, int hunger, int energy) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = hunger;
        this.energy = energy;
        updateMood();
    }

    protected void updateMood() {
        if (hunger < 30 && energy > 60) mood = "Happy";
        else if (hunger < 60) mood = "Normal";
        else mood = "Sad";
    }

    protected void increaseEnergy(int val) {
        energy = Math.min(100, energy + val);
        updateMood();
    }

    protected void decreaseEnergy(int val) {
        energy = Math.max(0, energy - val);
        updateMood();
    }

    protected void decreaseHunger(int val) {
        hunger = Math.max(0, hunger - val);
        updateMood();
    }

    protected void increaseHunger(int val) {
        hunger = Math.min(100, hunger + val);
        updateMood();
    }

    public void showStatus() {
        System.out.println("\n🐾 " + name + " (" + type + ")");
        System.out.println("Age: " + age);
        System.out.println("Hunger: " + hunger);
        System.out.println("Energy: " + energy);
        System.out.println("Mood: " + mood);
    }

    public abstract void makeSound();
}

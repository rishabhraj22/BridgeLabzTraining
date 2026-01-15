package com.BirdSanctuary;
class Seagull extends Bird implements Flyable, Swimmable {

    public Seagull(String name, String id) {
        super(name, "Seagull", id);
    }

    @Override
    public void fly() {
        System.out.println("Seagull is gliding over the sea.");
    }

    @Override
    public void swim() {
        System.out.println("Seagull is floating on water.");
    }
}

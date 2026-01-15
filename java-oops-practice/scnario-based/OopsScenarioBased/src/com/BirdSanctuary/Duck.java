package com.BirdSanctuary;
@DeveloperInfo(name = "Rishabh", date = "2026-01-15", purpose = "Flying & Swimming bird")
class Duck extends Bird implements Flyable, Swimmable {

    public Duck(String name, String id) {
        super(name, "Duck", id);
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying over the lake.");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming in the water.");
    }
}

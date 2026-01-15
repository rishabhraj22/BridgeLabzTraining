package com.BirdSanctuary;
@DeveloperInfo(name = "Rishabh", date = "2026-01-15", purpose = "Swimming bird")
class Penguin extends Bird implements Swimmable {

    public Penguin(String name, String id) {
        super(name, "Penguin", id);
    }

    @Override
    public void swim() {
        System.out.println("Penguin is swimming swiftly.");
    }
}

package com.BirdSanctuary;
@DeveloperInfo(name = "Rishabh", date = "2026-01-15", purpose = "Flying bird implementation")
class Eagle extends Bird implements Flyable {

    public Eagle(String name, String id) {
        super(name, "Eagle", id);
    }

    @Override
    public void fly() {
        System.out.println("Eagle soars high in the sky.");
    }
}

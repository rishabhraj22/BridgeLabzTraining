package com.FitnessTracker;
class User {
    private int id;
    private String name;
    private int steps;

    public User(int id, String name, int steps) {
        this.id = id;
        this.name = name;
        this.steps = steps;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public void show() {
        System.out.println(id + " | " + name + " | Steps: " + steps);
    }
}

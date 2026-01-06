package com.FitTrack;
class UserProfile {
    private String name;
    private int age;
    private double weight; // private health data
    private int dailyCalorieGoal;

    public UserProfile(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.dailyCalorieGoal = 500; // default goal
    }

    public UserProfile(String name, int age, double weight, int goal) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.dailyCalorieGoal = goal;
    }

    public int getDailyCalorieGoal() {
        return dailyCalorieGoal;
    }

    public String getName() {
        return name;
    }

    public void showProfile() {
        System.out.println("\nUser: " + name + " | Age: " + age +
                " | Daily Calorie Goal: " + dailyCalorieGoal);
    }
}

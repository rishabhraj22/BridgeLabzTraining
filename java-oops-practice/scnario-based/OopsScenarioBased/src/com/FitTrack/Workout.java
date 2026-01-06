package com.FitTrack;
abstract class Workout implements ITrackable {
    protected String type;
    protected int duration; // in minutes
    protected double caloriesBurned;

    public Workout(String type, int duration) {
        this.type = type;
        this.duration = duration;
    }

    public abstract double calculateCalories();

    public double getCaloriesBurned() {
        return caloriesBurned;
    }
}

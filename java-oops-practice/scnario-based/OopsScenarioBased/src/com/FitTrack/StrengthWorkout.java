package com.FitTrack;
class StrengthWorkout extends Workout {

    public StrengthWorkout(int duration) {
        super("Strength", duration);
    }

    @Override
    public void startWorkout() {
        System.out.println("🏋️ Strength workout started...");
    }

    @Override
    public void stopWorkout() {
        caloriesBurned = calculateCalories();
        System.out.println("🏋️ Strength workout stopped. Calories burned: " + caloriesBurned);
    }

    @Override
    public double calculateCalories() {
        return duration * 10; // 10 calories per minute
    }
}

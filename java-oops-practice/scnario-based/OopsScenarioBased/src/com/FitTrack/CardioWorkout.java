package com.FitTrack;
class CardioWorkout extends Workout {

    public CardioWorkout(int duration) {
        super("Cardio", duration);
    }

    @Override
    public void startWorkout() {
        System.out.println("🏃 Cardio workout started...");
    }

    @Override
    public void stopWorkout() {
        caloriesBurned = calculateCalories();
        System.out.println("🏃 Cardio workout stopped. Calories burned: " + caloriesBurned);
    }

    @Override
    public double calculateCalories() {
        return duration * 8; // 8 calories per minute
    }
}

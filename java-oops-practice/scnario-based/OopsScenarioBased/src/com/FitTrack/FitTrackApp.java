package com.FitTrack;
import java.util.Scanner;

public class FitTrackApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User Profile Input
        System.out.println("🏋️ Welcome to FitTrack");
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Weight (kg): ");
        double weight = sc.nextDouble();

        System.out.print("Do you want to set custom calorie goal? (yes/no): ");
        sc.nextLine();
        String choice = sc.nextLine();

        UserProfile user;
        if (choice.equalsIgnoreCase("yes")) {
            System.out.print("Enter Daily Calorie Goal: ");
            int goal = sc.nextInt();
            user = new UserProfile(name, age, weight, goal);
        } else {
            user = new UserProfile(name, age, weight);
        }

        user.showProfile();

        // Workout Selection
        System.out.println("\nSelect Workout Type:");
        System.out.println("1. Cardio");
        System.out.println("2. Strength");
        System.out.print("Enter choice: ");
        int typeChoice = sc.nextInt();

        System.out.print("Enter Workout Duration (minutes): ");
        int duration = sc.nextInt();

        Workout workout;
        if (typeChoice == 1) {
            workout = new CardioWorkout(duration);
        } else {
            workout = new StrengthWorkout(duration);
        }

        // Start & Stop Workout
        workout.startWorkout();
        System.out.println("Workout in progress... Press Enter to stop.");
        sc.nextLine(); // consume newline
        sc.nextLine(); // wait for enter

        workout.stopWorkout();

        // Progress Calculation
        double burned = workout.getCaloriesBurned();
        int target = user.getDailyCalorieGoal();

        double remaining = target - burned;

        System.out.println("\n--- Daily Progress ---");
        System.out.println("Target Calories: " + target);
        System.out.println("Burned Calories: " + burned);

        if (remaining > 0) {
            System.out.println("Calories Remaining: " + remaining);
        } else {
            System.out.println("🎉 Goal Achieved! Extra Burn: " + Math.abs(remaining));
        }

        sc.close();
    }
}

package com.javagenerics.PersonalizedMealPlanGenerator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Meal Type:");
        System.out.println("1. Vegetarian");
        System.out.println("2. Vegan");
        System.out.println("3. Keto");
        System.out.println("4. High Protein");

        int choice = sc.nextInt();

        Meal<?> meal = null;

        switch (choice) {
            case 1:
                meal = MealGenerator.generateMeal(new VegetarianMeal());
                break;
            case 2:
                meal = MealGenerator.generateMeal(new VeganMeal());
                break;
            case 3:
                meal = MealGenerator.generateMeal(new KetoMeal());
                break;
            case 4:
                meal = MealGenerator.generateMeal(new HighProteinMeal());
                break;
            default:
                System.out.println("Invalid choice");
                System.exit(0);
        }

        System.out.println("\n🍽️ Your Meal Plan:");
        System.out.println("Type: " + meal.getMealPlan().getMealType());
        System.out.println("Calories: " + meal.getMealPlan().getCalories());

        sc.close();
    }
}

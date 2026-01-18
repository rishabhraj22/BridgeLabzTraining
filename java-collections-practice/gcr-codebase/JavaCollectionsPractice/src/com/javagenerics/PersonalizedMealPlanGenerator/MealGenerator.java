package com.javagenerics.PersonalizedMealPlanGenerator;
public class MealGenerator {

    public static <T extends MealPlan> Meal<T> generateMeal(T mealPlan) {
        System.out.println("Generating " + mealPlan.getMealType() + " meal...");
        return new Meal<>(mealPlan);
    }
}

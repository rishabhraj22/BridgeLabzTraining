package com.javagenerics.PersonalizedMealPlanGenerator;
public class VegetarianMeal implements MealPlan {

    @Override
    public String getMealType() {
        return "Vegetarian";
    }

    @Override
    public int getCalories() {
        return 500;
    }
}

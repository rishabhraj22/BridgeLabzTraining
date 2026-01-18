package com.javagenerics.PersonalizedMealPlanGenerator;
public class KetoMeal implements MealPlan {

    @Override
    public String getMealType() {
        return "Keto";
    }

    @Override
    public int getCalories() {
        return 600;
    }
}

package com.exceptions.customexceptions;
public class AgeValidator {

    // Method that throws a custom checked exception
    public static void validateAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
    }
}

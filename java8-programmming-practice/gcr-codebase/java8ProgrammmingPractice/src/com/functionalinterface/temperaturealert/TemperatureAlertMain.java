package com.functionalinterface.temperaturealert;
import java.util.Scanner;
import java.util.function.Predicate;

public class TemperatureAlertMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter current temperature: ");
        double currentTemp = sc.nextDouble();

        System.out.print("Enter threshold temperature: ");
        double threshold = sc.nextDouble();

        Predicate<Double> isThresholdCrossed =
                temp -> temp > threshold;

        if (isThresholdCrossed.test(currentTemp)) {
            System.out.println("⚠ ALERT: Temperature crossed the threshold!");
        } else {
            System.out.println("Temperature is within safe range.");
        }

        sc.close();
    }
}

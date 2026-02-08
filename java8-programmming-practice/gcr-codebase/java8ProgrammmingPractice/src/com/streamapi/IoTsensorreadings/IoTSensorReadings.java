package com.streamapi.IoTsensorreadings;
import java.util.*;

class IoTSensorReadings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of sensor readings: ");
        int n = sc.nextInt();

        List<Double> readings = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter reading " + (i + 1) + ": ");
            readings.add(sc.nextDouble());
        }

        System.out.print("Enter threshold value: ");
        double threshold = sc.nextDouble();

        System.out.println("\nReadings above threshold:");

        readings.stream()
                .filter(value -> value > threshold)
                .forEach(value -> System.out.println("Reading: " + value));
    }
}

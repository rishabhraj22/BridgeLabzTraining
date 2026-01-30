package com.annotationsandreflection.reflection.dependencyinjection;

public class Main {
    public static void main(String[] args) throws Exception {

        Car car = DIContainer.create(Car.class);
        car.drive();
    }
}

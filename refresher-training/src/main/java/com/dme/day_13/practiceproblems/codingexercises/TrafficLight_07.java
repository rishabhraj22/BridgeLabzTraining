package com.dme.day_13.classwork.practiceproblems.codingexercises;

enum TrafficLight {
    RED(30),
    YELLOW(5),
    GREEN(25);
    private int duration;
    TrafficLight(int duration) {
        this.duration = duration;
    }
    int getDuration() {
        return duration;
    }
}

public class TrafficLight_07 {

    public static void main(String[] args) {
        for (TrafficLight light : TrafficLight.values()) {
            System.out.println(light + " : " + light.getDuration() + " seconds");
        }
    }
}

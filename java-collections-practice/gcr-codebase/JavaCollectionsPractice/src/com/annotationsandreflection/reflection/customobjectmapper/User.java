package com.annotationsandreflection.reflection.customobjectmapper;

public class User {
    private String name;
    private int age;

    @Override
    public String toString() {
        return name + " - " + age;
    }
}

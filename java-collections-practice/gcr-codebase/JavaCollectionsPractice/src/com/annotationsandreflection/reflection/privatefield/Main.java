package com.annotationsandreflection.reflection.privatefield;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws Exception {

        Person p = new Person();

        Field field = Person.class.getDeclaredField("age");
        field.setAccessible(true);

        field.set(p, 25); // modify
        System.out.println("Age: " + field.get(p)); // retrieve
    }
}

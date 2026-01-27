package com.annotationsandreflection.reflection.staticfields;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws Exception {

        Class<Configuration> cls = Configuration.class;

        Field field = cls.getDeclaredField("API_KEY");
        field.setAccessible(true);

        field.set(null, "NEW_SECURE_KEY_999");

        System.out.println("Updated API_KEY: " + field.get(null));
    }
}

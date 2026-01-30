package com.annotationsandreflection.reflection.dependencyinjection;

import java.lang.reflect.Field;

public class DIContainer {

    public static <T> T create(Class<T> clazz) throws Exception {

        T obj = clazz.getDeclaredConstructor().newInstance();

        for (Field f : clazz.getDeclaredFields()) {
            if (f.isAnnotationPresent(Inject.class)) {
                Object dependency = f.getType().getDeclaredConstructor().newInstance();
                f.setAccessible(true);
                f.set(obj, dependency);
            }
        }
        return obj;
    }
}

package com.annotationsandreflection.annotations.customcachingsystem;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class CacheProcessor {

    private static final Map<String, Object> cache = new HashMap<>();

    public static Object execute(Object obj, String methodName, Object... args) throws Exception {

        Method method = obj.getClass().getMethod(methodName, int.class);

        String key = methodName + "_" + args[0];

        if (method.isAnnotationPresent(CacheResult.class)) {

            if (cache.containsKey(key)) {
                System.out.println("Returning cached result");
                return cache.get(key);
            }

            Object result = method.invoke(obj, args);
            cache.put(key, result);
            return result;
        }

        return method.invoke(obj, args);
    }
}

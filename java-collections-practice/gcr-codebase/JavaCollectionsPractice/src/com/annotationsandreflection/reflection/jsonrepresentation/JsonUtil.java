package com.annotationsandreflection.reflection.jsonrepresentation;

import java.lang.reflect.Field;

public class JsonUtil {

    public static String toJson(Object obj) throws Exception {

        StringBuilder json = new StringBuilder("{");
        Field[] fields = obj.getClass().getDeclaredFields();

        for (Field f : fields) {
            f.setAccessible(true);
            json.append("\"")
                .append(f.getName())
                .append("\":\"")
                .append(f.get(obj))
                .append("\",");
        }

        json.deleteCharAt(json.length() - 1);
        json.append("}");

        return json.toString();
    }
}

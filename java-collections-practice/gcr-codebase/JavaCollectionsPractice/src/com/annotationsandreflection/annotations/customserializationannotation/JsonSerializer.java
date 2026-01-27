package com.annotationsandreflection.annotations.customserializationannotation;

import java.lang.reflect.Field;

public class JsonSerializer {

    public static String toJson(Object obj) throws IllegalAccessException {

        StringBuilder json = new StringBuilder("{");
        Field[] fields = obj.getClass().getDeclaredFields();

        for (Field field : fields) {

            if (field.isAnnotationPresent(JsonField.class)) {

                field.setAccessible(true);
                JsonField jf = field.getAnnotation(JsonField.class);

                json.append("\"")
                    .append(jf.name())
                    .append("\":\"")
                    .append(field.get(obj))
                    .append("\",");
            }
        }

        if (json.charAt(json.length() - 1) == ',') {
            json.deleteCharAt(json.length() - 1);
        }

        json.append("}");
        return json.toString();
    }
}

package com.annotationsandreflection.annotations.maxLengthannotation;

import java.lang.reflect.Field;

public class User {

    @MaxLength(10)
    private String username;

    public User(String username) {

        validate(username);
        this.username = username;
    }

    private void validate(String username) {

        try {
            Field field = this.getClass().getDeclaredField("username");
            MaxLength max = field.getAnnotation(MaxLength.class);

            if (max != null && username.length() > max.value()) {
                throw new IllegalArgumentException(
                    "Username length exceeds " + max.value() + " characters"
                );
            }

        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    public String getUsername() {
        return username;
    }
}

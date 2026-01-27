package com.annotationsandreflection.annotations.customserializationannotation;

public class Main {
    public static void main(String[] args) throws Exception {

        User user = new User("rishabh", 22, "secret123");
        System.out.println(JsonSerializer.toJson(user));
    }
}
